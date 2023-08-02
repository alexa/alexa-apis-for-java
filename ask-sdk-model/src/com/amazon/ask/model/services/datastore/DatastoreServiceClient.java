/*
* Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazon.ask.model.services.datastore;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class DatastoreServiceClient extends BaseServiceClient implements DatastoreService {

  private final UserAgentHelper userAgentHelper;
  private final LwaClient lwaClient;

  public DatastoreServiceClient(ApiConfiguration apiConfiguration, AuthenticationConfiguration authenticationConfiguration) {
      super(apiConfiguration);
      this.lwaClient = LwaClient.builder()
          .withAuthenticationConfiguration(authenticationConfiguration)
          .withGrantType(GrantType.CLIENT_CREDENTIALS)
          .withApiConfiguration(DefaultApiConfiguration.builder()
                                    .withApiClient(apiConfiguration.getApiClient())
                                    .withSerializer(apiConfiguration.getSerializer())
                                    .build())
          .build();
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.76.0").build();
  }

  public DatastoreServiceClient(ApiConfiguration apiConfiguration, LwaClient lwaClient) {
      super(apiConfiguration);
      this.lwaClient = lwaClient;
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.76.0").build();
  }

  /**
   * 
   * Send DataStore commands to Alexa device.
   * @param commandsRequest  (required)
   * @return com.amazon.ask.model.services.datastore.v1.CommandsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.datastore.v1.CommandsResponse> callCommandsV1(com.amazon.ask.model.services.datastore.v1.CommandsRequest commandsRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForScope("alexa::datastore");
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String resourcePath = "/v1/datastore/commands";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CommandsResponse.class, 200, "Multiple CommandsDispatchResults in response."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CommandsRequestError.class, 400, "Request validation fails."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CommandsRequestError.class, 401, "Not Authorized."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CommandsRequestError.class, 403, "The skill is not allowed to execute commands."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CommandsRequestError.class, 429, "The client has made more calls than the allowed limit."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CommandsRequestError.class, 0, "Unexpected error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, commandsRequest, com.amazon.ask.model.services.datastore.v1.CommandsResponse.class, false);
  }

  /**
   * 
   * Send DataStore commands to Alexa device.
   * @param commandsRequest  (required)
   * @return com.amazon.ask.model.services.datastore.v1.CommandsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.datastore.v1.CommandsResponse commandsV1(com.amazon.ask.model.services.datastore.v1.CommandsRequest commandsRequest) throws ServiceException {
    return this.callCommandsV1(commandsRequest).getResponse();
  }

  /**
   * 
   * Cancel pending DataStore commands.
   * @param queuedResultId A unique identifier to query result for queued delivery for offline devices (DEVICE_UNAVAILABLE). (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCancelCommandsV1(String queuedResultId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("queuedResultId", queuedResultId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForScope("alexa::datastore");
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String resourcePath = "/v1/datastore/queue/{queuedResultId}/cancel";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CancelCommandsRequestError.class, 400, "Request validation fails."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CancelCommandsRequestError.class, 401, "Not Authorized."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CancelCommandsRequestError.class, 403, "The skill is not allowed to call this API commands."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CancelCommandsRequestError.class, 404, "Unable to find the pending request."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CancelCommandsRequestError.class, 429, "The client has made more calls than the allowed limit."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.CancelCommandsRequestError.class, 0, "Unexpected error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Cancel pending DataStore commands.
   * @param queuedResultId A unique identifier to query result for queued delivery for offline devices (DEVICE_UNAVAILABLE). (required)
   * @throws ServiceException if fails to make API call
   */
  public void cancelCommandsV1(String queuedResultId) throws ServiceException {
    this.callCancelCommandsV1(queuedResultId).getResponse();
  }

  /**
   * 
   * Query statuses of deliveries to offline devices returned by commands API.
   * @param queuedResultId A unique identifier to query result for queued delivery for offline devices (DEVICE_UNAVAILABLE). (required)
   * @param maxResults Maximum number of CommandsDispatchResult items to return. (optional, default to 20)
   * @param nextToken The value of nextToken in the response to fetch next page. If not specified, the request fetches result for the first page.  (optional)
   * @return com.amazon.ask.model.services.datastore.v1.QueuedResultResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.datastore.v1.QueuedResultResponse> callQueuedResultV1(String queuedResultId, Integer maxResults, String nextToken) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("queuedResultId", queuedResultId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForScope("alexa::datastore");
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String resourcePath = "/v1/datastore/queue/{queuedResultId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.QueuedResultResponse.class, 200, "Unordered array of CommandsDispatchResult and pagination details."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.QueuedResultRequestError.class, 400, "Request validation fails."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.QueuedResultRequestError.class, 401, "Not Authorized."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.QueuedResultRequestError.class, 403, "The skill is not allowed to call this API commands."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.QueuedResultRequestError.class, 429, "The client has made more calls than the allowed limit."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.datastore.v1.QueuedResultRequestError.class, 0, "Unexpected error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.datastore.v1.QueuedResultResponse.class, false);
  }

  /**
   * 
   * Query statuses of deliveries to offline devices returned by commands API.
   * @param queuedResultId A unique identifier to query result for queued delivery for offline devices (DEVICE_UNAVAILABLE). (required)
   * @param maxResults Maximum number of CommandsDispatchResult items to return. (optional, default to 20)
   * @param nextToken The value of nextToken in the response to fetch next page. If not specified, the request fetches result for the first page.  (optional)
   * @return com.amazon.ask.model.services.datastore.v1.QueuedResultResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.datastore.v1.QueuedResultResponse queuedResultV1(String queuedResultId, Integer maxResults, String nextToken) throws ServiceException {
    return this.callQueuedResultV1(queuedResultId, maxResults, nextToken).getResponse();
  }

}
