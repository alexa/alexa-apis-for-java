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
 * Transaction status for in skill product purchases. * 'PENDING_APPROVAL_BY_PARENT' - The transaction is pending approval from parent. * 'APPROVED_BY_PARENT' - The transaction was approved by parent and fulfilled successfully.. * 'DENIED_BY_PARENT' - The transaction was declined by parent and hence not fulfilled. * 'EXPIRED_NO_ACTION_BY_PARENT' - The transaction was expired due to no response from parent and hence not fulfilled. * 'ERROR' - The transaction was not fullfiled as there was an error while processing the transaction.
 */
public enum Status {
  
  PENDING_APPROVAL_BY_PARENT("PENDING_APPROVAL_BY_PARENT"),
  
  APPROVED_BY_PARENT("APPROVED_BY_PARENT"),
  
  DENIED_BY_PARENT("DENIED_BY_PARENT"),
  
  EXPIRED_NO_ACTION_BY_PARENT("EXPIRED_NO_ACTION_BY_PARENT"),
  
  ERROR("ERROR");

  private String value;

  Status(String value) {
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
  public static Status fromValue(String text) {
    for (Status b : Status.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

