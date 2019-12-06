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
 * Defines the structure for a resource status.
 */

@JsonDeserialize(builder = ResourceStatus.Builder.class)
public final class ResourceStatus {

    @JsonProperty("lastUpdateRequest")
    private com.amazon.ask.smapi.model.v1.skill.LastUpdateRequest lastUpdateRequest = null;

    @JsonProperty("eTag")
    private String eTag = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();

    @JsonProperty("warnings")
    private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> warnings = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();

    public static Builder builder() {
        return new Builder();
    }

    private ResourceStatus(Builder builder) {
        if (builder.lastUpdateRequest != null) {
            this.lastUpdateRequest = builder.lastUpdateRequest;
        }
        if (builder.eTag != null) {
            this.eTag = builder.eTag;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
        if (builder.warnings != null) {
            this.warnings = builder.warnings;
        }
    }

    /**
     * Get lastUpdateRequest
     * @return lastUpdateRequest
    **/
    @JsonProperty("lastUpdateRequest")
    public com.amazon.ask.smapi.model.v1.skill.LastUpdateRequest getLastUpdateRequest() {
        return lastUpdateRequest;
    }

    /**
     * An opaque identifier for last successfully updated resource.
     * @return eTag
    **/
    @JsonProperty("eTag")
    public String getETag() {
        return eTag;
    }

    /**
     * Version for last successfully built model.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceStatus v1SkillResourceStatus = (ResourceStatus) o;
        return Objects.equals(this.lastUpdateRequest, v1SkillResourceStatus.lastUpdateRequest) &&
            Objects.equals(this.eTag, v1SkillResourceStatus.eTag) &&
            Objects.equals(this.version, v1SkillResourceStatus.version) &&
            Objects.equals(this.errors, v1SkillResourceStatus.errors) &&
            Objects.equals(this.warnings, v1SkillResourceStatus.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdateRequest, eTag, version, errors, warnings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceStatus {\n");
        
        sb.append("    lastUpdateRequest: ").append(toIndentedString(lastUpdateRequest)).append("\n");
        sb.append("    eTag: ").append(toIndentedString(eTag)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.LastUpdateRequest lastUpdateRequest;
        private String eTag;
        private String version;
        private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors;
        private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> warnings;

        private Builder() {}

        @JsonProperty("lastUpdateRequest")
        public Builder withLastUpdateRequest(com.amazon.ask.smapi.model.v1.skill.LastUpdateRequest lastUpdateRequest) {
            this.lastUpdateRequest = lastUpdateRequest;
            return this;
        }


        @JsonProperty("eTag")
        public Builder withETag(String eTag) {
            this.eTag = eTag;
            return this;
        }


        @JsonProperty("version")
        public Builder withVersion(String version) {
            this.version = version;
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

        public ResourceStatus build() {
            return new ResourceStatus(this);
        }
    }
}

