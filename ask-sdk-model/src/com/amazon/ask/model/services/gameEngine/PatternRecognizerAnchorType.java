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


package com.amazon.ask.model.services.gameEngine;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Where the pattern must appear in the history of this input handler. * `start` -  (Default) The first event in the pattern must be the first event in the history of raw Echo Button events. * `end` - The last event in the pattern must be the last event in the history of raw Echo Button events. * `anywhere` - The pattern may appear anywhere in the history of raw Echo Button events. 
 */
public enum PatternRecognizerAnchorType {
  
  START("start"),
  
  END("end"),
  
  ANYWHERE("anywhere"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  PatternRecognizerAnchorType(String value) {
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
  public static PatternRecognizerAnchorType fromValue(String text) {
    for (PatternRecognizerAnchorType b : PatternRecognizerAnchorType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return PatternRecognizerAnchorType.UNKNOWN_TO_SDK_VERSION;
  }
}

