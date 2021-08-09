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
 * Defines the structure for publishing information in the skill manifest.
 */

@JsonDeserialize(builder = SkillManifestPublishingInformation.Builder.class)
public final class SkillManifestPublishingInformation {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("locales")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPublishingInformation> locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPublishingInformation>();

    @JsonProperty("isAvailableWorldwide")
    private Boolean isAvailableWorldwide = null;

    @JsonProperty("distributionMode")
    private String distributionMode = null;

    @JsonProperty("gadgetSupport")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.ManifestGadgetSupport gadgetSupport = null;

    @JsonProperty("testingInstructions")
    private String testingInstructions = null;

    @JsonProperty("category")
    private String category = null;

    @JsonProperty("distributionCountries")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionCountries> distributionCountries = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionCountries>();

    @JsonProperty("automaticDistribution")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.AutomaticDistribution automaticDistribution = null;

    @JsonProperty("automaticClonedLocale")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.AutomaticClonedLocale automaticClonedLocale = null;

    @JsonProperty("paidSkillInformation")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.PaidSkillInformation paidSkillInformation = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillManifestPublishingInformation(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.description != null) {
            this.description = builder.description;
        }
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
        if (builder.isAvailableWorldwide != null) {
            this.isAvailableWorldwide = builder.isAvailableWorldwide;
        }
        if (builder.distributionMode != null) {
            this.distributionMode = builder.distributionMode;
        }
        if (builder.gadgetSupport != null) {
            this.gadgetSupport = builder.gadgetSupport;
        }
        if (builder.testingInstructions != null) {
            this.testingInstructions = builder.testingInstructions;
        }
        if (builder.category != null) {
            this.category = builder.category;
        }
        if (builder.distributionCountries != null) {
            this.distributionCountries = builder.distributionCountries;
        }
        if (builder.automaticDistribution != null) {
            this.automaticDistribution = builder.automaticDistribution;
        }
        if (builder.automaticClonedLocale != null) {
            this.automaticClonedLocale = builder.automaticClonedLocale;
        }
        if (builder.paidSkillInformation != null) {
            this.paidSkillInformation = builder.paidSkillInformation;
        }
    }

    /**
     * Name of the skill that is displayed to customers in the Alexa app.
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Description of the skill's purpose and feature and how it works. Should describe any prerequisites like hardware or account requirements and detailed steps for the customer to get started. For Flash Briefing skill list the feeds offered within the skill. Use a conversational tone and correct grammar and punctuation. This description displays to customers on the skill detail card in the Alexa app.
     * @return description
    **/
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }


    /**
     * Defines the structure for locale specific publishing information in the skill manifest.
     * @return locales
    **/
    @JsonProperty("locales")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPublishingInformation> getLocales() {
        return locales;
    }


    /**
     * True if the skill should be distributed in all countries where Amazon distributes skill false otherwise.
     * @return isAvailableWorldwide
    **/
    @JsonProperty("isAvailableWorldwide")
    public Boolean getIsAvailableWorldwide() {
        return isAvailableWorldwide;
    }


    /**
     * Get distributionMode
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getDistributionModeAsString().
     *
     * @return distributionMode
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionMode getDistributionMode() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionMode.fromValue(distributionMode);
    }

    /**
     * Get the underlying String value for distributionMode.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return distributionMode as a String value
    **/
    @JsonProperty("distributionMode")
    public String getDistributionModeAsString() {
      return distributionMode;
    }

    /**
     * Get gadgetSupport
     * @return gadgetSupport
    **/
    @JsonProperty("gadgetSupport")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.ManifestGadgetSupport getGadgetSupport() {
        return gadgetSupport;
    }


    /**
     * Special instructions provided by the developer to test the skill.
     * @return testingInstructions
    **/
    @JsonProperty("testingInstructions")
    public String getTestingInstructions() {
        return testingInstructions;
    }


    /**
     * Category that best describes a skill. Indicates the filter category for the skill in the Alexa App.
     * @return category
    **/
    @JsonProperty("category")
    public String getCategory() {
        return category;
    }


    /**
     * Selected list of countries provided by the skill owner where Amazon can distribute the skill.
     * @return distributionCountries
    **/
    @JsonProperty("distributionCountries")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionCountries> getDistributionCountries() {
        return distributionCountries;
    }


    /**
     * Get automaticDistribution
     * @return automaticDistribution
    **/
    @JsonProperty("automaticDistribution")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.AutomaticDistribution getAutomaticDistribution() {
        return automaticDistribution;
    }


    /**
     * Get automaticClonedLocale
     * @return automaticClonedLocale
    **/
    @JsonProperty("automaticClonedLocale")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.AutomaticClonedLocale getAutomaticClonedLocale() {
        return automaticClonedLocale;
    }


    /**
     * Get paidSkillInformation
     * @return paidSkillInformation
    **/
    @JsonProperty("paidSkillInformation")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.PaidSkillInformation getPaidSkillInformation() {
        return paidSkillInformation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillManifestPublishingInformation v1SkillManifestSkillManifestPublishingInformation = (SkillManifestPublishingInformation) o;
        return Objects.equals(this.name, v1SkillManifestSkillManifestPublishingInformation.name) &&
            Objects.equals(this.description, v1SkillManifestSkillManifestPublishingInformation.description) &&
            Objects.equals(this.locales, v1SkillManifestSkillManifestPublishingInformation.locales) &&
            Objects.equals(this.isAvailableWorldwide, v1SkillManifestSkillManifestPublishingInformation.isAvailableWorldwide) &&
            Objects.equals(this.distributionMode, v1SkillManifestSkillManifestPublishingInformation.distributionMode) &&
            Objects.equals(this.gadgetSupport, v1SkillManifestSkillManifestPublishingInformation.gadgetSupport) &&
            Objects.equals(this.testingInstructions, v1SkillManifestSkillManifestPublishingInformation.testingInstructions) &&
            Objects.equals(this.category, v1SkillManifestSkillManifestPublishingInformation.category) &&
            Objects.equals(this.distributionCountries, v1SkillManifestSkillManifestPublishingInformation.distributionCountries) &&
            Objects.equals(this.automaticDistribution, v1SkillManifestSkillManifestPublishingInformation.automaticDistribution) &&
            Objects.equals(this.automaticClonedLocale, v1SkillManifestSkillManifestPublishingInformation.automaticClonedLocale) &&
            Objects.equals(this.paidSkillInformation, v1SkillManifestSkillManifestPublishingInformation.paidSkillInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, locales, isAvailableWorldwide, distributionMode, gadgetSupport, testingInstructions, category, distributionCountries, automaticDistribution, automaticClonedLocale, paidSkillInformation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillManifestPublishingInformation {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    isAvailableWorldwide: ").append(toIndentedString(isAvailableWorldwide)).append("\n");
        sb.append("    distributionMode: ").append(toIndentedString(distributionMode)).append("\n");
        sb.append("    gadgetSupport: ").append(toIndentedString(gadgetSupport)).append("\n");
        sb.append("    testingInstructions: ").append(toIndentedString(testingInstructions)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    distributionCountries: ").append(toIndentedString(distributionCountries)).append("\n");
        sb.append("    automaticDistribution: ").append(toIndentedString(automaticDistribution)).append("\n");
        sb.append("    automaticClonedLocale: ").append(toIndentedString(automaticClonedLocale)).append("\n");
        sb.append("    paidSkillInformation: ").append(toIndentedString(paidSkillInformation)).append("\n");
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
        private String description;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPublishingInformation> locales;
        private Boolean isAvailableWorldwide;
        private String distributionMode;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.ManifestGadgetSupport gadgetSupport;
        private String testingInstructions;
        private String category;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionCountries> distributionCountries;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.AutomaticDistribution automaticDistribution;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.AutomaticClonedLocale automaticClonedLocale;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.PaidSkillInformation paidSkillInformation;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("description")

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }


        @JsonProperty("locales")

        public Builder withLocales(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPublishingInformation> locales) {
            this.locales = locales;
            return this;
        }

        public Builder putLocalesItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPublishingInformation localesItem) {
            if (this.locales == null) {
                this.locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestLocalizedPublishingInformation>();
            }
            this.locales.put(key, localesItem);
            return this;
        }

        @JsonProperty("isAvailableWorldwide")

        public Builder withIsAvailableWorldwide(Boolean isAvailableWorldwide) {
            this.isAvailableWorldwide = isAvailableWorldwide;
            return this;
        }


        @JsonProperty("distributionMode")
        public Builder withDistributionMode(String distributionMode) {
          this.distributionMode = distributionMode;
          return this;
        }

        public Builder withDistributionMode(com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionMode distributionMode) {
            this.distributionMode = distributionMode != null ? distributionMode.toString() : null;
            return this;
        }


        @JsonProperty("gadgetSupport")

        public Builder withGadgetSupport(com.amazon.ask.smapi.model.v1.skill.Manifest.ManifestGadgetSupport gadgetSupport) {
            this.gadgetSupport = gadgetSupport;
            return this;
        }


        @JsonProperty("testingInstructions")

        public Builder withTestingInstructions(String testingInstructions) {
            this.testingInstructions = testingInstructions;
            return this;
        }


        @JsonProperty("category")

        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }


        @JsonProperty("distributionCountries")

        public Builder withDistributionCountries(List<com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionCountries> distributionCountries) {
            this.distributionCountries = distributionCountries;
            return this;
        }

        public Builder addDistributionCountriesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionCountries distributionCountriesItem) {
            if (this.distributionCountries == null) {
                this.distributionCountries = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.DistributionCountries>();
            }
            this.distributionCountries.add(distributionCountriesItem);
            return this;
        }

        @JsonProperty("automaticDistribution")

        public Builder withAutomaticDistribution(com.amazon.ask.smapi.model.v1.skill.Manifest.AutomaticDistribution automaticDistribution) {
            this.automaticDistribution = automaticDistribution;
            return this;
        }


        @JsonProperty("automaticClonedLocale")

        public Builder withAutomaticClonedLocale(com.amazon.ask.smapi.model.v1.skill.Manifest.AutomaticClonedLocale automaticClonedLocale) {
            this.automaticClonedLocale = automaticClonedLocale;
            return this;
        }


        @JsonProperty("paidSkillInformation")

        public Builder withPaidSkillInformation(com.amazon.ask.smapi.model.v1.skill.Manifest.PaidSkillInformation paidSkillInformation) {
            this.paidSkillInformation = paidSkillInformation;
            return this;
        }


        public SkillManifestPublishingInformation build() {
            return new SkillManifestPublishingInformation(this);
        }
    }
}

