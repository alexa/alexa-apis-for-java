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
 * Defines the localized flash briefing api information.
 */

@JsonDeserialize(builder = LocalizedFlashBriefingInfo.Builder.class)
public final class LocalizedFlashBriefingInfo {

    @JsonProperty("feeds")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfoItems> feeds = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfoItems>();

    @JsonProperty("customErrorMessage")
    private String customErrorMessage = null;

    public static Builder builder() {
        return new Builder();
    }

    private LocalizedFlashBriefingInfo(Builder builder) {
        if (builder.feeds != null) {
            this.feeds = builder.feeds;
        }
        if (builder.customErrorMessage != null) {
            this.customErrorMessage = builder.customErrorMessage;
        }
    }

    /**
     * Defines the structure for a feed information in the skill manifest.
     * @return feeds
    **/
    @JsonProperty("feeds")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfoItems> getFeeds() {
        return feeds;
    }


    /**
     * Alexa says this to the customer if the skill fails to render the content.
     * @return customErrorMessage
    **/
    @JsonProperty("customErrorMessage")
    public String getCustomErrorMessage() {
        return customErrorMessage;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalizedFlashBriefingInfo v1SkillManifestLocalizedFlashBriefingInfo = (LocalizedFlashBriefingInfo) o;
        return Objects.equals(this.feeds, v1SkillManifestLocalizedFlashBriefingInfo.feeds) &&
            Objects.equals(this.customErrorMessage, v1SkillManifestLocalizedFlashBriefingInfo.customErrorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feeds, customErrorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalizedFlashBriefingInfo {\n");
        
        sb.append("    feeds: ").append(toIndentedString(feeds)).append("\n");
        sb.append("    customErrorMessage: ").append(toIndentedString(customErrorMessage)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfoItems> feeds;
        private String customErrorMessage;

        private Builder() {}

        @JsonProperty("feeds")

        public Builder withFeeds(List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfoItems> feeds) {
            this.feeds = feeds;
            return this;
        }

        public Builder addFeedsItem(com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfoItems feedsItem) {
            if (this.feeds == null) {
                this.feeds = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedFlashBriefingInfoItems>();
            }
            this.feeds.add(feedsItem);
            return this;
        }

        @JsonProperty("customErrorMessage")

        public Builder withCustomErrorMessage(String customErrorMessage) {
            this.customErrorMessage = customErrorMessage;
            return this;
        }


        public LocalizedFlashBriefingInfo build() {
            return new LocalizedFlashBriefingInfo(this);
        }
    }
}

