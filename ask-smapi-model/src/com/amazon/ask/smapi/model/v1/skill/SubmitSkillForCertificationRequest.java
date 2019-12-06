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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmitSkillForCertificationRequest
 */

@JsonDeserialize(builder = SubmitSkillForCertificationRequest.Builder.class)
public final class SubmitSkillForCertificationRequest {

    @JsonProperty("publicationMethod")
    private com.amazon.ask.smapi.model.v1.skill.PublicationMethod publicationMethod = null;

    public static Builder builder() {
        return new Builder();
    }

    private SubmitSkillForCertificationRequest(Builder builder) {
        if (builder.publicationMethod != null) {
            this.publicationMethod = builder.publicationMethod;
        }
    }

    /**
     * Get publicationMethod
     * @return publicationMethod
    **/
    @JsonProperty("publicationMethod")
    public com.amazon.ask.smapi.model.v1.skill.PublicationMethod getPublicationMethod() {
        return publicationMethod;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubmitSkillForCertificationRequest v1SkillSubmitSkillForCertificationRequest = (SubmitSkillForCertificationRequest) o;
        return Objects.equals(this.publicationMethod, v1SkillSubmitSkillForCertificationRequest.publicationMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitSkillForCertificationRequest {\n");
        
        sb.append("    publicationMethod: ").append(toIndentedString(publicationMethod)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.PublicationMethod publicationMethod;

        private Builder() {}

        @JsonProperty("publicationMethod")
        public Builder withPublicationMethod(com.amazon.ask.smapi.model.v1.skill.PublicationMethod publicationMethod) {
            this.publicationMethod = publicationMethod;
            return this;
        }


        public SubmitSkillForCertificationRequest build() {
            return new SubmitSkillForCertificationRequest(this);
        }
    }
}

