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
 * SkewTransformProperty
 */

@JsonDeserialize(builder = SkewTransformProperty.Builder.class)
public final class SkewTransformProperty extends com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty {

    @JsonProperty("skewX")
    private String skewX = String.valueOf(1.0d);

    @JsonProperty("skewY")
    private String skewY = String.valueOf(1.0d);

    public static Builder builder() {
        return new Builder();
    }

    private SkewTransformProperty(Builder builder) {
        super(builder);
        if (builder.skewX != null) {
            this.skewX = builder.skewX;
        }
        if (builder.skewY != null) {
            this.skewY = builder.skewY;
        }
    }

    /**
     * Skew angle for the X-axis, in degrees. X-axis lines remain horizontal.
     * @return skewX
    **/
    @JsonProperty("skewX")
    public String getSkewX() {
        return skewX;
    }

    /**
     * Skew angle for the Y-axis, in degrees. Y-axis lines remain vertical.
     * @return skewY
    **/
    @JsonProperty("skewY")
    public String getSkewY() {
        return skewY;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkewTransformProperty interfacesAlexaPresentationAplSkewTransformProperty = (SkewTransformProperty) o;
        return Objects.equals(this.skewX, interfacesAlexaPresentationAplSkewTransformProperty.skewX) &&
            Objects.equals(this.skewY, interfacesAlexaPresentationAplSkewTransformProperty.skewY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skewX, skewY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkewTransformProperty {\n");
        
        sb.append("    skewX: ").append(toIndentedString(skewX)).append("\n");
        sb.append("    skewY: ").append(toIndentedString(skewY)).append("\n");
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
  
    public static class Builder extends com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty.Builder<Builder> {
        private String skewX;
        private String skewY;

        private Builder() {}

        @JsonProperty("skewX")
        public Builder withSkewX(Double skewX) {
            this.skewX = String.valueOf(skewX);
            return this;
        }

        public Builder withSkewX(String skewXExpression) {
            this.skewX = skewXExpression;
            return this;
        }

        @JsonProperty("skewY")
        public Builder withSkewY(Double skewY) {
            this.skewY = String.valueOf(skewY);
            return this;
        }

        public Builder withSkewY(String skewYExpression) {
            this.skewY = skewYExpression;
            return this;
        }

        public SkewTransformProperty build() {
            return new SkewTransformProperty(this);
        }
    }
}

