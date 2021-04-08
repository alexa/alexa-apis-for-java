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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Returned in response to a LoadTokenListData event, containing the requested items and metadata for further interaction.
 */

@JsonDeserialize(builder = SendTokenListDataDirective.Builder.class)
public final class SendTokenListDataDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("correlationToken")
    private String correlationToken = null;

    @JsonProperty("listId")
    private String listId = null;

    @JsonProperty("pageToken")
    private String pageToken = null;

    @JsonProperty("nextPageToken")
    private String nextPageToken = null;

    @JsonProperty("items")
    private List<Object> items = new ArrayList<Object>();

    public static Builder builder() {
        return new Builder();
    }

    private SendTokenListDataDirective(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.APL.SendTokenListData";

        this.type = discriminatorValue;
        if (builder.correlationToken != null) {
            this.correlationToken = builder.correlationToken;
        }
        if (builder.listId != null) {
            this.listId = builder.listId;
        }
        if (builder.pageToken != null) {
            this.pageToken = builder.pageToken;
        }
        if (builder.nextPageToken != null) {
            this.nextPageToken = builder.nextPageToken;
        }
        if (builder.items != null) {
            this.items = builder.items;
        }
    }

    /**
     * The correlation token supplied in the LoadTokenListData event. This parameter is mandatory if the skill is responding to a LoadTokenListData request, the skill response will be rejected if the expected correlationToken is not specified.
     * @return correlationToken
    **/
    @JsonProperty("correlationToken")
    public String getCorrelationToken() {
        return correlationToken;
    }


    /**
     * The identifier of the list whose items are contained in this response.
     * @return listId
    **/
    @JsonProperty("listId")
    public String getListId() {
        return listId;
    }


    /**
     * Opaque token for the array of items which are contained in this response. Ignored by the system if correlationToken is specified, but considered less cognitive overhead to have the developer always include &amp; assists platform debugging.
     * @return pageToken
    **/
    @JsonProperty("pageToken")
    public String getPageToken() {
        return pageToken;
    }


    /**
     * Opaque token to retrieve the next page of list items data. Absence of this property indicates that the last item in the list has been reached in the scroll direction.
     * @return nextPageToken
    **/
    @JsonProperty("nextPageToken")
    public String getNextPageToken() {
        return nextPageToken;
    }


    /**
     * Array of objects to be added to the device cache.
     * @return items
    **/
    @JsonProperty("items")
    public List<Object> getItems() {
        return items;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SendTokenListDataDirective interfacesAlexaPresentationAplSendTokenListDataDirective = (SendTokenListDataDirective) o;
        return Objects.equals(this.correlationToken, interfacesAlexaPresentationAplSendTokenListDataDirective.correlationToken) &&
            Objects.equals(this.listId, interfacesAlexaPresentationAplSendTokenListDataDirective.listId) &&
            Objects.equals(this.pageToken, interfacesAlexaPresentationAplSendTokenListDataDirective.pageToken) &&
            Objects.equals(this.nextPageToken, interfacesAlexaPresentationAplSendTokenListDataDirective.nextPageToken) &&
            Objects.equals(this.items, interfacesAlexaPresentationAplSendTokenListDataDirective.items) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationToken, listId, pageToken, nextPageToken, items, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendTokenListDataDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    correlationToken: ").append(toIndentedString(correlationToken)).append("\n");
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
        sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
        sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
        private String correlationToken;
        private String listId;
        private String pageToken;
        private String nextPageToken;
        private List<Object> items;

        private Builder() {}

        @JsonProperty("correlationToken")

        public Builder withCorrelationToken(String correlationToken) {
            this.correlationToken = correlationToken;
            return this;
        }


        @JsonProperty("listId")

        public Builder withListId(String listId) {
            this.listId = listId;
            return this;
        }


        @JsonProperty("pageToken")

        public Builder withPageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }


        @JsonProperty("nextPageToken")

        public Builder withNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }


        @JsonProperty("items")

        public Builder withItems(List<Object> items) {
            this.items = items;
            return this;
        }

        public Builder addItemsItem(Object itemsItem) {
            if (this.items == null) {
                this.items = new ArrayList<Object>();
            }
            this.items.add(itemsItem);
            return this;
        }

        public SendTokenListDataDirective build() {
            return new SendTokenListDataDirective(this);
        }
    }
}

