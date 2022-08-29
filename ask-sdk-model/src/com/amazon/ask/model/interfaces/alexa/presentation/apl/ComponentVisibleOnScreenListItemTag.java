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
 * An element in a scrolling list
 */

@JsonDeserialize(builder = ComponentVisibleOnScreenListItemTag.Builder.class)
public final class ComponentVisibleOnScreenListItemTag {

    @JsonProperty("index")
    private Integer index = null;

    private ComponentVisibleOnScreenListItemTag() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ComponentVisibleOnScreenListItemTag(Builder builder) {
        if (builder.index != null) {
            this.index = builder.index;
        }
    }

    /**
     * The zero-based index of this item in its parent.
     * @return index
    **/
    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentVisibleOnScreenListItemTag interfacesAlexaPresentationAplComponentVisibleOnScreenListItemTag = (ComponentVisibleOnScreenListItemTag) o;
        return Objects.equals(this.index, interfacesAlexaPresentationAplComponentVisibleOnScreenListItemTag.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentVisibleOnScreenListItemTag {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

        private Builder() {}

        @JsonProperty("index")

        public Builder withIndex(Integer index) {
            this.index = index;
            return this;
        }


        public ComponentVisibleOnScreenListItemTag build() {
            return new ComponentVisibleOnScreenListItemTag(this);
        }
    }
}

