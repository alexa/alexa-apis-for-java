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
 * Defines the structure for an in-skill product.
 */

@JsonDeserialize(builder = InSkillProductDefinition.Builder.class)
public final class InSkillProductDefinition {

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("type")
    private com.amazon.ask.smapi.model.v1.isp.ProductType type = null;

    @JsonProperty("referenceName")
    private String referenceName = null;

    @JsonProperty("purchasableState")
    private com.amazon.ask.smapi.model.v1.isp.PurchasableState purchasableState = null;

    @JsonProperty("subscriptionInformation")
    private com.amazon.ask.smapi.model.v1.isp.SubscriptionInformation subscriptionInformation = null;

    @JsonProperty("publishingInformation")
    private com.amazon.ask.smapi.model.v1.isp.PublishingInformation publishingInformation = null;

    @JsonProperty("privacyAndCompliance")
    private com.amazon.ask.smapi.model.v1.isp.PrivacyAndCompliance privacyAndCompliance = null;

    @JsonProperty("testingInstructions")
    private String testingInstructions = null;

    public static Builder builder() {
        return new Builder();
    }

    private InSkillProductDefinition(Builder builder) {
        if (builder.version != null) {
            this.version = builder.version;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.referenceName != null) {
            this.referenceName = builder.referenceName;
        }
        if (builder.purchasableState != null) {
            this.purchasableState = builder.purchasableState;
        }
        if (builder.subscriptionInformation != null) {
            this.subscriptionInformation = builder.subscriptionInformation;
        }
        if (builder.publishingInformation != null) {
            this.publishingInformation = builder.publishingInformation;
        }
        if (builder.privacyAndCompliance != null) {
            this.privacyAndCompliance = builder.privacyAndCompliance;
        }
        if (builder.testingInstructions != null) {
            this.testingInstructions = builder.testingInstructions;
        }
    }

    /**
     * Version of in-skill product definition.
     * @return version
    **/
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Get type
     * @return type
    **/
    @JsonProperty("type")
    public com.amazon.ask.smapi.model.v1.isp.ProductType getType() {
        return type;
    }

    /**
     * Developer selected in-skill product name. This is for developer reference only, it can be used to filter query results to identify a matching in-skill product.
     * @return referenceName
    **/
    @JsonProperty("referenceName")
    public String getReferenceName() {
        return referenceName;
    }

    /**
     * Get purchasableState
     * @return purchasableState
    **/
    @JsonProperty("purchasableState")
    public com.amazon.ask.smapi.model.v1.isp.PurchasableState getPurchasableState() {
        return purchasableState;
    }

    /**
     * Get subscriptionInformation
     * @return subscriptionInformation
    **/
    @JsonProperty("subscriptionInformation")
    public com.amazon.ask.smapi.model.v1.isp.SubscriptionInformation getSubscriptionInformation() {
        return subscriptionInformation;
    }

    /**
     * Get publishingInformation
     * @return publishingInformation
    **/
    @JsonProperty("publishingInformation")
    public com.amazon.ask.smapi.model.v1.isp.PublishingInformation getPublishingInformation() {
        return publishingInformation;
    }

    /**
     * Get privacyAndCompliance
     * @return privacyAndCompliance
    **/
    @JsonProperty("privacyAndCompliance")
    public com.amazon.ask.smapi.model.v1.isp.PrivacyAndCompliance getPrivacyAndCompliance() {
        return privacyAndCompliance;
    }

    /**
     * Special instructions provided by the developer to test the in-skill product.
     * @return testingInstructions
    **/
    @JsonProperty("testingInstructions")
    public String getTestingInstructions() {
        return testingInstructions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InSkillProductDefinition v1IspInSkillProductDefinition = (InSkillProductDefinition) o;
        return Objects.equals(this.version, v1IspInSkillProductDefinition.version) &&
            Objects.equals(this.type, v1IspInSkillProductDefinition.type) &&
            Objects.equals(this.referenceName, v1IspInSkillProductDefinition.referenceName) &&
            Objects.equals(this.purchasableState, v1IspInSkillProductDefinition.purchasableState) &&
            Objects.equals(this.subscriptionInformation, v1IspInSkillProductDefinition.subscriptionInformation) &&
            Objects.equals(this.publishingInformation, v1IspInSkillProductDefinition.publishingInformation) &&
            Objects.equals(this.privacyAndCompliance, v1IspInSkillProductDefinition.privacyAndCompliance) &&
            Objects.equals(this.testingInstructions, v1IspInSkillProductDefinition.testingInstructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, type, referenceName, purchasableState, subscriptionInformation, publishingInformation, privacyAndCompliance, testingInstructions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InSkillProductDefinition {\n");
        
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    referenceName: ").append(toIndentedString(referenceName)).append("\n");
        sb.append("    purchasableState: ").append(toIndentedString(purchasableState)).append("\n");
        sb.append("    subscriptionInformation: ").append(toIndentedString(subscriptionInformation)).append("\n");
        sb.append("    publishingInformation: ").append(toIndentedString(publishingInformation)).append("\n");
        sb.append("    privacyAndCompliance: ").append(toIndentedString(privacyAndCompliance)).append("\n");
        sb.append("    testingInstructions: ").append(toIndentedString(testingInstructions)).append("\n");
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
        private String version;
        private com.amazon.ask.smapi.model.v1.isp.ProductType type;
        private String referenceName;
        private com.amazon.ask.smapi.model.v1.isp.PurchasableState purchasableState;
        private com.amazon.ask.smapi.model.v1.isp.SubscriptionInformation subscriptionInformation;
        private com.amazon.ask.smapi.model.v1.isp.PublishingInformation publishingInformation;
        private com.amazon.ask.smapi.model.v1.isp.PrivacyAndCompliance privacyAndCompliance;
        private String testingInstructions;

        private Builder() {}

        @JsonProperty("version")
        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }


        @JsonProperty("type")
        public Builder withType(com.amazon.ask.smapi.model.v1.isp.ProductType type) {
            this.type = type;
            return this;
        }


        @JsonProperty("referenceName")
        public Builder withReferenceName(String referenceName) {
            this.referenceName = referenceName;
            return this;
        }


        @JsonProperty("purchasableState")
        public Builder withPurchasableState(com.amazon.ask.smapi.model.v1.isp.PurchasableState purchasableState) {
            this.purchasableState = purchasableState;
            return this;
        }


        @JsonProperty("subscriptionInformation")
        public Builder withSubscriptionInformation(com.amazon.ask.smapi.model.v1.isp.SubscriptionInformation subscriptionInformation) {
            this.subscriptionInformation = subscriptionInformation;
            return this;
        }


        @JsonProperty("publishingInformation")
        public Builder withPublishingInformation(com.amazon.ask.smapi.model.v1.isp.PublishingInformation publishingInformation) {
            this.publishingInformation = publishingInformation;
            return this;
        }


        @JsonProperty("privacyAndCompliance")
        public Builder withPrivacyAndCompliance(com.amazon.ask.smapi.model.v1.isp.PrivacyAndCompliance privacyAndCompliance) {
            this.privacyAndCompliance = privacyAndCompliance;
            return this;
        }


        @JsonProperty("testingInstructions")
        public Builder withTestingInstructions(String testingInstructions) {
            this.testingInstructions = testingInstructions;
            return this;
        }


        public InSkillProductDefinition build() {
            return new InSkillProductDefinition(this);
        }
    }
}

