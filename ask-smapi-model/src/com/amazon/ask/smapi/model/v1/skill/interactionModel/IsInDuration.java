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
 * Validates that the given date or time (as a slot value) is in a given interval. Unlike other range validations, duration based validations lets the developer define a dynamic range of date or time using ISO_8601 Duration Format. Based on the given &#39;start&#39; and &#39;end&#39; parameters an interval is created. The slot value given by the skill&#39;s user at runtime is then validated inside this interval. Both &#39;start&#39; and &#39;end&#39; parameters are in reference to the current date/time. Here the current date/time refers to the date/time when the skill&#39;s user made the request. 
 */

@JsonDeserialize(builder = IsInDuration.Builder.class)
public final class IsInDuration extends com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation  {

    @JsonProperty("start")
    private String start = null;

    @JsonProperty("end")
    private String end = null;

    public static Builder builder() {
        return new Builder();
    }

    private IsInDuration(Builder builder) {
        String discriminatorValue = "IsInDuration";

        this.type = discriminatorValue;
        if (builder.prompt != null) {
            this.prompt = builder.prompt;
        }
        if (builder.start != null) {
            this.start = builder.start;
        }
        if (builder.end != null) {
            this.end = builder.end;
        }
    }

    /**
     * * `AMAZON.DATE`: ISO 8601 Duration using Y, M or D components or ISO 8601 Calendar Date in YYYY-MM-DD format. * `AMAZON.TIME`: ISO 8601 Duration using H or M component or ISO 8601 24-Hour Clock Time in hh:mm format. 
     * @return start
    **/
    @JsonProperty("start")
    public String getStart() {
        return start;
    }

    /**
     * * `AMAZON.DATE`: ISO 8601 Duration using Y, M or D components or ISO 8601 Calendar Date in YYYY-MM-DD format. * `AMAZON.TIME`: ISO 8601 Duration using H or M component or ISO 8601 24-Hour Clock Time in hh:mm format. 
     * @return end
    **/
    @JsonProperty("end")
    public String getEnd() {
        return end;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IsInDuration v1SkillInteractionModelIsInDuration = (IsInDuration) o;
        return Objects.equals(this.start, v1SkillInteractionModelIsInDuration.start) &&
            Objects.equals(this.end, v1SkillInteractionModelIsInDuration.end) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsInDuration {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
        private String prompt;
        private String start;
        private String end;

        private Builder() {}

        @JsonProperty("prompt")
        public Builder withPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }


        @JsonProperty("start")
        public Builder withStart(String start) {
            this.start = start;
            return this;
        }


        @JsonProperty("end")
        public Builder withEnd(String end) {
            this.end = end;
            return this;
        }


        public IsInDuration build() {
            return new IsInDuration(this);
        }
    }
}

