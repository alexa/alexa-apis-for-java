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


package com.amazon.ask.model.services.reminderManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SpokenText
 */

@JsonDeserialize(builder = SpokenText.Builder.class)
public final class SpokenText {

    @JsonProperty("locale")
    private String locale = null;

    @JsonProperty("ssml")
    private String ssml = null;

    @JsonProperty("text")
    private String text = null;

    private SpokenText() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SpokenText(Builder builder) {
        if (builder.locale != null) {
            this.locale = builder.locale;
        }
        if (builder.ssml != null) {
            this.ssml = builder.ssml;
        }
        if (builder.text != null) {
            this.text = builder.text;
        }
    }

    /**
     * The locale in which the spoken text is rendered. e.g. en-US
     * @return locale
    **/
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }


    /**
     * Spoken text in SSML format.
     * @return ssml
    **/
    @JsonProperty("ssml")
    public String getSsml() {
        return ssml;
    }


    /**
     * Spoken text in plain text format.
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
        SpokenText servicesReminderManagementSpokenText = (SpokenText) o;
        return Objects.equals(this.locale, servicesReminderManagementSpokenText.locale) &&
            Objects.equals(this.ssml, servicesReminderManagementSpokenText.ssml) &&
            Objects.equals(this.text, servicesReminderManagementSpokenText.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale, ssml, text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpokenText {\n");
        
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    ssml: ").append(toIndentedString(ssml)).append("\n");
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
        private String ssml;
        private String text;

        private Builder() {}

        @JsonProperty("locale")

        public Builder withLocale(String locale) {
            this.locale = locale;
            return this;
        }


        @JsonProperty("ssml")

        public Builder withSsml(String ssml) {
            this.ssml = ssml;
            return this;
        }


        @JsonProperty("text")

        public Builder withText(String text) {
            this.text = text;
            return this;
        }


        public SpokenText build() {
            return new SpokenText(this);
        }
    }
}

