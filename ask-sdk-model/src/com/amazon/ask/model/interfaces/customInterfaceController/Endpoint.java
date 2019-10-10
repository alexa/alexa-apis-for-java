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


package com.amazon.ask.model.interfaces.customInterfaceController;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The endpoint of a gadget.
 */

@JsonDeserialize(builder = Endpoint.Builder.class)
public final class Endpoint {

    @JsonProperty("endpointId")
    private String endpointId = null;

    public static Builder builder() {
        return new Builder();
    }

    private Endpoint(Builder builder) {
        if (builder.endpointId != null) {
            this.endpointId = builder.endpointId;
        }
    }

    /**
     * The endpoint ID of the gadget.
     * @return endpointId
    **/
    @JsonProperty("endpointId")
    public String getEndpointId() {
        return endpointId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Endpoint interfacesCustomInterfaceControllerEndpoint = (Endpoint) o;
        return Objects.equals(this.endpointId, interfacesCustomInterfaceControllerEndpoint.endpointId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoint {\n");
        
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
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
        private String endpointId;

        private Builder() {}

        @JsonProperty("endpointId")
        public Builder withEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }


        public Endpoint build() {
            return new Endpoint(this);
        }
    }
}

