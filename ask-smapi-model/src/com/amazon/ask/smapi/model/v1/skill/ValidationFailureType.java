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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enum for type of validation failure in the request.
 */
public enum ValidationFailureType {
  
  RESOURCE_DOES_NOT_EXIST("RESOURCE_DOES_NOT_EXIST"),
  
  RESOURCE_VERSION_DOES_NOT_MATCH("RESOURCE_VERSION_DOES_NOT_MATCH"),
  
  MALFORMED_INPUT("MALFORMED_INPUT"),
  
  EXPECTED_NOT_EMPTY_VALUE("EXPECTED_NOT_EMPTY_VALUE"),
  
  INVALID_NUMBER_OF_OCCURENCES("INVALID_NUMBER_OF_OCCURENCES"),
  
  INVALID_NUMBER_OF_PROPERTIES("INVALID_NUMBER_OF_PROPERTIES"),
  
  EXPECTED_ATLEAST_ONE_RELATED_INSTANCE("EXPECTED_ATLEAST_ONE_RELATED_INSTANCE"),
  
  EXPECTED_EXACTLY_ONE_RELATED_INSTANCE("EXPECTED_EXACTLY_ONE_RELATED_INSTANCE"),
  
  RESOURCE_LOCKED("RESOURCE_LOCKED"),
  
  UNEXPECTED_RESOURCE_STAGE("UNEXPECTED_RESOURCE_STAGE"),
  
  UNEXPECTED_RESOURCE_PROPERTY("UNEXPECTED_RESOURCE_PROPERTY"),
  
  MISSING_RESOURCE_PROPERTY("MISSING_RESOURCE_PROPERTY"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  ValidationFailureType(String value) {
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
  public static ValidationFailureType fromValue(String text) {
    for (ValidationFailureType b : ValidationFailureType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return ValidationFailureType.UNKNOWN_TO_SDK_VERSION;
  }
}

