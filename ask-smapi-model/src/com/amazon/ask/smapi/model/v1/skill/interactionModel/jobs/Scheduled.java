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


package com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs;

import java.util.Objects;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Time-based condition when jobs will be executed.
 */

@JsonDeserialize(builder = Scheduled.Builder.class)
public final class Scheduled extends com.amazon.ask.smapi.model.v1.skill.interactionModel.jobs.Trigger  {

    @JsonProperty("hour")
    private Integer hour = null;

    @JsonProperty("dayOfWeek")
    private Integer dayOfWeek = null;

    public static Builder builder() {
        return new Builder();
    }

    private Scheduled(Builder builder) {
        String discriminatorValue = "Scheduled";

        this.type = discriminatorValue;
        if (builder.hour != null) {
            this.hour = builder.hour;
        }
        if (builder.dayOfWeek != null) {
            this.dayOfWeek = builder.dayOfWeek;
        }
    }

    /**
     * The cron-like attribute in UTC time to describe the hour of the day and currently can only be 0,4,8,12,16,20.
     * @return hour
    **/
    @JsonProperty("hour")
    public Integer getHour() {
        return hour;
    }


    /**
     * If not null, this means the scheudule is weekly. the cron-like attribute in UTC time to describe the day of the week (0-6).
     * @return dayOfWeek
    **/
    @JsonProperty("dayOfWeek")
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Scheduled v1SkillInteractionModelJobsScheduled = (Scheduled) o;
        return Objects.equals(this.hour, v1SkillInteractionModelJobsScheduled.hour) &&
            Objects.equals(this.dayOfWeek, v1SkillInteractionModelJobsScheduled.dayOfWeek) &&
            super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hour, dayOfWeek, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Scheduled {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
        sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
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
        private Integer hour;
        private Integer dayOfWeek;

        private Builder() {}

        @JsonProperty("hour")

        public Builder withHour(Integer hour) {
            this.hour = hour;
            return this;
        }


        @JsonProperty("dayOfWeek")

        public Builder withDayOfWeek(Integer dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }


        public Scheduled build() {
            return new Scheduled(this);
        }
    }
}

