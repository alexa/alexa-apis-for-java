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


package com.amazon.ask.smapi.model.v1.skill.certification;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Structure for the result for the outcomes of certification review for the skill. Currently provides the distribution information of a skill if the certification SUCCEEDED. 
 */

@JsonDeserialize(builder = CertificationResult.Builder.class)
public final class CertificationResult {

    @JsonProperty("distributionInfo")
    private com.amazon.ask.smapi.model.v1.skill.certification.DistributionInfo distributionInfo = null;

    public static Builder builder() {
        return new Builder();
    }

    private CertificationResult(Builder builder) {
        if (builder.distributionInfo != null) {
            this.distributionInfo = builder.distributionInfo;
        }
    }

    /**
     * Get distributionInfo
     * @return distributionInfo
    **/
    @JsonProperty("distributionInfo")
    public com.amazon.ask.smapi.model.v1.skill.certification.DistributionInfo getDistributionInfo() {
        return distributionInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificationResult v1SkillCertificationCertificationResult = (CertificationResult) o;
        return Objects.equals(this.distributionInfo, v1SkillCertificationCertificationResult.distributionInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distributionInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificationResult {\n");
        
        sb.append("    distributionInfo: ").append(toIndentedString(distributionInfo)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.certification.DistributionInfo distributionInfo;

        private Builder() {}

        @JsonProperty("distributionInfo")
        public Builder withDistributionInfo(com.amazon.ask.smapi.model.v1.skill.certification.DistributionInfo distributionInfo) {
            this.distributionInfo = distributionInfo;
            return this;
        }


        public CertificationResult build() {
            return new CertificationResult(this);
        }
    }
}

