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


package com.amazon.ask.model.ui;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SimpleCard
 */

@JsonDeserialize(builder = SimpleCard.Builder.class)
public final class SimpleCard extends com.amazon.ask.model.ui.Card  {

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("content")
    private String content = null;

    public static Builder builder() {
        return new Builder();
    }

    private SimpleCard(Builder builder) {
        String discriminatorValue = "Simple";

        this.type = discriminatorValue;
        if (builder.title != null) {
            this.title = builder.title;
        }
        if (builder.content != null) {
            this.content = builder.content;
        }
    }

    /**
     * Get title
     * @return title
    **/
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Get content
     * @return content
    **/
    @JsonProperty("content")
    public String getContent() {
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
        SimpleCard uiSimpleCard = (SimpleCard) o;
        return Objects.equals(this.title, uiSimpleCard.title) &&
            Objects.equals(this.content, uiSimpleCard.content) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleCard {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
        private String title;
        private String content;

        private Builder() {}

        @JsonProperty("title")
        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }


        @JsonProperty("content")
        public Builder withContent(String content) {
            this.content = content;
            return this;
        }


        public SimpleCard build() {
            return new SimpleCard(this);
        }
    }
}

