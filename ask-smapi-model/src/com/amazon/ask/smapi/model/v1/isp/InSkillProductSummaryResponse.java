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


package com.amazon.ask.smapi.model.v1.isp;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * In-skill product summary response.
 */

@JsonDeserialize(builder = InSkillProductSummaryResponse.Builder.class)
public final class InSkillProductSummaryResponse {

    @JsonProperty("inSkillProductSummary")
    private com.amazon.ask.smapi.model.v1.isp.InSkillProductSummary inSkillProductSummary = null;

    public static Builder builder() {
        return new Builder();
    }

    private InSkillProductSummaryResponse(Builder builder) {
        if (builder.inSkillProductSummary != null) {
            this.inSkillProductSummary = builder.inSkillProductSummary;
        }
    }

    /**
     * Get inSkillProductSummary
     * @return inSkillProductSummary
    **/
    @JsonProperty("inSkillProductSummary")
    public com.amazon.ask.smapi.model.v1.isp.InSkillProductSummary getInSkillProductSummary() {
        return inSkillProductSummary;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InSkillProductSummaryResponse v1IspInSkillProductSummaryResponse = (InSkillProductSummaryResponse) o;
        return Objects.equals(this.inSkillProductSummary, v1IspInSkillProductSummaryResponse.inSkillProductSummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inSkillProductSummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InSkillProductSummaryResponse {\n");
        
        sb.append("    inSkillProductSummary: ").append(toIndentedString(inSkillProductSummary)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.isp.InSkillProductSummary inSkillProductSummary;

        private Builder() {}

        @JsonProperty("inSkillProductSummary")

        public Builder withInSkillProductSummary(com.amazon.ask.smapi.model.v1.isp.InSkillProductSummary inSkillProductSummary) {
            this.inSkillProductSummary = inSkillProductSummary;
            return this;
        }


        public InSkillProductSummaryResponse build() {
            return new InSkillProductSummaryResponse(this);
        }
    }
}

