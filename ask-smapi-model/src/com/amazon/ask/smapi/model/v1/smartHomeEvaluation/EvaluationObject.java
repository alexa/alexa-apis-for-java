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


package com.amazon.ask.smapi.model.v1.smartHomeEvaluation;

import java.util.Objects;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * EvaluationObject
 */

@JsonDeserialize(builder = EvaluationObject.Builder.class)
public final class EvaluationObject {

    @JsonProperty("endTimestamp")
    private OffsetDateTime endTimestamp = null;

    @JsonProperty("startTimestamp")
    private OffsetDateTime startTimestamp = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("endpointId")
    private String endpointId = null;

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("sourceTestPlanIds")
    private List<String> sourceTestPlanIds = new ArrayList<String>();

    @JsonProperty("testPlanId")
    private String testPlanId = null;

    public static Builder builder() {
        return new Builder();
    }

    private EvaluationObject(Builder builder) {
        if (builder.endTimestamp != null) {
            this.endTimestamp = builder.endTimestamp;
        }
        if (builder.startTimestamp != null) {
            this.startTimestamp = builder.startTimestamp;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.endpointId != null) {
            this.endpointId = builder.endpointId;
        }
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.sourceTestPlanIds != null) {
            this.sourceTestPlanIds = builder.sourceTestPlanIds;
        }
        if (builder.testPlanId != null) {
            this.testPlanId = builder.testPlanId;
        }
    }

    /**
     * Get endTimestamp
     * @return endTimestamp
    **/
    @JsonProperty("endTimestamp")
    public OffsetDateTime getEndTimestamp() {
        return endTimestamp;
    }


    /**
     * Get startTimestamp
     * @return startTimestamp
    **/
    @JsonProperty("startTimestamp")
    public OffsetDateTime getStartTimestamp() {
        return startTimestamp;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationEntityStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationEntityStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Get endpointId
     * @return endpointId
    **/
    @JsonProperty("endpointId")
    public String getEndpointId() {
        return endpointId;
    }


    /**
     * Get id
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Get sourceTestPlanIds
     * @return sourceTestPlanIds
    **/
    @JsonProperty("sourceTestPlanIds")
    public List<String> getSourceTestPlanIds() {
        return sourceTestPlanIds;
    }


    /**
     * Get testPlanId
     * @return testPlanId
    **/
    @JsonProperty("testPlanId")
    public String getTestPlanId() {
        return testPlanId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluationObject v1SmartHomeEvaluationEvaluationObject = (EvaluationObject) o;
        return Objects.equals(this.endTimestamp, v1SmartHomeEvaluationEvaluationObject.endTimestamp) &&
            Objects.equals(this.startTimestamp, v1SmartHomeEvaluationEvaluationObject.startTimestamp) &&
            Objects.equals(this.status, v1SmartHomeEvaluationEvaluationObject.status) &&
            Objects.equals(this.endpointId, v1SmartHomeEvaluationEvaluationObject.endpointId) &&
            Objects.equals(this.id, v1SmartHomeEvaluationEvaluationObject.id) &&
            Objects.equals(this.sourceTestPlanIds, v1SmartHomeEvaluationEvaluationObject.sourceTestPlanIds) &&
            Objects.equals(this.testPlanId, v1SmartHomeEvaluationEvaluationObject.testPlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTimestamp, startTimestamp, status, endpointId, id, sourceTestPlanIds, testPlanId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationObject {\n");
        
        sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
        sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceTestPlanIds: ").append(toIndentedString(sourceTestPlanIds)).append("\n");
        sb.append("    testPlanId: ").append(toIndentedString(testPlanId)).append("\n");
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
        private OffsetDateTime endTimestamp;
        private OffsetDateTime startTimestamp;
        private String status;
        private String endpointId;
        private String id;
        private List<String> sourceTestPlanIds;
        private String testPlanId;

        private Builder() {}

        @JsonProperty("endTimestamp")

        public Builder withEndTimestamp(OffsetDateTime endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }


        @JsonProperty("startTimestamp")

        public Builder withStartTimestamp(OffsetDateTime startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }


        @JsonProperty("status")
        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationEntityStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("endpointId")

        public Builder withEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }


        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("sourceTestPlanIds")

        public Builder withSourceTestPlanIds(List<String> sourceTestPlanIds) {
            this.sourceTestPlanIds = sourceTestPlanIds;
            return this;
        }

        public Builder addSourceTestPlanIdsItem(String sourceTestPlanIdsItem) {
            if (this.sourceTestPlanIds == null) {
                this.sourceTestPlanIds = new ArrayList<String>();
            }
            this.sourceTestPlanIds.add(sourceTestPlanIdsItem);
            return this;
        }

        @JsonProperty("testPlanId")

        public Builder withTestPlanId(String testPlanId) {
            this.testPlanId = testPlanId;
            return this;
        }


        public EvaluationObject build() {
            return new EvaluationObject(this);
        }
    }
}

