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


package com.amazon.ask.model.services.timerManagement;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ANNOUNCE trigger behavior represents announcing a certain text that the developer wants to be read out at the expiration of the timer.
 */

@JsonDeserialize(builder = AnnounceOperation.Builder.class)
public final class AnnounceOperation extends com.amazon.ask.model.services.timerManagement.Operation  {

    @JsonProperty("textToAnnounce")
    private List<com.amazon.ask.model.services.timerManagement.TextToAnnounce> textToAnnounce = new ArrayList<com.amazon.ask.model.services.timerManagement.TextToAnnounce>();

    public static Builder builder() {
        return new Builder();
    }

    private AnnounceOperation(Builder builder) {
        String discriminatorValue = "ANNOUNCE";

        this.type = discriminatorValue;
        if (builder.textToAnnounce != null) {
            this.textToAnnounce = builder.textToAnnounce;
        }
    }

    /**
     * Get textToAnnounce
     * @return textToAnnounce
    **/
    @JsonProperty("textToAnnounce")
    public List<com.amazon.ask.model.services.timerManagement.TextToAnnounce> getTextToAnnounce() {
        return textToAnnounce;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnnounceOperation servicesTimerManagementAnnounceOperation = (AnnounceOperation) o;
        return Objects.equals(this.textToAnnounce, servicesTimerManagementAnnounceOperation.textToAnnounce) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textToAnnounce, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnnounceOperation {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    textToAnnounce: ").append(toIndentedString(textToAnnounce)).append("\n");
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
        private List<com.amazon.ask.model.services.timerManagement.TextToAnnounce> textToAnnounce;

        private Builder() {}

        @JsonProperty("textToAnnounce")

        public Builder withTextToAnnounce(List<com.amazon.ask.model.services.timerManagement.TextToAnnounce> textToAnnounce) {
            this.textToAnnounce = textToAnnounce;
            return this;
        }

        public Builder addTextToAnnounceItem(com.amazon.ask.model.services.timerManagement.TextToAnnounce textToAnnounceItem) {
            if (this.textToAnnounce == null) {
                this.textToAnnounce = new ArrayList<com.amazon.ask.model.services.timerManagement.TextToAnnounce>();
            }
            this.textToAnnounce.add(textToAnnounceItem);
            return this;
        }

        public AnnounceOperation build() {
            return new AnnounceOperation(this);
        }
    }
}

