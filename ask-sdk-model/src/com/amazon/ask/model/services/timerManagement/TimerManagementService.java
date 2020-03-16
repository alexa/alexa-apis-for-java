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

package com.amazon.ask.model.services.timerManagement;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;

import java.util.ArrayList;
import java.util.List;



public interface TimerManagementService {

    void deleteTimers() throws ServiceException;

    ApiResponse<Void> callDeleteTimers() throws ServiceException;


    com.amazon.ask.model.services.timerManagement.TimersResponse getTimers() throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.timerManagement.TimersResponse> callGetTimers() throws ServiceException;


    void deleteTimer(String id) throws ServiceException;

    ApiResponse<Void> callDeleteTimer(String id) throws ServiceException;


    com.amazon.ask.model.services.timerManagement.TimerResponse getTimer(String id) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.timerManagement.TimerResponse> callGetTimer(String id) throws ServiceException;


    void pauseTimer(String id) throws ServiceException;

    ApiResponse<Void> callPauseTimer(String id) throws ServiceException;


    void resumeTimer(String id) throws ServiceException;

    ApiResponse<Void> callResumeTimer(String id) throws ServiceException;


    com.amazon.ask.model.services.timerManagement.TimerResponse createTimer(com.amazon.ask.model.services.timerManagement.TimerRequest timerRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.timerManagement.TimerResponse> callCreateTimer(com.amazon.ask.model.services.timerManagement.TimerRequest timerRequest) throws ServiceException;

}
