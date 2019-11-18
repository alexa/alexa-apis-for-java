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


package com.amazon.ask.model.services.listManagement;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets services.listManagement.ListState
 */
public enum ListState {
  
  ACTIVE("active"),
  
  ARCHIVED("archived"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private Object value;

  ListState(Object value) {
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
  public static ListState fromValue(String text) {
    for (ListState b : ListState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return ListState.UNKNOWN_TO_SDK_VERSION;
  }
}

