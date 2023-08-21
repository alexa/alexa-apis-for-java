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


package com.amazon.ask.model.interfaces.alexa.advertisement;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This event is sent to the skill as a signal that it can enqueue the next audio content in the audio player. This allows the third-party skill to resume content playback after the advertisement.
 */

@JsonDeserialize(builder = ReadyToEnqueueAudio.Builder.class)
public final class ReadyToEnqueueAudio extends com.amazon.ask.model.Request  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("previousToken")
    private String previousToken = null;

    private ReadyToEnqueueAudio() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ReadyToEnqueueAudio(Builder builder) {
        String discriminatorValue = "Alexa.Advertisement.ReadyToEnqueueAudio";

        this.type = discriminatorValue;
        if (builder.requestId != null) {
            this.requestId = builder.requestId;
        }
        if (builder.timestamp != null) {
            this.timestamp = builder.timestamp;
        }
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.previousToken != null) {
            this.previousToken = builder.previousToken;
        }
    }

    /**
     * The token currently representing the ad stream being played can be used as the expectedPreviousToken in the AudioPlayer.Play directive. This allows the skill to enqueue the next content seamlessly after the ad stream.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * The expectedPreviousToken passed in the InjectAds request, which can be utilized by a skill to maintain an ordered list and find the next content from the current content.
     * @return previousToken
    **/
    @JsonProperty("previousToken")
    public String getPreviousToken() {
        return previousToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReadyToEnqueueAudio interfacesAlexaAdvertisementReadyToEnqueueAudio = (ReadyToEnqueueAudio) o;
        return Objects.equals(this.token, interfacesAlexaAdvertisementReadyToEnqueueAudio.token) &&
            Objects.equals(this.previousToken, interfacesAlexaAdvertisementReadyToEnqueueAudio.previousToken) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, previousToken, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadyToEnqueueAudio {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    previousToken: ").append(toIndentedString(previousToken)).append("\n");
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
        private String requestId;
        private OffsetDateTime timestamp;
        private String locale;
        private String token;
        private String previousToken;

        private Builder() {}

        @JsonProperty("requestId")

        public Builder withRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }


        @JsonProperty("timestamp")

        public Builder withTimestamp(OffsetDateTime timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("previousToken")

        public Builder withPreviousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }


        public ReadyToEnqueueAudio build() {
            return new ReadyToEnqueueAudio(this);
        }
    }
}

