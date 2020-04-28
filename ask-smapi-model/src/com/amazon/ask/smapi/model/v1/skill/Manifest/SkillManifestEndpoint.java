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
 * Defines the structure for endpoint information in the skill manifest.
 */

@JsonDeserialize(builder = SkillManifestEndpoint.Builder.class)
public final class SkillManifestEndpoint {

    @JsonProperty("uri")
    private String uri = null;

    @JsonProperty("sslCertificateType")
    private String sslCertificateType = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillManifestEndpoint(Builder builder) {
        if (builder.uri != null) {
            this.uri = builder.uri;
        }
        if (builder.sslCertificateType != null) {
            this.sslCertificateType = builder.sslCertificateType;
        }
    }

    /**
     * Amazon Resource Name (ARN) of the skill's Lambda function or HTTPS URL.
     * @return uri
    **/
    @JsonProperty("uri")
    public String getUri() {
        return uri;
    }


    /**
     * Get sslCertificateType
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getSslCertificateTypeAsString().
     *
     * @return sslCertificateType
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SSLCertificateType getSslCertificateType() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.SSLCertificateType.fromValue(sslCertificateType);
    }

    /**
     * Get the underlying String value for sslCertificateType.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return sslCertificateType as a String value
    **/
    @JsonProperty("sslCertificateType")
    public String getSslCertificateTypeAsString() {
      return sslCertificateType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillManifestEndpoint v1SkillManifestSkillManifestEndpoint = (SkillManifestEndpoint) o;
        return Objects.equals(this.uri, v1SkillManifestSkillManifestEndpoint.uri) &&
            Objects.equals(this.sslCertificateType, v1SkillManifestSkillManifestEndpoint.sslCertificateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri, sslCertificateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillManifestEndpoint {\n");
        
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    sslCertificateType: ").append(toIndentedString(sslCertificateType)).append("\n");
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
        private String sslCertificateType;

        private Builder() {}

        @JsonProperty("uri")

        public Builder withUri(String uri) {
            this.uri = uri;
            return this;
        }


        @JsonProperty("sslCertificateType")
        public Builder withSslCertificateType(String sslCertificateType) {
          this.sslCertificateType = sslCertificateType;
          return this;
        }

        public Builder withSslCertificateType(com.amazon.ask.smapi.model.v1.skill.Manifest.SSLCertificateType sslCertificateType) {
            this.sslCertificateType = sslCertificateType != null ? sslCertificateType.toString() : null;
            return this;
        }


        public SkillManifestEndpoint build() {
            return new SkillManifestEndpoint(this);
        }
    }
}

