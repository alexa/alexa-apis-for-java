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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.version;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Definition for catalog version input data.
 */

@JsonDeserialize(builder = InputSource.Builder.class)
public final class InputSource {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("url")
    private String url = null;

    public static Builder builder() {
        return new Builder();
    }

    private InputSource(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.url != null) {
            this.url = builder.url;
        }
    }

    /**
     * Type of catalog.
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Url to the catalog reference.
     * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InputSource v1SkillInteractionModelVersionInputSource = (InputSource) o;
        return Objects.equals(this.type, v1SkillInteractionModelVersionInputSource.type) &&
            Objects.equals(this.url, v1SkillInteractionModelVersionInputSource.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputSource {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
        private String url;

        private Builder() {}

        @JsonProperty("type")
        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("url")
        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }


        public InputSource build() {
            return new InputSource(this);
        }
    }
}

