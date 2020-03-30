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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the critical data related info.
 */

@JsonDeserialize(builder = CriticalDataHandling.Builder.class)
public final class CriticalDataHandling {

    @JsonProperty("dataProtectionProvider")
    private String dataProtectionProvider = null;

    public static Builder builder() {
        return new Builder();
    }

    private CriticalDataHandling(Builder builder) {
        if (builder.dataProtectionProvider != null) {
            this.dataProtectionProvider = builder.dataProtectionProvider;
        }
    }

    /**
     * Get dataProtectionProvider
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getDataProtectionProviderAsString().
     *
     * @return dataProtectionProvider
    **/
    
    public com.amazon.ask.smapi.model.v1.skill.Manifest.DataProtectionProvider getDataProtectionProvider() {
        return com.amazon.ask.smapi.model.v1.skill.Manifest.DataProtectionProvider.fromValue(dataProtectionProvider);
    }

    /**
     * Get the underlying String value for dataProtectionProvider.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return dataProtectionProvider as a String value
    **/
    @JsonProperty("dataProtectionProvider")
    public String getDataProtectionProviderAsString() {
      return dataProtectionProvider;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CriticalDataHandling v1SkillManifestCriticalDataHandling = (CriticalDataHandling) o;
        return Objects.equals(this.dataProtectionProvider, v1SkillManifestCriticalDataHandling.dataProtectionProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataProtectionProvider);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CriticalDataHandling {\n");
        
        sb.append("    dataProtectionProvider: ").append(toIndentedString(dataProtectionProvider)).append("\n");
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
        private String dataProtectionProvider;

        private Builder() {}

        @JsonProperty("dataProtectionProvider")
        public Builder withDataProtectionProvider(String dataProtectionProvider) {
          this.dataProtectionProvider = dataProtectionProvider;
          return this;
        }

        public Builder withDataProtectionProvider(com.amazon.ask.smapi.model.v1.skill.Manifest.DataProtectionProvider dataProtectionProvider) {
            this.dataProtectionProvider = dataProtectionProvider != null ? dataProtectionProvider.toString() : null;
            return this;
        }


        public CriticalDataHandling build() {
            return new CriticalDataHandling(this);
        }
    }
}

