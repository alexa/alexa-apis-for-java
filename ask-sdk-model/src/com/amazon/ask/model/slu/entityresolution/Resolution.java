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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Represents a possible authority for entity resolution
 */

@JsonDeserialize(builder = Resolution.Builder.class)
public final class Resolution{

  @JsonProperty("authority")
  private String authority = null;

  @JsonProperty("status")
  private com.amazon.ask.model.slu.entityresolution.Status status = null;

  @JsonProperty("values")
  private List<com.amazon.ask.model.slu.entityresolution.ValueWrapper> values = new ArrayList<com.amazon.ask.model.slu.entityresolution.ValueWrapper>();

  public static Builder builder() {
    return new Builder();
  }

  private Resolution(Builder builder) {
    this.authority = builder.authority;
    this.status = builder.status;
    this.values = builder.values;
  }

  /**
    * Get authority
  * @return authority
  **/
  @JsonProperty("authority")
  public String getAuthority() {
    return authority;
  }

  /**
    * Get status
  * @return status
  **/
  @JsonProperty("status")
  public com.amazon.ask.model.slu.entityresolution.Status getStatus() {
    return status;
  }

  /**
    * Get values
  * @return values
  **/
  @JsonProperty("values")
  public List<com.amazon.ask.model.slu.entityresolution.ValueWrapper> getValues() {
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
    Resolution sluEntityresolutionResolution = (Resolution) o;
    return Objects.equals(this.authority, sluEntityresolutionResolution.authority) &&
        Objects.equals(this.status, sluEntityresolutionResolution.status) &&
        Objects.equals(this.values, sluEntityresolutionResolution.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authority, status, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resolution {\n");
    
    sb.append("    authority: ").append(toIndentedString(authority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    private String authority;
    private com.amazon.ask.model.slu.entityresolution.Status status;
    private List<com.amazon.ask.model.slu.entityresolution.ValueWrapper> values;

    private Builder() { }

    @JsonProperty("authority")
    public Builder withAuthority(String authority) {
        this.authority = authority;
        return this;
    }


    @JsonProperty("status")
    public Builder withStatus(com.amazon.ask.model.slu.entityresolution.Status status) {
        this.status = status;
        return this;
    }


    @JsonProperty("values")
    public Builder withValues(List<com.amazon.ask.model.slu.entityresolution.ValueWrapper> values) {
        this.values = values;
        return this;
    }

    public Builder addValuesItem(com.amazon.ask.model.slu.entityresolution.ValueWrapper valuesItem) {
      if (this.values == null) {
        this.values = new ArrayList<com.amazon.ask.model.slu.entityresolution.ValueWrapper>();
      }
      this.values.add(valuesItem);
      return this;
    }

    public Resolution build() {
      return new Resolution(this);
    }
  }
}

