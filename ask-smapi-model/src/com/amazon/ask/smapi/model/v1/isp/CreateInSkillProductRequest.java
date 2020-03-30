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
 * CreateInSkillProductRequest
 */

@JsonDeserialize(builder = CreateInSkillProductRequest.Builder.class)
public final class CreateInSkillProductRequest {

    @JsonProperty("vendorId")
    private String vendorId = null;

    @JsonProperty("inSkillProductDefinition")
    private com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinition inSkillProductDefinition = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreateInSkillProductRequest(Builder builder) {
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
        }
        if (builder.inSkillProductDefinition != null) {
            this.inSkillProductDefinition = builder.inSkillProductDefinition;
        }
    }

    /**
     * ID of the vendor owning the in-skill product.
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }


    /**
     * Get inSkillProductDefinition
     * @return inSkillProductDefinition
    **/
    @JsonProperty("inSkillProductDefinition")
    public com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinition getInSkillProductDefinition() {
        return inSkillProductDefinition;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInSkillProductRequest v1IspCreateInSkillProductRequest = (CreateInSkillProductRequest) o;
        return Objects.equals(this.vendorId, v1IspCreateInSkillProductRequest.vendorId) &&
            Objects.equals(this.inSkillProductDefinition, v1IspCreateInSkillProductRequest.inSkillProductDefinition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, inSkillProductDefinition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInSkillProductRequest {\n");
        
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
        sb.append("    inSkillProductDefinition: ").append(toIndentedString(inSkillProductDefinition)).append("\n");
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
        private String vendorId;
        private com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinition inSkillProductDefinition;

        private Builder() {}

        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }


        @JsonProperty("inSkillProductDefinition")

        public Builder withInSkillProductDefinition(com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinition inSkillProductDefinition) {
            this.inSkillProductDefinition = inSkillProductDefinition;
            return this;
        }


        public CreateInSkillProductRequest build() {
            return new CreateInSkillProductRequest(this);
        }
    }
}

