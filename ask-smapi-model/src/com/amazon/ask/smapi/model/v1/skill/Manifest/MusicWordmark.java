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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MusicWordmark
 */

@JsonDeserialize(builder = MusicWordmark.Builder.class)
public final class MusicWordmark {

    @JsonProperty("uri")
    private String uri = null;

    public static Builder builder() {
        return new Builder();
    }

    private MusicWordmark(Builder builder) {
        if (builder.uri != null) {
            this.uri = builder.uri;
        }
    }

    /**
     * Wordmark logo to be used by devices with displays.
     * @return uri
    **/
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MusicWordmark v1SkillManifestMusicWordmark = (MusicWordmark) o;
        return Objects.equals(this.uri, v1SkillManifestMusicWordmark.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MusicWordmark {\n");
        
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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
        private String uri;

        private Builder() {}

        @JsonProperty("uri")
        public Builder withUri(String uri) {
            this.uri = uri;
            return this;
        }


        public MusicWordmark build() {
            return new MusicWordmark(this);
        }
    }
}

