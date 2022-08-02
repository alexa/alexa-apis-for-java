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
 * Defines the structure for interaction model build status.
 */

@JsonDeserialize(builder = SkillInteractionModelStatus.Builder.class)
public final class SkillInteractionModelStatus {

    @JsonProperty("lastUpdateRequest")
    private com.amazon.ask.smapi.model.v1.skill.InteractionModelLastUpdateRequest lastUpdateRequest = null;

    @JsonProperty("eTag")
    private String eTag = null;

    @JsonProperty("version")
    private String version = null;

    private SkillInteractionModelStatus() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillInteractionModelStatus(Builder builder) {
        if (builder.lastUpdateRequest != null) {
            this.lastUpdateRequest = builder.lastUpdateRequest;
        }
        if (builder.eTag != null) {
            this.eTag = builder.eTag;
        }
        if (builder.version != null) {
            this.version = builder.version;
        }
    }

    /**
     * Get lastUpdateRequest
     * @return lastUpdateRequest
    **/
    @JsonProperty("lastUpdateRequest")
    public com.amazon.ask.smapi.model.v1.skill.InteractionModelLastUpdateRequest getLastUpdateRequest() {
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillInteractionModelStatus v1SkillSkillInteractionModelStatus = (SkillInteractionModelStatus) o;
        return Objects.equals(this.lastUpdateRequest, v1SkillSkillInteractionModelStatus.lastUpdateRequest) &&
            Objects.equals(this.eTag, v1SkillSkillInteractionModelStatus.eTag) &&
            Objects.equals(this.version, v1SkillSkillInteractionModelStatus.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdateRequest, eTag, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillInteractionModelStatus {\n");
        
        sb.append("    lastUpdateRequest: ").append(toIndentedString(lastUpdateRequest)).append("\n");
        sb.append("    eTag: ").append(toIndentedString(eTag)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.InteractionModelLastUpdateRequest lastUpdateRequest;
        private String eTag;
        private String version;

        private Builder() {}

        @JsonProperty("lastUpdateRequest")

        public Builder withLastUpdateRequest(com.amazon.ask.smapi.model.v1.skill.InteractionModelLastUpdateRequest lastUpdateRequest) {
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


        public SkillInteractionModelStatus build() {
            return new SkillInteractionModelStatus(this);
        }
    }
}

