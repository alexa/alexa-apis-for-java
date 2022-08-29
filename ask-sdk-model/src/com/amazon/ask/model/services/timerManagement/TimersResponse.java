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


package com.amazon.ask.model.services.timerManagement;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Timers object with paginated list of multiple timers
 */

@JsonDeserialize(builder = TimersResponse.Builder.class)
public final class TimersResponse {

    @JsonProperty("totalCount")
    private Integer totalCount = null;

    @JsonProperty("timers")
    private List<com.amazon.ask.model.services.timerManagement.TimerResponse> timers = new ArrayList<com.amazon.ask.model.services.timerManagement.TimerResponse>();

    @JsonProperty("nextToken")
    private String nextToken = null;

    private TimersResponse() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private TimersResponse(Builder builder) {
        if (builder.totalCount != null) {
            this.totalCount = builder.totalCount;
        }
        if (builder.timers != null) {
            this.timers = builder.timers;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
    }

    /**
     * Total count of timers returned.
     * @return totalCount
    **/
    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }


    /**
     * List of multiple Timer objects
     * @return timers
    **/
    @JsonProperty("timers")
    public List<com.amazon.ask.model.services.timerManagement.TimerResponse> getTimers() {
        return timers;
    }


    /**
     * Link to retrieve next set of timers if total count is greater than max results.
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
        TimersResponse servicesTimerManagementTimersResponse = (TimersResponse) o;
        return Objects.equals(this.totalCount, servicesTimerManagementTimersResponse.totalCount) &&
            Objects.equals(this.timers, servicesTimerManagementTimersResponse.timers) &&
            Objects.equals(this.nextToken, servicesTimerManagementTimersResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, timers, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimersResponse {\n");
        
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    timers: ").append(toIndentedString(timers)).append("\n");
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
        private Integer totalCount;
        private List<com.amazon.ask.model.services.timerManagement.TimerResponse> timers;
        private String nextToken;

        private Builder() {}

        @JsonProperty("totalCount")

        public Builder withTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        @JsonProperty("timers")

        public Builder withTimers(List<com.amazon.ask.model.services.timerManagement.TimerResponse> timers) {
            this.timers = timers;
            return this;
        }

        public Builder addTimersItem(com.amazon.ask.model.services.timerManagement.TimerResponse timersItem) {
            if (this.timers == null) {
                this.timers = new ArrayList<com.amazon.ask.model.services.timerManagement.TimerResponse>();
            }
            this.timers.add(timersItem);
            return this;
        }

        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        public TimersResponse build() {
            return new TimersResponse(this);
        }
    }
}

