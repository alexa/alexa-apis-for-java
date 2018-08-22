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


package com.amazon.ask.model;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing an application ID. This is used to verify that the request was intended for your service.
 */

@JsonDeserialize(builder = Application.Builder.class)
public final class Application{

  @JsonProperty("applicationId")
  private String applicationId = null;

  public static Builder builder() {
    return new Builder();
  }

  private Application(Builder builder) {
    this.applicationId = builder.applicationId;
  }

  /**
    * A string representing the application identifier for your skill.
  * @return applicationId
  **/
  public String getApplicationId() {
    return applicationId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.applicationId, application.applicationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
    private String applicationId;

    private Builder() { }

    @JsonProperty("applicationId")
    public Builder withApplicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }
      

    public Application build() {
      return new Application(this);
    }
  }
}

