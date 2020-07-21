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
 * Status for a locale clone request CloneLocale API initiates cloning from a source locale to all target locales.   * `IN_PROGRESS` status would indicate the clone is still in progress.   * `SUCCEEDED` status would indicate the source locale was cloned successfully to all target locales.   * `INELIGIBLE` status would indicate the source locale was ineligible to be cloned to all target locales.   * `MIXED` status would indicate the different status of clone on different locales, and individual target locale statues should be checked.   * `FAILED` status would indicate the source locale was not cloned all target locales successfully despite the request being eligible due to internal service issues.   * `ROLLBACK_SUCCEEDED` status would indicate the skill was rollbacked to the previous state in case any failure.   * `ROLLBACK_FAILED` status would indicate that in case of failure, the rollback to the previous state of the skill was attempted, but it failed. 
 */
public enum CloneLocaleRequestStatus {
  
  FAILED("FAILED"),
  
  INELIGIBLE("INELIGIBLE"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  MIXED("MIXED"),
  
  ROLLBACK_FAILED("ROLLBACK_FAILED"),
  
  ROLLBACK_SUCCEEDED("ROLLBACK_SUCCEEDED"),
  
  SUCCEEDED("SUCCEEDED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  CloneLocaleRequestStatus(String value) {
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
  public static CloneLocaleRequestStatus fromValue(String text) {
    for (CloneLocaleRequestStatus b : CloneLocaleRequestStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return CloneLocaleRequestStatus.UNKNOWN_TO_SDK_VERSION;
  }
}

