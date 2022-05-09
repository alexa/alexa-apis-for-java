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
 * ScaleTransformProperty
 */

@JsonDeserialize(builder = ScaleTransformProperty.Builder.class)
public final class ScaleTransformProperty extends com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty {

    @JsonProperty("scale")
    private String scale = String.valueOf(1.0d);

    @JsonProperty("scaleX")
    private String scaleX = String.valueOf(1.0d);

    @JsonProperty("scaleY")
    private String scaleY = String.valueOf(1.0d);

    public static Builder builder() {
        return new Builder();
    }

    private ScaleTransformProperty(Builder builder) {
        super(builder);
        if (builder.scale != null) {
            this.scale = builder.scale;
        }
        if (builder.scaleX != null) {
            this.scaleX = builder.scaleX;
        }
        if (builder.scaleY != null) {
            this.scaleY = builder.scaleY;
        }
    }

    /**
     * Uniform scaling in both X and Y.
     * @return scale
    **/
    @JsonProperty("scale")
    public String getScale() {
        return scale;
    }


    /**
     * Scaling in the X direction (overrides “scale” if in same group).
     * @return scaleX
    **/
    @JsonProperty("scaleX")
    public String getScaleX() {
        return scaleX;
    }


    /**
     * Scaling in the Y direction (overrides “scale” if in same group).
     * @return scaleY
    **/
    @JsonProperty("scaleY")
    public String getScaleY() {
        return scaleY;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScaleTransformProperty interfacesAlexaPresentationAplScaleTransformProperty = (ScaleTransformProperty) o;
        return Objects.equals(this.scale, interfacesAlexaPresentationAplScaleTransformProperty.scale) &&
            Objects.equals(this.scaleX, interfacesAlexaPresentationAplScaleTransformProperty.scaleX) &&
            Objects.equals(this.scaleY, interfacesAlexaPresentationAplScaleTransformProperty.scaleY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scale, scaleX, scaleY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScaleTransformProperty {\n");
        
        sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
        sb.append("    scaleX: ").append(toIndentedString(scaleX)).append("\n");
        sb.append("    scaleY: ").append(toIndentedString(scaleY)).append("\n");
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
        private String scale;
        private String scaleX;
        private String scaleY;

        private Builder() {}

        @JsonProperty("scale")

        public Builder withScale(Double scale) {
            this.scale = String.valueOf(scale);
            return this;
        }

        @JsonProperty("scale")

        public Builder withScale(String scaleExpression) {
            this.scale = scaleExpression;
            return this;
        }

        @JsonProperty("scaleX")

        public Builder withScaleX(Double scaleX) {
            this.scaleX = String.valueOf(scaleX);
            return this;
        }

        @JsonProperty("scaleX")

        public Builder withScaleX(String scaleXExpression) {
            this.scaleX = scaleXExpression;
            return this;
        }

        @JsonProperty("scaleY")

        public Builder withScaleY(Double scaleY) {
            this.scaleY = String.valueOf(scaleY);
            return this;
        }

        @JsonProperty("scaleY")

        public Builder withScaleY(String scaleYExpression) {
            this.scaleY = scaleYExpression;
            return this;
        }

        public ScaleTransformProperty build() {
            return new ScaleTransformProperty(this);
        }
    }
}

