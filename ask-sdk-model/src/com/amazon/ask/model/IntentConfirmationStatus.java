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
 * Indication of whether an intent or slot has been explicitly confirmed or denied by the user, or neither.
 */
public enum IntentConfirmationStatus {
  
  NONE("NONE"),
  
  DENIED("DENIED"),
  
  CONFIRMED("CONFIRMED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private Object value;

  IntentConfirmationStatus(Object value) {
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
  public static IntentConfirmationStatus fromValue(String text) {
    for (IntentConfirmationStatus b : IntentConfirmationStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return IntentConfirmationStatus.UNKNOWN_TO_SDK_VERSION;
  }
}

