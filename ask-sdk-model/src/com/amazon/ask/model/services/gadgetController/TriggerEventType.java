/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


package com.amazon.ask.model.services.gadgetController;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The action that triggers the animation. Possible values are as follows   * `buttonDown` - Play the animation when the button is pressed.   * `buttonUp` - Play the animation when the button is released.   * `none` - Play the animation as soon as it arrives. 
 */
public enum TriggerEventType {
  
  BUTTONDOWN("buttonDown"),
  
  BUTTONUP("buttonUp"),
  
  NONE("none");

  private String value;

  TriggerEventType(String value) {
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
  public static TriggerEventType fromValue(String text) {
    for (TriggerEventType b : TriggerEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

