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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Name of the interface.
 */
public enum InterfaceType {
  
  AUDIO_PLAYER("AUDIO_PLAYER"),
  
  VIDEO_APP("VIDEO_APP"),
  
  RENDER_TEMPLATE("RENDER_TEMPLATE"),
  
  GAME_ENGINE("GAME_ENGINE"),
  
  GADGET_CONTROLLER("GADGET_CONTROLLER"),
  
  CAN_FULFILL_INTENT_REQUEST("CAN_FULFILL_INTENT_REQUEST"),
  
  ALEXA_PRESENTATION_APL("ALEXA_PRESENTATION_APL"),
  
  ALEXA_CAMERA_PHOTO_CAPTURE_CONTROLLER("ALEXA_CAMERA_PHOTO_CAPTURE_CONTROLLER"),
  
  ALEXA_CAMERA_VIDEO_CAPTURE_CONTROLLER("ALEXA_CAMERA_VIDEO_CAPTURE_CONTROLLER"),
  
  ALEXA_FILE_MANAGER_UPLOAD_CONTROLLER("ALEXA_FILE_MANAGER_UPLOAD_CONTROLLER"),
  
  CUSTOM_INTERFACE("CUSTOM_INTERFACE"),
  
  ALEXA_AUGMENTATION_EFFECTS_CONTROLLER("ALEXA_AUGMENTATION_EFFECTS_CONTROLLER"),
  
  APP_LINKS("APP_LINKS"),
  
  ALEXA_EXTENSION("ALEXA_EXTENSION"),
  
  APP_LINKS_V2("APP_LINKS_V2"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  InterfaceType(String value) {
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
  public static InterfaceType fromValue(String text) {
    for (InterfaceType b : InterfaceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return InterfaceType.UNKNOWN_TO_SDK_VERSION;
  }
}

