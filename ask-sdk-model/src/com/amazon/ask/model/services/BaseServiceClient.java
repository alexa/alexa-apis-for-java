/*
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
 * except in compliance with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the License.
 */
package com.amazon.ask.model.services;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Class to be used as the base class for the generated service clients.
 */
public abstract class BaseServiceClient {
  protected ApiClient apiClient;
  protected Serializer serializer;
  protected String authorizationValue;
  protected String apiEndpoint;

  protected BaseServiceClient(ApiConfiguration apiConfiguration) {
    if (apiConfiguration == null) {
        throw new IllegalArgumentException("ApiConfiguration must be provided");
    }
    this.apiClient = apiConfiguration.getApiClient();
    this.serializer = apiConfiguration.getSerializer();
    this.authorizationValue = apiConfiguration.getAuthorizationValue();
    this.apiEndpoint = apiConfiguration.getApiEndpoint();
  }

  /**
   * Calls the ApiClient based on the ServiceClient specific data provided as well as handles the
   * well-known responses from the Api
   * @param method Http Method
   * @param endpoint Base Endpoint to make the request to
   * @param path Specific path to hit. It might contain variables to be interpolated with pathParams.
   * @param queryParams Parameter values to be sent as part of the query string
   * @param headerParams Parameter values to be sent as headers
   * @param pathParams Parameter values to be interpolated in the path
   * @param responseDefinitions Well-known expected responses by the ServiceClient
   * @param body Request body
   * @param responseType Type of the expected Response if applicable
   * @return Response object instance of the responseType provided
   * @throws ServiceException Thrown when a failure happens or when getting an Error Response from
   * the Api.
   */
  protected Object invoke(String method, String endpoint, String path, List<Pair<String, String>> queryParams,
      List<Pair<String, String>> headerParams, Map<String, String> pathParams,
      List<ServiceClientResponse> responseDefinitions, Object body, Class responseType) throws ServiceException {
    return invoke(method, endpoint, path, queryParams, headerParams, pathParams, responseDefinitions, body, responseType, false);
  }


    /**
     * Calls the ApiClient based on the ServiceClient specific data provided as well as handles the
     * well-known responses from the Api
     * @param method Http Method
     * @param endpoint Base Endpoint to make the request to
     * @param path Specific path to hit. It might contain variables to be interpolated with pathParams.
     * @param queryParams Parameter values to be sent as part of the query string
     * @param headerParams Parameter values to be sent as headers
     * @param pathParams Parameter values to be interpolated in the path
     * @param responseDefinitions Well-known expected responses by the ServiceClient
     * @param body Request body
     * @param responseType Type of the expected Response if applicable
     * @return Response object instance of the responseType provided
     * @throws ServiceException Thrown when a failure happens or when getting an Error Response from
     * the Api.
     */
    protected Object invoke(String method, String endpoint, String path, List<Pair<String, String>> queryParams,
            List<Pair<String, String>> headerParams, Map<String, String> pathParams,
            List<ServiceClientResponse> responseDefinitions, Object body, Class responseType, boolean rawRequest) throws ServiceException {


      ApiClientRequest request = new ApiClientRequest();
    request.setUrl(buildUrl(endpoint, path, queryParams, pathParams));
    request.setMethod(method);
    request.setHeaders(headerParams);
    if (body != null) {
      if (!rawRequest) {
        request.setBody(this.serializer.serialize(body));
      } else {
        request.setBody((String) body);
      }
    }

    ApiClientResponse response;
    try {
      response = apiClient.invoke(request);
    } catch(Exception ex) {
      throw new ServiceException("Call to service failed: " + ex.getMessage(), 500, null, null, ex);
    }

    if (isCodeSuccessful(response.getStatusCode())) {
      if (responseType == null) {
        return null;
      }

      return this.serializer.deserialize(response.getBody(), responseType);
    }

    ServiceClientResponse errorMetadata = responseDefinitions.stream()
        .filter(x -> x.getStatusCode() == response.getStatusCode())
        .findFirst()
        .orElseThrow(() -> new ServiceException("Unknown error", response.getStatusCode(),
            response.getHeaders(), response.getBody()));

    Object errorBody = this.serializer.deserialize(response.getBody(), errorMetadata.getType());
    throw new ServiceException(errorMetadata.getMessage(), errorMetadata.getStatusCode(),
        response.getHeaders(), errorBody);
  }

  /**
   * Checks if the response code is a success code
   * @param responseCode response code from the API call response
   */
  private static boolean isCodeSuccessful(final int responseCode) {
    return responseCode >= 200 && responseCode < 300;
  }

  /**
   * Builds a url to make an Api call.
   * @param endpoint Endpoint to be sending the api call
   * @param path Specific path to send the api Call. This might contain variables in between {} braces
   * @param queryParameters Query parameters to be appended to the url.
   * @param pathParameters Parameters to be interpolated in the path. Its keys should match one of the
   *  variables specified in the path.
   * @return Built url.
   */
  private static String buildUrl(final String endpoint, final String path,
      final List<Pair<String, String>> queryParameters, final Map<String, String> pathParameters) {

    String processedEndpoint = endpoint.endsWith("/") ? endpoint.substring(0, endpoint.length() - 1) : endpoint;
    String pathWithParams = interpolatePathParams(path, pathParameters);
    boolean isConstantQueryPresent = pathWithParams.contains("?");
    String queryString = buildQueryString(queryParameters, isConstantQueryPresent);

    StringBuilder sb = new StringBuilder();
    sb.append(processedEndpoint);
    sb.append(pathWithParams);
    sb.append(queryString);

    return sb.toString();
  }

  private static String buildQueryString(final List<Pair<String, String>> queryParameters, boolean isQueryStart) {
    if (queryParameters == null || queryParameters.isEmpty()) {
      return "";
    }

    StringBuilder sb = new StringBuilder();
    if (isQueryStart) {
      sb.append("&");
    } else {
      sb.append("?");
    }

    for (int i = 0; i < queryParameters.size(); i++) {
      Pair<String, String> param = queryParameters.get(i);
      sb.append(escapeString(param.getName()));
      sb.append("=");
      sb.append(escapeString(param.getValue()));
      sb.append("&");
    }
    sb.deleteCharAt(sb.length() - 1);

    return sb.toString();
  }

  private static String escapeString(final String s) {
    try {
      return URLEncoder.encode(s, StandardCharsets.UTF_8.name()).replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException("UTF-8 unsupported on system. Unable to encode query string", e);
    }
  }

  private static String interpolatePathParams(final String path, final Map<String, String> params) {
    if (params == null || params.isEmpty()) {
      return path;
    }

    String result = path;

    for (Entry<String, String> param : params.entrySet()) {
      String paramName = param.getKey();
      String paramValue = param.getValue();
      result = result.replaceAll("\\{" + paramName + "\\}", escapeString(paramValue));
    }

    return result;
  }
}
