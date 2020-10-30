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
 * ListSHCapabilityTestPlansResponse
 */

@JsonDeserialize(builder = ListSHCapabilityTestPlansResponse.Builder.class)
public final class ListSHCapabilityTestPlansResponse {

    @JsonProperty("paginationContext")
    private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContext paginationContext = null;

    @JsonProperty("testPlans")
    private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.ListSHTestPlanItem> testPlans = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.ListSHTestPlanItem>();

    public static Builder builder() {
        return new Builder();
    }

    private ListSHCapabilityTestPlansResponse(Builder builder) {
        if (builder.paginationContext != null) {
            this.paginationContext = builder.paginationContext;
        }
        if (builder.testPlans != null) {
            this.testPlans = builder.testPlans;
        }
    }

    /**
     * Get paginationContext
     * @return paginationContext
    **/
    @JsonProperty("paginationContext")
    public com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContext getPaginationContext() {
        return paginationContext;
    }


    /**
     * Get testPlans
     * @return testPlans
    **/
    @JsonProperty("testPlans")
    public List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.ListSHTestPlanItem> getTestPlans() {
        return testPlans;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSHCapabilityTestPlansResponse v1SmartHomeEvaluationListSHCapabilityTestPlansResponse = (ListSHCapabilityTestPlansResponse) o;
        return Objects.equals(this.paginationContext, v1SmartHomeEvaluationListSHCapabilityTestPlansResponse.paginationContext) &&
            Objects.equals(this.testPlans, v1SmartHomeEvaluationListSHCapabilityTestPlansResponse.testPlans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paginationContext, testPlans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSHCapabilityTestPlansResponse {\n");
        
        sb.append("    paginationContext: ").append(toIndentedString(paginationContext)).append("\n");
        sb.append("    testPlans: ").append(toIndentedString(testPlans)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContext paginationContext;
        private List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.ListSHTestPlanItem> testPlans;

        private Builder() {}

        @JsonProperty("paginationContext")

        public Builder withPaginationContext(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.PaginationContext paginationContext) {
            this.paginationContext = paginationContext;
            return this;
        }


        @JsonProperty("testPlans")

        public Builder withTestPlans(List<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.ListSHTestPlanItem> testPlans) {
            this.testPlans = testPlans;
            return this;
        }

        public Builder addTestPlansItem(com.amazon.ask.smapi.model.v1.smartHomeEvaluation.ListSHTestPlanItem testPlansItem) {
            if (this.testPlans == null) {
                this.testPlans = new ArrayList<com.amazon.ask.smapi.model.v1.smartHomeEvaluation.ListSHTestPlanItem>();
            }
            this.testPlans.add(testPlansItem);
            return this;
        }

        public ListSHCapabilityTestPlansResponse build() {
            return new ListSHCapabilityTestPlansResponse(this);
        }
    }
}

