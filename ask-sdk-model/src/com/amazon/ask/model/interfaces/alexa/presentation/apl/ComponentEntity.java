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
 * The entity context data which was attached to an element.
 */

@JsonDeserialize(builder = ComponentEntity.Builder.class)
public final class ComponentEntity {

    @JsonProperty("type")
    private String type = null;

    @JsonProperty("value")
    private String value = null;

    @JsonProperty("id")
    private String id = null;

    private ComponentEntity() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ComponentEntity(Builder builder) {
        if (builder.type != null) {
            this.type = builder.type;
        }
        if (builder.value != null) {
            this.value = builder.value;
        }
        if (builder.id != null) {
            this.id = builder.id;
        }
    }

    /**
     * Get type
     * @return type
    **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }


    /**
     * Get value
     * @return value
    **/
    @JsonProperty("value")
    public String getValue() {
        return value;
    }


    /**
     * Get id
     * @return id
    **/
    @JsonProperty("id")
    public String getId() {
        return id;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentEntity interfacesAlexaPresentationAplComponentEntity = (ComponentEntity) o;
        return Objects.equals(this.type, interfacesAlexaPresentationAplComponentEntity.type) &&
            Objects.equals(this.value, interfacesAlexaPresentationAplComponentEntity.value) &&
            Objects.equals(this.id, interfacesAlexaPresentationAplComponentEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentEntity {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        private String type;
        private String value;
        private String id;

        private Builder() {}

        @JsonProperty("type")

        public Builder withType(String type) {
            this.type = type;
            return this;
        }


        @JsonProperty("value")

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }


        @JsonProperty("id")

        public Builder withId(String id) {
            this.id = id;
            return this;
        }


        public ComponentEntity build() {
            return new ComponentEntity(this);
        }
    }
}

