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


package com.amazon.ask.model.interfaces.alexa.presentation.apla;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RenderDocumentDirective
 */

@JsonDeserialize(builder = RenderDocumentDirective.Builder.class)
public final class RenderDocumentDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("document")
    private Map<String, Object> document = new HashMap<String, Object>();

    @JsonProperty("datasources")
    private Map<String, Object> datasources = new HashMap<String, Object>();

    private RenderDocumentDirective() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private RenderDocumentDirective(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.APLA.RenderDocument";

        this.type = discriminatorValue;
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.document != null) {
            this.document = builder.document;
        }
        if (builder.datasources != null) {
            this.datasources = builder.datasources;
        }
    }

    /**
     * A unique identifier for the presentation.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * Depending on the document type, it represents either an entire APLA document or a reference Link to the document. In a Link object, the value of the 'src' should follow a URI format defined like 'doc://alexa/apla/documents/&amp;lt;document_id&amp;gt;'. The 'document_id' is a reference to the APLA document that the developer stores through APLA Authoring Tool.
     * @return document
    **/
    @JsonProperty("document")
    public Map<String, Object> getDocument() {
        return document;
    }


    /**
     * Data sources to bind to the document when rendering.
     * @return datasources
    **/
    @JsonProperty("datasources")
    public Map<String, Object> getDatasources() {
        return datasources;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RenderDocumentDirective interfacesAlexaPresentationAplaRenderDocumentDirective = (RenderDocumentDirective) o;
        return Objects.equals(this.token, interfacesAlexaPresentationAplaRenderDocumentDirective.token) &&
            Objects.equals(this.document, interfacesAlexaPresentationAplaRenderDocumentDirective.document) &&
            Objects.equals(this.datasources, interfacesAlexaPresentationAplaRenderDocumentDirective.datasources) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, document, datasources, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenderDocumentDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    document: ").append(toIndentedString(document)).append("\n");
        sb.append("    datasources: ").append(toIndentedString(datasources)).append("\n");
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
        private String token;
        private Map<String, Object> document;
        private Map<String, Object> datasources;

        private Builder() {}

        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
            return this;
        }


        @JsonProperty("document")

        public Builder withDocument(Map<String, Object> document) {
            this.document = document;
            return this;
        }

        public Builder putDocumentItem(String key, Object documentItem) {
            if (this.document == null) {
                this.document = new HashMap<String, Object>();
            }
            this.document.put(key, documentItem);
            return this;
        }

        @JsonProperty("datasources")

        public Builder withDatasources(Map<String, Object> datasources) {
            this.datasources = datasources;
            return this;
        }

        public Builder putDatasourcesItem(String key, Object datasourcesItem) {
            if (this.datasources == null) {
                this.datasources = new HashMap<String, Object>();
            }
            this.datasources.put(key, datasourcesItem);
            return this;
        }

        public RenderDocumentDirective build() {
            return new RenderDocumentDirective(this);
        }
    }
}

