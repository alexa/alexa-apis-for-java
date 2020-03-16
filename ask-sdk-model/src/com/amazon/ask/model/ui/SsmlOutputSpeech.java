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


package com.amazon.ask.model.ui;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SsmlOutputSpeech
 */

@JsonDeserialize(builder = SsmlOutputSpeech.Builder.class)
public final class SsmlOutputSpeech extends com.amazon.ask.model.ui.OutputSpeech  {

    @JsonProperty("ssml")
    private String ssml = null;

    public static Builder builder() {
        return new Builder();
    }

    private SsmlOutputSpeech(Builder builder) {
        String discriminatorValue = "SSML";

        this.type = discriminatorValue;
        if (builder.playBehavior != null) {
            this.playBehavior = builder.playBehavior;
        }
        if (builder.ssml != null) {
            this.ssml = builder.ssml;
        }
    }

    /**
     * Get ssml
     * @return ssml
    **/
    @JsonProperty("ssml")
    public String getSsml() {
        return ssml;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SsmlOutputSpeech uiSsmlOutputSpeech = (SsmlOutputSpeech) o;
        return Objects.equals(this.ssml, uiSsmlOutputSpeech.ssml) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ssml, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SsmlOutputSpeech {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    ssml: ").append(toIndentedString(ssml)).append("\n");
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
        private String playBehavior;
        private String ssml;

        private Builder() {}

        @JsonProperty("playBehavior")
        public Builder withPlayBehavior(String playBehavior) {
          this.playBehavior = playBehavior;
          return this;
        }

        public Builder withPlayBehavior(com.amazon.ask.model.ui.PlayBehavior playBehavior) {
            this.playBehavior = playBehavior != null ? playBehavior.toString() : null;
            return this;
        }


        @JsonProperty("ssml")

        public Builder withSsml(String ssml) {
            this.ssml = ssml;
            return this;
        }


        public SsmlOutputSpeech build() {
            return new SsmlOutputSpeech(this);
        }
    }
}

