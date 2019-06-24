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
 * A wrapper class for an entity resolution value used for JSON serialization.
 */

@JsonDeserialize(builder = ValueWrapper.Builder.class)
public final class ValueWrapper{

  @JsonProperty("value")
  private com.amazon.ask.model.slu.entityresolution.Value value = null;

  public static Builder builder() {
    return new Builder();
  }

  private ValueWrapper(Builder builder) {
    this.value = builder.value;
  }

  /**
    * Get value
  * @return value
  **/
  public com.amazon.ask.model.slu.entityresolution.Value getValue() {
    return value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueWrapper sluEntityresolutionValueWrapper = (ValueWrapper) o;
    return Objects.equals(this.value, sluEntityresolutionValueWrapper.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueWrapper {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    private com.amazon.ask.model.slu.entityresolution.Value value;

    private Builder() { }

    @JsonProperty("value")
    public Builder withValue(com.amazon.ask.model.slu.entityresolution.Value value) {
        this.value = value;
        return this;
    }


    public ValueWrapper build() {
      return new ValueWrapper(this);
    }
  }
}

