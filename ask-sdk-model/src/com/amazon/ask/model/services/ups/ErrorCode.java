/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A more precise error code. Some of these codes may not apply to some APIs.   - INVALID_KEY: the setting key is not supported   - INVALID_VALUE: the setting value is not valid   - INVALID_TOKEN: the token is invalid   - INVALID_URI: the uri is invalid   - DEVICE_UNREACHABLE: the device is offline   - UNKNOWN_ERROR: internal service error 
 */
public enum ErrorCode {
  
  INVALID_KEY("INVALID_KEY"),
  
  INVALID_VALUE("INVALID_VALUE"),
  
  INVALID_TOKEN("INVALID_TOKEN"),
  
  INVALID_URI("INVALID_URI"),
  
  DEVICE_UNREACHABLE("DEVICE_UNREACHABLE"),
  
  UNKNOWN_ERROR("UNKNOWN_ERROR");

  private String value;

  ErrorCode(String value) {
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
  public static ErrorCode fromValue(String text) {
    for (ErrorCode b : ErrorCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

