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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Results
 */

@JsonDeserialize(builder = Results.Builder.class)
public final class Results {

    @JsonProperty("href")
    private String href = null;

    private Results() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Results(Builder builder) {
        if (builder.href != null) {
            this.href = builder.href;
        }
    }

    /**
     * url to get the test case result details Example: /v1/skills/{skillId}/nluEvaluations/{evaluationId}/results 
     * @return href
    **/
    @JsonProperty("href")
    public String getHref() {
        return href;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Results v1SkillNluEvaluationsResults = (Results) o;
        return Objects.equals(this.href, v1SkillNluEvaluationsResults.href);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Results {\n");
        
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
        private String href;

        private Builder() {}

        @JsonProperty("href")

        public Builder withHref(String href) {
            this.href = href;
            return this;
        }


        public Results build() {
            return new Results(this);
        }
    }
}

