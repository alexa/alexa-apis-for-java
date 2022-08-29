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
 * Returned in response to a LoadIndexListData event, containing the requested items and metadata for further interaction.
 */

@JsonDeserialize(builder = SendIndexListDataDirective.Builder.class)
public final class SendIndexListDataDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("correlationToken")
    private String correlationToken = null;

    @JsonProperty("listId")
    private String listId = null;

    @JsonProperty("listVersion")
    private Integer listVersion = null;

    @JsonProperty("startIndex")
    private Integer startIndex = null;

    @JsonProperty("minimumInclusiveIndex")
    private Integer minimumInclusiveIndex = null;

    @JsonProperty("maximumExclusiveIndex")
    private Integer maximumExclusiveIndex = null;

    @JsonProperty("items")
    private List<Object> items = new ArrayList<Object>();

    private SendIndexListDataDirective() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private SendIndexListDataDirective(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.APL.SendIndexListData";

        this.type = discriminatorValue;
        if (builder.correlationToken != null) {
            this.correlationToken = builder.correlationToken;
        }
        if (builder.listId != null) {
            this.listId = builder.listId;
        }
        if (builder.listVersion != null) {
            this.listVersion = builder.listVersion;
        }
        if (builder.startIndex != null) {
            this.startIndex = builder.startIndex;
        }
        if (builder.minimumInclusiveIndex != null) {
            this.minimumInclusiveIndex = builder.minimumInclusiveIndex;
        }
        if (builder.maximumExclusiveIndex != null) {
            this.maximumExclusiveIndex = builder.maximumExclusiveIndex;
        }
        if (builder.items != null) {
            this.items = builder.items;
        }
    }

    /**
     * The correlation token supplied in the LoadTokenListData event. This parameter is mandatory if the skill is responding to a LoadIndexListData request, the skill response will be rejected if the expected correlationToken is not specified.
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
     * The new version of the list after loading the items supplied in this directive. List versions increase sequentially, implicitly starting at 0 for the definition specified in the presentation's RenderDocument directive.
     * @return listVersion
    **/
    @JsonProperty("listVersion")
    public Integer getListVersion() {
        return listVersion;
    }


    /**
     * Index of the first element in the items array. 
     * @return startIndex
    **/
    @JsonProperty("startIndex")
    public Integer getStartIndex() {
        return startIndex;
    }


    /**
     * The index of the 1st item in the skill-managed array. When populated, this value replaces any value that was specified in a previous interaction. Continued absence of this property indicates that the minimum index is not yet known and further backwards scrolling is possible. If this is equal to the index of the 1st item returned then no further backwards scrolling is possible.
     * @return minimumInclusiveIndex
    **/
    @JsonProperty("minimumInclusiveIndex")
    public Integer getMinimumInclusiveIndex() {
        return minimumInclusiveIndex;
    }


    /**
     * The last valid index of the skill-managed array plus one, i.e. exclusive value. When populated, this value replaces any value that was specified in a previous interaction. Continued absence of this property indicates that the maximum index is not yet known and further forwards scrolling is possible. If this is one more than the index of the last item returned then no further forwards scrolling is possible.
     * @return maximumExclusiveIndex
    **/
    @JsonProperty("maximumExclusiveIndex")
    public Integer getMaximumExclusiveIndex() {
        return maximumExclusiveIndex;
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
        SendIndexListDataDirective interfacesAlexaPresentationAplSendIndexListDataDirective = (SendIndexListDataDirective) o;
        return Objects.equals(this.correlationToken, interfacesAlexaPresentationAplSendIndexListDataDirective.correlationToken) &&
            Objects.equals(this.listId, interfacesAlexaPresentationAplSendIndexListDataDirective.listId) &&
            Objects.equals(this.listVersion, interfacesAlexaPresentationAplSendIndexListDataDirective.listVersion) &&
            Objects.equals(this.startIndex, interfacesAlexaPresentationAplSendIndexListDataDirective.startIndex) &&
            Objects.equals(this.minimumInclusiveIndex, interfacesAlexaPresentationAplSendIndexListDataDirective.minimumInclusiveIndex) &&
            Objects.equals(this.maximumExclusiveIndex, interfacesAlexaPresentationAplSendIndexListDataDirective.maximumExclusiveIndex) &&
            Objects.equals(this.items, interfacesAlexaPresentationAplSendIndexListDataDirective.items) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(correlationToken, listId, listVersion, startIndex, minimumInclusiveIndex, maximumExclusiveIndex, items, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendIndexListDataDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    correlationToken: ").append(toIndentedString(correlationToken)).append("\n");
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
        sb.append("    listVersion: ").append(toIndentedString(listVersion)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    minimumInclusiveIndex: ").append(toIndentedString(minimumInclusiveIndex)).append("\n");
        sb.append("    maximumExclusiveIndex: ").append(toIndentedString(maximumExclusiveIndex)).append("\n");
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
        private Integer listVersion;
        private Integer startIndex;
        private Integer minimumInclusiveIndex;
        private Integer maximumExclusiveIndex;
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


        @JsonProperty("listVersion")

        public Builder withListVersion(Integer listVersion) {
            this.listVersion = listVersion;
            return this;
        }


        @JsonProperty("startIndex")

        public Builder withStartIndex(Integer startIndex) {
            this.startIndex = startIndex;
            return this;
        }


        @JsonProperty("minimumInclusiveIndex")

        public Builder withMinimumInclusiveIndex(Integer minimumInclusiveIndex) {
            this.minimumInclusiveIndex = minimumInclusiveIndex;
            return this;
        }


        @JsonProperty("maximumExclusiveIndex")

        public Builder withMaximumExclusiveIndex(Integer maximumExclusiveIndex) {
            this.maximumExclusiveIndex = maximumExclusiveIndex;
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

        public SendIndexListDataDirective build() {
            return new SendIndexListDataDirective(this);
        }
    }
}

