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


package com.amazon.ask.model.canfulfill;

import java.util.Objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CanFulfillIntent represents the response to canFulfillIntentRequest includes the details about whether the skill can understand and fulfill the intent request with detected slots.
 */

@JsonDeserialize(builder = CanFulfillIntent.Builder.class)
public final class CanFulfillIntent{

  @JsonProperty("canFulfill")
  private com.amazon.ask.model.canfulfill.CanFulfillIntentValues canFulfill = null;

  @JsonProperty("slots")
  private Map<String, com.amazon.ask.model.canfulfill.CanFulfillSlot> slots = new HashMap<String, com.amazon.ask.model.canfulfill.CanFulfillSlot>();

  public static Builder builder() {
    return new Builder();
  }

  private CanFulfillIntent(Builder builder) {
    this.canFulfill = builder.canFulfill;
    this.slots = builder.slots;
  }

  /**
    * Get canFulfill
  * @return canFulfill
  **/
  public com.amazon.ask.model.canfulfill.CanFulfillIntentValues getCanFulfill() {
    return canFulfill;
  }

  /**
    * A map that represents skill's detailed response to each detected slot within the intent such as if skill can understand and fulfill the detected slot. This supplements the overall canFulfillIntent response and help Alexa make better ranking and arbitration decisions. The key is the name of the slot. The value is an object of type CanFulfillSlot.
  * @return slots
  **/
  public Map<String, com.amazon.ask.model.canfulfill.CanFulfillSlot> getSlots() {
    return slots;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanFulfillIntent canfulfillCanFulfillIntent = (CanFulfillIntent) o;
    return Objects.equals(this.canFulfill, canfulfillCanFulfillIntent.canFulfill) &&
        Objects.equals(this.slots, canfulfillCanFulfillIntent.slots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canFulfill, slots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanFulfillIntent {\n");
    
    sb.append("    canFulfill: ").append(toIndentedString(canFulfill)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
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
    private com.amazon.ask.model.canfulfill.CanFulfillIntentValues canFulfill;
    private Map<String, com.amazon.ask.model.canfulfill.CanFulfillSlot> slots;

    private Builder() { }

    @JsonProperty("canFulfill")
    public Builder withCanFulfill(com.amazon.ask.model.canfulfill.CanFulfillIntentValues canFulfill) {
      this.canFulfill = canFulfill;
      return this;
    }
      

    @JsonProperty("slots")
    public Builder withSlots(Map<String, com.amazon.ask.model.canfulfill.CanFulfillSlot> slots) {
      this.slots = slots;
      return this;
    }
      
    public Builder putSlotsItem(String key, com.amazon.ask.model.canfulfill.CanFulfillSlot slotsItem) {
      if (this.slots == null) {
        this.slots = new HashMap<String, com.amazon.ask.model.canfulfill.CanFulfillSlot>();
      }
      this.slots.put(key, slotsItem);
      return this;
    }

    public CanFulfillIntent build() {
      return new CanFulfillIntent(this);
    }
  }
}

