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


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that describes the user (person) who is making the request.
 */

@JsonDeserialize(builder = Person.Builder.class)
public final class Person {

    @JsonProperty("personId")
    private String personId = null;

    @JsonProperty("accessToken")
    private String accessToken = null;

    public static Builder builder() {
        return new Builder();
    }

    private Person(Builder builder) {
        if (builder.personId != null) {
            this.personId = builder.personId;
        }
        if (builder.accessToken != null) {
            this.accessToken = builder.accessToken;
        }
    }

    /**
     * A string that represents a unique identifier for the person who is making the request. The length of this identifier can vary, but is never more than 255 characters. It is generated when a recognized user makes a request to your skill.
     * @return personId
    **/
    @JsonProperty("personId")
    public String getPersonId() {
        return personId;
    }


    /**
     * A token identifying the user in another system. This is only provided if the recognized user has successfully linked their skill account with their Alexa profile. The accessToken field will not appear if null.
     * @return accessToken
    **/
    @JsonProperty("accessToken")
    public String getAccessToken() {
        return accessToken;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return Objects.equals(this.personId, person.personId) &&
            Objects.equals(this.accessToken, person.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, accessToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Person {\n");
        
        sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
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
        private String personId;
        private String accessToken;

        private Builder() {}

        @JsonProperty("personId")

        public Builder withPersonId(String personId) {
            this.personId = personId;
            return this;
        }


        @JsonProperty("accessToken")

        public Builder withAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }
}

