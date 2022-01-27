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
 * * `CREATED` - The experiment is successfully created but has not been enabled or started. * `ENABLING` - The experiment has initiated the transition to becoming \"ENABLED\". * `ENABLED` - The experiment configurations have been deployed but only customer treatment overrides set to T1 can view the T1 experience of a skill. No metrics are collected. * `RUNNING` - The experiment has started and a percentage of skill customers defined in the exposurePercentage will be entered into the experiment. Customers will randomly get assigned the T1 or C experience. Metric collection will begin. * `STOPPING` - The experiment has initated the transition to becoming \"STOPPED\". * `STOPPED` - The experiment has ended and all customers will experience the C behavior. Metrics will stop being collected. * `FAILED` - The experiment configurations have failed to deploy while enabling or starting the experiment. 
 */
public enum State {
  
  CREATED("CREATED"),
  
  ENABLING("ENABLING"),
  
  ENABLED("ENABLED"),
  
  RUNNING("RUNNING"),
  
  STOPPING("STOPPING"),
  
  STOPPED("STOPPED"),
  
  FAILED("FAILED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  State(String value) {
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
  public static State fromValue(String text) {
    for (State b : State.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return State.UNKNOWN_TO_SDK_VERSION;
  }
}

