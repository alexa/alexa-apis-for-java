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


package com.amazon.ask.smapi.model.v0.eventSchema;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Skill Review by customer event specific attributes. 
 */

@JsonDeserialize(builder = SkillReviewEventAttributes.Builder.class)
public final class SkillReviewEventAttributes {

    @JsonProperty("skill")
    private com.amazon.ask.smapi.model.v0.eventSchema.SkillAttributes skill = null;

    @JsonProperty("subscription")
    private com.amazon.ask.smapi.model.v0.eventSchema.SubscriptionAttributes subscription = null;

    @JsonProperty("review")
    private com.amazon.ask.smapi.model.v0.eventSchema.SkillReviewAttributes review = null;

    private SkillReviewEventAttributes() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillReviewEventAttributes(Builder builder) {
        if (builder.skill != null) {
            this.skill = builder.skill;
        }
        if (builder.subscription != null) {
            this.subscription = builder.subscription;
        }
        if (builder.review != null) {
            this.review = builder.review;
        }
    }

    /**
     * Get skill
     * @return skill
    **/
    @JsonProperty("skill")
    public com.amazon.ask.smapi.model.v0.eventSchema.SkillAttributes getSkill() {
        return skill;
    }


    /**
     * Get subscription
     * @return subscription
    **/
    @JsonProperty("subscription")
    public com.amazon.ask.smapi.model.v0.eventSchema.SubscriptionAttributes getSubscription() {
        return subscription;
    }


    /**
     * Get review
     * @return review
    **/
    @JsonProperty("review")
    public com.amazon.ask.smapi.model.v0.eventSchema.SkillReviewAttributes getReview() {
        return review;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillReviewEventAttributes v0EventSchemaSkillReviewEventAttributes = (SkillReviewEventAttributes) o;
        return Objects.equals(this.skill, v0EventSchemaSkillReviewEventAttributes.skill) &&
            Objects.equals(this.subscription, v0EventSchemaSkillReviewEventAttributes.subscription) &&
            Objects.equals(this.review, v0EventSchemaSkillReviewEventAttributes.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skill, subscription, review);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillReviewEventAttributes {\n");
        
        sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
        sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
        sb.append("    review: ").append(toIndentedString(review)).append("\n");
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
        private com.amazon.ask.smapi.model.v0.eventSchema.SkillAttributes skill;
        private com.amazon.ask.smapi.model.v0.eventSchema.SubscriptionAttributes subscription;
        private com.amazon.ask.smapi.model.v0.eventSchema.SkillReviewAttributes review;

        private Builder() {}

        @JsonProperty("skill")

        public Builder withSkill(com.amazon.ask.smapi.model.v0.eventSchema.SkillAttributes skill) {
            this.skill = skill;
            return this;
        }


        @JsonProperty("subscription")

        public Builder withSubscription(com.amazon.ask.smapi.model.v0.eventSchema.SubscriptionAttributes subscription) {
            this.subscription = subscription;
            return this;
        }


        @JsonProperty("review")

        public Builder withReview(com.amazon.ask.smapi.model.v0.eventSchema.SkillReviewAttributes review) {
            this.review = review;
            return this;
        }


        public SkillReviewEventAttributes build() {
            return new SkillReviewEventAttributes(this);
        }
    }
}

