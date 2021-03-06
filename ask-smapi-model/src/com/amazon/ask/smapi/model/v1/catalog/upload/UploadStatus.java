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


package com.amazon.ask.smapi.model.v1.catalog.upload;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of the entire upload.
 */
public enum UploadStatus {
  
  PENDING("PENDING"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  FAILED("FAILED"),
  
  SUCCEEDED("SUCCEEDED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  UploadStatus(String value) {
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
  public static UploadStatus fromValue(String text) {
    for (UploadStatus b : UploadStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return UploadStatus.UNKNOWN_TO_SDK_VERSION;
  }
}

