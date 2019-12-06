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


package com.amazon.ask.smapi.model.v1.skill.validations;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * String that specifies the current status of validation execution. Possible values are \"IN_PROGRESS\", \"SUCCESSFUL\", and \"FAILED\". 
 */
public enum ValidationsApiResponseStatus {
  
  IN_PROGRESS("IN_PROGRESS"),
  
  SUCCESSFUL("SUCCESSFUL"),
  
  FAILED("FAILED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  ValidationsApiResponseStatus(String value) {
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
  public static ValidationsApiResponseStatus fromValue(String text) {
    for (ValidationsApiResponseStatus b : ValidationsApiResponseStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return ValidationsApiResponseStatus.UNKNOWN_TO_SDK_VERSION;
  }
}

