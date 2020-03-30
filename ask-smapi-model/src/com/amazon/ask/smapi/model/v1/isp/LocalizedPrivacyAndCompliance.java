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


package com.amazon.ask.smapi.model.v1.isp;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the structure for localized privacy and compliance.
 */

@JsonDeserialize(builder = LocalizedPrivacyAndCompliance.Builder.class)
public final class LocalizedPrivacyAndCompliance {

    @JsonProperty("privacyPolicyUrl")
    private String privacyPolicyUrl = null;

    public static Builder builder() {
        return new Builder();
    }

    private LocalizedPrivacyAndCompliance(Builder builder) {
        if (builder.privacyPolicyUrl != null) {
            this.privacyPolicyUrl = builder.privacyPolicyUrl;
        }
    }

    /**
     * Link to the privacy policy that applies to this in-skill product.
     * @return privacyPolicyUrl
    **/
    @JsonProperty("privacyPolicyUrl")
    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalizedPrivacyAndCompliance v1IspLocalizedPrivacyAndCompliance = (LocalizedPrivacyAndCompliance) o;
        return Objects.equals(this.privacyPolicyUrl, v1IspLocalizedPrivacyAndCompliance.privacyPolicyUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privacyPolicyUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalizedPrivacyAndCompliance {\n");
        
        sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
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
        private String privacyPolicyUrl;

        private Builder() {}

        @JsonProperty("privacyPolicyUrl")

        public Builder withPrivacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
            return this;
        }


        public LocalizedPrivacyAndCompliance build() {
            return new LocalizedPrivacyAndCompliance(this);
        }
    }
}

