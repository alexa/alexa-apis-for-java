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


package com.amazon.ask.model.dialog;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * DynamicEntitiesDirective
 */

@JsonDeserialize(builder = DynamicEntitiesDirective.Builder.class)
public final class DynamicEntitiesDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("updateBehavior")
  private com.amazon.ask.model.er.dynamic.UpdateBehavior updateBehavior = null;

  @JsonProperty("types")
  private List<com.amazon.ask.model.er.dynamic.EntityListItem> types = new ArrayList<com.amazon.ask.model.er.dynamic.EntityListItem>();

  public static Builder builder() {
    return new Builder();
  }

  private DynamicEntitiesDirective(Builder builder) {
    String discriminatorValue = "Dialog.UpdateDynamicEntities";

    this.type = discriminatorValue;
    this.updateBehavior = builder.updateBehavior;
    this.types = builder.types;
  }

  /**
    * Get updateBehavior
  * @return updateBehavior
  **/
  public com.amazon.ask.model.er.dynamic.UpdateBehavior getUpdateBehavior() {
    return updateBehavior;
  }

  /**
    * Get types
  * @return types
  **/
  public List<com.amazon.ask.model.er.dynamic.EntityListItem> getTypes() {
    return types;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicEntitiesDirective dialogDynamicEntitiesDirective = (DynamicEntitiesDirective) o;
    return Objects.equals(this.updateBehavior, dialogDynamicEntitiesDirective.updateBehavior) &&
        Objects.equals(this.types, dialogDynamicEntitiesDirective.types) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateBehavior, types, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicEntitiesDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    updateBehavior: ").append(toIndentedString(updateBehavior)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
    private com.amazon.ask.model.er.dynamic.UpdateBehavior updateBehavior;
    private List<com.amazon.ask.model.er.dynamic.EntityListItem> types;

    private Builder() { }

    @JsonProperty("updateBehavior")
    public Builder withUpdateBehavior(com.amazon.ask.model.er.dynamic.UpdateBehavior updateBehavior) {
        this.updateBehavior = updateBehavior;
        return this;
    }


    @JsonProperty("types")
    public Builder withTypes(List<com.amazon.ask.model.er.dynamic.EntityListItem> types) {
        this.types = types;
        return this;
    }

    public Builder addTypesItem(com.amazon.ask.model.er.dynamic.EntityListItem typesItem) {
      if (this.types == null) {
        this.types = new ArrayList<com.amazon.ask.model.er.dynamic.EntityListItem>();
      }
      this.types.add(typesItem);
      return this;
    }

    public DynamicEntitiesDirective build() {
      return new DynamicEntitiesDirective(this);
    }
  }
}

