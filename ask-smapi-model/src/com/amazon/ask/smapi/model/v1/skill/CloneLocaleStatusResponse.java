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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * A mapping of statuses per locale detailing progress of resource or error if encountered.
 */

@JsonDeserialize(builder = CloneLocaleStatusResponse.Builder.class)
public final class CloneLocaleStatusResponse {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();

    @JsonProperty("sourceLocale")
    private String sourceLocale = null;

    @JsonProperty("targetLocales")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.CloneLocaleResourceStatus> targetLocales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.CloneLocaleResourceStatus>();

    private CloneLocaleStatusResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CloneLocaleStatusResponse(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
        if (builder.sourceLocale != null) {
            this.sourceLocale = builder.sourceLocale;
        }
        if (builder.targetLocales != null) {
            this.targetLocales = builder.targetLocales;
        }
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.CloneLocaleRequestStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.CloneLocaleRequestStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Get errors
     * @return errors
    **/
    @JsonProperty("errors")
    public List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> getErrors() {
        return errors;
    }


    /**
     * Source locale which is cloned to target locales.
     * @return sourceLocale
    **/
    @JsonProperty("sourceLocale")
    public String getSourceLocale() {
        return sourceLocale;
    }


    /**
     * Mapping of statuses per locale.
     * @return targetLocales
    **/
    @JsonProperty("targetLocales")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.CloneLocaleResourceStatus> getTargetLocales() {
        return targetLocales;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloneLocaleStatusResponse v1SkillCloneLocaleStatusResponse = (CloneLocaleStatusResponse) o;
        return Objects.equals(this.status, v1SkillCloneLocaleStatusResponse.status) &&
            Objects.equals(this.errors, v1SkillCloneLocaleStatusResponse.errors) &&
            Objects.equals(this.sourceLocale, v1SkillCloneLocaleStatusResponse.sourceLocale) &&
            Objects.equals(this.targetLocales, v1SkillCloneLocaleStatusResponse.targetLocales);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, errors, sourceLocale, targetLocales);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloneLocaleStatusResponse {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    sourceLocale: ").append(toIndentedString(sourceLocale)).append("\n");
        sb.append("    targetLocales: ").append(toIndentedString(targetLocales)).append("\n");
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
        private String status;
        private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors;
        private String sourceLocale;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.CloneLocaleResourceStatus> targetLocales;

        private Builder() {}

        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.CloneLocaleRequestStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("errors")

        public Builder withErrors(List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors) {
            this.errors = errors;
            return this;
        }

        public Builder addErrorsItem(com.amazon.ask.smapi.model.v1.skill.StandardizedError errorsItem) {
            if (this.errors == null) {
                this.errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();
            }
            this.errors.add(errorsItem);
            return this;
        }

        @JsonProperty("sourceLocale")

        public Builder withSourceLocale(String sourceLocale) {
            this.sourceLocale = sourceLocale;
            return this;
        }


        @JsonProperty("targetLocales")

        public Builder withTargetLocales(Map<String, com.amazon.ask.smapi.model.v1.skill.CloneLocaleResourceStatus> targetLocales) {
            this.targetLocales = targetLocales;
            return this;
        }

        public Builder putTargetLocalesItem(String key, com.amazon.ask.smapi.model.v1.skill.CloneLocaleResourceStatus targetLocalesItem) {
            if (this.targetLocales == null) {
                this.targetLocales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.CloneLocaleResourceStatus>();
            }
            this.targetLocales.put(key, targetLocalesItem);
            return this;
        }

        public CloneLocaleStatusResponse build() {
            return new CloneLocaleStatusResponse(this);
        }
    }
}

