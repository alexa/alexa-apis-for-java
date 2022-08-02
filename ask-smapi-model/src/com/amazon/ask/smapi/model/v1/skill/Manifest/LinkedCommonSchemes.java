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
 * Allow developer to declare their skill to link to the speicified common schemes
 */

@JsonDeserialize(builder = LinkedCommonSchemes.Builder.class)
public final class LinkedCommonSchemes {

    @JsonProperty("IOS_APP_STORE")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.IOSAppStoreCommonSchemeName> IOS_APP_STORE = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.IOSAppStoreCommonSchemeName>();

    @JsonProperty("GOOGLE_PLAY_STORE")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.PlayStoreCommonSchemeName> GOOGLE_PLAY_STORE = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.PlayStoreCommonSchemeName>();

    private LinkedCommonSchemes() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private LinkedCommonSchemes(Builder builder) {
        if (builder.IOS_APP_STORE != null) {
            this.IOS_APP_STORE = builder.IOS_APP_STORE;
        }
        if (builder.GOOGLE_PLAY_STORE != null) {
            this.GOOGLE_PLAY_STORE = builder.GOOGLE_PLAY_STORE;
        }
    }

    /**
     * Get IOS_APP_STORE
     * @return IOS_APP_STORE
    **/
    @JsonProperty("IOS_APP_STORE")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.IOSAppStoreCommonSchemeName> getIOSAPPSTORE() {
        return IOS_APP_STORE;
    }


    /**
     * Get GOOGLE_PLAY_STORE
     * @return GOOGLE_PLAY_STORE
    **/
    @JsonProperty("GOOGLE_PLAY_STORE")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.PlayStoreCommonSchemeName> getGOOGLEPLAYSTORE() {
        return GOOGLE_PLAY_STORE;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LinkedCommonSchemes v1SkillManifestLinkedCommonSchemes = (LinkedCommonSchemes) o;
        return Objects.equals(this.IOS_APP_STORE, v1SkillManifestLinkedCommonSchemes.IOS_APP_STORE) &&
            Objects.equals(this.GOOGLE_PLAY_STORE, v1SkillManifestLinkedCommonSchemes.GOOGLE_PLAY_STORE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IOS_APP_STORE, GOOGLE_PLAY_STORE);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkedCommonSchemes {\n");
        
        sb.append("    IOS_APP_STORE: ").append(toIndentedString(IOS_APP_STORE)).append("\n");
        sb.append("    GOOGLE_PLAY_STORE: ").append(toIndentedString(GOOGLE_PLAY_STORE)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.IOSAppStoreCommonSchemeName> IOS_APP_STORE;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.PlayStoreCommonSchemeName> GOOGLE_PLAY_STORE;

        private Builder() {}

        @JsonProperty("IOS_APP_STORE")

        public Builder withIOSAPPSTORE(List<com.amazon.ask.smapi.model.v1.skill.Manifest.IOSAppStoreCommonSchemeName> IOS_APP_STORE) {
            this.IOS_APP_STORE = IOS_APP_STORE;
            return this;
        }

        public Builder addIOSAPPSTOREItem(com.amazon.ask.smapi.model.v1.skill.Manifest.IOSAppStoreCommonSchemeName IOS_APP_STOREItem) {
            if (this.IOS_APP_STORE == null) {
                this.IOS_APP_STORE = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.IOSAppStoreCommonSchemeName>();
            }
            this.IOS_APP_STORE.add(IOS_APP_STOREItem);
            return this;
        }

        @JsonProperty("GOOGLE_PLAY_STORE")

        public Builder withGOOGLEPLAYSTORE(List<com.amazon.ask.smapi.model.v1.skill.Manifest.PlayStoreCommonSchemeName> GOOGLE_PLAY_STORE) {
            this.GOOGLE_PLAY_STORE = GOOGLE_PLAY_STORE;
            return this;
        }

        public Builder addGOOGLEPLAYSTOREItem(com.amazon.ask.smapi.model.v1.skill.Manifest.PlayStoreCommonSchemeName GOOGLE_PLAY_STOREItem) {
            if (this.GOOGLE_PLAY_STORE == null) {
                this.GOOGLE_PLAY_STORE = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.PlayStoreCommonSchemeName>();
            }
            this.GOOGLE_PLAY_STORE.add(GOOGLE_PLAY_STOREItem);
            return this;
        }

        public LinkedCommonSchemes build() {
            return new LinkedCommonSchemes(this);
        }
    }
}

