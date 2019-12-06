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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The minimum version of pre-defined templates supported by the skill. If a device does not support a version greater than or equal to the version specified her then templateVersion will not be passed inside the Display interface in the ASK request.
 */
public enum DisplayInterfaceTemplateVersion {
  
  _1("1"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  DisplayInterfaceTemplateVersion(String value) {
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
  public static DisplayInterfaceTemplateVersion fromValue(String text) {
    for (DisplayInterfaceTemplateVersion b : DisplayInterfaceTemplateVersion.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return DisplayInterfaceTemplateVersion.UNKNOWN_TO_SDK_VERSION;
  }
}

