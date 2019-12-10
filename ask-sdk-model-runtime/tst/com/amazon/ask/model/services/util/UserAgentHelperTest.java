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

import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserAgentHelperTest {

    private static String TEST_JVM_VERSION = "1.8.0_151";
    private static String TEST_SDK_VERSION = "2.0.0";

    @Test
    public void userAgentGeneratedWithExpectedSdkAndJvmVersion() {
        UserAgentHelper helper = UserAgentHelper.builder().withSdkVersion(TEST_SDK_VERSION).build();
        Properties props = mock(Properties.class);
        when(props.getProperty("java.version")).thenReturn(TEST_JVM_VERSION);
        assertEquals(helper.internalGetUserAgent(props, null), String.format("ask-java/%s Java/%s", TEST_SDK_VERSION, TEST_JVM_VERSION));
    }

    @Test
    public void customUserAgentAppendedToEnd() {
        String customUserAgent = "foo/bar/baz";
        UserAgentHelper helper = UserAgentHelper.builder().withSdkVersion(TEST_SDK_VERSION).withCustomUserAgent(customUserAgent).build();
        Properties props = mock(Properties.class);
        when(props.getProperty("java.version")).thenReturn(TEST_JVM_VERSION);
        assertEquals(helper.internalGetUserAgent(props, customUserAgent), String.format("ask-java/%s Java/%s foo/bar/baz", TEST_SDK_VERSION, TEST_JVM_VERSION));
    }

    @Test
    public void nullJvmPropertiesReturnsUnknownJvmVersion() {
        UserAgentHelper helper = UserAgentHelper.builder().withSdkVersion(TEST_SDK_VERSION).build();
        assertEquals(helper.internalGetUserAgent(null, null), String.format("ask-java/%s Java/UNKNOWN", TEST_SDK_VERSION));
    }

    @Test
    public void unsetSdkVersionReturnsUnknownSdkVersion() {
        UserAgentHelper helper = UserAgentHelper.builder().build();
        Properties props = mock(Properties.class);
        when(props.getProperty("java.version")).thenReturn(TEST_JVM_VERSION);
        assertEquals(helper.internalGetUserAgent(props, null), String.format("ask-java/UNKNOWN Java/%s", TEST_JVM_VERSION));
    }

}
