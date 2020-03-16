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


package com.amazon.ask.model.interfaces.alexa.comms.messagingcontroller;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * A map whose key is the new status and value is the message ID list. The status of the messages whose IDs are in the list will be updated to the new status from the key. 
 */

@JsonDeserialize(builder = StatusMap.Builder.class)
public final class StatusMap {

    @JsonProperty("read")
    private List<String> read = new ArrayList<String>();

    @JsonProperty("deleted")
    private List<String> deleted = new ArrayList<String>();

    public static Builder builder() {
        return new Builder();
    }

    private StatusMap(Builder builder) {
        if (builder.read != null) {
            this.read = builder.read;
        }
        if (builder.deleted != null) {
            this.deleted = builder.deleted;
        }
    }

    /**
     * List of read messages
     * @return read
    **/
    @JsonProperty("read")
    public List<String> getRead() {
        return read;
    }


    /**
     * List of deleted messages
     * @return deleted
    **/
    @JsonProperty("deleted")
    public List<String> getDeleted() {
        return deleted;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StatusMap interfacesAlexaCommsMessagingcontrollerStatusMap = (StatusMap) o;
        return Objects.equals(this.read, interfacesAlexaCommsMessagingcontrollerStatusMap.read) &&
            Objects.equals(this.deleted, interfacesAlexaCommsMessagingcontrollerStatusMap.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(read, deleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusMap {\n");
        
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
        private List<String> read;
        private List<String> deleted;

        private Builder() {}

        @JsonProperty("read")

        public Builder withRead(List<String> read) {
            this.read = read;
            return this;
        }

        public Builder addReadItem(String readItem) {
            if (this.read == null) {
                this.read = new ArrayList<String>();
            }
            this.read.add(readItem);
            return this;
        }

        @JsonProperty("deleted")

        public Builder withDeleted(List<String> deleted) {
            this.deleted = deleted;
            return this;
        }

        public Builder addDeletedItem(String deletedItem) {
            if (this.deleted == null) {
                this.deleted = new ArrayList<String>();
            }
            this.deleted.add(deletedItem);
            return this;
        }

        public StatusMap build() {
            return new StatusMap(this);
        }
    }
}

