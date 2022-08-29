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


package com.amazon.ask.model.services.timerManagement;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * LAUNCH_TASK trigger behavior representing launch a Skill Connection task exposed by the same skill.
 */

@JsonDeserialize(builder = LaunchTaskOperation.Builder.class)
public final class LaunchTaskOperation extends com.amazon.ask.model.services.timerManagement.Operation  {

    @JsonProperty("textToConfirm")
    private List<com.amazon.ask.model.services.timerManagement.TextToConfirm> textToConfirm = new ArrayList<com.amazon.ask.model.services.timerManagement.TextToConfirm>();

    @JsonProperty("task")
    private com.amazon.ask.model.services.timerManagement.Task task = null;

    private LaunchTaskOperation() {
    }

    public static Builder builder() {
        return new Builder();
    }

    private LaunchTaskOperation(Builder builder) {
        String discriminatorValue = "LAUNCH_TASK";

        this.type = discriminatorValue;
        if (builder.textToConfirm != null) {
            this.textToConfirm = builder.textToConfirm;
        }
        if (builder.task != null) {
            this.task = builder.task;
        }
    }

    /**
     * Get textToConfirm
     * @return textToConfirm
    **/
    @JsonProperty("textToConfirm")
    public List<com.amazon.ask.model.services.timerManagement.TextToConfirm> getTextToConfirm() {
        return textToConfirm;
    }


    /**
     * Get task
     * @return task
    **/
    @JsonProperty("task")
    public com.amazon.ask.model.services.timerManagement.Task getTask() {
        return task;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LaunchTaskOperation servicesTimerManagementLaunchTaskOperation = (LaunchTaskOperation) o;
        return Objects.equals(this.textToConfirm, servicesTimerManagementLaunchTaskOperation.textToConfirm) &&
            Objects.equals(this.task, servicesTimerManagementLaunchTaskOperation.task) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textToConfirm, task, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LaunchTaskOperation {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    textToConfirm: ").append(toIndentedString(textToConfirm)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
        private List<com.amazon.ask.model.services.timerManagement.TextToConfirm> textToConfirm;
        private com.amazon.ask.model.services.timerManagement.Task task;

        private Builder() {}

        @JsonProperty("textToConfirm")

        public Builder withTextToConfirm(List<com.amazon.ask.model.services.timerManagement.TextToConfirm> textToConfirm) {
            this.textToConfirm = textToConfirm;
            return this;
        }

        public Builder addTextToConfirmItem(com.amazon.ask.model.services.timerManagement.TextToConfirm textToConfirmItem) {
            if (this.textToConfirm == null) {
                this.textToConfirm = new ArrayList<com.amazon.ask.model.services.timerManagement.TextToConfirm>();
            }
            this.textToConfirm.add(textToConfirmItem);
            return this;
        }

        @JsonProperty("task")

        public Builder withTask(com.amazon.ask.model.services.timerManagement.Task task) {
            this.task = task;
            return this;
        }


        public LaunchTaskOperation build() {
            return new LaunchTaskOperation(this);
        }
    }
}

