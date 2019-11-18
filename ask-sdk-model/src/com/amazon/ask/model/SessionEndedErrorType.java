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


package com.amazon.ask.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A string indicating the type of error that occurred.
 */
public enum SessionEndedErrorType {
  
  INVALID_RESPONSE("INVALID_RESPONSE"),
  
  DEVICE_COMMUNICATION_ERROR("DEVICE_COMMUNICATION_ERROR"),
  
  INTERNAL_SERVICE_ERROR("INTERNAL_SERVICE_ERROR"),
  
  ENDPOINT_TIMEOUT("ENDPOINT_TIMEOUT"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private Object value;

  SessionEndedErrorType(Object value) {
    this.value = value;
  }

  @JsonValue
  public Object getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SessionEndedErrorType fromValue(String text) {
    for (SessionEndedErrorType b : SessionEndedErrorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return SessionEndedErrorType.UNKNOWN_TO_SDK_VERSION;
  }
}

