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


package com.amazon.ask.model.er.dynamic;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Represents an array of entities of a particular type.
 */

@JsonDeserialize(builder = EntityListItem.Builder.class)
public final class EntityListItem{

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("values")
  private List<com.amazon.ask.model.er.dynamic.Entity> values = new ArrayList<com.amazon.ask.model.er.dynamic.Entity>();

  public static Builder builder() {
    return new Builder();
  }

  private EntityListItem(Builder builder) {
    this.name = builder.name;
    this.values = builder.values;
  }

  /**
    * The entity type. Must match the slot type as defined in the interaction model.
  * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * A list of dynamic entities which are of the same type
  * @return values
  **/
  public List<com.amazon.ask.model.er.dynamic.Entity> getValues() {
    return values;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityListItem erDynamicEntityListItem = (EntityListItem) o;
    return Objects.equals(this.name, erDynamicEntityListItem.name) &&
        Objects.equals(this.values, erDynamicEntityListItem.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityListItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    private List<com.amazon.ask.model.er.dynamic.Entity> values;

    private Builder() { }

    @JsonProperty("name")
    public Builder withName(String name) {
        this.name = name;
        return this;
    }


    @JsonProperty("values")
    public Builder withValues(List<com.amazon.ask.model.er.dynamic.Entity> values) {
        this.values = values;
        return this;
    }

    public Builder addValuesItem(com.amazon.ask.model.er.dynamic.Entity valuesItem) {
      if (this.values == null) {
        this.values = new ArrayList<com.amazon.ask.model.er.dynamic.Entity>();
      }
      this.values.add(valuesItem);
      return this;
    }

    public EntityListItem build() {
      return new EntityListItem(this);
    }
  }
}

