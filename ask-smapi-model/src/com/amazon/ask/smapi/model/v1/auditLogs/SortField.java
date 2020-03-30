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


package com.amazon.ask.smapi.model.v1.auditLogs;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Sets the field on which the sorting would be applied.
 */
public enum SortField {
  
  TIMESTAMP("timestamp"),
  
  OPERATION("operation"),
  
  RESOURCE_ID("resource.id"),
  
  RESOURCE_TYPE("resource.type"),
  
  REQUESTER_USERID("requester.userId"),
  
  CLIENT_ID("client.id"),
  
  HTTPRESPONSECODE("httpResponseCode"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  SortField(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SortField fromValue(String text) {
    for (SortField b : SortField.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return SortField.UNKNOWN_TO_SDK_VERSION;
  }
}

