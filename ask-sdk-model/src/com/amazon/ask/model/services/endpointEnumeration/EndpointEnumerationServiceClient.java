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

package com.amazon.ask.model.services.endpointEnumeration;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class EndpointEnumerationServiceClient extends BaseServiceClient implements EndpointEnumerationService {

  private final UserAgentHelper userAgentHelper;
  public EndpointEnumerationServiceClient(ApiConfiguration apiConfiguration) {
      super(apiConfiguration);
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.60.0").build();
  }

  /**
   * 
   * This API is invoked by the skill to retrieve endpoints connected to the Echo device. 
   * @return com.amazon.ask.model.services.endpointEnumeration.EndpointEnumerationResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.endpointEnumeration.EndpointEnumerationResponse> callGetEndpoints() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/endpoints";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.endpointEnumeration.EndpointEnumerationResponse.class, 200, "Successfully retrieved the list of connected endpoints."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.endpointEnumeration.Error.class, 400, "Bad request. Returned when a required parameter is not present or badly formatted."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.endpointEnumeration.Error.class, 401, "Unauthenticated. Returned when the request is not authenticated."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.endpointEnumeration.Error.class, 403, "Forbidden. Returned when the request is authenticated but does not have sufficient permission."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.endpointEnumeration.Error.class, 500, "Server Error. Returned when the server encountered an error processing the request."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.endpointEnumeration.Error.class, 503, "Service Unavailable. Returned when the server is not ready to handle the request."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.endpointEnumeration.Error.class, 0, "Unexpected error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.endpointEnumeration.EndpointEnumerationResponse.class, false);
  }

  /**
   * 
   * This API is invoked by the skill to retrieve endpoints connected to the Echo device. 
   * @return com.amazon.ask.model.services.endpointEnumeration.EndpointEnumerationResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.endpointEnumeration.EndpointEnumerationResponse getEndpoints() throws ServiceException {
    return this.callGetEndpoints().getResponse();
  }

}
