package com.amazon.ask.model.services;

public class ServiceClientResponse {

  private Class type;
  private int statusCode;
  private String message;

  public ServiceClientResponse(Class type, int statusCode, String message) {
    this.type = type;
    this.statusCode = statusCode;
    this.message = message;
  }

  /**
   * Retrieves the Well-known representation of the Response
   * @return Java.lang.Class of the Response
   */
  public Class getType() {
    return type;
  }

  public void setType(Class type) {
    this.type = type;
  }

  /**
   * Status code returned with the response
   * @return Status code
   */
  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  /**
   * Error message to be displayed when a Response of this type is encountered.
   * @return Message
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
