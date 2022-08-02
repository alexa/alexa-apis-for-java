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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Android custom intent
 */

@JsonDeserialize(builder = AndroidCustomIntent.Builder.class)
public final class AndroidCustomIntent {

    @JsonProperty("component")
    private String component = null;

    @JsonProperty("action")
    private String action = null;

    private AndroidCustomIntent() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AndroidCustomIntent(Builder builder) {
        if (builder.component != null) {
            this.component = builder.component;
        }
        if (builder.action != null) {
            this.action = builder.action;
        }
    }

    /**
     * android component name
     * @return component
    **/
    @JsonProperty("component")
    public String getComponent() {
        return component;
    }


    /**
     * android intent action
     * @return action
    **/
    @JsonProperty("action")
    public String getAction() {
        return action;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AndroidCustomIntent v1SkillManifestAndroidCustomIntent = (AndroidCustomIntent) o;
        return Objects.equals(this.component, v1SkillManifestAndroidCustomIntent.component) &&
            Objects.equals(this.action, v1SkillManifestAndroidCustomIntent.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(component, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AndroidCustomIntent {\n");
        
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
        private String component;
        private String action;

        private Builder() {}

        @JsonProperty("component")

        public Builder withComponent(String component) {
            this.component = component;
            return this;
        }


        @JsonProperty("action")

        public Builder withAction(String action) {
            this.action = action;
            return this;
        }


        public AndroidCustomIntent build() {
            return new AndroidCustomIntent(this);
        }
    }
}

