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
 * This object contains the characteristics related to the APL device&#39;s viewport.
 */

@JsonDeserialize(builder = APLViewportState.Builder.class)
public final class APLViewportState extends com.amazon.ask.model.interfaces.viewport.TypedViewportState  {

    @JsonProperty("shape")
    private com.amazon.ask.model.interfaces.viewport.Shape shape = null;

    @JsonProperty("dpi")
    private BigDecimal dpi = null;

    @JsonProperty("presentationType")
    private com.amazon.ask.model.interfaces.viewport.PresentationType presentationType = null;

    @JsonProperty("canRotate")
    private Boolean canRotate = null;

    @JsonProperty("configuration")
    private com.amazon.ask.model.interfaces.viewport.apl.ViewportConfiguration _configuration = null;

    public static Builder builder() {
        return new Builder();
    }

    private APLViewportState(Builder builder) {
        String discriminatorValue = "APL";

        if (builder.id != null) {
            this.id = builder.id;
        }
        this.type = discriminatorValue;
        if (builder.shape != null) {
            this.shape = builder.shape;
        }
        if (builder.dpi != null) {
            this.dpi = builder.dpi;
        }
        if (builder.presentationType != null) {
            this.presentationType = builder.presentationType;
        }
        if (builder.canRotate != null) {
            this.canRotate = builder.canRotate;
        }
        if (builder._configuration != null) {
            this._configuration = builder._configuration;
        }
    }

    /**
     * Get shape
     * @return shape
    **/
    @JsonProperty("shape")
    public com.amazon.ask.model.interfaces.viewport.Shape getShape() {
        return shape;
    }

    /**
     * The pixel density of the viewport.
     * @return dpi
    **/
    @JsonProperty("dpi")
    public BigDecimal getDpi() {
        return dpi;
    }

    /**
     * Get presentationType
     * @return presentationType
    **/
    @JsonProperty("presentationType")
    public com.amazon.ask.model.interfaces.viewport.PresentationType getPresentationType() {
        return presentationType;
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
     * Get _configuration
     * @return _configuration
    **/
    @JsonProperty("configuration")
    public com.amazon.ask.model.interfaces.viewport.apl.ViewportConfiguration getConfiguration() {
        return _configuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        APLViewportState interfacesViewportAPLViewportState = (APLViewportState) o;
        return Objects.equals(this.shape, interfacesViewportAPLViewportState.shape) &&
            Objects.equals(this.dpi, interfacesViewportAPLViewportState.dpi) &&
            Objects.equals(this.presentationType, interfacesViewportAPLViewportState.presentationType) &&
            Objects.equals(this.canRotate, interfacesViewportAPLViewportState.canRotate) &&
            Objects.equals(this._configuration, interfacesViewportAPLViewportState._configuration) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shape, dpi, presentationType, canRotate, _configuration, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class APLViewportState {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
        sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
        sb.append("    presentationType: ").append(toIndentedString(presentationType)).append("\n");
        sb.append("    canRotate: ").append(toIndentedString(canRotate)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
        private String id;
        private com.amazon.ask.model.interfaces.viewport.Shape shape;
        private BigDecimal dpi;
        private com.amazon.ask.model.interfaces.viewport.PresentationType presentationType;
        private Boolean canRotate;
        private com.amazon.ask.model.interfaces.viewport.apl.ViewportConfiguration _configuration;

        private Builder() {}

        @JsonProperty("id")
        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("shape")
        public Builder withShape(com.amazon.ask.model.interfaces.viewport.Shape shape) {
            this.shape = shape;
            return this;
        }


        @JsonProperty("dpi")
        public Builder withDpi(BigDecimal dpi) {
            this.dpi = dpi;
            return this;
        }


        @JsonProperty("presentationType")
        public Builder withPresentationType(com.amazon.ask.model.interfaces.viewport.PresentationType presentationType) {
            this.presentationType = presentationType;
            return this;
        }


        @JsonProperty("canRotate")
        public Builder withCanRotate(Boolean canRotate) {
            this.canRotate = canRotate;
            return this;
        }


        @JsonProperty("configuration")
        public Builder withConfiguration(com.amazon.ask.model.interfaces.viewport.apl.ViewportConfiguration _configuration) {
            this._configuration = _configuration;
            return this;
        }


        public APLViewportState build() {
            return new APLViewportState(this);
        }
    }
}

