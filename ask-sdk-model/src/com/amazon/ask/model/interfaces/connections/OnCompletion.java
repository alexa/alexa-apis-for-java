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


package com.amazon.ask.model.interfaces.connections;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * This defines the callback mechanism when the task is completed, i.e., whether the requester wants to be resumed after the task is fulfilled or just be notified about errors without being resumed.
 */
public enum OnCompletion {
  
  RESUME_SESSION("RESUME_SESSION"),
  
  SEND_ERRORS_ONLY("SEND_ERRORS_ONLY"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  OnCompletion(String value) {
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
  public static OnCompletion fromValue(String text) {
    for (OnCompletion b : OnCompletion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return OnCompletion.UNKNOWN_TO_SDK_VERSION;
  }
}

