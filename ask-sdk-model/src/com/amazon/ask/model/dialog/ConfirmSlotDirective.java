/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * ConfirmSlotDirective
 */

@JsonDeserialize(builder = ConfirmSlotDirective.Builder.class)
public final class ConfirmSlotDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("updatedIntent")
  private com.amazon.ask.model.Intent updatedIntent = null;

  @JsonProperty("slotToConfirm")
  private String slotToConfirm = null;

  public static Builder builder() {
    return new Builder();
  }

  private ConfirmSlotDirective(Builder builder) {
    String discriminatorValue = "Dialog.ConfirmSlot";

    this.type = discriminatorValue;
    this.updatedIntent = builder.updatedIntent;
    this.slotToConfirm = builder.slotToConfirm;
  }

  /**
    * Get updatedIntent
  * @return updatedIntent
  **/
  public com.amazon.ask.model.Intent getUpdatedIntent() {
    return updatedIntent;
  }

  /**
    * Get slotToConfirm
  * @return slotToConfirm
  **/
  public String getSlotToConfirm() {
    return slotToConfirm;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmSlotDirective dialogConfirmSlotDirective = (ConfirmSlotDirective) o;
    return Objects.equals(this.updatedIntent, dialogConfirmSlotDirective.updatedIntent) &&
        Objects.equals(this.slotToConfirm, dialogConfirmSlotDirective.slotToConfirm) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedIntent, slotToConfirm, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmSlotDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    updatedIntent: ").append(toIndentedString(updatedIntent)).append("\n");
    sb.append("    slotToConfirm: ").append(toIndentedString(slotToConfirm)).append("\n");
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
    private String slotToConfirm;

    private Builder() { }
      

    @JsonProperty("updatedIntent")
    public Builder withUpdatedIntent(com.amazon.ask.model.Intent updatedIntent) {
      this.updatedIntent = updatedIntent;
      return this;
    }
      

    @JsonProperty("slotToConfirm")
    public Builder withSlotToConfirm(String slotToConfirm) {
      this.slotToConfirm = slotToConfirm;
      return this;
    }
      

    public ConfirmSlotDirective build() {
      return new ConfirmSlotDirective(this);
    }
  }
}

