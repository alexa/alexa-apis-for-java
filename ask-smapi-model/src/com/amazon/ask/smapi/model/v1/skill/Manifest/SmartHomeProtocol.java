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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Version of the Smart Home API. Default and recommended value is '3'. You may create a skill with version '2' for testing migration to version '3', but a skill submission using version '2' will not be certified.
 */
public enum SmartHomeProtocol {
  
  _1("1"),
  
  _2("2"),
  
  _2_5("2.5"),
  
  _2_9("2.9"),
  
  _3("3"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  SmartHomeProtocol(String value) {
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
  public static SmartHomeProtocol fromValue(String text) {
    for (SmartHomeProtocol b : SmartHomeProtocol.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return SmartHomeProtocol.UNKNOWN_TO_SDK_VERSION;
  }
}

