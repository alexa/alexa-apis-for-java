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


package com.amazon.ask.smapi.model.v1.isp;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets v1.isp.DistributionCountries
 */
public enum DistributionCountries {
  
  AF("AF"),
  
  AX("AX"),
  
  AL("AL"),
  
  DZ("DZ"),
  
  AS("AS"),
  
  AD("AD"),
  
  AO("AO"),
  
  AI("AI"),
  
  AQ("AQ"),
  
  AG("AG"),
  
  AR("AR"),
  
  AM("AM"),
  
  AW("AW"),
  
  AU("AU"),
  
  AT("AT"),
  
  AZ("AZ"),
  
  BS("BS"),
  
  BH("BH"),
  
  BD("BD"),
  
  BB("BB"),
  
  BY("BY"),
  
  BE("BE"),
  
  BZ("BZ"),
  
  BJ("BJ"),
  
  BM("BM"),
  
  BT("BT"),
  
  BO("BO"),
  
  BA("BA"),
  
  BW("BW"),
  
  BV("BV"),
  
  BR("BR"),
  
  IO("IO"),
  
  BN("BN"),
  
  BG("BG"),
  
  BF("BF"),
  
  BI("BI"),
  
  KH("KH"),
  
  CM("CM"),
  
  CA("CA"),
  
  CV("CV"),
  
  KY("KY"),
  
  CF("CF"),
  
  TD("TD"),
  
  CL("CL"),
  
  CN("CN"),
  
  CX("CX"),
  
  CC("CC"),
  
  CO("CO"),
  
  KM("KM"),
  
  CG("CG"),
  
  CD("CD"),
  
  CK("CK"),
  
  CR("CR"),
  
  HR("HR"),
  
  CY("CY"),
  
  CZ("CZ"),
  
  DK("DK"),
  
  DJ("DJ"),
  
  DM("DM"),
  
  DO("DO"),
  
  EC("EC"),
  
  EG("EG"),
  
  SV("SV"),
  
  GQ("GQ"),
  
  ER("ER"),
  
  EE("EE"),
  
  ET("ET"),
  
  FK("FK"),
  
  FO("FO"),
  
  FJ("FJ"),
  
  FI("FI"),
  
  FR("FR"),
  
  GF("GF"),
  
  PF("PF"),
  
  TF("TF"),
  
  GA("GA"),
  
  GM("GM"),
  
  GE("GE"),
  
  DE("DE"),
  
  GH("GH"),
  
  GI("GI"),
  
  GR("GR"),
  
  GL("GL"),
  
  GD("GD"),
  
  GP("GP"),
  
  GU("GU"),
  
  GT("GT"),
  
  GG("GG"),
  
  GN("GN"),
  
  GW("GW"),
  
  GY("GY"),
  
  HT("HT"),
  
  HM("HM"),
  
  VA("VA"),
  
  HN("HN"),
  
  HK("HK"),
  
  HU("HU"),
  
  IS("IS"),
  
  IN("IN"),
  
  ID("ID"),
  
  IQ("IQ"),
  
  IE("IE"),
  
  IM("IM"),
  
  IL("IL"),
  
  IT("IT"),
  
  CI("CI"),
  
  JM("JM"),
  
  JP("JP"),
  
  JE("JE"),
  
  JO("JO"),
  
  KZ("KZ"),
  
  KE("KE"),
  
  KI("KI"),
  
  KR("KR"),
  
  KW("KW"),
  
  KG("KG"),
  
  LA("LA"),
  
  LV("LV"),
  
  LB("LB"),
  
  LS("LS"),
  
  LR("LR"),
  
  LY("LY"),
  
  LI("LI"),
  
  LT("LT"),
  
  LU("LU"),
  
  MO("MO"),
  
  MK("MK"),
  
  MG("MG"),
  
  MW("MW"),
  
  MY("MY"),
  
  MV("MV"),
  
  ML("ML"),
  
  MT("MT"),
  
  MH("MH"),
  
  MQ("MQ"),
  
  MR("MR"),
  
  MU("MU"),
  
  YT("YT"),
  
  MX("MX"),
  
  FM("FM"),
  
  MD("MD"),
  
  MC("MC"),
  
  MN("MN"),
  
  ME("ME"),
  
  MS("MS"),
  
  MA("MA"),
  
  MZ("MZ"),
  
  MM("MM"),
  
  NA("NA"),
  
  NR("NR"),
  
  NP("NP"),
  
  NL("NL"),
  
  AN("AN"),
  
  NC("NC"),
  
  NZ("NZ"),
  
  NI("NI"),
  
  NE("NE"),
  
  NG("NG"),
  
  NU("NU"),
  
  NF("NF"),
  
  MP("MP"),
  
  NO("NO"),
  
  OM("OM"),
  
  PK("PK"),
  
  PW("PW"),
  
  PS("PS"),
  
  PA("PA"),
  
  PG("PG"),
  
  PY("PY"),
  
  PE("PE"),
  
  PH("PH"),
  
  PN("PN"),
  
  PL("PL"),
  
  PT("PT"),
  
  PR("PR"),
  
  QA("QA"),
  
  RE("RE"),
  
  RO("RO"),
  
  RU("RU"),
  
  RW("RW"),
  
  BL("BL"),
  
  SH("SH"),
  
  KN("KN"),
  
  LC("LC"),
  
  MF("MF"),
  
  PM("PM"),
  
  VC("VC"),
  
  WS("WS"),
  
  SM("SM"),
  
  ST("ST"),
  
  SA("SA"),
  
  SN("SN"),
  
  RS("RS"),
  
  SC("SC"),
  
  SL("SL"),
  
  SG("SG"),
  
  SK("SK"),
  
  SI("SI"),
  
  SB("SB"),
  
  SO("SO"),
  
  ZA("ZA"),
  
  GS("GS"),
  
  ES("ES"),
  
  LK("LK"),
  
  SR("SR"),
  
  SJ("SJ"),
  
  SZ("SZ"),
  
  SE("SE"),
  
  CH("CH"),
  
  TW("TW"),
  
  TJ("TJ"),
  
  TZ("TZ"),
  
  TH("TH"),
  
  TL("TL"),
  
  TG("TG"),
  
  TK("TK"),
  
  TO("TO"),
  
  TT("TT"),
  
  TN("TN"),
  
  TR("TR"),
  
  TM("TM"),
  
  TC("TC"),
  
  TV("TV"),
  
  UG("UG"),
  
  UA("UA"),
  
  AE("AE"),
  
  GB("GB"),
  
  US("US"),
  
  UM("UM"),
  
  UY("UY"),
  
  UZ("UZ"),
  
  VU("VU"),
  
  VE("VE"),
  
  VN("VN"),
  
  VG("VG"),
  
  VI("VI"),
  
  WF("WF"),
  
  EH("EH"),
  
  YE("YE"),
  
  ZM("ZM"),
  
  ZW("ZW"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  DistributionCountries(String value) {
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
  public static DistributionCountries fromValue(String text) {
    for (DistributionCountries b : DistributionCountries.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return DistributionCountries.UNKNOWN_TO_SDK_VERSION;
  }
}

