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


package com.amazon.ask.smapi.model.v0.catalog;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Usage of the catalog.
 */
public enum CatalogUsage {
  
  ALEXAMUSIC_CATALOG_BROADCASTCHANNEL("AlexaMusic.Catalog.BroadcastChannel"),
  
  ALEXAMUSIC_CATALOG_GENRE("AlexaMusic.Catalog.Genre"),
  
  ALEXAMUSIC_CATALOG_MUSICALBUM("AlexaMusic.Catalog.MusicAlbum"),
  
  ALEXAMUSIC_CATALOG_MUSICGROUP("AlexaMusic.Catalog.MusicGroup"),
  
  ALEXAMUSIC_CATALOG_MUSICPLAYLIST("AlexaMusic.Catalog.MusicPlaylist"),
  
  ALEXAMUSIC_CATALOG_MUSICRECORDING("AlexaMusic.Catalog.MusicRecording"),
  
  ALEXAMUSIC_CATALOG_TERRESTRIALRADIOCHANNEL("AlexaMusic.Catalog.TerrestrialRadioChannel"),
  
  ALEXATEST_CATALOG_AUDIORECORDING("AlexaTest.Catalog.AudioRecording"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  CatalogUsage(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CatalogUsage fromValue(String text) {
    for (CatalogUsage b : CatalogUsage.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return CatalogUsage.UNKNOWN_TO_SDK_VERSION;
  }
}

