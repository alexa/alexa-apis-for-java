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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the request body for the cloneLocale API.
 */

@JsonDeserialize(builder = CloneLocaleRequest.Builder.class)
public final class CloneLocaleRequest {

    @JsonProperty("sourceLocale")
    private String sourceLocale = null;

    @JsonProperty("targetLocales")
    private List<String> targetLocales = new ArrayList<String>();

    @JsonProperty("overwriteMode")
    private String overwriteMode = null;

    public static Builder builder() {
        return new Builder();
    }

    private CloneLocaleRequest(Builder builder) {
        if (builder.sourceLocale != null) {
            this.sourceLocale = builder.sourceLocale;
        }
        if (builder.targetLocales != null) {
            this.targetLocales = builder.targetLocales;
        }
        if (builder.overwriteMode != null) {
            this.overwriteMode = builder.overwriteMode;
        }
    }

    /**
     * Locale with the assets that will be cloned.
     * @return sourceLocale
    **/
    @JsonProperty("sourceLocale")
    public String getSourceLocale() {
        return sourceLocale;
    }


    /**
     * A list of locale(s) where the assets will be copied to.
     * @return targetLocales
    **/
    @JsonProperty("targetLocales")
    public List<String> getTargetLocales() {
        return targetLocales;
    }


    /**
     * Can locale of skill be overwritten. Default value is DO_NOT_OVERWRITE.
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getOverwriteModeAsString().
     *
     * @return overwriteMode
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.OverwriteMode getOverwriteMode() {
        return com.amazon.ask.smapi.model.v1.skill.OverwriteMode.fromValue(overwriteMode);
    }

    /**
     * Get the underlying String value for overwriteMode.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return overwriteMode as a String value
    **/
    @JsonProperty("overwriteMode")
    public String getOverwriteModeAsString() {
      return overwriteMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloneLocaleRequest v1SkillCloneLocaleRequest = (CloneLocaleRequest) o;
        return Objects.equals(this.sourceLocale, v1SkillCloneLocaleRequest.sourceLocale) &&
            Objects.equals(this.targetLocales, v1SkillCloneLocaleRequest.targetLocales) &&
            Objects.equals(this.overwriteMode, v1SkillCloneLocaleRequest.overwriteMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceLocale, targetLocales, overwriteMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneLocaleRequest {\n");
        
        sb.append("    sourceLocale: ").append(toIndentedString(sourceLocale)).append("\n");
        sb.append("    targetLocales: ").append(toIndentedString(targetLocales)).append("\n");
        sb.append("    overwriteMode: ").append(toIndentedString(overwriteMode)).append("\n");
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
        private String sourceLocale;
        private List<String> targetLocales;
        private String overwriteMode;

        private Builder() {}

        @JsonProperty("sourceLocale")

        public Builder withSourceLocale(String sourceLocale) {
            this.sourceLocale = sourceLocale;
            return this;
        }


        @JsonProperty("targetLocales")

        public Builder withTargetLocales(List<String> targetLocales) {
            this.targetLocales = targetLocales;
            return this;
        }

        public Builder addTargetLocalesItem(String targetLocalesItem) {
            if (this.targetLocales == null) {
                this.targetLocales = new ArrayList<String>();
            }
            this.targetLocales.add(targetLocalesItem);
            return this;
        }

        @JsonProperty("overwriteMode")

        public Builder withOverwriteMode(String overwriteMode) {
          this.overwriteMode = overwriteMode;
          return this;
        }

        public Builder withOverwriteMode(com.amazon.ask.smapi.model.v1.skill.OverwriteMode overwriteMode) {
            this.overwriteMode = overwriteMode != null ? overwriteMode.toString() : null;
            return this;
        }


        public CloneLocaleRequest build() {
            return new CloneLocaleRequest(this);
        }
    }
}

