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


package com.amazon.ask.model.services.gameEngine;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * InputHandlerEvent
 */

@JsonDeserialize(builder = InputHandlerEvent.Builder.class)
public final class InputHandlerEvent {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("inputEvents")
    private List<com.amazon.ask.model.services.gameEngine.InputEvent> inputEvents = new ArrayList<com.amazon.ask.model.services.gameEngine.InputEvent>();

    public static Builder builder() {
        return new Builder();
    }

    private InputHandlerEvent(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.inputEvents != null) {
            this.inputEvents = builder.inputEvents;
        }
    }

    /**
     * The name of the event as you defined it in your GameEngine.StartInputHandler directive.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * A chronologically ordered report of the raw Button Events that contributed to this Input Handler Event.
     * @return inputEvents
    **/
    @JsonProperty("inputEvents")
    public List<com.amazon.ask.model.services.gameEngine.InputEvent> getInputEvents() {
        return inputEvents;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputHandlerEvent servicesGameEngineInputHandlerEvent = (InputHandlerEvent) o;
        return Objects.equals(this.name, servicesGameEngineInputHandlerEvent.name) &&
            Objects.equals(this.inputEvents, servicesGameEngineInputHandlerEvent.inputEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, inputEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputHandlerEvent {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    inputEvents: ").append(toIndentedString(inputEvents)).append("\n");
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
  
    public static class Builder {
        private String name;
        private List<com.amazon.ask.model.services.gameEngine.InputEvent> inputEvents;

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("inputEvents")
        public Builder withInputEvents(List<com.amazon.ask.model.services.gameEngine.InputEvent> inputEvents) {
            this.inputEvents = inputEvents;
            return this;
        }

        public Builder addInputEventsItem(com.amazon.ask.model.services.gameEngine.InputEvent inputEventsItem) {
            if (this.inputEvents == null) {
                this.inputEvents = new ArrayList<com.amazon.ask.model.services.gameEngine.InputEvent>();
            }
            this.inputEvents.add(inputEventsItem);
            return this;
        }

        public InputHandlerEvent build() {
            return new InputHandlerEvent(this);
        }
    }
}

