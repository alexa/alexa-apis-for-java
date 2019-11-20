/*
 * Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazon.ask.model.services;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class BaseServiceClientTest {

    @Test
    public void invoke_BuildsUrlWithPath_WhenEndpointAndPathPassed() throws ServiceException {
        String endpoint = "http://io.swagger.com";
        String path = "/v1/pets/prices/";
        String expected = "http://io.swagger.com/v1/pets/prices/";

        ApiClient fakeApiClient = mock(ApiClient.class);
        Serializer fakeSerializer = mock(Serializer.class);

        ArgumentCaptor<ApiClientRequest> captor = ArgumentCaptor.forClass(ApiClientRequest.class);
        when(fakeApiClient.invoke(captor.capture())).thenReturn(getEmptyResponse());
        TestableBaseServiceClient client = getBaseServiceClient(fakeApiClient, fakeSerializer);

        client.invoke("GET", endpoint, path, new ArrayList<>(), new ArrayList<>(), new HashMap<>(), new ArrayList<>(), null, null);
        String result = captor.getValue().getUrl();

        assertEquals(expected, result);
    }

    @Test
    public void invoke_BuildsUrlWithNotDuplicateSlashes_WhenEndpointEndsWithOne() throws ServiceException {
        String endpoint = "http://io.swagger.com/";
        String path = "/v1/pets/prices/";
        String expected = "http://io.swagger.com/v1/pets/prices/";

        ApiClient fakeApiClient = mock(ApiClient.class);
        Serializer fakeSerializer = mock(Serializer.class);

        ArgumentCaptor<ApiClientRequest> captor = ArgumentCaptor.forClass(ApiClientRequest.class);
        when(fakeApiClient.invoke(captor.capture())).thenReturn(getEmptyResponse());
        TestableBaseServiceClient client = getBaseServiceClient(fakeApiClient, fakeSerializer);

        client.invoke("GET", endpoint, path, new ArrayList<>(), new ArrayList<>(), new HashMap<>(), new ArrayList<>(), null, null);
        String result = captor.getValue().getUrl();

        assertEquals(expected, result);
    }

    @Test
    public void invoke_BuildsUrlWithAttachedQueryParameters_IfPassed() throws ServiceException {
        String endpoint = "http://io.swagger.com/";
        String path = "/v1/pets/prices/";
        List<Pair<String, String>> query = new ArrayList<>();
        query.add(new Pair<>("filter", "cats"));
        query.add(new Pair<>("select", "20"));
        query.add(new Pair<>("currency", "usd"));
        String expected = "http://io.swagger.com/v1/pets/prices/?filter=cats&select=20&currency=usd";

        ApiClient fakeApiClient = mock(ApiClient.class);
        Serializer fakeSerializer = mock(Serializer.class);

        ArgumentCaptor<ApiClientRequest> captor = ArgumentCaptor.forClass(ApiClientRequest.class);
        when(fakeApiClient.invoke(captor.capture())).thenReturn(getEmptyResponse());
        TestableBaseServiceClient client = getBaseServiceClient(fakeApiClient, fakeSerializer);

        client.invoke("GET", endpoint, path, query, new ArrayList<>(), new HashMap<>(), new ArrayList<>(), null, null);
        String result = captor.getValue().getUrl();

        assertEquals(expected, result);
    }

    @Test
    public void invoke_BuildsUrlWithPrefixesQueryWithAmp_IfStaticParamIsPassed() throws ServiceException {
        String endpoint = "http://io.swagger.com/";
        String path = "/v1/pets/?static=value";
        List<Pair<String, String>> query = new ArrayList<>();
        query.add(new Pair<>("q", "test"));
        String expected = "http://io.swagger.com/v1/pets/?static=value&q=test";

        ApiClient fakeApiClient = mock(ApiClient.class);
        Serializer fakeSerializer = mock(Serializer.class);

        ArgumentCaptor<ApiClientRequest> captor = ArgumentCaptor.forClass(ApiClientRequest.class);
        when(fakeApiClient.invoke(captor.capture())).thenReturn(getEmptyResponse());
        TestableBaseServiceClient client = getBaseServiceClient(fakeApiClient, fakeSerializer);

        client.invoke("GET", endpoint, path, query, new ArrayList<>(), new HashMap<>(), new ArrayList<>(), null, null);
        String result = captor.getValue().getUrl();

        assertEquals(expected, result);
    }


    @Test
    public void invoke_BuildsUrlWithEncodesQueryParameters_WhenContainingSpecialChars() throws ServiceException {
        String endpoint = "http://io.swagger.com/";
        String path = "/v1/pets/prices/";
        List<Pair<String, String>> query = new ArrayList<>();
        query.add(new Pair<>("quer<y", "random string with < special $200 values"));
        String expected = "http://io.swagger.com/v1/pets/prices/?quer%3Cy=random%20string%20with%20%3C%20special%20%24200%20values";

        ApiClient fakeApiClient = mock(ApiClient.class);
        Serializer fakeSerializer = mock(Serializer.class);

        ArgumentCaptor<ApiClientRequest> captor = ArgumentCaptor.forClass(ApiClientRequest.class);
        when(fakeApiClient.invoke(captor.capture())).thenReturn(getEmptyResponse());
        TestableBaseServiceClient client = getBaseServiceClient(fakeApiClient, fakeSerializer);

        client.invoke("GET", endpoint, path, query, new ArrayList<>(), new HashMap<>(), new ArrayList<>(), null, null);
        String result = captor.getValue().getUrl();

        assertEquals(expected, result);
    }

    @Test
    public void invoke_BuildsUrlWithInterpolatedPathParameters_WhenPassed() throws ServiceException {
        String endpoint = "http://io.swagger.com/";
        String path = "/v1/pets/{petId}/prices/{category}/";
        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("petId", "5502");
        pathParams.put("category", "DOGS");
        String expected = "http://io.swagger.com/v1/pets/5502/prices/DOGS/";

        ApiClient fakeApiClient = mock(ApiClient.class);
        Serializer fakeSerializer = mock(Serializer.class);

        ArgumentCaptor<ApiClientRequest> captor = ArgumentCaptor.forClass(ApiClientRequest.class);
        when(fakeApiClient.invoke(captor.capture())).thenReturn(getEmptyResponse());
        TestableBaseServiceClient client = getBaseServiceClient(fakeApiClient, fakeSerializer);

        client.invoke("GET", endpoint, path, new ArrayList<>(), new ArrayList<>(), pathParams, new ArrayList<>(), null, null);
        String result = captor.getValue().getUrl();

        assertEquals(expected, result);
    }

    @Test
    public void invoke_BuildsUrlWithEscapedPathParameters_WhenInterpolating() throws ServiceException {
        String endpoint = "http://io.swagger.com/";
        String path = "/v1/pets/{petId}/prices/";
        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("petId", "<50%>");
        String expected = "http://io.swagger.com/v1/pets/%3C50%25%3E/prices/";

        ApiClient fakeApiClient = mock(ApiClient.class);
        Serializer fakeSerializer = mock(Serializer.class);

        ArgumentCaptor<ApiClientRequest> captor = ArgumentCaptor.forClass(ApiClientRequest.class);
        when(fakeApiClient.invoke(captor.capture())).thenReturn(getEmptyResponse());
        TestableBaseServiceClient client = getBaseServiceClient(fakeApiClient, fakeSerializer);

        client.invoke("GET", endpoint, path, new ArrayList<>(), new ArrayList<>(), pathParams, new ArrayList<>(), null, null);
        String result = captor.getValue().getUrl();

        assertEquals(expected, result);
    }

    @Test
    public void invoke_BuildsUrlWithPathEndingWithOneSlash_WhenPathEndsInSlash() throws ServiceException {
        String endpoint = "http://io.swagger.com/";
        String path = "/v1/pets/{petId}/prices/";
        Map<String, String> pathParams = new HashMap<>();
        pathParams.put("petId", "50");
        String expected = "http://io.swagger.com/v1/pets/50/prices/";

        ApiClient fakeApiClient = mock(ApiClient.class);
        Serializer fakeSerializer = mock(Serializer.class);

        ArgumentCaptor<ApiClientRequest> captor = ArgumentCaptor.forClass(ApiClientRequest.class);
        when(fakeApiClient.invoke(captor.capture())).thenReturn(getEmptyResponse());
        TestableBaseServiceClient client = getBaseServiceClient(fakeApiClient, fakeSerializer);

        client.invoke("GET", endpoint, path, new ArrayList<>(), new ArrayList<>(), pathParams, new ArrayList<>(), null, null);
        String result = captor.getValue().getUrl();

        assertEquals(expected, result);
    }

    @Test
    public void invoke_SerializesBody_WhenItIsPassed() throws ServiceException {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(200);

        ArgumentCaptor<Object> bodyCaptor = ArgumentCaptor.forClass(Object.class);
        Object fakeBody = mock(Object.class);

        when(fakeSerializer.serialize(bodyCaptor.capture())).thenReturn("payload");
        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        client.invoke("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), new ArrayList<>(), fakeBody, null);

        assertEquals(fakeBody, bodyCaptor.getValue());
    }

    @Test
    public void invoke_NotSerializesBody_WhenBodyIsNull() throws ServiceException {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(200);

        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        client.invoke("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), new ArrayList<>(), null, null);

        verify(fakeSerializer, Mockito.never()).serialize(any());
    }

    @Test
    public void invoke_ReturnsNull_WhenNoExpectedResultAndResponseIsSuccessful() throws ServiceException {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(200);

        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        Object result = client.invoke("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), new ArrayList<>(), null, null);

        assertNull(result);
    }

    @Test
    public void invoke_ReturnsDeserializedResponse_WhenResultAndResponseIsSuccessful() throws ServiceException {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);
        Class fakeResponseType = Class.class;
        Object fakeResponseObj = new Object();
        String responseBodyPayload = "Test";

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(200);
        fakeResponse.setBody(responseBodyPayload);

        ArgumentCaptor<String> responseBodyCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<Class> typeCaptor = ArgumentCaptor.forClass(Class.class);

        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);
        when(fakeSerializer.deserialize(responseBodyCaptor.capture(), typeCaptor.capture())).thenReturn(fakeResponseObj);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        Object result = client.invoke("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), new ArrayList<>(), responseBodyPayload, fakeResponseType);

        assertEquals(fakeResponseObj, result);
        assertEquals(responseBodyPayload, responseBodyCaptor.getValue());
        assertEquals(fakeResponseType, typeCaptor.getValue());
    }

    @Test
    public void invoke_ReturnsNull_WhenNoContentResponseWithEmptyBody() throws ServiceException {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);
        Class fakeResponseType = Class.class;
        String responseBodyPayload = "";

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(204);
        fakeResponse.setBody(responseBodyPayload);

        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        Object result = client.invoke("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), new ArrayList<>(), responseBodyPayload, fakeResponseType);

        assertNull(result);
        verify(fakeSerializer, Mockito.never()).deserialize((InputStream) any(), any());
        verify(fakeSerializer, Mockito.never()).deserialize((String) any(), any());
    }

    @Test
    public void invoke_ReturnsNull_WhenNoContentResponseWithNullBody() throws ServiceException {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);
        Class fakeResponseType = Class.class;
        String responseBodyPayload = null;

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(204);
        fakeResponse.setBody(responseBodyPayload);

        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        Object result = client.invoke("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), new ArrayList<>(), responseBodyPayload, fakeResponseType);

        assertNull(result);
        verify(fakeSerializer, Mockito.never()).deserialize((InputStream) any(), any());
        verify(fakeSerializer, Mockito.never()).deserialize((String) any(), any());
    }

    @Test
    public void invoke_ThrowsException_WithErrorThatMatchesTheStatusCode() {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(400);
        fakeResponse.setBody("");

        List<ServiceClientResponse> responses = new ArrayList<>();
        responses.add(new ServiceClientResponse(Class.class, 200, "Success"));
        responses.add(new ServiceClientResponse(Class.class, 400, "ERROR"));

        when(fakeSerializer.deserialize(anyString(), any())).thenReturn(new Object());
        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        try {
            client.invoke("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), responses, null, null);
        } catch(ServiceException ex) {
            assertEquals(400, ex.getStatusCode());
            assertEquals("ERROR", ex.getMessage());
        }
    }

    @Test
    public void execute_request_status_code_returned() {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(200);
        fakeResponse.setBody("");

        List<ServiceClientResponse> responses = new ArrayList<>();
        responses.add(new ServiceClientResponse(Class.class, 200, "Success"));
        responses.add(new ServiceClientResponse(Class.class, 400, "ERROR"));

        when(fakeSerializer.deserialize(anyString(), any())).thenReturn(new Object());
        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        ApiResponse<Object> response = client.executeRequest("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), responses, null, null);
        assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void execute_request_headers_returned() {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);

        List<Pair<String, String>> mockHeaders = Collections.singletonList(new Pair<>("foo", "bar"));

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(200);
        fakeResponse.setBody("");
        fakeResponse.setHeaders(mockHeaders);

        List<ServiceClientResponse> responses = new ArrayList<>();
        responses.add(new ServiceClientResponse(Class.class, 200, "Success"));
        responses.add(new ServiceClientResponse(Class.class, 400, "ERROR"));

        when(fakeSerializer.deserialize(anyString(), any())).thenReturn(new Object());
        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        ApiResponse<Object> response = client.executeRequest("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), responses, null, null);
        assertEquals(response.getHeaders(), mockHeaders);
    }

    @Test
    public void execute_request_returns_body_when_returned() {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);

        Class fakeResponseType = Class.class;
        Object fakeResponseObj = new Object();
        String responseBodyPayload = "Test";

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(200);
        fakeResponse.setBody(responseBodyPayload);

        List<ServiceClientResponse> responses = new ArrayList<>();
        responses.add(new ServiceClientResponse(Class.class, 200, "Success"));
        responses.add(new ServiceClientResponse(Class.class, 400, "ERROR"));

        when(fakeSerializer.deserialize(anyString(), any())).thenReturn(new Object());
        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        ApiResponse<Object> response = client.executeRequest("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), responses, null, null);
        assertNull(response.getResponse());
    }

    @Test
    public void execute_request_returns_null_body_when_none_returned() {
        Serializer fakeSerializer = mock(Serializer.class);
        ApiClient fakeApiClient = mock(ApiClient.class);
        Class fakeResponseType = Class.class;
        Object fakeResponseObj = new Object();
        String responseBodyPayload = "Test";

        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(200);
        fakeResponse.setBody(responseBodyPayload);

        when(fakeApiClient.invoke(any())).thenReturn(fakeResponse);
        when(fakeSerializer.deserialize(anyString(), any())).thenReturn(fakeResponseObj);

        ApiConfiguration config = getApiConfiguration(fakeApiClient, fakeSerializer);

        TestableBaseServiceClient client = new TestableBaseServiceClient(config);
        ApiResponse<Object> result = client.executeRequest("GET", "http://fake.com", "", new ArrayList<>(), new ArrayList<>(), new HashMap<>(), new ArrayList<>(), responseBodyPayload, fakeResponseType);

        assertEquals(fakeResponseObj, result.getResponse());
    }

    private TestableBaseServiceClient getBaseServiceClient(ApiClient client, Serializer serializer) {
        return new TestableBaseServiceClient(getApiConfiguration(client, serializer));
    }

    private ApiConfiguration getApiConfiguration(ApiClient client, Serializer serializer) {
        return DefaultApiConfiguration.builder()
                .withApiClient(client)
                .withAuthorizationValue("token")
                .withSerializer(serializer)
                .build();
    }

    private ApiClientResponse getEmptyResponse() {
        ApiClientResponse fakeResponse = new ApiClientResponse();
        fakeResponse.setStatusCode(200);

        return fakeResponse;
    }

    private class TestableBaseServiceClient extends BaseServiceClient {

        public TestableBaseServiceClient(ApiConfiguration config) {
            super(config);
        }

        public Object invoke(String method, String endpoint, String path, List<Pair<String, String>> queryParams,
                             List<Pair<String, String>> headerParams, Map<String, String> pathParams,
                             List<ServiceClientResponse> responseDefinitions, Object body, Class responseType) throws ServiceException {
            return super.invoke(method, endpoint, path, queryParams, headerParams, pathParams, responseDefinitions, body, responseType);
        }

        public <T> ApiResponse<T> executeRequest(String method, String endpoint, String path, List<Pair<String, String>> queryParams,
                                                 List<Pair<String, String>> headerParams, Map<String, String> pathParams,
                                                 List<ServiceClientResponse> responseDefinitions, Object body, Class responseType) throws ServiceException {
            return super.executeRequest(method, endpoint, path, queryParams, headerParams, pathParams, responseDefinitions, body, responseType, false);
        }
    }
}
