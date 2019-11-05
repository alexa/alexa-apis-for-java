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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Definition of a visible APL element shown on screen.
 */

@JsonDeserialize(builder = ComponentVisibleOnScreen.Builder.class)
public final class ComponentVisibleOnScreen {

    @JsonProperty("children")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen> children = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen>();

    @JsonProperty("entities")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity> entities = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity>();

    @JsonProperty("id")
    private String id = null;

    @JsonProperty("position")
    private String position = null;

    @JsonProperty("tags")
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenTags tags = null;

    @JsonProperty("transform")
    private List<BigDecimal> transform = new ArrayList<BigDecimal>();

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("uid")
    private String uid = null;

    @JsonProperty("visibility")
    private Float visibility = null;

    public static Builder builder() {
        return new Builder();
    }

    private ComponentVisibleOnScreen(Builder builder) {
        if (builder.children != null) {
            this.children = builder.children;
        }
        if (builder.entities != null) {
            this.entities = builder.entities;
        }
        if (builder.id != null) {
            this.id = builder.id;
        }
        if (builder.position != null) {
            this.position = builder.position;
        }
        if (builder.tags != null) {
            this.tags = builder.tags;
        }
        if (builder.transform != null) {
            this.transform = builder.transform;
        }
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.uid != null) {
            this.uid = builder.uid;
        }
        if (builder.visibility != null) {
            this.visibility = builder.visibility;
        }
    }

    /**
     * All child elements of the displayed element.
     * @return children
    **/
    @JsonProperty("children")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen> getChildren() {
        return children;
    }

    /**
     * The entities which were attached to the element.
     * @return entities
    **/
    @JsonProperty("entities")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity> getEntities() {
        return entities;
    }

    /**
     * The id of the element.
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Global position of the element (as seen by the device user).
     * @return position
    **/
    @JsonProperty("position")
    public String getPosition() {
        return position;
    }

    /**
     * The tags which were attached to the element.
     * @return tags
    **/
    @JsonProperty("tags")
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenTags getTags() {
        return tags;
    }

    /**
     * The transform which was applied to the element's position, specified as a 6-element numeric array containing the 2D homogeneous transformation matrix. The center of the transformation coordinate system is the center of the component. The transformation array is ordered as [A,B,C,D,Tx,Ty]. For more information refer to the W3C's CSS transforms documentation. 
     * @return transform
    **/
    @JsonProperty("transform")
    public List<BigDecimal> getTransform() {
        return transform;
    }

    /**
     * The visual appearance of the element.
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * The system-generated uid of the element.
     * @return uid
    **/
    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    /**
     * The relative visibility of the element. 0 = not visible, 1 = fully visible on screen.
     * @return visibility
    **/
    @JsonProperty("visibility")
    public Float getVisibility() {
        return visibility;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentVisibleOnScreen interfacesAlexaPresentationAplComponentVisibleOnScreen = (ComponentVisibleOnScreen) o;
        return Objects.equals(this.children, interfacesAlexaPresentationAplComponentVisibleOnScreen.children) &&
            Objects.equals(this.entities, interfacesAlexaPresentationAplComponentVisibleOnScreen.entities) &&
            Objects.equals(this.id, interfacesAlexaPresentationAplComponentVisibleOnScreen.id) &&
            Objects.equals(this.position, interfacesAlexaPresentationAplComponentVisibleOnScreen.position) &&
            Objects.equals(this.tags, interfacesAlexaPresentationAplComponentVisibleOnScreen.tags) &&
            Objects.equals(this.transform, interfacesAlexaPresentationAplComponentVisibleOnScreen.transform) &&
            Objects.equals(this.type, interfacesAlexaPresentationAplComponentVisibleOnScreen.type) &&
            Objects.equals(this.uid, interfacesAlexaPresentationAplComponentVisibleOnScreen.uid) &&
            Objects.equals(this.visibility, interfacesAlexaPresentationAplComponentVisibleOnScreen.visibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(children, entities, id, position, tags, transform, type, uid, visibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentVisibleOnScreen {\n");
        
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    transform: ").append(toIndentedString(transform)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen> children;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentEntity> entities;
        private String id;
        private String position;
        private com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenTags tags;
        private List<BigDecimal> transform;
        private String type;
        private String uid;
        private Float visibility;

        private Builder() {}

        @JsonProperty("children")
        public Builder withChildren(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen> children) {
            this.children = children;
            return this;
        }

        public Builder addChildrenItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen childrenItem) {
            if (this.children == null) {
                this.children = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreen>();
            }
            this.children.add(childrenItem);
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

        @JsonProperty("id")
        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        @JsonProperty("position")
        public Builder withPosition(String position) {
            this.position = position;
            return this;
        }


        @JsonProperty("tags")
        public Builder withTags(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenTags tags) {
            this.tags = tags;
            return this;
        }


        @JsonProperty("transform")
        public Builder withTransform(List<BigDecimal> transform) {
            this.transform = transform;
            return this;
        }

        public Builder addTransformItem(BigDecimal transformItem) {
            if (this.transform == null) {
                this.transform = new ArrayList<BigDecimal>();
            }
            this.transform.add(transformItem);
            return this;
        }

        @JsonProperty("type")
        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("uid")
        public Builder withUid(String uid) {
            this.uid = uid;
            return this;
        }


        @JsonProperty("visibility")
        public Builder withVisibility(Float visibility) {
            this.visibility = visibility;
            return this;
        }


        public ComponentVisibleOnScreen build() {
            return new ComponentVisibleOnScreen(this);
        }
    }
}

