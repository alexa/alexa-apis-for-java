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


package com.amazon.ask.model.interfaces.connections.requests;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BaseRequest
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.requests.ScheduleFoodEstablishmentReservationRequest.class, name = "ScheduleFoodEstablishmentReservationRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.requests.PrintImageRequest.class, name = "PrintImageRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.requests.PrintWebPageRequest.class, name = "PrintWebPageRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.requests.PrintPDFRequest.class, name = "PrintPDFRequest"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.interfaces.connections.requests.ScheduleTaxiReservationRequest.class, name = "ScheduleTaxiReservationRequest"),
})
public abstract class BaseRequest {

    protected String type = null;

    @JsonProperty("@version")
    protected String version = null;

    protected BaseRequest() {
    }

    /**
     * Get type
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    /**
     * version of the request
     * @return version
    **/
    @JsonProperty("@version")
    public String getVersion() {
        return version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseRequest interfacesConnectionsRequestsBaseRequest = (BaseRequest) o;
        return Objects.equals(this.type, interfacesConnectionsRequestsBaseRequest.type) &&
            Objects.equals(this.version, interfacesConnectionsRequestsBaseRequest.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseRequest {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
  
}

