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


package com.amazon.ask.smapi.model.v0.catalog.upload;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Represents a single step in the ingestion process of a new upload.
 */

@JsonDeserialize(builder = UploadIngestionStep.Builder.class)
public final class UploadIngestionStep {

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("logUrl")
    private String logUrl = null;

    @JsonProperty("errors")
    private List<com.amazon.ask.smapi.model.v0.Error> errors = new ArrayList<com.amazon.ask.smapi.model.v0.Error>();

    private UploadIngestionStep() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private UploadIngestionStep(Builder builder) {
        if (builder.name != null) {
            this.name = builder.name;
        }
        if (builder.status != null) {
            this.status = builder.status;
        }
        if (builder.logUrl != null) {
            this.logUrl = builder.logUrl;
        }
        if (builder.errors != null) {
            this.errors = builder.errors;
        }
    }

    /**
     * Get name
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getNameAsString().
     *
     * @return name
    **/
    
    public com.amazon.ask.smapi.model.v0.catalog.upload.IngestionStepName getName() {
        return com.amazon.ask.smapi.model.v0.catalog.upload.IngestionStepName.fromValue(name);
    }

    /**
     * Get the underlying String value for name.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return name as a String value
    **/
    @JsonProperty("name")
    public String getNameAsString() {
      return name;
    }

    /**
     * Get status
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getStatusAsString().
     *
     * @return status
    **/
    
    public com.amazon.ask.smapi.model.v0.catalog.upload.IngestionStatus getStatus() {
        return com.amazon.ask.smapi.model.v0.catalog.upload.IngestionStatus.fromValue(status);
    }

    /**
     * Get the underlying String value for status.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return status as a String value
    **/
    @JsonProperty("status")
    public String getStatusAsString() {
      return status;
    }

    /**
     * Represents the url for the file containing logs of ingestion step.
     * @return logUrl
    **/
    @JsonProperty("logUrl")
    public String getLogUrl() {
        return logUrl;
    }


    /**
     * This array will contain the errors occurred during the execution of step. Will be empty, if execution succeeded.
     * @return errors
    **/
    @JsonProperty("errors")
    public List<com.amazon.ask.smapi.model.v0.Error> getErrors() {
        return errors;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UploadIngestionStep v0CatalogUploadUploadIngestionStep = (UploadIngestionStep) o;
        return Objects.equals(this.name, v0CatalogUploadUploadIngestionStep.name) &&
            Objects.equals(this.status, v0CatalogUploadUploadIngestionStep.status) &&
            Objects.equals(this.logUrl, v0CatalogUploadUploadIngestionStep.logUrl) &&
            Objects.equals(this.errors, v0CatalogUploadUploadIngestionStep.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, logUrl, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadIngestionStep {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
        private String name;
        private String status;
        private String logUrl;
        private List<com.amazon.ask.smapi.model.v0.Error> errors;

        private Builder() {}

        @JsonProperty("name")

        public Builder withName(String name) {
          this.name = name;
          return this;
        }

        public Builder withName(com.amazon.ask.smapi.model.v0.catalog.upload.IngestionStepName name) {
            this.name = name != null ? name.toString() : null;
            return this;
        }


        @JsonProperty("status")

        public Builder withStatus(String status) {
          this.status = status;
          return this;
        }

        public Builder withStatus(com.amazon.ask.smapi.model.v0.catalog.upload.IngestionStatus status) {
            this.status = status != null ? status.toString() : null;
            return this;
        }


        @JsonProperty("logUrl")

        public Builder withLogUrl(String logUrl) {
            this.logUrl = logUrl;
            return this;
        }


        @JsonProperty("errors")

        public Builder withErrors(List<com.amazon.ask.smapi.model.v0.Error> errors) {
            this.errors = errors;
            return this;
        }

        public Builder addErrorsItem(com.amazon.ask.smapi.model.v0.Error errorsItem) {
            if (this.errors == null) {
                this.errors = new ArrayList<com.amazon.ask.smapi.model.v0.Error>();
            }
            this.errors.add(errorsItem);
            return this;
        }

        public UploadIngestionStep build() {
            return new UploadIngestionStep(this);
        }
    }
}

