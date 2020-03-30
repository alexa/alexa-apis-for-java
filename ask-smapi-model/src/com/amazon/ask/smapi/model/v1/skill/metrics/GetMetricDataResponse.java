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


package com.amazon.ask.smapi.model.v1.skill.metrics;

import java.util.Objects;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Response object for the API call which contains metrics data.
 */

@JsonDeserialize(builder = GetMetricDataResponse.Builder.class)
public final class GetMetricDataResponse {

    @JsonProperty("metric")
    private String metric = null;

    @JsonProperty("timestamps")
    private List<OffsetDateTime> timestamps = new ArrayList<OffsetDateTime>();

    @JsonProperty("values")
    private List<BigDecimal> values = new ArrayList<BigDecimal>();

    @JsonProperty("nextToken")
    private String nextToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private GetMetricDataResponse(Builder builder) {
        if (builder.metric != null) {
            this.metric = builder.metric;
        }
        if (builder.timestamps != null) {
            this.timestamps = builder.timestamps;
        }
        if (builder.values != null) {
            this.values = builder.values;
        }
        if (builder.nextToken != null) {
            this.nextToken = builder.nextToken;
        }
    }

    /**
     * The name of metric which customer requested.
     * @return metric
    **/
    @JsonProperty("metric")
    public String getMetric() {
        return metric;
    }


    /**
     * The timestamps for the data points.
     * @return timestamps
    **/
    @JsonProperty("timestamps")
    public List<OffsetDateTime> getTimestamps() {
        return timestamps;
    }


    /**
     * The data points for the metric corresponding to Timestamps.
     * @return values
    **/
    @JsonProperty("values")
    public List<BigDecimal> getValues() {
        return values;
    }


    /**
     * A token that marks the next batch of returned results.
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
        GetMetricDataResponse v1SkillMetricsGetMetricDataResponse = (GetMetricDataResponse) o;
        return Objects.equals(this.metric, v1SkillMetricsGetMetricDataResponse.metric) &&
            Objects.equals(this.timestamps, v1SkillMetricsGetMetricDataResponse.timestamps) &&
            Objects.equals(this.values, v1SkillMetricsGetMetricDataResponse.values) &&
            Objects.equals(this.nextToken, v1SkillMetricsGetMetricDataResponse.nextToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, timestamps, values, nextToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetMetricDataResponse {\n");
        
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
        private String metric;
        private List<OffsetDateTime> timestamps;
        private List<BigDecimal> values;
        private String nextToken;

        private Builder() {}

        @JsonProperty("metric")

        public Builder withMetric(String metric) {
            this.metric = metric;
            return this;
        }


        @JsonProperty("timestamps")

        public Builder withTimestamps(List<OffsetDateTime> timestamps) {
            this.timestamps = timestamps;
            return this;
        }

        public Builder addTimestampsItem(OffsetDateTime timestampsItem) {
            if (this.timestamps == null) {
                this.timestamps = new ArrayList<OffsetDateTime>();
            }
            this.timestamps.add(timestampsItem);
            return this;
        }

        @JsonProperty("values")

        public Builder withValues(List<BigDecimal> values) {
            this.values = values;
            return this;
        }

        public Builder addValuesItem(BigDecimal valuesItem) {
            if (this.values == null) {
                this.values = new ArrayList<BigDecimal>();
            }
            this.values.add(valuesItem);
            return this;
        }

        @JsonProperty("nextToken")

        public Builder withNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }


        public GetMetricDataResponse build() {
            return new GetMetricDataResponse(this);
        }
    }
}

