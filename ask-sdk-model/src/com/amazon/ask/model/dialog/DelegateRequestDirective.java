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
 * DelegateRequestDirective
 */

@JsonDeserialize(builder = DelegateRequestDirective.Builder.class)
public final class DelegateRequestDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("target")
    private String target = null;

    @JsonProperty("period")
    private com.amazon.ask.model.dialog.DelegationPeriod period = null;

    @JsonProperty("updatedRequest")
    private com.amazon.ask.model.dialog.UpdatedRequest updatedRequest = null;

    private DelegateRequestDirective() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private DelegateRequestDirective(Builder builder) {
        String discriminatorValue = "Dialog.DelegateRequest";

        this.type = discriminatorValue;
        if (builder.target != null) {
            this.target = builder.target;
        }
        if (builder.period != null) {
            this.period = builder.period;
        }
        if (builder.updatedRequest != null) {
            this.updatedRequest = builder.updatedRequest;
        }
    }

    /**
     * The delegation target.
     * @return target
    **/
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }


    /**
     * Get period
     * @return period
    **/
    @JsonProperty("period")
    public com.amazon.ask.model.dialog.DelegationPeriod getPeriod() {
        return period;
    }


    /**
     * Get updatedRequest
     * @return updatedRequest
    **/
    @JsonProperty("updatedRequest")
    public com.amazon.ask.model.dialog.UpdatedRequest getUpdatedRequest() {
        return updatedRequest;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DelegateRequestDirective dialogDelegateRequestDirective = (DelegateRequestDirective) o;
        return Objects.equals(this.target, dialogDelegateRequestDirective.target) &&
            Objects.equals(this.period, dialogDelegateRequestDirective.period) &&
            Objects.equals(this.updatedRequest, dialogDelegateRequestDirective.updatedRequest) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(target, period, updatedRequest, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelegateRequestDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    updatedRequest: ").append(toIndentedString(updatedRequest)).append("\n");
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
        private String target;
        private com.amazon.ask.model.dialog.DelegationPeriod period;
        private com.amazon.ask.model.dialog.UpdatedRequest updatedRequest;

        private Builder() {}

        @JsonProperty("target")

        public Builder withTarget(String target) {
            this.target = target;
            return this;
        }


        @JsonProperty("period")

        public Builder withPeriod(com.amazon.ask.model.dialog.DelegationPeriod period) {
            this.period = period;
            return this;
        }


        @JsonProperty("updatedRequest")

        public Builder withUpdatedRequest(com.amazon.ask.model.dialog.UpdatedRequest updatedRequest) {
            this.updatedRequest = updatedRequest;
            return this;
        }


        public DelegateRequestDirective build() {
            return new DelegateRequestDirective(this);
        }
    }
}

