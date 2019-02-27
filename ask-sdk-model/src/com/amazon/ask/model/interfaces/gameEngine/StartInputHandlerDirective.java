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


package com.amazon.ask.model.interfaces.gameEngine;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StartInputHandlerDirective
 */

@JsonDeserialize(builder = StartInputHandlerDirective.Builder.class)
public final class StartInputHandlerDirective extends com.amazon.ask.model.Directive {

  @JsonProperty("timeout")
  private Long timeout = null;

  @JsonProperty("proxies")
  private List<String> proxies = new ArrayList<String>();

  @JsonProperty("recognizers")
  private Map<String, com.amazon.ask.model.services.gameEngine.Recognizer> recognizers = new HashMap<String, com.amazon.ask.model.services.gameEngine.Recognizer>();

  @JsonProperty("events")
  private Map<String, com.amazon.ask.model.services.gameEngine.Event> events = new HashMap<String, com.amazon.ask.model.services.gameEngine.Event>();

  public static Builder builder() {
    return new Builder();
  }

  private StartInputHandlerDirective(Builder builder) {
    String discriminatorValue = "GameEngine.StartInputHandler";

    this.type = discriminatorValue;
    this.timeout = builder.timeout;
    this.proxies = builder.proxies;
    this.recognizers = builder.recognizers;
    this.events = builder.events;
  }

  /**
    * The maximum run time for this Input Handler, in milliseconds. Although this parameter is required, you can specify events with conditions on which to end the Input Handler earlier.
    * minimum: 0
    * maximum: 90000
  * @return timeout
  **/
  public Long getTimeout() {
    return timeout;
  }

  /**
    * Names for unknown gadget IDs to use in recognizers, allocated on a first-come, first-served basis.
  * @return proxies
  **/
  public List<String> getProxies() {
    return proxies;
  }

  /**
    * Conditions that, at any moment, are either true or false. You use recognizers when you specify the conditions under which your skill is notified of Echo Button input. 
  * @return recognizers
  **/
  public Map<String, com.amazon.ask.model.services.gameEngine.Recognizer> getRecognizers() {
    return recognizers;
  }

  /**
    * The logic that determines when your skill is notified of Echo Button input. Events are listed here as object keys, where the keys specify the name of an event. 
  * @return events
  **/
  public Map<String, com.amazon.ask.model.services.gameEngine.Event> getEvents() {
    return events;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartInputHandlerDirective interfacesGameEngineStartInputHandlerDirective = (StartInputHandlerDirective) o;
    return Objects.equals(this.timeout, interfacesGameEngineStartInputHandlerDirective.timeout) &&
        Objects.equals(this.proxies, interfacesGameEngineStartInputHandlerDirective.proxies) &&
        Objects.equals(this.recognizers, interfacesGameEngineStartInputHandlerDirective.recognizers) &&
        Objects.equals(this.events, interfacesGameEngineStartInputHandlerDirective.events) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeout, proxies, recognizers, events, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartInputHandlerDirective {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    proxies: ").append(toIndentedString(proxies)).append("\n");
    sb.append("    recognizers: ").append(toIndentedString(recognizers)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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
    private Long timeout;
    private List<String> proxies;
    private Map<String, com.amazon.ask.model.services.gameEngine.Recognizer> recognizers;
    private Map<String, com.amazon.ask.model.services.gameEngine.Event> events;

    private Builder() { }
      

    @JsonProperty("timeout")
    public Builder withTimeout(Long timeout) {
      this.timeout = timeout;
      return this;
    }
      

    @JsonProperty("proxies")
    public Builder withProxies(List<String> proxies) {
      this.proxies = proxies;
      return this;
    }
      
    public Builder addProxiesItem(String proxiesItem) {
      if (this.proxies == null) {
        this.proxies = new ArrayList<String>();
      }
      this.proxies.add(proxiesItem);
      return this;
    }

    @JsonProperty("recognizers")
    public Builder withRecognizers(Map<String, com.amazon.ask.model.services.gameEngine.Recognizer> recognizers) {
      this.recognizers = recognizers;
      return this;
    }
      
    public Builder putRecognizersItem(String key, com.amazon.ask.model.services.gameEngine.Recognizer recognizersItem) {
      if (this.recognizers == null) {
        this.recognizers = new HashMap<String, com.amazon.ask.model.services.gameEngine.Recognizer>();
      }
      this.recognizers.put(key, recognizersItem);
      return this;
    }

    @JsonProperty("events")
    public Builder withEvents(Map<String, com.amazon.ask.model.services.gameEngine.Event> events) {
      this.events = events;
      return this;
    }
      
    public Builder putEventsItem(String key, com.amazon.ask.model.services.gameEngine.Event eventsItem) {
      if (this.events == null) {
        this.events = new HashMap<String, com.amazon.ask.model.services.gameEngine.Event>();
      }
      this.events.put(key, eventsItem);
      return this;
    }

    public StartInputHandlerDirective build() {
      return new StartInputHandlerDirective(this);
    }
  }
}

