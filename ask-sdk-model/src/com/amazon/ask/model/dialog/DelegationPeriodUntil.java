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


package com.amazon.ask.model.dialog;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The end of the specified delegation period.   * EXPLICIT_RETURN - delegation lasts until the targeted dialog manager returns a delegate with a new target.   * NEXT_TURN - delegation lasts until the next turn, which resumes with the current focused dialog manager. 
 */
public enum DelegationPeriodUntil {
  
  EXPLICIT_RETURN("EXPLICIT_RETURN"),
  
  NEXT_TURN("NEXT_TURN"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  DelegationPeriodUntil(String value) {
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
  public static DelegationPeriodUntil fromValue(String text) {
    for (DelegationPeriodUntil b : DelegationPeriodUntil.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return DelegationPeriodUntil.UNKNOWN_TO_SDK_VERSION;
  }
}

