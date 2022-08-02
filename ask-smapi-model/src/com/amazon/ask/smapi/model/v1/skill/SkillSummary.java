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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Information about the skills.
 */

@JsonDeserialize(builder = SkillSummary.Builder.class)
public final class SkillSummary {

    @JsonProperty("skillId")
    private String skillId = null;

    @JsonProperty("stage")
    private String stage = null;

    @JsonProperty("apis")
    private List<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis> apis = new ArrayList<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis>();

    @JsonProperty("publicationStatus")
    private String publicationStatus = null;

    @JsonProperty("lastUpdated")
    private OffsetDateTime lastUpdated = null;

    @JsonProperty("nameByLocale")
    private Map<String, String> nameByLocale = new HashMap<String, String>();

    @JsonProperty("asin")
    private String asin = null;

    @JsonProperty("_links")
    private com.amazon.ask.smapi.model.v1.Links links = null;

    private SkillSummary() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillSummary(Builder builder) {
        if (builder.skillId != null) {
            this.skillId = builder.skillId;
        }
        if (builder.stage != null) {
            this.stage = builder.stage;
        }
        if (builder.apis != null) {
            this.apis = builder.apis;
        }
        if (builder.publicationStatus != null) {
            this.publicationStatus = builder.publicationStatus;
        }
        if (builder.lastUpdated != null) {
            this.lastUpdated = builder.lastUpdated;
        }
        if (builder.nameByLocale != null) {
            this.nameByLocale = builder.nameByLocale;
        }
        if (builder.asin != null) {
            this.asin = builder.asin;
        }
        if (builder.links != null) {
            this.links = builder.links;
        }
    }

    /**
     * Get skillId
     * @return skillId
    **/
    @JsonProperty("skillId")
    public String getSkillId() {
        return skillId;
    }


    /**
     * Get stage
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStageAsString().
     *
     * @return stage
    **/
    
    public com.amazon.ask.smapi.model.v1.StageV2Type getStage() {
        return com.amazon.ask.smapi.model.v1.StageV2Type.fromValue(stage);
    }

    /**
     * Get the underlying String value for stage.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return stage as a String value
    **/
    @JsonProperty("stage")
    public String getStageAsString() {
      return stage;
    }

    /**
     * List of APIs currently implemented by the skill.
     * @return apis
    **/
    @JsonProperty("apis")
    public List<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis> getApis() {
        return apis;
    }


    /**
     * Get publicationStatus
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getPublicationStatusAsString().
     *
     * @return publicationStatus
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.PublicationStatus getPublicationStatus() {
        return com.amazon.ask.smapi.model.v1.skill.PublicationStatus.fromValue(publicationStatus);
    }

    /**
     * Get the underlying String value for publicationStatus.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return publicationStatus as a String value
    **/
    @JsonProperty("publicationStatus")
    public String getPublicationStatusAsString() {
      return publicationStatus;
    }

    /**
     * Get lastUpdated
     * @return lastUpdated
    **/
    @JsonProperty("lastUpdated")
    public OffsetDateTime getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Name of the skill in skill locales (keys are locale names (e.g. 'en-US') whereas values are name of the skill in that locale. 
     * @return nameByLocale
    **/
    @JsonProperty("nameByLocale")
    public Map<String, String> getNameByLocale() {
        return nameByLocale;
    }


    /**
     * Amazon Standard Identification Number (ASIN) is unique blocks of 10 letters and/or numbers that identify items. More info about ASIN can be found here: https://www.amazon.com/gp/seller/asin-upc-isbn-info.html ASIN is available for those skills only, that have been published, at least once. 
     * @return asin
    **/
    @JsonProperty("asin")
    public String getAsin() {
        return asin;
    }


    /**
     * Get links
     * @return links
    **/
    @JsonProperty("_links")
    public com.amazon.ask.smapi.model.v1.Links getLinks() {
        return links;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillSummary v1SkillSkillSummary = (SkillSummary) o;
        return Objects.equals(this.skillId, v1SkillSkillSummary.skillId) &&
            Objects.equals(this.stage, v1SkillSkillSummary.stage) &&
            Objects.equals(this.apis, v1SkillSkillSummary.apis) &&
            Objects.equals(this.publicationStatus, v1SkillSkillSummary.publicationStatus) &&
            Objects.equals(this.lastUpdated, v1SkillSkillSummary.lastUpdated) &&
            Objects.equals(this.nameByLocale, v1SkillSkillSummary.nameByLocale) &&
            Objects.equals(this.asin, v1SkillSkillSummary.asin) &&
            Objects.equals(this.links, v1SkillSkillSummary.links);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skillId, stage, apis, publicationStatus, lastUpdated, nameByLocale, asin, links);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillSummary {\n");
        
        sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    apis: ").append(toIndentedString(apis)).append("\n");
        sb.append("    publicationStatus: ").append(toIndentedString(publicationStatus)).append("\n");
        sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
        sb.append("    nameByLocale: ").append(toIndentedString(nameByLocale)).append("\n");
        sb.append("    asin: ").append(toIndentedString(asin)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
        private String skillId;
        private String stage;
        private List<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis> apis;
        private String publicationStatus;
        private OffsetDateTime lastUpdated;
        private Map<String, String> nameByLocale;
        private String asin;
        private com.amazon.ask.smapi.model.v1.Links links;

        private Builder() {}

        @JsonProperty("skillId")

        public Builder withSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }


        @JsonProperty("stage")

        public Builder withStage(String stage) {
          this.stage = stage;
          return this;
        }

        public Builder withStage(com.amazon.ask.smapi.model.v1.StageV2Type stage) {
            this.stage = stage != null ? stage.toString() : null;
            return this;
        }


        @JsonProperty("apis")

        public Builder withApis(List<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis> apis) {
            this.apis = apis;
            return this;
        }

        public Builder addApisItem(com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis apisItem) {
            if (this.apis == null) {
                this.apis = new ArrayList<com.amazon.ask.smapi.model.v1.skill.SkillSummaryApis>();
            }
            this.apis.add(apisItem);
            return this;
        }

        @JsonProperty("publicationStatus")

        public Builder withPublicationStatus(String publicationStatus) {
          this.publicationStatus = publicationStatus;
          return this;
        }

        public Builder withPublicationStatus(com.amazon.ask.smapi.model.v1.skill.PublicationStatus publicationStatus) {
            this.publicationStatus = publicationStatus != null ? publicationStatus.toString() : null;
            return this;
        }


        @JsonProperty("lastUpdated")

        public Builder withLastUpdated(OffsetDateTime lastUpdated) {
            this.lastUpdated = lastUpdated;
            return this;
        }


        @JsonProperty("nameByLocale")

        public Builder withNameByLocale(Map<String, String> nameByLocale) {
            this.nameByLocale = nameByLocale;
            return this;
        }

        public Builder putNameByLocaleItem(String key, String nameByLocaleItem) {
            if (this.nameByLocale == null) {
                this.nameByLocale = new HashMap<String, String>();
            }
            this.nameByLocale.put(key, nameByLocaleItem);
            return this;
        }

        @JsonProperty("asin")

        public Builder withAsin(String asin) {
            this.asin = asin;
            return this;
        }


        @JsonProperty("_links")

        public Builder withLinks(com.amazon.ask.smapi.model.v1.Links links) {
            this.links = links;
            return this;
        }


        public SkillSummary build() {
            return new SkillSummary(this);
        }
    }
}

