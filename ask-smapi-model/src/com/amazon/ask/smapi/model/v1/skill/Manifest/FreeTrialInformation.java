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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the structure for paid skill product free trial information.
 */

@JsonDeserialize(builder = FreeTrialInformation.Builder.class)
public final class FreeTrialInformation {

    @JsonProperty("freeTrialDuration")
    private String freeTrialDuration = null;

    private FreeTrialInformation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private FreeTrialInformation(Builder builder) {
        if (builder.freeTrialDuration != null) {
            this.freeTrialDuration = builder.freeTrialDuration;
        }
    }

    /**
     * Defines the free trial period for the paid skill product, in ISO_8601#Durations format.
     * @return freeTrialDuration
    **/
    @JsonProperty("freeTrialDuration")
    public String getFreeTrialDuration() {
        return freeTrialDuration;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FreeTrialInformation v1SkillManifestFreeTrialInformation = (FreeTrialInformation) o;
        return Objects.equals(this.freeTrialDuration, v1SkillManifestFreeTrialInformation.freeTrialDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeTrialDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FreeTrialInformation {\n");
        
        sb.append("    freeTrialDuration: ").append(toIndentedString(freeTrialDuration)).append("\n");
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
        private String freeTrialDuration;

        private Builder() {}

        @JsonProperty("freeTrialDuration")

        public Builder withFreeTrialDuration(String freeTrialDuration) {
            this.freeTrialDuration = freeTrialDuration;
            return this;
        }


        public FreeTrialInformation build() {
            return new FreeTrialInformation(this);
        }
    }
}

