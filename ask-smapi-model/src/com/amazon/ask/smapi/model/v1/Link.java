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


package com.amazon.ask.smapi.model.v1;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Link
 */

@JsonDeserialize(builder = Link.Builder.class)
public final class Link {

    @JsonProperty("href")
    private String href = null;

    private Link() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private Link(Builder builder) {
        if (builder.href != null) {
            this.href = builder.href;
        }
    }

    /**
     * Get href
     * @return href
    **/
    @JsonProperty("href")
    public String getHref() {
        return href;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Link v1Link = (Link) o;
        return Objects.equals(this.href, v1Link.href);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Link {\n");
        
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
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
        private String href;

        private Builder() {}

        @JsonProperty("href")

        public Builder withHref(String href) {
            this.href = href;
            return this;
        }


        public Link build() {
            return new Link(this);
        }
    }
}

