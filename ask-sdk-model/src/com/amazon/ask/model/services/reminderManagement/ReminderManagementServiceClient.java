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

package com.amazon.ask.model.services.reminderManagement;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class ReminderManagementServiceClient extends BaseServiceClient implements ReminderManagementService {

  private final UserAgentHelper userAgentHelper;
  public ReminderManagementServiceClient(ApiConfiguration apiConfiguration) {
      super(apiConfiguration);
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.66.0").build();
  }

  /**
   * 
   * This API is invoked by the skill to delete a single reminder. 
   * @param alertToken  (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callDeleteReminder(String alertToken) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("alertToken", alertToken);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/reminders/{alertToken}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 401, "UserAuthenticationException. Request is not authorized/authenticated e.g. If customer does not have permission to create a reminder."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("DELETE", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, null, false);
  }

  /**
   * 
   * This API is invoked by the skill to delete a single reminder. 
   * @param alertToken  (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteReminder(String alertToken) throws ServiceException {
    this.callDeleteReminder(alertToken).getResponse();
  }

  /**
   * 
   * This API is invoked by the skill to get a single reminder. 
   * @param alertToken  (required)
   * @return com.amazon.ask.model.services.reminderManagement.GetReminderResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.reminderManagement.GetReminderResponse> callGetReminder(String alertToken) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("alertToken", alertToken);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/reminders/{alertToken}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.GetReminderResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 401, "UserAuthenticationException. Request is not authorized/authenticated e.g. If customer does not have permission to create a reminder."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.reminderManagement.GetReminderResponse.class, false);
  }

  /**
   * 
   * This API is invoked by the skill to get a single reminder. 
   * @param alertToken  (required)
   * @return com.amazon.ask.model.services.reminderManagement.GetReminderResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.reminderManagement.GetReminderResponse getReminder(String alertToken) throws ServiceException {
    return this.callGetReminder(alertToken).getResponse();
  }

  /**
   * 
   * This API is invoked by the skill to update a reminder. 
   * @param alertToken  (required)
   * @param reminderRequest  (required)
   * @return com.amazon.ask.model.services.reminderManagement.ReminderResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.reminderManagement.ReminderResponse> callUpdateReminder(String alertToken, com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("alertToken", alertToken);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/reminders/{alertToken}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.ReminderResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 404, "NotFoundException e.g. Retured when reminder is not found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 409, "UserAuthenticationException. Request is not authorized/authenticated e.g. If customer does not have permission to create a reminder."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("PUT", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, reminderRequest, com.amazon.ask.model.services.reminderManagement.ReminderResponse.class, false);
  }

  /**
   * 
   * This API is invoked by the skill to update a reminder. 
   * @param alertToken  (required)
   * @param reminderRequest  (required)
   * @return com.amazon.ask.model.services.reminderManagement.ReminderResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.reminderManagement.ReminderResponse updateReminder(String alertToken, com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws ServiceException {
    return this.callUpdateReminder(alertToken, reminderRequest).getResponse();
  }

  /**
   * 
   * This API is invoked by the skill to get a all reminders created by the caller. 
   * @return com.amazon.ask.model.services.reminderManagement.GetRemindersResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.reminderManagement.GetRemindersResponse> callGetReminders() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/reminders";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.GetRemindersResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 401, "UserAuthenticationException. Request is not authorized/authenticated e.g. If customer does not have permission to create a reminder."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.reminderManagement.GetRemindersResponse.class, false);
  }

  /**
   * 
   * This API is invoked by the skill to get a all reminders created by the caller. 
   * @return com.amazon.ask.model.services.reminderManagement.GetRemindersResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.reminderManagement.GetRemindersResponse getReminders() throws ServiceException {
    return this.callGetReminders().getResponse();
  }

  /**
   * 
   * This API is invoked by the skill to create a new reminder. 
   * @param reminderRequest  (required)
   * @return com.amazon.ask.model.services.reminderManagement.ReminderResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.reminderManagement.ReminderResponse> callCreateReminder(com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/alerts/reminders";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.ReminderResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 503, "Service Unavailable"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 504, "Gateway Timeout"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, reminderRequest, com.amazon.ask.model.services.reminderManagement.ReminderResponse.class, false);
  }

  /**
   * 
   * This API is invoked by the skill to create a new reminder. 
   * @param reminderRequest  (required)
   * @return com.amazon.ask.model.services.reminderManagement.ReminderResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.reminderManagement.ReminderResponse createReminder(com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws ServiceException {
    return this.callCreateReminder(reminderRequest).getResponse();
  }

}
