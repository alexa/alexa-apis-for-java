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
 * Defines the structure for paid skill product tax information.
 */

@JsonDeserialize(builder = TaxInformation.Builder.class)
public final class TaxInformation {

    @JsonProperty("category")
    private String category = null;

    public static Builder builder() {
        return new Builder();
    }

    private TaxInformation(Builder builder) {
        if (builder.category != null) {
            this.category = builder.category;
        }
    }

    /**
     * Get category
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getCategoryAsString().
     *
     * @return category
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.TaxInformationCategory getCategory() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.TaxInformationCategory.fromValue(category);
    }

    /**
     * Get the underlying String value for category.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return category as a String value
    **/
    @JsonProperty("category")
    public String getCategoryAsString() {
      return category;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaxInformation v1SkillManifestTaxInformation = (TaxInformation) o;
        return Objects.equals(this.category, v1SkillManifestTaxInformation.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaxInformation {\n");
        
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
        private String category;

        private Builder() {}

        @JsonProperty("category")
        public Builder withCategory(String category) {
          this.category = category;
          return this;
        }

        public Builder withCategory(com.amazon.ask.smapi.model.v1.skill.Manifest.TaxInformationCategory category) {
            this.category = category != null ? category.toString() : null;
            return this;
        }


        public TaxInformation build() {
            return new TaxInformation(this);
        }
    }
}

