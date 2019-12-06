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


package com.amazon.ask.smapi.model.v1;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets v1.StageType
 */
public enum StageType {
  
  DEVELOPMENT("development"),
  
  LIVE("live"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private Object value;

  StageType(Object value) {
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
  public static StageType fromValue(String text) {
    for (StageType b : StageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return StageType.UNKNOWN_TO_SDK_VERSION;
  }
}

