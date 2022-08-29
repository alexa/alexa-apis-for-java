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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A collection of items that are displayed one at a time.
 */

@JsonDeserialize(builder = ComponentVisibleOnScreenPagerTag.Builder.class)
public final class ComponentVisibleOnScreenPagerTag {

    @JsonProperty("index")
    private Integer index = null;

    @JsonProperty("pageCount")
    private Integer pageCount = null;

    @JsonProperty("allowForward")
    private Boolean allowForward = null;

    @JsonProperty("allowBackwards")
    private Boolean allowBackwards = null;

    private ComponentVisibleOnScreenPagerTag() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ComponentVisibleOnScreenPagerTag(Builder builder) {
        if (builder.index != null) {
            this.index = builder.index;
        }
        if (builder.pageCount != null) {
            this.pageCount = builder.pageCount;
        }
        if (builder.allowForward != null) {
            this.allowForward = builder.allowForward;
        }
        if (builder.allowBackwards != null) {
            this.allowBackwards = builder.allowBackwards;
        }
    }

    /**
     * The index of the current page.
     * @return index
    **/
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }


    /**
     * The total number of pages.
     * @return pageCount
    **/
    @JsonProperty("pageCount")
    public Integer getPageCount() {
        return pageCount;
    }


    /**
     * Indicates whether the pager will accept a forward command.
     * @return allowForward
    **/
    @JsonProperty("allowForward")
    public Boolean getAllowForward() {
        return allowForward;
    }


    /**
     * Indicates whether the pager will accept a backward command.
     * @return allowBackwards
    **/
    @JsonProperty("allowBackwards")
    public Boolean getAllowBackwards() {
        return allowBackwards;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentVisibleOnScreenPagerTag interfacesAlexaPresentationAplComponentVisibleOnScreenPagerTag = (ComponentVisibleOnScreenPagerTag) o;
        return Objects.equals(this.index, interfacesAlexaPresentationAplComponentVisibleOnScreenPagerTag.index) &&
            Objects.equals(this.pageCount, interfacesAlexaPresentationAplComponentVisibleOnScreenPagerTag.pageCount) &&
            Objects.equals(this.allowForward, interfacesAlexaPresentationAplComponentVisibleOnScreenPagerTag.allowForward) &&
            Objects.equals(this.allowBackwards, interfacesAlexaPresentationAplComponentVisibleOnScreenPagerTag.allowBackwards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, pageCount, allowForward, allowBackwards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentVisibleOnScreenPagerTag {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
        sb.append("    allowForward: ").append(toIndentedString(allowForward)).append("\n");
        sb.append("    allowBackwards: ").append(toIndentedString(allowBackwards)).append("\n");
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
        private Integer index;
        private Integer pageCount;
        private Boolean allowForward;
        private Boolean allowBackwards;

        private Builder() {}

        @JsonProperty("index")

        public Builder withIndex(Integer index) {
            this.index = index;
            return this;
        }


        @JsonProperty("pageCount")

        public Builder withPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }


        @JsonProperty("allowForward")

        public Builder withAllowForward(Boolean allowForward) {
            this.allowForward = allowForward;
            return this;
        }


        @JsonProperty("allowBackwards")

        public Builder withAllowBackwards(Boolean allowBackwards) {
            this.allowBackwards = allowBackwards;
            return this;
        }


        public ComponentVisibleOnScreenPagerTag build() {
            return new ComponentVisibleOnScreenPagerTag(this);
        }
    }
}

