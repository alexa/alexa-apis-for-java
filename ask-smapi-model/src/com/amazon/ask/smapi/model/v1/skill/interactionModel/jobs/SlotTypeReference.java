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
 * Slot type reference the job is applied on.
 */

@JsonDeserialize(builder = SlotTypeReference.Builder.class)
public final class SlotTypeReference extends com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.ResourceObject  {

    @JsonProperty("id")
    private String id = null;

    private SlotTypeReference() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SlotTypeReference(Builder builder) {
        String discriminatorValue = "SlotTypeReference";

        this.type = discriminatorValue;
        if (builder.id != null) {
            this.id = builder.id;
        }
    }

    /**
     * SlotTypeReference identifier.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotTypeReference v1SkillInteractionModelJobsSlotTypeReference = (SlotTypeReference) o;
        return Objects.equals(this.id, v1SkillInteractionModelJobsSlotTypeReference.id) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotTypeReference {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        private String id;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        public SlotTypeReference build() {
            return new SlotTypeReference(this);
        }
    }
}

