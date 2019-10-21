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


package com.amazon.ask.model.interfaces.viewport.aplt;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InterSegment
 */

@JsonDeserialize(builder = InterSegment.Builder.class)
public final class InterSegment {

    @JsonProperty("x")
    private Integer x = null;

    @JsonProperty("y")
    private Integer y = null;

    @JsonProperty("characters")
    private String characters = null;

    public static Builder builder() {
        return new Builder();
    }

    private InterSegment(Builder builder) {
        if (builder.x != null) {
            this.x = builder.x;
        }
        if (builder.y != null) {
            this.y = builder.y;
        }
        if (builder.characters != null) {
            this.characters = builder.characters;
        }
    }

    /**
     * horizontal position (0-based index) in characters
     * minimum: 0
     * @return x
    **/
    @JsonProperty("x")
    public Integer getX() {
        return x;
    }

    /**
     * vertical position (0-based index) in rows
     * minimum: 0
     * @return y
    **/
    @JsonProperty("y")
    public Integer getY() {
        return y;
    }

    /**
     * list of characters that can be rendered
     * @return characters
    **/
    @JsonProperty("characters")
    public String getCharacters() {
        return characters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InterSegment interfacesViewportApltInterSegment = (InterSegment) o;
        return Objects.equals(this.x, interfacesViewportApltInterSegment.x) &&
            Objects.equals(this.y, interfacesViewportApltInterSegment.y) &&
            Objects.equals(this.characters, interfacesViewportApltInterSegment.characters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, characters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterSegment {\n");
        
        sb.append("    x: ").append(toIndentedString(x)).append("\n");
        sb.append("    y: ").append(toIndentedString(y)).append("\n");
        sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
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
        private Integer x;
        private Integer y;
        private String characters;

        private Builder() {}

        @JsonProperty("x")
        public Builder withX(Integer x) {
            this.x = x;
            return this;
        }


        @JsonProperty("y")
        public Builder withY(Integer y) {
            this.y = y;
            return this;
        }


        @JsonProperty("characters")
        public Builder withCharacters(String characters) {
            this.characters = characters;
            return this;
        }


        public InterSegment build() {
            return new InterSegment(this);
        }
    }
}

