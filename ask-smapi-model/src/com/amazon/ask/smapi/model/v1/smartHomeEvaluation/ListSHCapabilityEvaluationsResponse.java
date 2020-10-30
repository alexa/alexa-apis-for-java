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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ListSHCapabilityEvaluationsResponse
 */

@JsonDeserialize(builder = ListSHCapabilityEvaluationsResponse.Builder.class)
public final class ListSHCapabilityEvaluationsResponse {

    @JsonProperty("paginationContextToken")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContextToken paginationContextToken = null;

    @JsonProperty("evaluations")
    private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationObject> evaluations = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationObject>();

    public static Builder builder() {
        return new Builder();
    }

    private ListSHCapabilityEvaluationsResponse(Builder builder) {
        if (builder.paginationContextToken != null) {
            this.paginationContextToken = builder.paginationContextToken;
        }
        if (builder.evaluations != null) {
            this.evaluations = builder.evaluations;
        }
    }

    /**
     * Get paginationContextToken
     * @return paginationContextToken
    **/
    @JsonProperty("paginationContextToken")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContextToken getPaginationContextToken() {
        return paginationContextToken;
    }


    /**
     * Get evaluations
     * @return evaluations
    **/
    @JsonProperty("evaluations")
    public List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationObject> getEvaluations() {
        return evaluations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSHCapabilityEvaluationsResponse v1SmartHomeEvaluationListSHCapabilityEvaluationsResponse = (ListSHCapabilityEvaluationsResponse) o;
        return Objects.equals(this.paginationContextToken, v1SmartHomeEvaluationListSHCapabilityEvaluationsResponse.paginationContextToken) &&
            Objects.equals(this.evaluations, v1SmartHomeEvaluationListSHCapabilityEvaluationsResponse.evaluations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContextToken, evaluations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSHCapabilityEvaluationsResponse {\n");
        
        sb.append("    paginationContextToken: ").append(toIndentedString(paginationContextToken)).append("\n");
        sb.append("    evaluations: ").append(toIndentedString(evaluations)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContextToken paginationContextToken;
        private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationObject> evaluations;

        private Builder() {}

        @JsonProperty("paginationContextToken")

        public Builder withPaginationContextToken(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContextToken paginationContextToken) {
            this.paginationContextToken = paginationContextToken;
            return this;
        }


        @JsonProperty("evaluations")

        public Builder withEvaluations(List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationObject> evaluations) {
            this.evaluations = evaluations;
            return this;
        }

        public Builder addEvaluationsItem(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationObject evaluationsItem) {
            if (this.evaluations == null) {
                this.evaluations = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.EvaluationObject>();
            }
            this.evaluations.add(evaluationsItem);
            return this;
        }

        public ListSHCapabilityEvaluationsResponse build() {
            return new ListSHCapabilityEvaluationsResponse(this);
        }
    }
}

