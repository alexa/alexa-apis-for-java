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


package com.amazon.ask.smapi.model.v1.skill.AlexaHosted;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets v1.skill.AlexaHosted.HostedSkillPermissionStatus
 */
public enum HostedSkillPermissionStatus {
  
  ALLOWED("ALLOWED"),
  
  NEW_USER_REGISTRATION_REQUIRED("NEW_USER_REGISTRATION_REQUIRED"),
  
  RESOURCE_LIMIT_EXCEEDED("RESOURCE_LIMIT_EXCEEDED"),
  
  RATE_EXCEEDED("RATE_EXCEEDED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  HostedSkillPermissionStatus(String value) {
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
  public static HostedSkillPermissionStatus fromValue(String text) {
    for (HostedSkillPermissionStatus b : HostedSkillPermissionStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return HostedSkillPermissionStatus.UNKNOWN_TO_SDK_VERSION;
  }
}

