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
 * These states are for recording the destination state from a transition action (Created, Pilot, Start, Stop) on the experiment. * `CREATED`: Result state for the 'Create' action. Experiment has been created. * `ENABLED`: Result state for the 'Pilot' action. Experiment configurations are deployed and customer overrides are activated. Actual experiment has not started yet. * `RUNNING`: Result state for the 'Start' action. Experiment has started with the configured exposure. Skill customers selected within the exposure are contributing to the metric data. * `STOPPED`: Result state for the 'Stop' action. Experiment has stopped and all experiment configurations have been removed. All customers will see the C behavior by default. 
 */
public enum DestinationState {
  
  CREATED("CREATED"),
  
  ENABLED("ENABLED"),
  
  RUNNING("RUNNING"),
  
  STOPPED("STOPPED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  DestinationState(String value) {
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
  public static DestinationState fromValue(String text) {
    for (DestinationState b : DestinationState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return DestinationState.UNKNOWN_TO_SDK_VERSION;
  }
}

