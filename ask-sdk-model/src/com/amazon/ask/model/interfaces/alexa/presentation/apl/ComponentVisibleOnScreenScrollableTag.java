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
 * A scrollable region.
 */

@JsonDeserialize(builder = ComponentVisibleOnScreenScrollableTag.Builder.class)
public final class ComponentVisibleOnScreenScrollableTag {

    @JsonProperty("direction")
    private String direction = null;

    @JsonProperty("allowForward")
    private Boolean allowForward = null;

    @JsonProperty("allowBackward")
    private Boolean allowBackward = null;

    private ComponentVisibleOnScreenScrollableTag() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private ComponentVisibleOnScreenScrollableTag(Builder builder) {
        if (builder.direction != null) {
            this.direction = builder.direction;
        }
        if (builder.allowForward != null) {
            this.allowForward = builder.allowForward;
        }
        if (builder.allowBackward != null) {
            this.allowBackward = builder.allowBackward;
        }
    }

    /**
     * Get direction
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getDirectionAsString().
     *
     * @return direction
    **/
    
    public com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenScrollableTagDirectionEnum getDirection() {
        return com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenScrollableTagDirectionEnum.fromValue(direction);
    }

    /**
     * Get the underlying String value for direction.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return direction as a String value
    **/
    @JsonProperty("direction")
    public String getDirectionAsString() {
      return direction;
    }

    /**
     * Whether scrolling forward is accepted.
     * @return allowForward
    **/
    @JsonProperty("allowForward")
    public Boolean getAllowForward() {
        return allowForward;
    }


    /**
     * Whether scrolling backward is accepted.
     * @return allowBackward
    **/
    @JsonProperty("allowBackward")
    public Boolean getAllowBackward() {
        return allowBackward;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentVisibleOnScreenScrollableTag interfacesAlexaPresentationAplComponentVisibleOnScreenScrollableTag = (ComponentVisibleOnScreenScrollableTag) o;
        return Objects.equals(this.direction, interfacesAlexaPresentationAplComponentVisibleOnScreenScrollableTag.direction) &&
            Objects.equals(this.allowForward, interfacesAlexaPresentationAplComponentVisibleOnScreenScrollableTag.allowForward) &&
            Objects.equals(this.allowBackward, interfacesAlexaPresentationAplComponentVisibleOnScreenScrollableTag.allowBackward);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, allowForward, allowBackward);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentVisibleOnScreenScrollableTag {\n");
        
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    allowForward: ").append(toIndentedString(allowForward)).append("\n");
        sb.append("    allowBackward: ").append(toIndentedString(allowBackward)).append("\n");
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
        private String direction;
        private Boolean allowForward;
        private Boolean allowBackward;

        private Builder() {}

        @JsonProperty("direction")

        public Builder withDirection(String direction) {
          this.direction = direction;
          return this;
        }

        public Builder withDirection(com.amazon.ask.model.interfaces.alexa.presentation.apl.ComponentVisibleOnScreenScrollableTagDirectionEnum direction) {
            this.direction = direction != null ? direction.toString() : null;
            return this;
        }


        @JsonProperty("allowForward")

        public Builder withAllowForward(Boolean allowForward) {
            this.allowForward = allowForward;
            return this;
        }


        @JsonProperty("allowBackward")

        public Builder withAllowBackward(Boolean allowBackward) {
            this.allowBackward = allowBackward;
            return this;
        }


        public ComponentVisibleOnScreenScrollableTag build() {
            return new ComponentVisibleOnScreenScrollableTag(this);
        }
    }
}

