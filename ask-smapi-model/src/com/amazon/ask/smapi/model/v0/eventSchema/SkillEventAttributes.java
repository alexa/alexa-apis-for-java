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
 * Skill event specific attributes. 
 */

@JsonDeserialize(builder = SkillEventAttributes.Builder.class)
public final class SkillEventAttributes {

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("actor")
    private com.amazon.ask.smapi.model.v0.eventSchema.ActorAttributes actor = null;

    @JsonProperty("skill")
    private com.amazon.ask.smapi.model.v0.eventSchema.SkillAttributes skill = null;

    @JsonProperty("subscription")
    private com.amazon.ask.smapi.model.v0.eventSchema.SubscriptionAttributes subscription = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillEventAttributes(Builder builder) {
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.actor != null) {
            this.actor = builder.actor;
        }
        if (builder.skill != null) {
            this.skill = builder.skill;
        }
        if (builder.subscription != null) {
            this.subscription = builder.subscription;
        }
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v0.eventSchema.RequestStatus getStatus() {
        return com.amazon.ask.smapi.model.v0.eventSchema.RequestStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Get actor
     * @return actor
    **/
    @JsonProperty("actor")
    public com.amazon.ask.smapi.model.v0.eventSchema.ActorAttributes getActor() {
        return actor;
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


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillEventAttributes v0EventSchemaSkillEventAttributes = (SkillEventAttributes) o;
        return Objects.equals(this.status, v0EventSchemaSkillEventAttributes.status) &&
            Objects.equals(this.actor, v0EventSchemaSkillEventAttributes.actor) &&
            Objects.equals(this.skill, v0EventSchemaSkillEventAttributes.skill) &&
            Objects.equals(this.subscription, v0EventSchemaSkillEventAttributes.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, actor, skill, subscription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillEventAttributes {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    skill: ").append(toIndentedString(skill)).append("\n");
        sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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
        private String status;
        private com.amazon.ask.smapi.model.v0.eventSchema.ActorAttributes actor;
        private com.amazon.ask.smapi.model.v0.eventSchema.SkillAttributes skill;
        private com.amazon.ask.smapi.model.v0.eventSchema.SubscriptionAttributes subscription;

        private Builder() {}

        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v0.eventSchema.RequestStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("actor")

        public Builder withActor(com.amazon.ask.smapi.model.v0.eventSchema.ActorAttributes actor) {
            this.actor = actor;
            return this;
        }


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


        public SkillEventAttributes build() {
            return new SkillEventAttributes(this);
        }
    }
}

