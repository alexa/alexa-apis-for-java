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
 * JobAPIPaginationContext
 */

@JsonDeserialize(builder = JobAPIPaginationContext.Builder.class)
public final class JobAPIPaginationContext {

    @JsonProperty("nextToken")
    private String nextToken = null;

    private JobAPIPaginationContext() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private JobAPIPaginationContext(Builder builder) {
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
    }

    /**
     * Get nextToken
     * @return nextToken
    **/
    @JsonProperty("nextToken")
    public String getNextToken() {
        return nextToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobAPIPaginationContext v1SkillInteractionModelJobsJobAPIPaginationContext = (JobAPIPaginationContext) o;
        return Objects.equals(this.nextToken, v1SkillInteractionModelJobsJobAPIPaginationContext.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobAPIPaginationContext {\n");
        
        sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
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
        private String nextToken;

        private Builder() {}

        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        public JobAPIPaginationContext build() {
            return new JobAPIPaginationContext(this);
        }
    }
}

