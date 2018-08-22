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
 * Exception thrown by a Service client when an error response was received or some operation failed.
 */
public class ServiceException extends Exception {

  private int statusCode;
  private List<Pair<String, String>> headers;
  private Object body;

  public ServiceException(final String message, final int statusCode,
      final List<Pair<String, String>> headers, final Object body) {

    this(message, statusCode, headers, body, null);
  }

  public ServiceException(final String message, final int statusCode,
      final List<Pair<String, String>> headers, final Object body, final Throwable cause) {

    super(message, cause);
    this.statusCode = statusCode;
    this.headers = headers;
    this.body = body;
  }

  /**
   * Gets the status code of the Http Response
   * @return status code integer
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Sets the status code of the Http Response
   */
  public void setStatusCode(final int statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * Gets the headers of the Http Response that return the failure.
   * @return List of headers
   */
  public List<Pair<String, String>> getHeaders() {
    return headers;
  }

  /**
   * Sets the headers of the Http Response that return the failure.
   */
  public void setHeaders(final List<Pair<String, String>> headers) {
    this.headers = headers;
  }

  public Object getBody() {
    return body;
  }

  public void setBody(final String body) {
    this.body = body;
  }
}
