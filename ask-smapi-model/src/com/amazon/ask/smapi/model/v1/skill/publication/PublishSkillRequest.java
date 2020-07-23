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
 * PublishSkillRequest
 */

@JsonDeserialize(builder = PublishSkillRequest.Builder.class)
public final class PublishSkillRequest {

    @JsonProperty("publishesAtDate")
    private OffsetDateTime publishesAtDate = null;

    public static Builder builder() {
        return new Builder();
    }

    private PublishSkillRequest(Builder builder) {
        if (builder.publishesAtDate != null) {
            this.publishesAtDate = builder.publishesAtDate;
        }
    }

    /**
     * Used to determine when the skill Publishing should start. It takes the request timestamp as default value. The date range can be a maximum of upto 6 months from the current time stamp. The format should be the  RFC 3399 variant of ISO 8601. e.g 2019-04-12T23:20:50.52Z
     * @return publishesAtDate
    **/
    @JsonProperty("publishesAtDate")
    public OffsetDateTime getPublishesAtDate() {
        return publishesAtDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublishSkillRequest v1SkillPublicationPublishSkillRequest = (PublishSkillRequest) o;
        return Objects.equals(this.publishesAtDate, v1SkillPublicationPublishSkillRequest.publishesAtDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishesAtDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishSkillRequest {\n");
        
        sb.append("    publishesAtDate: ").append(toIndentedString(publishesAtDate)).append("\n");
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

        private Builder() {}

        @JsonProperty("publishesAtDate")

        public Builder withPublishesAtDate(OffsetDateTime publishesAtDate) {
            this.publishesAtDate = publishesAtDate;
            return this;
        }


        public PublishSkillRequest build() {
            return new PublishSkillRequest(this);
        }
    }
}

