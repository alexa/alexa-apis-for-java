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
 * Custom prompts used for paid skill product purchasing options. Supports Speech Synthesis Markup Language (SSML), which can be used to control pronunciation, intonation, timing, and emotion.
 */

@JsonDeserialize(builder = CustomProductPrompts.Builder.class)
public final class CustomProductPrompts {

    @JsonProperty("purchasePromptDescription")
    private String purchasePromptDescription = null;

    @JsonProperty("purchaseConfirmationDescription")
    private String purchaseConfirmationDescription = null;

    private CustomProductPrompts() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private CustomProductPrompts(Builder builder) {
        if (builder.purchasePromptDescription != null) {
            this.purchasePromptDescription = builder.purchasePromptDescription;
        }
        if (builder.purchaseConfirmationDescription != null) {
            this.purchaseConfirmationDescription = builder.purchaseConfirmationDescription;
        }
    }

    /**
     * Description of the paid skill product heard before customer is prompted for purchase.
     * @return purchasePromptDescription
    **/
    @JsonProperty("purchasePromptDescription")
    public String getPurchasePromptDescription() {
        return purchasePromptDescription;
    }


    /**
     * Description of the paid skill product that displays when the paid skill is purchased.
     * @return purchaseConfirmationDescription
    **/
    @JsonProperty("purchaseConfirmationDescription")
    public String getPurchaseConfirmationDescription() {
        return purchaseConfirmationDescription;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomProductPrompts v1SkillManifestCustomProductPrompts = (CustomProductPrompts) o;
        return Objects.equals(this.purchasePromptDescription, v1SkillManifestCustomProductPrompts.purchasePromptDescription) &&
            Objects.equals(this.purchaseConfirmationDescription, v1SkillManifestCustomProductPrompts.purchaseConfirmationDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchasePromptDescription, purchaseConfirmationDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomProductPrompts {\n");
        
        sb.append("    purchasePromptDescription: ").append(toIndentedString(purchasePromptDescription)).append("\n");
        sb.append("    purchaseConfirmationDescription: ").append(toIndentedString(purchaseConfirmationDescription)).append("\n");
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
        private String purchasePromptDescription;
        private String purchaseConfirmationDescription;

        private Builder() {}

        @JsonProperty("purchasePromptDescription")

        public Builder withPurchasePromptDescription(String purchasePromptDescription) {
            this.purchasePromptDescription = purchasePromptDescription;
            return this;
        }


        @JsonProperty("purchaseConfirmationDescription")

        public Builder withPurchaseConfirmationDescription(String purchaseConfirmationDescription) {
            this.purchaseConfirmationDescription = purchaseConfirmationDescription;
            return this;
        }


        public CustomProductPrompts build() {
            return new CustomProductPrompts(this);
        }
    }
}

