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

package com.amazon.ask.model.services.datastore;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;

import java.util.ArrayList;
import java.util.List;



public interface DatastoreService {

    com.amazon.ask.model.services.datastore.v1.CommandsResponse commandsV1(com.amazon.ask.model.services.datastore.v1.CommandsRequest commandsRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.datastore.v1.CommandsResponse> callCommandsV1(com.amazon.ask.model.services.datastore.v1.CommandsRequest commandsRequest) throws ServiceException;


    void cancelCommandsV1(String queuedResultId) throws ServiceException;

    ApiResponse<Void> callCancelCommandsV1(String queuedResultId) throws ServiceException;


    com.amazon.ask.model.services.datastore.v1.QueuedResultResponse queuedResultV1(String queuedResultId, Integer maxResults, String nextToken) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.datastore.v1.QueuedResultResponse> callQueuedResultV1(String queuedResultId, Integer maxResults, String nextToken) throws ServiceException;

}
