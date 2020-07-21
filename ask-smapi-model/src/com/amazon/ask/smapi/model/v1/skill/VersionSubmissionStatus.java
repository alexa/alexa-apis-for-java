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
 * The lifecycle status of the skill version submission. * `LIVE` - The skill version is in the live stage * `CERTIFIED` - The skill version has gone through the certification review process and has been certified. * `IN_REVIEW` - The skill version is currently under review for certification and publication. During this time, you cannot edit the configuration. * `FAILED_CERTIFICATION` - The skill version has been submitted for certification, however it has failed certification review. Please submit a new version for certification. * `HIDDEN` - The skill version has been published but is no longer available to new users for activation. Existing users can still invoke this skill if it is the most recent version. * `REMOVED` - The skill version has been published but removed for use, due to Amazon's policy violation. You can update your skill and publish a new version to live to address the policy violation. * `WITHDRAWN_FROM_CERTIFICATION` - The skill version was submitted for certification but was withdrawn from review. 
 */
public enum VersionSubmissionStatus {
  
  LIVE("LIVE"),
  
  CERTIFIED("CERTIFIED"),
  
  IN_REVIEW("IN_REVIEW"),
  
  FAILED_CERTIFICATION("FAILED_CERTIFICATION"),
  
  HIDDEN("HIDDEN"),
  
  REMOVED("REMOVED"),
  
  WITHDRAWN_FROM_CERTIFICATION("WITHDRAWN_FROM_CERTIFICATION"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  VersionSubmissionStatus(String value) {
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
  public static VersionSubmissionStatus fromValue(String text) {
    for (VersionSubmissionStatus b : VersionSubmissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return VersionSubmissionStatus.UNKNOWN_TO_SDK_VERSION;
  }
}

