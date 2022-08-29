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


package com.amazon.ask.model.services.monetization;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * InSkillProductTransactionsResponse
 */

@JsonDeserialize(builder = InSkillProductTransactionsResponse.Builder.class)
public final class InSkillProductTransactionsResponse {

    @JsonProperty("results")
    private List<com.amazon.ask.model.services.monetization.Transactions> results = new ArrayList<com.amazon.ask.model.services.monetization.Transactions>();

    @JsonProperty("metadata")
    private com.amazon.ask.model.services.monetization.Metadata metadata = null;

    private InSkillProductTransactionsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private InSkillProductTransactionsResponse(Builder builder) {
        if (builder.results != null) {
            this.results = builder.results;
        }
        if (builder.metadata != null) {
            this.metadata = builder.metadata;
        }
    }

    /**
     * List of transactions of in skill products purchases
     * @return results
    **/
    @JsonProperty("results")
    public List<com.amazon.ask.model.services.monetization.Transactions> getResults() {
        return results;
    }


    /**
     * Get metadata
     * @return metadata
    **/
    @JsonProperty("metadata")
    public com.amazon.ask.model.services.monetization.Metadata getMetadata() {
        return metadata;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InSkillProductTransactionsResponse servicesMonetizationInSkillProductTransactionsResponse = (InSkillProductTransactionsResponse) o;
        return Objects.equals(this.results, servicesMonetizationInSkillProductTransactionsResponse.results) &&
            Objects.equals(this.metadata, servicesMonetizationInSkillProductTransactionsResponse.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InSkillProductTransactionsResponse {\n");
        
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
        private List<com.amazon.ask.model.services.monetization.Transactions> results;
        private com.amazon.ask.model.services.monetization.Metadata metadata;

        private Builder() {}

        @JsonProperty("results")

        public Builder withResults(List<com.amazon.ask.model.services.monetization.Transactions> results) {
            this.results = results;
            return this;
        }

        public Builder addResultsItem(com.amazon.ask.model.services.monetization.Transactions resultsItem) {
            if (this.results == null) {
                this.results = new ArrayList<com.amazon.ask.model.services.monetization.Transactions>();
            }
            this.results.add(resultsItem);
            return this;
        }

        @JsonProperty("metadata")

        public Builder withMetadata(com.amazon.ask.model.services.monetization.Metadata metadata) {
            this.metadata = metadata;
            return this;
        }


        public InSkillProductTransactionsResponse build() {
            return new InSkillProductTransactionsResponse(this);
        }
    }
}

