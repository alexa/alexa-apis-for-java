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

import java.util.ArrayList;
import java.util.List;



public interface UpsService {

    String getProfileEmail() throws ServiceException;

    ApiResponse<String> callGetProfileEmail() throws ServiceException;


    String getProfileGivenName() throws ServiceException;

    ApiResponse<String> callGetProfileGivenName() throws ServiceException;


    com.amazon.ask.model.services.ups.PhoneNumber getProfileMobileNumber() throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.ups.PhoneNumber> callGetProfileMobileNumber() throws ServiceException;


    String getProfileName() throws ServiceException;

    ApiResponse<String> callGetProfileName() throws ServiceException;


    com.amazon.ask.model.services.ups.DistanceUnits getSystemDistanceUnits(String deviceId) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.ups.DistanceUnits> callGetSystemDistanceUnits(String deviceId) throws ServiceException;


    com.amazon.ask.model.services.ups.TemperatureUnit getSystemTemperatureUnit(String deviceId) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.ups.TemperatureUnit> callGetSystemTemperatureUnit(String deviceId) throws ServiceException;


    String getSystemTimeZone(String deviceId) throws ServiceException;

    ApiResponse<String> callGetSystemTimeZone(String deviceId) throws ServiceException;


    String getPersonsProfileGivenName() throws ServiceException;

    ApiResponse<String> callGetPersonsProfileGivenName() throws ServiceException;


    com.amazon.ask.model.services.ups.PhoneNumber getPersonsProfileMobileNumber() throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.ups.PhoneNumber> callGetPersonsProfileMobileNumber() throws ServiceException;


    String getPersonsProfileName() throws ServiceException;

    ApiResponse<String> callGetPersonsProfileName() throws ServiceException;

}
