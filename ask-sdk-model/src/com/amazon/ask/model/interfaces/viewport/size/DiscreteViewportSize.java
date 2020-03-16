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
 * Defines a fixed size of viewport.
 */

@JsonDeserialize(builder = DiscreteViewportSize.Builder.class)
public final class DiscreteViewportSize extends com.amazon.ask.model.interfaces.viewport.size.ViewportSize  {

    @JsonProperty("pixelWidth")
    private Integer pixelWidth = null;

    @JsonProperty("pixelHeight")
    private Integer pixelHeight = null;

    public static Builder builder() {
        return new Builder();
    }

    private DiscreteViewportSize(Builder builder) {
        String discriminatorValue = "DISCRETE";

        this.type = discriminatorValue;
        if (builder.pixelWidth != null) {
            this.pixelWidth = builder.pixelWidth;
        }
        if (builder.pixelHeight != null) {
            this.pixelHeight = builder.pixelHeight;
        }
    }

    /**
     * Get pixelWidth
     * @return pixelWidth
    **/
    @JsonProperty("pixelWidth")
    public Integer getPixelWidth() {
        return pixelWidth;
    }


    /**
     * Get pixelHeight
     * @return pixelHeight
    **/
    @JsonProperty("pixelHeight")
    public Integer getPixelHeight() {
        return pixelHeight;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscreteViewportSize interfacesViewportSizeDiscreteViewportSize = (DiscreteViewportSize) o;
        return Objects.equals(this.pixelWidth, interfacesViewportSizeDiscreteViewportSize.pixelWidth) &&
            Objects.equals(this.pixelHeight, interfacesViewportSizeDiscreteViewportSize.pixelHeight) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pixelWidth, pixelHeight, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscreteViewportSize {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    pixelWidth: ").append(toIndentedString(pixelWidth)).append("\n");
        sb.append("    pixelHeight: ").append(toIndentedString(pixelHeight)).append("\n");
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
        private Integer pixelWidth;
        private Integer pixelHeight;

        private Builder() {}

        @JsonProperty("pixelWidth")

        public Builder withPixelWidth(Integer pixelWidth) {
            this.pixelWidth = pixelWidth;
            return this;
        }


        @JsonProperty("pixelHeight")

        public Builder withPixelHeight(Integer pixelHeight) {
            this.pixelHeight = pixelHeight;
            return this;
        }


        public DiscreteViewportSize build() {
            return new DiscreteViewportSize(this);
        }
    }
}

