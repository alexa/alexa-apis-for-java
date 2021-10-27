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
 * Supported android common intent. Each of the value maps to a common intent defined in https://developer.android.com/guide/components/intents-common.
 */
public enum AndroidCommonIntentName {
  
  SHOW_IN_MAP("SHOW_IN_MAP"),
  
  ADD_CALENDAR_EVENT("ADD_CALENDAR_EVENT"),
  
  PLAY_MEDIA("PLAY_MEDIA"),
  
  START_PHONE_CALL("START_PHONE_CALL"),
  
  OPEN_SETTINGS("OPEN_SETTINGS"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  AndroidCommonIntentName(String value) {
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
  public static AndroidCommonIntentName fromValue(String text) {
    for (AndroidCommonIntentName b : AndroidCommonIntentName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return AndroidCommonIntentName.UNKNOWN_TO_SDK_VERSION;
  }
}

