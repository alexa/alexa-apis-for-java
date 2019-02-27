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

import java.util.ArrayList;
import java.util.List;



public interface UpsService {
    String getProfileEmail() throws com.amazon.ask.model.services.ServiceException;
    String getProfileGivenName() throws com.amazon.ask.model.services.ServiceException;
    com.amazon.ask.model.services.ups.PhoneNumber getProfileMobileNumber() throws com.amazon.ask.model.services.ServiceException;
    String getProfileName() throws com.amazon.ask.model.services.ServiceException;
    com.amazon.ask.model.services.ups.DistanceUnits getSystemDistanceUnits(String deviceId) throws com.amazon.ask.model.services.ServiceException;
    com.amazon.ask.model.services.ups.TemperatureUnit getSystemTemperatureUnit(String deviceId) throws com.amazon.ask.model.services.ServiceException;
    String getSystemTimeZone(String deviceId) throws com.amazon.ask.model.services.ServiceException;
}
