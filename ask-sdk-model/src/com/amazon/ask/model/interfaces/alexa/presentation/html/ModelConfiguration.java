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


package com.amazon.ask.model.interfaces.alexa.presentation.html;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ModelConfiguration
 */

@JsonDeserialize(builder = ModelConfiguration.Builder.class)
public final class ModelConfiguration {

    @JsonProperty("timeoutInSeconds")
    private Integer timeoutInSeconds = null;

    public static Builder builder() {
        return new Builder();
    }

    private ModelConfiguration(Builder builder) {
        if (builder.timeoutInSeconds != null) {
            this.timeoutInSeconds = builder.timeoutInSeconds;
        }
    }

    /**
     * The number of seconds the content can stay on the screen without user interaction. Default value is 30 seconds. Maximum allowed value is 5 minutes.
     * @return timeoutInSeconds
    **/
    @JsonProperty("timeoutInSeconds")
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelConfiguration interfacesAlexaPresentationHtmlConfiguration = (ModelConfiguration) o;
        return Objects.equals(this.timeoutInSeconds, interfacesAlexaPresentationHtmlConfiguration.timeoutInSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeoutInSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelConfiguration {\n");
        
        sb.append("    timeoutInSeconds: ").append(toIndentedString(timeoutInSeconds)).append("\n");
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
        private Integer timeoutInSeconds;

        private Builder() {}

        @JsonProperty("timeoutInSeconds")

        public Builder withTimeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }


        public ModelConfiguration build() {
            return new ModelConfiguration(this);
        }
    }
}

