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


package com.amazon.ask.smapi.model.v1.skill.history;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indicates if the utterance was executed as a \"ONE_SHOT\" interaction or \"MODAL\" interaction. * `ONE_SHOT`: The user invokes the skill and states their intent in a single phrase. * `MODAL`: The user first invokes the skill and then states their intent. 
 */
public enum InteractionType {
  
  ONE_SHOT("ONE_SHOT"),
  
  MODAL("MODAL"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  InteractionType(String value) {
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
  public static InteractionType fromValue(String text) {
    for (InteractionType b : InteractionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return InteractionType.UNKNOWN_TO_SDK_VERSION;
  }
}

