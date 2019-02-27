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


package com.amazon.ask.model.slu.entityresolution;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the resolved value for the slot, based on the user’s utterance and slot type definition.
 */

@JsonDeserialize(builder = Value.Builder.class)
public final class Value{

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("id")
  private String id = null;

  public static Builder builder() {
    return new Builder();
  }

  private Value(Builder builder) {
    this.name = builder.name;
    this.id = builder.id;
  }

  /**
    * The name for the resolution value.
  * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * The id for the resolution value.
  * @return id
  **/
  public String getId() {
    return id;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Value sluEntityresolutionValue = (Value) o;
    return Objects.equals(this.name, sluEntityresolutionValue.name) &&
        Objects.equals(this.id, sluEntityresolutionValue.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Value {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    private String name;
    private String id;

    private Builder() { }

    @JsonProperty("name")
    public Builder withName(String name) {
      this.name = name;
      return this;
    }
      

    @JsonProperty("id")
    public Builder withId(String id) {
      this.id = id;
      return this;
    }
      

    public Value build() {
      return new Value(this);
    }
  }
}

