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

package com.amazon.ask.model.services.listManagement;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;

import java.util.ArrayList;
import java.util.List;



public interface ListManagementService {

    com.amazon.ask.model.services.listManagement.AlexaListsMetadata getListsMetadata() throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListsMetadata> callGetListsMetadata() throws ServiceException;


    void deleteList(String listId) throws ServiceException;

    ApiResponse<Void> callDeleteList(String listId) throws ServiceException;


    void deleteListItem(String listId, String itemId) throws ServiceException;

    ApiResponse<Void> callDeleteListItem(String listId, String itemId) throws ServiceException;


    com.amazon.ask.model.services.listManagement.AlexaListItem getListItem(String listId, String itemId) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListItem> callGetListItem(String listId, String itemId) throws ServiceException;


    com.amazon.ask.model.services.listManagement.AlexaListItem updateListItem(String listId, String itemId, com.amazon.ask.model.services.listManagement.UpdateListItemRequest updateListItemRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListItem> callUpdateListItem(String listId, String itemId, com.amazon.ask.model.services.listManagement.UpdateListItemRequest updateListItemRequest) throws ServiceException;


    com.amazon.ask.model.services.listManagement.AlexaListItem createListItem(String listId, com.amazon.ask.model.services.listManagement.CreateListItemRequest createListItemRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListItem> callCreateListItem(String listId, com.amazon.ask.model.services.listManagement.CreateListItemRequest createListItemRequest) throws ServiceException;


    com.amazon.ask.model.services.listManagement.AlexaListMetadata updateList(String listId, com.amazon.ask.model.services.listManagement.UpdateListRequest updateListRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListMetadata> callUpdateList(String listId, com.amazon.ask.model.services.listManagement.UpdateListRequest updateListRequest) throws ServiceException;


    com.amazon.ask.model.services.listManagement.AlexaList getList(String listId, String status) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.listManagement.AlexaList> callGetList(String listId, String status) throws ServiceException;


    com.amazon.ask.model.services.listManagement.AlexaListMetadata createList(com.amazon.ask.model.services.listManagement.CreateListRequest createListRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.model.services.listManagement.AlexaListMetadata> callCreateList(com.amazon.ask.model.services.listManagement.CreateListRequest createListRequest) throws ServiceException;

}
