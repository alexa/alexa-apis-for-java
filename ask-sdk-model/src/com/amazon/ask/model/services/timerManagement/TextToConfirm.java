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
 * When the operation type is \&quot;LAUNCH_TASK\&quot;, confirm with the customer at the expiration of the timer.
 */

@JsonDeserialize(builder = TextToConfirm.Builder.class)
public final class TextToConfirm {

    @JsonProperty("locale")
    private String locale = null;

    @JsonProperty("text")
    private String text = null;

    private TextToConfirm() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private TextToConfirm(Builder builder) {
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.text != null) {
            this.text = builder.text;
        }
    }

    /**
     * The locale in which the confirmation text is rendered.
     * @return locale
    **/
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }


    /**
     * Prompt will be given to user upon trigger dismissal or timer expiry (depending on playAudible). %s (placeholder for “continue with Skill Name”) is mandatory.
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
        TextToConfirm servicesTimerManagementTextToConfirm = (TextToConfirm) o;
        return Objects.equals(this.locale, servicesTimerManagementTextToConfirm.locale) &&
            Objects.equals(this.text, servicesTimerManagementTextToConfirm.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextToConfirm {\n");
        
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


        public TextToConfirm build() {
            return new TextToConfirm(this);
        }
    }
}

