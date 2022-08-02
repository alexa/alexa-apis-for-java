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
 * Represents attributes of a customer review for a skill. 
 */

@JsonDeserialize(builder = SkillReviewAttributes.Builder.class)
public final class SkillReviewAttributes {

    @JsonProperty("reviewId")
    private String reviewId = null;

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("starRating")
    private String starRating = null;

    private SkillReviewAttributes() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SkillReviewAttributes(Builder builder) {
        if (builder.reviewId != null) {
            this.reviewId = builder.reviewId;
        }
        if (builder.url != null) {
            this.url = builder.url;
        }
        if (builder.starRating != null) {
            this.starRating = builder.starRating;
        }
    }

    /**
     * Unique review id associated with a customer review for a skill. 
     * @return reviewId
    **/
    @JsonProperty("reviewId")
    public String getReviewId() {
        return reviewId;
    }


    /**
     * Link to the customer review on Amazon retail website. 
     * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }


    /**
     * StarRating provided by the customer in the review. It is always a natural number from 1 to 5 (inclusive of 1 and 5). 
     * @return starRating
    **/
    @JsonProperty("starRating")
    public String getStarRating() {
        return starRating;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SkillReviewAttributes v0EventSchemaSkillReviewAttributes = (SkillReviewAttributes) o;
        return Objects.equals(this.reviewId, v0EventSchemaSkillReviewAttributes.reviewId) &&
            Objects.equals(this.url, v0EventSchemaSkillReviewAttributes.url) &&
            Objects.equals(this.starRating, v0EventSchemaSkillReviewAttributes.starRating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reviewId, url, starRating);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkillReviewAttributes {\n");
        
        sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    starRating: ").append(toIndentedString(starRating)).append("\n");
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
        private String reviewId;
        private String url;
        private String starRating;

        private Builder() {}

        @JsonProperty("reviewId")

        public Builder withReviewId(String reviewId) {
            this.reviewId = reviewId;
            return this;
        }


        @JsonProperty("url")

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }


        @JsonProperty("starRating")

        public Builder withStarRating(String starRating) {
            this.starRating = starRating;
            return this;
        }


        public SkillReviewAttributes build() {
            return new SkillReviewAttributes(this);
        }
    }
}

