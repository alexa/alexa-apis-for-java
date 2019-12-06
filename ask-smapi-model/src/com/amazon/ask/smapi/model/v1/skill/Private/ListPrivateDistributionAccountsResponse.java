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


package com.amazon.ask.smapi.model.v1.skill.Private;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Response of ListPrivateDistributionAccounts.
 */

@JsonDeserialize(builder = ListPrivateDistributionAccountsResponse.Builder.class)
public final class ListPrivateDistributionAccountsResponse {

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    @JsonProperty("privateDistributionAccounts")
    private List<com.amazon.ask.smapi.model.v1.skill.Private.PrivateDistributionAccount> privateDistributionAccounts = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Private.PrivateDistributionAccount>();

    @JsonProperty("nextToken")
    private String nextToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private ListPrivateDistributionAccountsResponse(Builder builder) {
        if (builder.links != null) {
            this.links = builder.links;
        }
        if (builder.privateDistributionAccounts != null) {
            this.privateDistributionAccounts = builder.privateDistributionAccounts;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
    }

    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.Links getLinks() {
        return links;
    }

    /**
     * List of PrivateDistributionAccounts.
     * @return privateDistributionAccounts
    **/
    @JsonProperty("privateDistributionAccounts")
    public List<com.amazon.ask.smapi.model.v1.skill.Private.PrivateDistributionAccount> getPrivateDistributionAccounts() {
        return privateDistributionAccounts;
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
        ListPrivateDistributionAccountsResponse v1SkillPrivateListPrivateDistributionAccountsResponse = (ListPrivateDistributionAccountsResponse) o;
        return Objects.equals(this.links, v1SkillPrivateListPrivateDistributionAccountsResponse.links) &&
            Objects.equals(this.privateDistributionAccounts, v1SkillPrivateListPrivateDistributionAccountsResponse.privateDistributionAccounts) &&
            Objects.equals(this.nextToken, v1SkillPrivateListPrivateDistributionAccountsResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, privateDistributionAccounts, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivateDistributionAccountsResponse {\n");
        
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    privateDistributionAccounts: ").append(toIndentedString(privateDistributionAccounts)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.Links links;
        private List<com.amazon.ask.smapi.model.v1.skill.Private.PrivateDistributionAccount> privateDistributionAccounts;
        private String nextToken;

        private Builder() {}

        @JsonProperty("_links")
        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        @JsonProperty("privateDistributionAccounts")
        public Builder withPrivateDistributionAccounts(List<com.amazon.ask.smapi.model.v1.skill.Private.PrivateDistributionAccount> privateDistributionAccounts) {
            this.privateDistributionAccounts = privateDistributionAccounts;
            return this;
        }

        public Builder addPrivateDistributionAccountsItem(com.amazon.ask.smapi.model.v1.skill.Private.PrivateDistributionAccount privateDistributionAccountsItem) {
            if (this.privateDistributionAccounts == null) {
                this.privateDistributionAccounts = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Private.PrivateDistributionAccount>();
            }
            this.privateDistributionAccounts.add(privateDistributionAccountsItem);
            return this;
        }

        @JsonProperty("nextToken")
        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        public ListPrivateDistributionAccountsResponse build() {
            return new ListPrivateDistributionAccountsResponse(this);
        }
    }
}

