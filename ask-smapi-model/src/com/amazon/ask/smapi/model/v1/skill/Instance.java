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
 * Structure representing properties of an instance of data. Definition will be either one of a booleanInstance, stringInstance, integerInstance, or compoundInstance.
 */

@JsonDeserialize(builder = Instance.Builder.class)
public final class Instance {

    @JsonProperty("propertyPath")
    private String propertyPath = null;

    @JsonProperty("dataType")
    private String dataType = null;

    @JsonProperty("value")
    private String value = null;

    public static Builder builder() {
        return new Builder();
    }

    private Instance(Builder builder) {
        if (builder.propertyPath != null) {
            this.propertyPath = builder.propertyPath;
        }
        if (builder.dataType != null) {
            this.dataType = builder.dataType;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
    }

    /**
     * Path that uniquely identifies the instance in the resource.
     * @return propertyPath
    **/
    @JsonProperty("propertyPath")
    public String getPropertyPath() {
        return propertyPath;
    }


    /**
     * Get dataType
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getDataTypeAsString().
     *
     * @return dataType
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes getDataType() {
        return com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes.fromValue(dataType);
    }

    /**
     * Get the underlying String value for dataType.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return dataType as a String value
    **/
    @JsonProperty("dataType")
    public String getDataTypeAsString() {
      return dataType;
    }

    /**
     * String value of the instance. Incase of null, object or array the value field would be null or not present. Incase of string, boolean or integer dataType it will be the corresponding String value.
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Instance v1SkillInstance = (Instance) o;
        return Objects.equals(this.propertyPath, v1SkillInstance.propertyPath) &&
            Objects.equals(this.dataType, v1SkillInstance.dataType) &&
            Objects.equals(this.value, v1SkillInstance.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyPath, dataType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Instance {\n");
        
        sb.append("    propertyPath: ").append(toIndentedString(propertyPath)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
        private String propertyPath;
        private String dataType;
        private String value;

        private Builder() {}

        @JsonProperty("propertyPath")

        public Builder withPropertyPath(String propertyPath) {
            this.propertyPath = propertyPath;
            return this;
        }


        @JsonProperty("dataType")

        public Builder withDataType(String dataType) {
          this.dataType = dataType;
          return this;
        }

        public Builder withDataType(com.amazon.ask.smapi.model.v1.skill.ValidationDataTypes dataType) {
            this.dataType = dataType != null ? dataType.toString() : null;
            return this;
        }


        @JsonProperty("value")

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        public Instance build() {
            return new Instance(this);
        }
    }
}

