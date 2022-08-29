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


package com.amazon.ask.model.services.reminderManagement;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Parameters for VUI presentation of the reminder
 */

@JsonDeserialize(builder = SpokenInfo.Builder.class)
public final class SpokenInfo {

    @JsonProperty("content")
    private List<com.amazon.ask.model.services.reminderManagement.SpokenText> content = new ArrayList<com.amazon.ask.model.services.reminderManagement.SpokenText>();

    private SpokenInfo() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SpokenInfo(Builder builder) {
        if (builder.content != null) {
            this.content = builder.content;
        }
    }

    /**
     * Get content
     * @return content
    **/
    @JsonProperty("content")
    public List<com.amazon.ask.model.services.reminderManagement.SpokenText> getContent() {
        return content;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpokenInfo servicesReminderManagementSpokenInfo = (SpokenInfo) o;
        return Objects.equals(this.content, servicesReminderManagementSpokenInfo.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpokenInfo {\n");
        
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
        private List<com.amazon.ask.model.services.reminderManagement.SpokenText> content;

        private Builder() {}

        @JsonProperty("content")

        public Builder withContent(List<com.amazon.ask.model.services.reminderManagement.SpokenText> content) {
            this.content = content;
            return this;
        }

        public Builder addContentItem(com.amazon.ask.model.services.reminderManagement.SpokenText contentItem) {
            if (this.content == null) {
                this.content = new ArrayList<com.amazon.ask.model.services.reminderManagement.SpokenText>();
            }
            this.content.add(contentItem);
            return this;
        }

        public SpokenInfo build() {
            return new SpokenInfo(this);
        }
    }
}

