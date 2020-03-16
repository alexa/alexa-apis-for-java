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


package com.amazon.ask.model.services.timerManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * When the operation type is \&quot;ANNOUNCE\&quot;, announces a certain text that the developer wants to be read out at the expiration of the timer.
 */

@JsonDeserialize(builder = TextToAnnounce.Builder.class)
public final class TextToAnnounce {

    @JsonProperty("locale")
    private String locale = null;

    @JsonProperty("text")
    private String text = null;

    public static Builder builder() {
        return new Builder();
    }

    private TextToAnnounce(Builder builder) {
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.text != null) {
            this.text = builder.text;
        }
    }

    /**
     * The locale in which the announcement text is rendered.
     * @return locale
    **/
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }


    /**
     * If provided, triggerText will be delivered by Timers speechlet upon trigger dismissal or immediately upon timer expiry if playAudible = false.
     * @return text
    **/
    @JsonProperty("text")
    public String getText() {
        return text;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextToAnnounce servicesTimerManagementTextToAnnounce = (TextToAnnounce) o;
        return Objects.equals(this.locale, servicesTimerManagementTextToAnnounce.locale) &&
            Objects.equals(this.text, servicesTimerManagementTextToAnnounce.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextToAnnounce {\n");
        
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
        private String locale;
        private String text;

        private Builder() {}

        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("text")

        public Builder withText(String text) {
            this.text = text;
            return this;
        }


        public TextToAnnounce build() {
            return new TextToAnnounce(this);
        }
    }
}

