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


package com.amazon.ask.model.interfaces.applink;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * direct launch availability
 */

@JsonDeserialize(builder = DirectLaunch.Builder.class)
public final class DirectLaunch {

    @JsonProperty("IOS_APP_STORE")
    private Object IOS_APP_STORE = null;

    @JsonProperty("GOOGLE_PLAY_STORE")
    private Object GOOGLE_PLAY_STORE = null;

    private DirectLaunch() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private DirectLaunch(Builder builder) {
        if (builder.IOS_APP_STORE != null) {
            this.IOS_APP_STORE = builder.IOS_APP_STORE;
        }
        if (builder.GOOGLE_PLAY_STORE != null) {
            this.GOOGLE_PLAY_STORE = builder.GOOGLE_PLAY_STORE;
        }
    }

    /**
     * Get IOS_APP_STORE
     * @return IOS_APP_STORE
    **/
    @JsonProperty("IOS_APP_STORE")
    public Object getIOSAPPSTORE() {
        return IOS_APP_STORE;
    }


    /**
     * Get GOOGLE_PLAY_STORE
     * @return GOOGLE_PLAY_STORE
    **/
    @JsonProperty("GOOGLE_PLAY_STORE")
    public Object getGOOGLEPLAYSTORE() {
        return GOOGLE_PLAY_STORE;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DirectLaunch interfacesApplinkDirectLaunch = (DirectLaunch) o;
        return Objects.equals(this.IOS_APP_STORE, interfacesApplinkDirectLaunch.IOS_APP_STORE) &&
            Objects.equals(this.GOOGLE_PLAY_STORE, interfacesApplinkDirectLaunch.GOOGLE_PLAY_STORE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IOS_APP_STORE, GOOGLE_PLAY_STORE);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DirectLaunch {\n");
        
        sb.append("    IOS_APP_STORE: ").append(toIndentedString(IOS_APP_STORE)).append("\n");
        sb.append("    GOOGLE_PLAY_STORE: ").append(toIndentedString(GOOGLE_PLAY_STORE)).append("\n");
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
        private Object IOS_APP_STORE;
        private Object GOOGLE_PLAY_STORE;

        private Builder() {}

        @JsonProperty("IOS_APP_STORE")

        public Builder withIOSAPPSTORE(Object IOS_APP_STORE) {
            this.IOS_APP_STORE = IOS_APP_STORE;
            return this;
        }


        @JsonProperty("GOOGLE_PLAY_STORE")

        public Builder withGOOGLEPLAYSTORE(Object GOOGLE_PLAY_STORE) {
            this.GOOGLE_PLAY_STORE = GOOGLE_PLAY_STORE;
            return this;
        }


        public DirectLaunch build() {
            return new DirectLaunch(this);
        }
    }
}

