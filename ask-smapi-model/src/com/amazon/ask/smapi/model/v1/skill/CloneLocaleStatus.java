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
 * Status for a locale clone on a particular target locale   * `IN_PROGRESS` status would indicate the clone is still in progress to the target locale.   * `SUCCEEDED` status would indicate the source locale was cloned successfully to the target locale.   * `INELIGIBLE` status would indicate the source locale was ineligible to be cloned the target locale.   * `FAILED` status would indicate the source locale was not cloned the target locale successfully.   * `ROLLBACK_SUCCEEDED` status would indicate the locale was rolled back to the previous state in case any failure.   * `ROLLBACK_FAILED` status would indicate that in case of failure, the rollback to the previous state of the locale was attempted, but it failed. 
 */
public enum CloneLocaleStatus {
  
  FAILED("FAILED"),
  
  INELIGIBLE("INELIGIBLE"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  ROLLBACK_FAILED("ROLLBACK_FAILED"),
  
  ROLLBACK_SUCCEEDED("ROLLBACK_SUCCEEDED"),
  
  SUCCEEDED("SUCCEEDED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  CloneLocaleStatus(String value) {
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
  public static CloneLocaleStatus fromValue(String text) {
    for (CloneLocaleStatus b : CloneLocaleStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return CloneLocaleStatus.UNKNOWN_TO_SDK_VERSION;
  }
}

