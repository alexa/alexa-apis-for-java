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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the structure for locale specific publishing information in the in-skill product definition.
 */

@JsonDeserialize(builder = LocalizedPublishingInformation.Builder.class)
public final class LocalizedPublishingInformation {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("smallIconUri")
    private String smallIconUri = null;

    @JsonProperty("largeIconUri")
    private String largeIconUri = null;

    @JsonProperty("summary")
    private String summary = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("examplePhrases")
    private List<String> examplePhrases = new ArrayList<String>();

    @JsonProperty("keywords")
    private List<String> keywords = new ArrayList<String>();

    @JsonProperty("customProductPrompts")
    private com.amazon.ask.smapi.model.v1.isp.CustomProductPrompts customProductPrompts = null;

    private LocalizedPublishingInformation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private LocalizedPublishingInformation(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.smallIconUri != null) {
            this.smallIconUri = builder.smallIconUri;
        }
        if (builder.largeIconUri != null) {
            this.largeIconUri = builder.largeIconUri;
        }
        if (builder.summary != null) {
            this.summary = builder.summary;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.examplePhrases != null) {
            this.examplePhrases = builder.examplePhrases;
        }
        if (builder.keywords != null) {
            this.keywords = builder.keywords;
        }
        if (builder.customProductPrompts != null) {
            this.customProductPrompts = builder.customProductPrompts;
        }
    }

    /**
     * Name of the in-skill product that is heard by customers and displayed in the Alexa app.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Uri for the small icon image of the in-skill product.
     * @return smallIconUri
    **/
    @JsonProperty("smallIconUri")
    public String getSmallIconUri() {
        return smallIconUri;
    }


    /**
     * Uri for the large icon image of the in-skill product.
     * @return largeIconUri
    **/
    @JsonProperty("largeIconUri")
    public String getLargeIconUri() {
        return largeIconUri;
    }


    /**
     * Short description of the in-skill product that displays on the in-skill product list page in the Alexa App.
     * @return summary
    **/
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }


    /**
     * Description of the in-skill product's purpose and features, and how it works. Should describe any prerequisites like hardware or account requirements and detailed steps for the customer to get started. This description displays to customers on the in-skill product detail card in the Alexa app.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }


    /**
     * Example phrases appear on the in-skill product detail page and are the key utterances that customers can say to interact directly with the in-skill product.
     * @return examplePhrases
    **/
    @JsonProperty("examplePhrases")
    public List<String> getExamplePhrases() {
        return examplePhrases;
    }


    /**
     * Search terms that can be used to describe the in-skill product. This helps customers find an in-skill product.
     * @return keywords
    **/
    @JsonProperty("keywords")
    public List<String> getKeywords() {
        return keywords;
    }


    /**
     * Get customProductPrompts
     * @return customProductPrompts
    **/
    @JsonProperty("customProductPrompts")
    public com.amazon.ask.smapi.model.v1.isp.CustomProductPrompts getCustomProductPrompts() {
        return customProductPrompts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LocalizedPublishingInformation v1IspLocalizedPublishingInformation = (LocalizedPublishingInformation) o;
        return Objects.equals(this.name, v1IspLocalizedPublishingInformation.name) &&
            Objects.equals(this.smallIconUri, v1IspLocalizedPublishingInformation.smallIconUri) &&
            Objects.equals(this.largeIconUri, v1IspLocalizedPublishingInformation.largeIconUri) &&
            Objects.equals(this.summary, v1IspLocalizedPublishingInformation.summary) &&
            Objects.equals(this.description, v1IspLocalizedPublishingInformation.description) &&
            Objects.equals(this.examplePhrases, v1IspLocalizedPublishingInformation.examplePhrases) &&
            Objects.equals(this.keywords, v1IspLocalizedPublishingInformation.keywords) &&
            Objects.equals(this.customProductPrompts, v1IspLocalizedPublishingInformation.customProductPrompts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, smallIconUri, largeIconUri, summary, description, examplePhrases, keywords, customProductPrompts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalizedPublishingInformation {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    smallIconUri: ").append(toIndentedString(smallIconUri)).append("\n");
        sb.append("    largeIconUri: ").append(toIndentedString(largeIconUri)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    examplePhrases: ").append(toIndentedString(examplePhrases)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    customProductPrompts: ").append(toIndentedString(customProductPrompts)).append("\n");
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
        private String name;
        private String smallIconUri;
        private String largeIconUri;
        private String summary;
        private String description;
        private List<String> examplePhrases;
        private List<String> keywords;
        private com.amazon.ask.smapi.model.v1.isp.CustomProductPrompts customProductPrompts;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("smallIconUri")

        public Builder withSmallIconUri(String smallIconUri) {
            this.smallIconUri = smallIconUri;
            return this;
        }


        @JsonProperty("largeIconUri")

        public Builder withLargeIconUri(String largeIconUri) {
            this.largeIconUri = largeIconUri;
            return this;
        }


        @JsonProperty("summary")

        public Builder withSummary(String summary) {
            this.summary = summary;
            return this;
        }


        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("examplePhrases")

        public Builder withExamplePhrases(List<String> examplePhrases) {
            this.examplePhrases = examplePhrases;
            return this;
        }

        public Builder addExamplePhrasesItem(String examplePhrasesItem) {
            if (this.examplePhrases == null) {
                this.examplePhrases = new ArrayList<String>();
            }
            this.examplePhrases.add(examplePhrasesItem);
            return this;
        }

        @JsonProperty("keywords")

        public Builder withKeywords(List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        public Builder addKeywordsItem(String keywordsItem) {
            if (this.keywords == null) {
                this.keywords = new ArrayList<String>();
            }
            this.keywords.add(keywordsItem);
            return this;
        }

        @JsonProperty("customProductPrompts")

        public Builder withCustomProductPrompts(com.amazon.ask.smapi.model.v1.isp.CustomProductPrompts customProductPrompts) {
            this.customProductPrompts = customProductPrompts;
            return this;
        }


        public LocalizedPublishingInformation build() {
            return new LocalizedPublishingInformation(this);
        }
    }
}

