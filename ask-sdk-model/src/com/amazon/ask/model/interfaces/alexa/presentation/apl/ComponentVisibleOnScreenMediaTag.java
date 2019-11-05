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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Media player
 */

@JsonDeserialize(builder = ComponentVisibleOnScreenMediaTag.Builder.class)
public final class ComponentVisibleOnScreenMediaTag {

    @JsonProperty("positionInMilliseconds")
    private Integer positionInMilliseconds = null;

    @JsonProperty("state")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenMediaTagStateEnum state = null;

    @JsonProperty("allowAdjustSeekPositionForward")
    private Boolean allowAdjustSeekPositionForward = null;

    @JsonProperty("allowAdjustSeekPositionBackwards")
    private Boolean allowAdjustSeekPositionBackwards = null;

    @JsonProperty("allowNext")
    private Boolean allowNext = null;

    @JsonProperty("allowPrevious")
    private Boolean allowPrevious = null;

    @JsonProperty("entities")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity> entities = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity>();

    @JsonProperty("url")
    private String url = null;

    public static Builder builder() {
        return new Builder();
    }

    private ComponentVisibleOnScreenMediaTag(Builder builder) {
        if (builder.positionInMilliseconds != null) {
            this.positionInMilliseconds = builder.positionInMilliseconds;
        }
        if (builder.state != null) {
            this.state = builder.state;
        }
        if (builder.allowAdjustSeekPositionForward != null) {
            this.allowAdjustSeekPositionForward = builder.allowAdjustSeekPositionForward;
        }
        if (builder.allowAdjustSeekPositionBackwards != null) {
            this.allowAdjustSeekPositionBackwards = builder.allowAdjustSeekPositionBackwards;
        }
        if (builder.allowNext != null) {
            this.allowNext = builder.allowNext;
        }
        if (builder.allowPrevious != null) {
            this.allowPrevious = builder.allowPrevious;
        }
        if (builder.entities != null) {
            this.entities = builder.entities;
        }
        if (builder.url != null) {
            this.url = builder.url;
        }
    }

    /**
     * Current position of the play head from the start of the track.
     * @return positionInMilliseconds
    **/
    @JsonProperty("positionInMilliseconds")
    public Integer getPositionInMilliseconds() {
        return positionInMilliseconds;
    }

    /**
     * Get state
     * @return state
    **/
    @JsonProperty("state")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenMediaTagStateEnum getState() {
        return state;
    }

    /**
     * Whether the user may seek forward relative to the current position.
     * @return allowAdjustSeekPositionForward
    **/
    @JsonProperty("allowAdjustSeekPositionForward")
    public Boolean getAllowAdjustSeekPositionForward() {
        return allowAdjustSeekPositionForward;
    }

    /**
     * Whether the user may seek backwards relative to the current position.
     * @return allowAdjustSeekPositionBackwards
    **/
    @JsonProperty("allowAdjustSeekPositionBackwards")
    public Boolean getAllowAdjustSeekPositionBackwards() {
        return allowAdjustSeekPositionBackwards;
    }

    /**
     * Whether the user may move forward to the next track.
     * @return allowNext
    **/
    @JsonProperty("allowNext")
    public Boolean getAllowNext() {
        return allowNext;
    }

    /**
     * Whether the user may move backward to the previous track.
     * @return allowPrevious
    **/
    @JsonProperty("allowPrevious")
    public Boolean getAllowPrevious() {
        return allowPrevious;
    }

    /**
     * Get entities
     * @return entities
    **/
    @JsonProperty("entities")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity> getEntities() {
        return entities;
    }

    /**
     * The URL of the current media track.
     * @return url
    **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentVisibleOnScreenMediaTag interfacesAlexaPresentationAplComponentVisibleOnScreenMediaTag = (ComponentVisibleOnScreenMediaTag) o;
        return Objects.equals(this.positionInMilliseconds, interfacesAlexaPresentationAplComponentVisibleOnScreenMediaTag.positionInMilliseconds) &&
            Objects.equals(this.state, interfacesAlexaPresentationAplComponentVisibleOnScreenMediaTag.state) &&
            Objects.equals(this.allowAdjustSeekPositionForward, interfacesAlexaPresentationAplComponentVisibleOnScreenMediaTag.allowAdjustSeekPositionForward) &&
            Objects.equals(this.allowAdjustSeekPositionBackwards, interfacesAlexaPresentationAplComponentVisibleOnScreenMediaTag.allowAdjustSeekPositionBackwards) &&
            Objects.equals(this.allowNext, interfacesAlexaPresentationAplComponentVisibleOnScreenMediaTag.allowNext) &&
            Objects.equals(this.allowPrevious, interfacesAlexaPresentationAplComponentVisibleOnScreenMediaTag.allowPrevious) &&
            Objects.equals(this.entities, interfacesAlexaPresentationAplComponentVisibleOnScreenMediaTag.entities) &&
            Objects.equals(this.url, interfacesAlexaPresentationAplComponentVisibleOnScreenMediaTag.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(positionInMilliseconds, state, allowAdjustSeekPositionForward, allowAdjustSeekPositionBackwards, allowNext, allowPrevious, entities, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentVisibleOnScreenMediaTag {\n");
        
        sb.append("    positionInMilliseconds: ").append(toIndentedString(positionInMilliseconds)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    allowAdjustSeekPositionForward: ").append(toIndentedString(allowAdjustSeekPositionForward)).append("\n");
        sb.append("    allowAdjustSeekPositionBackwards: ").append(toIndentedString(allowAdjustSeekPositionBackwards)).append("\n");
        sb.append("    allowNext: ").append(toIndentedString(allowNext)).append("\n");
        sb.append("    allowPrevious: ").append(toIndentedString(allowPrevious)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
        private Integer positionInMilliseconds;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenMediaTagStateEnum state;
        private Boolean allowAdjustSeekPositionForward;
        private Boolean allowAdjustSeekPositionBackwards;
        private Boolean allowNext;
        private Boolean allowPrevious;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity> entities;
        private String url;

        private Builder() {}

        @JsonProperty("positionInMilliseconds")
        public Builder withPositionInMilliseconds(Integer positionInMilliseconds) {
            this.positionInMilliseconds = positionInMilliseconds;
            return this;
        }


        @JsonProperty("state")
        public Builder withState(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenMediaTagStateEnum state) {
            this.state = state;
            return this;
        }


        @JsonProperty("allowAdjustSeekPositionForward")
        public Builder withAllowAdjustSeekPositionForward(Boolean allowAdjustSeekPositionForward) {
            this.allowAdjustSeekPositionForward = allowAdjustSeekPositionForward;
            return this;
        }


        @JsonProperty("allowAdjustSeekPositionBackwards")
        public Builder withAllowAdjustSeekPositionBackwards(Boolean allowAdjustSeekPositionBackwards) {
            this.allowAdjustSeekPositionBackwards = allowAdjustSeekPositionBackwards;
            return this;
        }


        @JsonProperty("allowNext")
        public Builder withAllowNext(Boolean allowNext) {
            this.allowNext = allowNext;
            return this;
        }


        @JsonProperty("allowPrevious")
        public Builder withAllowPrevious(Boolean allowPrevious) {
            this.allowPrevious = allowPrevious;
            return this;
        }


        @JsonProperty("entities")
        public Builder withEntities(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity> entities) {
            this.entities = entities;
            return this;
        }

        public Builder addEntitiesItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity entitiesItem) {
            if (this.entities == null) {
                this.entities = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity>();
            }
            this.entities.add(entitiesItem);
            return this;
        }

        @JsonProperty("url")
        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }


        public ComponentVisibleOnScreenMediaTag build() {
            return new ComponentVisibleOnScreenMediaTag(this);
        }
    }
}

