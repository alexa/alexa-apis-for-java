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
 * List of standardized error codes
 */
public enum StandardizedErrorCode {
  
  INVALID_DATA_TYPE("INVALID_DATA_TYPE"),
  
  RESOURCE_NOT_FOUND("RESOURCE_NOT_FOUND"),
  
  INVALID_CONTENT_TYPE("INVALID_CONTENT_TYPE"),
  
  INVALID_IMAGE_ATTRIBUTES("INVALID_IMAGE_ATTRIBUTES"),
  
  DENIED_FEATURE_ACCESS("DENIED_FEATURE_ACCESS"),
  
  INVALID_URL_DOMAIN("INVALID_URL_DOMAIN"),
  
  INVALID_URL_FORMAT("INVALID_URL_FORMAT"),
  
  UNEXPECTED_PROPERTY("UNEXPECTED_PROPERTY"),
  
  MISSING_REQUIRED_PROPERTY("MISSING_REQUIRED_PROPERTY"),
  
  UNEXPECTED_EMPTY_OBJECT("UNEXPECTED_EMPTY_OBJECT"),
  
  INVALID_ARRAY_SIZE("INVALID_ARRAY_SIZE"),
  
  DUPLICATE_ARRAY_ITEMS("DUPLICATE_ARRAY_ITEMS"),
  
  INVALID_INTEGER_VALUE("INVALID_INTEGER_VALUE"),
  
  INVALID_STRING_LENGTH("INVALID_STRING_LENGTH"),
  
  INVALID_ENUM_VALUE("INVALID_ENUM_VALUE"),
  
  INVALID_STRING_PATTERN("INVALID_STRING_PATTERN"),
  
  INCONSISTENT_ENDPOINTS("INCONSISTENT_ENDPOINTS"),
  
  MUTUALLY_EXCLUSIVE_ARRAY_ITEMS("MUTUALLY_EXCLUSIVE_ARRAY_ITEMS"),
  
  EXPECTED_RELATED_INSTANCE("EXPECTED_RELATED_INSTANCE"),
  
  CONFLICTING_INSTANCES("CONFLICTING_INSTANCES"),
  
  EXPECTED_COMPLIANCE_AGREEMENT("EXPECTED_COMPLIANCE_AGREEMENT"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  StandardizedErrorCode(String value) {
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
  public static StandardizedErrorCode fromValue(String text) {
    for (StandardizedErrorCode b : StandardizedErrorCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return StandardizedErrorCode.UNKNOWN_TO_SDK_VERSION;
  }
}

