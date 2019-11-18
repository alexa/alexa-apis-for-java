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


package com.amazon.ask.model.interfaces.monetization.v1;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Response from purchase directives:   * ACCEPTED - User have accepted the offer to purchase the product   * DECLINED - User have declined the offer to purchase the product   * NOT_ENTITLED - User tries to cancel/return a product he/she is  not entitled to.   * ALREADY_PURCHASED - User has already purchased the product   * ERROR - An internal error occurred 
 */
public enum PurchaseResult {
  
  ACCEPTED("ACCEPTED"),
  
  DECLINED("DECLINED"),
  
  NOT_ENTITLED("NOT_ENTITLED"),
  
  ERROR("ERROR"),
  
  ALREADY_PURCHASED("ALREADY_PURCHASED"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  PurchaseResult(String value) {
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
  public static PurchaseResult fromValue(String text) {
    for (PurchaseResult b : PurchaseResult.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return PurchaseResult.UNKNOWN_TO_SDK_VERSION;
  }
}

