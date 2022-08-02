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
 * Defines the structure for locale specific privacy &amp;amp; compliance information in the skill manifest.
 */

@JsonDeserialize(builder = SkillManifestLocalizedPrivacyAndCompliance.Builder.class)
public final class SkillManifestLocalizedPrivacyAndCompliance {

    @JsonProperty("privacyPolicyUrl")
    private String privacyPolicyUrl = null;

    @JsonProperty("termsOfUseUrl")
    private String termsOfUseUrl = null;

    private SkillManifestLocalizedPrivacyAndCompliance() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillManifestLocalizedPrivacyAndCompliance(Builder builder) {
        if (builder.privacyPolicyUrl != null) {
            this.privacyPolicyUrl = builder.privacyPolicyUrl;
        }
        if (builder.termsOfUseUrl != null) {
            this.termsOfUseUrl = builder.termsOfUseUrl;
        }
    }

    /**
     * Link to the privacy policy that applies to this skill.
     * @return privacyPolicyUrl
    **/
    @JsonProperty("privacyPolicyUrl")
    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }


    /**
     * link to the terms of use document for this skill
     * @return termsOfUseUrl
    **/
    @JsonProperty("termsOfUseUrl")
    public String getTermsOfUseUrl() {
        return termsOfUseUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillManifestLocalizedPrivacyAndCompliance v1SkillManifestSkillManifestLocalizedPrivacyAndCompliance = (SkillManifestLocalizedPrivacyAndCompliance) o;
        return Objects.equals(this.privacyPolicyUrl, v1SkillManifestSkillManifestLocalizedPrivacyAndCompliance.privacyPolicyUrl) &&
            Objects.equals(this.termsOfUseUrl, v1SkillManifestSkillManifestLocalizedPrivacyAndCompliance.termsOfUseUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privacyPolicyUrl, termsOfUseUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillManifestLocalizedPrivacyAndCompliance {\n");
        
        sb.append("    privacyPolicyUrl: ").append(toIndentedString(privacyPolicyUrl)).append("\n");
        sb.append("    termsOfUseUrl: ").append(toIndentedString(termsOfUseUrl)).append("\n");
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
        private String termsOfUseUrl;

        private Builder() {}

        @JsonProperty("privacyPolicyUrl")

        public Builder withPrivacyPolicyUrl(String privacyPolicyUrl) {
            this.privacyPolicyUrl = privacyPolicyUrl;
            return this;
        }


        @JsonProperty("termsOfUseUrl")

        public Builder withTermsOfUseUrl(String termsOfUseUrl) {
            this.termsOfUseUrl = termsOfUseUrl;
            return this;
        }


        public SkillManifestLocalizedPrivacyAndCompliance build() {
            return new SkillManifestLocalizedPrivacyAndCompliance(this);
        }
    }
}

