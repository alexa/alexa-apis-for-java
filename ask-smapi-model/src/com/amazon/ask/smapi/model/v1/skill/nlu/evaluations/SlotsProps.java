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


package com.amazon.ask.smapi.model.v1.skill.nlu.evaluations;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SlotsProps
 */

@JsonDeserialize(builder = SlotsProps.Builder.class)
public final class SlotsProps {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("value")
    private String value = null;

    @JsonProperty("confirmationStatus")
    private String confirmationStatus = null;

    @JsonProperty("resolutions")
    private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Resolutions resolutions = null;

    private SlotsProps() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SlotsProps(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
        if (builder.confirmationStatus != null) {
            this.confirmationStatus = builder.confirmationStatus;
        }
        if (builder.resolutions != null) {
            this.resolutions = builder.resolutions;
        }
    }

    /**
     * Get name
     * @return name
    **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }


    /**
     * Get value
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }


    /**
     * Get confirmationStatus
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getConfirmationStatusAsString().
     *
     * @return confirmationStatus
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ConfirmationStatus getConfirmationStatus() {
        return com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ConfirmationStatus.fromValue(confirmationStatus);
    }

    /**
     * Get the underlying String value for confirmationStatus.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return confirmationStatus as a String value
    **/
    @JsonProperty("confirmationStatus")
    public String getConfirmationStatusAsString() {
      return confirmationStatus;
    }

    /**
     * Get resolutions
     * @return resolutions
    **/
    @JsonProperty("resolutions")
    public com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Resolutions getResolutions() {
        return resolutions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SlotsProps v1SkillNluEvaluationsSlotsProps = (SlotsProps) o;
        return Objects.equals(this.name, v1SkillNluEvaluationsSlotsProps.name) &&
            Objects.equals(this.value, v1SkillNluEvaluationsSlotsProps.value) &&
            Objects.equals(this.confirmationStatus, v1SkillNluEvaluationsSlotsProps.confirmationStatus) &&
            Objects.equals(this.resolutions, v1SkillNluEvaluationsSlotsProps.resolutions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, confirmationStatus, resolutions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotsProps {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    confirmationStatus: ").append(toIndentedString(confirmationStatus)).append("\n");
        sb.append("    resolutions: ").append(toIndentedString(resolutions)).append("\n");
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
        private String name;
        private String value;
        private String confirmationStatus;
        private com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Resolutions resolutions;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        @JsonProperty("value")

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        @JsonProperty("confirmationStatus")

        public Builder withConfirmationStatus(String confirmationStatus) {
          this.confirmationStatus = confirmationStatus;
          return this;
        }

        public Builder withConfirmationStatus(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.ConfirmationStatus confirmationStatus) {
            this.confirmationStatus = confirmationStatus != null ? confirmationStatus.toString() : null;
            return this;
        }


        @JsonProperty("resolutions")

        public Builder withResolutions(com.amazon.ask.smapi.model.v1.skill.nlu.evaluations.Resolutions resolutions) {
            this.resolutions = resolutions;
            return this;
        }


        public SlotsProps build() {
            return new SlotsProps(this);
        }
    }
}

