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

package com.amazon.ask.model.services.lwa;

import com.amazon.ask.model.services.ApiClient;
import com.amazon.ask.model.services.ApiClientRequest;
import com.amazon.ask.model.services.ApiClientResponse;
import com.amazon.ask.model.services.ApiConfiguration;
import com.amazon.ask.model.services.AuthenticationConfiguration;
import com.amazon.ask.model.services.Pair;
import com.amazon.ask.model.services.Serializer;
import com.amazon.ask.model.services.lwa.model.AccessTokenResponse;
import com.amazon.ask.model.services.lwa.model.GrantType;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class LwaClientTest {

    private static final String DEFAULT_API_ENDPOINT = "https://api.amazonalexa.com";
    private String testAccessToken = "fooBar";
    private String testScope = "1234";
    private String testClientId = "testClientId";
    private String testClientSecret = "testClientSecret";
    private String testRefreshToken = "testRefreshToken";
    private String testResponseBody = "foo";

    @Test
    public void api_request_properly_formed_with_default_endpoint() {
        api_request_properly_formed(null);
    }

    @Test
    public void api_request_properly_formed_with_default_api_endpoint() {
        api_request_properly_formed(DEFAULT_API_ENDPOINT);
    }

    @Test
    public void api_request_properly_formed_with_custom_endpoint() {
        api_request_properly_formed("https://foo.com");
    }

    private void api_request_properly_formed(String endpoint) {
        AccessTokenResponse response = mock(AccessTokenResponse.class);

        ArgumentCaptor<String> payloadCaptor = ArgumentCaptor.forClass(String.class);
        Serializer mockSerializer = getMockSerializer(response, payloadCaptor);

        ArgumentCaptor<ApiClientRequest> requestCaptor = ArgumentCaptor.forClass(ApiClientRequest.class);
        ApiClient mockApiClient = getMockApiClient(200, requestCaptor);
        ApiConfiguration mockApiConfiguration = mock(ApiConfiguration.class);
        when(mockApiConfiguration.getApiClient()).thenReturn(mockApiClient);
        when(mockApiConfiguration.getSerializer()).thenReturn(mockSerializer);
        when(mockApiConfiguration.getApiEndpoint()).thenReturn(endpoint);

        AuthenticationConfiguration mockAuthenticationConfiguration = getMockAuthenticationConfiguration();

        LwaClient lwaClient = LwaClient.builder()
                .withApiConfiguration(mockApiConfiguration)
                .withAuthenticationConfiguration(mockAuthenticationConfiguration)
                .build();

        lwaClient.getAccessTokenForScope(testScope);
        ApiClientRequest capturedRequest = requestCaptor.getValue();
        String expectedEndpoint = endpoint != null && !endpoint.equals(DEFAULT_API_ENDPOINT) ? endpoint : "https://api.amazon.com";
        assertEquals(capturedRequest.getUrl(), expectedEndpoint + "/auth/O2/token");
        assertEquals(capturedRequest.getMethod(), "POST");
        assertEquals(capturedRequest.getBody(), ("grant_type=client_credentials&client_id=" + testClientId
                + "&client_secret=" + testClientSecret + "&scope=" + testScope));
        assertEquals(capturedRequest.getHeaders().size(), 1);
        Pair<String, String> header = capturedRequest.getHeaders().get(0);
        assertEquals(header.getName(), "Content-Type");
        assertEquals(header.getValue(), "application/x-www-form-urlencoded");
    }

    @Test
    public void token_cached_retrieved_within_expiry_reused() {
        AccessTokenResponse response = getMockResponse(testAccessToken, 3600L);
        Serializer mockSerializer = getMockSerializer(response, null);

        ApiClient mockApiClient = getMockApiClient(200, null);
        ApiConfiguration mockApiConfiguration = mock(ApiConfiguration.class);
        when(mockApiConfiguration.getApiClient()).thenReturn(mockApiClient);
        when(mockApiConfiguration.getSerializer()).thenReturn(mockSerializer);

        AuthenticationConfiguration mockAuthenticationConfiguration = getMockAuthenticationConfiguration();

        LwaClient lwaClient = LwaClient.builder()
                .withApiConfiguration(mockApiConfiguration)
                .withAuthenticationConfiguration(mockAuthenticationConfiguration)
                .build();

        assertEquals(lwaClient.getAccessTokenForScope(testScope), testAccessToken);
        assertEquals(lwaClient.getAccessTokenForScope(testScope), testAccessToken);
        Mockito.verify(mockApiClient, times(1)).invoke(any(ApiClientRequest.class));
    }

    @Test
    public void token_cached_expires_before_next_call() {
        AccessTokenResponse response = getMockResponse(testAccessToken, 0L);
        Serializer mockSerializer = getMockSerializer(response, null);

        ApiClient mockApiClient = getMockApiClient(200, null);
        ApiConfiguration mockApiConfiguration = mock(ApiConfiguration.class);
        when(mockApiConfiguration.getApiClient()).thenReturn(mockApiClient);
        when(mockApiConfiguration.getSerializer()).thenReturn(mockSerializer);

        AuthenticationConfiguration mockAuthenticationConfiguration = getMockAuthenticationConfiguration();

        LwaClient lwaClient = LwaClient.builder()
                .withApiConfiguration(mockApiConfiguration)
                .withAuthenticationConfiguration(mockAuthenticationConfiguration)
                .build();

        assertEquals(lwaClient.getAccessTokenForScope(testScope), testAccessToken);
        assertEquals(lwaClient.getAccessTokenForScope(testScope), testAccessToken);
        Mockito.verify(mockApiClient, times(2)).invoke(any(ApiClientRequest.class));
    }

    @Test(expected = IllegalArgumentException.class)
    public void null_api_configuration_throws_exception() {
        LwaClient.builder()
                .withApiConfiguration(null)
                .withAuthenticationConfiguration(mock(AuthenticationConfiguration.class))
                .build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void null_authentication_configuration_throws_exception() {
        LwaClient.builder()
                .withApiConfiguration(mock(ApiConfiguration.class))
                .withAuthenticationConfiguration(null)
                .build();
    }

    @Test(expected = IllegalArgumentException.class)
    public void null_scope_throws_exception() {
        LwaClient lwaClient = LwaClient.builder()
                .withApiConfiguration(mock(ApiConfiguration.class))
                .withAuthenticationConfiguration(mock(AuthenticationConfiguration.class))
                .build();
        lwaClient.getAccessTokenForScope(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void empty_scope_throws_exception() {
        LwaClient lwaClient = LwaClient.builder()
                .withApiConfiguration(mock(ApiConfiguration.class))
                .withAuthenticationConfiguration(mock(AuthenticationConfiguration.class))
                .build();
        lwaClient.getAccessTokenForScope("");
    }

    @Test
    public void get_access_token_for_refresh_token() {
        String endpoint = "https://api.amazon.com";
        AccessTokenResponse response = mock(AccessTokenResponse.class);

        ArgumentCaptor<String> payloadCaptor = ArgumentCaptor.forClass(String.class);
        Serializer mockSerializer = getMockSerializer(response, payloadCaptor);

        ArgumentCaptor<ApiClientRequest> requestCaptor = ArgumentCaptor.forClass(ApiClientRequest.class);
        ApiClient mockApiClient = getMockApiClient(200, requestCaptor);
        ApiConfiguration mockApiConfiguration = mock(ApiConfiguration.class);
        when(mockApiConfiguration.getApiClient()).thenReturn(mockApiClient);
        when(mockApiConfiguration.getSerializer()).thenReturn(mockSerializer);
        when(mockApiConfiguration.getApiEndpoint()).thenReturn(endpoint);

        AuthenticationConfiguration mockAuthenticationConfiguration = getMockAuthenticationConfiguration();

        LwaClient lwaClient = LwaClient.builder()
                .withApiConfiguration(mockApiConfiguration)
                .withAuthenticationConfiguration(mockAuthenticationConfiguration)
                .withGrantType(GrantType.REFRESH_TOKEN)
                .build();

        lwaClient.getAccessTokenForRefreshToken();
        ApiClientRequest capturedRequest = requestCaptor.getValue();
        assertEquals(capturedRequest.getUrl(), endpoint + "/auth/O2/token");
        assertEquals(capturedRequest.getMethod(), "POST");
        assertEquals(capturedRequest.getBody(), ("grant_type=refresh_token&client_id=" + testClientId
                + "&client_secret=" + testClientSecret + "&refresh_token=" + testRefreshToken));
        assertEquals(capturedRequest.getHeaders().size(), 1);
        Pair<String, String> header = capturedRequest.getHeaders().get(0);
        assertEquals(header.getName(), "Content-Type");
        assertEquals(header.getValue(), "application/x-www-form-urlencoded");

    }

    private AccessTokenResponse getMockResponse(String accessToken, long expiresIn) {
        AccessTokenResponse response = mock(AccessTokenResponse.class);
        when(response.getAccessToken()).thenReturn(accessToken);
        when(response.getExpiresIn()).thenReturn(expiresIn);
        return response;
    }

    private Serializer getMockSerializer(AccessTokenResponse mockResponse, ArgumentCaptor<String> payloadCaptor) {
        Serializer mockSerializer = mock(Serializer.class);
        when(mockSerializer.deserialize(payloadCaptor != null ? payloadCaptor.capture() : any(String.class), any())).thenReturn(mockResponse);
        return mockSerializer;
    }

    private ApiClient getMockApiClient(int statusCode, ArgumentCaptor<ApiClientRequest> requestCaptor) {
        ApiClient mockApiClient = mock(ApiClient.class);
        ApiClientResponse mockApiClientResponse = mock(ApiClientResponse.class);
        when(mockApiClientResponse.getStatusCode()).thenReturn(statusCode);
        when(mockApiClientResponse.getBody()).thenReturn(testResponseBody);
        when(mockApiClient.invoke(requestCaptor != null ? requestCaptor.capture() : any(ApiClientRequest.class))).thenReturn(mockApiClientResponse);
        return mockApiClient;
    }

    private AuthenticationConfiguration getMockAuthenticationConfiguration() {
        AuthenticationConfiguration mockAuthenticationConfiguration = mock(AuthenticationConfiguration.class);
        when(mockAuthenticationConfiguration.getClientId()).thenReturn(testClientId);
        when(mockAuthenticationConfiguration.getClientSecret()).thenReturn(testClientSecret);
        when(mockAuthenticationConfiguration.getRefreshToken()).thenReturn(testRefreshToken);
        return mockAuthenticationConfiguration;
    }

}
