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


package com.amazon.ask.smapi.model.v1.isp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Promote this ISP on Amazon channels such as Amazon.com. Enabling this setting will allow customers to view ISP detail pages and purchase the ISP on Amazon.com.
 */
public enum PromotableState {
  
  IN_SKILL_ONLY("IN_SKILL_ONLY"),
  
  ALL_AMAZON_CHANNELS("ALL_AMAZON_CHANNELS"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  PromotableState(String value) {
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
  public static PromotableState fromValue(String text) {
    for (PromotableState b : PromotableState.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return PromotableState.UNKNOWN_TO_SDK_VERSION;
  }
}

