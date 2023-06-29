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

package com.amazon.ask.model.services.directive;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class DirectiveServiceClient extends BaseServiceClient implements DirectiveService {

  private final UserAgentHelper userAgentHelper;
  public DirectiveServiceClient(ApiConfiguration apiConfiguration) {
      super(apiConfiguration);
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.73.0").build();
  }

  /**
   * 
   * Send directives to Alexa.
   * @param sendDirectiveRequest Represents the request object to send in the payload. (required)
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Void> callEnqueue(com.amazon.ask.model.services.directive.SendDirectiveRequest sendDirectiveRequest) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/directives";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "Directive sent successfully."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.directive.Error.class, 400, "Directive not valid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.directive.Error.class, 401, "Not Authorized."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.directive.Error.class, 403, "The skill is not allowed to send directives at the moment."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.directive.Error.class, 0, "Unexpected error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("POST", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, sendDirectiveRequest, null, false);
  }

  /**
   * 
   * Send directives to Alexa.
   * @param sendDirectiveRequest Represents the request object to send in the payload. (required)
   * @throws ServiceException if fails to make API call
   */
  public void enqueue(com.amazon.ask.model.services.directive.SendDirectiveRequest sendDirectiveRequest) throws ServiceException {
    this.callEnqueue(sendDirectiveRequest).getResponse();
  }

}
