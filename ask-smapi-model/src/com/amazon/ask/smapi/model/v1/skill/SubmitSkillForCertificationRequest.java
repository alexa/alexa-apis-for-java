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


package com.amazon.ask.smapi.model.v1.skill;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubmitSkillForCertificationRequest
 */

@JsonDeserialize(builder = SubmitSkillForCertificationRequest.Builder.class)
public final class SubmitSkillForCertificationRequest {

    @JsonProperty("publicationMethod")
    private String publicationMethod = null;

    @JsonProperty("versionMessage")
    private String versionMessage = null;

    public static Builder builder() {
        return new Builder();
    }

    private SubmitSkillForCertificationRequest(Builder builder) {
        if (builder.publicationMethod != null) {
            this.publicationMethod = builder.publicationMethod;
        }
        if (builder.versionMessage != null) {
            this.versionMessage = builder.versionMessage;
        }
    }

    /**
     * Get publicationMethod
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getPublicationMethodAsString().
     *
     * @return publicationMethod
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.PublicationMethod getPublicationMethod() {
        return com.amazon.ask.smapi.model.v1.skill.PublicationMethod.fromValue(publicationMethod);
    }

    /**
     * Get the underlying String value for publicationMethod.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return publicationMethod as a String value
    **/
    @JsonProperty("publicationMethod")
    public String getPublicationMethodAsString() {
      return publicationMethod;
    }

    /**
     * Description of the version (limited to 300 characters).
     * @return versionMessage
    **/
    @JsonProperty("versionMessage")
    public String getVersionMessage() {
        return versionMessage;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubmitSkillForCertificationRequest v1SkillSubmitSkillForCertificationRequest = (SubmitSkillForCertificationRequest) o;
        return Objects.equals(this.publicationMethod, v1SkillSubmitSkillForCertificationRequest.publicationMethod) &&
            Objects.equals(this.versionMessage, v1SkillSubmitSkillForCertificationRequest.versionMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicationMethod, versionMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubmitSkillForCertificationRequest {\n");
        
        sb.append("    publicationMethod: ").append(toIndentedString(publicationMethod)).append("\n");
        sb.append("    versionMessage: ").append(toIndentedString(versionMessage)).append("\n");
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
        private String publicationMethod;
        private String versionMessage;

        private Builder() {}

        @JsonProperty("publicationMethod")

        public Builder withPublicationMethod(String publicationMethod) {
          this.publicationMethod = publicationMethod;
          return this;
        }

        public Builder withPublicationMethod(com.amazon.ask.smapi.model.v1.skill.PublicationMethod publicationMethod) {
            this.publicationMethod = publicationMethod != null ? publicationMethod.toString() : null;
            return this;
        }


        @JsonProperty("versionMessage")

        public Builder withVersionMessage(String versionMessage) {
            this.versionMessage = versionMessage;
            return this;
        }


        public SubmitSkillForCertificationRequest build() {
            return new SubmitSkillForCertificationRequest(this);
        }
    }
}

