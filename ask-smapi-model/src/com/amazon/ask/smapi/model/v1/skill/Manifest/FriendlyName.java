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
 * Localized App name
 */

@JsonDeserialize(builder = FriendlyName.Builder.class)
public final class FriendlyName {

    @JsonProperty("default")
    private String _default = null;

    @JsonProperty("localizedNames")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedName> localizedNames = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedName>();

    public static Builder builder() {
        return new Builder();
    }

    private FriendlyName(Builder builder) {
        if (builder._default != null) {
            this._default = builder._default;
        }
        if (builder.localizedNames != null) {
            this.localizedNames = builder.localizedNames;
        }
    }

    /**
     * Default app name
     * @return _default
    **/
    @JsonProperty("default")
    public String getDefault() {
        return _default;
    }


    /**
     * Localized app names.
     * @return localizedNames
    **/
    @JsonProperty("localizedNames")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedName> getLocalizedNames() {
        return localizedNames;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FriendlyName v1SkillManifestFriendlyName = (FriendlyName) o;
        return Objects.equals(this._default, v1SkillManifestFriendlyName._default) &&
            Objects.equals(this.localizedNames, v1SkillManifestFriendlyName.localizedNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_default, localizedNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FriendlyName {\n");
        
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    localizedNames: ").append(toIndentedString(localizedNames)).append("\n");
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
        private String _default;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedName> localizedNames;

        private Builder() {}

        @JsonProperty("default")

        public Builder withDefault(String _default) {
            this._default = _default;
            return this;
        }


        @JsonProperty("localizedNames")

        public Builder withLocalizedNames(List<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedName> localizedNames) {
            this.localizedNames = localizedNames;
            return this;
        }

        public Builder addLocalizedNamesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedName localizedNamesItem) {
            if (this.localizedNames == null) {
                this.localizedNames = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.LocalizedName>();
            }
            this.localizedNames.add(localizedNamesItem);
            return this;
        }

        public FriendlyName build() {
            return new FriendlyName(this);
        }
    }
}

