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


package com.amazon.ask.model.ui;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OutputSpeech
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = com.amazon.ask.model.ui.SsmlOutputSpeech.class, name = "SSML"),
  @JsonSubTypes.Type(value = com.amazon.ask.model.ui.PlainTextOutputSpeech.class, name = "PlainText"),
})
public abstract class OutputSpeech {

    protected String type = null;

    @JsonProperty("playBehavior")
    protected String playBehavior = null;

    protected OutputSpeech() {
    }

    /**
     * Get type
     * @return type
    **/
    @JsonIgnore
    public String getType() {
        return type;
    }


    /**
     * Get playBehavior
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getPlayBehaviorAsString().
     *
     * @return playBehavior
    **/
    
    public com.amazon.ask.model.ui.PlayBehavior getPlayBehavior() {
        return com.amazon.ask.model.ui.PlayBehavior.fromValue(playBehavior);
    }

    /**
     * Get the underlying String value for playBehavior.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return playBehavior as a String value
    **/
    @JsonProperty("playBehavior")
    public String getPlayBehaviorAsString() {
      return playBehavior;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputSpeech uiOutputSpeech = (OutputSpeech) o;
        return Objects.equals(this.type, uiOutputSpeech.type) &&
            Objects.equals(this.playBehavior, uiOutputSpeech.playBehavior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, playBehavior);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputSpeech {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    playBehavior: ").append(toIndentedString(playBehavior)).append("\n");
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

