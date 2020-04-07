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


package com.amazon.ask.smapi.model.v1.skill.interactionModel;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Skill's sensitivity level for out-of-domain utterances. By default, the sensitivity level of the skill is set to ‘LOW’. As the sensitivity level for a skill is increased, more customer utterances that are not supported by the skill will be captured by AMAZON.FallbackIntent. 
 */
public enum FallbackIntentSensitivityLevel {
  
  HIGH("HIGH"),
  
  MEDIUM("MEDIUM"),
  
  LOW("LOW"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  FallbackIntentSensitivityLevel(String value) {
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
  public static FallbackIntentSensitivityLevel fromValue(String text) {
    for (FallbackIntentSensitivityLevel b : FallbackIntentSensitivityLevel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return FallbackIntentSensitivityLevel.UNKNOWN_TO_SDK_VERSION;
  }
}

