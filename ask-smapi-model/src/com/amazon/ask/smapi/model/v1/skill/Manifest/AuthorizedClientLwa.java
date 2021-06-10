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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines client using Login With Amazon authentication provider, corresponds to LWA Security Profile.
 */

@JsonDeserialize(builder = AuthorizedClientLwa.Builder.class)
public final class AuthorizedClientLwa {

    @JsonProperty("authenticationProvider")
    private String authenticationProvider = null;

    @JsonProperty("applications")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClientLwaApplication> applications = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClientLwaApplication>();

    public static Builder builder() {
        return new Builder();
    }

    private AuthorizedClientLwa(Builder builder) {
        if (builder.authenticationProvider != null) {
            this.authenticationProvider = builder.authenticationProvider;
        }
        if (builder.applications != null) {
            this.applications = builder.applications;
        }
    }

    /**
     * Get authenticationProvider
     * @return authenticationProvider
    **/
    @JsonProperty("authenticationProvider")
    public String getAuthenticationProvider() {
        return authenticationProvider;
    }


    /**
     * Get applications
     * @return applications
    **/
    @JsonProperty("applications")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClientLwaApplication> getApplications() {
        return applications;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthorizedClientLwa v1SkillManifestAuthorizedClientLwa = (AuthorizedClientLwa) o;
        return Objects.equals(this.authenticationProvider, v1SkillManifestAuthorizedClientLwa.authenticationProvider) &&
            Objects.equals(this.applications, v1SkillManifestAuthorizedClientLwa.applications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationProvider, applications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizedClientLwa {\n");
        
        sb.append("    authenticationProvider: ").append(toIndentedString(authenticationProvider)).append("\n");
        sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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
        private String authenticationProvider;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClientLwaApplication> applications;

        private Builder() {}

        @JsonProperty("authenticationProvider")

        public Builder withAuthenticationProvider(String authenticationProvider) {
            this.authenticationProvider = authenticationProvider;
            return this;
        }


        @JsonProperty("applications")

        public Builder withApplications(List<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClientLwaApplication> applications) {
            this.applications = applications;
            return this;
        }

        public Builder addApplicationsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClientLwaApplication applicationsItem) {
            if (this.applications == null) {
                this.applications = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.AuthorizedClientLwaApplication>();
            }
            this.applications.add(applicationsItem);
            return this;
        }

        public AuthorizedClientLwa build() {
            return new AuthorizedClientLwa(this);
        }
    }
}

