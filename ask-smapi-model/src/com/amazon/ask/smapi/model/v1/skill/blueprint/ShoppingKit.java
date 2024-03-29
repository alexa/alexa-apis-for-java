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


package com.amazon.ask.smapi.model.v1.skill.blueprint;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the structure for Shopping Kit related information in the skill manifest.
 */

@JsonDeserialize(builder = ShoppingKit.Builder.class)
public final class ShoppingKit {

    @JsonProperty("isShoppingActionsEnabled")
    private Boolean isShoppingActionsEnabled = null;

    @JsonProperty("isAmazonAssociatesOnAlexaEnabled")
    private Boolean isAmazonAssociatesOnAlexaEnabled = null;

    private ShoppingKit() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ShoppingKit(Builder builder) {
        if (builder.isShoppingActionsEnabled != null) {
            this.isShoppingActionsEnabled = builder.isShoppingActionsEnabled;
        }
        if (builder.isAmazonAssociatesOnAlexaEnabled != null) {
            this.isAmazonAssociatesOnAlexaEnabled = builder.isAmazonAssociatesOnAlexaEnabled;
        }
    }

    /**
     * True if the skill uses Alexa Shopping Actions, false otherwise.
     * @return isShoppingActionsEnabled
    **/
    @JsonProperty("isShoppingActionsEnabled")
    public Boolean getIsShoppingActionsEnabled() {
        return isShoppingActionsEnabled;
    }


    /**
     * True if the skill uses Shopping Actions with Amazon Associates, false otherwise.
     * @return isAmazonAssociatesOnAlexaEnabled
    **/
    @JsonProperty("isAmazonAssociatesOnAlexaEnabled")
    public Boolean getIsAmazonAssociatesOnAlexaEnabled() {
        return isAmazonAssociatesOnAlexaEnabled;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShoppingKit v1SkillBlueprintShoppingKit = (ShoppingKit) o;
        return Objects.equals(this.isShoppingActionsEnabled, v1SkillBlueprintShoppingKit.isShoppingActionsEnabled) &&
            Objects.equals(this.isAmazonAssociatesOnAlexaEnabled, v1SkillBlueprintShoppingKit.isAmazonAssociatesOnAlexaEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isShoppingActionsEnabled, isAmazonAssociatesOnAlexaEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShoppingKit {\n");
        
        sb.append("    isShoppingActionsEnabled: ").append(toIndentedString(isShoppingActionsEnabled)).append("\n");
        sb.append("    isAmazonAssociatesOnAlexaEnabled: ").append(toIndentedString(isAmazonAssociatesOnAlexaEnabled)).append("\n");
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
        private Boolean isShoppingActionsEnabled;
        private Boolean isAmazonAssociatesOnAlexaEnabled;

        private Builder() {}

        @JsonProperty("isShoppingActionsEnabled")

        public Builder withIsShoppingActionsEnabled(Boolean isShoppingActionsEnabled) {
            this.isShoppingActionsEnabled = isShoppingActionsEnabled;
            return this;
        }


        @JsonProperty("isAmazonAssociatesOnAlexaEnabled")

        public Builder withIsAmazonAssociatesOnAlexaEnabled(Boolean isAmazonAssociatesOnAlexaEnabled) {
            this.isAmazonAssociatesOnAlexaEnabled = isAmazonAssociatesOnAlexaEnabled;
            return this;
        }


        public ShoppingKit build() {
            return new ShoppingKit(this);
        }
    }
}

