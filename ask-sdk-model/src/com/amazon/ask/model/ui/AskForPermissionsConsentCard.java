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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * AskForPermissionsConsentCard
 */

@JsonDeserialize(builder = AskForPermissionsConsentCard.Builder.class)
public final class AskForPermissionsConsentCard extends com.amazon.ask.model.ui.Card  {

    @JsonProperty("permissions")
    private List<String> permissions = new ArrayList<String>();

    private AskForPermissionsConsentCard() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private AskForPermissionsConsentCard(Builder builder) {
        String discriminatorValue = "AskForPermissionsConsent";

        this.type = discriminatorValue;
        if (builder.permissions != null) {
            this.permissions = builder.permissions;
        }
    }

    /**
     * Get permissions
     * @return permissions
    **/
    @JsonProperty("permissions")
    public List<String> getPermissions() {
        return permissions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AskForPermissionsConsentCard uiAskForPermissionsConsentCard = (AskForPermissionsConsentCard) o;
        return Objects.equals(this.permissions, uiAskForPermissionsConsentCard.permissions) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AskForPermissionsConsentCard {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
        private List<String> permissions;

        private Builder() {}

        @JsonProperty("permissions")

        public Builder withPermissions(List<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder addPermissionsItem(String permissionsItem) {
            if (this.permissions == null) {
                this.permissions = new ArrayList<String>();
            }
            this.permissions.add(permissionsItem);
            return this;
        }

        public AskForPermissionsConsentCard build() {
            return new AskForPermissionsConsentCard(this);
        }
    }
}

