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

package com.amazon.ask.model.services.reminderManagement;

import com.amazon.ask.model.services.*;

import java.util.ArrayList;
import java.util.List;



public interface ReminderManagementService {

    void deleteReminder(String alertToken) throws com.amazon.ask.model.services.ServiceException;

    ApiResponse<Void> callDeleteReminder(String alertToken) throws com.amazon.ask.model.services.ServiceException;


    com.amazon.ask.model.services.reminderManagement.GetReminderResponse getReminder(String alertToken) throws com.amazon.ask.model.services.ServiceException;

    ApiResponse<com.amazon.ask.model.services.reminderManagement.GetReminderResponse> callGetReminder(String alertToken) throws com.amazon.ask.model.services.ServiceException;


    com.amazon.ask.model.services.reminderManagement.ReminderResponse updateReminder(String alertToken, com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws com.amazon.ask.model.services.ServiceException;

    ApiResponse<com.amazon.ask.model.services.reminderManagement.ReminderResponse> callUpdateReminder(String alertToken, com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws com.amazon.ask.model.services.ServiceException;


    com.amazon.ask.model.services.reminderManagement.GetRemindersResponse getReminders() throws com.amazon.ask.model.services.ServiceException;

    ApiResponse<com.amazon.ask.model.services.reminderManagement.GetRemindersResponse> callGetReminders() throws com.amazon.ask.model.services.ServiceException;


    com.amazon.ask.model.services.reminderManagement.ReminderResponse createReminder(com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws com.amazon.ask.model.services.ServiceException;

    ApiResponse<com.amazon.ask.model.services.reminderManagement.ReminderResponse> callCreateReminder(com.amazon.ask.model.services.reminderManagement.ReminderRequest reminderRequest) throws com.amazon.ask.model.services.ServiceException;

}
