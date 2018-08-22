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


package com.amazon.ask.model.interfaces.audioplayer;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets interfaces.audioplayer.PlayBehavior
 */
public enum PlayBehavior {
  
  ENQUEUE("ENQUEUE"),
  
  REPLACE_ALL("REPLACE_ALL"),
  
  REPLACE_ENQUEUED("REPLACE_ENQUEUED");

  private Object value;

  PlayBehavior(Object value) {
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
  public static PlayBehavior fromValue(String text) {
    for (PlayBehavior b : PlayBehavior.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

