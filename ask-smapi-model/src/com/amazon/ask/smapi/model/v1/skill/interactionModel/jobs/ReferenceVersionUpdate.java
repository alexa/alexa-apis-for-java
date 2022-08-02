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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Definition for ReferenceVersionUpdate job.
 */

@JsonDeserialize(builder = ReferenceVersionUpdate.Builder.class)
public final class ReferenceVersionUpdate extends com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinition  {

    @JsonProperty("trigger")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ReferencedResourceJobsComplete trigger = null;

    @JsonProperty("resource")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject resource = null;

    @JsonProperty("references")
    private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject> references = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject>();

    @JsonProperty("publishToLive")
    private Boolean publishToLive = null;

    private ReferenceVersionUpdate() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ReferenceVersionUpdate(Builder builder) {
        String discriminatorValue = "ReferenceVersionUpdate";

        this.type = discriminatorValue;
        if (builder.trigger != null) {
            this.trigger = builder.trigger;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.resource != null) {
            this.resource = builder.resource;
        }
        if (builder.references != null) {
            this.references = builder.references;
        }
        if (builder.publishToLive != null) {
            this.publishToLive = builder.publishToLive;
        }
    }

    /**
     * Can only have ReferencedResourceJobsComplete trigger.
     * @return trigger
    **/
    @JsonProperty("trigger")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ReferencedResourceJobsComplete getTrigger() {
        return trigger;
    }


    /**
     * The resource that the job is act on. Only slot and interactionModel are allowed.
     * @return resource
    **/
    @JsonProperty("resource")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject getResource() {
        return resource;
    }


    /**
     * Referenced resources working with ReferencedResourceJobsComplete trigger.
     * @return references
    **/
    @JsonProperty("references")
    public List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject> getReferences() {
        return references;
    }


    /**
     * Whether publish development stage to live after the updates.
     * @return publishToLive
    **/
    @JsonProperty("publishToLive")
    public Boolean getPublishToLive() {
        return publishToLive;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferenceVersionUpdate v1SkillInteractionModelJobsReferenceVersionUpdate = (ReferenceVersionUpdate) o;
        return Objects.equals(this.trigger, v1SkillInteractionModelJobsReferenceVersionUpdate.trigger) &&
            Objects.equals(this.resource, v1SkillInteractionModelJobsReferenceVersionUpdate.resource) &&
            Objects.equals(this.references, v1SkillInteractionModelJobsReferenceVersionUpdate.references) &&
            Objects.equals(this.publishToLive, v1SkillInteractionModelJobsReferenceVersionUpdate.publishToLive) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trigger, resource, references, publishToLive, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferenceVersionUpdate {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
        sb.append("    publishToLive: ").append(toIndentedString(publishToLive)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ReferencedResourceJobsComplete trigger;
        private String status;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject resource;
        private List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject> references;
        private Boolean publishToLive;

        private Builder() {}

        @JsonProperty("trigger")

        public Builder withTrigger(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ReferencedResourceJobsComplete trigger) {
            this.trigger = trigger;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
            this.status = status;
            return this;
        }


        @JsonProperty("resource")

        public Builder withResource(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject resource) {
            this.resource = resource;
            return this;
        }


        @JsonProperty("references")

        public Builder withReferences(List<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject> references) {
            this.references = references;
            return this;
        }

        public Builder addReferencesItem(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject referencesItem) {
            if (this.references == null) {
                this.references = new ArrayList<com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject>();
            }
            this.references.add(referencesItem);
            return this;
        }

        @JsonProperty("publishToLive")

        public Builder withPublishToLive(Boolean publishToLive) {
            this.publishToLive = publishToLive;
            return this;
        }


        public ReferenceVersionUpdate build() {
            return new ReferenceVersionUpdate(this);
        }
    }
}

