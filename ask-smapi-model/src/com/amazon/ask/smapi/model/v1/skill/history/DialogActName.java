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


package com.amazon.ask.smapi.model.v1.skill.history;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Dialog act directive name. * `Dialog.ElicitSlot`: Alexa asked the user for the value of a specific slot. (https://developer.amazon.com/docs/custom-skills/dialog-interface-reference.html#elicitslot) * `Dialog.ConfirmSlot`: Alexa confirmed the value of a specific slot before continuing with the dialog. (https://developer.amazon.com/docs/custom-skills/dialog-interface-reference.html#confirmslot) * `Dialog.ConfirmIntent`: Alexa confirmed the all the information the user has provided for the intent before the skill took action. (https://developer.amazon.com/docs/custom-skills/dialog-interface-reference.html#confirmintent) 
 */
public enum DialogActName {
  
  DIALOG_ELICITSLOT("Dialog.ElicitSlot"),
  
  DIALOG_CONFIRMSLOT("Dialog.ConfirmSlot"),
  
  DIALOG_CONFIRMINTENT("Dialog.ConfirmIntent"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  DialogActName(String value) {
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
  public static DialogActName fromValue(String text) {
    for (DialogActName b : DialogActName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return DialogActName.UNKNOWN_TO_SDK_VERSION;
  }
}

