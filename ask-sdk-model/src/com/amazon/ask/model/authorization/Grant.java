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


package com.amazon.ask.model.authorization;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information that identifies a user in Amazon Alexa systems.
 */

@JsonDeserialize(builder = Grant.Builder.class)
public final class Grant {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("code")
    private String code = null;

    public static Builder builder() {
        return new Builder();
    }

    private Grant(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.code != null) {
            this.code = builder.code;
        }
    }

    /**
     * Type of the grant.
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getTypeAsString().
     *
     * @return type
    **/
    
    public com.amazon.ask.model.authorization.GrantType getType() {
        return com.amazon.ask.model.authorization.GrantType.fromValue(type);
    }

    /**
     * Get the underlying String value for type.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return type as a String value
    **/
    @JsonProperty("type")
    public String getTypeAsString() {
      return type;
    }

    /**
     * The authorization code for the user.
     * @return code
    **/
    @JsonProperty("code")
    public String getCode() {
        return code;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Grant authorizationGrant = (Grant) o;
        return Objects.equals(this.type, authorizationGrant.type) &&
            Objects.equals(this.code, authorizationGrant.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Grant {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
        private String type;
        private String code;

        private Builder() {}

        @JsonProperty("type")
        public Builder withType(String type) {
          this.type = type;
          return this;
        }

        public Builder withType(com.amazon.ask.model.authorization.GrantType type) {
            this.type = type != null ? type.toString() : null;
            return this;
        }


        @JsonProperty("code")

        public Builder withCode(String code) {
            this.code = code;
            return this;
        }


        public Grant build() {
            return new Grant(this);
        }
    }
}

