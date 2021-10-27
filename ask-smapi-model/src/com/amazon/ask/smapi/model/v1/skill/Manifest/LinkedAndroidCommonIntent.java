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
 * Android common intents associated with the skill
 */

@JsonDeserialize(builder = LinkedAndroidCommonIntent.Builder.class)
public final class LinkedAndroidCommonIntent {

    @JsonProperty("intentName")
    private String intentName = null;

    @JsonProperty("catalogType")
    private String catalogType = null;

    public static Builder builder() {
        return new Builder();
    }

    private LinkedAndroidCommonIntent(Builder builder) {
        if (builder.intentName != null) {
            this.intentName = builder.intentName;
        }
        if (builder.catalogType != null) {
            this.catalogType = builder.catalogType;
        }
    }

    /**
     * Get intentName
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getIntentNameAsString().
     *
     * @return intentName
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.AndroidCommonIntentName getIntentName() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.AndroidCommonIntentName.fromValue(intentName);
    }

    /**
     * Get the underlying String value for intentName.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return intentName as a String value
    **/
    @JsonProperty("intentName")
    public String getIntentNameAsString() {
      return intentName;
    }

    /**
     * Get catalogType
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getCatalogTypeAsString().
     *
     * @return catalogType
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.CatalogName getCatalogType() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.CatalogName.fromValue(catalogType);
    }

    /**
     * Get the underlying String value for catalogType.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return catalogType as a String value
    **/
    @JsonProperty("catalogType")
    public String getCatalogTypeAsString() {
      return catalogType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkedAndroidCommonIntent v1SkillManifestLinkedAndroidCommonIntent = (LinkedAndroidCommonIntent) o;
        return Objects.equals(this.intentName, v1SkillManifestLinkedAndroidCommonIntent.intentName) &&
            Objects.equals(this.catalogType, v1SkillManifestLinkedAndroidCommonIntent.catalogType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intentName, catalogType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkedAndroidCommonIntent {\n");
        
        sb.append("    intentName: ").append(toIndentedString(intentName)).append("\n");
        sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
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
        private String intentName;
        private String catalogType;

        private Builder() {}

        @JsonProperty("intentName")
        public Builder withIntentName(String intentName) {
          this.intentName = intentName;
          return this;
        }

        public Builder withIntentName(com.amazon.ask.smapi.model.v1.skill.Manifest.AndroidCommonIntentName intentName) {
            this.intentName = intentName != null ? intentName.toString() : null;
            return this;
        }


        @JsonProperty("catalogType")
        public Builder withCatalogType(String catalogType) {
          this.catalogType = catalogType;
          return this;
        }

        public Builder withCatalogType(com.amazon.ask.smapi.model.v1.skill.Manifest.CatalogName catalogType) {
            this.catalogType = catalogType != null ? catalogType.toString() : null;
            return this;
        }


        public LinkedAndroidCommonIntent build() {
            return new LinkedAndroidCommonIntent(this);
        }
    }
}

