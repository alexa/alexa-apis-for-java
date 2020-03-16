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


package com.amazon.ask.model.canfulfill;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This represents skill&#39;s capability to understand and fulfill each detected slot.
 */

@JsonDeserialize(builder = CanFulfillSlot.Builder.class)
public final class CanFulfillSlot {

    @JsonProperty("canUnderstand")
    private String canUnderstand = null;

    @JsonProperty("canFulfill")
    private String canFulfill = null;

    public static Builder builder() {
        return new Builder();
    }

    private CanFulfillSlot(Builder builder) {
        if (builder.canUnderstand != null) {
            this.canUnderstand = builder.canUnderstand;
        }
        if (builder.canFulfill != null) {
            this.canFulfill = builder.canFulfill;
        }
    }

    /**
     * Get canUnderstand
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getCanUnderstandAsString().
     *
     * @return canUnderstand
    **/
    
    public com.amazon.ask.model.canfulfill.CanUnderstandSlotValues getCanUnderstand() {
        return com.amazon.ask.model.canfulfill.CanUnderstandSlotValues.fromValue(canUnderstand);
    }

    /**
     * Get the underlying String value for canUnderstand.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return canUnderstand as a String value
    **/
    @JsonProperty("canUnderstand")
    public String getCanUnderstandAsString() {
      return canUnderstand;
    }

    /**
     * Get canFulfill
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getCanFulfillAsString().
     *
     * @return canFulfill
    **/
    
    public com.amazon.ask.model.canfulfill.CanFulfillSlotValues getCanFulfill() {
        return com.amazon.ask.model.canfulfill.CanFulfillSlotValues.fromValue(canFulfill);
    }

    /**
     * Get the underlying String value for canFulfill.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return canFulfill as a String value
    **/
    @JsonProperty("canFulfill")
    public String getCanFulfillAsString() {
      return canFulfill;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CanFulfillSlot canfulfillCanFulfillSlot = (CanFulfillSlot) o;
        return Objects.equals(this.canUnderstand, canfulfillCanFulfillSlot.canUnderstand) &&
            Objects.equals(this.canFulfill, canfulfillCanFulfillSlot.canFulfill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canUnderstand, canFulfill);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CanFulfillSlot {\n");
        
        sb.append("    canUnderstand: ").append(toIndentedString(canUnderstand)).append("\n");
        sb.append("    canFulfill: ").append(toIndentedString(canFulfill)).append("\n");
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
        private String canUnderstand;
        private String canFulfill;

        private Builder() {}

        @JsonProperty("canUnderstand")
        public Builder withCanUnderstand(String canUnderstand) {
          this.canUnderstand = canUnderstand;
          return this;
        }

        public Builder withCanUnderstand(com.amazon.ask.model.canfulfill.CanUnderstandSlotValues canUnderstand) {
            this.canUnderstand = canUnderstand != null ? canUnderstand.toString() : null;
            return this;
        }


        @JsonProperty("canFulfill")
        public Builder withCanFulfill(String canFulfill) {
          this.canFulfill = canFulfill;
          return this;
        }

        public Builder withCanFulfill(com.amazon.ask.model.canfulfill.CanFulfillSlotValues canFulfill) {
            this.canFulfill = canFulfill != null ? canFulfill.toString() : null;
            return this;
        }


        public CanFulfillSlot build() {
            return new CanFulfillSlot(this);
        }
    }
}

