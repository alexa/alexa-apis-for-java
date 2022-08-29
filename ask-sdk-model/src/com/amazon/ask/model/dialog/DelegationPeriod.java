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
 * The delegation period.
 */

@JsonDeserialize(builder = DelegationPeriod.Builder.class)
public final class DelegationPeriod {

    @JsonProperty("until")
    private String until = null;

    private DelegationPeriod() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private DelegationPeriod(Builder builder) {
        if (builder.until != null) {
            this.until = builder.until;
        }
    }

    /**
     * Get until
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getUntilAsString().
     *
     * @return until
    **/
    
    public com.amazon.ask.model.dialog.DelegationPeriodUntil getUntil() {
        return com.amazon.ask.model.dialog.DelegationPeriodUntil.fromValue(until);
    }

    /**
     * Get the underlying String value for until.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return until as a String value
    **/
    @JsonProperty("until")
    public String getUntilAsString() {
      return until;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DelegationPeriod dialogDelegationPeriod = (DelegationPeriod) o;
        return Objects.equals(this.until, dialogDelegationPeriod.until);
    }

    @Override
    public int hashCode() {
        return Objects.hash(until);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelegationPeriod {\n");
        
        sb.append("    until: ").append(toIndentedString(until)).append("\n");
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
        private String until;

        private Builder() {}

        @JsonProperty("until")

        public Builder withUntil(String until) {
          this.until = until;
          return this;
        }

        public Builder withUntil(com.amazon.ask.model.dialog.DelegationPeriodUntil until) {
            this.until = until != null ? until.toString() : null;
            return this;
        }


        public DelegationPeriod build() {
            return new DelegationPeriod(this);
        }
    }
}

