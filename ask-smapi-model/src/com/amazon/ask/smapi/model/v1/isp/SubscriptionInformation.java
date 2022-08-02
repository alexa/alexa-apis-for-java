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
 * Defines the structure for in-skill product subscription information.
 */

@JsonDeserialize(builder = SubscriptionInformation.Builder.class)
public final class SubscriptionInformation {

    @JsonProperty("subscriptionPaymentFrequency")
    private String subscriptionPaymentFrequency = null;

    @JsonProperty("subscriptionTrialPeriodDays")
    private Integer subscriptionTrialPeriodDays = null;

    private SubscriptionInformation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SubscriptionInformation(Builder builder) {
        if (builder.subscriptionPaymentFrequency != null) {
            this.subscriptionPaymentFrequency = builder.subscriptionPaymentFrequency;
        }
        if (builder.subscriptionTrialPeriodDays != null) {
            this.subscriptionTrialPeriodDays = builder.subscriptionTrialPeriodDays;
        }
    }

    /**
     * Get subscriptionPaymentFrequency
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getSubscriptionPaymentFrequencyAsString().
     *
     * @return subscriptionPaymentFrequency
    **/
    
    public com.amazon.ask.smapi.model.v1.isp.SubscriptionPaymentFrequency getSubscriptionPaymentFrequency() {
        return com.amazon.ask.smapi.model.v1.isp.SubscriptionPaymentFrequency.fromValue(subscriptionPaymentFrequency);
    }

    /**
     * Get the underlying String value for subscriptionPaymentFrequency.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return subscriptionPaymentFrequency as a String value
    **/
    @JsonProperty("subscriptionPaymentFrequency")
    public String getSubscriptionPaymentFrequencyAsString() {
      return subscriptionPaymentFrequency;
    }

    /**
     * Days of free trial period for subscription. Max allowed is 365 days.
     * @return subscriptionTrialPeriodDays
    **/
    @JsonProperty("subscriptionTrialPeriodDays")
    public Integer getSubscriptionTrialPeriodDays() {
        return subscriptionTrialPeriodDays;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubscriptionInformation v1IspSubscriptionInformation = (SubscriptionInformation) o;
        return Objects.equals(this.subscriptionPaymentFrequency, v1IspSubscriptionInformation.subscriptionPaymentFrequency) &&
            Objects.equals(this.subscriptionTrialPeriodDays, v1IspSubscriptionInformation.subscriptionTrialPeriodDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionPaymentFrequency, subscriptionTrialPeriodDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionInformation {\n");
        
        sb.append("    subscriptionPaymentFrequency: ").append(toIndentedString(subscriptionPaymentFrequency)).append("\n");
        sb.append("    subscriptionTrialPeriodDays: ").append(toIndentedString(subscriptionTrialPeriodDays)).append("\n");
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
        private String subscriptionPaymentFrequency;
        private Integer subscriptionTrialPeriodDays;

        private Builder() {}

        @JsonProperty("subscriptionPaymentFrequency")

        public Builder withSubscriptionPaymentFrequency(String subscriptionPaymentFrequency) {
          this.subscriptionPaymentFrequency = subscriptionPaymentFrequency;
          return this;
        }

        public Builder withSubscriptionPaymentFrequency(com.amazon.ask.smapi.model.v1.isp.SubscriptionPaymentFrequency subscriptionPaymentFrequency) {
            this.subscriptionPaymentFrequency = subscriptionPaymentFrequency != null ? subscriptionPaymentFrequency.toString() : null;
            return this;
        }


        @JsonProperty("subscriptionTrialPeriodDays")

        public Builder withSubscriptionTrialPeriodDays(Integer subscriptionTrialPeriodDays) {
            this.subscriptionTrialPeriodDays = subscriptionTrialPeriodDays;
            return this;
        }


        public SubscriptionInformation build() {
            return new SubscriptionInformation(this);
        }
    }
}

