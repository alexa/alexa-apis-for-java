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
 * Contains attributes related to last modification (create/update) request of a resource.
 */

@JsonDeserialize(builder = ManifestLastUpdateRequest.Builder.class)
public final class ManifestLastUpdateRequest {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();

    @JsonProperty("warnings")
    private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> warnings = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();

    @JsonProperty("version")
    private String version = null;

    public static Builder builder() {
        return new Builder();
    }

    private ManifestLastUpdateRequest(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
        if (builder.warnings != null) {
            this.warnings = builder.warnings;
        }
        if (builder.version != null) {
            this.version = builder.version;
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
    
    public com.amazon.ask.smapi.model.v1.skill.Status getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.Status.fromValue(status);
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
     * Get warnings
     * @return warnings
    **/
    @JsonProperty("warnings")
    public List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> getWarnings() {
        return warnings;
    }


    /**
     * on success, this field indicates the created version.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManifestLastUpdateRequest v1SkillManifestLastUpdateRequest = (ManifestLastUpdateRequest) o;
        return Objects.equals(this.status, v1SkillManifestLastUpdateRequest.status) &&
            Objects.equals(this.errors, v1SkillManifestLastUpdateRequest.errors) &&
            Objects.equals(this.warnings, v1SkillManifestLastUpdateRequest.warnings) &&
            Objects.equals(this.version, v1SkillManifestLastUpdateRequest.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, errors, warnings, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManifestLastUpdateRequest {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> warnings;
        private String version;

        private Builder() {}

        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.Status status) {
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

        @JsonProperty("warnings")

        public Builder withWarnings(List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> warnings) {
            this.warnings = warnings;
            return this;
        }

        public Builder addWarningsItem(com.amazon.ask.smapi.model.v1.skill.StandardizedError warningsItem) {
            if (this.warnings == null) {
                this.warnings = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();
            }
            this.warnings.add(warningsItem);
            return this;
        }

        @JsonProperty("version")

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        public ManifestLastUpdateRequest build() {
            return new ManifestLastUpdateRequest(this);
        }
    }
}

