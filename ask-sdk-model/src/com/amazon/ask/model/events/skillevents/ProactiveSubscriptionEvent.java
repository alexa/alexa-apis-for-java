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


package com.amazon.ask.model.events.skillevents;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProactiveSubscriptionEvent
 */

@JsonDeserialize(builder = ProactiveSubscriptionEvent.Builder.class)
public final class ProactiveSubscriptionEvent {

    @JsonProperty("eventName")
    private String eventName = null;

    public static Builder builder() {
        return new Builder();
    }

    private ProactiveSubscriptionEvent(Builder builder) {
        if (builder.eventName != null) {
            this.eventName = builder.eventName;
        }
    }

    /**
     * Get eventName
     * @return eventName
    **/
    @JsonProperty("eventName")
    public String getEventName() {
        return eventName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProactiveSubscriptionEvent eventsSkilleventsProactiveSubscriptionEvent = (ProactiveSubscriptionEvent) o;
        return Objects.equals(this.eventName, eventsSkilleventsProactiveSubscriptionEvent.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProactiveSubscriptionEvent {\n");
        
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
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
        private String eventName;

        private Builder() {}

        @JsonProperty("eventName")

        public Builder withEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }


        public ProactiveSubscriptionEvent build() {
            return new ProactiveSubscriptionEvent(this);
        }
    }
}

