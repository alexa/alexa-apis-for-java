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


package com.amazon.ask.model.services.skillMessaging;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The message that needs to be sent to the skill 
 */

@JsonDeserialize(builder = SendSkillMessagingRequest.Builder.class)
public final class SendSkillMessagingRequest {

    @JsonProperty("data")
    private Object data = null;

    @JsonProperty("expiresAfterSeconds")
    private Long expiresAfterSeconds = null;

    private SendSkillMessagingRequest() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SendSkillMessagingRequest(Builder builder) {
        if (builder.data != null) {
            this.data = builder.data;
        }
        if (builder.expiresAfterSeconds != null) {
            this.expiresAfterSeconds = builder.expiresAfterSeconds;
        }
    }

    /**
     * The payload data to send with the message. The data must be in the form of JSON-formatted key-value pairs. Both keys and values must be of type String. The total size of the data cannot be greater than 6KB. For calculation purposes, this includes keys and values, the quotes that surround them, the \":\" character that separates them, the commas that separate the pairs, and the opening and closing braces around the field. However, any whitespace between key/value pairs is not included in the calculation of the payload size. If the message does not include payload data, as in the case of a sync message, you can pass in an empty JSON object \"{}\". 
     * @return data
    **/
    @JsonProperty("data")
    public Object getData() {
        return data;
    }


    /**
     * The number of seconds that the message will be retained to retry if message delivery is not successful. Allowed values are from 60 (1 minute) to 86400 (1 day), inclusive. The default is 3600 (1 hour). Multiple retries may occur during this interval. The retry logic is exponential. The first retry executes after 30 seconds, and this time period doubles on every retry. The retries will end when the total time elapsed since the message was first sent has exceeded the value you provided for expiresAfterSeconds. Message expiry is rarely a problem if the message handler has been set up correctly. With a correct setup, you will receive the message once promptly. This mechanism for retries is provided as a safeguard in case your skill goes down during a message delivery. 
     * minimum: 60
     * maximum: 86400
     * @return expiresAfterSeconds
    **/
    @JsonProperty("expiresAfterSeconds")
    public Long getExpiresAfterSeconds() {
        return expiresAfterSeconds;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendSkillMessagingRequest servicesSkillMessagingSendSkillMessagingRequest = (SendSkillMessagingRequest) o;
        return Objects.equals(this.data, servicesSkillMessagingSendSkillMessagingRequest.data) &&
            Objects.equals(this.expiresAfterSeconds, servicesSkillMessagingSendSkillMessagingRequest.expiresAfterSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, expiresAfterSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendSkillMessagingRequest {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    expiresAfterSeconds: ").append(toIndentedString(expiresAfterSeconds)).append("\n");
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
        private Object data;
        private Long expiresAfterSeconds;

        private Builder() {}

        @JsonProperty("data")

        public Builder withData(Object data) {
            this.data = data;
            return this;
        }


        @JsonProperty("expiresAfterSeconds")

        public Builder withExpiresAfterSeconds(Long expiresAfterSeconds) {
            this.expiresAfterSeconds = expiresAfterSeconds;
            return this;
        }


        public SendSkillMessagingRequest build() {
            return new SendSkillMessagingRequest(this);
        }
    }
}

