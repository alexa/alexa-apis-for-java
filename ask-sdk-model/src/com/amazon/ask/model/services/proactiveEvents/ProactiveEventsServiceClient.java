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

package com.amazon.ask.model.services.proactiveEvents;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class ProactiveEventsServiceClient extends BaseServiceClient implements ProactiveEventsService {

  private final UserAgentHelper userAgentHelper;
  private final LwaClient lwaClient;

  public ProactiveEventsServiceClient(ApiConfiguration apiConfiguration, AuthenticationConfiguration authenticationConfiguration) {
      super(apiConfiguration);
      this.lwaClient = LwaClient.builder()
          .withAuthenticationConfiguration(authenticationConfiguration)
          .withGrantType(GrantType.CLIENT_CREDENTIALS)
          .withApiConfiguration(DefaultApiConfiguration.builder()
                                    .withApiClient(apiConfiguration.getApiClient())
                                    .withSerializer(apiConfiguration.getSerializer())
                                    .build())
          .build();
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.42.0").build();
  }

  public ProactiveEventsServiceClient(ApiConfiguration apiConfiguration, LwaClient lwaClient) {
      super(apiConfiguration);
      this.lwaClient = lwaClient;
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.42.0").build();
  }

  /**
   * 
   * Create a new proactive event in live stage.
   * @param createProactiveEventRequest Request to create a new proactive event. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callCreateProactiveEvent(com.amazon.ask.model.services.proactiveEvents.CreateProactiveEventRequest createProactiveEventRequest, com.amazon.ask.model.services.proactiveEvents.SkillStage stage) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String accessToken = lwaClient.getAccessTokenForScope("alexa::proactive_events");
    headerParams.add(new Pair<>("Authorization", "Bearer " + accessToken));

    String resourcePath = "/v1/proactiveEvents";
    if (stage == com.amazon.ask.model.services.proactiveEvents.SkillStage.DEVELOPMENT) {
      resourcePath += "/stages/development";
    }

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 202, "Request accepted"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.proactiveEvents.Error.class, 400, "A required parameter is not present or is incorrectly formatted, or the requested creation of a resource has already been completed by a previous request. "));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.proactiveEvents.Error.class, 403, "The authentication token is invalid or doesn't have authentication to access the resource"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.proactiveEvents.Error.class, 409, "A skill attempts to create duplicate events using the same referenceId for the same customer."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.proactiveEvents.Error.class, 429, "The client has made more calls than the allowed limit."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.proactiveEvents.Error.class, 500, "The ProactiveEvents service encounters an internal error for a valid request."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.proactiveEvents.Error.class, 0, "Unexpected error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, createProactiveEventRequest, null, false);
  }

  /**
   * 
   * Create a new proactive event in live stage.
   * @param createProactiveEventRequest Request to create a new proactive event. (required)
   * @throws ServiceException if fails to make API call
   */
  public void createProactiveEvent(com.amazon.ask.model.services.proactiveEvents.CreateProactiveEventRequest createProactiveEventRequest, com.amazon.ask.model.services.proactiveEvents.SkillStage stage) throws ServiceException {
    this.callCreateProactiveEvent(createProactiveEventRequest, stage).getResponse();
  }

}
