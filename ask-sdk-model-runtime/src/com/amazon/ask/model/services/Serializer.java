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

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Represents an object used for Serialization tasks.
 */
public interface Serializer {

  /**
   * Serializes an Object into a string.
   * @param object Target to serialize
   * @param <T> Type of the Object to serialize
   * @return Serialized object
   */
  <T> String serialize(T object);

  /**
   * Serializes an Object to an OutputStream.
   * @param object Object to serialize.
   * @param outputStream Stream to serialize to.
   * @param <T> Type of the Object to serialize
   */
  <T> void serialize(T object, OutputStream outputStream);

  /**
   * Deserializes a String into an Object of a Well-known type.
   * @param payload String to deserialize
   * @param type Target type of deserialization
   * @param <T> Type of the Object to deserialize
   * @return Deserialized object
   */
  <T> T deserialize(String payload, Class<T> type);

  /**
   * Deserializes an InputStream into an Object of a Well-known type.
   * @param inputStream Stream to deserialize from
   * @param type Target type of deserialization
   * @param <T> Type of the Object to deserialize
   * @return Deserialized object
   */
  <T> T deserialize(InputStream inputStream, Class<T> type);

}
