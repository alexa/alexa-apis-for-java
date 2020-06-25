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


package com.amazon.ask.smapi.model.v1.skill.nlu.evaluations;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * A resolutions object representing the results of resolving the words captured from the user&#39;s utterance. 
 */

@JsonDeserialize(builder = Resolutions.Builder.class)
public final class Resolutions {

    @JsonProperty("resolutionsPerAuthority")
    private List<Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthority>> resolutionsPerAuthority = new ArrayList<Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthority>>();

    public static Builder builder() {
        return new Builder();
    }

    private Resolutions(Builder builder) {
        if (builder.resolutionsPerAuthority != null) {
            this.resolutionsPerAuthority = builder.resolutionsPerAuthority;
        }
    }

    /**
     * An array of objects representing each possible authority for entity resolution. An authority represents the source for the data provided for the slot. For a custom slot type, the authority is the slot type you defined. 
     * @return resolutionsPerAuthority
    **/
    @JsonProperty("resolutionsPerAuthority")
    public List<Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthority>> getResolutionsPerAuthority() {
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
        Resolutions v1SkillNluEvaluationsResolutions = (Resolutions) o;
        return Objects.equals(this.resolutionsPerAuthority, v1SkillNluEvaluationsResolutions.resolutionsPerAuthority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionsPerAuthority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resolutions {\n");
        
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
        private List<Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthority>> resolutionsPerAuthority;

        private Builder() {}

        @JsonProperty("resolutionsPerAuthority")

        public Builder withResolutionsPerAuthority(List<Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthority>> resolutionsPerAuthority) {
            this.resolutionsPerAuthority = resolutionsPerAuthority;
            return this;
        }

        public Builder addResolutionsPerAuthorityItem(Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthority> resolutionsPerAuthorityItem) {
            if (this.resolutionsPerAuthority == null) {
                this.resolutionsPerAuthority = new ArrayList<Map<String, com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ResolutionsPerAuthority>>();
            }
            this.resolutionsPerAuthority.add(resolutionsPerAuthorityItem);
            return this;
        }

        public Resolutions build() {
            return new Resolutions(this);
        }
    }
}

