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


package com.amazon.ask.model.interfaces.viewport.size;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines range of size with minimum and maximum values for with and height.
 */

@JsonDeserialize(builder = ContinuousViewportSize.Builder.class)
public final class ContinuousViewportSize extends com.amazon.ask.model.interfaces.viewport.size.ViewportSize  {

    @JsonProperty("minPixelWidth")
    private Integer minPixelWidth = null;

    @JsonProperty("minPixelHeight")
    private Integer minPixelHeight = null;

    @JsonProperty("maxPixelWidth")
    private Integer maxPixelWidth = null;

    @JsonProperty("maxPixelHeight")
    private Integer maxPixelHeight = null;

    private ContinuousViewportSize() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ContinuousViewportSize(Builder builder) {
        String discriminatorValue = "CONTINUOUS";

        this.type = discriminatorValue;
        if (builder.minPixelWidth != null) {
            this.minPixelWidth = builder.minPixelWidth;
        }
        if (builder.minPixelHeight != null) {
            this.minPixelHeight = builder.minPixelHeight;
        }
        if (builder.maxPixelWidth != null) {
            this.maxPixelWidth = builder.maxPixelWidth;
        }
        if (builder.maxPixelHeight != null) {
            this.maxPixelHeight = builder.maxPixelHeight;
        }
    }

    /**
     * Get minPixelWidth
     * @return minPixelWidth
    **/
    @JsonProperty("minPixelWidth")
    public Integer getMinPixelWidth() {
        return minPixelWidth;
    }


    /**
     * Get minPixelHeight
     * @return minPixelHeight
    **/
    @JsonProperty("minPixelHeight")
    public Integer getMinPixelHeight() {
        return minPixelHeight;
    }


    /**
     * Get maxPixelWidth
     * @return maxPixelWidth
    **/
    @JsonProperty("maxPixelWidth")
    public Integer getMaxPixelWidth() {
        return maxPixelWidth;
    }


    /**
     * Get maxPixelHeight
     * @return maxPixelHeight
    **/
    @JsonProperty("maxPixelHeight")
    public Integer getMaxPixelHeight() {
        return maxPixelHeight;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContinuousViewportSize interfacesViewportSizeContinuousViewportSize = (ContinuousViewportSize) o;
        return Objects.equals(this.minPixelWidth, interfacesViewportSizeContinuousViewportSize.minPixelWidth) &&
            Objects.equals(this.minPixelHeight, interfacesViewportSizeContinuousViewportSize.minPixelHeight) &&
            Objects.equals(this.maxPixelWidth, interfacesViewportSizeContinuousViewportSize.maxPixelWidth) &&
            Objects.equals(this.maxPixelHeight, interfacesViewportSizeContinuousViewportSize.maxPixelHeight) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minPixelWidth, minPixelHeight, maxPixelWidth, maxPixelHeight, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContinuousViewportSize {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    minPixelWidth: ").append(toIndentedString(minPixelWidth)).append("\n");
        sb.append("    minPixelHeight: ").append(toIndentedString(minPixelHeight)).append("\n");
        sb.append("    maxPixelWidth: ").append(toIndentedString(maxPixelWidth)).append("\n");
        sb.append("    maxPixelHeight: ").append(toIndentedString(maxPixelHeight)).append("\n");
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
        private Integer minPixelWidth;
        private Integer minPixelHeight;
        private Integer maxPixelWidth;
        private Integer maxPixelHeight;

        private Builder() {}

        @JsonProperty("minPixelWidth")

        public Builder withMinPixelWidth(Integer minPixelWidth) {
            this.minPixelWidth = minPixelWidth;
            return this;
        }


        @JsonProperty("minPixelHeight")

        public Builder withMinPixelHeight(Integer minPixelHeight) {
            this.minPixelHeight = minPixelHeight;
            return this;
        }


        @JsonProperty("maxPixelWidth")

        public Builder withMaxPixelWidth(Integer maxPixelWidth) {
            this.maxPixelWidth = maxPixelWidth;
            return this;
        }


        @JsonProperty("maxPixelHeight")

        public Builder withMaxPixelHeight(Integer maxPixelHeight) {
            this.maxPixelHeight = maxPixelHeight;
            return this;
        }


        public ContinuousViewportSize build() {
            return new ContinuousViewportSize(this);
        }
    }
}

