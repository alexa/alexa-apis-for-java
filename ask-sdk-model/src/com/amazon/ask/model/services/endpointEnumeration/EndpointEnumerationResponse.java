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


package com.amazon.ask.model.services.endpointEnumeration;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Contains the list of endpoints.
 */

@JsonDeserialize(builder = EndpointEnumerationResponse.Builder.class)
public final class EndpointEnumerationResponse {

    @JsonProperty("endpoints")
    private List<com.amazon.ask.model.services.endpointEnumeration.EndpointInfo> endpoints = new ArrayList<com.amazon.ask.model.services.endpointEnumeration.EndpointInfo>();

    public static Builder builder() {
        return new Builder();
    }

    private EndpointEnumerationResponse(Builder builder) {
        if (builder.endpoints != null) {
            this.endpoints = builder.endpoints;
        }
    }

    /**
     * The list of endpoints.
     * @return endpoints
    **/
    @JsonProperty("endpoints")
    public List<com.amazon.ask.model.services.endpointEnumeration.EndpointInfo> getEndpoints() {
        return endpoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EndpointEnumerationResponse servicesEndpointEnumerationEndpointEnumerationResponse = (EndpointEnumerationResponse) o;
        return Objects.equals(this.endpoints, servicesEndpointEnumerationEndpointEnumerationResponse.endpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EndpointEnumerationResponse {\n");
        
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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
        private List<com.amazon.ask.model.services.endpointEnumeration.EndpointInfo> endpoints;

        private Builder() {}

        @JsonProperty("endpoints")
        public Builder withEndpoints(List<com.amazon.ask.model.services.endpointEnumeration.EndpointInfo> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder addEndpointsItem(com.amazon.ask.model.services.endpointEnumeration.EndpointInfo endpointsItem) {
            if (this.endpoints == null) {
                this.endpoints = new ArrayList<com.amazon.ask.model.services.endpointEnumeration.EndpointInfo>();
            }
            this.endpoints.add(endpointsItem);
            return this;
        }

        public EndpointEnumerationResponse build() {
            return new EndpointEnumerationResponse(this);
        }
    }
}

