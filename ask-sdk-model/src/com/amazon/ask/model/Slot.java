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
 * Slot
 */

@JsonDeserialize(builder = Slot.Builder.class)
public final class Slot{

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("confirmationStatus")
  private com.amazon.ask.model.SlotConfirmationStatus confirmationStatus = null;

  @JsonProperty("resolutions")
  private com.amazon.ask.model.slu.entityresolution.Resolutions resolutions = null;

  public static Builder builder() {
    return new Builder();
  }

  private Slot(Builder builder) {
    this.name = builder.name;
    this.value = builder.value;
    this.confirmationStatus = builder.confirmationStatus;
    this.resolutions = builder.resolutions;
  }

  /**
    * A string that represents the name of the slot.
  * @return name
  **/
  public String getName() {
    return name;
  }

  /**
    * A string that represents the value the user spoke for the slot. This is the actual value the user spoke, not necessarily the canonical value or one of the synonyms defined for the entity. Note that AMAZON.LITERAL slot values sent to your service are always in all lower case.
  * @return value
  **/
  public String getValue() {
    return value;
  }

  /**
    * Indication of whether an intent or slot has been explicitly confirmed or denied by the user, or neither.
  * @return confirmationStatus
  **/
  public com.amazon.ask.model.SlotConfirmationStatus getConfirmationStatus() {
    return confirmationStatus;
  }

  /**
    * Contains the results of entity resolution. These are organized by authority. An authority represents the source for the data provided for the slot. For a custom slot type, the authority is the slot type you defined.
  * @return resolutions
  **/
  public com.amazon.ask.model.slu.entityresolution.Resolutions getResolutions() {
    return resolutions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Slot slot = (Slot) o;
    return Objects.equals(this.name, slot.name) &&
        Objects.equals(this.value, slot.value) &&
        Objects.equals(this.confirmationStatus, slot.confirmationStatus) &&
        Objects.equals(this.resolutions, slot.resolutions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, confirmationStatus, resolutions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Slot {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    confirmationStatus: ").append(toIndentedString(confirmationStatus)).append("\n");
    sb.append("    resolutions: ").append(toIndentedString(resolutions)).append("\n");
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
    private String value;
    private com.amazon.ask.model.SlotConfirmationStatus confirmationStatus;
    private com.amazon.ask.model.slu.entityresolution.Resolutions resolutions;

    private Builder() { }

    @JsonProperty("name")
    public Builder withName(String name) {
      this.name = name;
      return this;
    }
      

    @JsonProperty("value")
    public Builder withValue(String value) {
      this.value = value;
      return this;
    }
      

    @JsonProperty("confirmationStatus")
    public Builder withConfirmationStatus(com.amazon.ask.model.SlotConfirmationStatus confirmationStatus) {
      this.confirmationStatus = confirmationStatus;
      return this;
    }
      

    @JsonProperty("resolutions")
    public Builder withResolutions(com.amazon.ask.model.slu.entityresolution.Resolutions resolutions) {
      this.resolutions = resolutions;
      return this;
    }
      

    public Slot build() {
      return new Slot(this);
    }
  }
}

