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
 * Defines the structure for Shopping Kit related information in the skill manifest.
 */

@JsonDeserialize(builder = ShoppingKit.Builder.class)
public final class ShoppingKit {

    @JsonProperty("isShoppingActionsEnabled")
    private Boolean isShoppingActionsEnabled = null;

    public static Builder builder() {
        return new Builder();
    }

    private ShoppingKit(Builder builder) {
        if (builder.isShoppingActionsEnabled != null) {
            this.isShoppingActionsEnabled = builder.isShoppingActionsEnabled;
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShoppingKit v1SkillManifestShoppingKit = (ShoppingKit) o;
        return Objects.equals(this.isShoppingActionsEnabled, v1SkillManifestShoppingKit.isShoppingActionsEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isShoppingActionsEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShoppingKit {\n");
        
        sb.append("    isShoppingActionsEnabled: ").append(toIndentedString(isShoppingActionsEnabled)).append("\n");
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

        private Builder() {}

        @JsonProperty("isShoppingActionsEnabled")

        public Builder withIsShoppingActionsEnabled(Boolean isShoppingActionsEnabled) {
            this.isShoppingActionsEnabled = isShoppingActionsEnabled;
            return this;
        }


        public ShoppingKit build() {
            return new ShoppingKit(this);
        }
    }
}

