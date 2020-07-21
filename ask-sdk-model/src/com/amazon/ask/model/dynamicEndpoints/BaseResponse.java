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


package com.amazon.ask.model.dynamicEndpoints;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base response type.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.dynamicEndpoints.FailureResponse.class, name = "SkillResponseFailureMessage"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.dynamicEndpoints.SuccessResponse.class, name = "SkillResponseSuccessMessage"),
})
public abstract class BaseResponse {

    @JsonProperty("version")
    protected String version = null;

    protected String type = null;

    @JsonProperty("originalRequestId")
    protected String originalRequestId = null;

    protected BaseResponse() {
    }

    /**
     * The version of the response message schema used.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }


    /**
     * Denotes type of response.
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    /**
     * The same request identifier as the Dynamic endpoint request for this response.
     * @return originalRequestId
    **/
    @JsonProperty("originalRequestId")
    public String getOriginalRequestId() {
        return originalRequestId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseResponse dynamicEndpointsBaseResponse = (BaseResponse) o;
        return Objects.equals(this.version, dynamicEndpointsBaseResponse.version) &&
            Objects.equals(this.type, dynamicEndpointsBaseResponse.type) &&
            Objects.equals(this.originalRequestId, dynamicEndpointsBaseResponse.originalRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, type, originalRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BaseResponse {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    originalRequestId: ").append(toIndentedString(originalRequestId)).append("\n");
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

