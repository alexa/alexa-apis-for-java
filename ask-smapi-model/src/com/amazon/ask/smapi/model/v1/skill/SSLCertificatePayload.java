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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSLCertificatePayload
 */

@JsonDeserialize(builder = SSLCertificatePayload.Builder.class)
public final class SSLCertificatePayload {

    @JsonProperty("sslCertificate")
    private String sslCertificate = null;

    @JsonProperty("regions")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.RegionalSSLCertificate> regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.RegionalSSLCertificate>();

    private SSLCertificatePayload() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SSLCertificatePayload(Builder builder) {
        if (builder.sslCertificate != null) {
            this.sslCertificate = builder.sslCertificate;
        }
        if (builder.regions != null) {
            this.regions = builder.regions;
        }
    }

    /**
     * The default ssl certificate for the skill. If a request is made for a region without an explicit ssl certificate, this certificate will be used.
     * @return sslCertificate
    **/
    @JsonProperty("sslCertificate")
    public String getSslCertificate() {
        return sslCertificate;
    }


    /**
     * A map of region to ssl certificate. Keys are string region codes (https://developer.amazon.com/docs/smapi/skill-manifest.html#regions), values are regional ssl certificate objects which contain the ssl certificate blobs as strings.
     * @return regions
    **/
    @JsonProperty("regions")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.RegionalSSLCertificate> getRegions() {
        return regions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SSLCertificatePayload v1SkillSSLCertificatePayload = (SSLCertificatePayload) o;
        return Objects.equals(this.sslCertificate, v1SkillSSLCertificatePayload.sslCertificate) &&
            Objects.equals(this.regions, v1SkillSSLCertificatePayload.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sslCertificate, regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSLCertificatePayload {\n");
        
        sb.append("    sslCertificate: ").append(toIndentedString(sslCertificate)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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
        private String sslCertificate;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.RegionalSSLCertificate> regions;

        private Builder() {}

        @JsonProperty("sslCertificate")

        public Builder withSslCertificate(String sslCertificate) {
            this.sslCertificate = sslCertificate;
            return this;
        }


        @JsonProperty("regions")

        public Builder withRegions(Map<String, com.amazon.ask.smapi.model.v1.skill.RegionalSSLCertificate> regions) {
            this.regions = regions;
            return this;
        }

        public Builder putRegionsItem(String key, com.amazon.ask.smapi.model.v1.skill.RegionalSSLCertificate regionsItem) {
            if (this.regions == null) {
                this.regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.RegionalSSLCertificate>();
            }
            this.regions.put(key, regionsItem);
            return this;
        }

        public SSLCertificatePayload build() {
            return new SSLCertificatePayload(this);
        }
    }
}

