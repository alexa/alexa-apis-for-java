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


package com.amazon.ask.smapi.model.v0.eventSchema;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an actor that submitted a request causing development notification event. 
 */

@JsonDeserialize(builder = ActorAttributes.Builder.class)
public final class ActorAttributes {

    @JsonProperty("customerId")
    private String customerId = null;

    private ActorAttributes() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ActorAttributes(Builder builder) {
        if (builder.customerId != null) {
            this.customerId = builder.customerId;
        }
    }

    /**
     * Identifies an Amazon Customer who submitted a request corresponding to the generated event. 
     * @return customerId
    **/
    @JsonProperty("customerId")
    public String getCustomerId() {
        return customerId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActorAttributes v0EventSchemaActorAttributes = (ActorAttributes) o;
        return Objects.equals(this.customerId, v0EventSchemaActorAttributes.customerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActorAttributes {\n");
        
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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
        private String customerId;

        private Builder() {}

        @JsonProperty("customerId")

        public Builder withCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }


        public ActorAttributes build() {
            return new ActorAttributes(this);
        }
    }
}

