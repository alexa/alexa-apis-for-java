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


package com.amazon.ask.model.services.monetization;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata
 */

@JsonDeserialize(builder = Metadata.Builder.class)
public final class Metadata {

    @JsonProperty("resultSet")
    private com.amazon.ask.model.services.monetization.ResultSet resultSet = null;

    private Metadata() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Metadata(Builder builder) {
        if (builder.resultSet != null) {
            this.resultSet = builder.resultSet;
        }
    }

    /**
     * Get resultSet
     * @return resultSet
    **/
    @JsonProperty("resultSet")
    public com.amazon.ask.model.services.monetization.ResultSet getResultSet() {
        return resultSet;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata servicesMonetizationMetadata = (Metadata) o;
        return Objects.equals(this.resultSet, servicesMonetizationMetadata.resultSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata {\n");
        
        sb.append("    resultSet: ").append(toIndentedString(resultSet)).append("\n");
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
        private com.amazon.ask.model.services.monetization.ResultSet resultSet;

        private Builder() {}

        @JsonProperty("resultSet")

        public Builder withResultSet(com.amazon.ask.model.services.monetization.ResultSet resultSet) {
            this.resultSet = resultSet;
            return this;
        }


        public Metadata build() {
            return new Metadata(this);
        }
    }
}

