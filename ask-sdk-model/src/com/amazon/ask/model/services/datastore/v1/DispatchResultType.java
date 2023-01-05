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


package com.amazon.ask.model.services.datastore.v1;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines success or a type of error from dispatch. * `SUCCESS` - device has received the payload. * `INVALID_DEVICE` - device is not capable of processing the payload. * `DEVICE_UNAVAILABLE` - dispatch failed because device is offline. * `DEVICE_PERMANENTLY_UNAVAILABLE` - target no longer available to receive data. This is reported for a failed delivery attempt related to an unregistered device. * `CONCURRENCY_ERROR` - there are concurrent attempts to update to the same device. * `INTERNAL_ERROR`- dispatch failed because of unknown error - see message. 
 */
public enum DispatchResultType {
  
  SUCCESS("SUCCESS"),
  
  INVALID_DEVICE("INVALID_DEVICE"),
  
  DEVICE_UNAVAILABLE("DEVICE_UNAVAILABLE"),
  
  DEVICE_PERMANENTLY_UNAVAILABLE("DEVICE_PERMANENTLY_UNAVAILABLE"),
  
  CONCURRENCY_ERROR("CONCURRENCY_ERROR"),
  
  INTERNAL_ERROR("INTERNAL_ERROR"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  DispatchResultType(String value) {
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
  public static DispatchResultType fromValue(String text) {
    for (DispatchResultType b : DispatchResultType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return DispatchResultType.UNKNOWN_TO_SDK_VERSION;
  }
}

