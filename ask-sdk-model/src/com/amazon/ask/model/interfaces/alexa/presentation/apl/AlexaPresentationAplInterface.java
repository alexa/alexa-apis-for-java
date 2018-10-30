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


package com.amazon.ask.model.interfaces.alexa.presentation.apl;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AlexaPresentationAplInterface
 */

@JsonDeserialize(builder = AlexaPresentationAplInterface.Builder.class)
public final class AlexaPresentationAplInterface{

  @JsonProperty("runtime")
  private com.amazon.ask.model.interfaces.alexa.presentation.apl.Runtime runtime = null;

  public static Builder builder() {
    return new Builder();
  }

  private AlexaPresentationAplInterface(Builder builder) {
    this.runtime = builder.runtime;
  }

  /**
    * Get runtime
  * @return runtime
  **/
  public com.amazon.ask.model.interfaces.alexa.presentation.apl.Runtime getRuntime() {
    return runtime;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlexaPresentationAplInterface interfacesAlexaPresentationAplAlexaPresentationAplInterface = (AlexaPresentationAplInterface) o;
    return Objects.equals(this.runtime, interfacesAlexaPresentationAplAlexaPresentationAplInterface.runtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlexaPresentationAplInterface {\n");
    
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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
    private com.amazon.ask.model.interfaces.alexa.presentation.apl.Runtime runtime;

    private Builder() { }

    @JsonProperty("runtime")
    public Builder withRuntime(com.amazon.ask.model.interfaces.alexa.presentation.apl.Runtime runtime) {
      this.runtime = runtime;
      return this;
    }
      

    public AlexaPresentationAplInterface build() {
      return new AlexaPresentationAplInterface(this);
    }
  }
}

