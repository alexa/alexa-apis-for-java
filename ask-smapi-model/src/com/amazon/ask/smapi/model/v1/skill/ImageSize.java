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
import java.math.BigDecimal;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * On disk storage size of image.
 */

@JsonDeserialize(builder = ImageSize.Builder.class)
public final class ImageSize {

    @JsonProperty("value")
    private BigDecimal value = null;

    @JsonProperty("unit")
    private String unit = null;

    public static Builder builder() {
        return new Builder();
    }

    private ImageSize(Builder builder) {
        if (builder.value != null) {
            this.value = builder.value;
        }
        if (builder.unit != null) {
            this.unit = builder.unit;
        }
    }

    /**
     * Value measuring the size of the image.
     * @return value
    **/
    @JsonProperty("value")
    public BigDecimal getValue() {
        return value;
    }


    /**
     * Get unit
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getUnitAsString().
     *
     * @return unit
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.ImageSizeUnit getUnit() {
        return com.amazon.ask.smapi.model.v1.skill.ImageSizeUnit.fromValue(unit);
    }

    /**
     * Get the underlying String value for unit.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return unit as a String value
    **/
    @JsonProperty("unit")
    public String getUnitAsString() {
      return unit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageSize v1SkillImageSize = (ImageSize) o;
        return Objects.equals(this.value, v1SkillImageSize.value) &&
            Objects.equals(this.unit, v1SkillImageSize.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageSize {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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
        private BigDecimal value;
        private String unit;

        private Builder() {}

        @JsonProperty("value")

        public Builder withValue(BigDecimal value) {
            this.value = value;
            return this;
        }


        @JsonProperty("unit")
        public Builder withUnit(String unit) {
          this.unit = unit;
          return this;
        }

        public Builder withUnit(com.amazon.ask.smapi.model.v1.skill.ImageSizeUnit unit) {
            this.unit = unit != null ? unit.toString() : null;
            return this;
        }


        public ImageSize build() {
            return new ImageSize(this);
        }
    }
}

