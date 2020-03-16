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


package com.amazon.ask.model.interfaces.viewport.apl;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ViewportConfiguration
 */

@JsonDeserialize(builder = ViewportConfiguration.Builder.class)
public final class ViewportConfiguration {

    @JsonProperty("current")
    private com.amazon.ask.model.interfaces.viewport.apl.CurrentConfiguration current = null;

    public static Builder builder() {
        return new Builder();
    }

    private ViewportConfiguration(Builder builder) {
        if (builder.current != null) {
            this.current = builder.current;
        }
    }

    /**
     * Get current
     * @return current
    **/
    @JsonProperty("current")
    public com.amazon.ask.model.interfaces.viewport.apl.CurrentConfiguration getCurrent() {
        return current;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViewportConfiguration interfacesViewportAplViewportConfiguration = (ViewportConfiguration) o;
        return Objects.equals(this.current, interfacesViewportAplViewportConfiguration.current);
    }

    @Override
    public int hashCode() {
        return Objects.hash(current);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ViewportConfiguration {\n");
        
        sb.append("    current: ").append(toIndentedString(current)).append("\n");
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
        private com.amazon.ask.model.interfaces.viewport.apl.CurrentConfiguration current;

        private Builder() {}

        @JsonProperty("current")

        public Builder withCurrent(com.amazon.ask.model.interfaces.viewport.apl.CurrentConfiguration current) {
            this.current = current;
            return this;
        }


        public ViewportConfiguration build() {
            return new ViewportConfiguration(this);
        }
    }
}

