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
 * IspSummaryLinks
 */

@JsonDeserialize(builder = IspSummaryLinks.Builder.class)
public final class IspSummaryLinks {

    @JsonProperty("self")
    private com.amazon.ask.smapi.model.v1.Link self = null;

    private IspSummaryLinks() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private IspSummaryLinks(Builder builder) {
        if (builder.self != null) {
            this.self = builder.self;
        }
    }

    /**
     * Get self
     * @return self
    **/
    @JsonProperty("self")
    public com.amazon.ask.smapi.model.v1.Link getSelf() {
        return self;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IspSummaryLinks v1IspIspSummaryLinks = (IspSummaryLinks) o;
        return Objects.equals(this.self, v1IspIspSummaryLinks.self);
    }

    @Override
    public int hashCode() {
        return Objects.hash(self);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IspSummaryLinks {\n");
        
        sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.Link self;

        private Builder() {}

        @JsonProperty("self")

        public Builder withSelf(com.amazon.ask.smapi.model.v1.Link self) {
            this.self = self;
            return this;
        }


        public IspSummaryLinks build() {
            return new IspSummaryLinks(this);
        }
    }
}

