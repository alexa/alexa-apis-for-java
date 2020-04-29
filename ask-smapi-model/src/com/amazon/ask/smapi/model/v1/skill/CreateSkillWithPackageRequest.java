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
 * CreateSkillWithPackageRequest
 */

@JsonDeserialize(builder = CreateSkillWithPackageRequest.Builder.class)
public final class CreateSkillWithPackageRequest {

    @JsonProperty("vendorId")
    private String vendorId = null;

    @JsonProperty("location")
    private String location = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreateSkillWithPackageRequest(Builder builder) {
        if (builder.vendorId != null) {
            this.vendorId = builder.vendorId;
        }
        if (builder.location != null) {
            this.location = builder.location;
        }
    }

    /**
     * ID of the vendor owning the skill.
     * @return vendorId
    **/
    @JsonProperty("vendorId")
    public String getVendorId() {
        return vendorId;
    }


    /**
     * The URL for the skill package.
     * @return location
    **/
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSkillWithPackageRequest v1SkillCreateSkillWithPackageRequest = (CreateSkillWithPackageRequest) o;
        return Objects.equals(this.vendorId, v1SkillCreateSkillWithPackageRequest.vendorId) &&
            Objects.equals(this.location, v1SkillCreateSkillWithPackageRequest.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, location);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSkillWithPackageRequest {\n");
        
        sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
        private String location;

        private Builder() {}

        @JsonProperty("vendorId")

        public Builder withVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }


        @JsonProperty("location")

        public Builder withLocation(String location) {
            this.location = location;
            return this;
        }


        public CreateSkillWithPackageRequest build() {
            return new CreateSkillWithPackageRequest(this);
        }
    }
}

