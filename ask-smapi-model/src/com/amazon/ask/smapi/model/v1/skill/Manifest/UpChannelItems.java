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
 * UpChannelItems
 */

@JsonDeserialize(builder = UpChannelItems.Builder.class)
public final class UpChannelItems {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("uri")
    private String uri = null;

    public static Builder builder() {
        return new Builder();
    }

    private UpChannelItems(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.uri != null) {
            this.uri = builder.uri;
        }
    }

    /**
     * Use \\\"SNS\\\" for this field.
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    /**
     * SNS Amazon Resource Name (ARN) for video skill through which video partner can send events to Alexa.
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
        UpChannelItems v1SkillManifestUpChannelItems = (UpChannelItems) o;
        return Objects.equals(this.type, v1SkillManifestUpChannelItems.type) &&
            Objects.equals(this.uri, v1SkillManifestUpChannelItems.uri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, uri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpChannelItems {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
        private String type;
        private String uri;

        private Builder() {}

        @JsonProperty("type")

        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("uri")

        public Builder withUri(String uri) {
            this.uri = uri;
            return this;
        }


        public UpChannelItems build() {
            return new UpChannelItems(this);
        }
    }
}

