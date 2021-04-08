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


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A request object that provides the details of the user’s request. The request body contains the parameters necessary for the service to perform its logic and generate a response.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.events.skillevents.SkillEnabledRequest.class, name = "AlexaSkillEvent.SkillEnabled"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.listManagement.ListUpdatedEventRequest.class, name = "AlexaHouseholdListEvent.ListUpdated"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.UserEvent.class, name = "Alexa.Presentation.APL.UserEvent"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.events.skillevents.SkillDisabledRequest.class, name = "AlexaSkillEvent.SkillDisabled"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.listManagement.ListItemsCreatedEventRequest.class, name = "AlexaHouseholdListEvent.ItemsCreated"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.SessionResumedRequest.class, name = "SessionResumedRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.SessionEndedRequest.class, name = "SessionEndedRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.LoadIndexListDataEvent.class, name = "Alexa.Presentation.APL.LoadIndexListData"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.LoadTokenListDataEvent.class, name = "Alexa.Presentation.APL.LoadTokenListData"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.audioplayer.PlaybackFailedRequest.class, name = "AudioPlayer.PlaybackFailed"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.canfulfill.CanFulfillIntentRequest.class, name = "CanFulfillIntentRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.customInterfaceController.ExpiredRequest.class, name = "CustomInterfaceController.Expired"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.html.MessageRequest.class, name = "Alexa.Presentation.HTML.Message"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.LaunchRequest.class, name = "LaunchRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.authorization.AuthorizationGrantRequest.class, name = "Alexa.Authorization.Grant"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.reminderManagement.ReminderCreatedEventRequest.class, name = "Reminders.ReminderCreated"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.aplt.UserEvent.class, name = "Alexa.Presentation.APLT.UserEvent"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.listManagement.ListItemsUpdatedEventRequest.class, name = "AlexaHouseholdListEvent.ItemsUpdated"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.listManagement.ListCreatedEventRequest.class, name = "AlexaHouseholdListEvent.ListCreated"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.audioplayer.PlaybackStartedRequest.class, name = "AudioPlayer.PlaybackStarted"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.audioplayer.PlaybackNearlyFinishedRequest.class, name = "AudioPlayer.PlaybackNearlyFinished"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.customInterfaceController.EventsReceivedRequest.class, name = "CustomInterfaceController.EventsReceived"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.reminderManagement.ReminderStatusChangedEventRequest.class, name = "Reminders.ReminderStatusChanged"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.listManagement.ListItemsDeletedEventRequest.class, name = "AlexaHouseholdListEvent.ItemsDeleted"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.reminderManagement.ReminderDeletedEventRequest.class, name = "Reminders.ReminderDeleted"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.ConnectionsResponse.class, name = "Connections.Response"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.listManagement.ListDeletedEventRequest.class, name = "AlexaHouseholdListEvent.ListDeleted"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.gameEngine.InputHandlerEventRequest.class, name = "GameEngine.InputHandlerEvent"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.playbackcontroller.PauseCommandIssuedRequest.class, name = "PlaybackController.PauseCommandIssued"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.playbackcontroller.PlayCommandIssuedRequest.class, name = "PlaybackController.PlayCommandIssued"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.audioplayer.PlaybackFinishedRequest.class, name = "AudioPlayer.PlaybackFinished"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.events.skillevents.ProactiveSubscriptionChangedRequest.class, name = "AlexaSkillEvent.ProactiveSubscriptionChanged"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.ElementSelectedRequest.class, name = "Display.ElementSelected"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.events.skillevents.PermissionChangedRequest.class, name = "AlexaSkillEvent.SkillPermissionChanged"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.reminderManagement.ReminderUpdatedEventRequest.class, name = "Reminders.ReminderUpdated"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.RuntimeErrorEvent.class, name = "Alexa.Presentation.APL.RuntimeError"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.html.RuntimeErrorRequest.class, name = "Alexa.Presentation.HTML.RuntimeError"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.dialog.InputRequest.class, name = "Dialog.InputRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.IntentRequest.class, name = "IntentRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.conversations.APIInvocationRequest.class, name = "Dialog.API.Invoked"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.services.reminderManagement.ReminderStartedEventRequest.class, name = "Reminders.ReminderStarted"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.audioplayer.PlaybackStoppedRequest.class, name = "AudioPlayer.PlaybackStopped"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.playbackcontroller.PreviousCommandIssuedRequest.class, name = "PlaybackController.PreviousCommandIssued"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.events.skillevents.AccountLinkedRequest.class, name = "AlexaSkillEvent.SkillAccountLinked"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.messaging.MessageReceivedRequest.class, name = "Messaging.MessageReceived"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.ConnectionsRequest.class, name = "Connections.Request"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.system.ExceptionEncounteredRequest.class, name = "System.ExceptionEncountered"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.events.skillevents.PermissionAcceptedRequest.class, name = "AlexaSkillEvent.SkillPermissionAccepted"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.playbackcontroller.NextCommandIssuedRequest.class, name = "PlaybackController.NextCommandIssued"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apla.RuntimeErrorEvent.class, name = "Alexa.Presentation.APLA.RuntimeError"),
})
public abstract class Request {

    protected String type = null;

    @JsonProperty("requestId")
    protected String requestId = null;

    @JsonProperty("timestamp")
    protected OffsetDateTime timestamp = null;

    @JsonProperty("locale")
    protected String locale = null;

    protected Request() {
    }

    /**
     * Describes the type of the request.
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    /**
     * Represents the unique identifier for the specific request.
     * @return requestId
    **/
    @JsonProperty("requestId")
    public String getRequestId() {
        return requestId;
    }


    /**
     * Provides the date and time when Alexa sent the request as an ISO 8601 formatted string. Used to verify the request when hosting your skill as a web service.
     * @return timestamp
    **/
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }


    /**
     * A string indicating the user’s locale. For example: en-US. This value is only provided with certain request types.
     * @return locale
    **/
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Request request = (Request) o;
        return Objects.equals(this.type, request.type) &&
            Objects.equals(this.requestId, request.requestId) &&
            Objects.equals(this.timestamp, request.timestamp) &&
            Objects.equals(this.locale, request.locale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, requestId, timestamp, locale);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Request {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
  
}

