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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The reason to withdraw.
 */
public enum Reason {
  
  TEST_SKILL("TEST_SKILL"),
  
  MORE_FEATURES("MORE_FEATURES"),
  
  DISCOVERED_ISSUE("DISCOVERED_ISSUE"),
  
  NOT_RECEIVED_CERTIFICATION_FEEDBACK("NOT_RECEIVED_CERTIFICATION_FEEDBACK"),
  
  NOT_INTEND_TO_PUBLISH("NOT_INTEND_TO_PUBLISH"),
  
  OTHER("OTHER"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  Reason(String value) {
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
  public static Reason fromValue(String text) {
    for (Reason b : Reason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return Reason.UNKNOWN_TO_SDK_VERSION;
  }
}

