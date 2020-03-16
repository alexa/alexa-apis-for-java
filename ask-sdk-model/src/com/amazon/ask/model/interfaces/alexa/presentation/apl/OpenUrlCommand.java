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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Opens a url with web browser or other application on the device. The APL author is responsible for providing a suitable URL that works on the current device.
 */

@JsonDeserialize(builder = OpenUrlCommand.Builder.class)
public final class OpenUrlCommand extends com.amazon.ask.model.interfaces.alexa.presentation.apl.Command  {

    @JsonProperty("source")
    private String source = null;

    @JsonProperty("onFail")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> onFail = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command>();

    public static Builder builder() {
        return new Builder();
    }

    private OpenUrlCommand(Builder builder) {
        String discriminatorValue = "OpenURL";

        this.type = discriminatorValue;
        if (builder.delay != null) {
            this.delay = builder.delay;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.when != null) {
            this.when = builder.when;
        }
        if (builder.source != null) {
            this.source = builder.source;
        }
        if (builder.onFail != null) {
            this.onFail = builder.onFail;
        }
    }

    /**
     * The URL to open
     * @return source
    **/
    @JsonProperty("source")
    public String getSource() {
        return source;
    }


    /**
     * Commands to execute if the URL fails to open
     * @return onFail
    **/
    @JsonProperty("onFail")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> getOnFail() {
        return onFail;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenUrlCommand interfacesAlexaPresentationAplOpenUrlCommand = (OpenUrlCommand) o;
        return Objects.equals(this.source, interfacesAlexaPresentationAplOpenUrlCommand.source) &&
            Objects.equals(this.onFail, interfacesAlexaPresentationAplOpenUrlCommand.onFail) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, onFail, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenUrlCommand {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    onFail: ").append(toIndentedString(onFail)).append("\n");
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
        private Boolean when;
        private String source;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> onFail;

        private Builder() {}

        @JsonProperty("delay")

        public Builder withDelay(Integer delay) {
            this.delay = String.valueOf(delay);
            return this;
        }

        public Builder withDelay(String delayExpression) {
            this.delay = delayExpression;
            return this;
        }

        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("when")

        public Builder withWhen(Boolean when) {
            this.when = when;
            return this;
        }


        @JsonProperty("source")

        public Builder withSource(String source) {
            this.source = source;
            return this;
        }


        @JsonProperty("onFail")

        public Builder withOnFail(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command> onFail) {
            this.onFail = onFail;
            return this;
        }

        public Builder addOnFailItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.Command onFailItem) {
            if (this.onFail == null) {
                this.onFail = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.Command>();
            }
            this.onFail.add(onFailItem);
            return this;
        }

        public OpenUrlCommand build() {
            return new OpenUrlCommand(this);
        }
    }
}

