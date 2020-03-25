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
 * Updates the content of an dynamicIndexList datasource which has been previously communicated to an Alexa device.
 */

@JsonDeserialize(builder = UpdateIndexListDataDirective.Builder.class)
public final class UpdateIndexListDataDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("token")
    private String token = null;

    @JsonProperty("listId")
    private String listId = null;

    @JsonProperty("listVersion")
    private Integer listVersion = null;

    @JsonProperty("operations")
    private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.Operation> operations = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.Operation>();

    public static Builder builder() {
        return new Builder();
    }

    private UpdateIndexListDataDirective(Builder builder) {
        String discriminatorValue = "Alexa.Presentation.APL.UpdateIndexListData";

        this.type = discriminatorValue;
        if (builder.token != null) {
            this.token = builder.token;
        }
        if (builder.listId != null) {
            this.listId = builder.listId;
        }
        if (builder.listVersion != null) {
            this.listVersion = builder.listVersion;
        }
        if (builder.operations != null) {
            this.operations = builder.operations;
        }
    }

    /**
     * The unique identifier for the presentation containing the dynamicIndexList.
     * @return token
    **/
    @JsonProperty("token")
    public String getToken() {
        return token;
    }


    /**
     * The identifier of the dynamicIndexList to update.
     * @return listId
    **/
    @JsonProperty("listId")
    public String getListId() {
        return listId;
    }


    /**
     * The new version of the list after applying the updates specified in this directive. List versions increase sequentially, implicitly starting at 0 for the definition specified in the presentation's RenderDocument directive.
     * @return listVersion
    **/
    @JsonProperty("listVersion")
    public Integer getListVersion() {
        return listVersion;
    }


    /**
     * An array of changes which are to be applied to the items in the dynamicIndexList.
     * @return operations
    **/
    @JsonProperty("operations")
    public List<com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.Operation> getOperations() {
        return operations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateIndexListDataDirective interfacesAlexaPresentationAplUpdateIndexListDataDirective = (UpdateIndexListDataDirective) o;
        return Objects.equals(this.token, interfacesAlexaPresentationAplUpdateIndexListDataDirective.token) &&
            Objects.equals(this.listId, interfacesAlexaPresentationAplUpdateIndexListDataDirective.listId) &&
            Objects.equals(this.listVersion, interfacesAlexaPresentationAplUpdateIndexListDataDirective.listVersion) &&
            Objects.equals(this.operations, interfacesAlexaPresentationAplUpdateIndexListDataDirective.operations) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, listId, listVersion, operations, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIndexListDataDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
        sb.append("    listVersion: ").append(toIndentedString(listVersion)).append("\n");
        sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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
        private String listId;
        private Integer listVersion;
        private List<com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.Operation> operations;

        private Builder() {}

        @JsonProperty("token")

        public Builder withToken(String token) {
            this.token = token;
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


        @JsonProperty("operations")

        public Builder withOperations(List<com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.Operation> operations) {
            this.operations = operations;
            return this;
        }

        public Builder addOperationsItem(com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.Operation operationsItem) {
            if (this.operations == null) {
                this.operations = new ArrayList<com.amazon.ask.model.interfaces.alexa.presentation.apl.listoperations.Operation>();
            }
            this.operations.add(operationsItem);
            return this;
        }

        public UpdateIndexListDataDirective build() {
            return new UpdateIndexListDataDirective(this);
        }
    }
}

