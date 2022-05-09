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


package com.amazon.ask.model.services.gameEngine;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * An object that provides all of the events that need to occur, in a specific order, for this recognizer to be true. Omitting any parameters in this object means \&quot;match anything\&quot;.
 */

@JsonDeserialize(builder = Pattern.Builder.class)
public final class Pattern {

    @JsonProperty("gadgetIds")
    private List<String> gadgetIds = new ArrayList<String>();

    @JsonProperty("colors")
    private List<String> colors = new ArrayList<String>();

    @JsonProperty("action")
    private String action = null;

    @JsonProperty("repeat")
    private Integer repeat = null;

    public static Builder builder() {
        return new Builder();
    }

    private Pattern(Builder builder) {
        if (builder.gadgetIds != null) {
            this.gadgetIds = builder.gadgetIds;
        }
        if (builder.colors != null) {
            this.colors = builder.colors;
        }
        if (builder.action != null) {
            this.action = builder.action;
        }
        if (builder.repeat != null) {
            this.repeat = builder.repeat;
        }
    }

    /**
     * A whitelist of gadgetIds that are eligible for this match.
     * @return gadgetIds
    **/
    @JsonProperty("gadgetIds")
    public List<String> getGadgetIds() {
        return gadgetIds;
    }


    /**
     * A whitelist of colors that are eligible for this match.
     * @return colors
    **/
    @JsonProperty("colors")
    public List<String> getColors() {
        return colors;
    }


    /**
     * Get action
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getActionAsString().
     *
     * @return action
    **/
    
    public com.amazon.ask.model.services.gameEngine.InputEventActionType getAction() {
        return com.amazon.ask.model.services.gameEngine.InputEventActionType.fromValue(action);
    }

    /**
     * Get the underlying String value for action.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return action as a String value
    **/
    @JsonProperty("action")
    public String getActionAsString() {
      return action;
    }

    /**
     * The number of times that the specified action must occur to be considered complete.
     * minimum: 1
     * maximum: 99999
     * @return repeat
    **/
    @JsonProperty("repeat")
    public Integer getRepeat() {
        return repeat;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pattern servicesGameEnginePattern = (Pattern) o;
        return Objects.equals(this.gadgetIds, servicesGameEnginePattern.gadgetIds) &&
            Objects.equals(this.colors, servicesGameEnginePattern.colors) &&
            Objects.equals(this.action, servicesGameEnginePattern.action) &&
            Objects.equals(this.repeat, servicesGameEnginePattern.repeat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gadgetIds, colors, action, repeat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pattern {\n");
        
        sb.append("    gadgetIds: ").append(toIndentedString(gadgetIds)).append("\n");
        sb.append("    colors: ").append(toIndentedString(colors)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    repeat: ").append(toIndentedString(repeat)).append("\n");
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
        private List<String> gadgetIds;
        private List<String> colors;
        private String action;
        private Integer repeat;

        private Builder() {}

        @JsonProperty("gadgetIds")

        public Builder withGadgetIds(List<String> gadgetIds) {
            this.gadgetIds = gadgetIds;
            return this;
        }

        public Builder addGadgetIdsItem(String gadgetIdsItem) {
            if (this.gadgetIds == null) {
                this.gadgetIds = new ArrayList<String>();
            }
            this.gadgetIds.add(gadgetIdsItem);
            return this;
        }

        @JsonProperty("colors")

        public Builder withColors(List<String> colors) {
            this.colors = colors;
            return this;
        }

        public Builder addColorsItem(String colorsItem) {
            if (this.colors == null) {
                this.colors = new ArrayList<String>();
            }
            this.colors.add(colorsItem);
            return this;
        }

        @JsonProperty("action")

        public Builder withAction(String action) {
          this.action = action;
          return this;
        }

        public Builder withAction(com.amazon.ask.model.services.gameEngine.InputEventActionType action) {
            this.action = action != null ? action.toString() : null;
            return this;
        }


        @JsonProperty("repeat")

        public Builder withRepeat(Integer repeat) {
            this.repeat = repeat;
            return this;
        }


        public Pattern build() {
            return new Pattern(this);
        }
    }
}

