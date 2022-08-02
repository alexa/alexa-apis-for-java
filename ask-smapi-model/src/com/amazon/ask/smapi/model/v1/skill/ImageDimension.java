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
 * Dimensions of an image.
 */

@JsonDeserialize(builder = ImageDimension.Builder.class)
public final class ImageDimension {

    @JsonProperty("widthInPixels")
    private Integer widthInPixels = null;

    @JsonProperty("heightInPixels")
    private Integer heightInPixels = null;

    private ImageDimension() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ImageDimension(Builder builder) {
        if (builder.widthInPixels != null) {
            this.widthInPixels = builder.widthInPixels;
        }
        if (builder.heightInPixels != null) {
            this.heightInPixels = builder.heightInPixels;
        }
    }

    /**
     * Width of the image in pixels.
     * @return widthInPixels
    **/
    @JsonProperty("widthInPixels")
    public Integer getWidthInPixels() {
        return widthInPixels;
    }


    /**
     * Height of the image in pixels.
     * @return heightInPixels
    **/
    @JsonProperty("heightInPixels")
    public Integer getHeightInPixels() {
        return heightInPixels;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDimension v1SkillImageDimension = (ImageDimension) o;
        return Objects.equals(this.widthInPixels, v1SkillImageDimension.widthInPixels) &&
            Objects.equals(this.heightInPixels, v1SkillImageDimension.heightInPixels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(widthInPixels, heightInPixels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDimension {\n");
        
        sb.append("    widthInPixels: ").append(toIndentedString(widthInPixels)).append("\n");
        sb.append("    heightInPixels: ").append(toIndentedString(heightInPixels)).append("\n");
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
        private Integer widthInPixels;
        private Integer heightInPixels;

        private Builder() {}

        @JsonProperty("widthInPixels")

        public Builder withWidthInPixels(Integer widthInPixels) {
            this.widthInPixels = widthInPixels;
            return this;
        }


        @JsonProperty("heightInPixels")

        public Builder withHeightInPixels(Integer heightInPixels) {
            this.heightInPixels = heightInPixels;
            return this;
        }


        public ImageDimension build() {
            return new ImageDimension(this);
        }
    }
}

