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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the runtime information for the interface.
 */

@JsonDeserialize(builder = Runtime.Builder.class)
public final class Runtime {

    @JsonProperty("maxVersion")
    private String maxVersion = null;

    private Runtime() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Runtime(Builder builder) {
        if (builder.maxVersion != null) {
            this.maxVersion = builder.maxVersion;
        }
    }

    /**
     * Maximum APL version supported by the runtime.
     * @return maxVersion
    **/
    @JsonProperty("maxVersion")
    public String getMaxVersion() {
        return maxVersion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Runtime interfacesAlexaPresentationAplRuntime = (Runtime) o;
        return Objects.equals(this.maxVersion, interfacesAlexaPresentationAplRuntime.maxVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Runtime {\n");
        
        sb.append("    maxVersion: ").append(toIndentedString(maxVersion)).append("\n");
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
        private String maxVersion;

        private Builder() {}

        @JsonProperty("maxVersion")

        public Builder withMaxVersion(String maxVersion) {
            this.maxVersion = maxVersion;
            return this;
        }


        public Runtime build() {
            return new Runtime(this);
        }
    }
}

