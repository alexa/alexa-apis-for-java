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


package com.amazon.ask.model.services.monetization;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reason for the entitlement status. * 'PURCHASED' - The user is entitled to the product because they purchased it. * 'NOT_PURCHASED' - The user is not entitled to the product because they have not purchased it. * 'AUTO_ENTITLED' - The user is auto entitled to the product because they have subscribed to a broader service.
 */
public enum EntitlementReason {
  
  PURCHASED("PURCHASED"),
  
  NOT_PURCHASED("NOT_PURCHASED"),
  
  AUTO_ENTITLED("AUTO_ENTITLED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private Object value;

  EntitlementReason(Object value) {
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
  public static EntitlementReason fromValue(String text) {
    for (EntitlementReason b : EntitlementReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return EntitlementReason.UNKNOWN_TO_SDK_VERSION;
  }
}

