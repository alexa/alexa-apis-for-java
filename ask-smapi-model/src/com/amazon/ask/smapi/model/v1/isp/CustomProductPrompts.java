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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Custom prompts used for in-skill product purchasing options. Supports Speech Synthesis Markup Language (SSML), which can be used to control pronunciation, intonation, timing, and emotion.
 */

@JsonDeserialize(builder = CustomProductPrompts.Builder.class)
public final class CustomProductPrompts {

    @JsonProperty("purchasePromptDescription")
    private String purchasePromptDescription = null;

    @JsonProperty("boughtConfirmationPrompt")
    private String boughtConfirmationPrompt = null;

    public static Builder builder() {
        return new Builder();
    }

    private CustomProductPrompts(Builder builder) {
        if (builder.purchasePromptDescription != null) {
            this.purchasePromptDescription = builder.purchasePromptDescription;
        }
        if (builder.boughtConfirmationPrompt != null) {
            this.boughtConfirmationPrompt = builder.boughtConfirmationPrompt;
        }
    }

    /**
     * Description of in-skill product heard before customer is prompted for purchase.
     * @return purchasePromptDescription
    **/
    @JsonProperty("purchasePromptDescription")
    public String getPurchasePromptDescription() {
        return purchasePromptDescription;
    }

    /**
     * Confirmation of in-skill product purchase.
     * @return boughtConfirmationPrompt
    **/
    @JsonProperty("boughtConfirmationPrompt")
    public String getBoughtConfirmationPrompt() {
        return boughtConfirmationPrompt;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomProductPrompts v1IspCustomProductPrompts = (CustomProductPrompts) o;
        return Objects.equals(this.purchasePromptDescription, v1IspCustomProductPrompts.purchasePromptDescription) &&
            Objects.equals(this.boughtConfirmationPrompt, v1IspCustomProductPrompts.boughtConfirmationPrompt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchasePromptDescription, boughtConfirmationPrompt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomProductPrompts {\n");
        
        sb.append("    purchasePromptDescription: ").append(toIndentedString(purchasePromptDescription)).append("\n");
        sb.append("    boughtConfirmationPrompt: ").append(toIndentedString(boughtConfirmationPrompt)).append("\n");
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
        private String boughtConfirmationPrompt;

        private Builder() {}

        @JsonProperty("purchasePromptDescription")
        public Builder withPurchasePromptDescription(String purchasePromptDescription) {
            this.purchasePromptDescription = purchasePromptDescription;
            return this;
        }


        @JsonProperty("boughtConfirmationPrompt")
        public Builder withBoughtConfirmationPrompt(String boughtConfirmationPrompt) {
            this.boughtConfirmationPrompt = boughtConfirmationPrompt;
            return this;
        }


        public CustomProductPrompts build() {
            return new CustomProductPrompts(this);
        }
    }
}

