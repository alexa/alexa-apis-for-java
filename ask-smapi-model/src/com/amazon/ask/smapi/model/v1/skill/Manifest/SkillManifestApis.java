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
 * Defines the structure for implemented apis information in the skill manifest.
 */

@JsonDeserialize(builder = SkillManifestApis.Builder.class)
public final class SkillManifestApis {

    @JsonProperty("flashBriefing")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingApis flashBriefing = null;

    @JsonProperty("custom")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.CustomApis custom = null;

    @JsonProperty("smartHome")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SmartHomeApis smartHome = null;

    @JsonProperty("video")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApis video = null;

    @JsonProperty("alexaForBusiness")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.AlexaForBusinessApis alexaForBusiness = null;

    @JsonProperty("health")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.HealthApis health = null;

    @JsonProperty("householdList")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.HouseHoldList householdList = null;

    @JsonProperty("music")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.MusicApis music = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillManifestApis(Builder builder) {
        if (builder.flashBriefing != null) {
            this.flashBriefing = builder.flashBriefing;
        }
        if (builder.custom != null) {
            this.custom = builder.custom;
        }
        if (builder.smartHome != null) {
            this.smartHome = builder.smartHome;
        }
        if (builder.video != null) {
            this.video = builder.video;
        }
        if (builder.alexaForBusiness != null) {
            this.alexaForBusiness = builder.alexaForBusiness;
        }
        if (builder.health != null) {
            this.health = builder.health;
        }
        if (builder.householdList != null) {
            this.householdList = builder.householdList;
        }
        if (builder.music != null) {
            this.music = builder.music;
        }
    }

    /**
     * Get flashBriefing
     * @return flashBriefing
    **/
    @JsonProperty("flashBriefing")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingApis getFlashBriefing() {
        return flashBriefing;
    }


    /**
     * Get custom
     * @return custom
    **/
    @JsonProperty("custom")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.CustomApis getCustom() {
        return custom;
    }


    /**
     * Get smartHome
     * @return smartHome
    **/
    @JsonProperty("smartHome")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SmartHomeApis getSmartHome() {
        return smartHome;
    }


    /**
     * Get video
     * @return video
    **/
    @JsonProperty("video")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApis getVideo() {
        return video;
    }


    /**
     * Get alexaForBusiness
     * @return alexaForBusiness
    **/
    @JsonProperty("alexaForBusiness")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.AlexaForBusinessApis getAlexaForBusiness() {
        return alexaForBusiness;
    }


    /**
     * Get health
     * @return health
    **/
    @JsonProperty("health")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.HealthApis getHealth() {
        return health;
    }


    /**
     * Get householdList
     * @return householdList
    **/
    @JsonProperty("householdList")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.HouseHoldList getHouseholdList() {
        return householdList;
    }


    /**
     * Get music
     * @return music
    **/
    @JsonProperty("music")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.MusicApis getMusic() {
        return music;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillManifestApis v1SkillManifestSkillManifestApis = (SkillManifestApis) o;
        return Objects.equals(this.flashBriefing, v1SkillManifestSkillManifestApis.flashBriefing) &&
            Objects.equals(this.custom, v1SkillManifestSkillManifestApis.custom) &&
            Objects.equals(this.smartHome, v1SkillManifestSkillManifestApis.smartHome) &&
            Objects.equals(this.video, v1SkillManifestSkillManifestApis.video) &&
            Objects.equals(this.alexaForBusiness, v1SkillManifestSkillManifestApis.alexaForBusiness) &&
            Objects.equals(this.health, v1SkillManifestSkillManifestApis.health) &&
            Objects.equals(this.householdList, v1SkillManifestSkillManifestApis.householdList) &&
            Objects.equals(this.music, v1SkillManifestSkillManifestApis.music);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flashBriefing, custom, smartHome, video, alexaForBusiness, health, householdList, music);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillManifestApis {\n");
        
        sb.append("    flashBriefing: ").append(toIndentedString(flashBriefing)).append("\n");
        sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
        sb.append("    smartHome: ").append(toIndentedString(smartHome)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    alexaForBusiness: ").append(toIndentedString(alexaForBusiness)).append("\n");
        sb.append("    health: ").append(toIndentedString(health)).append("\n");
        sb.append("    householdList: ").append(toIndentedString(householdList)).append("\n");
        sb.append("    music: ").append(toIndentedString(music)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingApis flashBriefing;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.CustomApis custom;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SmartHomeApis smartHome;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApis video;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.AlexaForBusinessApis alexaForBusiness;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.HealthApis health;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.HouseHoldList householdList;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.MusicApis music;

        private Builder() {}

        @JsonProperty("flashBriefing")

        public Builder withFlashBriefing(com.amazon.ask.smapi.model.v1.skill.Manifest.FlashBriefingApis flashBriefing) {
            this.flashBriefing = flashBriefing;
            return this;
        }


        @JsonProperty("custom")

        public Builder withCustom(com.amazon.ask.smapi.model.v1.skill.Manifest.CustomApis custom) {
            this.custom = custom;
            return this;
        }


        @JsonProperty("smartHome")

        public Builder withSmartHome(com.amazon.ask.smapi.model.v1.skill.Manifest.SmartHomeApis smartHome) {
            this.smartHome = smartHome;
            return this;
        }


        @JsonProperty("video")

        public Builder withVideo(com.amazon.ask.smapi.model.v1.skill.Manifest.VideoApis video) {
            this.video = video;
            return this;
        }


        @JsonProperty("alexaForBusiness")

        public Builder withAlexaForBusiness(com.amazon.ask.smapi.model.v1.skill.Manifest.AlexaForBusinessApis alexaForBusiness) {
            this.alexaForBusiness = alexaForBusiness;
            return this;
        }


        @JsonProperty("health")

        public Builder withHealth(com.amazon.ask.smapi.model.v1.skill.Manifest.HealthApis health) {
            this.health = health;
            return this;
        }


        @JsonProperty("householdList")

        public Builder withHouseholdList(com.amazon.ask.smapi.model.v1.skill.Manifest.HouseHoldList householdList) {
            this.householdList = householdList;
            return this;
        }


        @JsonProperty("music")

        public Builder withMusic(com.amazon.ask.smapi.model.v1.skill.Manifest.MusicApis music) {
            this.music = music;
            return this;
        }


        public SkillManifestApis build() {
            return new SkillManifestApis(this);
        }
    }
}

