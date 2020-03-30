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
 * Defines the structure for a resource deployment status.
 */

@JsonDeserialize(builder = ResourceImportStatus.Builder.class)
public final class ResourceImportStatus {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("action")
    private String action = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();

    @JsonProperty("warnings")
    private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> warnings = new ArrayList<com.amazon.ask.smapi.model.v1.skill.StandardizedError>();

    public static Builder builder() {
        return new Builder();
    }

    private ResourceImportStatus(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.action != null) {
            this.action = builder.action;
        }
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
        if (builder.warnings != null) {
            this.warnings = builder.warnings;
        }
    }

    /**
     * Resource name. eg. manifest, interactionModels.en_US and so on.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.ResponseStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.ResponseStatus.fromValue(status);
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
     * Get action
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getActionAsString().
     *
     * @return action
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Action getAction() {
        return com.amazon.ask.smapi.model.v1.skill.Action.fromValue(action);
    }

    /**
     * Get the underlying String value for action.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return action as a String value
    **/
    @JsonProperty("action")
    public String getActionAsString() {
      return action;
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
        ResourceImportStatus v1SkillResourceImportStatus = (ResourceImportStatus) o;
        return Objects.equals(this.name, v1SkillResourceImportStatus.name) &&
            Objects.equals(this.status, v1SkillResourceImportStatus.status) &&
            Objects.equals(this.action, v1SkillResourceImportStatus.action) &&
            Objects.equals(this.errors, v1SkillResourceImportStatus.errors) &&
            Objects.equals(this.warnings, v1SkillResourceImportStatus.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, action, errors, warnings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceImportStatus {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
        private String name;
        private String status;
        private String action;
        private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> errors;
        private List<com.amazon.ask.smapi.model.v1.skill.StandardizedError> warnings;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.ResponseStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("action")
        public Builder withAction(String action) {
          this.action = action;
          return this;
        }

        public Builder withAction(com.amazon.ask.smapi.model.v1.skill.Action action) {
            this.action = action != null ? action.toString() : null;
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

        public ResourceImportStatus build() {
            return new ResourceImportStatus(this);
        }
    }
}

