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
 * This object defines the duration of the Event Handler and the optional JSON payload that is delivered to the skill when the timer expires.
 */

@JsonDeserialize(builder = Expiration.Builder.class)
public final class Expiration {

    @JsonProperty("durationInMilliseconds")
    private Long durationInMilliseconds = null;

    @JsonProperty("expirationPayload")
    private Object expirationPayload = null;

    public static Builder builder() {
        return new Builder();
    }

    private Expiration(Builder builder) {
        if (builder.durationInMilliseconds != null) {
            this.durationInMilliseconds = builder.durationInMilliseconds;
        }
        if (builder.expirationPayload != null) {
            this.expirationPayload = builder.expirationPayload;
        }
    }

    /**
     * The length of time, in milliseconds, for which events from connected gadgets will be  passed to the skill. Your skill will continue to receive events until this duration  expires or the event handler is otherwise stopped.
     * minimum: 0
     * maximum: 90000
     * @return durationInMilliseconds
    **/
    @JsonProperty("durationInMilliseconds")
    public Long getDurationInMilliseconds() {
        return durationInMilliseconds;
    }

    /**
     * The payload that was defined in the StartEventHandlerDirective. The skill will receive if and only if the Event Handler duration expired.
     * @return expirationPayload
    **/
    @JsonProperty("expirationPayload")
    public Object getExpirationPayload() {
        return expirationPayload;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Expiration interfacesCustomInterfaceControllerExpiration = (Expiration) o;
        return Objects.equals(this.durationInMilliseconds, interfacesCustomInterfaceControllerExpiration.durationInMilliseconds) &&
            Objects.equals(this.expirationPayload, interfacesCustomInterfaceControllerExpiration.expirationPayload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(durationInMilliseconds, expirationPayload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Expiration {\n");
        
        sb.append("    durationInMilliseconds: ").append(toIndentedString(durationInMilliseconds)).append("\n");
        sb.append("    expirationPayload: ").append(toIndentedString(expirationPayload)).append("\n");
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
        private Long durationInMilliseconds;
        private Object expirationPayload;

        private Builder() {}

        @JsonProperty("durationInMilliseconds")
        public Builder withDurationInMilliseconds(Long durationInMilliseconds) {
            this.durationInMilliseconds = durationInMilliseconds;
            return this;
        }


        @JsonProperty("expirationPayload")
        public Builder withExpirationPayload(Object expirationPayload) {
            this.expirationPayload = expirationPayload;
            return this;
        }


        public Expiration build() {
            return new Expiration(this);
        }
    }
}

