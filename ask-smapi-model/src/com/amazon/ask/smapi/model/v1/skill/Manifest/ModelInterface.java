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
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ModelInterface
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.Manifest.AlexaPresentationAplInterface.class, name = "ALEXA_PRESENTATION_APL"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.Manifest.AppLinkInterface.class, name = "APP_LINKS"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.Manifest.AlexaPresentationHtmlInterface.class, name = "ALEXA_PRESENTATION_HTML"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.Manifest.AudioInterface.class, name = "AUDIO_PLAYER"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.Manifest.GameEngineInterface.class, name = "GAME_ENGINE"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.Manifest.AppLinkV2Interface.class, name = "APP_LINKS_V2"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterface.class, name = "RENDER_TEMPLATE"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.Manifest.GadgetControllerInterface.class, name = "GADGET_CONTROLLER"),
  @JsonSubTypes.Type(value = com.amazon.ask.smapi.model.v1.skill.Manifest.VideoAppInterface.class, name = "VIDEO_APP"),
})
public abstract class ModelInterface {

    protected String type = null;

    protected ModelInterface() {
    }

    /**
     * Get type
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelInterface v1SkillManifestInterface = (ModelInterface) o;
        return Objects.equals(this.type, v1SkillManifestInterface.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelInterface {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
  
}

