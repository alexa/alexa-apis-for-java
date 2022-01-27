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
 * Treatment
 */

@JsonDeserialize(builder = Treatment.Builder.class)
public final class Treatment {

    @JsonProperty("name")
    private String name = null;

    public static Builder builder() {
        return new Builder();
    }

    private Treatment(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
    }

    /**
     * Get name
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getNameAsString().
     *
     * @return name
    **/
    
    public com.amazon.ask.model.interfaces.alexa.experimentation.TreatmentId getName() {
        return com.amazon.ask.model.interfaces.alexa.experimentation.TreatmentId.fromValue(name);
    }

    /**
     * Get the underlying String value for name.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return name as a String value
    **/
    @JsonProperty("name")
    public String getNameAsString() {
      return name;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Treatment interfacesAlexaExperimentationTreatment = (Treatment) o;
        return Objects.equals(this.name, interfacesAlexaExperimentationTreatment.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Treatment {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

        private Builder() {}

        @JsonProperty("name")
        public Builder withName(String name) {
          this.name = name;
          return this;
        }

        public Builder withName(com.amazon.ask.model.interfaces.alexa.experimentation.TreatmentId name) {
            this.name = name != null ? name.toString() : null;
            return this;
        }


        public Treatment build() {
            return new Treatment(this);
        }
    }
}

