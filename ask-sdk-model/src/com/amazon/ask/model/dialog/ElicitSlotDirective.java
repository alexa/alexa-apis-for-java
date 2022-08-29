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


package com.amazon.ask.model.dialog;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ElicitSlotDirective
 */

@JsonDeserialize(builder = ElicitSlotDirective.Builder.class)
public final class ElicitSlotDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("updatedIntent")
    private com.amazon.ask.model.Intent updatedIntent = null;

    @JsonProperty("slotToElicit")
    private String slotToElicit = null;

    private ElicitSlotDirective() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ElicitSlotDirective(Builder builder) {
        String discriminatorValue = "Dialog.ElicitSlot";

        this.type = discriminatorValue;
        if (builder.updatedIntent != null) {
            this.updatedIntent = builder.updatedIntent;
        }
        if (builder.slotToElicit != null) {
            this.slotToElicit = builder.slotToElicit;
        }
    }

    /**
     * Get updatedIntent
     * @return updatedIntent
    **/
    @JsonProperty("updatedIntent")
    public com.amazon.ask.model.Intent getUpdatedIntent() {
        return updatedIntent;
    }


    /**
     * Get slotToElicit
     * @return slotToElicit
    **/
    @JsonProperty("slotToElicit")
    public String getSlotToElicit() {
        return slotToElicit;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ElicitSlotDirective dialogElicitSlotDirective = (ElicitSlotDirective) o;
        return Objects.equals(this.updatedIntent, dialogElicitSlotDirective.updatedIntent) &&
            Objects.equals(this.slotToElicit, dialogElicitSlotDirective.slotToElicit) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatedIntent, slotToElicit, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElicitSlotDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    updatedIntent: ").append(toIndentedString(updatedIntent)).append("\n");
        sb.append("    slotToElicit: ").append(toIndentedString(slotToElicit)).append("\n");
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
        private com.amazon.ask.model.Intent updatedIntent;
        private String slotToElicit;

        private Builder() {}

        @JsonProperty("updatedIntent")

        public Builder withUpdatedIntent(com.amazon.ask.model.Intent updatedIntent) {
            this.updatedIntent = updatedIntent;
            return this;
        }


        @JsonProperty("slotToElicit")

        public Builder withSlotToElicit(String slotToElicit) {
            this.slotToElicit = slotToElicit;
            return this;
        }


        public ElicitSlotDirective build() {
            return new ElicitSlotDirective(this);
        }
    }
}

