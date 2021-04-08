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

package com.amazon.ask.model.services.skillMessaging;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class SkillMessagingServiceClient extends BaseServiceClient implements SkillMessagingService {

  private final UserAgentHelper userAgentHelper;
  private final LwaClient lwaClient;

  public SkillMessagingServiceClient(ApiConfiguration apiConfiguration, AuthenticationConfiguration authenticationConfiguration) {
      super(apiConfiguration);
      this.lwaClient = LwaClient.builder()
          .withAuthenticationConfiguration(authenticationConfiguration)
          .withGrantType(GrantType.CLIENT_CREDENTIALS)
          .withApiConfiguration(DefaultApiConfiguration.builder()
                                    .withApiClient(apiConfiguration.getApiClient())
                                    .withSerializer(apiConfiguration.getSerializer())
                                    .build())
          .build();
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.35.1").build();
  }

  public SkillMessagingServiceClient(ApiConfiguration apiConfiguration, LwaClient lwaClient) {
      super(apiConfiguration);
      this.lwaClient = lwaClient;
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.35.1").build();
  }

  /**
   * 
   * Send a message request to a skill for a specified user.
   * @param userId The user Id for the specific user to send the message (required)
   * @param sendSkillMessagingRequest Message Request to be sent to the skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callSendSkillMessage(String userId, com.amazon.ask.model.services.skillMessaging.SendSkillMessagingRequest sendSkillMessagingRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("userId", userId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForScope("alexa:skill_messaging");
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String path = "/v1/skillmessages/users/{userId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Message has been successfully accepted, and will be sent to the skill "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.skillMessaging.Error.class, 400, "Data is missing or not valid "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.skillMessaging.Error.class, 403, "The skill messaging authentication token is expired or not valid "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.skillMessaging.Error.class, 404, "The passed userId does not exist "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.skillMessaging.Error.class, 429, "The requester has exceeded their maximum allowable rate of messages "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.skillMessaging.Error.class, 500, "The SkillMessaging service encountered an internal error for a valid request. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.skillMessaging.Error.class, 0, "Unexpected error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, path, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, sendSkillMessagingRequest, null, false);
  }

  /**
   * 
   * Send a message request to a skill for a specified user.
   * @param userId The user Id for the specific user to send the message (required)
   * @param sendSkillMessagingRequest Message Request to be sent to the skill. (required)
   * @throws ServiceException if fails to make API call
   */
  public void sendSkillMessage(String userId, com.amazon.ask.model.services.skillMessaging.SendSkillMessagingRequest sendSkillMessagingRequest) throws ServiceException {
    this.callSendSkillMessage(userId, sendSkillMessagingRequest).getResponse();
  }

}
