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
 * Defines how the skill can be enabled by developers. values can be set to 'PUBLIC' (in Alexa Skill Store), 'ASP' (A4R/A4H vendor devices), or 'A4B' Public and ASP selections must have \"distributionMode\" = 'PUBLIC' and will only be eligible for distribution on personal or vendor (A4H/A4R or A4B) devices.
 */
public enum KnowledgeApisEnablementChannel {
  
  PUBLIC("PUBLIC"),
  
  ASP("ASP"),
  
  A4B("A4B"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  KnowledgeApisEnablementChannel(String value) {
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
  public static KnowledgeApisEnablementChannel fromValue(String text) {
    for (KnowledgeApisEnablementChannel b : KnowledgeApisEnablementChannel.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return KnowledgeApisEnablementChannel.UNKNOWN_TO_SDK_VERSION;
  }
}

