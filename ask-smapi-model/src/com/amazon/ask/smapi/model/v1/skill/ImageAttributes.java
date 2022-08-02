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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Set of properties of the image provided by the customer.
 */

@JsonDeserialize(builder = ImageAttributes.Builder.class)
public final class ImageAttributes {

    @JsonProperty("dimension")
    private com.amazon.ask.smapi.model.v1.skill.ImageDimension dimension = null;

    @JsonProperty("size")
    private com.amazon.ask.smapi.model.v1.skill.ImageSize size = null;

    @JsonProperty("maximumSize")
    private com.amazon.ask.smapi.model.v1.skill.ImageSize maximumSize = null;

    private ImageAttributes() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ImageAttributes(Builder builder) {
        if (builder.dimension != null) {
            this.dimension = builder.dimension;
        }
        if (builder.size != null) {
            this.size = builder.size;
        }
        if (builder.maximumSize != null) {
            this.maximumSize = builder.maximumSize;
        }
    }

    /**
     * Get dimension
     * @return dimension
    **/
    @JsonProperty("dimension")
    public com.amazon.ask.smapi.model.v1.skill.ImageDimension getDimension() {
        return dimension;
    }


    /**
     * Get size
     * @return size
    **/
    @JsonProperty("size")
    public com.amazon.ask.smapi.model.v1.skill.ImageSize getSize() {
        return size;
    }


    /**
     * Get maximumSize
     * @return maximumSize
    **/
    @JsonProperty("maximumSize")
    public com.amazon.ask.smapi.model.v1.skill.ImageSize getMaximumSize() {
        return maximumSize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageAttributes v1SkillImageAttributes = (ImageAttributes) o;
        return Objects.equals(this.dimension, v1SkillImageAttributes.dimension) &&
            Objects.equals(this.size, v1SkillImageAttributes.size) &&
            Objects.equals(this.maximumSize, v1SkillImageAttributes.maximumSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimension, size, maximumSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageAttributes {\n");
        
        sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    maximumSize: ").append(toIndentedString(maximumSize)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.ImageDimension dimension;
        private com.amazon.ask.smapi.model.v1.skill.ImageSize size;
        private com.amazon.ask.smapi.model.v1.skill.ImageSize maximumSize;

        private Builder() {}

        @JsonProperty("dimension")

        public Builder withDimension(com.amazon.ask.smapi.model.v1.skill.ImageDimension dimension) {
            this.dimension = dimension;
            return this;
        }


        @JsonProperty("size")

        public Builder withSize(com.amazon.ask.smapi.model.v1.skill.ImageSize size) {
            this.size = size;
            return this;
        }


        @JsonProperty("maximumSize")

        public Builder withMaximumSize(com.amazon.ask.smapi.model.v1.skill.ImageSize maximumSize) {
            this.maximumSize = maximumSize;
            return this;
        }


        public ImageAttributes build() {
            return new ImageAttributes(this);
        }
    }
}

