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
 * The tags which were attached to an element.
 */

@JsonDeserialize(builder = ComponentVisibleOnScreenTags.Builder.class)
public final class ComponentVisibleOnScreenTags {

    @JsonProperty("checked")
    private Boolean checked = null;

    @JsonProperty("clickable")
    private Boolean clickable = null;

    @JsonProperty("disabled")
    private Boolean disabled = null;

    @JsonProperty("focused")
    private Boolean focused = null;

    @JsonProperty("list")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenListTag list = null;

    @JsonProperty("listItem")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenListItemTag listItem = null;

    @JsonProperty("media")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenMediaTag media = null;

    @JsonProperty("ordinal")
    private Integer ordinal = null;

    @JsonProperty("pager")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenPagerTag pager = null;

    @JsonProperty("scrollable")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenScrollableTag scrollable = null;

    @JsonProperty("spoken")
    private Boolean spoken = null;

    @JsonProperty("viewport")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenViewportTag viewport = null;

    public static Builder builder() {
        return new Builder();
    }

    private ComponentVisibleOnScreenTags(Builder builder) {
        if (builder.checked != null) {
            this.checked = builder.checked;
        }
        if (builder.clickable != null) {
            this.clickable = builder.clickable;
        }
        if (builder.disabled != null) {
            this.disabled = builder.disabled;
        }
        if (builder.focused != null) {
            this.focused = builder.focused;
        }
        if (builder.list != null) {
            this.list = builder.list;
        }
        if (builder.listItem != null) {
            this.listItem = builder.listItem;
        }
        if (builder.media != null) {
            this.media = builder.media;
        }
        if (builder.ordinal != null) {
            this.ordinal = builder.ordinal;
        }
        if (builder.pager != null) {
            this.pager = builder.pager;
        }
        if (builder.scrollable != null) {
            this.scrollable = builder.scrollable;
        }
        if (builder.spoken != null) {
            this.spoken = builder.spoken;
        }
        if (builder.viewport != null) {
            this.viewport = builder.viewport;
        }
    }

    /**
     * The checked state of a component that has two states.
     * @return checked
    **/
    @JsonProperty("checked")
    public Boolean getChecked() {
        return checked;
    }


    /**
     * A button or item that can be pressed.
     * @return clickable
    **/
    @JsonProperty("clickable")
    public Boolean getClickable() {
        return clickable;
    }


    /**
     * Whether the element is disabled.
     * @return disabled
    **/
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }


    /**
     * The focused state of a component that can take focus.
     * @return focused
    **/
    @JsonProperty("focused")
    public Boolean getFocused() {
        return focused;
    }


    /**
     * An ordered list of items.
     * @return list
    **/
    @JsonProperty("list")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenListTag getList() {
        return list;
    }


    /**
     * An element in a sequence.
     * @return listItem
    **/
    @JsonProperty("listItem")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenListItemTag getListItem() {
        return listItem;
    }


    /**
     * Media player
     * @return media
    **/
    @JsonProperty("media")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenMediaTag getMedia() {
        return media;
    }


    /**
     * A visibly numbered element.
     * @return ordinal
    **/
    @JsonProperty("ordinal")
    public Integer getOrdinal() {
        return ordinal;
    }


    /**
     * A collection of items that are displayed one at a time.
     * @return pager
    **/
    @JsonProperty("pager")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenPagerTag getPager() {
        return pager;
    }


    /**
     * A scrolling region
     * @return scrollable
    **/
    @JsonProperty("scrollable")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenScrollableTag getScrollable() {
        return scrollable;
    }


    /**
     * A region of the screen that can be read out by TTS
     * @return spoken
    **/
    @JsonProperty("spoken")
    public Boolean getSpoken() {
        return spoken;
    }


    /**
     * The entire screen in which a document is rendered.
     * @return viewport
    **/
    @JsonProperty("viewport")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenViewportTag getViewport() {
        return viewport;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentVisibleOnScreenTags interfacesAlexaPresentationAplComponentVisibleOnScreenTags = (ComponentVisibleOnScreenTags) o;
        return Objects.equals(this.checked, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.checked) &&
            Objects.equals(this.clickable, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.clickable) &&
            Objects.equals(this.disabled, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.disabled) &&
            Objects.equals(this.focused, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.focused) &&
            Objects.equals(this.list, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.list) &&
            Objects.equals(this.listItem, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.listItem) &&
            Objects.equals(this.media, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.media) &&
            Objects.equals(this.ordinal, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.ordinal) &&
            Objects.equals(this.pager, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.pager) &&
            Objects.equals(this.scrollable, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.scrollable) &&
            Objects.equals(this.spoken, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.spoken) &&
            Objects.equals(this.viewport, interfacesAlexaPresentationAplComponentVisibleOnScreenTags.viewport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checked, clickable, disabled, focused, list, listItem, media, ordinal, pager, scrollable, spoken, viewport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentVisibleOnScreenTags {\n");
        
        sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
        sb.append("    clickable: ").append(toIndentedString(clickable)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    focused: ").append(toIndentedString(focused)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    listItem: ").append(toIndentedString(listItem)).append("\n");
        sb.append("    media: ").append(toIndentedString(media)).append("\n");
        sb.append("    ordinal: ").append(toIndentedString(ordinal)).append("\n");
        sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
        sb.append("    scrollable: ").append(toIndentedString(scrollable)).append("\n");
        sb.append("    spoken: ").append(toIndentedString(spoken)).append("\n");
        sb.append("    viewport: ").append(toIndentedString(viewport)).append("\n");
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
        private Boolean checked;
        private Boolean clickable;
        private Boolean disabled;
        private Boolean focused;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenListTag list;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenListItemTag listItem;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenMediaTag media;
        private Integer ordinal;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenPagerTag pager;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenScrollableTag scrollable;
        private Boolean spoken;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenViewportTag viewport;

        private Builder() {}

        @JsonProperty("checked")

        public Builder withChecked(Boolean checked) {
            this.checked = checked;
            return this;
        }


        @JsonProperty("clickable")

        public Builder withClickable(Boolean clickable) {
            this.clickable = clickable;
            return this;
        }


        @JsonProperty("disabled")

        public Builder withDisabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }


        @JsonProperty("focused")

        public Builder withFocused(Boolean focused) {
            this.focused = focused;
            return this;
        }


        @JsonProperty("list")

        public Builder withList(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenListTag list) {
            this.list = list;
            return this;
        }


        @JsonProperty("listItem")

        public Builder withListItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenListItemTag listItem) {
            this.listItem = listItem;
            return this;
        }


        @JsonProperty("media")

        public Builder withMedia(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenMediaTag media) {
            this.media = media;
            return this;
        }


        @JsonProperty("ordinal")

        public Builder withOrdinal(Integer ordinal) {
            this.ordinal = ordinal;
            return this;
        }


        @JsonProperty("pager")

        public Builder withPager(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenPagerTag pager) {
            this.pager = pager;
            return this;
        }


        @JsonProperty("scrollable")

        public Builder withScrollable(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenScrollableTag scrollable) {
            this.scrollable = scrollable;
            return this;
        }


        @JsonProperty("spoken")

        public Builder withSpoken(Boolean spoken) {
            this.spoken = spoken;
            return this;
        }


        @JsonProperty("viewport")

        public Builder withViewport(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenViewportTag viewport) {
            this.viewport = viewport;
            return this;
        }


        public ComponentVisibleOnScreenTags build() {
            return new ComponentVisibleOnScreenTags(this);
        }
    }
}

