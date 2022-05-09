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


package com.amazon.ask.smapi.model.v1.skill.publication;

import java.util.Objects;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SkillPublicationResponse
 */

@JsonDeserialize(builder = SkillPublicationResponse.Builder.class)
public final class SkillPublicationResponse {

    @JsonProperty("publishesAtDate")
    private OffsetDateTime publishesAtDate = null;

    @JsonProperty("status")
    private String status = null;

    public static Builder builder() {
        return new Builder();
    }

    private SkillPublicationResponse(Builder builder) {
        if (builder.publishesAtDate != null) {
            this.publishesAtDate = builder.publishesAtDate;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
    }

    /**
     * Used to determine when the skill Publishing should start.
     * @return publishesAtDate
    **/
    @JsonProperty("publishesAtDate")
    public OffsetDateTime getPublishesAtDate() {
        return publishesAtDate;
    }


    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationStatus getStatus() {
        return com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationStatus.fromValue(status);
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillPublicationResponse v1SkillPublicationSkillPublicationResponse = (SkillPublicationResponse) o;
        return Objects.equals(this.publishesAtDate, v1SkillPublicationSkillPublicationResponse.publishesAtDate) &&
            Objects.equals(this.status, v1SkillPublicationSkillPublicationResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishesAtDate, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillPublicationResponse {\n");
        
        sb.append("    publishesAtDate: ").append(toIndentedString(publishesAtDate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        private OffsetDateTime publishesAtDate;
        private String status;

        private Builder() {}

        @JsonProperty("publishesAtDate")

        public Builder withPublishesAtDate(OffsetDateTime publishesAtDate) {
            this.publishesAtDate = publishesAtDate;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v1.skill.publication.SkillPublicationStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        public SkillPublicationResponse build() {
            return new SkillPublicationResponse(this);
        }
    }
}

