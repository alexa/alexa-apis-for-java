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


package com.amazon.ask.model.slu.entityresolution;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the results of resolving the words captured from the user&#39;s utterance. This is included for slots that use a custom slot type or a built-in slot type that you have extended with your own values. Note that resolutions is not included for built-in slot types that you have not extended.
 */

@JsonDeserialize(builder = Resolutions.Builder.class)
public final class Resolutions{

  @JsonProperty("resolutionsPerAuthority")
  private List<com.amazon.ask.model.slu.entityresolution.Resolution> resolutionsPerAuthority = new ArrayList<com.amazon.ask.model.slu.entityresolution.Resolution>();

  public static Builder builder() {
    return new Builder();
  }

  private Resolutions(Builder builder) {
    this.resolutionsPerAuthority = builder.resolutionsPerAuthority;
  }

  /**
    * Get resolutionsPerAuthority
  * @return resolutionsPerAuthority
  **/
  public List<com.amazon.ask.model.slu.entityresolution.Resolution> getResolutionsPerAuthority() {
    return resolutionsPerAuthority;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resolutions sluEntityresolutionResolutions = (Resolutions) o;
    return Objects.equals(this.resolutionsPerAuthority, sluEntityresolutionResolutions.resolutionsPerAuthority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolutionsPerAuthority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resolutions {\n");
    
    sb.append("    resolutionsPerAuthority: ").append(toIndentedString(resolutionsPerAuthority)).append("\n");
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
    private List<com.amazon.ask.model.slu.entityresolution.Resolution> resolutionsPerAuthority;

    private Builder() { }

    @JsonProperty("resolutionsPerAuthority")
    public Builder withResolutionsPerAuthority(List<com.amazon.ask.model.slu.entityresolution.Resolution> resolutionsPerAuthority) {
      this.resolutionsPerAuthority = resolutionsPerAuthority;
      return this;
    }
      
    public Builder addResolutionsPerAuthorityItem(com.amazon.ask.model.slu.entityresolution.Resolution resolutionsPerAuthorityItem) {
      if (this.resolutionsPerAuthority == null) {
        this.resolutionsPerAuthority = new ArrayList<com.amazon.ask.model.slu.entityresolution.Resolution>();
      }
      this.resolutionsPerAuthority.add(resolutionsPerAuthorityItem);
      return this;
    }

    public Resolutions build() {
      return new Resolutions(this);
    }
  }
}

