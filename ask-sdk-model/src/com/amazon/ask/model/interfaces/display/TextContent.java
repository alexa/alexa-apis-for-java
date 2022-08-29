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


package com.amazon.ask.model.interfaces.display;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TextContent
 */

@JsonDeserialize(builder = TextContent.Builder.class)
public final class TextContent {

    @JsonProperty("primaryText")
    private com.amazon.ask.model.interfaces.display.TextField primaryText = null;

    @JsonProperty("secondaryText")
    private com.amazon.ask.model.interfaces.display.TextField secondaryText = null;

    @JsonProperty("tertiaryText")
    private com.amazon.ask.model.interfaces.display.TextField tertiaryText = null;

    private TextContent() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private TextContent(Builder builder) {
        if (builder.primaryText != null) {
            this.primaryText = builder.primaryText;
        }
        if (builder.secondaryText != null) {
            this.secondaryText = builder.secondaryText;
        }
        if (builder.tertiaryText != null) {
            this.tertiaryText = builder.tertiaryText;
        }
    }

    /**
     * Get primaryText
     * @return primaryText
    **/
    @JsonProperty("primaryText")
    public com.amazon.ask.model.interfaces.display.TextField getPrimaryText() {
        return primaryText;
    }


    /**
     * Get secondaryText
     * @return secondaryText
    **/
    @JsonProperty("secondaryText")
    public com.amazon.ask.model.interfaces.display.TextField getSecondaryText() {
        return secondaryText;
    }


    /**
     * Get tertiaryText
     * @return tertiaryText
    **/
    @JsonProperty("tertiaryText")
    public com.amazon.ask.model.interfaces.display.TextField getTertiaryText() {
        return tertiaryText;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextContent interfacesDisplayTextContent = (TextContent) o;
        return Objects.equals(this.primaryText, interfacesDisplayTextContent.primaryText) &&
            Objects.equals(this.secondaryText, interfacesDisplayTextContent.secondaryText) &&
            Objects.equals(this.tertiaryText, interfacesDisplayTextContent.tertiaryText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryText, secondaryText, tertiaryText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextContent {\n");
        
        sb.append("    primaryText: ").append(toIndentedString(primaryText)).append("\n");
        sb.append("    secondaryText: ").append(toIndentedString(secondaryText)).append("\n");
        sb.append("    tertiaryText: ").append(toIndentedString(tertiaryText)).append("\n");
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
        private com.amazon.ask.model.interfaces.display.TextField primaryText;
        private com.amazon.ask.model.interfaces.display.TextField secondaryText;
        private com.amazon.ask.model.interfaces.display.TextField tertiaryText;

        private Builder() {}

        @JsonProperty("primaryText")

        public Builder withPrimaryText(com.amazon.ask.model.interfaces.display.TextField primaryText) {
            this.primaryText = primaryText;
            return this;
        }


        @JsonProperty("secondaryText")

        public Builder withSecondaryText(com.amazon.ask.model.interfaces.display.TextField secondaryText) {
            this.secondaryText = secondaryText;
            return this;
        }


        @JsonProperty("tertiaryText")

        public Builder withTertiaryText(com.amazon.ask.model.interfaces.display.TextField tertiaryText) {
            this.tertiaryText = tertiaryText;
            return this;
        }


        public TextContent build() {
            return new TextContent(this);
        }
    }
}

