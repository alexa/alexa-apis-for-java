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


package com.amazon.ask.smapi.model.v1.skill.evaluations;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * A resolutions object representing the results of resolving the words captured from the user&#39;s utterance. 
 */

@JsonDeserialize(builder = SlotResolutions.Builder.class)
public final class SlotResolutions {

    @JsonProperty("resolutionsPerAuthority")
    private List<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityItems> resolutionsPerAuthority = new ArrayList<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityItems>();

    public static Builder builder() {
        return new Builder();
    }

    private SlotResolutions(Builder builder) {
        if (builder.resolutionsPerAuthority != null) {
            this.resolutionsPerAuthority = builder.resolutionsPerAuthority;
        }
    }

    /**
     * An array of objects representing each possible authority for entity resolution. An authority represents the source for the data provided for the slot. For a custom slot type, the authority is the slot type you defined. 
     * @return resolutionsPerAuthority
    **/
    @JsonProperty("resolutionsPerAuthority")
    public List<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityItems> getResolutionsPerAuthority() {
        return resolutionsPerAuthority;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotResolutions v1SkillEvaluationsSlotResolutions = (SlotResolutions) o;
        return Objects.equals(this.resolutionsPerAuthority, v1SkillEvaluationsSlotResolutions.resolutionsPerAuthority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionsPerAuthority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotResolutions {\n");
        
        sb.append("    resolutionsPerAuthority: ").append(toIndentedString(resolutionsPerAuthority)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityItems> resolutionsPerAuthority;

        private Builder() {}

        @JsonProperty("resolutionsPerAuthority")
        public Builder withResolutionsPerAuthority(List<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityItems> resolutionsPerAuthority) {
            this.resolutionsPerAuthority = resolutionsPerAuthority;
            return this;
        }

        public Builder addResolutionsPerAuthorityItem(com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityItems resolutionsPerAuthorityItem) {
            if (this.resolutionsPerAuthority == null) {
                this.resolutionsPerAuthority = new ArrayList<com.amazon.ask.smapi.model.v1.skill.evaluations.ResolutionsPerAuthorityItems>();
            }
            this.resolutionsPerAuthority.add(resolutionsPerAuthorityItem);
            return this;
        }

        public SlotResolutions build() {
            return new SlotResolutions(this);
        }
    }
}

