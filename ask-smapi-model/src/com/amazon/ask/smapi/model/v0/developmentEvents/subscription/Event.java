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


package com.amazon.ask.smapi.model.v0.developmentEvents.subscription;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents an event that the subscriber is interested in. The event is of the format AlexaDevelopmentEvent.OPERATION. You can use wildcard event 'AlexaDevelopmentEvent.All' for recieving all developer notifications listed below.   * 'AlexaDevelopmentEvent.ManifestUpdate' - The event representing the status of the update request on the Manifest.   * 'AlexaDevelopmentEvent.SkillPublish' -   The event representing the status of the skill publish process.   * 'AlexaDevelopmentEvent.SkillCertification' -   The event represents if a skill has been certified or not.   * 'AlexaDevelopmentEvent.InteractionModelUpdate' -   The event represents the status of an Interaction Model build for a particular locale.   * 'AlexaDevelopmentEvent.All' - A wildcard event name that allows subscription to all the existing events. While using this, you must not specify any other event name. AlexaDevelopmentEvent.All avoids the need of specifying every development event name in order to receive all events pertaining to a vendor account. Similarly, it avoids the need of updating an existing subscription to be able to receive new events, whenever supproted by notification service. Test Subscriber API cannot use this wildcard. Please make sure that your code can gracefully handle new/previously unknown events, if you are using this wildcard. 
 */
public enum Event {
  
  ALEXADEVELOPMENTEVENT_MANIFESTUPDATE("AlexaDevelopmentEvent.ManifestUpdate"),
  
  ALEXADEVELOPMENTEVENT_SKILLPUBLISH("AlexaDevelopmentEvent.SkillPublish"),
  
  ALEXADEVELOPMENTEVENT_SKILLCERTIFICATION("AlexaDevelopmentEvent.SkillCertification"),
  
  ALEXADEVELOPMENTEVENT_INTERACTIONMODELUPDATE("AlexaDevelopmentEvent.InteractionModelUpdate"),
  
  ALEXADEVELOPMENTEVENT_ALL("AlexaDevelopmentEvent.All"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  Event(String value) {
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
  public static Event fromValue(String text) {
    for (Event b : Event.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return Event.UNKNOWN_TO_SDK_VERSION;
  }
}

