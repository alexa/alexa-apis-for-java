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


package com.amazon.ask.model.interfaces.alexa.extension;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ExtensionsState
 */

@JsonDeserialize(builder = ExtensionsState.Builder.class)
public final class ExtensionsState {

    @JsonProperty("available")
    private Map<String, com.amazon.ask.model.interfaces.alexa.extension.AvailableExtension> available = new HashMap<String, com.amazon.ask.model.interfaces.alexa.extension.AvailableExtension>();

    public static Builder builder() {
        return new Builder();
    }

    private ExtensionsState(Builder builder) {
        if (builder.available != null) {
            this.available = builder.available;
        }
    }

    /**
     * A map from extension URI to extension object where the object space is reserved for providing authorization information or other such data in the future.
     * @return available
    **/
    @JsonProperty("available")
    public Map<String, com.amazon.ask.model.interfaces.alexa.extension.AvailableExtension> getAvailable() {
        return available;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtensionsState interfacesAlexaExtensionExtensionsState = (ExtensionsState) o;
        return Objects.equals(this.available, interfacesAlexaExtensionExtensionsState.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(available);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtensionsState {\n");
        
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
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
        private Map<String, com.amazon.ask.model.interfaces.alexa.extension.AvailableExtension> available;

        private Builder() {}

        @JsonProperty("available")

        public Builder withAvailable(Map<String, com.amazon.ask.model.interfaces.alexa.extension.AvailableExtension> available) {
            this.available = available;
            return this;
        }

        public Builder putAvailableItem(String key, com.amazon.ask.model.interfaces.alexa.extension.AvailableExtension availableItem) {
            if (this.available == null) {
                this.available = new HashMap<String, com.amazon.ask.model.interfaces.alexa.extension.AvailableExtension>();
            }
            this.available.put(key, availableItem);
            return this;
        }

        public ExtensionsState build() {
            return new ExtensionsState(this);
        }
    }
}

