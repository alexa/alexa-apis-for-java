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

package com.amazon.ask.model.services.util;

import org.slf4j.Logger;

import java.util.Properties;

import static org.slf4j.LoggerFactory.getLogger;

public class UserAgentHelper {

    private static Logger logger = getLogger(UserAgentHelper.class);

    private final String sdkVersion;
    private final String customUserAgent;

    protected UserAgentHelper(String sdkVersion, String customUserAgent) {
        this.sdkVersion = sdkVersion;
        this.customUserAgent = customUserAgent;
    }

    public static Builder builder() {
        return new Builder();
    }

    /**
     * Returns the user agent string.  Format is "(SDK name)/(SDK version) (Language)/(Language version)"
     * Custom user agent will be appended to the end of the standard user agent.
     *
     * @return user agent string
     */
    public String getUserAgent() {
        Properties systemProperties;
        try {
            systemProperties = System.getProperties();
        } catch (SecurityException e) {
            logger.debug("Unable to determine JVM version due to security restrictions.");
            systemProperties = null;
        }
        return internalGetUserAgent(systemProperties, customUserAgent);
    }

    String internalGetUserAgent(Properties systemProperties, String customUserAgent) {
        String version = sdkVersion != null ? sdkVersion : "UNKNOWN";
        String coreUserAgent = String.format("ask-java-model/%s Java/%s", version, getJavaVersion(systemProperties));
        return coreUserAgent + (customUserAgent != null ? " " + customUserAgent : "");
    }

    private static String getJavaVersion(Properties systemProperties) {
        if (systemProperties != null && systemProperties.getProperty("java.version") != null) {
            return systemProperties.getProperty("java.version");
        }
        return "UNKNOWN";
    }

    public static final class Builder {
        private String sdkVersion;
        private String customUserAgent;

        // prevent instantiation
        private Builder() {}

        public Builder withSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }

        public Builder withCustomUserAgent(String customUserAgent) {
            this.customUserAgent = customUserAgent;
            return this;
        }

        public UserAgentHelper build() {
            return new UserAgentHelper(sdkVersion, customUserAgent);
        }
    }

}
