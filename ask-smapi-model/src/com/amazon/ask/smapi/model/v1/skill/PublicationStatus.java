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
 * Publication status of the skill. It is associated with the skill's stage. Skill in 'development' stage can have publication status as 'DEVELOPMENT' or 'CERTIFICATION'. Skill in 'certified' stage can have publication status as 'CERTIFIED'. 'Skill in 'live' stage can have publication status as 'PUBLISHED', 'HIDDEN' or 'REMOVED'. * `DEVELOPMENT` - The skill is available only to you. If you have enabled it for testing, you can test it on devices registered to your developer account. * `CERTIFICATION` - Amazon is currently reviewing the skill for publication. During this time, you cannot edit the configuration. * `CERTIFIED` - The skill has been certified and ready to be published. Skill can be either published immediately or an future release date can be set for the skill. You cannot edit the configuration for the certified skills. To start development, make your changes on the development version. * `PUBLISHED` - The skill has been published and is available to users. You cannot edit the configuration for live skills. To start development on an updated version, make your changes on the development version instead. * `HIDDEN` - The skill has been published but is no longer available to new users for activation. Existing users can still invoke this skill. * `REMOVED` - The skill has been published but removed for use, due to Amazon's policy violation. You can update your skill and publish a new version to live to address the policy violation. 
 */
public enum PublicationStatus {
  
  DEVELOPMENT("DEVELOPMENT"),
  
  CERTIFICATION("CERTIFICATION"),
  
  CERTIFIED("CERTIFIED"),
  
  PUBLISHED("PUBLISHED"),
  
  HIDDEN("HIDDEN"),
  
  REMOVED("REMOVED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  PublicationStatus(String value) {
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
  public static PublicationStatus fromValue(String text) {
    for (PublicationStatus b : PublicationStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return PublicationStatus.UNKNOWN_TO_SDK_VERSION;
  }
}

