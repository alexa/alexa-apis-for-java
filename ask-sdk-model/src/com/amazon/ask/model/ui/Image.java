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
 * Image
 */

@JsonDeserialize(builder = Image.Builder.class)
public final class Image {

    @JsonProperty("smallImageUrl")
    private String smallImageUrl = null;

    @JsonProperty("largeImageUrl")
    private String largeImageUrl = null;

    public static Builder builder() {
        return new Builder();
    }

    private Image(Builder builder) {
        if (builder.smallImageUrl != null) {
            this.smallImageUrl = builder.smallImageUrl;
        }
        if (builder.largeImageUrl != null) {
            this.largeImageUrl = builder.largeImageUrl;
        }
    }

    /**
     * Get smallImageUrl
     * @return smallImageUrl
    **/
    @JsonProperty("smallImageUrl")
    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    /**
     * Get largeImageUrl
     * @return largeImageUrl
    **/
    @JsonProperty("largeImageUrl")
    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image uiImage = (Image) o;
        return Objects.equals(this.smallImageUrl, uiImage.smallImageUrl) &&
            Objects.equals(this.largeImageUrl, uiImage.largeImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smallImageUrl, largeImageUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Image {\n");
        
        sb.append("    smallImageUrl: ").append(toIndentedString(smallImageUrl)).append("\n");
        sb.append("    largeImageUrl: ").append(toIndentedString(largeImageUrl)).append("\n");
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
        private String smallImageUrl;
        private String largeImageUrl;

        private Builder() {}

        @JsonProperty("smallImageUrl")
        public Builder withSmallImageUrl(String smallImageUrl) {
            this.smallImageUrl = smallImageUrl;
            return this;
        }


        @JsonProperty("largeImageUrl")
        public Builder withLargeImageUrl(String largeImageUrl) {
            this.largeImageUrl = largeImageUrl;
            return this;
        }


        public Image build() {
            return new Image(this);
        }
    }
}

