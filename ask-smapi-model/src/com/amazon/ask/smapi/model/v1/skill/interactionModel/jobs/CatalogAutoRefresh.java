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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition for CatalogAutoRefresh job.
 */

@JsonDeserialize(builder = CatalogAutoRefresh.Builder.class)
public final class CatalogAutoRefresh extends com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.JobDefinition  {

    @JsonProperty("trigger")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Scheduled trigger = null;

    @JsonProperty("resource")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Catalog resource = null;

    private CatalogAutoRefresh() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CatalogAutoRefresh(Builder builder) {
        String discriminatorValue = "CatalogAutoRefresh";

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
    }

    /**
     * CatalogAutoRefresh can only have CatalogAutoRefresh trigger.
     * @return trigger
    **/
    @JsonProperty("trigger")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Scheduled getTrigger() {
        return trigger;
    }


    /**
     * The resource that the job is act on. Only catalog is allowed.
     * @return resource
    **/
    @JsonProperty("resource")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Catalog getResource() {
        return resource;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogAutoRefresh v1SkillInteractionModelJobsCatalogAutoRefresh = (CatalogAutoRefresh) o;
        return Objects.equals(this.trigger, v1SkillInteractionModelJobsCatalogAutoRefresh.trigger) &&
            Objects.equals(this.resource, v1SkillInteractionModelJobsCatalogAutoRefresh.resource) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trigger, resource, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogAutoRefresh {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Scheduled trigger;
        private String status;
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Catalog resource;

        private Builder() {}

        @JsonProperty("trigger")

        public Builder withTrigger(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Scheduled trigger) {
            this.trigger = trigger;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
            this.status = status;
            return this;
        }


        @JsonProperty("resource")

        public Builder withResource(com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Catalog resource) {
            this.resource = resource;
            return this;
        }


        public CatalogAutoRefresh build() {
            return new CatalogAutoRefresh(this);
        }
    }
}

