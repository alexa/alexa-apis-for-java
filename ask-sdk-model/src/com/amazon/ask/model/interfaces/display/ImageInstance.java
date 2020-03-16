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


package com.amazon.ask.model.interfaces.display;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImageInstance
 */

@JsonDeserialize(builder = ImageInstance.Builder.class)
public final class ImageInstance {

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("size")
    private String size = null;

    @JsonProperty("widthPixels")
    private Integer widthPixels = null;

    @JsonProperty("heightPixels")
    private Integer heightPixels = null;

    public static Builder builder() {
        return new Builder();
    }

    private ImageInstance(Builder builder) {
        if (builder.url != null) {
            this.url = builder.url;
        }
        if (builder.size != null) {
            this.size = builder.size;
        }
        if (builder.widthPixels != null) {
            this.widthPixels = builder.widthPixels;
        }
        if (builder.heightPixels != null) {
            this.heightPixels = builder.heightPixels;
        }
    }

    /**
     * Get url
     * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }


    /**
     * Get size
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getSizeAsString().
     *
     * @return size
    **/
    
    public com.amazon.ask.model.interfaces.display.ImageSize getSize() {
        return com.amazon.ask.model.interfaces.display.ImageSize.fromValue(size);
    }

    /**
     * Get the underlying String value for size.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return size as a String value
    **/
    @JsonProperty("size")
    public String getSizeAsString() {
      return size;
    }

    /**
     * Get widthPixels
     * @return widthPixels
    **/
    @JsonProperty("widthPixels")
    public Integer getWidthPixels() {
        return widthPixels;
    }


    /**
     * Get heightPixels
     * @return heightPixels
    **/
    @JsonProperty("heightPixels")
    public Integer getHeightPixels() {
        return heightPixels;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageInstance interfacesDisplayImageInstance = (ImageInstance) o;
        return Objects.equals(this.url, interfacesDisplayImageInstance.url) &&
            Objects.equals(this.size, interfacesDisplayImageInstance.size) &&
            Objects.equals(this.widthPixels, interfacesDisplayImageInstance.widthPixels) &&
            Objects.equals(this.heightPixels, interfacesDisplayImageInstance.heightPixels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, size, widthPixels, heightPixels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageInstance {\n");
        
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    widthPixels: ").append(toIndentedString(widthPixels)).append("\n");
        sb.append("    heightPixels: ").append(toIndentedString(heightPixels)).append("\n");
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
        private String url;
        private String size;
        private Integer widthPixels;
        private Integer heightPixels;

        private Builder() {}

        @JsonProperty("url")

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }


        @JsonProperty("size")
        public Builder withSize(String size) {
          this.size = size;
          return this;
        }

        public Builder withSize(com.amazon.ask.model.interfaces.display.ImageSize size) {
            this.size = size != null ? size.toString() : null;
            return this;
        }


        @JsonProperty("widthPixels")

        public Builder withWidthPixels(Integer widthPixels) {
            this.widthPixels = widthPixels;
            return this;
        }


        @JsonProperty("heightPixels")

        public Builder withHeightPixels(Integer heightPixels) {
            this.heightPixels = heightPixels;
            return this;
        }


        public ImageInstance build() {
            return new ImageInstance(this);
        }
    }
}

