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
 * Represents attributes of a subscription for development notification. 
 */

@JsonDeserialize(builder = SubscriptionAttributes.Builder.class)
public final class SubscriptionAttributes {

    @JsonProperty("subscriptionId")
    private String subscriptionId = null;

    private SubscriptionAttributes() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SubscriptionAttributes(Builder builder) {
        if (builder.subscriptionId != null) {
            this.subscriptionId = builder.subscriptionId;
        }
    }

    /**
     * Unique subscription id that triggered the development notification event. 
     * @return subscriptionId
    **/
    @JsonProperty("subscriptionId")
    public String getSubscriptionId() {
        return subscriptionId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionAttributes v0EventSchemaSubscriptionAttributes = (SubscriptionAttributes) o;
        return Objects.equals(this.subscriptionId, v0EventSchemaSubscriptionAttributes.subscriptionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionAttributes {\n");
        
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
        private String subscriptionId;

        private Builder() {}

        @JsonProperty("subscriptionId")

        public Builder withSubscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }


        public SubscriptionAttributes build() {
            return new SubscriptionAttributes(this);
        }
    }
}

