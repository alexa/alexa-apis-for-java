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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the structure for subscribed events information in the skill manifest.
 */

@JsonDeserialize(builder = SkillManifestEvents.Builder.class)
public final class SkillManifestEvents {

    @JsonProperty("subscriptions")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.EventName> subscriptions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.EventName>();

    @JsonProperty("publications")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.EventPublications> publications = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.EventPublications>();

    @JsonProperty("regions")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region>();

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillManifestEvents(Builder builder) {
        if (builder.subscriptions != null) {
            this.subscriptions = builder.subscriptions;
        }
        if (builder.publications != null) {
            this.publications = builder.publications;
        }
        if (builder.regions != null) {
            this.regions = builder.regions;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
    }

    /**
     * Contains an array of eventName object each of which contains the name of a skill event.
     * @return subscriptions
    **/
    @JsonProperty("subscriptions")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.EventName> getSubscriptions() {
        return subscriptions;
    }


    /**
     * Get publications
     * @return publications
    **/
    @JsonProperty("publications")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.EventPublications> getPublications() {
        return publications;
    }


    /**
     * Contains an array of the supported &amp;lt;region&amp;gt; Objects.
     * @return regions
    **/
    @JsonProperty("regions")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> getRegions() {
        return regions;
    }


    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint getEndpoint() {
        return endpoint;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillManifestEvents v1SkillManifestSkillManifestEvents = (SkillManifestEvents) o;
        return Objects.equals(this.subscriptions, v1SkillManifestSkillManifestEvents.subscriptions) &&
            Objects.equals(this.publications, v1SkillManifestSkillManifestEvents.publications) &&
            Objects.equals(this.regions, v1SkillManifestSkillManifestEvents.regions) &&
            Objects.equals(this.endpoint, v1SkillManifestSkillManifestEvents.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptions, publications, regions, endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillManifestEvents {\n");
        
        sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
        sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.EventName> subscriptions;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.EventPublications> publications;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> regions;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint;

        private Builder() {}

        @JsonProperty("subscriptions")

        public Builder withSubscriptions(List<com.amazon.ask.smapi.model.v1.skill.Manifest.EventName> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }

        public Builder addSubscriptionsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.EventName subscriptionsItem) {
            if (this.subscriptions == null) {
                this.subscriptions = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.EventName>();
            }
            this.subscriptions.add(subscriptionsItem);
            return this;
        }

        @JsonProperty("publications")

        public Builder withPublications(List<com.amazon.ask.smapi.model.v1.skill.Manifest.EventPublications> publications) {
            this.publications = publications;
            return this;
        }

        public Builder addPublicationsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.EventPublications publicationsItem) {
            if (this.publications == null) {
                this.publications = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.EventPublications>();
            }
            this.publications.add(publicationsItem);
            return this;
        }

        @JsonProperty("regions")

        public Builder withRegions(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> regions) {
            this.regions = regions;
            return this;
        }

        public Builder putRegionsItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.Region regionsItem) {
            if (this.regions == null) {
                this.regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region>();
            }
            this.regions.put(key, regionsItem);
            return this;
        }

        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        public SkillManifestEvents build() {
            return new SkillManifestEvents(this);
        }
    }
}

