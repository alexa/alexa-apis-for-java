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
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Directive
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.audioplayer.StopDirective.class, name = "AudioPlayer.Stop"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.customInterfaceController.StopEventHandlerDirective.class, name = "CustomInterfaceController.StopEventHandler"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.dialog.ConfirmSlotDirective.class, name = "Dialog.ConfirmSlot"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.audioplayer.PlayDirective.class, name = "AudioPlayer.Play"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.ExecuteCommandsDirective.class, name = "Alexa.Presentation.APL.ExecuteCommands"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.SendRequestDirective.class, name = "Connections.SendRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.dialog.DynamicEntitiesDirective.class, name = "Dialog.UpdateDynamicEntities"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.customInterfaceController.StartEventHandlerDirective.class, name = "CustomInterfaceController.StartEventHandler"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.RenderTemplateDirective.class, name = "Display.RenderTemplate"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.gadgetController.SetLightDirective.class, name = "GadgetController.SetLight"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.dialog.DelegateDirective.class, name = "Dialog.Delegate"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.display.HintDirective.class, name = "Hint"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.dialog.ConfirmIntentDirective.class, name = "Dialog.ConfirmIntent"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.V1.StartConnectionDirective.class, name = "Connections.StartConnection"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.gameEngine.StartInputHandlerDirective.class, name = "GameEngine.StartInputHandler"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.customInterfaceController.SendDirectiveDirective.class, name = "CustomInterfaceController.SendDirective"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.videoapp.LaunchDirective.class, name = "VideoApp.Launch"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.gameEngine.StopInputHandlerDirective.class, name = "GameEngine.StopInputHandler"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.tasks.CompleteTaskDirective.class, name = "Tasks.CompleteTask"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderDocumentDirective.class, name = "Alexa.Presentation.APL.RenderDocument"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.SendResponseDirective.class, name = "Connections.SendResponse"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.dialog.ElicitSlotDirective.class, name = "Dialog.ElicitSlot"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.audioplayer.ClearQueueDirective.class, name = "AudioPlayer.ClearQueue"),
})

public abstract class Directive {

    protected String type = null;

    protected Directive() {
    }

    /**
     * Get type
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Directive directive = (Directive) o;
        return Objects.equals(this.type, directive.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Directive {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

