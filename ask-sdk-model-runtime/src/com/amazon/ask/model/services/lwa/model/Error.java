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

package com.amazon.ask.model.services.lwa.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = Error.Builder.class)
public class Error {

    @JsonProperty("error")
    private final String error;

    @JsonProperty("error_description")
    private final String errorDescription;

    public Error(Builder builder) {
        this.error = builder.error;
        this.errorDescription = builder.errorDescription;
    }

    public String getError() {
        return error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public static class Builder {
        private String error;
        private String errorDescription;

        private Builder() {}

        @JsonProperty("error")
        public Builder withError(String error) {
            this.error = error;
            return this;
        }

        @JsonProperty("error_description")
        public Builder withErrorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            return this;
        }

        public Error build() {
            return new Error(this);
        }
    }

}
