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
 * Hosted skill lambda runtime; Node.js 10.x is deprecated by Hosted Skill service as of April 30, 2021.
 */
public enum HostedSkillRuntime {
  
  NODE_10_X("NODE_10_X"),
  
  PYTHON_3_7("PYTHON_3_7"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  HostedSkillRuntime(String value) {
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
  public static HostedSkillRuntime fromValue(String text) {
    for (HostedSkillRuntime b : HostedSkillRuntime.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return HostedSkillRuntime.UNKNOWN_TO_SDK_VERSION;
  }
}

