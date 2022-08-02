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
 * The type of dialog manager:  * AMAZON.Conversations - The Alexa Conversations (Coltrane) model for this skill.
 */

@JsonDeserialize(builder = AMAZONConversationsDialogManager.Builder.class)
public final class AMAZONConversationsDialogManager extends com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManager  {

    private AMAZONConversationsDialogManager() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AMAZONConversationsDialogManager(Builder builder) {
        String discriminatorValue = "AMAZON.Conversations";

        this.type = discriminatorValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AMAZONConversationsDialogManager {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

        private Builder() {}

        public AMAZONConversationsDialogManager build() {
            return new AMAZONConversationsDialogManager(this);
        }
    }
}

