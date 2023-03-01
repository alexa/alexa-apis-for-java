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

package com.amazon.ask.model.services.timerManagement;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class TimerManagementServiceClient extends BaseServiceClient implements TimerManagementService {

  private final UserAgentHelper userAgentHelper;
  public TimerManagementServiceClient(ApiConfiguration apiConfiguration) {
      super(apiConfiguration);
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.55.0").build();
  }

  /**
   * 
   * Delete all timers created by the skill. 
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteTimers() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/timers";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 401, "Unauthorized"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Delete all timers created by the skill. 
   * @throws ServiceException if fails to make API call
   */
  public void deleteTimers() throws ServiceException {
    this.callDeleteTimers().getResponse();
  }

  /**
   * 
   * Get all timers created by the skill. 
   * @return com.amazon.ask.model.services.timerManagement.TimersResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.timerManagement.TimersResponse> callGetTimers() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/timers";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.TimersResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 401, "Unauthorized"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.timerManagement.TimersResponse.class, false);
  }

  /**
   * 
   * Get all timers created by the skill. 
   * @return com.amazon.ask.model.services.timerManagement.TimersResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.timerManagement.TimersResponse getTimers() throws ServiceException {
    return this.callGetTimers().getResponse();
  }

  /**
   * 
   * Delete a timer by ID. 
   * @param id  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteTimer(String id) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("id", id);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/timers/{id}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 401, "Unauthorized"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 404, "Timer not found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Delete a timer by ID. 
   * @param id  (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteTimer(String id) throws ServiceException {
    this.callDeleteTimer(id).getResponse();
  }

  /**
   * 
   * Get timer by ID. 
   * @param id  (required)
   * @return com.amazon.ask.model.services.timerManagement.TimerResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.timerManagement.TimerResponse> callGetTimer(String id) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("id", id);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/timers/{id}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.TimerResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 401, "Unauthorized"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 404, "Timer not found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.timerManagement.TimerResponse.class, false);
  }

  /**
   * 
   * Get timer by ID. 
   * @param id  (required)
   * @return com.amazon.ask.model.services.timerManagement.TimerResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.timerManagement.TimerResponse getTimer(String id) throws ServiceException {
    return this.callGetTimer(id).getResponse();
  }

  /**
   * 
   * Pause a timer. 
   * @param id  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callPauseTimer(String id) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("id", id);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/timers/{id}/pause";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 401, "Unauthorized"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 404, "Timer not found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 504, "Device offline"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Pause a timer. 
   * @param id  (required)
   * @throws ServiceException if fails to make API call
   */
  public void pauseTimer(String id) throws ServiceException {
    this.callPauseTimer(id).getResponse();
  }

  /**
   * 
   * Resume a timer. 
   * @param id  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callResumeTimer(String id) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("id", id);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/timers/{id}/resume";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 401, "Unauthorized"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 404, "Timer not found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 504, "Device offline"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * Resume a timer. 
   * @param id  (required)
   * @throws ServiceException if fails to make API call
   */
  public void resumeTimer(String id) throws ServiceException {
    this.callResumeTimer(id).getResponse();
  }

  /**
   * 
   * Create a new timer. 
   * @param timerRequest  (required)
   * @return com.amazon.ask.model.services.timerManagement.TimerResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.timerManagement.TimerResponse> callCreateTimer(com.amazon.ask.model.services.timerManagement.TimerRequest timerRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/timers";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.TimerResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 401, "Unauthorized"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.timerManagement.Error.class, 504, "Device offline"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, timerRequest, com.amazon.ask.model.services.timerManagement.TimerResponse.class, false);
  }

  /**
   * 
   * Create a new timer. 
   * @param timerRequest  (required)
   * @return com.amazon.ask.model.services.timerManagement.TimerResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.timerManagement.TimerResponse createTimer(com.amazon.ask.model.services.timerManagement.TimerRequest timerRequest) throws ServiceException {
    return this.callCreateTimer(timerRequest).getResponse();
  }

}
