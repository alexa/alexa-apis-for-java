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

    @JsonProperty("boughtCardDescription")
    private String boughtCardDescription = null;

    public static Builder builder() {
        return new Builder();
    }

    private CustomProductPrompts(Builder builder) {
        if (builder.purchasePromptDescription != null) {
            this.purchasePromptDescription = builder.purchasePromptDescription;
        }
        if (builder.boughtCardDescription != null) {
            this.boughtCardDescription = builder.boughtCardDescription;
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
     * A description of the product that displays on the skill card in the Alexa app.
     * @return boughtCardDescription
    **/
    @JsonProperty("boughtCardDescription")
    public String getBoughtCardDescription() {
        return boughtCardDescription;
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
            Objects.equals(this.boughtCardDescription, v1IspCustomProductPrompts.boughtCardDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchasePromptDescription, boughtCardDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomProductPrompts {\n");
        
        sb.append("    purchasePromptDescription: ").append(toIndentedString(purchasePromptDescription)).append("\n");
        sb.append("    boughtCardDescription: ").append(toIndentedString(boughtCardDescription)).append("\n");
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
        private String boughtCardDescription;

        private Builder() {}

        @JsonProperty("purchasePromptDescription")

        public Builder withPurchasePromptDescription(String purchasePromptDescription) {
            this.purchasePromptDescription = purchasePromptDescription;
            return this;
        }


        @JsonProperty("boughtCardDescription")

        public Builder withBoughtCardDescription(String boughtCardDescription) {
            this.boughtCardDescription = boughtCardDescription;
            return this;
        }


        public CustomProductPrompts build() {
            return new CustomProductPrompts(this);
        }
    }
}

