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


package com.amazon.ask.smapi.model.v1.skill.experiment;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * These states are for recording the previous state from a transition action (Created, Pilot, Start, Stop) on the experiment. * `CREATED`: Result state for the 'Create' action. Experiment has been created. * `ENABLED`: Result state for the 'Pilot' action. Experiment configurations are deployed and customer overrides are activated. Actual experiment has not started yet. * `RUNNING`: Result state for the 'Start' action. Experiment has started with the configured exposure. Skill customers selected within the exposure are contributing to the metric data. 
 */
public enum SourceState {
  
  CREATED("CREATED"),
  
  ENABLED("ENABLED"),
  
  RUNNING("RUNNING"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  SourceState(String value) {
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
  public static SourceState fromValue(String text) {
    for (SourceState b : SourceState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return SourceState.UNKNOWN_TO_SDK_VERSION;
  }
}

