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


package com.amazon.ask.smapi.model.v1.skill.metrics;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The aggregation period to use when retrieving the metric, follows ISO_8601#Durations format.
 */
public enum Period {
  
  SINGLE("SINGLE"),
  
  PT15M("PT15M"),
  
  PT1H("PT1H"),
  
  P1D("P1D"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  Period(String value) {
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
  public static Period fromValue(String text) {
    for (Period b : Period.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return Period.UNKNOWN_TO_SDK_VERSION;
  }
}

