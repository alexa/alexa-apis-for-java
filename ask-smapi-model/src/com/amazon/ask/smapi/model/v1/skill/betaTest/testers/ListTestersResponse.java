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


package com.amazon.ask.smapi.model.v1.skill.betaTest.testers;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ListTestersResponse
 */

@JsonDeserialize(builder = ListTestersResponse.Builder.class)
public final class ListTestersResponse {

    @JsonProperty("testers")
    private List<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TesterWithDetails> testers = new ArrayList<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TesterWithDetails>();

    @JsonProperty("isTruncated")
    private Boolean isTruncated = null;

    @JsonProperty("nextToken")
    private String nextToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private ListTestersResponse(Builder builder) {
        if (builder.testers != null) {
            this.testers = builder.testers;
        }
        if (builder.isTruncated != null) {
            this.isTruncated = builder.isTruncated;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
    }

    /**
     * Get testers
     * @return testers
    **/
    @JsonProperty("testers")
    public List<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TesterWithDetails> getTesters() {
        return testers;
    }


    /**
     * Get isTruncated
     * @return isTruncated
    **/
    @JsonProperty("isTruncated")
    public Boolean getIsTruncated() {
        return isTruncated;
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
        ListTestersResponse v1SkillBetaTestTestersListTestersResponse = (ListTestersResponse) o;
        return Objects.equals(this.testers, v1SkillBetaTestTestersListTestersResponse.testers) &&
            Objects.equals(this.isTruncated, v1SkillBetaTestTestersListTestersResponse.isTruncated) &&
            Objects.equals(this.nextToken, v1SkillBetaTestTestersListTestersResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testers, isTruncated, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTestersResponse {\n");
        
        sb.append("    testers: ").append(toIndentedString(testers)).append("\n");
        sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TesterWithDetails> testers;
        private Boolean isTruncated;
        private String nextToken;

        private Builder() {}

        @JsonProperty("testers")

        public Builder withTesters(List<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TesterWithDetails> testers) {
            this.testers = testers;
            return this;
        }

        public Builder addTestersItem(com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TesterWithDetails testersItem) {
            if (this.testers == null) {
                this.testers = new ArrayList<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TesterWithDetails>();
            }
            this.testers.add(testersItem);
            return this;
        }

        @JsonProperty("isTruncated")

        public Builder withIsTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }


        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        public ListTestersResponse build() {
            return new ListTestersResponse(this);
        }
    }
}

