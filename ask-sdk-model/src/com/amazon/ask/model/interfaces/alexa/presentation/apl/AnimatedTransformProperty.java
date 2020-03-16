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
 * AnimatedTransformProperty
 */

@JsonDeserialize(builder = AnimatedTransformProperty.Builder.class)
public final class AnimatedTransformProperty extends com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty  {

    @JsonProperty("from")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty> from = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty>();

    @JsonProperty("to")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty> to = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty>();

    public static Builder builder() {
        return new Builder();
    }

    private AnimatedTransformProperty(Builder builder) {
        String discriminatorValue = "transform";

        this.property = discriminatorValue;
        if (builder.from != null) {
            this.from = builder.from;
        }
        if (builder.to != null) {
            this.to = builder.to;
        }
    }

    /**
     * The starting value of the property.
     * @return from
    **/
    @JsonProperty("from")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty> getFrom() {
        return from;
    }


    /**
     * The ending value of the property.
     * @return to
    **/
    @JsonProperty("to")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty> getTo() {
        return to;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnimatedTransformProperty interfacesAlexaPresentationAplAnimatedTransformProperty = (AnimatedTransformProperty) o;
        return Objects.equals(this.from, interfacesAlexaPresentationAplAnimatedTransformProperty.from) &&
            Objects.equals(this.to, interfacesAlexaPresentationAplAnimatedTransformProperty.to) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnimatedTransformProperty {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty> from;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty> to;

        private Builder() {}

        @JsonProperty("from")

        public Builder withFrom(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty> from) {
            this.from = from;
            return this;
        }

        public Builder addFromItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty fromItem) {
            if (this.from == null) {
                this.from = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty>();
            }
            this.from.add(fromItem);
            return this;
        }

        @JsonProperty("to")

        public Builder withTo(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty> to) {
            this.to = to;
            return this;
        }

        public Builder addToItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty toItem) {
            if (this.to == null) {
                this.to = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty>();
            }
            this.to.add(toItem);
            return this;
        }

        public AnimatedTransformProperty build() {
            return new AnimatedTransformProperty(this);
        }
    }
}

