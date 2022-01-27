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
 * These states are used to perform a transition action (Pilot, Start, Stop, Conclude) on the experiment. * `ENABLED`: Target state for the 'Pilot' action. Experiment configurations are deployed and customer overrides are activated. Actual experiment has not started yet. * `RUNNING`: Target state for the 'Start' action. Experiment has started with the configured exposure. Skill customers selected within the exposure are contributing to the metric data. * `STOPPED`: Target state for the 'Stop' action. Experiment has stopped and all experiment configurations have been removed. All customers will see the C behavior by default. 
 */
public enum TargetState {
  
  ENABLED("ENABLED"),
  
  RUNNING("RUNNING"),
  
  STOPPED("STOPPED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  TargetState(String value) {
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
  public static TargetState fromValue(String text) {
    for (TargetState b : TargetState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return TargetState.UNKNOWN_TO_SDK_VERSION;
  }
}

