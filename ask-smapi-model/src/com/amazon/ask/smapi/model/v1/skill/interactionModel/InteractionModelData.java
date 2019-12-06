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


package com.amazon.ask.smapi.model.v1.skill.interactionModel;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InteractionModelData
 */

@JsonDeserialize(builder = InteractionModelData.Builder.class)
public final class InteractionModelData {

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("interactionModel")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelSchema interactionModel = null;

    public static Builder builder() {
        return new Builder();
    }

    private InteractionModelData(Builder builder) {
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.interactionModel != null) {
            this.interactionModel = builder.interactionModel;
        }
    }

    /**
     * Get version
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Get description
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Get interactionModel
     * @return interactionModel
    **/
    @JsonProperty("interactionModel")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelSchema getInteractionModel() {
        return interactionModel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteractionModelData v1SkillInteractionModelInteractionModelData = (InteractionModelData) o;
        return Objects.equals(this.version, v1SkillInteractionModelInteractionModelData.version) &&
            Objects.equals(this.description, v1SkillInteractionModelInteractionModelData.description) &&
            Objects.equals(this.interactionModel, v1SkillInteractionModelInteractionModelData.interactionModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, description, interactionModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionModelData {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    interactionModel: ").append(toIndentedString(interactionModel)).append("\n");
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
        private String version;
        private String description;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelSchema interactionModel;

        private Builder() {}

        @JsonProperty("version")
        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("description")
        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("interactionModel")
        public Builder withInteractionModel(com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelSchema interactionModel) {
            this.interactionModel = interactionModel;
            return this;
        }


        public InteractionModelData build() {
            return new InteractionModelData(this);
        }
    }
}

