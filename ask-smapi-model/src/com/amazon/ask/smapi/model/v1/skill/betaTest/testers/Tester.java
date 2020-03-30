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


package com.amazon.ask.smapi.model.v1.skill.betaTest.testers;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tester
 */

@JsonDeserialize(builder = Tester.Builder.class)
public final class Tester {

    @JsonProperty("emailId")
    private String emailId = null;

    public static Builder builder() {
        return new Builder();
    }

    private Tester(Builder builder) {
        if (builder.emailId != null) {
            this.emailId = builder.emailId;
        }
    }

    /**
     * Email address of the tester.
     * @return emailId
    **/
    @JsonProperty("emailId")
    public String getEmailId() {
        return emailId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tester v1SkillBetaTestTestersTester = (Tester) o;
        return Objects.equals(this.emailId, v1SkillBetaTestTestersTester.emailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tester {\n");
        
        sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
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
        private String emailId;

        private Builder() {}

        @JsonProperty("emailId")

        public Builder withEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }


        public Tester build() {
            return new Tester(this);
        }
    }
}

