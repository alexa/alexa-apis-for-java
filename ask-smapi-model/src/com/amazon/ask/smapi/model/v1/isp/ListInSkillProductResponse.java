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


package com.amazon.ask.smapi.model.v1.isp;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * List of in-skill product response.
 */

@JsonDeserialize(builder = ListInSkillProductResponse.Builder.class)
public final class ListInSkillProductResponse {

    @JsonProperty("inSkillProductSummaryList")
    private com.amazon.ask.smapi.model.v1.isp.ListInSkillProduct inSkillProductSummaryList = null;

    public static Builder builder() {
        return new Builder();
    }

    private ListInSkillProductResponse(Builder builder) {
        if (builder.inSkillProductSummaryList != null) {
            this.inSkillProductSummaryList = builder.inSkillProductSummaryList;
        }
    }

    /**
     * Get inSkillProductSummaryList
     * @return inSkillProductSummaryList
    **/
    @JsonProperty("inSkillProductSummaryList")
    public com.amazon.ask.smapi.model.v1.isp.ListInSkillProduct getInSkillProductSummaryList() {
        return inSkillProductSummaryList;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInSkillProductResponse v1IspListInSkillProductResponse = (ListInSkillProductResponse) o;
        return Objects.equals(this.inSkillProductSummaryList, v1IspListInSkillProductResponse.inSkillProductSummaryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inSkillProductSummaryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInSkillProductResponse {\n");
        
        sb.append("    inSkillProductSummaryList: ").append(toIndentedString(inSkillProductSummaryList)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.isp.ListInSkillProduct inSkillProductSummaryList;

        private Builder() {}

        @JsonProperty("inSkillProductSummaryList")

        public Builder withInSkillProductSummaryList(com.amazon.ask.smapi.model.v1.isp.ListInSkillProduct inSkillProductSummaryList) {
            this.inSkillProductSummaryList = inSkillProductSummaryList;
            return this;
        }


        public ListInSkillProductResponse build() {
            return new ListInSkillProductResponse(this);
        }
    }
}

