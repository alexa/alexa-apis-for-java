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


package com.amazon.ask.model.services.datastore.v1;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * CommandsResponse
 */

@JsonDeserialize(builder = CommandsResponse.Builder.class)
public final class CommandsResponse {

    @JsonProperty("results")
    private List<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult> results = new ArrayList<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult>();

    @JsonProperty("queuedResultId")
    private String queuedResultId = null;

    private CommandsResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CommandsResponse(Builder builder) {
        if (builder.results != null) {
            this.results = builder.results;
        }
        if (builder.queuedResultId != null) {
            this.queuedResultId = builder.queuedResultId;
        }
    }

    /**
     * List of results for each dispatch to a device target. This indicates the results of 1st attempt of deliveries. 
     * @return results
    **/
    @JsonProperty("results")
    public List<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult> getResults() {
        return results;
    }


    /**
     * A unique identifier to query result for queued delivery for offline devices (DEVICE_UNAVAILABLE). If there is no offline device, this value is not specified. The result will be available for query at least one hour after attemptDeliveryUntil. 
     * @return queuedResultId
    **/
    @JsonProperty("queuedResultId")
    public String getQueuedResultId() {
        return queuedResultId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommandsResponse servicesDatastoreV1CommandsResponse = (CommandsResponse) o;
        return Objects.equals(this.results, servicesDatastoreV1CommandsResponse.results) &&
            Objects.equals(this.queuedResultId, servicesDatastoreV1CommandsResponse.queuedResultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(results, queuedResultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommandsResponse {\n");
        
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    queuedResultId: ").append(toIndentedString(queuedResultId)).append("\n");
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
        private List<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult> results;
        private String queuedResultId;

        private Builder() {}

        @JsonProperty("results")

        public Builder withResults(List<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult> results) {
            this.results = results;
            return this;
        }

        public Builder addResultsItem(com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult resultsItem) {
            if (this.results == null) {
                this.results = new ArrayList<com.amazon.ask.model.services.datastore.v1.CommandsDispatchResult>();
            }
            this.results.add(resultsItem);
            return this;
        }

        @JsonProperty("queuedResultId")

        public Builder withQueuedResultId(String queuedResultId) {
            this.queuedResultId = queuedResultId;
            return this;
        }


        public CommandsResponse build() {
            return new CommandsResponse(this);
        }
    }
}

