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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DelegateDirective
 */

@JsonDeserialize(builder = DelegateDirective.Builder.class)
public final class DelegateDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("updatedIntent")
  private com.amazon.ask.model.Intent updatedIntent = null;

  public static Builder builder() {
    return new Builder();
  }

  private DelegateDirective(Builder builder) {
    String discriminatorValue = "Dialog.Delegate";

    this.type = discriminatorValue;
    this.updatedIntent = builder.updatedIntent;
  }

  /**
    * Get updatedIntent
  * @return updatedIntent
  **/
  @JsonProperty("updatedIntent")
  public com.amazon.ask.model.Intent getUpdatedIntent() {
    return updatedIntent;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelegateDirective dialogDelegateDirective = (DelegateDirective) o;
    return Objects.equals(this.updatedIntent, dialogDelegateDirective.updatedIntent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedIntent, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegateDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    updatedIntent: ").append(toIndentedString(updatedIntent)).append("\n");
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
    private com.amazon.ask.model.Intent updatedIntent;

    private Builder() { }

    @JsonProperty("updatedIntent")
    public Builder withUpdatedIntent(com.amazon.ask.model.Intent updatedIntent) {
        this.updatedIntent = updatedIntent;
        return this;
    }


    public DelegateDirective build() {
      return new DelegateDirective(this);
    }
  }
}

