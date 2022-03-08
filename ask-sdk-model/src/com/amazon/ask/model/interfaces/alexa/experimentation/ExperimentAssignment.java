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


package com.amazon.ask.model.interfaces.alexa.experimentation;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the state of an active experiment&#39;s assignment
 */

@JsonDeserialize(builder = ExperimentAssignment.Builder.class)
public final class ExperimentAssignment {

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("treatmentId")
    private String treatmentId = null;

    public static Builder builder() {
        return new Builder();
    }

    private ExperimentAssignment(Builder builder) {
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.treatmentId != null) {
            this.treatmentId = builder.treatmentId;
        }
    }

    /**
     * Get id
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    /**
     * Get treatmentId
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTreatmentIdAsString().
     *
     * @return treatmentId
    **/
    
    public com.amazon.ask.model.interfaces.alexa.experimentation.TreatmentId getTreatmentId() {
        return com.amazon.ask.model.interfaces.alexa.experimentation.TreatmentId.fromValue(treatmentId);
    }

    /**
     * Get the underlying String value for treatmentId.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return treatmentId as a String value
    **/
    @JsonProperty("treatmentId")
    public String getTreatmentIdAsString() {
      return treatmentId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExperimentAssignment interfacesAlexaExperimentationExperimentAssignment = (ExperimentAssignment) o;
        return Objects.equals(this.id, interfacesAlexaExperimentationExperimentAssignment.id) &&
            Objects.equals(this.treatmentId, interfacesAlexaExperimentationExperimentAssignment.treatmentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, treatmentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExperimentAssignment {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    treatmentId: ").append(toIndentedString(treatmentId)).append("\n");
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
        private String id;
        private String treatmentId;

        private Builder() {}

        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("treatmentId")
        public Builder withTreatmentId(String treatmentId) {
          this.treatmentId = treatmentId;
          return this;
        }

        public Builder withTreatmentId(com.amazon.ask.model.interfaces.alexa.experimentation.TreatmentId treatmentId) {
            this.treatmentId = treatmentId != null ? treatmentId.toString() : null;
            return this;
        }


        public ExperimentAssignment build() {
            return new ExperimentAssignment(this);
        }
    }
}

