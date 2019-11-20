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

import java.util.List;

/**
 * Represents the interface between <code>ApiClient</code> and a Service Client.
 */
public class ApiClientMessage {
  private List<Pair<String, String>> headers;
  private String body;

  public List<Pair<String, String>> getHeaders() {
    return headers;
  }

  public void setHeaders(final List<Pair<String, String>> headers) {
    this.headers = headers;
  }

  public String getBody() {
    return body;
  }

  public void setBody(final String body) {
    this.body = body;
  }
}
