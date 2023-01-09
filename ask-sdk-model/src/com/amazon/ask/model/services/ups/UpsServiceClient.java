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

package com.amazon.ask.model.services.ups;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class UpsServiceClient extends BaseServiceClient implements UpsService {

  private final UserAgentHelper userAgentHelper;
  public UpsServiceClient(ApiConfiguration apiConfiguration) {
      super(apiConfiguration);
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.43.0").build();
  }

  /**
   * 
   * Gets the email address of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:email:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<String> callGetProfileEmail() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/accounts/~current/settings/Profile.email";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, String.class, false);
  }

  /**
   * 
   * Gets the email address of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:email:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getProfileEmail() throws ServiceException {
    return this.callGetProfileEmail().getResponse();
  }

  /**
   * 
   * Gets the given name (first name) of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:given_name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<String> callGetProfileGivenName() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/accounts/~current/settings/Profile.givenName";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, String.class, false);
  }

  /**
   * 
   * Gets the given name (first name) of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:given_name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getProfileGivenName() throws ServiceException {
    return this.callGetProfileGivenName().getResponse();
  }

  /**
   * 
   * Gets the mobile phone number of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:mobile_number:read] 
   * @return com.amazon.ask.model.services.ups.PhoneNumber
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.ups.PhoneNumber> callGetProfileMobileNumber() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/accounts/~current/settings/Profile.mobileNumber";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.PhoneNumber.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.ups.PhoneNumber.class, false);
  }

  /**
   * 
   * Gets the mobile phone number of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:mobile_number:read] 
   * @return com.amazon.ask.model.services.ups.PhoneNumber
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.ups.PhoneNumber getProfileMobileNumber() throws ServiceException {
    return this.callGetProfileMobileNumber().getResponse();
  }

  /**
   * 
   * Gets the full name of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<String> callGetProfileName() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/accounts/~current/settings/Profile.name";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, String.class, false);
  }

  /**
   * 
   * Gets the full name of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getProfileName() throws ServiceException {
    return this.callGetProfileName().getResponse();
  }

  /**
   * 
   * Gets the distance measurement unit of the device. Does not require explict customer consent. 
   * @param deviceId The device Id (required)
   * @return com.amazon.ask.model.services.ups.DistanceUnits
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.ups.DistanceUnits> callGetSystemDistanceUnits(String deviceId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("deviceId", deviceId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/devices/{deviceId}/settings/System.distanceUnits";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.DistanceUnits.class, 200, "Successfully get the setting"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.ups.DistanceUnits.class, false);
  }

  /**
   * 
   * Gets the distance measurement unit of the device. Does not require explict customer consent. 
   * @param deviceId The device Id (required)
   * @return com.amazon.ask.model.services.ups.DistanceUnits
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.ups.DistanceUnits getSystemDistanceUnits(String deviceId) throws ServiceException {
    return this.callGetSystemDistanceUnits(deviceId).getResponse();
  }

  /**
   * 
   * Gets the temperature measurement units of the device. Does not require explict customer consent. 
   * @param deviceId The device Id (required)
   * @return com.amazon.ask.model.services.ups.TemperatureUnit
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.ups.TemperatureUnit> callGetSystemTemperatureUnit(String deviceId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("deviceId", deviceId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/devices/{deviceId}/settings/System.temperatureUnit";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.TemperatureUnit.class, 200, "Successfully get the setting"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.ups.TemperatureUnit.class, false);
  }

  /**
   * 
   * Gets the temperature measurement units of the device. Does not require explict customer consent. 
   * @param deviceId The device Id (required)
   * @return com.amazon.ask.model.services.ups.TemperatureUnit
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.ups.TemperatureUnit getSystemTemperatureUnit(String deviceId) throws ServiceException {
    return this.callGetSystemTemperatureUnit(deviceId).getResponse();
  }

  /**
   * 
   * Gets the time zone of the device. Does not require explict customer consent. 
   * @param deviceId The device Id (required)
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<String> callGetSystemTimeZone(String deviceId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("deviceId", deviceId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/devices/{deviceId}/settings/System.timeZone";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully get the setting"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, String.class, false);
  }

  /**
   * 
   * Gets the time zone of the device. Does not require explict customer consent. 
   * @param deviceId The device Id (required)
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getSystemTimeZone(String deviceId) throws ServiceException {
    return this.callGetSystemTimeZone(deviceId).getResponse();
  }

  /**
   * 
   * Gets the given name (first name) of the recognized speaker at person-level. Requires speaker consent at person-level for scopes: [alexa::profile:given_name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<String> callGetPersonsProfileGivenName() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/persons/~current/profile/givenName";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, String.class, false);
  }

  /**
   * 
   * Gets the given name (first name) of the recognized speaker at person-level. Requires speaker consent at person-level for scopes: [alexa::profile:given_name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getPersonsProfileGivenName() throws ServiceException {
    return this.callGetPersonsProfileGivenName().getResponse();
  }

  /**
   * 
   * Gets the mobile phone number of the recognized speaker at person-level. Requires speaker consent at person-level for scopes: [alexa::profile:mobile_number:read] 
   * @return com.amazon.ask.model.services.ups.PhoneNumber
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.ups.PhoneNumber> callGetPersonsProfileMobileNumber() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/persons/~current/profile/mobileNumber";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.PhoneNumber.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.ups.PhoneNumber.class, false);
  }

  /**
   * 
   * Gets the mobile phone number of the recognized speaker at person-level. Requires speaker consent at person-level for scopes: [alexa::profile:mobile_number:read] 
   * @return com.amazon.ask.model.services.ups.PhoneNumber
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.ups.PhoneNumber getPersonsProfileMobileNumber() throws ServiceException {
    return this.callGetPersonsProfileMobileNumber().getResponse();
  }

  /**
   * 
   * Gets the full name of the recognized speaker at person-level. Requires speaker consent at person-level for scopes: [alexa::profile:name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<String> callGetPersonsProfileName() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v2/persons/~current/profile/name";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, String.class, false);
  }

  /**
   * 
   * Gets the full name of the recognized speaker at person-level. Requires speaker consent at person-level for scopes: [alexa::profile:name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getPersonsProfileName() throws ServiceException {
    return this.callGetPersonsProfileName().getResponse();
  }

}
