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


package com.amazon.ask.model.services.timerManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Multi model presentation of the timer creation.
 */

@JsonDeserialize(builder = DisplayExperience.Builder.class)
public final class DisplayExperience {

    @JsonProperty("visibility")
    private String visibility = null;

    public static Builder builder() {
        return new Builder();
    }

    private DisplayExperience(Builder builder) {
        if (builder.visibility != null) {
            this.visibility = builder.visibility;
        }
    }

    /**
     * Get visibility
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getVisibilityAsString().
     *
     * @return visibility
    **/
    
    public com.amazon.ask.model.services.timerManagement.Visibility getVisibility() {
        return com.amazon.ask.model.services.timerManagement.Visibility.fromValue(visibility);
    }

    /**
     * Get the underlying String value for visibility.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return visibility as a String value
    **/
    @JsonProperty("visibility")
    public String getVisibilityAsString() {
      return visibility;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisplayExperience servicesTimerManagementDisplayExperience = (DisplayExperience) o;
        return Objects.equals(this.visibility, servicesTimerManagementDisplayExperience.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisplayExperience {\n");
        
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
        private String visibility;

        private Builder() {}

        @JsonProperty("visibility")
        public Builder withVisibility(String visibility) {
          this.visibility = visibility;
          return this;
        }

        public Builder withVisibility(com.amazon.ask.model.services.timerManagement.Visibility visibility) {
            this.visibility = visibility != null ? visibility.toString() : null;
            return this;
        }


        public DisplayExperience build() {
            return new DisplayExperience(this);
        }
    }
}

