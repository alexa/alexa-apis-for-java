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


package com.amazon.ask.model.interfaces.customInterfaceController;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the Jsonlogic event filter expression and its corresponding match action.  This filter is applied to all events during the event handler&#39;s duration.  Events that are rejected by the filter expression are not sent to the skill.
 */

@JsonDeserialize(builder = EventFilter.Builder.class)
public final class EventFilter {

    @JsonProperty("filterExpression")
    private Object filterExpression = null;

    @JsonProperty("filterMatchAction")
    private String filterMatchAction = null;

    public static Builder builder() {
        return new Builder();
    }

    private EventFilter(Builder builder) {
        if (builder.filterExpression != null) {
            this.filterExpression = builder.filterExpression;
        }
        if (builder.filterMatchAction != null) {
            this.filterMatchAction = builder.filterMatchAction;
        }
    }

    /**
     * The JSON object that represents the Jsonlogic expression against which the events are evaluated. If this expression is satisfied, the corresponding match action is performed.
     * @return filterExpression
    **/
    @JsonProperty("filterExpression")
    public Object getFilterExpression() {
        return filterExpression;
    }


    /**
     * Get filterMatchAction
     *
     * For this enum type, if a value unknown to the SDK is returned the UNKNOWN_TO_SDK_VERSION
     * enumeration value will be returned. To directly return the raw String value, use getFilterMatchActionAsString().
     *
     * @return filterMatchAction
    **/
    
    public com.amazon.ask.model.interfaces.customInterfaceController.FilterMatchAction getFilterMatchAction() {
        return com.amazon.ask.model.interfaces.customInterfaceController.FilterMatchAction.fromValue(filterMatchAction);
    }

    /**
     * Get the underlying String value for filterMatchAction.
     *
     * Using this accessor will retrieve the raw underlying value, even if it is not
     * present in the corresponding enumeration. For forward compatibility, it is recommended
     * to use this approach over the enumeration.
     *
     * @return filterMatchAction as a String value
    **/
    @JsonProperty("filterMatchAction")
    public String getFilterMatchActionAsString() {
      return filterMatchAction;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventFilter interfacesCustomInterfaceControllerEventFilter = (EventFilter) o;
        return Objects.equals(this.filterExpression, interfacesCustomInterfaceControllerEventFilter.filterExpression) &&
            Objects.equals(this.filterMatchAction, interfacesCustomInterfaceControllerEventFilter.filterMatchAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filterExpression, filterMatchAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventFilter {\n");
        
        sb.append("    filterExpression: ").append(toIndentedString(filterExpression)).append("\n");
        sb.append("    filterMatchAction: ").append(toIndentedString(filterMatchAction)).append("\n");
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
        private Object filterExpression;
        private String filterMatchAction;

        private Builder() {}

        @JsonProperty("filterExpression")

        public Builder withFilterExpression(Object filterExpression) {
            this.filterExpression = filterExpression;
            return this;
        }


        @JsonProperty("filterMatchAction")
        public Builder withFilterMatchAction(String filterMatchAction) {
          this.filterMatchAction = filterMatchAction;
          return this;
        }

        public Builder withFilterMatchAction(com.amazon.ask.model.interfaces.customInterfaceController.FilterMatchAction filterMatchAction) {
            this.filterMatchAction = filterMatchAction != null ? filterMatchAction.toString() : null;
            return this;
        }


        public EventFilter build() {
            return new EventFilter(this);
        }
    }
}

