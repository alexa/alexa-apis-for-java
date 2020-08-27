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

package com.amazon.ask.model.services.skillManagement;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class SkillManagementServiceClient extends BaseServiceClient implements SkillManagementService {

  private final UserAgentHelper userAgentHelper;
  private final LwaClient lwaClient;

  public SkillManagementServiceClient(ApiConfiguration apiConfiguration, AuthenticationConfiguration authenticationConfiguration) {
      super(apiConfiguration);
      this.lwaClient = LwaClient.builder()
          .withAuthenticationConfiguration(authenticationConfiguration)
          .withGrantType(GrantType.REFRESH_TOKEN)
          .withApiConfiguration(DefaultApiConfiguration.builder()
                                    .withApiClient(apiConfiguration.getApiClient())
                                    .withSerializer(apiConfiguration.getSerializer())
                                    .build())
          .build();
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.7.1").build();
  }

  public SkillManagementServiceClient(ApiConfiguration apiConfiguration, LwaClient lwaClient) {
      super(apiConfiguration);
      this.lwaClient = lwaClient;
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.7.1").build();
  }

  /**
   * 
   * Returns information about a particular catalog.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @return com.amazon.ask.smapi.model.v0.catalog.CatalogDetails
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.catalog.CatalogDetails> callGetCatalogV0(String catalogId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/catalogs/{catalogId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.catalog.CatalogDetails.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v0.catalog.CatalogDetails.class, false);
  }

  /**
   * 
   * Returns information about a particular catalog.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @return com.amazon.ask.smapi.model.v0.catalog.CatalogDetails
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.catalog.CatalogDetails getCatalogV0(String catalogId) throws ServiceException {
    return this.callGetCatalogV0(catalogId).getResponse();
  }

  /**
   * 
   * Lists all the uploads for a particular catalog.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v0.catalog.upload.ListUploadsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.catalog.upload.ListUploadsResponse> callListUploadsForCatalogV0(String catalogId, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/catalogs/{catalogId}/uploads";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.catalog.upload.ListUploadsResponse.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v0.catalog.upload.ListUploadsResponse.class, false);
  }

  /**
   * 
   * Lists all the uploads for a particular catalog.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v0.catalog.upload.ListUploadsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.catalog.upload.ListUploadsResponse listUploadsForCatalogV0(String catalogId, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callListUploadsForCatalogV0(catalogId, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * Creates a new upload for a catalog and returns presigned upload parts for uploading the file.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param createContentUploadRequest Defines the request body for updateCatalog API. (required)
   * @return com.amazon.ask.smapi.model.v0.catalog.upload.CreateContentUploadResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.catalog.upload.CreateContentUploadResponse> callCreateContentUploadV0(String catalogId, com.amazon.ask.smapi.model.v0.catalog.upload.CreateContentUploadRequest createContentUploadRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/catalogs/{catalogId}/uploads";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.catalog.upload.CreateContentUploadResponse.class, 201, "Content upload created."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createContentUploadRequest, com.amazon.ask.smapi.model.v0.catalog.upload.CreateContentUploadResponse.class, false);
  }

  /**
   * 
   * Creates a new upload for a catalog and returns presigned upload parts for uploading the file.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param createContentUploadRequest Defines the request body for updateCatalog API. (required)
   * @return com.amazon.ask.smapi.model.v0.catalog.upload.CreateContentUploadResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.catalog.upload.CreateContentUploadResponse createContentUploadV0(String catalogId, com.amazon.ask.smapi.model.v0.catalog.upload.CreateContentUploadRequest createContentUploadRequest) throws ServiceException {
    return this.callCreateContentUploadV0(catalogId, createContentUploadRequest).getResponse();
  }

  /**
   * 
   * Gets detailed information about an upload which was created for a specific catalog. Includes the upload&#39;s ingestion steps and a presigned url for downloading the file.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param uploadId Unique identifier of the upload (required)
   * @return com.amazon.ask.smapi.model.v0.catalog.upload.GetContentUploadResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.catalog.upload.GetContentUploadResponse> callGetContentUploadByIdV0(String catalogId, String uploadId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    pathParams.put("uploadId", uploadId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/catalogs/{catalogId}/uploads/{uploadId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.catalog.upload.GetContentUploadResponse.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v0.catalog.upload.GetContentUploadResponse.class, false);
  }

  /**
   * 
   * Gets detailed information about an upload which was created for a specific catalog. Includes the upload&#39;s ingestion steps and a presigned url for downloading the file.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param uploadId Unique identifier of the upload (required)
   * @return com.amazon.ask.smapi.model.v0.catalog.upload.GetContentUploadResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.catalog.upload.GetContentUploadResponse getContentUploadByIdV0(String catalogId, String uploadId) throws ServiceException {
    return this.callGetContentUploadByIdV0(catalogId, uploadId).getResponse();
  }

  /**
   * 
   * Completes an upload. To be called after the file is uploaded to the backend data store using presigned url(s).
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param uploadId Unique identifier of the upload (required)
   * @param completeUploadRequestPayload Request payload to complete an upload. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCompleteCatalogUploadV0(String catalogId, String uploadId, com.amazon.ask.smapi.model.v0.catalog.upload.CompleteUploadRequest completeUploadRequestPayload) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    pathParams.put("uploadId", uploadId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/catalogs/{catalogId}/uploads/{uploadId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Accepted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, completeUploadRequestPayload, null, false);
  }

  /**
   * 
   * Completes an upload. To be called after the file is uploaded to the backend data store using presigned url(s).
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param uploadId Unique identifier of the upload (required)
   * @param completeUploadRequestPayload Request payload to complete an upload. (required)
   * @throws ServiceException if fails to make API call
   */
  public void completeCatalogUploadV0(String catalogId, String uploadId, com.amazon.ask.smapi.model.v0.catalog.upload.CompleteUploadRequest completeUploadRequestPayload) throws ServiceException {
    this.callCompleteCatalogUploadV0(catalogId, uploadId, completeUploadRequestPayload).getResponse();
  }

  /**
   * 
   * Lists catalogs associated with a vendor.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse> callListCatalogsForVendorV0(String vendorId, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(vendorId != null) {
    queryParams.add(new Pair<String, String>("vendorId", vendorId));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/catalogs";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse.class, false);
  }

  /**
   * 
   * Lists catalogs associated with a vendor.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse listCatalogsForVendorV0(String vendorId, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callListCatalogsForVendorV0(vendorId, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * Creates a new catalog based on information provided in the request.
   * @param createCatalogRequest Defines the request body for createCatalog API. (required)
   * @return com.amazon.ask.smapi.model.v0.catalog.CatalogDetails
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.catalog.CatalogDetails> callCreateCatalogV0(com.amazon.ask.smapi.model.v0.catalog.CreateCatalogRequest createCatalogRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/catalogs";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.catalog.CatalogDetails.class, 201, "Catalog created."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createCatalogRequest, com.amazon.ask.smapi.model.v0.catalog.CatalogDetails.class, false);
  }

  /**
   * 
   * Creates a new catalog based on information provided in the request.
   * @param createCatalogRequest Defines the request body for createCatalog API. (required)
   * @return com.amazon.ask.smapi.model.v0.catalog.CatalogDetails
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.catalog.CatalogDetails createCatalogV0(com.amazon.ask.smapi.model.v0.catalog.CreateCatalogRequest createCatalogRequest) throws ServiceException {
    return this.callCreateCatalogV0(createCatalogRequest).getResponse();
  }

  /**
   * 
   * Lists the subscribers for a particular vendor.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.ListSubscribersResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.ListSubscribersResponse> callListSubscribersForDevelopmentEventsV0(String vendorId, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(vendorId != null) {
    queryParams.add(new Pair<String, String>("vendorId", vendorId));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscribers";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.ListSubscribersResponse.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.ListSubscribersResponse.class, false);
  }

  /**
   * 
   * Lists the subscribers for a particular vendor.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.ListSubscribersResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.ListSubscribersResponse listSubscribersForDevelopmentEventsV0(String vendorId, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callListSubscribersForDevelopmentEventsV0(vendorId, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * Creates a new subscriber resource for a vendor.
   * @param createSubscriberRequest Defines the request body for createSubscriber API. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCreateSubscriberForDevelopmentEventsV0(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.CreateSubscriberRequest createSubscriberRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscribers";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 201, "Created. Returns a URL to retrieve the subscriber in 'Location' header."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createSubscriberRequest, null, false);
  }

  /**
   * 
   * Creates a new subscriber resource for a vendor.
   * @param createSubscriberRequest Defines the request body for createSubscriber API. (required)
   * @throws ServiceException if fails to make API call
   */
  public void createSubscriberForDevelopmentEventsV0(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.CreateSubscriberRequest createSubscriberRequest) throws ServiceException {
    this.callCreateSubscriberForDevelopmentEventsV0(createSubscriberRequest).getResponse();
  }

  /**
   * 
   * Deletes a specified subscriber.
   * @param subscriberId Unique identifier of the subscriber. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteSubscriberForDevelopmentEventsV0(String subscriberId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("subscriberId", subscriberId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscribers/{subscriberId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Deletes a specified subscriber.
   * @param subscriberId Unique identifier of the subscriber. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteSubscriberForDevelopmentEventsV0(String subscriberId) throws ServiceException {
    this.callDeleteSubscriberForDevelopmentEventsV0(subscriberId).getResponse();
  }

  /**
   * 
   * Returns information about specified subscriber.
   * @param subscriberId Unique identifier of the subscriber. (required)
   * @return com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberInfo
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberInfo> callGetSubscriberForDevelopmentEventsV0(String subscriberId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("subscriberId", subscriberId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscribers/{subscriberId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberInfo.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberInfo.class, false);
  }

  /**
   * 
   * Returns information about specified subscriber.
   * @param subscriberId Unique identifier of the subscriber. (required)
   * @return com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberInfo
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.SubscriberInfo getSubscriberForDevelopmentEventsV0(String subscriberId) throws ServiceException {
    return this.callGetSubscriberForDevelopmentEventsV0(subscriberId).getResponse();
  }

  /**
   * 
   * Updates the properties of a subscriber.
   * @param subscriberId Unique identifier of the subscriber. (required)
   * @param updateSubscriberRequest Defines the request body for updateSubscriber API. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSetSubscriberForDevelopmentEventsV0(String subscriberId, com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.UpdateSubscriberRequest updateSubscriberRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("subscriberId", subscriberId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscribers/{subscriberId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateSubscriberRequest, null, false);
  }

  /**
   * 
   * Updates the properties of a subscriber.
   * @param subscriberId Unique identifier of the subscriber. (required)
   * @param updateSubscriberRequest Defines the request body for updateSubscriber API. (required)
   * @throws ServiceException if fails to make API call
   */
  public void setSubscriberForDevelopmentEventsV0(String subscriberId, com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.UpdateSubscriberRequest updateSubscriberRequest) throws ServiceException {
    this.callSetSubscriberForDevelopmentEventsV0(subscriberId, updateSubscriberRequest).getResponse();
  }

  /**
   * 
   * Lists all the subscriptions for a vendor/subscriber depending on the query parameter.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param subscriberId Unique identifier of the subscriber. If this query parameter is provided, the list would be filtered by the owning subscriberId. (optional)
   * @return com.amazon.ask.smapi.model.v0.developmentEvents.subscription.ListSubscriptionsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.ListSubscriptionsResponse> callListSubscriptionsForDevelopmentEventsV0(String vendorId, String nextToken, BigDecimal maxResults, String subscriberId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(vendorId != null) {
    queryParams.add(new Pair<String, String>("vendorId", vendorId));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(subscriberId != null) {
    queryParams.add(new Pair<String, String>("subscriberId", subscriberId));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscriptions";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.developmentEvents.subscription.ListSubscriptionsResponse.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v0.developmentEvents.subscription.ListSubscriptionsResponse.class, false);
  }

  /**
   * 
   * Lists all the subscriptions for a vendor/subscriber depending on the query parameter.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param subscriberId Unique identifier of the subscriber. If this query parameter is provided, the list would be filtered by the owning subscriberId. (optional)
   * @return com.amazon.ask.smapi.model.v0.developmentEvents.subscription.ListSubscriptionsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.developmentEvents.subscription.ListSubscriptionsResponse listSubscriptionsForDevelopmentEventsV0(String vendorId, String nextToken, BigDecimal maxResults, String subscriberId) throws ServiceException {
    return this.callListSubscriptionsForDevelopmentEventsV0(vendorId, nextToken, maxResults, subscriberId).getResponse();
  }

  /**
   * 
   * Creates a new subscription for a subscriber. This needs to be authorized by the client/vendor who created the subscriber and the vendor who publishes the event.
   * @param createSubscriptionRequest Request body for createSubscription API. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCreateSubscriptionForDevelopmentEventsV0(com.amazon.ask.smapi.model.v0.developmentEvents.subscription.CreateSubscriptionRequest createSubscriptionRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscriptions";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 201, "Created; Returns a URL to retrieve the subscription in 'Location' header."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createSubscriptionRequest, null, false);
  }

  /**
   * 
   * Creates a new subscription for a subscriber. This needs to be authorized by the client/vendor who created the subscriber and the vendor who publishes the event.
   * @param createSubscriptionRequest Request body for createSubscription API. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void createSubscriptionForDevelopmentEventsV0(com.amazon.ask.smapi.model.v0.developmentEvents.subscription.CreateSubscriptionRequest createSubscriptionRequest) throws ServiceException {
    this.callCreateSubscriptionForDevelopmentEventsV0(createSubscriptionRequest).getResponse();
  }

  /**
   * 
   * Deletes a particular subscription. Both, the vendor who created the subscriber and the vendor who publishes the event can delete this resource with appropriate authorization.
   * @param subscriptionId Unique identifier of the subscription. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteSubscriptionForDevelopmentEventsV0(String subscriptionId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("subscriptionId", subscriptionId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscriptions/{subscriptionId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Deletes a particular subscription. Both, the vendor who created the subscriber and the vendor who publishes the event can delete this resource with appropriate authorization.
   * @param subscriptionId Unique identifier of the subscription. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteSubscriptionForDevelopmentEventsV0(String subscriptionId) throws ServiceException {
    this.callDeleteSubscriptionForDevelopmentEventsV0(subscriptionId).getResponse();
  }

  /**
   * 
   * Returns information about a particular subscription. Both, the vendor who created the subscriber and the vendor who publishes the event can retrieve this resource with appropriate authorization.
   * @param subscriptionId Unique identifier of the subscription. (required)
   * @return com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionInfo
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionInfo> callGetSubscriptionForDevelopmentEventsV0(String subscriptionId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("subscriptionId", subscriptionId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscriptions/{subscriptionId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionInfo.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionInfo.class, false);
  }

  /**
   * 
   * Returns information about a particular subscription. Both, the vendor who created the subscriber and the vendor who publishes the event can retrieve this resource with appropriate authorization.
   * @param subscriptionId Unique identifier of the subscription. (required)
   * @return com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionInfo
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.developmentEvents.subscription.SubscriptionInfo getSubscriptionForDevelopmentEventsV0(String subscriptionId) throws ServiceException {
    return this.callGetSubscriptionForDevelopmentEventsV0(subscriptionId).getResponse();
  }

  /**
   * 
   * Updates the mutable properties of a subscription. This needs to be authorized by the client/vendor who created the subscriber and the vendor who publishes the event. The subscriberId cannot be updated.
   * @param subscriptionId Unique identifier of the subscription. (required)
   * @param updateSubscriptionRequest Request body for updateSubscription API. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSetSubscriptionForDevelopmentEventsV0(String subscriptionId, com.amazon.ask.smapi.model.v0.developmentEvents.subscription.UpdateSubscriptionRequest updateSubscriptionRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("subscriptionId", subscriptionId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/developmentEvents/subscriptions/{subscriptionId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateSubscriptionRequest, null, false);
  }

  /**
   * 
   * Updates the mutable properties of a subscription. This needs to be authorized by the client/vendor who created the subscriber and the vendor who publishes the event. The subscriberId cannot be updated.
   * @param subscriptionId Unique identifier of the subscription. (required)
   * @param updateSubscriptionRequest Request body for updateSubscription API. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void setSubscriptionForDevelopmentEventsV0(String subscriptionId, com.amazon.ask.smapi.model.v0.developmentEvents.subscription.UpdateSubscriptionRequest updateSubscriptionRequest) throws ServiceException {
    this.callSetSubscriptionForDevelopmentEventsV0(subscriptionId, updateSubscriptionRequest).getResponse();
  }

  /**
   * 
   * Associate skill with catalog.
   * @param skillId The skill ID. (required)
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callAssociateCatalogWithSkillV0(String skillId, String catalogId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/skills/{skillId}/catalogs/{catalogId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 201, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Associate skill with catalog.
   * @param skillId The skill ID. (required)
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @throws ServiceException if fails to make API call
   */
  public void associateCatalogWithSkillV0(String skillId, String catalogId) throws ServiceException {
    this.callAssociateCatalogWithSkillV0(skillId, catalogId).getResponse();
  }

  /**
   * 
   * Lists all the catalogs associated with a skill.
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse> callListCatalogsForSkillV0(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v0/skills/{skillId}/catalogs";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v0.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse.class, false);
  }

  /**
   * 
   * Lists all the catalogs associated with a skill.
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v0.catalog.ListCatalogsResponse listCatalogsForSkillV0(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callListCatalogsForSkillV0(skillId, nextToken, maxResults).getResponse();
  }

  /**
   * Create new upload
   * Creates a new upload for a catalog and returns location to track the upload process.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param catalogUploadRequestBody Provides the request body for create content upload (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCreateCatalogUploadV1(String catalogId, com.amazon.ask.smapi.model.v1.catalog.upload.CatalogUploadBase catalogUploadRequestBody) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/catalogs/{catalogId}/uploads";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Accepted"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, catalogUploadRequestBody, null, false);
  }

  /**
   * Create new upload
   * Creates a new upload for a catalog and returns location to track the upload process.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param catalogUploadRequestBody Provides the request body for create content upload (required)
   * @throws ServiceException if fails to make API call
   */
  public void createCatalogUploadV1(String catalogId, com.amazon.ask.smapi.model.v1.catalog.upload.CatalogUploadBase catalogUploadRequestBody) throws ServiceException {
    this.callCreateCatalogUploadV1(catalogId, catalogUploadRequestBody).getResponse();
  }

  /**
   * Get upload
   * Gets detailed information about an upload which was created for a specific catalog. Includes the upload&#39;s ingestion steps and a url for downloading the file.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param uploadId Unique identifier of the upload (required)
   * @return com.amazon.ask.smapi.model.v1.catalog.upload.GetContentUploadResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.catalog.upload.GetContentUploadResponse> callGetContentUploadByIdV1(String catalogId, String uploadId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    pathParams.put("uploadId", uploadId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/catalogs/{catalogId}/uploads/{uploadId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.catalog.upload.GetContentUploadResponse.class, 200, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.catalog.upload.GetContentUploadResponse.class, false);
  }

  /**
   * Get upload
   * Gets detailed information about an upload which was created for a specific catalog. Includes the upload&#39;s ingestion steps and a url for downloading the file.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param uploadId Unique identifier of the upload (required)
   * @return com.amazon.ask.smapi.model.v1.catalog.upload.GetContentUploadResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.catalog.upload.GetContentUploadResponse getContentUploadByIdV1(String catalogId, String uploadId) throws ServiceException {
    return this.callGetContentUploadByIdV1(catalogId, uploadId).getResponse();
  }

  /**
   * 
   * Generates preSigned urls to upload data
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param generateCatalogUploadUrlRequestBody Request body to generate catalog upload url (required)
   * @return com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlResponse> callGenerateCatalogUploadUrlV1(String catalogId, com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlRequest generateCatalogUploadUrlRequestBody) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/catalogs/{catalogId}/urls";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlResponse.class, 201, "Successful operation."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, generateCatalogUploadUrlRequestBody, com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlResponse.class, false);
  }

  /**
   * 
   * Generates preSigned urls to upload data
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param generateCatalogUploadUrlRequestBody Request body to generate catalog upload url (required)
   * @return com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlResponse generateCatalogUploadUrlV1(String catalogId, com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlRequest generateCatalogUploadUrlRequestBody) throws ServiceException {
    return this.callGenerateCatalogUploadUrlV1(catalogId, generateCatalogUploadUrlRequestBody).getResponse();
  }

  /**
   * 
   * The SMAPI Audit Logs API provides customers with an audit history of all SMAPI calls made by a developer or developers with permissions on that account.
   * @param getAuditLogsRequest Request object encompassing vendorId, optional request filters and optional pagination context. (required)
   * @return com.amazon.ask.smapi.model.v1.auditLogs.AuditLogsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.auditLogs.AuditLogsResponse> callQueryDevelopmentAuditLogsV1(com.amazon.ask.smapi.model.v1.auditLogs.AuditLogsRequest getAuditLogsRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/developmentAuditLogs/query";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.auditLogs.AuditLogsResponse.class, 200, "Returns a list of audit logs for the given vendor."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Invalid request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "Unauthorized"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Not Found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too Many Requests"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, getAuditLogsRequest, com.amazon.ask.smapi.model.v1.auditLogs.AuditLogsResponse.class, false);
  }

  /**
   * 
   * The SMAPI Audit Logs API provides customers with an audit history of all SMAPI calls made by a developer or developers with permissions on that account.
   * @param getAuditLogsRequest Request object encompassing vendorId, optional request filters and optional pagination context. (required)
   * @return com.amazon.ask.smapi.model.v1.auditLogs.AuditLogsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.auditLogs.AuditLogsResponse queryDevelopmentAuditLogsV1(com.amazon.ask.smapi.model.v1.auditLogs.AuditLogsRequest getAuditLogsRequest) throws ServiceException {
    return this.callQueryDevelopmentAuditLogsV1(getAuditLogsRequest).getResponse();
  }

  /**
   * 
   * Get the list of in-skill products for the vendor.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param productId The list of in-skill product IDs that you wish to get the summary for. A maximum of 50 in-skill product IDs can be specified in a single listInSkillProducts call. Please note that this parameter must not be used with &#39;nextToken&#39; and/or &#39;maxResults&#39; parameter. (optional)
   * @param stage Filter in-skill products by specified stage. (optional)
   * @param type Type of in-skill product to filter on. (optional)
   * @param referenceName Filter in-skill products by reference name. (optional)
   * @param status Status of in-skill product. (optional)
   * @param isAssociatedWithSkill Filter in-skill products by whether or not they are associated to a skill. (optional)
   * @return com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse> callGetIspListForVendorV1(String vendorId, String nextToken, BigDecimal maxResults, List<String> productId, String stage, String type, String referenceName, String status, String isAssociatedWithSkill) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(vendorId != null) {
    queryParams.add(new Pair<String, String>("vendorId", vendorId));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(productId != null) {
    for (Object param : productId) {
      queryParams.add(new Pair<String, String>("productId", param.toString()));
    }
  }

    if(stage != null) {
    queryParams.add(new Pair<String, String>("stage", stage));
  }

    if(type != null) {
    queryParams.add(new Pair<String, String>("type", type));
  }

    if(referenceName != null) {
    queryParams.add(new Pair<String, String>("referenceName", referenceName));
  }

    if(status != null) {
    queryParams.add(new Pair<String, String>("status", status));
  }

    if(isAssociatedWithSkill != null) {
    queryParams.add(new Pair<String, String>("isAssociatedWithSkill", isAssociatedWithSkill));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse.class, 200, "Response contains list of in-skill products for the specified vendor and stage."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request. Returned when a required parameter is not present, badly formatted. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse.class, false);
  }

  /**
   * 
   * Get the list of in-skill products for the vendor.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param productId The list of in-skill product IDs that you wish to get the summary for. A maximum of 50 in-skill product IDs can be specified in a single listInSkillProducts call. Please note that this parameter must not be used with &#39;nextToken&#39; and/or &#39;maxResults&#39; parameter. (optional)
   * @param stage Filter in-skill products by specified stage. (optional)
   * @param type Type of in-skill product to filter on. (optional)
   * @param referenceName Filter in-skill products by reference name. (optional)
   * @param status Status of in-skill product. (optional)
   * @param isAssociatedWithSkill Filter in-skill products by whether or not they are associated to a skill. (optional)
   * @return com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse getIspListForVendorV1(String vendorId, String nextToken, BigDecimal maxResults, List<String> productId, String stage, String type, String referenceName, String status, String isAssociatedWithSkill) throws ServiceException {
    return this.callGetIspListForVendorV1(vendorId, nextToken, maxResults, productId, stage, type, referenceName, status, isAssociatedWithSkill).getResponse();
  }

  /**
   * 
   * Creates a new in-skill product for given vendorId.
   * @param createInSkillProductRequest defines the request body for createInSkillProduct API. (required)
   * @return com.amazon.ask.smapi.model.v1.isp.ProductResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.isp.ProductResponse> callCreateIspForVendorV1(com.amazon.ask.smapi.model.v1.isp.CreateInSkillProductRequest createInSkillProductRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.isp.ProductResponse.class, 201, "Success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request. Returned when a required parameter is not present, badly formatted. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createInSkillProductRequest, com.amazon.ask.smapi.model.v1.isp.ProductResponse.class, false);
  }

  /**
   * 
   * Creates a new in-skill product for given vendorId.
   * @param createInSkillProductRequest defines the request body for createInSkillProduct API. (required)
   * @return com.amazon.ask.smapi.model.v1.isp.ProductResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.isp.ProductResponse createIspForVendorV1(com.amazon.ask.smapi.model.v1.isp.CreateInSkillProductRequest createInSkillProductRequest) throws ServiceException {
    return this.callCreateIspForVendorV1(createInSkillProductRequest).getResponse();
  }

  /**
   * 
   * Disassociates an in-skill product from a skill.
   * @param productId The in-skill product ID. (required)
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDisassociateIspWithSkillV1(String productId, String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("productId", productId);
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts/{productId}/skills/{skillId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request. Returned when a required parameter is not present, badly formatted. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "Request is forbidden."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Disassociates an in-skill product from a skill.
   * @param productId The in-skill product ID. (required)
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public void disassociateIspWithSkillV1(String productId, String skillId) throws ServiceException {
    this.callDisassociateIspWithSkillV1(productId, skillId).getResponse();
  }

  /**
   * 
   * Associates an in-skill product with a skill.
   * @param productId The in-skill product ID. (required)
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callAssociateIspWithSkillV1(String productId, String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("productId", productId);
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts/{productId}/skills/{skillId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request. Returned when a required parameter is not present, badly formatted. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "Request is forbidden."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Associates an in-skill product with a skill.
   * @param productId The in-skill product ID. (required)
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public void associateIspWithSkillV1(String productId, String skillId) throws ServiceException {
    this.callAssociateIspWithSkillV1(productId, skillId).getResponse();
  }

  /**
   * 
   * Deletes the in-skill product for given productId. Only development stage supported. Live in-skill products or in-skill products associated with a skill cannot be deleted by this API.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteIspForProductV1(String productId, String stage, String ifMatch) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("productId", productId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (ifMatch != null) {
      headerParams.add(new Pair<String, String>("If-Match", ifMatch));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts/{productId}/stages/{stage}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request. Returned when a required parameter is not present, badly formatted. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "Request is forbidden."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 412, "Precondition failed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Deletes the in-skill product for given productId. Only development stage supported. Live in-skill products or in-skill products associated with a skill cannot be deleted by this API.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void deleteIspForProductV1(String productId, String stage, String ifMatch) throws ServiceException {
    this.callDeleteIspForProductV1(productId, stage, ifMatch).getResponse();
  }

  /**
   * 
   * Resets the entitlement(s) of the Product for the current user.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callResetEntitlementForProductV1(String productId, String stage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("productId", productId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts/{productId}/stages/{stage}/entitlement";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request. Returned when a required parameter is not present, badly formatted. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "Request is forbidden."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 412, "Precondition failed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Resets the entitlement(s) of the Product for the current user.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public void resetEntitlementForProductV1(String productId, String stage) throws ServiceException {
    this.callResetEntitlementForProductV1(productId, stage).getResponse();
  }

  /**
   * 
   * Returns the in-skill product definition for given productId.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @return com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinitionResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinitionResponse> callGetIspDefinitionV1(String productId, String stage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("productId", productId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts/{productId}/stages/{stage}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinitionResponse.class, 200, "Response contains the latest version of an in-skill product for the specified stage."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request. Returned when a required parameter is not present, badly formatted. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinitionResponse.class, false);
  }

  /**
   * 
   * Returns the in-skill product definition for given productId.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @return com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinitionResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinitionResponse getIspDefinitionV1(String productId, String stage) throws ServiceException {
    return this.callGetIspDefinitionV1(productId, stage).getResponse();
  }

  /**
   * 
   * Updates in-skill product definition for given productId. Only development stage supported.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @param updateInSkillProductRequest defines the request body for updateInSkillProduct API. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdateIspForProductV1(String productId, String stage, com.amazon.ask.smapi.model.v1.isp.UpdateInSkillProductRequest updateInSkillProductRequest, String ifMatch) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("productId", productId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (ifMatch != null) {
      headerParams.add(new Pair<String, String>("If-Match", ifMatch));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts/{productId}/stages/{stage}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request. Returned when a required parameter is not present, badly formatted. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "Request is forbidden."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 412, "Precondition failed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateInSkillProductRequest, null, false);
  }

  /**
   * 
   * Updates in-skill product definition for given productId. Only development stage supported.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @param updateInSkillProductRequest defines the request body for updateInSkillProduct API. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void updateIspForProductV1(String productId, String stage, com.amazon.ask.smapi.model.v1.isp.UpdateInSkillProductRequest updateInSkillProductRequest, String ifMatch) throws ServiceException {
    this.callUpdateIspForProductV1(productId, stage, updateInSkillProductRequest, ifMatch).getResponse();
  }

  /**
   * 
   * Get the associated skills for the in-skill product.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.isp.AssociatedSkillResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.isp.AssociatedSkillResponse> callGetIspAssociatedSkillsV1(String productId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("productId", productId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts/{productId}/stages/{stage}/skills";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.isp.AssociatedSkillResponse.class, 200, "Returns skills associated with the in-skill product."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.isp.AssociatedSkillResponse.class, false);
  }

  /**
   * 
   * Get the associated skills for the in-skill product.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.isp.AssociatedSkillResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.isp.AssociatedSkillResponse getIspAssociatedSkillsV1(String productId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callGetIspAssociatedSkillsV1(productId, stage, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * Get the summary information for an in-skill product.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @return com.amazon.ask.smapi.model.v1.isp.InSkillProductSummaryResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.isp.InSkillProductSummaryResponse> callGetIspSummaryV1(String productId, String stage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("productId", productId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/inSkillProducts/{productId}/stages/{stage}/summary";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.isp.InSkillProductSummaryResponse.class, 200, "Returns current in-skill product summary for productId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.isp.InSkillProductSummaryResponse.class, false);
  }

  /**
   * 
   * Get the summary information for an in-skill product.
   * @param productId The in-skill product ID. (required)
   * @param stage Stage for skill. (required)
   * @return com.amazon.ask.smapi.model.v1.isp.InSkillProductSummaryResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.isp.InSkillProductSummaryResponse getIspSummaryV1(String productId, String stage) throws ServiceException {
    return this.callGetIspSummaryV1(productId, stage).getResponse();
  }

  /**
   * 
   * Delete the catalog. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteInteractionModelCatalogV1(String catalogId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No content; just confirm the catalog is deleted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "The catalog cannot be deleted from reasons due to in-use by other entities."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Delete the catalog. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteInteractionModelCatalogV1(String catalogId) throws ServiceException {
    this.callDeleteInteractionModelCatalogV1(catalogId).getResponse();
  }

  /**
   * 
   * get the catalog definition 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogDefinitionOutput
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogDefinitionOutput> callGetInteractionModelCatalogDefinitionV1(String catalogId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogDefinitionOutput.class, 200, "the catalog definition"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "The catalog cannot be retrieved due to errors listed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogDefinitionOutput.class, false);
  }

  /**
   * 
   * get the catalog definition 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogDefinitionOutput
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogDefinitionOutput getInteractionModelCatalogDefinitionV1(String catalogId) throws ServiceException {
    return this.callGetInteractionModelCatalogDefinitionV1(catalogId).getResponse();
  }

  /**
   * 
   * update description and vendorGuidance string for certain version of a catalog. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param updateRequest  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdateInteractionModelCatalogV1(String catalogId, com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.UpdateRequest updateRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}/update";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No content, indicates the fields were successfully updated."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateRequest, null, false);
  }

  /**
   * 
   * update description and vendorGuidance string for certain version of a catalog. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param updateRequest  (required)
   * @throws ServiceException if fails to make API call
   */
  public void updateInteractionModelCatalogV1(String catalogId, com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.UpdateRequest updateRequest) throws ServiceException {
    this.callUpdateInteractionModelCatalogV1(catalogId, updateRequest).getResponse();
  }

  /**
   * 
   * Get the status of catalog resource and its sub-resources for a given catalogId. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param updateRequestId The identifier for slotType version creation process (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogStatus
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogStatus> callGetInteractionModelCatalogUpdateStatusV1(String catalogId, String updateRequestId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    pathParams.put("updateRequestId", updateRequestId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}/updateRequest/{updateRequestId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogStatus.class, 200, "Returns the build status and error codes for the given catalogId"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogStatus.class, false);
  }

  /**
   * 
   * Get the status of catalog resource and its sub-resources for a given catalogId. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param updateRequestId The identifier for slotType version creation process (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogStatus
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogStatus getInteractionModelCatalogUpdateStatusV1(String catalogId, String updateRequestId) throws ServiceException {
    return this.callGetInteractionModelCatalogUpdateStatusV1(catalogId, updateRequestId).getResponse();
  }

  /**
   * 
   * List all the historical versions of the given catalogId.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @param sortField Sets the field on which the sorting would be applied. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListCatalogEntityVersionsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListCatalogEntityVersionsResponse> callListInteractionModelCatalogVersionsV1(String catalogId, BigDecimal maxResults, String nextToken, String sortDirection, String sortField) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(sortDirection != null) {
    queryParams.add(new Pair<String, String>("sortDirection", sortDirection));
  }

    if(sortField != null) {
    queryParams.add(new Pair<String, String>("sortField", sortField));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}/versions";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListCatalogEntityVersionsResponse.class, 200, "Returns list of catalogs for the vendor."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. the catalog definition is invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified catalog does not exist."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListCatalogEntityVersionsResponse.class, false);
  }

  /**
   * 
   * List all the historical versions of the given catalogId.
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @param sortField Sets the field on which the sorting would be applied. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListCatalogEntityVersionsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListCatalogEntityVersionsResponse listInteractionModelCatalogVersionsV1(String catalogId, BigDecimal maxResults, String nextToken, String sortDirection, String sortField) throws ServiceException {
    return this.callListInteractionModelCatalogVersionsV1(catalogId, maxResults, nextToken, sortDirection, sortField).getResponse();
  }

  /**
   * 
   * Create a new version of catalog entity for the given catalogId. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param catalog  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCreateInteractionModelCatalogVersionV1(String catalogId, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionData catalog) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}/versions";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Returns update status location link on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. the catalog definition is invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified catalog does not exist."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, catalog, null, false);
  }

  /**
   * 
   * Create a new version of catalog entity for the given catalogId. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param catalog  (required)
   * @throws ServiceException if fails to make API call
   */
  public void createInteractionModelCatalogVersionV1(String catalogId, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionData catalog) throws ServiceException {
    this.callCreateInteractionModelCatalogVersionV1(catalogId, catalog).getResponse();
  }

  /**
   * 
   * Delete catalog version. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param version Version for interaction model. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteInteractionModelCatalogVersionV1(String catalogId, String version) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}/versions/{version}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No Content; Confirms that version is successfully deleted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog version for this catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Delete catalog version. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param version Version for interaction model. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteInteractionModelCatalogVersionV1(String catalogId, String version) throws ServiceException {
    this.callDeleteInteractionModelCatalogVersionV1(catalogId, version).getResponse();
  }

  /**
   * 
   * Get catalog version data of given catalog version. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param version Version for interaction model. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogVersionData
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogVersionData> callGetInteractionModelCatalogVersionV1(String catalogId, String version) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}/versions/{version}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogVersionData.class, 200, "Returns the catalog version metadata for the given catalogId and version."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogVersionData.class, false);
  }

  /**
   * 
   * Get catalog version data of given catalog version. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param version Version for interaction model. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogVersionData
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogVersionData getInteractionModelCatalogVersionV1(String catalogId, String version) throws ServiceException {
    return this.callGetInteractionModelCatalogVersionV1(catalogId, version).getResponse();
  }

  /**
   * 
   * Update description and vendorGuidance string for certain version of a catalog. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param version Version for interaction model. (required)
   * @param catalogUpdate  (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdateInteractionModelCatalogVersionV1(String catalogId, String version, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogUpdate catalogUpdate) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}/versions/{version}/update";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No Content; Confirms that version is successfully updated."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, catalogUpdate, null, false);
  }

  /**
   * 
   * Update description and vendorGuidance string for certain version of a catalog. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param version Version for interaction model. (required)
   * @param catalogUpdate  (optional)
   * @throws ServiceException if fails to make API call
   */
  public void updateInteractionModelCatalogVersionV1(String catalogId, String version, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogUpdate catalogUpdate) throws ServiceException {
    this.callUpdateInteractionModelCatalogVersionV1(catalogId, version, catalogUpdate).getResponse();
  }

  /**
   * 
   * Get catalog values from the given catalogId &amp;amp; version. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param version Version for interaction model. (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogValues
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogValues> callGetInteractionModelCatalogValuesV1(String catalogId, String version, BigDecimal maxResults, String nextToken) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("catalogId", catalogId);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs/{catalogId}/versions/{version}/values";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogValues.class, 200, "Returns list of catalog values for the given catalogId and version."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogValues.class, false);
  }

  /**
   * 
   * Get catalog values from the given catalogId &amp;amp; version. 
   * @param catalogId Provides a unique identifier of the catalog (required)
   * @param version Version for interaction model. (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogValues
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogValues getInteractionModelCatalogValuesV1(String catalogId, String version, BigDecimal maxResults, String nextToken) throws ServiceException {
    return this.callGetInteractionModelCatalogValuesV1(catalogId, version, maxResults, nextToken).getResponse();
  }

  /**
   * 
   * List all catalogs for the vendor. 
   * @param vendorId The vendor ID. (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.ListCatalogResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.ListCatalogResponse> callListInteractionModelCatalogsV1(String vendorId, BigDecimal maxResults, String nextToken, String sortDirection) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(vendorId != null) {
    queryParams.add(new Pair<String, String>("vendorId", vendorId));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(sortDirection != null) {
    queryParams.add(new Pair<String, String>("sortDirection", sortDirection));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.ListCatalogResponse.class, 200, "Returns list of catalogs for the vendor."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.ListCatalogResponse.class, false);
  }

  /**
   * 
   * List all catalogs for the vendor. 
   * @param vendorId The vendor ID. (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.ListCatalogResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.ListCatalogResponse listInteractionModelCatalogsV1(String vendorId, BigDecimal maxResults, String nextToken, String sortDirection) throws ServiceException {
    return this.callListInteractionModelCatalogsV1(vendorId, maxResults, nextToken, sortDirection).getResponse();
  }

  /**
   * 
   * Create a new version of catalog within the given catalogId. 
   * @param catalog  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogResponse> callCreateInteractionModelCatalogV1(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.DefinitionData catalog) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/catalogs";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogResponse.class, 200, "Returns the generated catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. the catalog definition is invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 412, "Precondition failed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, catalog, com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogResponse.class, false);
  }

  /**
   * 
   * Create a new version of catalog within the given catalogId. 
   * @param catalog  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogResponse createInteractionModelCatalogV1(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.DefinitionData catalog) throws ServiceException {
    return this.callCreateInteractionModelCatalogV1(catalog).getResponse();
  }

  /**
   * 
   * List all slot types for the vendor. 
   * @param vendorId The vendor ID. (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.type.ListSlotTypeResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.ListSlotTypeResponse> callListInteractionModelSlotTypesV1(String vendorId, BigDecimal maxResults, String nextToken, String sortDirection) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(vendorId != null) {
    queryParams.add(new Pair<String, String>("vendorId", vendorId));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(sortDirection != null) {
    queryParams.add(new Pair<String, String>("sortDirection", sortDirection));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.ListSlotTypeResponse.class, 200, "Returns list of slot types for the vendor."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.type.ListSlotTypeResponse.class, false);
  }

  /**
   * 
   * List all slot types for the vendor. 
   * @param vendorId The vendor ID. (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.type.ListSlotTypeResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.type.ListSlotTypeResponse listInteractionModelSlotTypesV1(String vendorId, BigDecimal maxResults, String nextToken, String sortDirection) throws ServiceException {
    return this.callListInteractionModelSlotTypesV1(vendorId, maxResults, nextToken, sortDirection).getResponse();
  }

  /**
   * 
   * Create a new version of slot type within the given slotTypeId. 
   * @param slotType  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeResponse> callCreateInteractionModelSlotTypeV1(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.DefinitionData slotType) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeResponse.class, 200, "Returns the generated slotTypeId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. the slot type definition is invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, slotType, com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeResponse.class, false);
  }

  /**
   * 
   * Create a new version of slot type within the given slotTypeId. 
   * @param slotType  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeResponse createInteractionModelSlotTypeV1(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.DefinitionData slotType) throws ServiceException {
    return this.callCreateInteractionModelSlotTypeV1(slotType).getResponse();
  }

  /**
   * 
   * Delete the slot type. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteInteractionModelSlotTypeV1(String slotTypeId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("slotTypeId", slotTypeId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes/{slotTypeId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No content; just confirm the slot type is deleted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "The slot type cannot be deleted from reasons due to in-use by other entities."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no slot type defined for the slotTypeId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Delete the slot type. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteInteractionModelSlotTypeV1(String slotTypeId) throws ServiceException {
    this.callDeleteInteractionModelSlotTypeV1(slotTypeId).getResponse();
  }

  /**
   * 
   * Get the slot type definition. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeDefinitionOutput
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeDefinitionOutput> callGetInteractionModelSlotTypeDefinitionV1(String slotTypeId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("slotTypeId", slotTypeId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes/{slotTypeId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeDefinitionOutput.class, 200, "The slot type definition."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "The slot type cannot be retrieved due to errors listed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no slot type defined for the slotTypeId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeDefinitionOutput.class, false);
  }

  /**
   * 
   * Get the slot type definition. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeDefinitionOutput
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeDefinitionOutput getInteractionModelSlotTypeDefinitionV1(String slotTypeId) throws ServiceException {
    return this.callGetInteractionModelSlotTypeDefinitionV1(slotTypeId).getResponse();
  }

  /**
   * 
   * Update description and vendorGuidance string for certain version of a slot type. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param updateRequest  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdateInteractionModelSlotTypeV1(String slotTypeId, com.amazon.ask.smapi.model.v1.skill.interactionModel.type.UpdateRequest updateRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("slotTypeId", slotTypeId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes/{slotTypeId}/update";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No content, indicates the fields were successfully updated."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no slot type defined for the slotTypeId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateRequest, null, false);
  }

  /**
   * 
   * Update description and vendorGuidance string for certain version of a slot type. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param updateRequest  (required)
   * @throws ServiceException if fails to make API call
   */
  public void updateInteractionModelSlotTypeV1(String slotTypeId, com.amazon.ask.smapi.model.v1.skill.interactionModel.type.UpdateRequest updateRequest) throws ServiceException {
    this.callUpdateInteractionModelSlotTypeV1(slotTypeId, updateRequest).getResponse();
  }

  /**
   * 
   * Get the status of slot type resource and its sub-resources for a given slotTypeId. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param updateRequestId The identifier for slotType version creation process (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatus
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatus> callGetInteractionModelSlotTypeBuildStatusV1(String slotTypeId, String updateRequestId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("slotTypeId", slotTypeId);
    pathParams.put("updateRequestId", updateRequestId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes/{slotTypeId}/updateRequest/{updateRequestId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatus.class, 200, "Returns the build status and error codes for the given slotTypeId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no slot type defined for the slotTypeId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatus.class, false);
  }

  /**
   * 
   * Get the status of slot type resource and its sub-resources for a given slotTypeId. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param updateRequestId The identifier for slotType version creation process (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatus
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatus getInteractionModelSlotTypeBuildStatusV1(String slotTypeId, String updateRequestId) throws ServiceException {
    return this.callGetInteractionModelSlotTypeBuildStatusV1(slotTypeId, updateRequestId).getResponse();
  }

  /**
   * 
   * List all slot type versions for the slot type id. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ListSlotTypeVersionResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ListSlotTypeVersionResponse> callListInteractionModelSlotTypeVersionsV1(String slotTypeId, BigDecimal maxResults, String nextToken, String sortDirection) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(sortDirection != null) {
    queryParams.add(new Pair<String, String>("sortDirection", sortDirection));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("slotTypeId", slotTypeId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes/{slotTypeId}/versions";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ListSlotTypeVersionResponse.class, 200, "Returns list of slot type version for the slot type id."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ListSlotTypeVersionResponse.class, false);
  }

  /**
   * 
   * List all slot type versions for the slot type id. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ListSlotTypeVersionResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.ListSlotTypeVersionResponse listInteractionModelSlotTypeVersionsV1(String slotTypeId, BigDecimal maxResults, String nextToken, String sortDirection) throws ServiceException {
    return this.callListInteractionModelSlotTypeVersionsV1(slotTypeId, maxResults, nextToken, sortDirection).getResponse();
  }

  /**
   * 
   * Create a new version of slot type entity for the given slotTypeId. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param slotType  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCreateInteractionModelSlotTypeVersionV1(String slotTypeId, com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.VersionData slotType) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("slotTypeId", slotTypeId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes/{slotTypeId}/versions";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Returns update status location link on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. the slot type definition is invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified slot type does not exist."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, slotType, null, false);
  }

  /**
   * 
   * Create a new version of slot type entity for the given slotTypeId. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param slotType  (required)
   * @throws ServiceException if fails to make API call
   */
  public void createInteractionModelSlotTypeVersionV1(String slotTypeId, com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.VersionData slotType) throws ServiceException {
    this.callCreateInteractionModelSlotTypeVersionV1(slotTypeId, slotType).getResponse();
  }

  /**
   * 
   * Delete slot type version. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param version Version for interaction model. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteInteractionModelSlotTypeVersionV1(String slotTypeId, String version) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("slotTypeId", slotTypeId);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes/{slotTypeId}/versions/{version}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No Content; Confirms that version is successfully deleted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no slot type version for this slotTypeId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Delete slot type version. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param version Version for interaction model. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteInteractionModelSlotTypeVersionV1(String slotTypeId, String version) throws ServiceException {
    this.callDeleteInteractionModelSlotTypeVersionV1(slotTypeId, version).getResponse();
  }

  /**
   * 
   * Get slot type version data of given slot type version. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param version Version for interaction model. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionData
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionData> callGetInteractionModelSlotTypeVersionV1(String slotTypeId, String version) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("slotTypeId", slotTypeId);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes/{slotTypeId}/versions/{version}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionData.class, 200, "Returns the slot type version metadata for the given slotTypeId and version."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no slot type defined for the slotTypeId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionData.class, false);
  }

  /**
   * 
   * Get slot type version data of given slot type version. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param version Version for interaction model. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionData
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeVersionData getInteractionModelSlotTypeVersionV1(String slotTypeId, String version) throws ServiceException {
    return this.callGetInteractionModelSlotTypeVersionV1(slotTypeId, version).getResponse();
  }

  /**
   * 
   * Update description and vendorGuidance string for certain version of a slot type. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param version Version for interaction model. (required)
   * @param slotTypeUpdate  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdateInteractionModelSlotTypeVersionV1(String slotTypeId, String version, com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeUpdate slotTypeUpdate) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("slotTypeId", slotTypeId);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/api/custom/interactionModel/slotTypes/{slotTypeId}/versions/{version}/update";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No Content; Confirms that version is successfully updated."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no slot type defined for the slotTypeId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, slotTypeUpdate, null, false);
  }

  /**
   * 
   * Update description and vendorGuidance string for certain version of a slot type. 
   * @param slotTypeId The identifier for a slot type. (required)
   * @param version Version for interaction model. (required)
   * @param slotTypeUpdate  (required)
   * @throws ServiceException if fails to make API call
   */
  public void updateInteractionModelSlotTypeVersionV1(String slotTypeId, String version, com.amazon.ask.smapi.model.v1.skill.interactionModel.typeVersion.SlotTypeUpdate slotTypeUpdate) throws ServiceException {
    this.callUpdateInteractionModelSlotTypeVersionV1(slotTypeId, version, slotTypeUpdate).getResponse();
  }

  /**
   * 
   * Get status for given exportId 
   * @param exportId The Export ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.ExportResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.ExportResponse> callGetStatusOfExportRequestV1(String exportId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("exportId", exportId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/exports/{exportId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.ExportResponse.class, 200, "OK."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.ExportResponse.class, false);
  }

  /**
   * 
   * Get status for given exportId 
   * @param exportId The Export ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.ExportResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.ExportResponse getStatusOfExportRequestV1(String exportId) throws ServiceException {
    return this.callGetStatusOfExportRequestV1(exportId).getResponse();
  }

  /**
   * 
   * Get the list of skills for the vendor.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param skillId The list of skillIds that you wish to get the summary for. A maximum of 10 skillIds can be specified to get the skill summary in single listSkills call. Please note that this parameter must not be used with &#39;nextToken&#39; or/and &#39;maxResults&#39; parameter. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.ListSkillResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.ListSkillResponse> callListSkillsForVendorV1(String vendorId, String nextToken, BigDecimal maxResults, List<String> skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(vendorId != null) {
    queryParams.add(new Pair<String, String>("vendorId", vendorId));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(skillId != null) {
    for (Object param : skillId) {
      queryParams.add(new Pair<String, String>("skillId", param.toString()));
    }
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.ListSkillResponse.class, 200, "Returns list of skills for the vendor."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.ListSkillResponse.class, false);
  }

  /**
   * 
   * Get the list of skills for the vendor.
   * @param vendorId The vendor ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param skillId The list of skillIds that you wish to get the summary for. A maximum of 10 skillIds can be specified to get the skill summary in single listSkills call. Please note that this parameter must not be used with &#39;nextToken&#39; or/and &#39;maxResults&#39; parameter. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.ListSkillResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.ListSkillResponse listSkillsForVendorV1(String vendorId, String nextToken, BigDecimal maxResults, List<String> skillId) throws ServiceException {
    return this.callListSkillsForVendorV1(vendorId, nextToken, maxResults, skillId).getResponse();
  }

  /**
   * 
   * Get status for given importId. 
   * @param importId The Import ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.ImportResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.ImportResponse> callGetImportStatusV1(String importId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("importId", importId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/imports/{importId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.ImportResponse.class, 200, "OK."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.ImportResponse.class, false);
  }

  /**
   * 
   * Get status for given importId. 
   * @param importId The Import ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.ImportResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.ImportResponse getImportStatusV1(String importId) throws ServiceException {
    return this.callGetImportStatusV1(importId).getResponse();
  }

  /**
   * 
   * Creates a new import for a skill. 
   * @param createSkillWithPackageRequest Defines the request body for createPackage API. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCreateSkillPackageV1(com.amazon.ask.smapi.model.v1.skill.CreateSkillWithPackageRequest createSkillWithPackageRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/imports";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Accepted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 413, "Payload too large."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createSkillWithPackageRequest, null, false);
  }

  /**
   * 
   * Creates a new import for a skill. 
   * @param createSkillWithPackageRequest Defines the request body for createPackage API. (required)
   * @throws ServiceException if fails to make API call
   */
  public void createSkillPackageV1(com.amazon.ask.smapi.model.v1.skill.CreateSkillWithPackageRequest createSkillWithPackageRequest) throws ServiceException {
    this.callCreateSkillPackageV1(createSkillWithPackageRequest).getResponse();
  }

  /**
   * 
   * Creates a new skill for given vendorId.
   * @param createSkillRequest Defines the request body for createSkill API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.CreateSkillResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.CreateSkillResponse> callCreateSkillForVendorV1(com.amazon.ask.smapi.model.v1.skill.CreateSkillRequest createSkillRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.CreateSkillResponse.class, 202, "Accepted; Returns a URL to track the status in 'Location' header."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createSkillRequest, com.amazon.ask.smapi.model.v1.skill.CreateSkillResponse.class, false);
  }

  /**
   * 
   * Creates a new skill for given vendorId.
   * @param createSkillRequest Defines the request body for createSkill API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.CreateSkillResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.CreateSkillResponse createSkillForVendorV1(com.amazon.ask.smapi.model.v1.skill.CreateSkillRequest createSkillRequest) throws ServiceException {
    return this.callCreateSkillForVendorV1(createSkillRequest).getResponse();
  }

  /**
   * 
   * Get Alexa hosted skill&#39;s metadata
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillMetadata
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillMetadata> callGetAlexaHostedSkillMetadataV1(String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/alexaHosted";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillMetadata.class, 200, "response contains the Alexa hosted skill's metadata"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. Authorization Url is invalid"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillMetadata.class, false);
  }

  /**
   * 
   * Get Alexa hosted skill&#39;s metadata
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillMetadata
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillMetadata getAlexaHostedSkillMetadataV1(String skillId) throws ServiceException {
    return this.callGetAlexaHostedSkillMetadataV1(skillId).getResponse();
  }

  /**
   * 
   * Generates hosted skill repository credentials to access the hosted skill repository.
   * @param skillId The skill ID. (required)
   * @param hostedSkillRepositoryCredentialsRequest defines the request body for hosted skill repository credentials (required)
   * @return com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsList
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsList> callGenerateCredentialsForAlexaHostedSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsRequest hostedSkillRepositoryCredentialsRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/alexaHosted/repository/credentials/generate";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsList.class, 200, "Response contains the hosted skill repository credentials"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. Authorization Url is invalid"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, hostedSkillRepositoryCredentialsRequest, com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsList.class, false);
  }

  /**
   * 
   * Generates hosted skill repository credentials to access the hosted skill repository.
   * @param skillId The skill ID. (required)
   * @param hostedSkillRepositoryCredentialsRequest defines the request body for hosted skill repository credentials (required)
   * @return com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsList
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsList generateCredentialsForAlexaHostedSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsRequest hostedSkillRepositoryCredentialsRequest) throws ServiceException {
    return this.callGenerateCredentialsForAlexaHostedSkillV1(skillId, hostedSkillRepositoryCredentialsRequest).getResponse();
  }

  /**
   * Download the annotation set contents.
   * 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @param accept - &#x60;application/json&#x60;: indicate to download annotation set contents in JSON format - &#x60;text/csv&#x60;: indicate to download annotation set contents in CSV format  (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a paginationContext.  (optional, default to 1000)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetAsrAnnotationSetAnnotationsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetAsrAnnotationSetAnnotationsResponse> callGetAnnotationsForASRAnnotationSetV1(String skillId, String annotationSetId, String accept, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationSetId", annotationSetId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (accept != null) {
      headerParams.add(new Pair<String, String>("Accept", accept));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrAnnotationSets/{annotationSetId}/annotations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetAsrAnnotationSetAnnotationsResponse.class, 200, "The annotation set contents payload in specified format.  This API also supports pagination for annotation set contents requested in  `application/json` content type. Paginaiton for requested content  type `text/csv` is not supported. In this case, the nextToken and  maxResults query parameters would be ignored even if they are  specified as query parameters. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetAsrAnnotationSetAnnotationsResponse.class, false);
  }

  /**
   * Download the annotation set contents.
   * 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @param accept - &#x60;application/json&#x60;: indicate to download annotation set contents in JSON format - &#x60;text/csv&#x60;: indicate to download annotation set contents in CSV format  (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a paginationContext.  (optional, default to 1000)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetAsrAnnotationSetAnnotationsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetAsrAnnotationSetAnnotationsResponse getAnnotationsForASRAnnotationSetV1(String skillId, String annotationSetId, String accept, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callGetAnnotationsForASRAnnotationSetV1(skillId, annotationSetId, accept, nextToken, maxResults).getResponse();
  }

  /**
   * Update the annotations in the annotation set
   * API that updates the annotaions in the annotation set 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @param updateAsrAnnotationSetContentsRequest Payload containing annotation set contents. Two formats are accepted here: - &#x60;application/json&#x60;: Annotation set payload in JSON format. - &#x60;text/csv&#x60;: Annotation set payload in CSV format. Note that for CSV format, the first row should describe the column attributes. Columns should be delimited by comma.  The subsequent rows should describe annotation data and each annotation attributes has to follow the strict ordering defined in the first row. Each annotation fields should be delimited by comma.  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSetAnnotationsForASRAnnotationSetV1(String skillId, String annotationSetId, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.UpdateAsrAnnotationSetContentsPayload updateAsrAnnotationSetContentsRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationSetId", annotationSetId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrAnnotationSets/{annotationSetId}/annotations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "ASR annotation set contents have been updated successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateAsrAnnotationSetContentsRequest, null, false);
  }

  /**
   * Update the annotations in the annotation set
   * API that updates the annotaions in the annotation set 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @param updateAsrAnnotationSetContentsRequest Payload containing annotation set contents. Two formats are accepted here: - &#x60;application/json&#x60;: Annotation set payload in JSON format. - &#x60;text/csv&#x60;: Annotation set payload in CSV format. Note that for CSV format, the first row should describe the column attributes. Columns should be delimited by comma.  The subsequent rows should describe annotation data and each annotation attributes has to follow the strict ordering defined in the first row. Each annotation fields should be delimited by comma.  (required)
   * @throws ServiceException if fails to make API call
   */
  public void setAnnotationsForASRAnnotationSetV1(String skillId, String annotationSetId, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.UpdateAsrAnnotationSetContentsPayload updateAsrAnnotationSetContentsRequest) throws ServiceException {
    this.callSetAnnotationsForASRAnnotationSetV1(skillId, annotationSetId, updateAsrAnnotationSetContentsRequest).getResponse();
  }

  /**
   * Delete the ASR annotation set
   * API which deletes the ASR annotation set. Developers cannot get/list the deleted annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteASRAnnotationSetV1(String skillId, String annotationSetId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationSetId", annotationSetId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrAnnotationSets/{annotationSetId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "ASR annotation set exists and is deleted successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * Delete the ASR annotation set
   * API which deletes the ASR annotation set. Developers cannot get/list the deleted annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteASRAnnotationSetV1(String skillId, String annotationSetId) throws ServiceException {
    this.callDeleteASRAnnotationSetV1(skillId, annotationSetId).getResponse();
  }

  /**
   * Get the metadata of an ASR annotation set
   * Return the metadata for an ASR annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetASRAnnotationSetsPropertiesResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetASRAnnotationSetsPropertiesResponse> callGetASRAnnotationSetV1(String skillId, String annotationSetId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationSetId", annotationSetId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrAnnotationSets/{annotationSetId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetASRAnnotationSetsPropertiesResponse.class, 200, "The ASR annotation set exists."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetASRAnnotationSetsPropertiesResponse.class, false);
  }

  /**
   * Get the metadata of an ASR annotation set
   * Return the metadata for an ASR annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetASRAnnotationSetsPropertiesResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.GetASRAnnotationSetsPropertiesResponse getASRAnnotationSetV1(String skillId, String annotationSetId) throws ServiceException {
    return this.callGetASRAnnotationSetV1(skillId, annotationSetId).getResponse();
  }

  /**
   * update the ASR annotation set properties.
   * API which updates the ASR annotation set properties. Currently, the only data can be updated is annotation set name. 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @param updateAsrAnnotationSetPropertiesRequestV1 Payload sent to the update ASR annotation set properties API. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSetASRAnnotationSetV1(String skillId, String annotationSetId, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.UpdateAsrAnnotationSetPropertiesRequestObject updateAsrAnnotationSetPropertiesRequestV1) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationSetId", annotationSetId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrAnnotationSets/{annotationSetId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "ASR annotation set exists and properties are updated successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateAsrAnnotationSetPropertiesRequestV1, null, false);
  }

  /**
   * update the ASR annotation set properties.
   * API which updates the ASR annotation set properties. Currently, the only data can be updated is annotation set name. 
   * @param skillId The skill ID. (required)
   * @param annotationSetId Identifier of the ASR annotation set. (required)
   * @param updateAsrAnnotationSetPropertiesRequestV1 Payload sent to the update ASR annotation set properties API. (required)
   * @throws ServiceException if fails to make API call
   */
  public void setASRAnnotationSetV1(String skillId, String annotationSetId, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.UpdateAsrAnnotationSetPropertiesRequestObject updateAsrAnnotationSetPropertiesRequestV1) throws ServiceException {
    this.callSetASRAnnotationSetV1(skillId, annotationSetId, updateAsrAnnotationSetPropertiesRequestV1).getResponse();
  }

  /**
   * List ASR annotation sets metadata for a given skill.
   * API which requests all the ASR annotation sets for a skill. Returns the annotation set id and properties for each ASR annotation set. Supports paging of results. 
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a paginationContext.  (optional, default to 1000)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.ListASRAnnotationSetsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.ListASRAnnotationSetsResponse> callListASRAnnotationSetsV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrAnnotationSets";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.ListASRAnnotationSetsResponse.class, 200, "ASR annotation sets metadata are returned."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.ListASRAnnotationSetsResponse.class, false);
  }

  /**
   * List ASR annotation sets metadata for a given skill.
   * API which requests all the ASR annotation sets for a skill. Returns the annotation set id and properties for each ASR annotation set. Supports paging of results. 
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a paginationContext.  (optional, default to 1000)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.ListASRAnnotationSetsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.ListASRAnnotationSetsResponse listASRAnnotationSetsV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callListASRAnnotationSetsV1(skillId, nextToken, maxResults).getResponse();
  }

  /**
   * Create a new ASR annotation set for a skill
   * This is an API that creates a new ASR annotation set with a name and returns the annotationSetId which can later be used to retrieve or reference the annotation set 
   * @param skillId The skill ID. (required)
   * @param createAsrAnnotationSetRequest Payload sent to the create ASR annotation set API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.CreateAsrAnnotationSetResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.CreateAsrAnnotationSetResponse> callCreateASRAnnotationSetV1(String skillId, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.CreateAsrAnnotationSetRequestObject createAsrAnnotationSetRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrAnnotationSets";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.CreateAsrAnnotationSetResponse.class, 200, "ASR annotation set created successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createAsrAnnotationSetRequest, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.CreateAsrAnnotationSetResponse.class, false);
  }

  /**
   * Create a new ASR annotation set for a skill
   * This is an API that creates a new ASR annotation set with a name and returns the annotationSetId which can later be used to retrieve or reference the annotation set 
   * @param skillId The skill ID. (required)
   * @param createAsrAnnotationSetRequest Payload sent to the create ASR annotation set API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.CreateAsrAnnotationSetResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.CreateAsrAnnotationSetResponse createASRAnnotationSetV1(String skillId, com.amazon.ask.smapi.model.v1.skill.asr.annotationSets.CreateAsrAnnotationSetRequestObject createAsrAnnotationSetRequest) throws ServiceException {
    return this.callCreateASRAnnotationSetV1(skillId, createAsrAnnotationSetRequest).getResponse();
  }

  /**
   * Delete an evaluation.
   * API which enables the deletion of an evaluation.  
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteASREvaluationV1(String skillId, String evaluationId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("evaluationId", evaluationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrEvaluations/{evaluationId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "ASR evaluation exists and is deleted successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * Delete an evaluation.
   * API which enables the deletion of an evaluation.  
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteASREvaluationV1(String skillId, String evaluationId) throws ServiceException {
    this.callDeleteASREvaluationV1(skillId, evaluationId).getResponse();
  }

  /**
   * List results for a completed Evaluation.
   * Paginated API which returns the test case results of an evaluation. This should be considered the \&quot;expensive\&quot; operation while GetAsrEvaluationsStatus is \&quot;cheap\&quot;. 
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a nextToken.  (optional, default to 1000)
   * @param status query parameter used to filter evaluation result status.   * &#x60;PASSED&#x60; - filter evaluation result status of &#x60;PASSED&#x60;   * &#x60;FAILED&#x60; - filter evaluation result status of &#x60;FAILED&#x60;  (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationsResultsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationsResultsResponse> callListASREvaluationsResultsV1(String skillId, String evaluationId, String nextToken, BigDecimal maxResults, String status) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(status != null) {
    queryParams.add(new Pair<String, String>("status", status));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("evaluationId", evaluationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrEvaluations/{evaluationId}/results";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationsResultsResponse.class, 200, "Evaluation exists and its status is queryable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationsResultsResponse.class, false);
  }

  /**
   * List results for a completed Evaluation.
   * Paginated API which returns the test case results of an evaluation. This should be considered the \&quot;expensive\&quot; operation while GetAsrEvaluationsStatus is \&quot;cheap\&quot;. 
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a nextToken.  (optional, default to 1000)
   * @param status query parameter used to filter evaluation result status.   * &#x60;PASSED&#x60; - filter evaluation result status of &#x60;PASSED&#x60;   * &#x60;FAILED&#x60; - filter evaluation result status of &#x60;FAILED&#x60;  (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationsResultsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationsResultsResponse listASREvaluationsResultsV1(String skillId, String evaluationId, String nextToken, BigDecimal maxResults, String status) throws ServiceException {
    return this.callListASREvaluationsResultsV1(skillId, evaluationId, nextToken, maxResults, status).getResponse();
  }

  /**
   * Get high level information and status of a asr evaluation.
   * API which requests high level information about the evaluation like the current state of the job, status of the evaluation (if complete). Also returns the request used to start the job, like the number of total evaluations, number of completed evaluations, and start time. This should be considered the \&quot;cheap\&quot; operation while GetAsrEvaluationsResults is \&quot;expensive\&quot;. 
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationStatusResponseObject
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationStatusResponseObject> callGetASREvaluationStatusV1(String skillId, String evaluationId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("evaluationId", evaluationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrEvaluations/{evaluationId}/status";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationStatusResponseObject.class, 200, "Evaluation exists and its status is queryable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationStatusResponseObject.class, false);
  }

  /**
   * Get high level information and status of a asr evaluation.
   * API which requests high level information about the evaluation like the current state of the job, status of the evaluation (if complete). Also returns the request used to start the job, like the number of total evaluations, number of completed evaluations, and start time. This should be considered the \&quot;cheap\&quot; operation while GetAsrEvaluationsResults is \&quot;expensive\&quot;. 
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationStatusResponseObject
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.GetAsrEvaluationStatusResponseObject getASREvaluationStatusV1(String skillId, String evaluationId) throws ServiceException {
    return this.callGetASREvaluationStatusV1(skillId, evaluationId).getResponse();
  }

  /**
   * List asr evaluations run for a skill.
   * API that allows developers to get historical ASR evaluations they run before. 
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param locale locale in bcp 47 format. Used to filter results with the specified locale. If omitted, the response would include all evaluations regardless of what locale was used in the evaluation (optional)
   * @param stage Query parameter used to filter evaluations with specified skill stage.   * &#x60;development&#x60; - skill in &#x60;development&#x60; stage   * &#x60;live&#x60; - skill in &#x60;live&#x60; stage  (optional)
   * @param annotationSetId filter to evaluations started using this annotationSetId (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a nextToken.  (optional, default to 1000)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ListAsrEvaluationsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ListAsrEvaluationsResponse> callListASREvaluationsV1(String skillId, String nextToken, String locale, String stage, String annotationSetId, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(locale != null) {
    queryParams.add(new Pair<String, String>("locale", locale));
  }

    if(stage != null) {
    queryParams.add(new Pair<String, String>("stage", stage));
  }

    if(annotationSetId != null) {
    queryParams.add(new Pair<String, String>("annotationSetId", annotationSetId));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrEvaluations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ListAsrEvaluationsResponse.class, 200, "Evaluations are returned."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ListAsrEvaluationsResponse.class, false);
  }

  /**
   * List asr evaluations run for a skill.
   * API that allows developers to get historical ASR evaluations they run before. 
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param locale locale in bcp 47 format. Used to filter results with the specified locale. If omitted, the response would include all evaluations regardless of what locale was used in the evaluation (optional)
   * @param stage Query parameter used to filter evaluations with specified skill stage.   * &#x60;development&#x60; - skill in &#x60;development&#x60; stage   * &#x60;live&#x60; - skill in &#x60;live&#x60; stage  (optional)
   * @param annotationSetId filter to evaluations started using this annotationSetId (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a nextToken.  (optional, default to 1000)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ListAsrEvaluationsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.ListAsrEvaluationsResponse listASREvaluationsV1(String skillId, String nextToken, String locale, String stage, String annotationSetId, BigDecimal maxResults) throws ServiceException {
    return this.callListASREvaluationsV1(skillId, nextToken, locale, stage, annotationSetId, maxResults).getResponse();
  }

  /**
   * Start an evaluation against the ASR model built by the skill&#39;s interaction model.
   * This is an asynchronous API that starts an evaluation against the ASR model built by the skill&#39;s interaction model. The operation outputs an evaluationId which allows the retrieval of the current status of the operation and the results upon completion. This operation is unified, meaning both internal and external skill developers may use it to evaluate ASR models. 
   * @param postAsrEvaluationsRequest Payload sent to trigger evaluation run. (required)
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsResponseObject
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsResponseObject> callCreateASREvaluationV1(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsRequestObject postAsrEvaluationsRequest, String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/asrEvaluations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsResponseObject.class, 200, "Evaluation has successfully begun."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 0, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, postAsrEvaluationsRequest, com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsResponseObject.class, false);
  }

  /**
   * Start an evaluation against the ASR model built by the skill&#39;s interaction model.
   * This is an asynchronous API that starts an evaluation against the ASR model built by the skill&#39;s interaction model. The operation outputs an evaluationId which allows the retrieval of the current status of the operation and the results upon completion. This operation is unified, meaning both internal and external skill developers may use it to evaluate ASR models. 
   * @param postAsrEvaluationsRequest Payload sent to trigger evaluation run. (required)
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsResponseObject
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsResponseObject createASREvaluationV1(com.amazon.ask.smapi.model.v1.skill.asr.evaluations.PostAsrEvaluationsRequestObject postAsrEvaluationsRequest, String skillId) throws ServiceException {
    return this.callCreateASREvaluationV1(postAsrEvaluationsRequest, skillId).getResponse();
  }

  /**
   * End beta test.
   * End a beta test for a given Alexa skill. System will revoke the entitlement of each tester and send access-end notification email to them. 
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callEndBetaTestV1(String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest/end";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Accept. Return a URL to track the resource in 'Location' header."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * End beta test.
   * End a beta test for a given Alexa skill. System will revoke the entitlement of each tester and send access-end notification email to them. 
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public void endBetaTestV1(String skillId) throws ServiceException {
    this.callEndBetaTestV1(skillId).getResponse();
  }

  /**
   * Get beta test.
   * Get beta test for a given Alexa skill.
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.betaTest.BetaTest
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.betaTest.BetaTest> callGetBetaTestV1(String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.betaTest.BetaTest.class, 200, "Success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.betaTest.BetaTest.class, false);
  }

  /**
   * Get beta test.
   * Get beta test for a given Alexa skill.
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.betaTest.BetaTest
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.betaTest.BetaTest getBetaTestV1(String skillId) throws ServiceException {
    return this.callGetBetaTestV1(skillId).getResponse();
  }

  /**
   * Create beta test.
   * Create a beta test for a given Alexa skill.
   * @param skillId The skill ID. (required)
   * @param createTestBody JSON object containing the details of a beta test used to create the test. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCreateBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.TestBody createTestBody) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. Return a URL to track the resource in 'Location' header."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createTestBody, null, false);
  }

  /**
   * Create beta test.
   * Create a beta test for a given Alexa skill.
   * @param skillId The skill ID. (required)
   * @param createTestBody JSON object containing the details of a beta test used to create the test. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void createBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.TestBody createTestBody) throws ServiceException {
    this.callCreateBetaTestV1(skillId, createTestBody).getResponse();
  }

  /**
   * Update beta test.
   * Update a beta test for a given Alexa skill.
   * @param skillId The skill ID. (required)
   * @param createTestBody JSON object containing the details of a beta test used to create the test. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdateBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.TestBody createTestBody) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createTestBody, null, false);
  }

  /**
   * Update beta test.
   * Update a beta test for a given Alexa skill.
   * @param skillId The skill ID. (required)
   * @param createTestBody JSON object containing the details of a beta test used to create the test. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void updateBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.TestBody createTestBody) throws ServiceException {
    this.callUpdateBetaTestV1(skillId, createTestBody).getResponse();
  }

  /**
   * Start beta test
   * Start a beta test for a given Alexa skill. System will send invitation emails to each tester in the test, and add entitlement on the acceptance. 
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callStartBetaTestV1(String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest/start";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Accept. Return a URL to track the resource in 'Location' header."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * Start beta test
   * Start a beta test for a given Alexa skill. System will send invitation emails to each tester in the test, and add entitlement on the acceptance. 
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public void startBetaTestV1(String skillId) throws ServiceException {
    this.callStartBetaTestV1(skillId).getResponse();
  }

  /**
   * Add testers to an existing beta test.
   * Add testers to a beta test for the given Alexa skill.  System will send invitation email to each tester and add entitlement on the acceptance. 
   * @param skillId The skill ID. (required)
   * @param testersRequest JSON object containing the email address of beta testers. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callAddTestersToBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest/testers/add";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, testersRequest, null, false);
  }

  /**
   * Add testers to an existing beta test.
   * Add testers to a beta test for the given Alexa skill.  System will send invitation email to each tester and add entitlement on the acceptance. 
   * @param skillId The skill ID. (required)
   * @param testersRequest JSON object containing the email address of beta testers. (required)
   * @throws ServiceException if fails to make API call
   */
  public void addTestersToBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException {
    this.callAddTestersToBetaTestV1(skillId, testersRequest).getResponse();
  }

  /**
   * List testers.
   * List all testers in a beta test for the given Alexa skill.
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.betaTest.testers.ListTestersResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.ListTestersResponse> callGetListOfTestersV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest/testers";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.betaTest.testers.ListTestersResponse.class, 200, "Success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.ListTestersResponse.class, false);
  }

  /**
   * List testers.
   * List all testers in a beta test for the given Alexa skill.
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.betaTest.testers.ListTestersResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.betaTest.testers.ListTestersResponse getListOfTestersV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callGetListOfTestersV1(skillId, nextToken, maxResults).getResponse();
  }

  /**
   * Remove testers from an existing beta test.
   * Remove testers from a beta test for the given Alexa skill.  System will send access end email to each tester and remove entitlement for them. 
   * @param skillId The skill ID. (required)
   * @param testersRequest JSON object containing the email address of beta testers. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callRemoveTestersFromBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest/testers/remove";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, testersRequest, null, false);
  }

  /**
   * Remove testers from an existing beta test.
   * Remove testers from a beta test for the given Alexa skill.  System will send access end email to each tester and remove entitlement for them. 
   * @param skillId The skill ID. (required)
   * @param testersRequest JSON object containing the email address of beta testers. (required)
   * @throws ServiceException if fails to make API call
   */
  public void removeTestersFromBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException {
    this.callRemoveTestersFromBetaTestV1(skillId, testersRequest).getResponse();
  }

  /**
   * Request feedback from testers.
   * Request feedback from the testers in a beta test for the given Alexa skill.  System will send notification emails to testers to request feedback. 
   * @param skillId The skill ID. (required)
   * @param testersRequest JSON object containing the email address of beta testers. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callRequestFeedbackFromTestersV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest/testers/requestFeedback";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, testersRequest, null, false);
  }

  /**
   * Request feedback from testers.
   * Request feedback from the testers in a beta test for the given Alexa skill.  System will send notification emails to testers to request feedback. 
   * @param skillId The skill ID. (required)
   * @param testersRequest JSON object containing the email address of beta testers. (required)
   * @throws ServiceException if fails to make API call
   */
  public void requestFeedbackFromTestersV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException {
    this.callRequestFeedbackFromTestersV1(skillId, testersRequest).getResponse();
  }

  /**
   * Send reminder to testers in a beta test.
   * Send reminder to the testers in a beta test for the given Alexa skill.  System will send invitation email to each tester and add entitlement on the acceptance. 
   * @param skillId The skill ID. (required)
   * @param testersRequest JSON object containing the email address of beta testers. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSendReminderToTestersV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/betaTest/testers/sendReminder";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, testersRequest, null, false);
  }

  /**
   * Send reminder to testers in a beta test.
   * Send reminder to the testers in a beta test for the given Alexa skill.  System will send invitation email to each tester and add entitlement on the acceptance. 
   * @param skillId The skill ID. (required)
   * @param testersRequest JSON object containing the email address of beta testers. (required)
   * @throws ServiceException if fails to make API call
   */
  public void sendReminderToTestersV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException {
    this.callSendReminderToTestersV1(skillId, testersRequest).getResponse();
  }

  /**
   * 
   * Gets a specific certification resource. The response contains the review tracking information for a skill to show how much time the skill is expected to remain under review by Amazon. Once the review is complete, the response also contains the outcome of the review. Old certifications may not be available, however any ongoing certification would always give a response. If the certification is unavailable the result will return a 404 HTTP status code. 
   * @param skillId The skill ID. (required)
   * @param certificationId Id of the certification. Reserved word identifier of mostRecent can be used to get the most recent certification for the skill. Note that the behavior of the API in this case would be the same as when the actual certification id of the most recent certification is used in the request.  (required)
   * @param acceptLanguage User&#39;s locale/language in context. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.certification.CertificationResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.certification.CertificationResponse> callGetCertificationReviewV1(String skillId, String certificationId, String acceptLanguage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("certificationId", certificationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (acceptLanguage != null) {
      headerParams.add(new Pair<String, String>("Accept-Language", acceptLanguage));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/certifications/{certificationId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.certification.CertificationResponse.class, 200, "Successfully retrieved skill certification information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceeded the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.certification.CertificationResponse.class, false);
  }

  /**
   * 
   * Gets a specific certification resource. The response contains the review tracking information for a skill to show how much time the skill is expected to remain under review by Amazon. Once the review is complete, the response also contains the outcome of the review. Old certifications may not be available, however any ongoing certification would always give a response. If the certification is unavailable the result will return a 404 HTTP status code. 
   * @param skillId The skill ID. (required)
   * @param certificationId Id of the certification. Reserved word identifier of mostRecent can be used to get the most recent certification for the skill. Note that the behavior of the API in this case would be the same as when the actual certification id of the most recent certification is used in the request.  (required)
   * @param acceptLanguage User&#39;s locale/language in context. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.certification.CertificationResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.certification.CertificationResponse getCertificationReviewV1(String skillId, String certificationId, String acceptLanguage) throws ServiceException {
    return this.callGetCertificationReviewV1(skillId, certificationId, acceptLanguage).getResponse();
  }

  /**
   * 
   * Get list of all certifications available for a skill, including information about past certifications and any ongoing certification. The default sort order is descending on skillSubmissionTimestamp for Certifications. 
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.certification.ListCertificationsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.certification.ListCertificationsResponse> callGetCertificationsListV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/certifications";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.certification.ListCertificationsResponse.class, 200, "Returns list of certifications for the skillId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. if any request parameter is invalid like certification Id or pagination token etc. If the maxResults is not in the range of 1 to 50, it also qualifies for this error. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceeded the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.certification.ListCertificationsResponse.class, false);
  }

  /**
   * 
   * Get list of all certifications available for a skill, including information about past certifications and any ongoing certification. The default sort order is descending on skillSubmissionTimestamp for Certifications. 
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.certification.ListCertificationsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.certification.ListCertificationsResponse getCertificationsListV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callGetCertificationsListV1(skillId, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * Get the client credentials for the skill.
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.SkillCredentials
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.SkillCredentials> callGetSkillCredentialsV1(String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/credentials";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.SkillCredentials.class, 200, "Response contains the skill credentials."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.SkillCredentials.class, false);
  }

  /**
   * 
   * Get the client credentials for the skill.
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.SkillCredentials
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.SkillCredentials getSkillCredentialsV1(String skillId) throws ServiceException {
    return this.callGetSkillCredentialsV1(skillId).getResponse();
  }

  /**
   * 
   * Delete the skill and model for given skillId.
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteSkillV1(String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Delete the skill and model for given skillId.
   * @param skillId The skill ID. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteSkillV1(String skillId) throws ServiceException {
    this.callDeleteSkillV1(skillId).getResponse();
  }

  /**
   * The Intent Request History API provides customers with the aggregated and anonymized transcription of user speech data and intent request details for their skills.
   * 
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @param sortField Sets the field on which the sorting would be applied. (optional)
   * @param stage A filter used to retrieve items where the stage is equal to the given value. (optional)
   * @param locale  (optional)
   * @param dialogActName A filter used to retrieve items where the dialogAct name is equal to the given value. * &#x60;Dialog.ElicitSlot&#x60;: Alexa asked the user for the value of a specific slot. (https://developer.amazon.com/docs/custom-skills/dialog-interface-reference.html#elicitslot) * &#x60;Dialog.ConfirmSlot&#x60;: Alexa confirmed the value of a specific slot before continuing with the dialog. (https://developer.amazon.com/docs/custom-skills/dialog-interface-reference.html#confirmslot) * &#x60;Dialog.ConfirmIntent&#x60;: Alexa confirmed the all the information the user has provided for the intent before the skill took action. (https://developer.amazon.com/docs/custom-skills/dialog-interface-reference.html#confirmintent)  (optional)
   * @param intentConfidenceBin  (optional)
   * @param intentName A filter used to retrieve items where the intent name is equal to the given value. (optional)
   * @param intentSlotsName A filter used to retrieve items where the one of the slot names is equal to the given value. (optional)
   * @param interactionType  (optional)
   * @param publicationStatus  (optional)
   * @param utteranceText A filter used to retrieve items where the utterance text contains the given phrase. Each filter value can be at-least 1 character and at-most 100 characters long. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.history.IntentRequests
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.history.IntentRequests> callGetUtteranceDataV1(String skillId, String nextToken, BigDecimal maxResults, String sortDirection, String sortField, List<com.amazon.ask.smapi.model.v1.StageType> stage, List<com.amazon.ask.smapi.model.v1.skill.history.LocaleInQuery> locale, List<com.amazon.ask.smapi.model.v1.skill.history.DialogActName> dialogActName, List<com.amazon.ask.smapi.model.v1.skill.history.IntentConfidenceBin> intentConfidenceBin, List<String> intentName, List<String> intentSlotsName, List<com.amazon.ask.smapi.model.v1.skill.history.InteractionType> interactionType, List<com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus> publicationStatus, List<String> utteranceText) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(sortDirection != null) {
    queryParams.add(new Pair<String, String>("sortDirection", sortDirection));
  }

    if(sortField != null) {
    queryParams.add(new Pair<String, String>("sortField", sortField));
  }

    if(stage != null) {
    for (Object param : stage) {
      queryParams.add(new Pair<String, String>("stage", param.toString()));
    }
  }

    if(locale != null) {
    for (Object param : locale) {
      queryParams.add(new Pair<String, String>("locale", param.toString()));
    }
  }

    if(dialogActName != null) {
    for (Object param : dialogActName) {
      queryParams.add(new Pair<String, String>("dialogAct.name", param.toString()));
    }
  }

    if(intentConfidenceBin != null) {
    for (Object param : intentConfidenceBin) {
      queryParams.add(new Pair<String, String>("intent.confidence.bin", param.toString()));
    }
  }

    if(intentName != null) {
    for (Object param : intentName) {
      queryParams.add(new Pair<String, String>("intent.name", param.toString()));
    }
  }

    if(intentSlotsName != null) {
    for (Object param : intentSlotsName) {
      queryParams.add(new Pair<String, String>("intent.slots.name", param.toString()));
    }
  }

    if(interactionType != null) {
    for (Object param : interactionType) {
      queryParams.add(new Pair<String, String>("interactionType", param.toString()));
    }
  }

    if(publicationStatus != null) {
    for (Object param : publicationStatus) {
      queryParams.add(new Pair<String, String>("publicationStatus", param.toString()));
    }
  }

    if(utteranceText != null) {
    for (Object param : utteranceText) {
      queryParams.add(new Pair<String, String>("utteranceText", param.toString()));
    }
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/history/intentRequests";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.history.IntentRequests.class, 200, "Returns a list of utterance items for the given skill."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad Request."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "Unauthorized."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "Skill Not Found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.history.IntentRequests.class, false);
  }

  /**
   * The Intent Request History API provides customers with the aggregated and anonymized transcription of user speech data and intent request details for their skills.
   * 
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @param sortField Sets the field on which the sorting would be applied. (optional)
   * @param stage A filter used to retrieve items where the stage is equal to the given value. (optional)
   * @param locale  (optional)
   * @param dialogActName A filter used to retrieve items where the dialogAct name is equal to the given value. * &#x60;Dialog.ElicitSlot&#x60;: Alexa asked the user for the value of a specific slot. (https://developer.amazon.com/docs/custom-skills/dialog-interface-reference.html#elicitslot) * &#x60;Dialog.ConfirmSlot&#x60;: Alexa confirmed the value of a specific slot before continuing with the dialog. (https://developer.amazon.com/docs/custom-skills/dialog-interface-reference.html#confirmslot) * &#x60;Dialog.ConfirmIntent&#x60;: Alexa confirmed the all the information the user has provided for the intent before the skill took action. (https://developer.amazon.com/docs/custom-skills/dialog-interface-reference.html#confirmintent)  (optional)
   * @param intentConfidenceBin  (optional)
   * @param intentName A filter used to retrieve items where the intent name is equal to the given value. (optional)
   * @param intentSlotsName A filter used to retrieve items where the one of the slot names is equal to the given value. (optional)
   * @param interactionType  (optional)
   * @param publicationStatus  (optional)
   * @param utteranceText A filter used to retrieve items where the utterance text contains the given phrase. Each filter value can be at-least 1 character and at-most 100 characters long. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.history.IntentRequests
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.history.IntentRequests getUtteranceDataV1(String skillId, String nextToken, BigDecimal maxResults, String sortDirection, String sortField, List<com.amazon.ask.smapi.model.v1.StageType> stage, List<com.amazon.ask.smapi.model.v1.skill.history.LocaleInQuery> locale, List<com.amazon.ask.smapi.model.v1.skill.history.DialogActName> dialogActName, List<com.amazon.ask.smapi.model.v1.skill.history.IntentConfidenceBin> intentConfidenceBin, List<String> intentName, List<String> intentSlotsName, List<com.amazon.ask.smapi.model.v1.skill.history.InteractionType> interactionType, List<com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus> publicationStatus, List<String> utteranceText) throws ServiceException {
    return this.callGetUtteranceDataV1(skillId, nextToken, maxResults, sortDirection, sortField, stage, locale, dialogActName, intentConfidenceBin, intentName, intentSlotsName, interactionType, publicationStatus, utteranceText).getResponse();
  }

  /**
   * 
   * Creates a new import for a skill with given skillId. 
   * @param updateSkillWithPackageRequest Defines the request body for updatePackage API. (required)
   * @param skillId The skill ID. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callImportSkillPackageV1(com.amazon.ask.smapi.model.v1.skill.UpdateSkillWithPackageRequest updateSkillWithPackageRequest, String skillId, String ifMatch) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (ifMatch != null) {
      headerParams.add(new Pair<String, String>("If-Match", ifMatch));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/imports";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Accepted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 413, "Payload too large."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateSkillWithPackageRequest, null, false);
  }

  /**
   * 
   * Creates a new import for a skill with given skillId. 
   * @param updateSkillWithPackageRequest Defines the request body for updatePackage API. (required)
   * @param skillId The skill ID. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void importSkillPackageV1(com.amazon.ask.smapi.model.v1.skill.UpdateSkillWithPackageRequest updateSkillWithPackageRequest, String skillId, String ifMatch) throws ServiceException {
    this.callImportSkillPackageV1(updateSkillWithPackageRequest, skillId, ifMatch).getResponse();
  }

  /**
   * 
   * This is a synchronous API that invokes the Lambda or third party HTTPS endpoint for a given skill. A successful response will contain information related to what endpoint was called, payload sent to and received from the endpoint. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. In cases where invoking the skill endpoint specifically fails, the response will contain a status attribute indicating that a failure occurred and details about what was sent to the endpoint. The skill must belong to and be enabled by the user of this API. Also, note that calls to the skill endpoint will timeout after 10 seconds. 
   * @param skillId The skill ID. (required)
   * @param invokeSkillRequest Payload sent to the skill invocation API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.invocations.InvokeSkillResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.invocations.InvokeSkillResponse> callInvokeSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.invocations.InvokeSkillRequest invokeSkillRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/invocations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.invocations.InvokeSkillResponse.class, 200, "Skill was invoked."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request due to invalid or missing data."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "API user does not have permission to call this API or is currently in a state that does not allow invocation of this skill. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified skill does not exist."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "API user has exceeded the permitted request rate."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, invokeSkillRequest, com.amazon.ask.smapi.model.v1.skill.invocations.InvokeSkillResponse.class, false);
  }

  /**
   * 
   * This is a synchronous API that invokes the Lambda or third party HTTPS endpoint for a given skill. A successful response will contain information related to what endpoint was called, payload sent to and received from the endpoint. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. In cases where invoking the skill endpoint specifically fails, the response will contain a status attribute indicating that a failure occurred and details about what was sent to the endpoint. The skill must belong to and be enabled by the user of this API. Also, note that calls to the skill endpoint will timeout after 10 seconds. 
   * @param skillId The skill ID. (required)
   * @param invokeSkillRequest Payload sent to the skill invocation API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.invocations.InvokeSkillResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.invocations.InvokeSkillResponse invokeSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.invocations.InvokeSkillRequest invokeSkillRequest) throws ServiceException {
    return this.callInvokeSkillV1(skillId, invokeSkillRequest).getResponse();
  }

  /**
   * 
   * Get analytic metrics report of skill usage.
   * @param skillId The skill ID. (required)
   * @param startTime The start time of query. (required)
   * @param endTime The end time of query (The maximum time duration is 1 week) (required)
   * @param period The aggregation period to use when retrieving the metric, follows ISO_8601#Durations format. (required)
   * @param metric A distinct set of logic which predictably returns a set of data. (required)
   * @param stage The stage of the skill (live, development). (required)
   * @param skillType The type of the skill (custom, smartHome and flashBriefing). (required)
   * @param intent The intent of the skill. (optional)
   * @param locale The locale for the skill. e.g. en-GB, en-US, de-DE and etc. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.metrics.GetMetricDataResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.metrics.GetMetricDataResponse> callGetSkillMetricsV1(String skillId, OffsetDateTime startTime, OffsetDateTime endTime, String period, String metric, String stage, String skillType, String intent, String locale, BigDecimal maxResults, String nextToken) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(startTime != null) {
    queryParams.add(new Pair<String, String>("startTime", startTime.toString()));
  }

    if(endTime != null) {
    queryParams.add(new Pair<String, String>("endTime", endTime.toString()));
  }

    if(period != null) {
    queryParams.add(new Pair<String, String>("period", period));
  }

    if(metric != null) {
    queryParams.add(new Pair<String, String>("metric", metric));
  }

    if(stage != null) {
    queryParams.add(new Pair<String, String>("stage", stage));
  }

    if(skillType != null) {
    queryParams.add(new Pair<String, String>("skillType", skillType));
  }

    if(intent != null) {
    queryParams.add(new Pair<String, String>("intent", intent));
  }

    if(locale != null) {
    queryParams.add(new Pair<String, String>("locale", locale));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/metrics";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.metrics.GetMetricDataResponse.class, 200, "Get analytic metrics report successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request due to invalid or missing data."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.metrics.GetMetricDataResponse.class, false);
  }

  /**
   * 
   * Get analytic metrics report of skill usage.
   * @param skillId The skill ID. (required)
   * @param startTime The start time of query. (required)
   * @param endTime The end time of query (The maximum time duration is 1 week) (required)
   * @param period The aggregation period to use when retrieving the metric, follows ISO_8601#Durations format. (required)
   * @param metric A distinct set of logic which predictably returns a set of data. (required)
   * @param stage The stage of the skill (live, development). (required)
   * @param skillType The type of the skill (custom, smartHome and flashBriefing). (required)
   * @param intent The intent of the skill. (optional)
   * @param locale The locale for the skill. e.g. en-GB, en-US, de-DE and etc. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.metrics.GetMetricDataResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.metrics.GetMetricDataResponse getSkillMetricsV1(String skillId, OffsetDateTime startTime, OffsetDateTime endTime, String period, String metric, String stage, String skillType, String intent, String locale, BigDecimal maxResults, String nextToken) throws ServiceException {
    return this.callGetSkillMetricsV1(skillId, startTime, endTime, period, metric, stage, skillType, intent, locale, maxResults, nextToken).getResponse();
  }

  /**
   * Get the annotations of an NLU annotation set
   * 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @param accept Standard HTTP. Pass &#x60;application/json&#x60; or &#x60;test/csv&#x60; for GET calls.  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callGetAnnotationsForNLUAnnotationSetsV1(String skillId, String annotationId, String accept) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationId", annotationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (accept != null) {
      headerParams.add(new Pair<String, String>("Accept", accept));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluAnnotationSets/{annotationId}/annotations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "The specific version of a NLU annotation set has the content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * Get the annotations of an NLU annotation set
   * 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @param accept Standard HTTP. Pass &#x60;application/json&#x60; or &#x60;test/csv&#x60; for GET calls.  (required)
   * @throws ServiceException if fails to make API call
   */
  public void getAnnotationsForNLUAnnotationSetsV1(String skillId, String annotationId, String accept) throws ServiceException {
    this.callGetAnnotationsForNLUAnnotationSetsV1(skillId, annotationId, accept).getResponse();
  }

  /**
   * Replace the annotations in NLU annotation set.
   * API which replaces the annotations in NLU annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @param contentType Standard HTTP. Pass &#x60;application/json&#x60; or &#x60;test/csv&#x60; for POST calls with a json/csv body.  (required)
   * @param updateNLUAnnotationSetAnnotationsRequest Payload sent to the update NLU annotation set API. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdateAnnotationsForNLUAnnotationSetsV1(String skillId, String annotationId, String contentType, com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.UpdateNLUAnnotationSetAnnotationsRequest updateNLUAnnotationSetAnnotationsRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationId", annotationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (contentType != null) {
      headerParams.add(new Pair<String, String>("Content-Type", contentType));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluAnnotationSets/{annotationId}/annotations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "NLU annotation set exists and starts the update."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateNLUAnnotationSetAnnotationsRequest, null, false);
  }

  /**
   * Replace the annotations in NLU annotation set.
   * API which replaces the annotations in NLU annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @param contentType Standard HTTP. Pass &#x60;application/json&#x60; or &#x60;test/csv&#x60; for POST calls with a json/csv body.  (required)
   * @param updateNLUAnnotationSetAnnotationsRequest Payload sent to the update NLU annotation set API. (required)
   * @throws ServiceException if fails to make API call
   */
  public void updateAnnotationsForNLUAnnotationSetsV1(String skillId, String annotationId, String contentType, com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.UpdateNLUAnnotationSetAnnotationsRequest updateNLUAnnotationSetAnnotationsRequest) throws ServiceException {
    this.callUpdateAnnotationsForNLUAnnotationSetsV1(skillId, annotationId, contentType, updateNLUAnnotationSetAnnotationsRequest).getResponse();
  }

  /**
   * Delete the NLU annotation set
   * API which deletes the NLU annotation set. Developers cannot get/list the deleted annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeletePropertiesForNLUAnnotationSetsV1(String skillId, String annotationId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationId", annotationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluAnnotationSets/{annotationId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "NLU annotation set exists and is deleted successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * Delete the NLU annotation set
   * API which deletes the NLU annotation set. Developers cannot get/list the deleted annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deletePropertiesForNLUAnnotationSetsV1(String skillId, String annotationId) throws ServiceException {
    this.callDeletePropertiesForNLUAnnotationSetsV1(skillId, annotationId).getResponse();
  }

  /**
   * Get the properties of an NLU annotation set
   * Return the properties for an NLU annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.GetNLUAnnotationSetPropertiesResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.GetNLUAnnotationSetPropertiesResponse> callGetPropertiesForNLUAnnotationSetsV1(String skillId, String annotationId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationId", annotationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluAnnotationSets/{annotationId}/properties";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.GetNLUAnnotationSetPropertiesResponse.class, 200, "The NLU annotation set exists."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.GetNLUAnnotationSetPropertiesResponse.class, false);
  }

  /**
   * Get the properties of an NLU annotation set
   * Return the properties for an NLU annotation set. 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.GetNLUAnnotationSetPropertiesResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.GetNLUAnnotationSetPropertiesResponse getPropertiesForNLUAnnotationSetsV1(String skillId, String annotationId) throws ServiceException {
    return this.callGetPropertiesForNLUAnnotationSetsV1(skillId, annotationId).getResponse();
  }

  /**
   * update the NLU annotation set properties.
   * API which updates the NLU annotation set properties. Currently, the only data can be updated is annotation set name. 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @param updateNLUAnnotationSetPropertiesRequest Payload sent to the update NLU annotation set properties API. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdatePropertiesForNLUAnnotationSetsV1(String skillId, String annotationId, com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.UpdateNLUAnnotationSetPropertiesRequest updateNLUAnnotationSetPropertiesRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("annotationId", annotationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluAnnotationSets/{annotationId}/properties";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 201, "NLU annotation set exists and properties are updated successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateNLUAnnotationSetPropertiesRequest, null, false);
  }

  /**
   * update the NLU annotation set properties.
   * API which updates the NLU annotation set properties. Currently, the only data can be updated is annotation set name. 
   * @param skillId The skill ID. (required)
   * @param annotationId Identifier of the NLU annotation set. (required)
   * @param updateNLUAnnotationSetPropertiesRequest Payload sent to the update NLU annotation set properties API. (required)
   * @throws ServiceException if fails to make API call
   */
  public void updatePropertiesForNLUAnnotationSetsV1(String skillId, String annotationId, com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.UpdateNLUAnnotationSetPropertiesRequest updateNLUAnnotationSetPropertiesRequest) throws ServiceException {
    this.callUpdatePropertiesForNLUAnnotationSetsV1(skillId, annotationId, updateNLUAnnotationSetPropertiesRequest).getResponse();
  }

  /**
   * List NLU annotation sets for a given skill.
   * API which requests all the NLU annotation sets for a skill. Returns the annotationId and properties for each NLU annotation set. Developers can filter the results using locale. Supports paging of results. 
   * @param skillId The skill ID. (required)
   * @param locale filter to NLU annotation set created using this locale (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 10. If more results are present, the response will contain a nextToken and a _link.next href.  (optional, default to 10)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.ListNLUAnnotationSetsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.ListNLUAnnotationSetsResponse> callListNLUAnnotationSetsV1(String skillId, String locale, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(locale != null) {
    queryParams.add(new Pair<String, String>("locale", locale));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluAnnotationSets";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.ListNLUAnnotationSetsResponse.class, 200, "NLU annotation sets are returned."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.ListNLUAnnotationSetsResponse.class, false);
  }

  /**
   * List NLU annotation sets for a given skill.
   * API which requests all the NLU annotation sets for a skill. Returns the annotationId and properties for each NLU annotation set. Developers can filter the results using locale. Supports paging of results. 
   * @param skillId The skill ID. (required)
   * @param locale filter to NLU annotation set created using this locale (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 10. If more results are present, the response will contain a nextToken and a _link.next href.  (optional, default to 10)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.ListNLUAnnotationSetsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.ListNLUAnnotationSetsResponse listNLUAnnotationSetsV1(String skillId, String locale, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callListNLUAnnotationSetsV1(skillId, locale, nextToken, maxResults).getResponse();
  }

  /**
   * Create a new NLU annotation set for a skill which will generate a new annotationId.
   * This is an API that creates a new NLU annotation set with properties and returns the annotationId. 
   * @param skillId The skill ID. (required)
   * @param createNLUAnnotationSetRequest Payload sent to the create NLU annotation set API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.CreateNLUAnnotationSetResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.CreateNLUAnnotationSetResponse> callCreateNLUAnnotationSetV1(String skillId, com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.CreateNLUAnnotationSetRequest createNLUAnnotationSetRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluAnnotationSets";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.CreateNLUAnnotationSetResponse.class, 201, "NLU annotation set created successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createNLUAnnotationSetRequest, com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.CreateNLUAnnotationSetResponse.class, false);
  }

  /**
   * Create a new NLU annotation set for a skill which will generate a new annotationId.
   * This is an API that creates a new NLU annotation set with properties and returns the annotationId. 
   * @param skillId The skill ID. (required)
   * @param createNLUAnnotationSetRequest Payload sent to the create NLU annotation set API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.CreateNLUAnnotationSetResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.CreateNLUAnnotationSetResponse createNLUAnnotationSetV1(String skillId, com.amazon.ask.smapi.model.v1.skill.nlu.annotationSets.CreateNLUAnnotationSetRequest createNLUAnnotationSetRequest) throws ServiceException {
    return this.callCreateNLUAnnotationSetV1(skillId, createNLUAnnotationSetRequest).getResponse();
  }

  /**
   * Get top level information and status of a nlu evaluation.
   * API which requests top level information about the evaluation like the current state of the job, status of the evaluation (if complete). Also returns data used to start the job, like the number of test cases, stage, locale, and start time. This should be considered the &#39;cheap&#39; operation while getResultForNLUEvaluations is &#39;expensive&#39;. 
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResponse> callGetNLUEvaluationV1(String skillId, String evaluationId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("evaluationId", evaluationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluEvaluations/{evaluationId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResponse.class, 200, "Evaluation exists and its status is queryable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResponse.class, false);
  }

  /**
   * Get top level information and status of a nlu evaluation.
   * API which requests top level information about the evaluation like the current state of the job, status of the evaluation (if complete). Also returns data used to start the job, like the number of test cases, stage, locale, and start time. This should be considered the &#39;cheap&#39; operation while getResultForNLUEvaluations is &#39;expensive&#39;. 
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResponse getNLUEvaluationV1(String skillId, String evaluationId) throws ServiceException {
    return this.callGetNLUEvaluationV1(skillId, evaluationId).getResponse();
  }

  /**
   * Get test case results for a completed Evaluation.
   * Paginated API which returns the test case results of an evaluation. This should be considered the &#39;expensive&#39; operation while getNluEvaluation is &#39;cheap&#39;. 
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @param sortField  (optional)
   * @param testCaseStatus only returns test cases with this status (optional)
   * @param actualIntentName only returns test cases with intents which resolve to this intent (optional)
   * @param expectedIntentName only returns test cases with intents which are expected to be this intent (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a nextToken and a _link.next href.  (optional, default to 1000)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResultsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResultsResponse> callGetResultForNLUEvaluationsV1(String skillId, String evaluationId, String sortField, String testCaseStatus, String actualIntentName, String expectedIntentName, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(sortField != null) {
    queryParams.add(new Pair<String, String>("sort.field", sortField));
  }

    if(testCaseStatus != null) {
    queryParams.add(new Pair<String, String>("testCaseStatus", testCaseStatus));
  }

    if(actualIntentName != null) {
    queryParams.add(new Pair<String, String>("actualIntentName", actualIntentName));
  }

    if(expectedIntentName != null) {
    queryParams.add(new Pair<String, String>("expectedIntentName", expectedIntentName));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("evaluationId", evaluationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluEvaluations/{evaluationId}/results";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResultsResponse.class, 200, "Evaluation exists and its status is queryable."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResultsResponse.class, false);
  }

  /**
   * Get test case results for a completed Evaluation.
   * Paginated API which returns the test case results of an evaluation. This should be considered the &#39;expensive&#39; operation while getNluEvaluation is &#39;cheap&#39;. 
   * @param skillId The skill ID. (required)
   * @param evaluationId Identifier of the evaluation. (required)
   * @param sortField  (optional)
   * @param testCaseStatus only returns test cases with this status (optional)
   * @param actualIntentName only returns test cases with intents which resolve to this intent (optional)
   * @param expectedIntentName only returns test cases with intents which are expected to be this intent (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 1000. If more results are present, the response will contain a nextToken and a _link.next href.  (optional, default to 1000)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResultsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.GetNLUEvaluationResultsResponse getResultForNLUEvaluationsV1(String skillId, String evaluationId, String sortField, String testCaseStatus, String actualIntentName, String expectedIntentName, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callGetResultForNLUEvaluationsV1(skillId, evaluationId, sortField, testCaseStatus, actualIntentName, expectedIntentName, nextToken, maxResults).getResponse();
  }

  /**
   * List nlu evaluations run for a skill.
   * API which requests recently run nlu evaluations started by a vendor for a skill. Returns the evaluation id and some of the parameters used to start the evaluation. Developers can filter the results using locale and stage. Supports paging of results. 
   * @param skillId The skill ID. (required)
   * @param locale filter to evaluations started using this locale (optional)
   * @param stage filter to evaluations started using this stage (optional)
   * @param annotationId filter to evaluations started using this annotationId (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 10. If more results are present, the response will contain a nextToken and a _link.next href.  (optional, default to 10)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ListNLUEvaluationsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ListNLUEvaluationsResponse> callListNLUEvaluationsV1(String skillId, String locale, String stage, String annotationId, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(locale != null) {
    queryParams.add(new Pair<String, String>("locale", locale));
  }

    if(stage != null) {
    queryParams.add(new Pair<String, String>("stage", stage));
  }

    if(annotationId != null) {
    queryParams.add(new Pair<String, String>("annotationId", annotationId));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluEvaluations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ListNLUEvaluationsResponse.class, 200, "Evaluations are returned."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ListNLUEvaluationsResponse.class, false);
  }

  /**
   * List nlu evaluations run for a skill.
   * API which requests recently run nlu evaluations started by a vendor for a skill. Returns the evaluation id and some of the parameters used to start the evaluation. Developers can filter the results using locale and stage. Supports paging of results. 
   * @param skillId The skill ID. (required)
   * @param locale filter to evaluations started using this locale (optional)
   * @param stage filter to evaluations started using this stage (optional)
   * @param annotationId filter to evaluations started using this annotationId (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 10. If more results are present, the response will contain a nextToken and a _link.next href.  (optional, default to 10)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ListNLUEvaluationsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ListNLUEvaluationsResponse listNLUEvaluationsV1(String skillId, String locale, String stage, String annotationId, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callListNLUEvaluationsV1(skillId, locale, stage, annotationId, nextToken, maxResults).getResponse();
  }

  /**
   * Start an evaluation against the NLU model built by the skill&#39;s interaction model.
   * This is an asynchronous API that starts an evaluation against the NLU model built by the skill&#39;s interaction model. The operation outputs an evaluationId which allows the retrieval of the current status of the operation and the results upon completion. This operation is unified, meaning both internal and external skill developers may use it evaluate NLU models. 
   * @param evaluateNLURequest Payload sent to the evaluate NLU API. (required)
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluateResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluateResponse> callCreateNLUEvaluationsV1(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluateNLURequest evaluateNLURequest, String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/nluEvaluations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluateResponse.class, 200, "Evaluation has successfully begun."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, evaluateNLURequest, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluateResponse.class, false);
  }

  /**
   * Start an evaluation against the NLU model built by the skill&#39;s interaction model.
   * This is an asynchronous API that starts an evaluation against the NLU model built by the skill&#39;s interaction model. The operation outputs an evaluationId which allows the retrieval of the current status of the operation and the results upon completion. This operation is unified, meaning both internal and external skill developers may use it evaluate NLU models. 
   * @param evaluateNLURequest Payload sent to the evaluate NLU API. (required)
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluateResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluateResponse createNLUEvaluationsV1(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.EvaluateNLURequest evaluateNLURequest, String skillId) throws ServiceException {
    return this.callCreateNLUEvaluationsV1(evaluateNLURequest, skillId).getResponse();
  }

  /**
   * 
   * If the skill is in certified stage, initiate publishing immediately or set a date at which the skill can publish at. 
   * @param skillId The skill ID. (required)
   * @param acceptLanguage User&#39;s locale/language in context. (required)
   * @param publishSkillRequest Defines the request body for publish skill API. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse> callPublishSkillV1(String skillId, String acceptLanguage, com.amazon.ask.smapi.model.v1.skill.publication.PublishSkillRequest publishSkillRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (acceptLanguage != null) {
      headerParams.add(new Pair<String, String>("Accept-Language", acceptLanguage));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/publications";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse.class, 202, "Successfully processed skill publication request."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, publishSkillRequest, com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse.class, false);
  }

  /**
   * 
   * If the skill is in certified stage, initiate publishing immediately or set a date at which the skill can publish at. 
   * @param skillId The skill ID. (required)
   * @param acceptLanguage User&#39;s locale/language in context. (required)
   * @param publishSkillRequest Defines the request body for publish skill API. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse publishSkillV1(String skillId, String acceptLanguage, com.amazon.ask.smapi.model.v1.skill.publication.PublishSkillRequest publishSkillRequest) throws ServiceException {
    return this.callPublishSkillV1(skillId, acceptLanguage, publishSkillRequest).getResponse();
  }

  /**
   * 
   * Retrieves the latest skill publishing details of the certified stage of the skill. The publishesAtDate and status of skill publishing. 
   * @param skillId The skill ID. (required)
   * @param acceptLanguage User&#39;s locale/language in context. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse> callGetSkillPublicationsV1(String skillId, String acceptLanguage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (acceptLanguage != null) {
      headerParams.add(new Pair<String, String>("Accept-Language", acceptLanguage));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/publications/~latest";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse.class, 200, "Successfully retrieved latest skill publication information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse.class, false);
  }

  /**
   * 
   * Retrieves the latest skill publishing details of the certified stage of the skill. The publishesAtDate and status of skill publishing. 
   * @param skillId The skill ID. (required)
   * @param acceptLanguage User&#39;s locale/language in context. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationResponse getSkillPublicationsV1(String skillId, String acceptLanguage) throws ServiceException {
    return this.callGetSkillPublicationsV1(skillId, acceptLanguage).getResponse();
  }

  /**
   * 
   * Submit a target skill version to rollback to. Only one rollback or publish operation can be outstanding for a given skillId.
   * @param skillId The skill ID. (required)
   * @param createRollbackRequest defines the request body to create a rollback request (required)
   * @return com.amazon.ask.smapi.model.v1.skill.CreateRollbackResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.CreateRollbackResponse> callRollbackSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.CreateRollbackRequest createRollbackRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/rollbacks";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.CreateRollbackResponse.class, 201, "Rollback request created; Returns the generated identifier to track the rollback request and returns a URL to track the status in Location header."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createRollbackRequest, com.amazon.ask.smapi.model.v1.skill.CreateRollbackResponse.class, false);
  }

  /**
   * 
   * Submit a target skill version to rollback to. Only one rollback or publish operation can be outstanding for a given skillId.
   * @param skillId The skill ID. (required)
   * @param createRollbackRequest defines the request body to create a rollback request (required)
   * @return com.amazon.ask.smapi.model.v1.skill.CreateRollbackResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.CreateRollbackResponse rollbackSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.CreateRollbackRequest createRollbackRequest) throws ServiceException {
    return this.callRollbackSkillV1(skillId, createRollbackRequest).getResponse();
  }

  /**
   * 
   * Get the rollback status of a skill given an associated rollbackRequestId. Use ~latest in place of rollbackRequestId to get the latest rollback status.
   * @param skillId The skill ID. (required)
   * @param rollbackRequestId Defines the identifier for a rollback request. If set to ~latest, request returns the status of the latest rollback request. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.RollbackRequestStatus
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.RollbackRequestStatus> callGetRollbackForSkillV1(String skillId, String rollbackRequestId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("rollbackRequestId", rollbackRequestId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/rollbacks/{rollbackRequestId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.RollbackRequestStatus.class, 200, "Returns the rollback status for a given skillId and rollbackRequestId. Returns the latest rollback status if ~latest is used in place of rollbackRequestId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.RollbackRequestStatus.class, false);
  }

  /**
   * 
   * Get the rollback status of a skill given an associated rollbackRequestId. Use ~latest in place of rollbackRequestId to get the latest rollback status.
   * @param skillId The skill ID. (required)
   * @param rollbackRequestId Defines the identifier for a rollback request. If set to ~latest, request returns the status of the latest rollback request. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.RollbackRequestStatus
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.RollbackRequestStatus getRollbackForSkillV1(String skillId, String rollbackRequestId) throws ServiceException {
    return this.callGetRollbackForSkillV1(skillId, rollbackRequestId).getResponse();
  }

  /**
   * Simulate executing a skill with the given id.
   * This is an asynchronous API that simulates a skill execution in the Alexa eco-system given an utterance text of what a customer would say to Alexa. A successful response will contain a header with the location of the simulation resource. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. The skill being simulated must be in development stage, and it must also belong to and be enabled by the user of this API. Concurrent requests per user is currently not supported. 
   * @param skillId The skill ID. (required)
   * @param simulationsApiRequest Payload sent to the skill simulation API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse> callSimulateSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiRequest simulationsApiRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/simulations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse.class, 200, "Skill simulation has successfully began."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request due to invalid or missing data."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "API user does not have permission to call this API or is currently in a state that does not allow simulation of this skill. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The specified skill does not exist."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "This requests conflicts with another one currently being processed. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "API user has exceeded the permitted request rate."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal service error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, simulationsApiRequest, com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse.class, false);
  }

  /**
   * Simulate executing a skill with the given id.
   * This is an asynchronous API that simulates a skill execution in the Alexa eco-system given an utterance text of what a customer would say to Alexa. A successful response will contain a header with the location of the simulation resource. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. The skill being simulated must be in development stage, and it must also belong to and be enabled by the user of this API. Concurrent requests per user is currently not supported. 
   * @param skillId The skill ID. (required)
   * @param simulationsApiRequest Payload sent to the skill simulation API. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse simulateSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiRequest simulationsApiRequest) throws ServiceException {
    return this.callSimulateSkillV1(skillId, simulationsApiRequest).getResponse();
  }

  /**
   * Get the result of a previously executed simulation.
   * This API gets the result of a previously executed simulation. A successful response will contain the status of the executed simulation. If the simulation successfully completed, the response will also contain information related to skill invocation. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. In cases where the simulation failed, the response will contain a status attribute indicating that a failure occurred and details about what was sent to the skill endpoint. Note that simulation results are stored for 10 minutes. A request for an expired simulation result will return a 404 HTTP status code. 
   * @param skillId The skill ID. (required)
   * @param simulationId Id of the simulation. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse> callGetSkillSimulationV1(String skillId, String simulationId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("simulationId", simulationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/simulations/{simulationId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse.class, 200, "Successfully retrieved skill simulation information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "API user does not have permission or is currently in a state that does not allow calls to this API. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The specified skill or simulation does not exist. The error response will contain a description that indicates the specific resource type that was not found. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "API user has exceeded the permitted request rate."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal service error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse.class, false);
  }

  /**
   * Get the result of a previously executed simulation.
   * This API gets the result of a previously executed simulation. A successful response will contain the status of the executed simulation. If the simulation successfully completed, the response will also contain information related to skill invocation. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. In cases where the simulation failed, the response will contain a status attribute indicating that a failure occurred and details about what was sent to the skill endpoint. Note that simulation results are stored for 10 minutes. A request for an expired simulation result will return a 404 HTTP status code. 
   * @param skillId The skill ID. (required)
   * @param simulationId Id of the simulation. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse getSkillSimulationV1(String skillId, String simulationId) throws ServiceException {
    return this.callGetSkillSimulationV1(skillId, simulationId).getResponse();
  }

  /**
   * 
   * Returns the ssl certificate sets currently associated with this skill. Sets consist of one ssl certificate blob associated with a region as well as the default certificate for the skill.
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload> callGetSSLCertificatesV1(String skillId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/sslCertificateSets/~latest";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload.class, 200, "Response contains the latest version of the ssl certificates."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload.class, false);
  }

  /**
   * 
   * Returns the ssl certificate sets currently associated with this skill. Sets consist of one ssl certificate blob associated with a region as well as the default certificate for the skill.
   * @param skillId The skill ID. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload getSSLCertificatesV1(String skillId) throws ServiceException {
    return this.callGetSSLCertificatesV1(skillId).getResponse();
  }

  /**
   * 
   * Updates the ssl certificates associated with this skill.
   * @param skillId The skill ID. (required)
   * @param sslCertificatePayload Defines the input/output of the ssl certificates api for a skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSetSSLCertificatesV1(String skillId, com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload sslCertificatePayload) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/sslCertificateSets/~latest";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Accepted; Request was successful and get will now result in the new values."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, sslCertificatePayload, null, false);
  }

  /**
   * 
   * Updates the ssl certificates associated with this skill.
   * @param skillId The skill ID. (required)
   * @param sslCertificatePayload Defines the input/output of the ssl certificates api for a skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public void setSSLCertificatesV1(String skillId, com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload sslCertificatePayload) throws ServiceException {
    this.callSetSSLCertificatesV1(skillId, sslCertificatePayload).getResponse();
  }

  /**
   * 
   * Deletes the enablement for given skillId/stage and customerId (retrieved from Auth token).
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteSkillEnablementV1(String skillId, String stage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/enablement";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No Content; Confirms that enablement is successfully deleted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Deletes the enablement for given skillId/stage and customerId (retrieved from Auth token).
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteSkillEnablementV1(String skillId, String stage) throws ServiceException {
    this.callDeleteSkillEnablementV1(skillId, stage).getResponse();
  }

  /**
   * 
   * Checks whether an enablement exist for given skillId/stage and customerId (retrieved from Auth token)
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callGetSkillEnablementStatusV1(String skillId, String stage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/enablement";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No Content; Confirms that enablement resource exists for given skillId &amp; stage."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Checks whether an enablement exist for given skillId/stage and customerId (retrieved from Auth token)
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public void getSkillEnablementStatusV1(String skillId, String stage) throws ServiceException {
    this.callGetSkillEnablementStatusV1(skillId, stage).getResponse();
  }

  /**
   * 
   * Creates/Updates the enablement for given skillId/stage and customerId (retrieved from Auth token)
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSetSkillEnablementV1(String skillId, String stage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/enablement";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No Content; Confirms that enablement is successfully created/updated."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Creates/Updates the enablement for given skillId/stage and customerId (retrieved from Auth token)
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public void setSkillEnablementV1(String skillId, String stage) throws ServiceException {
    this.callSetSkillEnablementV1(skillId, stage).getResponse();
  }

  /**
   * 
   * Creates a new export for a skill with given skillId and stage. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCreateExportRequestForSkillV1(String skillId, String stage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/exports";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Accepted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Creates a new export for a skill with given skillId and stage. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public void createExportRequestForSkillV1(String skillId, String stage) throws ServiceException {
    this.callCreateExportRequestForSkillV1(skillId, stage).getResponse();
  }

  /**
   * 
   * Get the list of in-skill products for the skillId.
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse> callGetIspListForSkillIdV1(String skillId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/inSkillProducts";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse.class, 200, "Response contains list of in-skill products for the specified skillId and stage."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request. Returned when a required parameter is not present, badly formatted. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Too many requests received."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse.class, false);
  }

  /**
   * 
   * Get the list of in-skill products for the skillId.
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse getIspListForSkillIdV1(String skillId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callGetIspListForSkillIdV1(skillId, stage, nextToken, maxResults).getResponse();
  }

  /**
   * Profile a test utterance.
   * This is a synchronous API that profiles an utterance against interaction model.
   * @param profileNluRequest Payload sent to the profile nlu API. (required)
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluResponse> callProfileNluV1(com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluRequest profileNluRequest, String skillId, String stage, String locale) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    pathParams.put("locale", locale);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/interactionModel/locales/{locale}/profileNlu";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluResponse.class, 200, "Profiled utterance against interaction model and returned nlu response successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Bad request due to invalid or missing data."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "This requests conflicts with another one currently being processed. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "API user has exceeded the permitted request rate."));
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 500, "Internal service error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, profileNluRequest, com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluResponse.class, false);
  }

  /**
   * Profile a test utterance.
   * This is a synchronous API that profiles an utterance against interaction model.
   * @param profileNluRequest Payload sent to the profile nlu API. (required)
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluResponse profileNluV1(com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluRequest profileNluRequest, String skillId, String stage, String locale) throws ServiceException {
    return this.callProfileNluV1(profileNluRequest, skillId, stage, locale).getResponse();
  }

  /**
   * Retrieve conflict detection job status for skill.
   * This API returns the job status of conflict detection job for a specified interaction model.
   * @param skillId The skill ID. (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param stage Stage of the interaction model. (required)
   * @param version Version of interaction model. Use \&quot;~current\&quot; to get the model of the current version. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictDetectionJobStatusResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictDetectionJobStatusResponse> callGetConflictDetectionJobStatusForInteractionModelV1(String skillId, String locale, String stage, String version) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("locale", locale);
    pathParams.put("stage", stage);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/interactionModel/locales/{locale}/versions/{version}/conflictDetectionJobStatus";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictDetectionJobStatusResponse.class, 200, "Get conflict detection results successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictDetectionJobStatusResponse.class, false);
  }

  /**
   * Retrieve conflict detection job status for skill.
   * This API returns the job status of conflict detection job for a specified interaction model.
   * @param skillId The skill ID. (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param stage Stage of the interaction model. (required)
   * @param version Version of interaction model. Use \&quot;~current\&quot; to get the model of the current version. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictDetectionJobStatusResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictDetectionJobStatusResponse getConflictDetectionJobStatusForInteractionModelV1(String skillId, String locale, String stage, String version) throws ServiceException {
    return this.callGetConflictDetectionJobStatusForInteractionModelV1(skillId, locale, stage, version).getResponse();
  }

  /**
   * Retrieve conflict detection results for a specified interaction model.
   * This is a paginated API that retrieves results of conflict detection job for a specified interaction model.
   * @param skillId The skill ID. (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param stage Stage of the interaction model. (required)
   * @param version Version of interaction model. Use \&quot;~current\&quot; to get the model of the current version. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 100. If more results are present, the response will contain a nextToken and a _link.next href. (optional, default to 100)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponse> callGetConflictsForInteractionModelV1(String skillId, String locale, String stage, String version, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("locale", locale);
    pathParams.put("stage", stage);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/interactionModel/locales/{locale}/versions/{version}/conflicts";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponse.class, 200, "Get conflict detection results sucessfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "There is no catalog defined for the catalogId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponse.class, false);
  }

  /**
   * Retrieve conflict detection results for a specified interaction model.
   * This is a paginated API that retrieves results of conflict detection job for a specified interaction model.
   * @param skillId The skill ID. (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param stage Stage of the interaction model. (required)
   * @param version Version of interaction model. Use \&quot;~current\&quot; to get the model of the current version. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. Defaults to 100. If more results are present, the response will contain a nextToken and a _link.next href. (optional, default to 100)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.conflictDetection.GetConflictsResponse getConflictsForInteractionModelV1(String skillId, String locale, String stage, String version, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callGetConflictsForInteractionModelV1(skillId, locale, stage, version, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * List private distribution accounts. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.Private.ListPrivateDistributionAccountsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.Private.ListPrivateDistributionAccountsResponse> callListPrivateDistributionAccountsV1(String skillId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/privateDistributionAccounts";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.Private.ListPrivateDistributionAccountsResponse.class, 200, "Returns list of private distribution accounts on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.Private.ListPrivateDistributionAccountsResponse.class, false);
  }

  /**
   * 
   * List private distribution accounts. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.Private.ListPrivateDistributionAccountsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.Private.ListPrivateDistributionAccountsResponse listPrivateDistributionAccountsV1(String skillId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callListPrivateDistributionAccountsV1(skillId, stage, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * Remove an id from the private distribution accounts. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param id ARN that a skill can be privately distributed to. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeletePrivateDistributionAccountIdV1(String skillId, String stage, String id) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    pathParams.put("id", id);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/privateDistributionAccounts/{id}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Remove an id from the private distribution accounts. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param id ARN that a skill can be privately distributed to. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deletePrivateDistributionAccountIdV1(String skillId, String stage, String id) throws ServiceException {
    this.callDeletePrivateDistributionAccountIdV1(skillId, stage, id).getResponse();
  }

  /**
   * 
   * Add an id to the private distribution accounts. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param id ARN that a skill can be privately distributed to. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSetPrivateDistributionAccountIdV1(String skillId, String stage, String id) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    pathParams.put("id", id);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/privateDistributionAccounts/{id}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Add an id to the private distribution accounts. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param id ARN that a skill can be privately distributed to. (required)
   * @throws ServiceException if fails to make API call
   */
  public void setPrivateDistributionAccountIdV1(String skillId, String stage, String id) throws ServiceException {
    this.callSetPrivateDistributionAccountIdV1(skillId, stage, id).getResponse();
  }

  /**
   * 
   * Delete AccountLinking information of a skill for the given stage. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteAccountLinkingInfoV1(String skillId, String stageV2) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/accountLinkingClient";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. No content."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified skill/stage/accountLinkingClient doesn't exist."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Delete AccountLinking information of a skill for the given stage. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteAccountLinkingInfoV1(String skillId, String stageV2) throws ServiceException {
    this.callDeleteAccountLinkingInfoV1(skillId, stageV2).getResponse();
  }

  /**
   * 
   * Get AccountLinking information for the skill. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingResponse> callGetAccountLinkingInfoV1(String skillId, String stageV2) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/accountLinkingClient";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingResponse.class, 200, "Returns AccountLinking response of the skill."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingResponse.class, false);
  }

  /**
   * 
   * Get AccountLinking information for the skill. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingResponse getAccountLinkingInfoV1(String skillId, String stageV2) throws ServiceException {
    return this.callGetAccountLinkingInfoV1(skillId, stageV2).getResponse();
  }

  /**
   * 
   * Create AccountLinking information for the skill. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param accountLinkingRequest The fields required to create accountLinking partner. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdateAccountLinkingInfoV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingRequest accountLinkingRequest, String ifMatch) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (ifMatch != null) {
      headerParams.add(new Pair<String, String>("If-Match", ifMatch));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/accountLinkingClient";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. Authorization Url is invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 412, "Precondition failed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, accountLinkingRequest, null, false);
  }

  /**
   * 
   * Create AccountLinking information for the skill. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param accountLinkingRequest The fields required to create accountLinking partner. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void updateAccountLinkingInfoV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingRequest accountLinkingRequest, String ifMatch) throws ServiceException {
    this.callUpdateAccountLinkingInfoV1(skillId, stageV2, accountLinkingRequest, ifMatch).getResponse();
  }

  /**
   * 
   * Creates a new clone locale workflow for a skill with given skillId, source locale, and target locales. In a single workflow, a locale can be cloned to multiple target locales. However, only one such workflow can be started at any time. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill on which locales can be cloned. Currently only &#x60;development&#x60; stage is supported. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage.  (required)
   * @param cloneLocaleRequest Defines the request body for the cloneLocale API. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCloneLocaleV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.CloneLocaleRequest cloneLocaleRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/cloneLocale";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Accepted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, cloneLocaleRequest, null, false);
  }

  /**
   * 
   * Creates a new clone locale workflow for a skill with given skillId, source locale, and target locales. In a single workflow, a locale can be cloned to multiple target locales. However, only one such workflow can be started at any time. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill on which locales can be cloned. Currently only &#x60;development&#x60; stage is supported. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage.  (required)
   * @param cloneLocaleRequest Defines the request body for the cloneLocale API. (required)
   * @throws ServiceException if fails to make API call
   */
  public void cloneLocaleV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.CloneLocaleRequest cloneLocaleRequest) throws ServiceException {
    this.callCloneLocaleV1(skillId, stageV2, cloneLocaleRequest).getResponse();
  }

  /**
   * 
   * Returns the status of a clone locale workflow associated with the unique identifier of cloneLocaleRequestId. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill on which locales can be cloned. Currently only &#x60;development&#x60; stage is supported. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage.  (required)
   * @param cloneLocaleRequestId Defines the identifier for a clone locale workflow. If set to ~latest, request returns the status of the latest clone locale workflow.  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.CloneLocaleStatusResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.CloneLocaleStatusResponse> callGetCloneLocaleStatusV1(String skillId, String stageV2, String cloneLocaleRequestId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    pathParams.put("cloneLocaleRequestId", cloneLocaleRequestId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/cloneLocaleRequests/{cloneLocaleRequestId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.CloneLocaleStatusResponse.class, 200, "OK."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.CloneLocaleStatusResponse.class, false);
  }

  /**
   * 
   * Returns the status of a clone locale workflow associated with the unique identifier of cloneLocaleRequestId. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill on which locales can be cloned. Currently only &#x60;development&#x60; stage is supported. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage.  (required)
   * @param cloneLocaleRequestId Defines the identifier for a clone locale workflow. If set to ~latest, request returns the status of the latest clone locale workflow.  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.CloneLocaleStatusResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.CloneLocaleStatusResponse getCloneLocaleStatusV1(String skillId, String stageV2, String cloneLocaleRequestId) throws ServiceException {
    return this.callGetCloneLocaleStatusV1(skillId, stageV2, cloneLocaleRequestId).getResponse();
  }

  /**
   * 
   * Gets the &#x60;InteractionModel&#x60; for the skill in the given stage. The path params **skillId**, **stage** and **locale** are required. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData> callGetInteractionModelV1(String skillId, String stageV2, String locale) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    pathParams.put("locale", locale);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/interactionModel/locales/{locale}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData.class, 200, "Returns interaction model object on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified skill doesn't exist or there is no model defined for the locale."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData.class, false);
  }

  /**
   * 
   * Gets the &#x60;InteractionModel&#x60; for the skill in the given stage. The path params **skillId**, **stage** and **locale** are required. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData getInteractionModelV1(String skillId, String stageV2, String locale) throws ServiceException {
    return this.callGetInteractionModelV1(skillId, stageV2, locale).getResponse();
  }

  /**
   * 
   * Get the latest metadata for the interaction model resource for the given stage. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callGetInteractionModelMetadataV1(String skillId, String stageV2, String locale) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    pathParams.put("locale", locale);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/interactionModel/locales/{locale}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success. There is no content but returns etag."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified skill or stage or locale does not exist"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("HEAD", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Get the latest metadata for the interaction model resource for the given stage. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @throws ServiceException if fails to make API call
   */
  public void getInteractionModelMetadataV1(String skillId, String stageV2, String locale) throws ServiceException {
    this.callGetInteractionModelMetadataV1(skillId, stageV2, locale).getResponse();
  }

  /**
   * 
   * Creates an &#x60;InteractionModel&#x60; for the skill. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param interactionModel  (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSetInteractionModelV1(String skillId, String stageV2, String locale, com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData interactionModel, String ifMatch) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    pathParams.put("locale", locale);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (ifMatch != null) {
      headerParams.add(new Pair<String, String>("If-Match", ifMatch));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/interactionModel/locales/{locale}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Returns build status location link on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. the input interaction model is invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified skill or stage or locale does not exist."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 412, "Precondition failed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, interactionModel, null, false);
  }

  /**
   * 
   * Creates an &#x60;InteractionModel&#x60; for the skill. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param interactionModel  (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void setInteractionModelV1(String skillId, String stageV2, String locale, com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData interactionModel, String ifMatch) throws ServiceException {
    this.callSetInteractionModelV1(skillId, stageV2, locale, interactionModel, ifMatch).getResponse();
  }

  /**
   * 
   * Get the list of interactionModel versions of a skill for the vendor.
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @param sortField Sets the field on which the sorting would be applied. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListResponse> callListInteractionModelVersionsV1(String skillId, String stageV2, String locale, String nextToken, BigDecimal maxResults, String sortDirection, String sortField) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }

    if(sortDirection != null) {
    queryParams.add(new Pair<String, String>("sortDirection", sortDirection));
  }

    if(sortField != null) {
    queryParams.add(new Pair<String, String>("sortField", sortField));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    pathParams.put("locale", locale);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/interactionModel/locales/{locale}/versions";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListResponse.class, 200, "Returns list of interactionModel versions of a skill for the vendor."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. the input interaction model is invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified skill doesn't exist or there is no model defined for the locale."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListResponse.class, false);
  }

  /**
   * 
   * Get the list of interactionModel versions of a skill for the vendor.
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @param sortDirection Sets the sorting direction of the result items. When set to &#39;asc&#39; these items are returned in ascending order of sortField value and when set to &#39;desc&#39; these items are returned in descending order of sortField value. (optional)
   * @param sortField Sets the field on which the sorting would be applied. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListResponse listInteractionModelVersionsV1(String skillId, String stageV2, String locale, String nextToken, BigDecimal maxResults, String sortDirection, String sortField) throws ServiceException {
    return this.callListInteractionModelVersionsV1(skillId, stageV2, locale, nextToken, maxResults, sortDirection, sortField).getResponse();
  }

  /**
   * 
   * Gets the specified version &#x60;InteractionModel&#x60; of a skill for the vendor. Use &#x60;~current&#x60; as version parameter to get the current version model. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param version Version for interaction model. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData> callGetInteractionModelVersionV1(String skillId, String stageV2, String locale, String version) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    pathParams.put("locale", locale);
    pathParams.put("version", version);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/interactionModel/locales/{locale}/versions/{version}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData.class, 200, "Returns interaction model object on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. the input interaction model is invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The specified skill doesn't exist or there is no model defined for the locale or version."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData.class, false);
  }

  /**
   * 
   * Gets the specified version &#x60;InteractionModel&#x60; of a skill for the vendor. Use &#x60;~current&#x60; as version parameter to get the current version model. 
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param locale The locale for the model requested e.g. en-GB, en-US, de-DE. (required)
   * @param version Version for interaction model. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData getInteractionModelVersionV1(String skillId, String stageV2, String locale, String version) throws ServiceException {
    return this.callGetInteractionModelVersionV1(skillId, stageV2, locale, version).getResponse();
  }

  /**
   * 
   * Returns the skill manifest for given skillId and stage.
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope> callGetSkillManifestV1(String skillId, String stageV2) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/manifest";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope.class, 200, "Response contains the latest version of skill manifest."));
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 303, "See Other"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope.class, false);
  }

  /**
   * 
   * Returns the skill manifest for given skillId and stage.
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @return com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope getSkillManifestV1(String skillId, String stageV2) throws ServiceException {
    return this.callGetSkillManifestV1(skillId, stageV2).getResponse();
  }

  /**
   * 
   * Updates skill manifest for given skillId and stage.
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param updateSkillRequest Defines the request body for updateSkill API. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callUpdateSkillManifestV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope updateSkillRequest, String ifMatch) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stageV2", stageV2);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (ifMatch != null) {
      headerParams.add(new Pair<String, String>("If-Match", ifMatch));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stageV2}/manifest";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Accepted; Returns a URL to track the status in 'Location' header."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 409, "The request could not be completed due to a conflict with the current state of the target resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 412, "Precondition failed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateSkillRequest, null, false);
  }

  /**
   * 
   * Updates skill manifest for given skillId and stage.
   * @param skillId The skill ID. (required)
   * @param stageV2 Stages of a skill including the new certified stage. * &#x60;development&#x60; - skills which are currently in development corresponds to this stage. * &#x60;certified&#x60; -  skills which have completed certification and ready for publishing corresponds to this stage. * &#x60;live&#x60; - skills which are currently live corresponds to this stage.  (required)
   * @param updateSkillRequest Defines the request body for updateSkill API. (required)
   * @param ifMatch Request header that specified an entity tag. The server will update the resource only if the eTag matches with the resource&#39;s current eTag. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void updateSkillManifestV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope updateSkillRequest, String ifMatch) throws ServiceException {
    this.callUpdateSkillManifestV1(skillId, stageV2, updateSkillRequest, ifMatch).getResponse();
  }

  /**
   * Validate a skill.
   * This is an asynchronous API which allows a skill developer to execute various validations against their skill. 
   * @param validationsApiRequest Payload sent to the skill validation API. (required)
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse> callSubmitSkillValidationV1(com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiRequest validationsApiRequest, String skillId, String stage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/validations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse.class, 202, "Skill validation has successfully begun."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "API user does not have permission or is currently in a state that does not allow calls to this API. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The specified skill, stage or validation does not exist. The error response will contain a description that indicates the specific resource type that was not found. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "This requests conflicts with another one currently being processed. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "API user has exceeded the permitted request rate."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal service error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, validationsApiRequest, com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse.class, false);
  }

  /**
   * Validate a skill.
   * This is an asynchronous API which allows a skill developer to execute various validations against their skill. 
   * @param validationsApiRequest Payload sent to the skill validation API. (required)
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse submitSkillValidationV1(com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiRequest validationsApiRequest, String skillId, String stage) throws ServiceException {
    return this.callSubmitSkillValidationV1(validationsApiRequest, skillId, stage).getResponse();
  }

  /**
   * Get the result of a previously executed validation.
   * This API gets the result of a previously executed validation. A successful response will contain the status of the executed validation. If the validation successfully completed, the response will also contain information related to executed validations. In cases where requests to this API results in an error, the response will contain a description of the problem. In cases where the validation failed, the response will contain a status attribute indicating that a failure occurred. Note that validation results are stored for 60 minutes. A request for an expired validation result will return a 404 HTTP status code. 
   * @param skillId The skill ID. (required)
   * @param validationId Id of the validation. Reserved word identifier of mostRecent can be used to get the most recent validation for the skill and stage. Note that the behavior of the API in this case would be the same as when the actual validation id of the most recent validation is used in the request.  (required)
   * @param stage Stage for skill. (required)
   * @param acceptLanguage User&#39;s locale/language in context. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse> callGetSkillValidationsV1(String skillId, String validationId, String stage, String acceptLanguage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("validationId", validationId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (acceptLanguage != null) {
      headerParams.add(new Pair<String, String>("Accept-Language", acceptLanguage));
    }

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/stages/{stage}/validations/{validationId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse.class, 200, "Successfully retrieved skill validation information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "API user does not have permission or is currently in a state that does not allow calls to this API. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 404, "The specified skill, stage, or validation does not exist. The error response will contain a description that indicates the specific resource type that was not found. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 409, "This requests conflicts with another one currently being processed. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "API user has exceeded the permitted request rate."));
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 500, "Internal service error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse.class, false);
  }

  /**
   * Get the result of a previously executed validation.
   * This API gets the result of a previously executed validation. A successful response will contain the status of the executed validation. If the validation successfully completed, the response will also contain information related to executed validations. In cases where requests to this API results in an error, the response will contain a description of the problem. In cases where the validation failed, the response will contain a status attribute indicating that a failure occurred. Note that validation results are stored for 60 minutes. A request for an expired validation result will return a 404 HTTP status code. 
   * @param skillId The skill ID. (required)
   * @param validationId Id of the validation. Reserved word identifier of mostRecent can be used to get the most recent validation for the skill and stage. Note that the behavior of the API in this case would be the same as when the actual validation id of the most recent validation is used in the request.  (required)
   * @param stage Stage for skill. (required)
   * @param acceptLanguage User&#39;s locale/language in context. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse getSkillValidationsV1(String skillId, String validationId, String stage, String acceptLanguage) throws ServiceException {
    return this.callGetSkillValidationsV1(skillId, validationId, stage, acceptLanguage).getResponse();
  }

  /**
   * 
   * Get the status of skill resource and its sub-resources for a given skillId.
   * @param skillId The skill ID. (required)
   * @param resource Resource name for which status information is desired. It is an optional, filtering parameter and can be used more than once, to retrieve status for all the desired (sub)resources only, in single API call. If this parameter is not specified, status for all the resources/sub-resources will be returned.  (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.SkillStatus
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.SkillStatus> callGetSkillStatusV1(String skillId, String resource) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(resource != null) {
    queryParams.add(new Pair<String, String>("resource", resource));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/status";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.SkillStatus.class, 200, "Returns status for skill resource and sub-resources."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.SkillStatus.class, false);
  }

  /**
   * 
   * Get the status of skill resource and its sub-resources for a given skillId.
   * @param skillId The skill ID. (required)
   * @param resource Resource name for which status information is desired. It is an optional, filtering parameter and can be used more than once, to retrieve status for all the desired (sub)resources only, in single API call. If this parameter is not specified, status for all the resources/sub-resources will be returned.  (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.SkillStatus
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.SkillStatus getSkillStatusV1(String skillId, String resource) throws ServiceException {
    return this.callGetSkillStatusV1(skillId, resource).getResponse();
  }

  /**
   * 
   * Submit the skill for certification. 
   * @param skillId The skill ID. (required)
   * @param submitSkillForCertificationRequest Defines the request body for submitSkillForCertification API. (optional)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSubmitSkillForCertificationV1(String skillId, com.amazon.ask.smapi.model.v1.skill.SubmitSkillForCertificationRequest submitSkillForCertificationRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/submit";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Success. There is no content but returns Location in the header."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, submitSkillForCertificationRequest, null, false);
  }

  /**
   * 
   * Submit the skill for certification. 
   * @param skillId The skill ID. (required)
   * @param submitSkillForCertificationRequest Defines the request body for submitSkillForCertification API. (optional)
   * @throws ServiceException if fails to make API call
   */
  public void submitSkillForCertificationV1(String skillId, com.amazon.ask.smapi.model.v1.skill.SubmitSkillForCertificationRequest submitSkillForCertificationRequest) throws ServiceException {
    this.callSubmitSkillForCertificationV1(skillId, submitSkillForCertificationRequest).getResponse();
  }

  /**
   * 
   * Retrieve a list of all skill versions associated with this skill id
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.ListSkillVersionsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.ListSkillVersionsResponse> callListVersionsForSkillV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/versions";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.ListSkillVersionsResponse.class, 200, "Successfully retrieved skill versions"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.ListSkillVersionsResponse.class, false);
  }

  /**
   * 
   * Retrieve a list of all skill versions associated with this skill id
   * @param skillId The skill ID. (required)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element. The value of nextToken can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that Skill Management API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults Sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 50 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.smapi.model.v1.skill.ListSkillVersionsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.ListSkillVersionsResponse listVersionsForSkillV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callListVersionsForSkillV1(skillId, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * Withdraws the skill from certification. 
   * @param skillId The skill ID. (required)
   * @param withdrawRequest The reason and message (in case of OTHER) to withdraw a skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callWithdrawSkillFromCertificationV1(String skillId, com.amazon.ask.smapi.model.v1.skill.WithdrawRequest withdrawRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/{skillId}/withdraw";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 403, "The operation being requested is not allowed."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 404, "The resource being requested is not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, withdrawRequest, null, false);
  }

  /**
   * 
   * Withdraws the skill from certification. 
   * @param skillId The skill ID. (required)
   * @param withdrawRequest The reason and message (in case of OTHER) to withdraw a skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public void withdrawSkillFromCertificationV1(String skillId, com.amazon.ask.smapi.model.v1.skill.WithdrawRequest withdrawRequest) throws ServiceException {
    this.callWithdrawSkillFromCertificationV1(skillId, withdrawRequest).getResponse();
  }

  /**
   * 
   * Creates a new uploadUrl. 
   * @return com.amazon.ask.smapi.model.v1.skill.UploadResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.UploadResponse> callCreateUploadUrlV1() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skills/uploads";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.UploadResponse.class, 201, "Created."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceeds the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.UploadResponse.class, false);
  }

  /**
   * 
   * Creates a new uploadUrl. 
   * @return com.amazon.ask.smapi.model.v1.skill.UploadResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.UploadResponse createUploadUrlV1() throws ServiceException {
    return this.callCreateUploadUrlV1().getResponse();
  }

  /**
   * 
   * Get the list of Vendor information. 
   * @return com.amazon.ask.smapi.model.v1.vendorManagement.Vendors
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.vendorManagement.Vendors> callGetVendorListV1() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/vendors";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.vendorManagement.Vendors.class, 200, "Return vendor information on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.vendorManagement.Vendors.class, false);
  }

  /**
   * 
   * Get the list of Vendor information. 
   * @return com.amazon.ask.smapi.model.v1.vendorManagement.Vendors
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.vendorManagement.Vendors getVendorListV1() throws ServiceException {
    return this.callGetVendorListV1().getResponse();
  }

  /**
   * 
   * Get the current user permissions about Alexa hosted skill features.
   * @param vendorId vendorId (required)
   * @param permission The permission of a hosted skill feature that customer needs to check. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermission
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermission> callGetAlexaHostedSkillUserPermissionsV1(String vendorId, String permission) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("vendorId", vendorId);
    pathParams.put("permission", permission);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/vendors/{vendorId}/alexaHosted/permissions/{permission}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermission.class, 200, "response contains the user's permission of hosted skill features"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.BadRequestError.class, 400, "Server cannot process the request due to a client error e.g. Authorization Url is invalid"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 429, "Exceed the permitted request limit. Throttling criteria includes total requests, per API, ClientId, and CustomerId."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 500, "Internal Server Error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v1.skill.StandardizedError.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermission.class, false);
  }

  /**
   * 
   * Get the current user permissions about Alexa hosted skill features.
   * @param vendorId vendorId (required)
   * @param permission The permission of a hosted skill feature that customer needs to check. (required)
   * @return com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermission
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermission getAlexaHostedSkillUserPermissionsV1(String vendorId, String permission) throws ServiceException {
    return this.callGetAlexaHostedSkillUserPermissionsV1(vendorId, permission).getResponse();
  }

  /**
   * Invokes the Lambda or third party HTTPS endpoint for the given skill against a given stage.
   * This is a synchronous API that invokes the Lambda or third party HTTPS endpoint for a given skill. A successful response will contain information related to what endpoint was called, payload sent to and received from the endpoint. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. In cases where invoking the skill endpoint specifically fails, the response will contain a status attribute indicating that a failure occurred and details about what was sent to the endpoint. The skill must belong to and be enabled by the user of this API. Also,  note that calls to the skill endpoint will timeout after 10 seconds. This  API is currently designed in a way that allows extension to an asynchronous  API if a significantly bigger timeout is required. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param invocationsApiRequest Payload sent to the skill invocation API. (required)
   * @return com.amazon.ask.smapi.model.v2.skill.invocations.InvocationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v2.skill.invocations.InvocationsApiResponse> callInvokeSkillEndPointV2(String skillId, String stage, com.amazon.ask.smapi.model.v2.skill.invocations.InvocationsApiRequest invocationsApiRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v2/skills/{skillId}/stages/{stage}/invocations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.skill.invocations.InvocationsApiResponse.class, 200, "Skill was invoked."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.BadRequestError.class, 400, "Bad request due to invalid or missing data."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.BadRequestError.class, 403, "API user does not have permission to call this API or is currently in a state that does not allow invocation of this skill. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 404, "The specified skill does not exist."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 429, "API user has exceeded the permitted request rate."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 500, "Internal service error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, invocationsApiRequest, com.amazon.ask.smapi.model.v2.skill.invocations.InvocationsApiResponse.class, false);
  }

  /**
   * Invokes the Lambda or third party HTTPS endpoint for the given skill against a given stage.
   * This is a synchronous API that invokes the Lambda or third party HTTPS endpoint for a given skill. A successful response will contain information related to what endpoint was called, payload sent to and received from the endpoint. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. In cases where invoking the skill endpoint specifically fails, the response will contain a status attribute indicating that a failure occurred and details about what was sent to the endpoint. The skill must belong to and be enabled by the user of this API. Also,  note that calls to the skill endpoint will timeout after 10 seconds. This  API is currently designed in a way that allows extension to an asynchronous  API if a significantly bigger timeout is required. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param invocationsApiRequest Payload sent to the skill invocation API. (required)
   * @return com.amazon.ask.smapi.model.v2.skill.invocations.InvocationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v2.skill.invocations.InvocationsApiResponse invokeSkillEndPointV2(String skillId, String stage, com.amazon.ask.smapi.model.v2.skill.invocations.InvocationsApiRequest invocationsApiRequest) throws ServiceException {
    return this.callInvokeSkillEndPointV2(skillId, stage, invocationsApiRequest).getResponse();
  }

  /**
   * Simulate executing a skill with the given id against a given stage.
   * This is an asynchronous API that simulates a skill execution in the Alexa eco-system given an utterance text of what a customer would say to Alexa. A successful response will contain a header with the location of the simulation resource. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. The skill being simulated must belong to and be enabled  by the user of this API. Concurrent requests per user is currently not supported. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param simulationsApiRequest Payload sent to the skill simulation API. (required)
   * @return com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse> callSimulateSkillV2(String skillId, String stage, com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiRequest simulationsApiRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v2/skills/{skillId}/stages/{stage}/simulations";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse.class, 200, "Skill simulation has successfully began."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.BadRequestError.class, 400, "Bad request due to invalid or missing data."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.BadRequestError.class, 403, "API user does not have permission to call this API or is currently in a state that does not allow simulation of this skill. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 404, "The specified skill does not exist."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 409, "This requests conflicts with another one currently being processed. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 429, "API user has exceeded the permitted request rate."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 500, "Internal service error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, simulationsApiRequest, com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse.class, false);
  }

  /**
   * Simulate executing a skill with the given id against a given stage.
   * This is an asynchronous API that simulates a skill execution in the Alexa eco-system given an utterance text of what a customer would say to Alexa. A successful response will contain a header with the location of the simulation resource. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. The skill being simulated must belong to and be enabled  by the user of this API. Concurrent requests per user is currently not supported. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param simulationsApiRequest Payload sent to the skill simulation API. (required)
   * @return com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse simulateSkillV2(String skillId, String stage, com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiRequest simulationsApiRequest) throws ServiceException {
    return this.callSimulateSkillV2(skillId, stage, simulationsApiRequest).getResponse();
  }

  /**
   * Get the result of a previously executed simulation.
   * This API gets the result of a previously executed simulation. A successful response will contain the status of the executed simulation. If the simulation successfully completed, the response will also contain information related to skill invocation. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. In cases where the simulation failed, the response will contain a status attribute indicating that a failure occurred and details about what was sent to the skill endpoint. Note that simulation results are stored for 10 minutes. A request for an expired simulation result will return a 404 HTTP status code. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param simulationId Id of the simulation. (required)
   * @return com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse> callGetSkillSimulationV2(String skillId, String stage, String simulationId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("skillId", skillId);
    pathParams.put("stage", stage);
    pathParams.put("simulationId", simulationId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForRefreshToken();
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v2/skills/{skillId}/stages/{stage}/simulations/{simulationId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse.class, 200, "Successfully retrieved skill simulation information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 401, "The auth token is invalid/expired or doesn't have access to the resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.BadRequestError.class, 403, "API user does not have permission or is currently in a state that does not allow calls to this API. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 404, "The specified skill or simulation does not exist. The error response will contain a description that indicates the specific resource type that was not found. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 429, "API user has exceeded the permitted request rate."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 500, "Internal service error."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.smapi.model.v2.Error.class, 503, "Service Unavailable."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse.class, false);
  }

  /**
   * Get the result of a previously executed simulation.
   * This API gets the result of a previously executed simulation. A successful response will contain the status of the executed simulation. If the simulation successfully completed, the response will also contain information related to skill invocation. In cases where requests to this API results in an error, the response will contain an error code and a description of the problem. In cases where the simulation failed, the response will contain a status attribute indicating that a failure occurred and details about what was sent to the skill endpoint. Note that simulation results are stored for 10 minutes. A request for an expired simulation result will return a 404 HTTP status code. 
   * @param skillId The skill ID. (required)
   * @param stage Stage for skill. (required)
   * @param simulationId Id of the simulation. (required)
   * @return com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.smapi.model.v2.skill.simulations.SimulationsApiResponse getSkillSimulationV2(String skillId, String stage, String simulationId) throws ServiceException {
    return this.callGetSkillSimulationV2(skillId, stage, simulationId).getResponse();
  }

}
