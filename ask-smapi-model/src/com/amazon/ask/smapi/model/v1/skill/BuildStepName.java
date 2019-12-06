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
 * Name of the build step. Possible values - * `DIALOG_MODEL_BUILD` - Build status for dialog model. * `LANGUAGE_MODEL_QUICK_BUILD` - Build status for FST model. * `LANGUAGE_MODEL_FULL_BUILD` - Build status for statistical model. 
 */
public enum BuildStepName {
  
  DIALOG_MODEL_BUILD("DIALOG_MODEL_BUILD"),
  
  LANGUAGE_MODEL_QUICK_BUILD("LANGUAGE_MODEL_QUICK_BUILD"),
  
  LANGUAGE_MODEL_FULL_BUILD("LANGUAGE_MODEL_FULL_BUILD"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  BuildStepName(String value) {
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
  public static BuildStepName fromValue(String text) {
    for (BuildStepName b : BuildStepName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return BuildStepName.UNKNOWN_TO_SDK_VERSION;
  }
}

