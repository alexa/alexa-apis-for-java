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

package com.amazon.ask.model.services.deviceAddress;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class DeviceAddressServiceClient extends BaseServiceClient implements DeviceAddressService {

  private final UserAgentHelper userAgentHelper;
  public DeviceAddressServiceClient(ApiConfiguration apiConfiguration) {
      super(apiConfiguration);
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.60.0").build();
  }

  /**
   * 
   * Gets the country and postal code of a device 
   * @param deviceId The device Id for which to get the country and postal code (required)
   * @return com.amazon.ask.model.services.deviceAddress.ShortAddress
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.deviceAddress.ShortAddress> callGetCountryAndPostalCode(String deviceId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("deviceId", deviceId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/devices/{deviceId}/settings/address/countryAndPostalCode";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.ShortAddress.class, 200, "Successfully get the country and postal code of the deviceId"));
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No content could be queried out"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.Error.class, 403, "The authentication token is invalid or doesn't have access to the resource"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.Error.class, 405, "The method is not supported"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.Error.class, 429, "The request is throttled"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.Error.class, 0, "Unexpected error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.deviceAddress.ShortAddress.class, false);
  }

  /**
   * 
   * Gets the country and postal code of a device 
   * @param deviceId The device Id for which to get the country and postal code (required)
   * @return com.amazon.ask.model.services.deviceAddress.ShortAddress
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.deviceAddress.ShortAddress getCountryAndPostalCode(String deviceId) throws ServiceException {
    return this.callGetCountryAndPostalCode(deviceId).getResponse();
  }

  /**
   * 
   * Gets the address of a device 
   * @param deviceId The device Id for which to get the address (required)
   * @return com.amazon.ask.model.services.deviceAddress.Address
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.deviceAddress.Address> callGetFullAddress(String deviceId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("deviceId", deviceId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/devices/{deviceId}/settings/address";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.Address.class, 200, "Successfully get the address of the device"));
    serviceResponseDefinitions.add(new ServiceClientResponse(null, 204, "No content could be queried out"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.Error.class, 403, "The authentication token is invalid or doesn't have access to the resource"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.Error.class, 405, "The method is not supported"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.Error.class, 429, "The request is throttled"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.deviceAddress.Error.class, 0, "Unexpected error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.deviceAddress.Address.class, false);
  }

  /**
   * 
   * Gets the address of a device 
   * @param deviceId The device Id for which to get the address (required)
   * @return com.amazon.ask.model.services.deviceAddress.Address
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.deviceAddress.Address getFullAddress(String deviceId) throws ServiceException {
    return this.callGetFullAddress(deviceId).getResponse();
  }

}
