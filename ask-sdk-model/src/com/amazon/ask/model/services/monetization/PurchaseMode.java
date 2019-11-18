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
 * Indicates if the entitlements are for TEST or LIVE purchases. * 'TEST' - test purchases made by developers or beta testers. Purchase not sent to payment processing. * 'LIVE' - purchases made by live customers. Purchase sent to payment processing.
 */
public enum PurchaseMode {
  
  TEST("TEST"),
  
  LIVE("LIVE"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private Object value;

  PurchaseMode(Object value) {
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
  public static PurchaseMode fromValue(String text) {
    for (PurchaseMode b : PurchaseMode.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return PurchaseMode.UNKNOWN_TO_SDK_VERSION;
  }
}

