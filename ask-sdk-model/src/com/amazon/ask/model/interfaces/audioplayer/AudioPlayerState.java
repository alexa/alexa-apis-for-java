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


package com.amazon.ask.model.interfaces.audioplayer;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AudioPlayerState
 */

@JsonDeserialize(builder = AudioPlayerState.Builder.class)
public final class AudioPlayerState {

    @JsonProperty("offsetInMilliseconds")
    private Long offsetInMilliseconds = null;

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("playerActivity")
    private String playerActivity = null;

    public static Builder builder() {
        return new Builder();
    }

    private AudioPlayerState(Builder builder) {
        if (builder.offsetInMilliseconds != null) {
            this.offsetInMilliseconds = builder.offsetInMilliseconds;
        }
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.playerActivity != null) {
            this.playerActivity = builder.playerActivity;
        }
    }

    /**
     * Get offsetInMilliseconds
     * @return offsetInMilliseconds
    **/
    @JsonProperty("offsetInMilliseconds")
    public Long getOffsetInMilliseconds() {
        return offsetInMilliseconds;
    }


    /**
     * Get token
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * Get playerActivity
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getPlayerActivityAsString().
     *
     * @return playerActivity
    **/
    
    public com.amazon.ask.model.interfaces.audioplayer.PlayerActivity getPlayerActivity() {
        return com.amazon.ask.model.interfaces.audioplayer.PlayerActivity.fromValue(playerActivity);
    }

    /**
     * Get the underlying String value for playerActivity.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return playerActivity as a String value
    **/
    @JsonProperty("playerActivity")
    public String getPlayerActivityAsString() {
      return playerActivity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioPlayerState interfacesAudioplayerAudioPlayerState = (AudioPlayerState) o;
        return Objects.equals(this.offsetInMilliseconds, interfacesAudioplayerAudioPlayerState.offsetInMilliseconds) &&
            Objects.equals(this.token, interfacesAudioplayerAudioPlayerState.token) &&
            Objects.equals(this.playerActivity, interfacesAudioplayerAudioPlayerState.playerActivity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offsetInMilliseconds, token, playerActivity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioPlayerState {\n");
        
        sb.append("    offsetInMilliseconds: ").append(toIndentedString(offsetInMilliseconds)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    playerActivity: ").append(toIndentedString(playerActivity)).append("\n");
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
        private Long offsetInMilliseconds;
        private String token;
        private String playerActivity;

        private Builder() {}

        @JsonProperty("offsetInMilliseconds")

        public Builder withOffsetInMilliseconds(Long offsetInMilliseconds) {
            this.offsetInMilliseconds = offsetInMilliseconds;
            return this;
        }


        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("playerActivity")

        public Builder withPlayerActivity(String playerActivity) {
          this.playerActivity = playerActivity;
          return this;
        }

        public Builder withPlayerActivity(com.amazon.ask.model.interfaces.audioplayer.PlayerActivity playerActivity) {
            this.playerActivity = playerActivity != null ? playerActivity.toString() : null;
            return this;
        }


        public AudioPlayerState build() {
            return new AudioPlayerState(this);
        }
    }
}

