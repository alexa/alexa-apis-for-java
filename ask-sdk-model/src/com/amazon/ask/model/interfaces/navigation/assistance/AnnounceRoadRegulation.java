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


package com.amazon.ask.model.interfaces.navigation.assistance;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * New directive that Alexa will send to navigation engine to query road regulations about the road segments that the user is on.
 */

@JsonDeserialize(builder = AnnounceRoadRegulation.Builder.class)
public final class AnnounceRoadRegulation extends com.amazon.ask.model.Directive  {

    private AnnounceRoadRegulation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AnnounceRoadRegulation(Builder builder) {
        String discriminatorValue = "Navigation.Assistance.AnnounceRoadRegulation";

        this.type = discriminatorValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnnounceRoadRegulation {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

        private Builder() {}

        public AnnounceRoadRegulation build() {
            return new AnnounceRoadRegulation(this);
        }
    }
}

