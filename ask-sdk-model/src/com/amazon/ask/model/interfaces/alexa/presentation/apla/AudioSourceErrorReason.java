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


package com.amazon.ask.model.interfaces.alexa.presentation.apla;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The reason for the failure.
 */
public enum AudioSourceErrorReason {
  
  UNKNOWN_ERROR("UNKNOWN_ERROR"),
  
  INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),
  
  NOT_FOUND_ERROR("NOT_FOUND_ERROR"),
  
  SSL_HANDSHAKE_ERROR("SSL_HANDSHAKE_ERROR"),
  
  TIMEOUT_ERROR("TIMEOUT_ERROR"),
  
  INVALID_URI_ERROR("INVALID_URI_ERROR"),
  
  HTTPS_ERROR("HTTPS_ERROR"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  AudioSourceErrorReason(String value) {
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
  public static AudioSourceErrorReason fromValue(String text) {
    for (AudioSourceErrorReason b : AudioSourceErrorReason.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return AudioSourceErrorReason.UNKNOWN_TO_SDK_VERSION;
  }
}

