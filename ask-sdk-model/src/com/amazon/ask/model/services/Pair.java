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

import java.util.Objects;

/**
 * Implementation of a Pair data structure.
 * @param <K> Type of the name of the pair
 * @param <V> Type of the value of the pair
 */
public class Pair<K, V> {
  private K name;
  private V value;

  public Pair(K name, V value) {
    setName(name);
    setValue(value);
  }

  /**
   * Gets the name property of the pair.
   * @return Name property.
   */
  public K getName() {
    return this.name;
  }

  /**
   * Gets the value property of the pair.
   * @return value property.
   */
  public V getValue() {
    return this.value;
  }

  /**
   * Sets the value property of the pair.
   */
  private void setName(final K name) {
    this.name = name;
  }

  /**
   * Sets the name property of the pair.
   */
  private void setValue(final V value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pair<?, ?> pair = (Pair<?, ?>) o;
    return Objects.equals(name, pair.name) &&
        Objects.equals(value, pair.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value);
  }
}
