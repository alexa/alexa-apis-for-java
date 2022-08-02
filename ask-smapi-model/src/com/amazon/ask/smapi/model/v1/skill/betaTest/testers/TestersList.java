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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * List of testers.
 */

@JsonDeserialize(builder = TestersList.Builder.class)
public final class TestersList {

    @JsonProperty("testers")
    private List<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.Tester> testers = new ArrayList<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.Tester>();

    private TestersList() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private TestersList(Builder builder) {
        if (builder.testers != null) {
            this.testers = builder.testers;
        }
    }

    /**
     * List of the email address of testers.
     * @return testers
    **/
    @JsonProperty("testers")
    public List<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.Tester> getTesters() {
        return testers;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestersList v1SkillBetaTestTestersTestersList = (TestersList) o;
        return Objects.equals(this.testers, v1SkillBetaTestTestersTestersList.testers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestersList {\n");
        
        sb.append("    testers: ").append(toIndentedString(testers)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.Tester> testers;

        private Builder() {}

        @JsonProperty("testers")

        public Builder withTesters(List<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.Tester> testers) {
            this.testers = testers;
            return this;
        }

        public Builder addTestersItem(com.amazon.ask.smapi.model.v1.skill.betaTest.testers.Tester testersItem) {
            if (this.testers == null) {
                this.testers = new ArrayList<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.Tester>();
            }
            this.testers.add(testersItem);
            return this;
        }

        public TestersList build() {
            return new TestersList(this);
        }
    }
}

