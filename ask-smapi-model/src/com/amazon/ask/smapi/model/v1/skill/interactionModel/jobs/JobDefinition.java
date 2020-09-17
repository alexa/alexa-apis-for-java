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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition for dynamic job.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ReferenceVersionUpdate.class, name = "ReferenceVersionUpdate"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.CatalogAutoRefresh.class, name = "CatalogAutoRefresh"),
})
public abstract class JobDefinition {

    protected String type = null;

    @JsonProperty("trigger")
    protected com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Trigger trigger = null;

    @JsonProperty("status")
    protected String status = null;

    protected JobDefinition() {
    }

    /**
     * Polymorphic type of the job
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    /**
     * Get trigger
     * @return trigger
    **/
    @JsonProperty("trigger")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Trigger getTrigger() {
        return trigger;
    }


    /**
     * Current status of the job definition.
     * @return status
    **/
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobDefinition v1SkillInteractionModelJobsJobDefinition = (JobDefinition) o;
        return Objects.equals(this.type, v1SkillInteractionModelJobsJobDefinition.type) &&
            Objects.equals(this.trigger, v1SkillInteractionModelJobsJobDefinition.trigger) &&
            Objects.equals(this.status, v1SkillInteractionModelJobsJobDefinition.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, trigger, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDefinition {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
  
}

