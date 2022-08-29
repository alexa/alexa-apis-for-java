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


package com.amazon.ask.model.interfaces.gameEngine;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StopInputHandlerDirective
 */

@JsonDeserialize(builder = StopInputHandlerDirective.Builder.class)
public final class StopInputHandlerDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("originatingRequestId")
    private String originatingRequestId = null;

    private StopInputHandlerDirective() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private StopInputHandlerDirective(Builder builder) {
        String discriminatorValue = "GameEngine.StopInputHandler";

        this.type = discriminatorValue;
        if (builder.originatingRequestId != null) {
            this.originatingRequestId = builder.originatingRequestId;
        }
    }

    /**
     * The `requestId` of the request that started the input handler.
     * @return originatingRequestId
    **/
    @JsonProperty("originatingRequestId")
    public String getOriginatingRequestId() {
        return originatingRequestId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopInputHandlerDirective interfacesGameEngineStopInputHandlerDirective = (StopInputHandlerDirective) o;
        return Objects.equals(this.originatingRequestId, interfacesGameEngineStopInputHandlerDirective.originatingRequestId) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(originatingRequestId, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopInputHandlerDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    originatingRequestId: ").append(toIndentedString(originatingRequestId)).append("\n");
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
        private String originatingRequestId;

        private Builder() {}

        @JsonProperty("originatingRequestId")

        public Builder withOriginatingRequestId(String originatingRequestId) {
            this.originatingRequestId = originatingRequestId;
            return this;
        }


        public StopInputHandlerDirective build() {
            return new StopInputHandlerDirective(this);
        }
    }
}

