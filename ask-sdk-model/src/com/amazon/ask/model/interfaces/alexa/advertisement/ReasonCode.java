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


package com.amazon.ask.model.interfaces.alexa.advertisement;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The enum represents various details explaining why the ad is not being rendered.
 */
public enum ReasonCode {
  
  DEVICE_OCCUPIED("DEVICE_OCCUPIED"),
  
  UNSUPPORTED_DEVICE("UNSUPPORTED_DEVICE"),
  
  SKILL_DAILY_CAP_LIMIT_REACHED("SKILL_DAILY_CAP_LIMIT_REACHED"),
  
  DOMAIN_DAILY_CAP_LIMIT_REACHED("DOMAIN_DAILY_CAP_LIMIT_REACHED"),
  
  INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),
  
  AD_NOT_AVAILABLE("AD_NOT_AVAILABLE"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private Object value;

  ReasonCode(Object value) {
    this.value = value;
  }

  @JsonValue
  public Object getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReasonCode fromValue(String text) {
    for (ReasonCode b : ReasonCode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return ReasonCode.UNKNOWN_TO_SDK_VERSION;
  }
}

