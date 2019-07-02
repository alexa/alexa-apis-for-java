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


package com.amazon.ask.model.services.listManagement;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ForbiddenError
 */

@JsonDeserialize(builder = ForbiddenError.Builder.class)
public final class ForbiddenError{

  @JsonProperty("Message")
  private String message = null;

  public static Builder builder() {
    return new Builder();
  }

  private ForbiddenError(Builder builder) {
    this.message = builder.message;
  }

  /**
    * Get message
  * @return message
  **/
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForbiddenError servicesListManagementForbiddenError = (ForbiddenError) o;
    return Objects.equals(this.message, servicesListManagementForbiddenError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForbiddenError {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    private String message;

    private Builder() { }

    @JsonProperty("Message")
    public Builder withMessage(String message) {
        this.message = message;
        return this;
    }


    public ForbiddenError build() {
      return new ForbiddenError(this);
    }
  }
}

