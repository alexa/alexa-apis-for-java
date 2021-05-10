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
 * Details required for app linking use cases.
 */

@JsonDeserialize(builder = AppLink.Builder.class)
public final class AppLink {

    @JsonProperty("linkedApplications")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.LinkedApplication> linkedApplications = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.LinkedApplication>();

    public static Builder builder() {
        return new Builder();
    }

    private AppLink(Builder builder) {
        if (builder.linkedApplications != null) {
            this.linkedApplications = builder.linkedApplications;
        }
    }

    /**
     * Allows developers to declare their Skill will use Alexa App Links, and list relevant apps. This field is required when using the APP_LINK interface.
     * @return linkedApplications
    **/
    @JsonProperty("linkedApplications")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.LinkedApplication> getLinkedApplications() {
        return linkedApplications;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppLink v1SkillManifestAppLink = (AppLink) o;
        return Objects.equals(this.linkedApplications, v1SkillManifestAppLink.linkedApplications);
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkedApplications);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppLink {\n");
        
        sb.append("    linkedApplications: ").append(toIndentedString(linkedApplications)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.LinkedApplication> linkedApplications;

        private Builder() {}

        @JsonProperty("linkedApplications")

        public Builder withLinkedApplications(List<com.amazon.ask.smapi.model.v1.skill.Manifest.LinkedApplication> linkedApplications) {
            this.linkedApplications = linkedApplications;
            return this;
        }

        public Builder addLinkedApplicationsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.LinkedApplication linkedApplicationsItem) {
            if (this.linkedApplications == null) {
                this.linkedApplications = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.LinkedApplication>();
            }
            this.linkedApplications.add(linkedApplicationsItem);
            return this;
        }

        public AppLink build() {
            return new AppLink(this);
        }
    }
}

