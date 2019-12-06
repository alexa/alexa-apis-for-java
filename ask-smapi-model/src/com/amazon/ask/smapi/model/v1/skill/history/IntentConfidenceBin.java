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
 * A filter used to retrieve items where the intent confidence bin is equal to the given value. * `HIGH`: Intent was recognized with high confidence. * `MEDIUM`: Intent was recognized with medium confidence. * `LOW`: Intent was recognized with low confidence. Note: Low confidence intents are not sent to the skill. 
 */
public enum IntentConfidenceBin {
  
  HIGH("HIGH"),
  
  MEDIUM("MEDIUM"),
  
  LOW("LOW"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  IntentConfidenceBin(String value) {
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
  public static IntentConfidenceBin fromValue(String text) {
    for (IntentConfidenceBin b : IntentConfidenceBin.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return IntentConfidenceBin.UNKNOWN_TO_SDK_VERSION;
  }
}

