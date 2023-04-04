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


package com.amazon.ask.smapi.model.v1.skill.Manifest;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Name of the required permission.
 */
public enum PermissionName {
  
  ALEXA_DEVICE_ID_READ("alexa::device_id:read"),
  
  ALEXA_PERSONALITY_EXPLICIT_READ("alexa::personality:explicit:read"),
  
  ALEXA_AUTHENTICATE_2_MANDATORY("alexa::authenticate:2:mandatory"),
  
  ALEXA_DEVICES_ALL_ADDRESS_COUNTRY_AND_POSTAL_CODE_READ("alexa:devices:all:address:country_and_postal_code:read"),
  
  ALEXA_PROFILE_MOBILE_NUMBER_READ("alexa::profile:mobile_number:read"),
  
  ALEXA_ASYNC_EVENT_WRITE("alexa::async_event:write"),
  
  ALEXA_DEVICE_TYPE_READ("alexa::device_type:read"),
  
  ALEXA_SKILL_PROACTIVE_ENABLEMENT("alexa::skill:proactive_enablement"),
  
  ALEXA_PERSONALITY_EXPLICIT_WRITE("alexa::personality:explicit:write"),
  
  ALEXA_HOUSEHOLD_LISTS_READ("alexa::household:lists:read"),
  
  ALEXA_UTTERANCE_ID_READ("alexa::utterance_id:read"),
  
  ALEXA_USER_EXPERIENCE_GUIDANCE_READ("alexa::user_experience_guidance:read"),
  
  ALEXA_DEVICES_ALL_NOTIFICATIONS_WRITE("alexa::devices:all:notifications:write"),
  
  AVS_DISTRIBUTED_AUDIO("avs::distributed_audio"),
  
  ALEXA_DEVICES_ALL_ADDRESS_FULL_READ("alexa::devices:all:address:full:read"),
  
  ALEXA_DEVICES_ALL_NOTIFICATIONS_URGENT_WRITE("alexa::devices:all:notifications:urgent:write"),
  
  PAYMENTS_AUTOPAY_CONSENT("payments:autopay_consent"),
  
  ALEXA_ALERTS_TIMERS_SKILL_READWRITE("alexa::alerts:timers:skill:readwrite"),
  
  ALEXA_CUSTOMER_ID_READ("alexa::customer_id:read"),
  
  ALEXA_SKILL_CDS_MONETIZATION("alexa::skill:cds:monetization"),
  
  ALEXA_MUSIC_CAST("alexa::music:cast"),
  
  ALEXA_PROFILE_GIVEN_NAME_READ("alexa::profile:given_name:read"),
  
  ALEXA_ALERTS_REMINDERS_SKILL_READWRITE("alexa::alerts:reminders:skill:readwrite"),
  
  ALEXA_HOUSEHOLD_LISTS_WRITE("alexa::household:lists:write"),
  
  ALEXA_PROFILE_EMAIL_READ("alexa::profile:email:read"),
  
  ALEXA_PROFILE_NAME_READ("alexa::profile:name:read"),
  
  ALEXA_DEVICES_ALL_GEOLOCATION_READ("alexa::devices:all:geolocation:read"),
  
  ALEXA_RAW_PERSON_ID_READ("alexa::raw_person_id:read"),
  
  ALEXA_AUTHENTICATE_2_OPTIONAL("alexa::authenticate:2:optional"),
  
  ALEXA_HEALTH_PROFILE_WRITE("alexa::health:profile:write"),
  
  ALEXA_PERSON_ID_READ("alexa::person_id:read"),
  
  ALEXA_SKILL_PRODUCTS_ENTITLEMENTS("alexa::skill:products:entitlements"),
  
  ALEXA_ENERGY_DEVICES_STATE_READ("alexa::energy:devices:state:read"),
  
  ALEXA_ORIGIN_IP_ADDRESS_READ("alexa::origin_ip_address:read"),
  
  ALEXA_DEVICES_ALL_COARSE_LOCATION_READ("alexa::devices:all:coarse_location:read"),
  
  ALEXA_DEVICES_ALL_TOKENIZED_GEOLOCATION_READ("alexa::devices:all:tokenized_geolocation:read"),
  
  ALEXA_MEASUREMENT_SYSTEM_READWRITE("alexa::measurement_system::readwrite"),
  
  DASH_VENDOR_READ_ENDPOINTS("dash::vendor:read:endpoints"),
  
  DASH_READ_ENDPOINTS_SENSORS("dash::read:endpoints:sensors"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  PermissionName(String value) {
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
  public static PermissionName fromValue(String text) {
    for (PermissionName b : PermissionName.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return PermissionName.UNKNOWN_TO_SDK_VERSION;
  }
}

