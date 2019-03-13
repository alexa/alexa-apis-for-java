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


package com.amazon.ask.model.events.skillevents;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * ProactiveSubscriptionChangedBody
 */

@JsonDeserialize(builder = ProactiveSubscriptionChangedBody.Builder.class)
public final class ProactiveSubscriptionChangedBody{

  @JsonProperty("subscriptions")
  private List<com.amazon.ask.model.events.skillevents.ProactiveSubscriptionEvent> subscriptions = new ArrayList<com.amazon.ask.model.events.skillevents.ProactiveSubscriptionEvent>();

  public static Builder builder() {
    return new Builder();
  }

  private ProactiveSubscriptionChangedBody(Builder builder) {
    this.subscriptions = builder.subscriptions;
  }

  /**
    * The list of events that this customer is currently subscribed to. If a customer unsubscribes from an event, this list will contain remaining event types to which the customer is still subscribed to receive from your skill. If the list of subscriptions is empty, this customer has unsubscribed from all event types from your skill. 
  * @return subscriptions
  **/
  public List<com.amazon.ask.model.events.skillevents.ProactiveSubscriptionEvent> getSubscriptions() {
    return subscriptions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProactiveSubscriptionChangedBody eventsSkilleventsProactiveSubscriptionChangedBody = (ProactiveSubscriptionChangedBody) o;
    return Objects.equals(this.subscriptions, eventsSkilleventsProactiveSubscriptionChangedBody.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProactiveSubscriptionChangedBody {\n");
    
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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
    private List<com.amazon.ask.model.events.skillevents.ProactiveSubscriptionEvent> subscriptions;

    private Builder() { }

    @JsonProperty("subscriptions")
    public Builder withSubscriptions(List<com.amazon.ask.model.events.skillevents.ProactiveSubscriptionEvent> subscriptions) {
      this.subscriptions = subscriptions;
      return this;
    }
      
    public Builder addSubscriptionsItem(com.amazon.ask.model.events.skillevents.ProactiveSubscriptionEvent subscriptionsItem) {
      if (this.subscriptions == null) {
        this.subscriptions = new ArrayList<com.amazon.ask.model.events.skillevents.ProactiveSubscriptionEvent>();
      }
      this.subscriptions.add(subscriptionsItem);
      return this;
    }

    public ProactiveSubscriptionChangedBody build() {
      return new ProactiveSubscriptionChangedBody(this);
    }
  }
}

