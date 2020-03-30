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
 * RegionalSSLCertificate
 */

@JsonDeserialize(builder = RegionalSSLCertificate.Builder.class)
public final class RegionalSSLCertificate {

    @JsonProperty("sslCertificate")
    private String sslCertificate = null;

    public static Builder builder() {
        return new Builder();
    }

    private RegionalSSLCertificate(Builder builder) {
        if (builder.sslCertificate != null) {
            this.sslCertificate = builder.sslCertificate;
        }
    }

    /**
     * Get sslCertificate
     * @return sslCertificate
    **/
    @JsonProperty("sslCertificate")
    public String getSslCertificate() {
        return sslCertificate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegionalSSLCertificate v1SkillRegionalSSLCertificate = (RegionalSSLCertificate) o;
        return Objects.equals(this.sslCertificate, v1SkillRegionalSSLCertificate.sslCertificate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sslCertificate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionalSSLCertificate {\n");
        
        sb.append("    sslCertificate: ").append(toIndentedString(sslCertificate)).append("\n");
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

        private Builder() {}

        @JsonProperty("sslCertificate")

        public Builder withSslCertificate(String sslCertificate) {
            this.sslCertificate = sslCertificate;
            return this;
        }


        public RegionalSSLCertificate build() {
            return new RegionalSSLCertificate(this);
        }
    }
}

