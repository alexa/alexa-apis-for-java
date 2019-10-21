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
 * MoveTransformProperty
 */

@JsonDeserialize(builder = MoveTransformProperty.Builder.class)
public final class MoveTransformProperty extends com.amazon.ask.model.interfaces.alexa.presentation.apl.TransformProperty {

    @JsonProperty("translateX")
    private String translateX = null;

    @JsonProperty("translateY")
    private String translateY = null;

    public static Builder builder() {
        return new Builder();
    }

    private MoveTransformProperty(Builder builder) {
        super(builder);
        if (builder.translateX != null) {
            this.translateX = builder.translateX;
        }
        if (builder.translateY != null) {
            this.translateY = builder.translateY;
        }
    }

    /**
     * Distance to translate the object to the right.
     * @return translateX
    **/
    @JsonProperty("translateX")
    public String getTranslateX() {
        return translateX;
    }

    /**
     * Distance to translate the object down.
     * @return translateY
    **/
    @JsonProperty("translateY")
    public String getTranslateY() {
        return translateY;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MoveTransformProperty interfacesAlexaPresentationAplMoveTransformProperty = (MoveTransformProperty) o;
        return Objects.equals(this.translateX, interfacesAlexaPresentationAplMoveTransformProperty.translateX) &&
            Objects.equals(this.translateY, interfacesAlexaPresentationAplMoveTransformProperty.translateY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(translateX, translateY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveTransformProperty {\n");
        
        sb.append("    translateX: ").append(toIndentedString(translateX)).append("\n");
        sb.append("    translateY: ").append(toIndentedString(translateY)).append("\n");
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
        private String translateX;
        private String translateY;

        private Builder() {}

        @JsonProperty("translateX")
        public Builder withTranslateX(String translateX) {
            this.translateX = translateX;
            return this;
        }


        @JsonProperty("translateY")
        public Builder withTranslateY(String translateY) {
            this.translateY = translateY;
            return this;
        }


        public MoveTransformProperty build() {
            return new MoveTransformProperty(this);
        }
    }
}

