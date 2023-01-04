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

package com.amazon.ask.model.services.listManagement;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class ListManagementServiceClient extends BaseServiceClient implements ListManagementService {

  private final UserAgentHelper userAgentHelper;
  public ListManagementServiceClient(ApiConfiguration apiConfiguration) {
      super(apiConfiguration);
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.41.0").build();
  }

  /**
   * 
   * Retrieves the metadata for all customer lists, including the customer’s default lists. 
   * @return com.amazon.ask.model.services.listManagement.AlexaListsMetadata
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListsMetadata> callGetListsMetadata() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/householdlists";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.AlexaListsMetadata.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.ForbiddenError.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", "https://api.amazonalexa.com/", resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.listManagement.AlexaListsMetadata.class, false);
  }

  /**
   * 
   * Retrieves the metadata for all customer lists, including the customer’s default lists. 
   * @return com.amazon.ask.model.services.listManagement.AlexaListsMetadata
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.listManagement.AlexaListsMetadata getListsMetadata() throws ServiceException {
    return this.callGetListsMetadata().getResponse();
  }

  /**
   * 
   * This API deletes a customer custom list.
   * @param listId Value of the customer’s listId retrieved from a getListsMetadata call (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteList(String listId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("listId", listId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/householdlists/{listId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 404, "Not Found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 0, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", "https://api.amazonalexa.com/", resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * This API deletes a customer custom list.
   * @param listId Value of the customer’s listId retrieved from a getListsMetadata call (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteList(String listId) throws ServiceException {
    this.callDeleteList(listId).getResponse();
  }

  /**
   * 
   * This API deletes an item in the specified list.
   * @param listId The customer’s listId is retrieved from a getListsMetadata call. (required)
   * @param itemId The customer’s itemId is retrieved from a GetList call. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteListItem(String listId, String itemId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("listId", listId);
    pathParams.put("itemId", itemId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/householdlists/{listId}/items/{itemId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 404, "Not Found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 0, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", "https://api.amazonalexa.com/", resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * This API deletes an item in the specified list.
   * @param listId The customer’s listId is retrieved from a getListsMetadata call. (required)
   * @param itemId The customer’s itemId is retrieved from a GetList call. (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteListItem(String listId, String itemId) throws ServiceException {
    this.callDeleteListItem(listId, itemId).getResponse();
  }

  /**
   * 
   * This API can be used to retrieve single item with in any list by listId and itemId. This API can read list items from an archived list. Attempting to read list items from a deleted list return an ObjectNotFound 404 error. 
   * @param listId Retrieved from a call to getListsMetadata (required)
   * @param itemId itemId within a list is retrieved from a getList call (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListItem
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListItem> callGetListItem(String listId, String itemId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("listId", listId);
    pathParams.put("itemId", itemId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/householdlists/{listId}/items/{itemId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.AlexaListItem.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 404, "Not Found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 0, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", "https://api.amazonalexa.com/", resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.listManagement.AlexaListItem.class, false);
  }

  /**
   * 
   * This API can be used to retrieve single item with in any list by listId and itemId. This API can read list items from an archived list. Attempting to read list items from a deleted list return an ObjectNotFound 404 error. 
   * @param listId Retrieved from a call to getListsMetadata (required)
   * @param itemId itemId within a list is retrieved from a getList call (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListItem
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.listManagement.AlexaListItem getListItem(String listId, String itemId) throws ServiceException {
    return this.callGetListItem(listId, itemId).getResponse();
  }

  /**
   * 
   * API used to update an item value or item status.
   * @param listId Customer’s listId (required)
   * @param itemId itemId to be updated in the list (required)
   * @param updateListItemRequest  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListItem
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListItem> callUpdateListItem(String listId, String itemId, com.amazon.ask.model.services.listManagement.UpdateListItemRequest updateListItemRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("listId", listId);
    pathParams.put("itemId", itemId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/householdlists/{listId}/items/{itemId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.AlexaListItem.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 404, "Not Found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 409, "Conflict"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 0, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", "https://api.amazonalexa.com/", resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateListItemRequest, com.amazon.ask.model.services.listManagement.AlexaListItem.class, false);
  }

  /**
   * 
   * API used to update an item value or item status.
   * @param listId Customer’s listId (required)
   * @param itemId itemId to be updated in the list (required)
   * @param updateListItemRequest  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListItem
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.listManagement.AlexaListItem updateListItem(String listId, String itemId, com.amazon.ask.model.services.listManagement.UpdateListItemRequest updateListItemRequest) throws ServiceException {
    return this.callUpdateListItem(listId, itemId, updateListItemRequest).getResponse();
  }

  /**
   * 
   * This API creates an item in an active list or in a default list.
   * @param listId The customer’s listId retrieved from a getListsMetadata call. (required)
   * @param createListItemRequest  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListItem
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListItem> callCreateListItem(String listId, com.amazon.ask.model.services.listManagement.CreateListItemRequest createListItemRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("listId", listId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/householdlists/{listId}/items";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.AlexaListItem.class, 201, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 404, "Not found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 0, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", "https://api.amazonalexa.com/", resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createListItemRequest, com.amazon.ask.model.services.listManagement.AlexaListItem.class, false);
  }

  /**
   * 
   * This API creates an item in an active list or in a default list.
   * @param listId The customer’s listId retrieved from a getListsMetadata call. (required)
   * @param createListItemRequest  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListItem
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.listManagement.AlexaListItem createListItem(String listId, com.amazon.ask.model.services.listManagement.CreateListItemRequest createListItemRequest) throws ServiceException {
    return this.callCreateListItem(listId, createListItemRequest).getResponse();
  }

  /**
   * 
   * This API updates a custom list. Only the list name or state can be updated. An Alexa customer can turn an archived list into an active one. 
   * @param listId Value of the customer’s listId retrieved from a getListsMetadata call.  (required)
   * @param updateListRequest  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListMetadata
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListMetadata> callUpdateList(String listId, com.amazon.ask.model.services.listManagement.UpdateListRequest updateListRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("listId", listId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/householdlists/{listId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.AlexaListMetadata.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 404, "List not found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 409, "Conflict"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 0, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", "https://api.amazonalexa.com/", resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, updateListRequest, com.amazon.ask.model.services.listManagement.AlexaListMetadata.class, false);
  }

  /**
   * 
   * This API updates a custom list. Only the list name or state can be updated. An Alexa customer can turn an archived list into an active one. 
   * @param listId Value of the customer’s listId retrieved from a getListsMetadata call.  (required)
   * @param updateListRequest  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListMetadata
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.listManagement.AlexaListMetadata updateList(String listId, com.amazon.ask.model.services.listManagement.UpdateListRequest updateListRequest) throws ServiceException {
    return this.callUpdateList(listId, updateListRequest).getResponse();
  }

  /**
   * 
   * Retrieves the list metadata including the items in the list with requested status. 
   * @param listId Retrieved from a call to GetListsMetadata to specify the listId in the request path.  (required)
   * @param status Specify the status of the list.  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaList
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.listManagement.AlexaList> callGetList(String listId, String status) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("listId", listId);
    pathParams.put("status", status);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/householdlists/{listId}/{status}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.AlexaList.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 404, "Not Found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 0, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", "https://api.amazonalexa.com/", resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.listManagement.AlexaList.class, false);
  }

  /**
   * 
   * Retrieves the list metadata including the items in the list with requested status. 
   * @param listId Retrieved from a call to GetListsMetadata to specify the listId in the request path.  (required)
   * @param status Specify the status of the list.  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaList
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.listManagement.AlexaList getList(String listId, String status) throws ServiceException {
    return this.callGetList(listId, status).getResponse();
  }

  /**
   * 
   * This API creates a custom list. The new list name must be different than any existing list name. 
   * @param createListRequest  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListMetadata
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListMetadata> callCreateList(com.amazon.ask.model.services.listManagement.CreateListRequest createListRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/householdlists";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.AlexaListMetadata.class, 201, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 409, "Conflict"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.listManagement.Error.class, 0, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", "https://api.amazonalexa.com/", resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createListRequest, com.amazon.ask.model.services.listManagement.AlexaListMetadata.class, false);
  }

  /**
   * 
   * This API creates a custom list. The new list name must be different than any existing list name. 
   * @param createListRequest  (required)
   * @return com.amazon.ask.model.services.listManagement.AlexaListMetadata
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.listManagement.AlexaListMetadata createList(com.amazon.ask.model.services.listManagement.CreateListRequest createListRequest) throws ServiceException {
    return this.callCreateList(createListRequest).getResponse();
  }

}
