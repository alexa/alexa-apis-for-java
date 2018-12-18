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

package com.amazon.ask.model.services.reminderManagement;

import com.amazon.ask.model.services.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class ReminderManagementServiceClient extends BaseServiceClient implements ReminderManagementService {

  public ReminderManagementServiceClient(ApiConfiguration apiConfiguration) {
    super(apiConfiguration);
  }

  /**
   * 
   * This API is invoked by the skill to delete a single reminder. 
   * @param alertToken  (required)
   * @throws ServiceException if fails to make API call
   */
  public void deleteReminder(String alertToken) throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
      pathParams.put("alertToken", alertToken);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 401, "UserAuthenticationException. Request is not authorized/authenticated e.g. If customer does not have permission to create a reminder."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));

    this.invoke("DELETE", this.apiEndpoint, "/v1/alerts/reminders/{alertToken}", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,null);
  }
  /**
   * 
   * This API is invoked by the skill to get a single reminder. 
   * @param alertToken  (required)
   * @return com.amazon.ask.model.services.reminderManagement.GetReminderResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.reminderManagement.GetReminderResponse getReminder(String alertToken) throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
      pathParams.put("alertToken", alertToken);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.GetReminderResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 401, "UserAuthenticationException. Request is not authorized/authenticated e.g. If customer does not have permission to create a reminder."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));

    return (com.amazon.ask.model.services.reminderManagement.GetReminderResponse)this.invoke("GET", this.apiEndpoint, "/v1/alerts/reminders/{alertToken}", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,com.amazon.ask.model.services.reminderManagement.GetReminderResponse.class);
  }
  /**
   * 
   * This API is invoked by the skill to update a reminder. 
   * @param alertToken  (required)
   * @param reminderRequest  (required)
   * @return com.amazon.ask.model.services.reminderManagement.ReminderResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.reminderManagement.ReminderResponse updateReminder(String alertToken, com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
      pathParams.put("alertToken", alertToken);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.ReminderResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 404, "NotFoundException e.g. Retured when reminder is not found"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 409, "UserAuthenticationException. Request is not authorized/authenticated e.g. If customer does not have permission to create a reminder."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));

    return (com.amazon.ask.model.services.reminderManagement.ReminderResponse)this.invoke("PUT", this.apiEndpoint, "/v1/alerts/reminders/{alertToken}", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, reminderRequest ,com.amazon.ask.model.services.reminderManagement.ReminderResponse.class);
  }
  /**
   * 
   * This API is invoked by the skill to delete all reminders created by the caller. 
   * @throws ServiceException if fails to make API call
   */
  public void deleteReminders() throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 401, "UserAuthenticationException. Request is not authorized/authenticated e.g. If customer does not have permission to create a reminder."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));

    this.invoke("DELETE", this.apiEndpoint, "/v1/alerts/reminders/", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,null);
  }
  /**
   * 
   * This API is invoked by the skill to get a all reminders created by the caller. 
   * @return com.amazon.ask.model.services.reminderManagement.GetRemindersResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.reminderManagement.GetRemindersResponse getReminders() throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.GetRemindersResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 401, "UserAuthenticationException. Request is not authorized/authenticated e.g. If customer does not have permission to create a reminder."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));

    return (com.amazon.ask.model.services.reminderManagement.GetRemindersResponse)this.invoke("GET", this.apiEndpoint, "/v1/alerts/reminders/", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,com.amazon.ask.model.services.reminderManagement.GetRemindersResponse.class);
  }
  /**
   * 
   * This API is invoked by the skill to create a new reminder. 
   * @param reminderRequest  (required)
   * @return com.amazon.ask.model.services.reminderManagement.ReminderResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.reminderManagement.ReminderResponse createReminder(com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.ReminderResponse.class, 200, "Success"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 400, "Bad Request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 403, "Forbidden"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 429, "RateExceededException e.g. When the skill is throttled for exceeding the max rate"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 500, "Internal Server Error"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 503, "Service Unavailable"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.reminderManagement.Error.class, 504, "Gateway Timeout"));

    return (com.amazon.ask.model.services.reminderManagement.ReminderResponse)this.invoke("POST", this.apiEndpoint, "/v1/alerts/reminders/", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, reminderRequest ,com.amazon.ask.model.services.reminderManagement.ReminderResponse.class);
  }
}
