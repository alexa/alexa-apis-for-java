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
 * An ordered list of items
 */

@JsonDeserialize(builder = ComponentVisibleOnScreenListTag.Builder.class)
public final class ComponentVisibleOnScreenListTag {

    @JsonProperty("itemCount")
    private Integer itemCount = null;

    @JsonProperty("lowestIndexSeen")
    private Integer lowestIndexSeen = null;

    @JsonProperty("highestIndexSeen")
    private Integer highestIndexSeen = null;

    @JsonProperty("lowestOrdinalSeen")
    private Integer lowestOrdinalSeen = null;

    @JsonProperty("highestOrdinalSeen")
    private Integer highestOrdinalSeen = null;

    private ComponentVisibleOnScreenListTag() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ComponentVisibleOnScreenListTag(Builder builder) {
        if (builder.itemCount != null) {
            this.itemCount = builder.itemCount;
        }
        if (builder.lowestIndexSeen != null) {
            this.lowestIndexSeen = builder.lowestIndexSeen;
        }
        if (builder.highestIndexSeen != null) {
            this.highestIndexSeen = builder.highestIndexSeen;
        }
        if (builder.lowestOrdinalSeen != null) {
            this.lowestOrdinalSeen = builder.lowestOrdinalSeen;
        }
        if (builder.highestOrdinalSeen != null) {
            this.highestOrdinalSeen = builder.highestOrdinalSeen;
        }
    }

    /**
     * The total number of items in the list.
     * @return itemCount
    **/
    @JsonProperty("itemCount")
    public Integer getItemCount() {
        return itemCount;
    }


    /**
     * The index of the lowest item seen.
     * @return lowestIndexSeen
    **/
    @JsonProperty("lowestIndexSeen")
    public Integer getLowestIndexSeen() {
        return lowestIndexSeen;
    }


    /**
     * The index of the highest item seen.
     * @return highestIndexSeen
    **/
    @JsonProperty("highestIndexSeen")
    public Integer getHighestIndexSeen() {
        return highestIndexSeen;
    }


    /**
     * The ordinal of the lowest ordinal-equipped item seen.
     * @return lowestOrdinalSeen
    **/
    @JsonProperty("lowestOrdinalSeen")
    public Integer getLowestOrdinalSeen() {
        return lowestOrdinalSeen;
    }


    /**
     * The ordinal of the highest ordinal-equipped item seen.
     * @return highestOrdinalSeen
    **/
    @JsonProperty("highestOrdinalSeen")
    public Integer getHighestOrdinalSeen() {
        return highestOrdinalSeen;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentVisibleOnScreenListTag interfacesAlexaPresentationAplComponentVisibleOnScreenListTag = (ComponentVisibleOnScreenListTag) o;
        return Objects.equals(this.itemCount, interfacesAlexaPresentationAplComponentVisibleOnScreenListTag.itemCount) &&
            Objects.equals(this.lowestIndexSeen, interfacesAlexaPresentationAplComponentVisibleOnScreenListTag.lowestIndexSeen) &&
            Objects.equals(this.highestIndexSeen, interfacesAlexaPresentationAplComponentVisibleOnScreenListTag.highestIndexSeen) &&
            Objects.equals(this.lowestOrdinalSeen, interfacesAlexaPresentationAplComponentVisibleOnScreenListTag.lowestOrdinalSeen) &&
            Objects.equals(this.highestOrdinalSeen, interfacesAlexaPresentationAplComponentVisibleOnScreenListTag.highestOrdinalSeen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemCount, lowestIndexSeen, highestIndexSeen, lowestOrdinalSeen, highestOrdinalSeen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentVisibleOnScreenListTag {\n");
        
        sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
        sb.append("    lowestIndexSeen: ").append(toIndentedString(lowestIndexSeen)).append("\n");
        sb.append("    highestIndexSeen: ").append(toIndentedString(highestIndexSeen)).append("\n");
        sb.append("    lowestOrdinalSeen: ").append(toIndentedString(lowestOrdinalSeen)).append("\n");
        sb.append("    highestOrdinalSeen: ").append(toIndentedString(highestOrdinalSeen)).append("\n");
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
        private Integer itemCount;
        private Integer lowestIndexSeen;
        private Integer highestIndexSeen;
        private Integer lowestOrdinalSeen;
        private Integer highestOrdinalSeen;

        private Builder() {}

        @JsonProperty("itemCount")

        public Builder withItemCount(Integer itemCount) {
            this.itemCount = itemCount;
            return this;
        }


        @JsonProperty("lowestIndexSeen")

        public Builder withLowestIndexSeen(Integer lowestIndexSeen) {
            this.lowestIndexSeen = lowestIndexSeen;
            return this;
        }


        @JsonProperty("highestIndexSeen")

        public Builder withHighestIndexSeen(Integer highestIndexSeen) {
            this.highestIndexSeen = highestIndexSeen;
            return this;
        }


        @JsonProperty("lowestOrdinalSeen")

        public Builder withLowestOrdinalSeen(Integer lowestOrdinalSeen) {
            this.lowestOrdinalSeen = lowestOrdinalSeen;
            return this;
        }


        @JsonProperty("highestOrdinalSeen")

        public Builder withHighestOrdinalSeen(Integer highestOrdinalSeen) {
            this.highestOrdinalSeen = highestOrdinalSeen;
            return this;
        }


        public ComponentVisibleOnScreenListTag build() {
            return new ComponentVisibleOnScreenListTag(this);
        }
    }
}

