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


package com.amazon.ask.model.interfaces.systemUnit;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that represents a logical entity for organizing actors and resources that interact with Alexa systems.
 */

@JsonDeserialize(builder = Unit.Builder.class)
public final class Unit {

    @JsonProperty("unitId")
    private String unitId = null;

    @JsonProperty("persistentUnitId")
    private String persistentUnitId = null;

    public static Builder builder() {
        return new Builder();
    }

    private Unit(Builder builder) {
        if (builder.unitId != null) {
            this.unitId = builder.unitId;
        }
        if (builder.persistentUnitId != null) {
            this.persistentUnitId = builder.persistentUnitId;
        }
    }

    /**
     * A string that represents unitId directed at skill level. Each skill gets a different directed identifier for same internal identifier. This is Skill enablement scoped identifier. This should be in format - amzn1.ask.unit.&amp;lt;skillDirectedId&amp;gt;
     * @return unitId
    **/
    @JsonProperty("unitId")
    public String getUnitId() {
        return unitId;
    }


    /**
     * A string that represents a unitId directed using directedIdConfuser associated with the respective Organization's developer account. This identifier is directed at an Organization level. Same identifier is shared across Organization's backend systems (which invokes API), Skills owned by the organization and authorized 3P skills. This should be in format - amzn1.alexa.unit.did.&amp;lt;LWAConfuserDirectedId&amp;gt;
     * @return persistentUnitId
    **/
    @JsonProperty("persistentUnitId")
    public String getPersistentUnitId() {
        return persistentUnitId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Unit interfacesSystemUnitUnit = (Unit) o;
        return Objects.equals(this.unitId, interfacesSystemUnitUnit.unitId) &&
            Objects.equals(this.persistentUnitId, interfacesSystemUnitUnit.persistentUnitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitId, persistentUnitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Unit {\n");
        
        sb.append("    unitId: ").append(toIndentedString(unitId)).append("\n");
        sb.append("    persistentUnitId: ").append(toIndentedString(persistentUnitId)).append("\n");
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
        private String unitId;
        private String persistentUnitId;

        private Builder() {}

        @JsonProperty("unitId")

        public Builder withUnitId(String unitId) {
            this.unitId = unitId;
            return this;
        }


        @JsonProperty("persistentUnitId")

        public Builder withPersistentUnitId(String persistentUnitId) {
            this.persistentUnitId = persistentUnitId;
            return this;
        }


        public Unit build() {
            return new Unit(this);
        }
    }
}

