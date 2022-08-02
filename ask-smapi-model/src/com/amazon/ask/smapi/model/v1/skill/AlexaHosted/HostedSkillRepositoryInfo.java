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


package com.amazon.ask.smapi.model.v1.skill.AlexaHosted;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Alexa Hosted Skill&#39;s Repository Information
 */

@JsonDeserialize(builder = HostedSkillRepositoryInfo.Builder.class)
public final class HostedSkillRepositoryInfo {

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("type")
    private String type = null;

    private HostedSkillRepositoryInfo() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private HostedSkillRepositoryInfo(Builder builder) {
        if (builder.url != null) {
            this.url = builder.url;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
    }

    /**
     * Get url
     * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }


    /**
     * Get type
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepository getType() {
        return com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepository.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
      return type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedSkillRepositoryInfo v1SkillAlexaHostedHostedSkillRepositoryInfo = (HostedSkillRepositoryInfo) o;
        return Objects.equals(this.url, v1SkillAlexaHostedHostedSkillRepositoryInfo.url) &&
            Objects.equals(this.type, v1SkillAlexaHostedHostedSkillRepositoryInfo.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedSkillRepositoryInfo {\n");
        
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
        private String url;
        private String type;

        private Builder() {}

        @JsonProperty("url")

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }


        @JsonProperty("type")

        public Builder withType(String type) {
          this.type = type;
          return this;
        }

        public Builder withType(com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepository type) {
            this.type = type != null ? type.toString() : null;
            return this;
        }


        public HostedSkillRepositoryInfo build() {
            return new HostedSkillRepositoryInfo(this);
        }
    }
}

