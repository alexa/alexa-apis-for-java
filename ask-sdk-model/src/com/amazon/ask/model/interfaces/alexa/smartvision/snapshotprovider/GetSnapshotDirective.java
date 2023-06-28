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


package com.amazon.ask.model.interfaces.alexa.smartvision.snapshotprovider;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This directive is used to request latest snapshot from camera skill on a particular endpoint.
 */

@JsonDeserialize(builder = GetSnapshotDirective.Builder.class)
public final class GetSnapshotDirective extends com.amazon.ask.model.Directive  {

    @JsonProperty("preferOnDemandSnapshot")
    private Boolean preferOnDemandSnapshot = null;

    private GetSnapshotDirective() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private GetSnapshotDirective(Builder builder) {
        String discriminatorValue = "Alexa.SmartVision.SnapshotProvider.GetSnapshotDirective";

        this.type = discriminatorValue;
        if (builder.preferOnDemandSnapshot != null) {
            this.preferOnDemandSnapshot = builder.preferOnDemandSnapshot;
        }
    }

    /**
     * This property defines that an on-demand snapshot is preferred over  a cached snapshot from camera skill.
     * @return preferOnDemandSnapshot
    **/
    @JsonProperty("preferOnDemandSnapshot")
    public Boolean getPreferOnDemandSnapshot() {
        return preferOnDemandSnapshot;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSnapshotDirective interfacesAlexaSmartvisionSnapshotproviderGetSnapshotDirective = (GetSnapshotDirective) o;
        return Objects.equals(this.preferOnDemandSnapshot, interfacesAlexaSmartvisionSnapshotproviderGetSnapshotDirective.preferOnDemandSnapshot) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preferOnDemandSnapshot, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSnapshotDirective {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    preferOnDemandSnapshot: ").append(toIndentedString(preferOnDemandSnapshot)).append("\n");
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
        private Boolean preferOnDemandSnapshot;

        private Builder() {}

        @JsonProperty("preferOnDemandSnapshot")

        public Builder withPreferOnDemandSnapshot(Boolean preferOnDemandSnapshot) {
            this.preferOnDemandSnapshot = preferOnDemandSnapshot;
            return this;
        }


        public GetSnapshotDirective build() {
            return new GetSnapshotDirective(this);
        }
    }
}

