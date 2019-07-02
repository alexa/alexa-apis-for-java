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


package com.amazon.ask.model.services.proactiveEvents;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The audience for this event.
 */

@JsonDeserialize(builder = RelevantAudience.Builder.class)
public final class RelevantAudience{

  @JsonProperty("type")
  private com.amazon.ask.model.services.proactiveEvents.RelevantAudienceType type = null;

  @JsonProperty("payload")
  @JsonInclude(JsonInclude.Include.ALWAYS)
  private Object payload = null;

  public static Builder builder() {
    return new Builder();
  }

  private RelevantAudience(Builder builder) {
    this.type = builder.type;
    this.payload = builder.payload;
  }

  /**
    * Get type
  * @return type
  **/
  @JsonProperty("type")
  public com.amazon.ask.model.services.proactiveEvents.RelevantAudienceType getType() {
    return type;
  }

  /**
    * If relevantAudience.type is set to Multicast, then the payload object is empty. Otherwise, the userId value for which the event is targeted is required. 
  * @return payload
  **/
  @JsonProperty("payload")
  public Object getPayload() {
    return payload;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelevantAudience servicesProactiveEventsRelevantAudience = (RelevantAudience) o;
    return Objects.equals(this.type, servicesProactiveEventsRelevantAudience.type) &&
        Objects.equals(this.payload, servicesProactiveEventsRelevantAudience.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelevantAudience {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
    private com.amazon.ask.model.services.proactiveEvents.RelevantAudienceType type;
    private Object payload;

    private Builder() { }

    @JsonProperty("type")
    public Builder withType(com.amazon.ask.model.services.proactiveEvents.RelevantAudienceType type) {
        this.type = type;
        return this;
    }


    @JsonProperty("payload")
    public Builder withPayload(Object payload) {
        this.payload = payload;
        return this;
    }


    public RelevantAudience build() {
      return new RelevantAudience(this);
    }
  }
}

