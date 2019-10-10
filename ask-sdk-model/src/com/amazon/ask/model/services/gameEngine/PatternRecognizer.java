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
 * This recognizer is true when all of the specified events have occurred in the specified order.
 */

@JsonDeserialize(builder = PatternRecognizer.Builder.class)
public final class PatternRecognizer extends com.amazon.ask.model.services.gameEngine.Recognizer  {

    @JsonProperty("anchor")
    private com.amazon.ask.model.services.gameEngine.PatternRecognizerAnchorType anchor = null;

    @JsonProperty("fuzzy")
    private Boolean fuzzy = null;

    @JsonProperty("gadgetIds")
    private List<String> gadgetIds = new ArrayList<String>();

    @JsonProperty("actions")
    private List<String> actions = new ArrayList<String>();

    @JsonProperty("pattern")
    private List<com.amazon.ask.model.services.gameEngine.Pattern> pattern = new ArrayList<com.amazon.ask.model.services.gameEngine.Pattern>();

    public static Builder builder() {
        return new Builder();
    }

    private PatternRecognizer(Builder builder) {
        String discriminatorValue = "match";

        this.type = discriminatorValue;
        if (builder.anchor != null) {
            this.anchor = builder.anchor;
        }
        if (builder.fuzzy != null) {
            this.fuzzy = builder.fuzzy;
        }
        if (builder.gadgetIds != null) {
            this.gadgetIds = builder.gadgetIds;
        }
        if (builder.actions != null) {
            this.actions = builder.actions;
        }
        if (builder.pattern != null) {
            this.pattern = builder.pattern;
        }
    }

    /**
     * Get anchor
     * @return anchor
    **/
    @JsonProperty("anchor")
    public com.amazon.ask.model.services.gameEngine.PatternRecognizerAnchorType getAnchor() {
        return anchor;
    }

    /**
     * When true, the recognizer will ignore additional events that occur between the events specified in the pattern.
     * @return fuzzy
    **/
    @JsonProperty("fuzzy")
    public Boolean getFuzzy() {
        return fuzzy;
    }

    /**
     * The gadget IDs of the Echo Buttons to consider in this pattern recognizer.
     * @return gadgetIds
    **/
    @JsonProperty("gadgetIds")
    public List<String> getGadgetIds() {
        return gadgetIds;
    }

    /**
     * The actions to consider in this pattern recognizer. All other actions will be ignored.
     * @return actions
    **/
    @JsonProperty("actions")
    public List<String> getActions() {
        return actions;
    }

    /**
     * An object that provides all of the events that need to occur, in a specific order, for this recognizer to be true. Omitting any parameters in this object means \"match anything\".
     * @return pattern
    **/
    @JsonProperty("pattern")
    public List<com.amazon.ask.model.services.gameEngine.Pattern> getPattern() {
        return pattern;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatternRecognizer servicesGameEnginePatternRecognizer = (PatternRecognizer) o;
        return Objects.equals(this.anchor, servicesGameEnginePatternRecognizer.anchor) &&
            Objects.equals(this.fuzzy, servicesGameEnginePatternRecognizer.fuzzy) &&
            Objects.equals(this.gadgetIds, servicesGameEnginePatternRecognizer.gadgetIds) &&
            Objects.equals(this.actions, servicesGameEnginePatternRecognizer.actions) &&
            Objects.equals(this.pattern, servicesGameEnginePatternRecognizer.pattern) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anchor, fuzzy, gadgetIds, actions, pattern, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatternRecognizer {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
        sb.append("    fuzzy: ").append(toIndentedString(fuzzy)).append("\n");
        sb.append("    gadgetIds: ").append(toIndentedString(gadgetIds)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
        private com.amazon.ask.model.services.gameEngine.PatternRecognizerAnchorType anchor;
        private Boolean fuzzy;
        private List<String> gadgetIds;
        private List<String> actions;
        private List<com.amazon.ask.model.services.gameEngine.Pattern> pattern;

        private Builder() {}

        @JsonProperty("anchor")
        public Builder withAnchor(com.amazon.ask.model.services.gameEngine.PatternRecognizerAnchorType anchor) {
            this.anchor = anchor;
            return this;
        }


        @JsonProperty("fuzzy")
        public Builder withFuzzy(Boolean fuzzy) {
            this.fuzzy = fuzzy;
            return this;
        }


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

        @JsonProperty("actions")
        public Builder withActions(List<String> actions) {
            this.actions = actions;
            return this;
        }

        public Builder addActionsItem(String actionsItem) {
            if (this.actions == null) {
                this.actions = new ArrayList<String>();
            }
            this.actions.add(actionsItem);
            return this;
        }

        @JsonProperty("pattern")
        public Builder withPattern(List<com.amazon.ask.model.services.gameEngine.Pattern> pattern) {
            this.pattern = pattern;
            return this;
        }

        public Builder addPatternItem(com.amazon.ask.model.services.gameEngine.Pattern patternItem) {
            if (this.pattern == null) {
                this.pattern = new ArrayList<com.amazon.ask.model.services.gameEngine.Pattern>();
            }
            this.pattern.add(patternItem);
            return this;
        }

        public PatternRecognizer build() {
            return new PatternRecognizer(this);
        }
    }
}

