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


package com.amazon.ask.model.slu.entityresolution;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Indication of the results of attempting to resolve the user utterance against the defined slot types.
 */
public enum StatusCode {
  
  ER_SUCCESS_MATCH("ER_SUCCESS_MATCH"),
  
  ER_SUCCESS_NO_MATCH("ER_SUCCESS_NO_MATCH"),
  
  ER_ERROR_TIMEOUT("ER_ERROR_TIMEOUT"),
  
  ER_ERROR_EXCEPTION("ER_ERROR_EXCEPTION"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private Object value;

  StatusCode(Object value) {
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
  public static StatusCode fromValue(String text) {
    for (StatusCode b : StatusCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return StatusCode.UNKNOWN_TO_SDK_VERSION;
  }
}

