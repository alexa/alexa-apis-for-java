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

package com.amazon.ask.smapi.model.utils;

import java.util.HashMap;
import java.util.Map;

/**
* Static class that contains a mapping of all the Subtypes of an abstract base type sorted by their
* discriminator value.
*/
public class SubTypesManifest {
  private static Map<Class, Map<String, Class>> baseTypes;

  static {
    baseTypes = new HashMap<>();

    Map<String, Class> v0DevelopmentEventsSubscriberEndpointAuthorizationSubTypes = new HashMap<>();
    v0DevelopmentEventsSubscriberEndpointAuthorizationSubTypes.put("AWS_IAM", com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.EndpointAwsAuthorization.class);
    baseTypes.put(com.amazon.ask.smapi.model.v0.developmentEvents.subscriber.EndpointAuthorization.class, v0DevelopmentEventsSubscriberEndpointAuthorizationSubTypes);

    Map<String, Class> v0EventSchemaBaseSchemaSubTypes = new HashMap<>();
    v0EventSchemaBaseSchemaSubTypes.put("AlexaDevelopmentEvent.InteractionModelUpdate", com.amazon.ask.smapi.model.v0.eventSchema.AlexaDevelopmentEvent.InteractionModelUpdate.class);
    v0EventSchemaBaseSchemaSubTypes.put("AlexaDevelopmentEvent.SkillPublish", com.amazon.ask.smapi.model.v0.eventSchema.AlexaDevelopmentEvent.SkillPublish.class);
    v0EventSchemaBaseSchemaSubTypes.put("AlexaDevelopmentEvent.ManifestUpdate", com.amazon.ask.smapi.model.v0.eventSchema.AlexaDevelopmentEvent.ManifestUpdate.class);
    v0EventSchemaBaseSchemaSubTypes.put("AlexaDevelopmentEvent.SkillCertification", com.amazon.ask.smapi.model.v0.eventSchema.AlexaDevelopmentEvent.SkillCertification.class);
    baseTypes.put(com.amazon.ask.smapi.model.v0.eventSchema.BaseSchema.class, v0EventSchemaBaseSchemaSubTypes);

    Map<String, Class> v1SkillManifestInterfaceSubTypes = new HashMap<>();
    v1SkillManifestInterfaceSubTypes.put("ALEXA_PRESENTATION_APL", com.amazon.ask.smapi.model.v1.skill.Manifest.AlexaPresentationAplInterface.class);
    v1SkillManifestInterfaceSubTypes.put("CUSTOM_INTERFACE", com.amazon.ask.smapi.model.v1.skill.Manifest.CustomInterface.class);
    v1SkillManifestInterfaceSubTypes.put("ALEXA_PRESENTATION_HTML", com.amazon.ask.smapi.model.v1.skill.Manifest.AlexaPresentationHtmlInterface.class);
    v1SkillManifestInterfaceSubTypes.put("AUDIO_PLAYER", com.amazon.ask.smapi.model.v1.skill.Manifest.AudioInterface.class);
    v1SkillManifestInterfaceSubTypes.put("GAME_ENGINE", com.amazon.ask.smapi.model.v1.skill.Manifest.GameEngineInterface.class);
    v1SkillManifestInterfaceSubTypes.put("RENDER_TEMPLATE", com.amazon.ask.smapi.model.v1.skill.Manifest.DisplayInterface.class);
    v1SkillManifestInterfaceSubTypes.put("GADGET_CONTROLLER", com.amazon.ask.smapi.model.v1.skill.Manifest.GadgetControllerInterface.class);
    v1SkillManifestInterfaceSubTypes.put("VIDEO_APP", com.amazon.ask.smapi.model.v1.skill.Manifest.VideoAppInterface.class);
    baseTypes.put(com.amazon.ask.smapi.model.v1.skill.Manifest.ModelInterface.class, v1SkillManifestInterfaceSubTypes);

    Map<String, Class> v1SkillInteractionModelSlotValidationSubTypes = new HashMap<>();
    v1SkillInteractionModelSlotValidationSubTypes.put("hasEntityResolutionMatch", com.amazon.ask.smapi.model.v1.skill.interactionModel.HasEntityResolutionMatch.class);
    v1SkillInteractionModelSlotValidationSubTypes.put("isLessThanOrEqualTo", com.amazon.ask.smapi.model.v1.skill.interactionModel.IsLessThanOrEqualTo.class);
    v1SkillInteractionModelSlotValidationSubTypes.put("isGreaterThan", com.amazon.ask.smapi.model.v1.skill.interactionModel.IsGreaterThan.class);
    v1SkillInteractionModelSlotValidationSubTypes.put("isNotInSet", com.amazon.ask.smapi.model.v1.skill.interactionModel.IsNotInSet.class);
    v1SkillInteractionModelSlotValidationSubTypes.put("isInDuration", com.amazon.ask.smapi.model.v1.skill.interactionModel.IsInDuration.class);
    v1SkillInteractionModelSlotValidationSubTypes.put("isLessThan", com.amazon.ask.smapi.model.v1.skill.interactionModel.IsLessThan.class);
    v1SkillInteractionModelSlotValidationSubTypes.put("isNotInDuration", com.amazon.ask.smapi.model.v1.skill.interactionModel.IsNotInDuration.class);
    v1SkillInteractionModelSlotValidationSubTypes.put("isGreaterThanOrEqualTo", com.amazon.ask.smapi.model.v1.skill.interactionModel.IsGreaterThanOrEqualTo.class);
    v1SkillInteractionModelSlotValidationSubTypes.put("isInSet", com.amazon.ask.smapi.model.v1.skill.interactionModel.IsInSet.class);
    baseTypes.put(com.amazon.ask.smapi.model.v1.skill.interactionModel.SlotValidation.class, v1SkillInteractionModelSlotValidationSubTypes);

    Map<String, Class> v1SkillInteractionModelValueSupplierSubTypes = new HashMap<>();
    v1SkillInteractionModelValueSupplierSubTypes.put("CatalogValueSupplier", com.amazon.ask.smapi.model.v1.skill.interactionModel.CatalogValueSupplier.class);
    v1SkillInteractionModelValueSupplierSubTypes.put("InlineValueSupplier", com.amazon.ask.smapi.model.v1.skill.interactionModel.InlineValueSupplier.class);
    baseTypes.put(com.amazon.ask.smapi.model.v1.skill.interactionModel.ValueSupplier.class, v1SkillInteractionModelValueSupplierSubTypes);
  }

  /**
  * @param baseTypeClass Base type to search the subType from
  * @return Map of types associated with the base type
  */
  public static Map<String, Class> getSubType(Class baseTypeClass) {
    return baseTypes.get(baseTypeClass);
  }

  /**
  * @param baseTypeClass Base type to search the subType from
  * @param discriminatorValue String discriminator value to find the subtype from the base class
  * @return Class associated to the provided discriminator value or null if SubType for Parent and discriminator value pair is not found
  */
  public static Class getSubTypeClass(Class baseTypeClass, String discriminatorValue) {
    return baseTypes.get(baseTypeClass).get(discriminatorValue);
  }
}