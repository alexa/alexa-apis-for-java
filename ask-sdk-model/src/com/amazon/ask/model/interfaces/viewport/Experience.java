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


package com.amazon.ask.model.interfaces.viewport;

import java.util.Objects;
import java.math.BigDecimal;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An experience represents a viewing mode used to interact with the device.
 */

@JsonDeserialize(builder = Experience.Builder.class)
public final class Experience {

    @JsonProperty("arcMinuteWidth")
    private BigDecimal arcMinuteWidth = null;

    @JsonProperty("arcMinuteHeight")
    private BigDecimal arcMinuteHeight = null;

    @JsonProperty("canRotate")
    private Boolean canRotate = null;

    @JsonProperty("canResize")
    private Boolean canResize = null;

    public static Builder builder() {
        return new Builder();
    }

    private Experience(Builder builder) {
        if (builder.arcMinuteWidth != null) {
            this.arcMinuteWidth = builder.arcMinuteWidth;
        }
        if (builder.arcMinuteHeight != null) {
            this.arcMinuteHeight = builder.arcMinuteHeight;
        }
        if (builder.canRotate != null) {
            this.canRotate = builder.canRotate;
        }
        if (builder.canResize != null) {
            this.canResize = builder.canResize;
        }
    }

    /**
     * The number of horizontal arc minutes the viewport occupies in the user's visual field when viewed within this experience.
     * @return arcMinuteWidth
    **/
    @JsonProperty("arcMinuteWidth")
    public BigDecimal getArcMinuteWidth() {
        return arcMinuteWidth;
    }


    /**
     * The number of vertical arc minutes the viewport occupies in the user's visual field when viewed within this experience.
     * @return arcMinuteHeight
    **/
    @JsonProperty("arcMinuteHeight")
    public BigDecimal getArcMinuteHeight() {
        return arcMinuteHeight;
    }


    /**
     * Indicates if the viewport can be rotated through 90 degrees.
     * @return canRotate
    **/
    @JsonProperty("canRotate")
    public Boolean getCanRotate() {
        return canRotate;
    }


    /**
     * Indicates if the viewport can be resized, limiting the area which can be used to render the APL response.
     * @return canResize
    **/
    @JsonProperty("canResize")
    public Boolean getCanResize() {
        return canResize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Experience interfacesViewportExperience = (Experience) o;
        return Objects.equals(this.arcMinuteWidth, interfacesViewportExperience.arcMinuteWidth) &&
            Objects.equals(this.arcMinuteHeight, interfacesViewportExperience.arcMinuteHeight) &&
            Objects.equals(this.canRotate, interfacesViewportExperience.canRotate) &&
            Objects.equals(this.canResize, interfacesViewportExperience.canResize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arcMinuteWidth, arcMinuteHeight, canRotate, canResize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Experience {\n");
        
        sb.append("    arcMinuteWidth: ").append(toIndentedString(arcMinuteWidth)).append("\n");
        sb.append("    arcMinuteHeight: ").append(toIndentedString(arcMinuteHeight)).append("\n");
        sb.append("    canRotate: ").append(toIndentedString(canRotate)).append("\n");
        sb.append("    canResize: ").append(toIndentedString(canResize)).append("\n");
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
        private BigDecimal arcMinuteWidth;
        private BigDecimal arcMinuteHeight;
        private Boolean canRotate;
        private Boolean canResize;

        private Builder() {}

        @JsonProperty("arcMinuteWidth")

        public Builder withArcMinuteWidth(BigDecimal arcMinuteWidth) {
            this.arcMinuteWidth = arcMinuteWidth;
            return this;
        }


        @JsonProperty("arcMinuteHeight")

        public Builder withArcMinuteHeight(BigDecimal arcMinuteHeight) {
            this.arcMinuteHeight = arcMinuteHeight;
            return this;
        }


        @JsonProperty("canRotate")

        public Builder withCanRotate(Boolean canRotate) {
            this.canRotate = canRotate;
            return this;
        }


        @JsonProperty("canResize")

        public Builder withCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }


        public Experience build() {
            return new Experience(this);
        }
    }
}

