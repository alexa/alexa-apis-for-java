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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The reason for the failure.
 */
public enum ListRuntimeErrorReason {
  
  INVALID_PRESENTATION_TOKEN("INVALID_PRESENTATION_TOKEN"),
  
  INVALID_LIST_ID("INVALID_LIST_ID"),
  
  INVALID_DATASOURCE("INVALID_DATASOURCE"),
  
  INVALID_OPERATION("INVALID_OPERATION"),
  
  MISSING_LIST_VERSION("MISSING_LIST_VERSION"),
  
  DUPLICATE_LIST_VERSION("DUPLICATE_LIST_VERSION"),
  
  LIST_INDEX_OUT_OF_RANGE("LIST_INDEX_OUT_OF_RANGE"),
  
  MISSING_LIST_VERSION_IN_SEND_DATA("MISSING_LIST_VERSION_IN_SEND_DATA"),
  
  LOAD_TIMEOUT("LOAD_TIMEOUT"),
  
  INCONSISTENT_LIST_ID("INCONSISTENT_LIST_ID"),
  
  INCONSISTENT_PAGE_TOKEN("INCONSISTENT_PAGE_TOKEN"),
  
  INCONSISTENT_PAGE_ITEMS("INCONSISTENT_PAGE_ITEMS"),
  
  DUPLICATE_PAGE_TOKEN("DUPLICATE_PAGE_TOKEN"),
  
  OCCUPIED_LIST_INDEX("OCCUPIED_LIST_INDEX"),
  
  LOAD_INDEX_OUT_OF_RANGE("LOAD_INDEX_OUT_OF_RANGE"),
  
  INCONSISTENT_RANGE("INCONSISTENT_RANGE"),
  
  MISSING_LIST_ITEMS("MISSING_LIST_ITEMS"),
  
  INTERNAL_ERROR("INTERNAL_ERROR"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  ListRuntimeErrorReason(String value) {
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
  public static ListRuntimeErrorReason fromValue(String text) {
    for (ListRuntimeErrorReason b : ListRuntimeErrorReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return ListRuntimeErrorReason.UNKNOWN_TO_SDK_VERSION;
  }
}

