/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


package com.amazon.ask.model.interfaces.amazonpay.model.v1;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * * This is used to specify applicable payment action. * Authorize – you want to confirm the order and authorize a certain amount, but you do not want to capture at this time. * AuthorizeAndCapture – you want to confirm the order, authorize for the given amount, and capture the funds. 
 */
public enum PaymentAction {
  
  AUTHORIZE("Authorize"),
  
  AUTHORIZEANDCAPTURE("AuthorizeAndCapture");

  private String value;

  PaymentAction(String value) {
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
  public static PaymentAction fromValue(String text) {
    for (PaymentAction b : PaymentAction.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

