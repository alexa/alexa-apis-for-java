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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a viewport specification.
 */

@JsonDeserialize(builder = ViewportSpecification.Builder.class)
public final class ViewportSpecification {

    @JsonProperty("mode")
    private String mode = null;

    @JsonProperty("shape")
    private String shape = null;

    @JsonProperty("minWidth")
    private Integer minWidth = null;

    @JsonProperty("maxWidth")
    private Integer maxWidth = null;

    @JsonProperty("minHeight")
    private Integer minHeight = null;

    @JsonProperty("maxHeight")
    private Integer maxHeight = null;

    public static Builder builder() {
        return new Builder();
    }

    private ViewportSpecification(Builder builder) {
        if (builder.mode != null) {
            this.mode = builder.mode;
        }
        if (builder.shape != null) {
            this.shape = builder.shape;
        }
        if (builder.minWidth != null) {
            this.minWidth = builder.minWidth;
        }
        if (builder.maxWidth != null) {
            this.maxWidth = builder.maxWidth;
        }
        if (builder.minHeight != null) {
            this.minHeight = builder.minHeight;
        }
        if (builder.maxHeight != null) {
            this.maxHeight = builder.maxHeight;
        }
    }

    /**
     * Get mode
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getModeAsString().
     *
     * @return mode
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportMode getMode() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportMode.fromValue(mode);
    }

    /**
     * Get the underlying String value for mode.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return mode as a String value
    **/
    @JsonProperty("mode")
    public String getModeAsString() {
      return mode;
    }

    /**
     * Get shape
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getShapeAsString().
     *
     * @return shape
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportShape getShape() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportShape.fromValue(shape);
    }

    /**
     * Get the underlying String value for shape.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return shape as a String value
    **/
    @JsonProperty("shape")
    public String getShapeAsString() {
      return shape;
    }

    /**
     * Defines the minimum width of viewport that comply with this specification.
     * minimum: 1
     * @return minWidth
    **/
    @JsonProperty("minWidth")
    public Integer getMinWidth() {
        return minWidth;
    }


    /**
     * Defines the maximum width of viewport that comply with this specification.
     * minimum: 1
     * @return maxWidth
    **/
    @JsonProperty("maxWidth")
    public Integer getMaxWidth() {
        return maxWidth;
    }


    /**
     * Defines the minimum height of viewport that comply with this specification.
     * minimum: 1
     * @return minHeight
    **/
    @JsonProperty("minHeight")
    public Integer getMinHeight() {
        return minHeight;
    }


    /**
     * Defines the maximum height of viewport that comply with this specification.
     * minimum: 1
     * @return maxHeight
    **/
    @JsonProperty("maxHeight")
    public Integer getMaxHeight() {
        return maxHeight;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViewportSpecification v1SkillManifestViewportSpecification = (ViewportSpecification) o;
        return Objects.equals(this.mode, v1SkillManifestViewportSpecification.mode) &&
            Objects.equals(this.shape, v1SkillManifestViewportSpecification.shape) &&
            Objects.equals(this.minWidth, v1SkillManifestViewportSpecification.minWidth) &&
            Objects.equals(this.maxWidth, v1SkillManifestViewportSpecification.maxWidth) &&
            Objects.equals(this.minHeight, v1SkillManifestViewportSpecification.minHeight) &&
            Objects.equals(this.maxHeight, v1SkillManifestViewportSpecification.maxHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mode, shape, minWidth, maxWidth, minHeight, maxHeight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ViewportSpecification {\n");
        
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    shape: ").append(toIndentedString(shape)).append("\n");
        sb.append("    minWidth: ").append(toIndentedString(minWidth)).append("\n");
        sb.append("    maxWidth: ").append(toIndentedString(maxWidth)).append("\n");
        sb.append("    minHeight: ").append(toIndentedString(minHeight)).append("\n");
        sb.append("    maxHeight: ").append(toIndentedString(maxHeight)).append("\n");
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
        private String mode;
        private String shape;
        private Integer minWidth;
        private Integer maxWidth;
        private Integer minHeight;
        private Integer maxHeight;

        private Builder() {}

        @JsonProperty("mode")
        public Builder withMode(String mode) {
          this.mode = mode;
          return this;
        }

        public Builder withMode(com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportMode mode) {
            this.mode = mode != null ? mode.toString() : null;
            return this;
        }


        @JsonProperty("shape")
        public Builder withShape(String shape) {
          this.shape = shape;
          return this;
        }

        public Builder withShape(com.amazon.ask.smapi.model.v1.skill.Manifest.ViewportShape shape) {
            this.shape = shape != null ? shape.toString() : null;
            return this;
        }


        @JsonProperty("minWidth")

        public Builder withMinWidth(Integer minWidth) {
            this.minWidth = minWidth;
            return this;
        }


        @JsonProperty("maxWidth")

        public Builder withMaxWidth(Integer maxWidth) {
            this.maxWidth = maxWidth;
            return this;
        }


        @JsonProperty("minHeight")

        public Builder withMinHeight(Integer minHeight) {
            this.minHeight = minHeight;
            return this;
        }


        @JsonProperty("maxHeight")

        public Builder withMaxHeight(Integer maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }


        public ViewportSpecification build() {
            return new ViewportSpecification(this);
        }
    }
}

