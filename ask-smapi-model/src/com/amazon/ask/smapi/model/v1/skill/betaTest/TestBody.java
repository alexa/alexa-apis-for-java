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


package com.amazon.ask.smapi.model.v1.skill.betaTest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Beta test meta-data.
 */

@JsonDeserialize(builder = TestBody.Builder.class)
public final class TestBody {

    @JsonProperty("feedbackEmail")
    private String feedbackEmail = null;

    private TestBody() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private TestBody(Builder builder) {
        if (builder.feedbackEmail != null) {
            this.feedbackEmail = builder.feedbackEmail;
        }
    }

    /**
     * Email address for providing feedback.
     * @return feedbackEmail
    **/
    @JsonProperty("feedbackEmail")
    public String getFeedbackEmail() {
        return feedbackEmail;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestBody v1SkillBetaTestTestBody = (TestBody) o;
        return Objects.equals(this.feedbackEmail, v1SkillBetaTestTestBody.feedbackEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(feedbackEmail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestBody {\n");
        
        sb.append("    feedbackEmail: ").append(toIndentedString(feedbackEmail)).append("\n");
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
        private String feedbackEmail;

        private Builder() {}

        @JsonProperty("feedbackEmail")

        public Builder withFeedbackEmail(String feedbackEmail) {
            this.feedbackEmail = feedbackEmail;
            return this;
        }


        public TestBody build() {
            return new TestBody(this);
        }
    }
}

