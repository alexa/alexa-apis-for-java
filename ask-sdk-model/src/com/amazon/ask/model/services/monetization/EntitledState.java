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


package com.amazon.ask.model.services.monetization;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * State determining if the user is entitled to the product. Note - Any new values introduced later should be treated as 'NOT_ENTITLED'. * 'ENTITLED' - The user is entitled to the product. * 'NOT_ENTITLED' - The user is not entitled to the product.
 */
public enum EntitledState {
  
  ENTITLED("ENTITLED"),
  
  NOT_ENTITLED("NOT_ENTITLED");

  private Object value;

  EntitledState(Object value) {
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
  public static EntitledState fromValue(String text) {
    for (EntitledState b : EntitledState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

