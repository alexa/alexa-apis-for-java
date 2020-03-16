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
 * StandardCard
 */

@JsonDeserialize(builder = StandardCard.Builder.class)
public final class StandardCard extends com.amazon.ask.model.ui.Card  {

    @JsonProperty("title")
    private String title = null;

    @JsonProperty("text")
    private String text = null;

    @JsonProperty("image")
    private com.amazon.ask.model.ui.Image image = null;

    public static Builder builder() {
        return new Builder();
    }

    private StandardCard(Builder builder) {
        String discriminatorValue = "Standard";

        this.type = discriminatorValue;
        if (builder.title != null) {
            this.title = builder.title;
        }
        if (builder.text != null) {
            this.text = builder.text;
        }
        if (builder.image != null) {
            this.image = builder.image;
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
     * Get text
     * @return text
    **/
    @JsonProperty("text")
    public String getText() {
        return text;
    }


    /**
     * Get image
     * @return image
    **/
    @JsonProperty("image")
    public com.amazon.ask.model.ui.Image getImage() {
        return image;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StandardCard uiStandardCard = (StandardCard) o;
        return Objects.equals(this.title, uiStandardCard.title) &&
            Objects.equals(this.text, uiStandardCard.text) &&
            Objects.equals(this.image, uiStandardCard.image) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text, image, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandardCard {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
        private String text;
        private com.amazon.ask.model.ui.Image image;

        private Builder() {}

        @JsonProperty("title")

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }


        @JsonProperty("text")

        public Builder withText(String text) {
            this.text = text;
            return this;
        }


        @JsonProperty("image")

        public Builder withImage(com.amazon.ask.model.ui.Image image) {
            this.image = image;
            return this;
        }


        public StandardCard build() {
            return new StandardCard(this);
        }
    }
}

