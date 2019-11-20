/*
    Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
    except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
    the specific language governing permissions and limitations under the License.
 */

package com.amazon.ask.model.services.util;

import com.amazon.ask.model.services.SerializerException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class JacksonSerializerTest {
    private JacksonSerializer serializer;
    private ObjectMapper mockMapper;
    private TestRequest testRequest;

    @Before
    public void setup() {
        mockMapper = mock(ObjectMapper.class);
        serializer = new JacksonSerializer();
        serializer.setMapper(mockMapper);
        testRequest = new TestRequest();
    }

    @Test
    public void serialize_to_string_correct_input_to_mapper() throws IOException {
        ArgumentCaptor<TestRequest> captor = ArgumentCaptor.forClass(TestRequest.class);
        when(mockMapper.writeValueAsString(testRequest)).thenReturn("foo");
        serializer.serialize(testRequest);
        verify(mockMapper).writeValueAsString(captor.capture());
        assertEquals(captor.getValue(), testRequest);
    }

    @Test
    public void serialize_to_string_correct_output_from_serializer() throws IOException {
        when(mockMapper.writeValueAsString(testRequest)).thenReturn("foo");
        assertEquals(serializer.serialize(testRequest), "foo");
    }

    @Test
    public void serialize_to_stream_correct_input_to_mapper() throws IOException {
        OutputStream os = mock(OutputStream.class);
        ArgumentCaptor<TestRequest> captor = ArgumentCaptor.forClass(TestRequest.class);
        serializer.serialize(testRequest, os);
        verify(mockMapper).writeValue(any(OutputStream.class), captor.capture());
        assertEquals(captor.getValue(), testRequest);
    }

    @Test
    public void deserialize_from_string_correct_input_to_serializer() throws IOException {
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        when(mockMapper.readValue("foo", TestRequest.class)).thenReturn(testRequest);
        serializer.deserialize("foo", TestRequest.class);
        verify(mockMapper).readValue(captor.capture(), any(Class.class));
        assertEquals(captor.getValue(), "foo");
    }

    @Test
    public void deserialize_from_string_correct_output_from_mapper() throws IOException {
        when(mockMapper.readValue("foo", TestRequest.class)).thenReturn(testRequest);
        assertEquals(serializer.deserialize("foo", TestRequest.class), testRequest);
    }

    @Test
    public void deserialize_from_stream_correct_input_to_serializer() throws IOException {
        InputStream is = mock(InputStream.class);
        ArgumentCaptor<InputStream> captor = ArgumentCaptor.forClass(InputStream.class);
        when(mockMapper.readValue(is, TestRequest.class)).thenReturn(testRequest);
        serializer.deserialize(is, TestRequest.class);
        verify(mockMapper).readValue(captor.capture(), any(Class.class));
        assertEquals(captor.getValue(), is);
    }

    @Test
    public void deserialize_from_stream_correct_output_from_mapper() throws IOException {
        InputStream is = mock(InputStream.class);
        when(mockMapper.readValue(is, TestRequest.class)).thenReturn(testRequest);
        assertEquals(serializer.deserialize(is, TestRequest.class), testRequest);
    }

    @Test(expected = SerializerException.class)
    public void serialize_from_string_ioexception_throws_sdk_exception() throws Exception {
        JsonProcessingException exception = mock(JsonProcessingException.class);
        when(mockMapper.writeValueAsString(testRequest)).thenThrow(exception);
        serializer.serialize(testRequest);
    }

    @Test(expected = SerializerException.class)
    public void serialize_from_stream_ioexception_throws_sdk_exception() throws Exception {
        OutputStream os = mock(OutputStream.class);
        JsonProcessingException exception = mock(JsonProcessingException.class);
        doThrow(exception).when(mockMapper).writeValue(os, testRequest);
        serializer.serialize(testRequest, os);
    }

    @Test(expected = SerializerException.class)
    public void deserialize_from_string_ioexception_throws_sdk_exception() throws Exception {
        when(mockMapper.readValue("foo", TestRequest.class)).thenThrow(new IOException());
        serializer.deserialize("foo", TestRequest.class);
    }

    @Test(expected = SerializerException.class)
    public void deserialize_from_stream_ioexception_throws_sdk_exception() throws Exception {
        InputStream is = mock(InputStream.class);
        when(mockMapper.readValue(is, TestRequest.class)).thenThrow(new IOException());
        serializer.deserialize(is, TestRequest.class);
    }

    private class TestRequest {
        private String param;

        public String getParam() {
            return param;
        }

        public void setParam(String param) {
            this.param = param;
        }
    }

}