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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GoBack command POJO for the backstack APL extension.
 */

@JsonDeserialize(builder = GoBackCommand.Builder.class)
public final class GoBackCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("backType")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.BackType backType = null;

    @JsonProperty("backValue")
    private String backValue = null;

    private GoBackCommand() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GoBackCommand(Builder builder) {
        String discriminatorValue = "GoBack";

        this.type = discriminatorValue;
        if (builder.delay != null) {
            this.delay = builder.delay;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.screenLock != null) {
            this.screenLock = builder.screenLock;
        }
        if (builder.sequencer != null) {
            this.sequencer = builder.sequencer;
        }
        if (builder.when != null) {
            this.when = builder.when;
        }
        if (builder.backType != null) {
            this.backType = builder.backType;
        }
        if (builder.backValue != null) {
            this.backValue = builder.backValue;
        }
    }

    /**
     * Get backType
     * @return backType
    **/
    @JsonProperty("backType")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.BackType getBackType() {
        return backType;
    }


    /**
     * The value of go back command.
     * @return backValue
    **/
    @JsonProperty("backValue")
    public String getBackValue() {
        return backValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GoBackCommand interfacesAlexaPresentationAplGoBackCommand = (GoBackCommand) o;
        return Objects.equals(this.backType, interfacesAlexaPresentationAplGoBackCommand.backType) &&
            Objects.equals(this.backValue, interfacesAlexaPresentationAplGoBackCommand.backValue) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backType, backValue, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GoBackCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    backType: ").append(toIndentedString(backType)).append("\n");
        sb.append("    backValue: ").append(toIndentedString(backValue)).append("\n");
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
        private String delay;
        private String description;
        private Boolean screenLock;
        private String sequencer;
        private Boolean when;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.BackType backType;
        private String backValue;

        private Builder() {}

        @JsonProperty("delay")

        public Builder withDelay(Integer delay) {
            this.delay = String.valueOf(delay);
            return this;
        }

        @JsonProperty("delay")

        public Builder withDelay(String delayExpression) {
            this.delay = delayExpression;
            return this;
        }

        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("screenLock")

        public Builder withScreenLock(Boolean screenLock) {
            this.screenLock = screenLock;
            return this;
        }


        @JsonProperty("sequencer")

        public Builder withSequencer(String sequencer) {
            this.sequencer = sequencer;
            return this;
        }


        @JsonProperty("when")

        public Builder withWhen(Boolean when) {
            this.when = when;
            return this;
        }


        @JsonProperty("backType")

        public Builder withBackType(com.amazon.ask.model.interfaces.alexa.presentation.apl.BackType backType) {
            this.backType = backType;
            return this;
        }


        @JsonProperty("backValue")

        public Builder withBackValue(String backValue) {
            this.backValue = backValue;
            return this;
        }


        public GoBackCommand build() {
            return new GoBackCommand(this);
        }
    }
}

