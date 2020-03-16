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
 * Whether the native Timer GUI is shown for 8-seconds upon Timer Creation.
 */

@JsonDeserialize(builder = CreationBehavior.Builder.class)
public final class CreationBehavior {

    @JsonProperty("displayExperience")
    private com.amazon.ask.model.services.timerManagement.DisplayExperience displayExperience = null;

    public static Builder builder() {
        return new Builder();
    }

    private CreationBehavior(Builder builder) {
        if (builder.displayExperience != null) {
            this.displayExperience = builder.displayExperience;
        }
    }

    /**
     * Get displayExperience
     * @return displayExperience
    **/
    @JsonProperty("displayExperience")
    public com.amazon.ask.model.services.timerManagement.DisplayExperience getDisplayExperience() {
        return displayExperience;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreationBehavior servicesTimerManagementCreationBehavior = (CreationBehavior) o;
        return Objects.equals(this.displayExperience, servicesTimerManagementCreationBehavior.displayExperience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayExperience);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreationBehavior {\n");
        
        sb.append("    displayExperience: ").append(toIndentedString(displayExperience)).append("\n");
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
        private com.amazon.ask.model.services.timerManagement.DisplayExperience displayExperience;

        private Builder() {}

        @JsonProperty("displayExperience")

        public Builder withDisplayExperience(com.amazon.ask.model.services.timerManagement.DisplayExperience displayExperience) {
            this.displayExperience = displayExperience;
            return this;
        }


        public CreationBehavior build() {
            return new CreationBehavior(this);
        }
    }
}

