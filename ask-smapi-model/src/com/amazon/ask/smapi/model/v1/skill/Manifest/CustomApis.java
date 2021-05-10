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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

/**
 * Defines the structure for custom api of the skill.
 */

@JsonDeserialize(builder = CustomApis.Builder.class)
public final class CustomApis {

    @JsonProperty("_targetRuntimes")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.TargetRuntime> targetRuntimes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.TargetRuntime>();

    @JsonProperty("locales")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformation> locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformation>();

    @JsonProperty("regions")
    private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region>();

    @JsonProperty("endpoint")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint = null;

    @JsonProperty("interfaces")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface> interfaces = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface>();

    @JsonProperty("tasks")
    private List<com.amazon.ask.smapi.model.v1.skill.Manifest.CustomTask> tasks = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.CustomTask>();

    @JsonProperty("connections")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.CustomConnections connections = null;

    @JsonProperty("dialogManagement")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManagement dialogManagement = null;

    @JsonProperty("appLink")
    private com.amazon.ask.smapi.model.v1.skill.Manifest.AppLink appLink = null;

    public static Builder builder() {
        return new Builder();
    }

    private CustomApis(Builder builder) {
        if (builder.targetRuntimes != null) {
            this.targetRuntimes = builder.targetRuntimes;
        }
        if (builder.locales != null) {
            this.locales = builder.locales;
        }
        if (builder.regions != null) {
            this.regions = builder.regions;
        }
        if (builder.endpoint != null) {
            this.endpoint = builder.endpoint;
        }
        if (builder.interfaces != null) {
            this.interfaces = builder.interfaces;
        }
        if (builder.tasks != null) {
            this.tasks = builder.tasks;
        }
        if (builder.connections != null) {
            this.connections = builder.connections;
        }
        if (builder.dialogManagement != null) {
            this.dialogManagement = builder.dialogManagement;
        }
        if (builder.appLink != null) {
            this.appLink = builder.appLink;
        }
    }

    /**
     * Defines the set of target runtimes for this skill.
     * @return targetRuntimes
    **/
    @JsonProperty("_targetRuntimes")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.TargetRuntime> getTargetRuntimes() {
        return targetRuntimes;
    }


    /**
     * Object that contains &amp;lt;locale&amp;gt; Objects for each supported locale.
     * @return locales
    **/
    @JsonProperty("locales")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformation> getLocales() {
        return locales;
    }


    /**
     * Contains an array of the supported &amp;lt;region&amp;gt; Objects.
     * @return regions
    **/
    @JsonProperty("regions")
    public Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> getRegions() {
        return regions;
    }


    /**
     * Get endpoint
     * @return endpoint
    **/
    @JsonProperty("endpoint")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint getEndpoint() {
        return endpoint;
    }


    /**
     * Defines the structure for interfaces supported by the custom api of the skill.
     * @return interfaces
    **/
    @JsonProperty("interfaces")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface> getInterfaces() {
        return interfaces;
    }


    /**
     * List of provided tasks.
     * @return tasks
    **/
    @JsonProperty("tasks")
    public List<com.amazon.ask.smapi.model.v1.skill.Manifest.CustomTask> getTasks() {
        return tasks;
    }


    /**
     * Get connections
     * @return connections
    **/
    @JsonProperty("connections")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.CustomConnections getConnections() {
        return connections;
    }


    /**
     * Get dialogManagement
     * @return dialogManagement
    **/
    @JsonProperty("dialogManagement")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManagement getDialogManagement() {
        return dialogManagement;
    }


    /**
     * Get appLink
     * @return appLink
    **/
    @JsonProperty("appLink")
    public com.amazon.ask.smapi.model.v1.skill.Manifest.AppLink getAppLink() {
        return appLink;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomApis v1SkillManifestCustomApis = (CustomApis) o;
        return Objects.equals(this.targetRuntimes, v1SkillManifestCustomApis.targetRuntimes) &&
            Objects.equals(this.locales, v1SkillManifestCustomApis.locales) &&
            Objects.equals(this.regions, v1SkillManifestCustomApis.regions) &&
            Objects.equals(this.endpoint, v1SkillManifestCustomApis.endpoint) &&
            Objects.equals(this.interfaces, v1SkillManifestCustomApis.interfaces) &&
            Objects.equals(this.tasks, v1SkillManifestCustomApis.tasks) &&
            Objects.equals(this.connections, v1SkillManifestCustomApis.connections) &&
            Objects.equals(this.dialogManagement, v1SkillManifestCustomApis.dialogManagement) &&
            Objects.equals(this.appLink, v1SkillManifestCustomApis.appLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetRuntimes, locales, regions, endpoint, interfaces, tasks, connections, dialogManagement, appLink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomApis {\n");
        
        sb.append("    targetRuntimes: ").append(toIndentedString(targetRuntimes)).append("\n");
        sb.append("    locales: ").append(toIndentedString(locales)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    interfaces: ").append(toIndentedString(interfaces)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
        sb.append("    dialogManagement: ").append(toIndentedString(dialogManagement)).append("\n");
        sb.append("    appLink: ").append(toIndentedString(appLink)).append("\n");
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
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.TargetRuntime> targetRuntimes;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformation> locales;
        private Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> regions;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface> interfaces;
        private List<com.amazon.ask.smapi.model.v1.skill.Manifest.CustomTask> tasks;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.CustomConnections connections;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManagement dialogManagement;
        private com.amazon.ask.smapi.model.v1.skill.Manifest.AppLink appLink;

        private Builder() {}

        @JsonProperty("_targetRuntimes")

        public Builder withTargetRuntimes(List<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.TargetRuntime> targetRuntimes) {
            this.targetRuntimes = targetRuntimes;
            return this;
        }

        public Builder addTargetRuntimesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.TargetRuntime targetRuntimesItem) {
            if (this.targetRuntimes == null) {
                this.targetRuntimes = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.Custom.TargetRuntime>();
            }
            this.targetRuntimes.add(targetRuntimesItem);
            return this;
        }

        @JsonProperty("locales")

        public Builder withLocales(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformation> locales) {
            this.locales = locales;
            return this;
        }

        public Builder putLocalesItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformation localesItem) {
            if (this.locales == null) {
                this.locales = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.CustomLocalizedInformation>();
            }
            this.locales.put(key, localesItem);
            return this;
        }

        @JsonProperty("regions")

        public Builder withRegions(Map<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region> regions) {
            this.regions = regions;
            return this;
        }

        public Builder putRegionsItem(String key, com.amazon.ask.smapi.model.v1.skill.Manifest.Region regionsItem) {
            if (this.regions == null) {
                this.regions = new HashMap<String, com.amazon.ask.smapi.model.v1.skill.Manifest.Region>();
            }
            this.regions.put(key, regionsItem);
            return this;
        }

        @JsonProperty("endpoint")

        public Builder withEndpoint(com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEndpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }


        @JsonProperty("interfaces")

        public Builder withInterfaces(List<com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface> interfaces) {
            this.interfaces = interfaces;
            return this;
        }

        public Builder addInterfacesItem(com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface interfacesItem) {
            if (this.interfaces == null) {
                this.interfaces = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface>();
            }
            this.interfaces.add(interfacesItem);
            return this;
        }

        @JsonProperty("tasks")

        public Builder withTasks(List<com.amazon.ask.smapi.model.v1.skill.Manifest.CustomTask> tasks) {
            this.tasks = tasks;
            return this;
        }

        public Builder addTasksItem(com.amazon.ask.smapi.model.v1.skill.Manifest.CustomTask tasksItem) {
            if (this.tasks == null) {
                this.tasks = new ArrayList<com.amazon.ask.smapi.model.v1.skill.Manifest.CustomTask>();
            }
            this.tasks.add(tasksItem);
            return this;
        }

        @JsonProperty("connections")

        public Builder withConnections(com.amazon.ask.smapi.model.v1.skill.Manifest.CustomConnections connections) {
            this.connections = connections;
            return this;
        }


        @JsonProperty("dialogManagement")

        public Builder withDialogManagement(com.amazon.ask.smapi.model.v1.skill.Manifest.DialogManagement dialogManagement) {
            this.dialogManagement = dialogManagement;
            return this;
        }


        @JsonProperty("appLink")

        public Builder withAppLink(com.amazon.ask.smapi.model.v1.skill.Manifest.AppLink appLink) {
            this.appLink = appLink;
            return this;
        }


        public CustomApis build() {
            return new CustomApis(this);
        }
    }
}

