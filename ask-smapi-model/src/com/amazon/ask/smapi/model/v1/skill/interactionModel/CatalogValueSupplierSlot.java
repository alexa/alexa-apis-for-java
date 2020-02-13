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


package com.amazon.ask.smapi.model.v1.skill.interactionModel;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Supply slot values from catalog(s).
 */

@JsonDeserialize(builder = CatalogValueSupplierSlot.Builder.class)
public final class CatalogValueSupplierSlot extends com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplierSlot  {

    @JsonProperty("valueCatalog")
    private com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueCatalogSlot valueCatalog = null;

    public static Builder builder() {
        return new Builder();
    }

    private CatalogValueSupplierSlot(Builder builder) {
        String discriminatorValue = "CatalogValueSupplier";

        this.type = discriminatorValue;
        if (builder.valueCatalog != null) {
            this.valueCatalog = builder.valueCatalog;
        }
    }

    /**
     * Get valueCatalog
     * @return valueCatalog
    **/
    @JsonProperty("valueCatalog")
    public com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueCatalogSlot getValueCatalog() {
        return valueCatalog;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CatalogValueSupplierSlot v1SkillInteractionModelCatalogValueSupplierSlot = (CatalogValueSupplierSlot) o;
        return Objects.equals(this.valueCatalog, v1SkillInteractionModelCatalogValueSupplierSlot.valueCatalog) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valueCatalog, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogValueSupplierSlot {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    valueCatalog: ").append(toIndentedString(valueCatalog)).append("\n");
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
        private com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueCatalogSlot valueCatalog;

        private Builder() {}

        @JsonProperty("valueCatalog")
        public Builder withValueCatalog(com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueCatalogSlot valueCatalog) {
            this.valueCatalog = valueCatalog;
            return this;
        }


        public CatalogValueSupplierSlot build() {
            return new CatalogValueSupplierSlot(this);
        }
    }
}

