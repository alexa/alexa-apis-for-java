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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.type;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Contains attributes related to last modification request of a resource.
 */

@JsonDeserialize(builder = LastUpdateRequest.Builder.class)
public final class LastUpdateRequest {

    @JsonProperty("status")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatusType status = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error>();

    @JsonProperty("warnings")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning> warnings = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning>();

    public static Builder builder() {
        return new Builder();
    }

    private LastUpdateRequest(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
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
     * Get status
     * @return status
    **/
    @JsonProperty("status")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatusType getStatus() {
        return status;
    }

    /**
     * The version id of the entity returned.
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
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error> getErrors() {
        return errors;
    }

    /**
     * Get warnings
     * @return warnings
    **/
    @JsonProperty("warnings")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning> getWarnings() {
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
        LastUpdateRequest v1SkillInteractionModelTypeLastUpdateRequest = (LastUpdateRequest) o;
        return Objects.equals(this.status, v1SkillInteractionModelTypeLastUpdateRequest.status) &&
            Objects.equals(this.version, v1SkillInteractionModelTypeLastUpdateRequest.version) &&
            Objects.equals(this.errors, v1SkillInteractionModelTypeLastUpdateRequest.errors) &&
            Objects.equals(this.warnings, v1SkillInteractionModelTypeLastUpdateRequest.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, version, errors, warnings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LastUpdateRequest {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatusType status;
        private String version;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error> errors;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning> warnings;

        private Builder() {}

        @JsonProperty("status")
        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.SlotTypeStatusType status) {
            this.status = status;
            return this;
        }


        @JsonProperty("version")
        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("errors")
        public Builder withErrors(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error> errors) {
            this.errors = errors;
            return this;
        }

        public Builder addErrorsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error errorsItem) {
            if (this.errors == null) {
                this.errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Error>();
            }
            this.errors.add(errorsItem);
            return this;
        }

        @JsonProperty("warnings")
        public Builder withWarnings(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning> warnings) {
            this.warnings = warnings;
            return this;
        }

        public Builder addWarningsItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning warningsItem) {
            if (this.warnings == null) {
                this.warnings = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.type.Warning>();
            }
            this.warnings.add(warningsItem);
            return this;
        }

        public LastUpdateRequest build() {
            return new LastUpdateRequest(this);
        }
    }
}

