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

package com.amazon.ask.model.utils;

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

    Map<String, Class> causeSubTypes = new HashMap<>();
    causeSubTypes.put("ConnectionCompleted", com.amazon.ask.model.ConnectionCompleted.class);
    baseTypes.put(com.amazon.ask.model.Cause.class, causeSubTypes);

    Map<String, Class> directiveSubTypes = new HashMap<>();
    directiveSubTypes.put("CustomInterfaceController.StopEventHandler", com.amazon.ask.model.interfaces.customInterfaceController.StopEventHandlerDirective.class);
    directiveSubTypes.put("Connections.SendRequest", com.amazon.ask.model.interfaces.connections.SendRequestDirective.class);
    directiveSubTypes.put("Dialog.UpdateDynamicEntities", com.amazon.ask.model.dialog.DynamicEntitiesDirective.class);
    directiveSubTypes.put("CustomInterfaceController.StartEventHandler", com.amazon.ask.model.interfaces.customInterfaceController.StartEventHandlerDirective.class);
    directiveSubTypes.put("GadgetController.SetLight", com.amazon.ask.model.interfaces.gadgetController.SetLightDirective.class);
    directiveSubTypes.put("Dialog.Delegate", com.amazon.ask.model.dialog.DelegateDirective.class);
    directiveSubTypes.put("Dialog.ConfirmIntent", com.amazon.ask.model.dialog.ConfirmIntentDirective.class);
    directiveSubTypes.put("CustomInterfaceController.SendDirective", com.amazon.ask.model.interfaces.customInterfaceController.SendDirectiveDirective.class);
    directiveSubTypes.put("Dialog.ElicitSlot", com.amazon.ask.model.dialog.ElicitSlotDirective.class);
    directiveSubTypes.put("AudioPlayer.Stop", com.amazon.ask.model.interfaces.audioplayer.StopDirective.class);
    directiveSubTypes.put("Dialog.ConfirmSlot", com.amazon.ask.model.dialog.ConfirmSlotDirective.class);
    directiveSubTypes.put("AudioPlayer.Play", com.amazon.ask.model.interfaces.audioplayer.PlayDirective.class);
    directiveSubTypes.put("Alexa.Presentation.APL.ExecuteCommands", com.amazon.ask.model.interfaces.alexa.presentation.apl.ExecuteCommandsDirective.class);
    directiveSubTypes.put("Display.RenderTemplate", com.amazon.ask.model.interfaces.display.RenderTemplateDirective.class);
    directiveSubTypes.put("Hint", com.amazon.ask.model.interfaces.display.HintDirective.class);
    directiveSubTypes.put("Connections.StartConnection", com.amazon.ask.model.interfaces.connections.V1.StartConnectionDirective.class);
    directiveSubTypes.put("Alexa.Presentation.APLT.RenderDocument", com.amazon.ask.model.interfaces.alexa.presentation.aplt.RenderDocumentDirective.class);
    directiveSubTypes.put("GameEngine.StartInputHandler", com.amazon.ask.model.interfaces.gameEngine.StartInputHandlerDirective.class);
    directiveSubTypes.put("VideoApp.Launch", com.amazon.ask.model.interfaces.videoapp.LaunchDirective.class);
    directiveSubTypes.put("Alexa.Presentation.APLT.ExecuteCommands", com.amazon.ask.model.interfaces.alexa.presentation.aplt.ExecuteCommandsDirective.class);
    directiveSubTypes.put("GameEngine.StopInputHandler", com.amazon.ask.model.interfaces.gameEngine.StopInputHandlerDirective.class);
    directiveSubTypes.put("Tasks.CompleteTask", com.amazon.ask.model.interfaces.tasks.CompleteTaskDirective.class);
    directiveSubTypes.put("Alexa.Presentation.APL.RenderDocument", com.amazon.ask.model.interfaces.alexa.presentation.apl.RenderDocumentDirective.class);
    directiveSubTypes.put("Connections.SendResponse", com.amazon.ask.model.interfaces.connections.SendResponseDirective.class);
    directiveSubTypes.put("AudioPlayer.ClearQueue", com.amazon.ask.model.interfaces.audioplayer.ClearQueueDirective.class);
    baseTypes.put(com.amazon.ask.model.Directive.class, directiveSubTypes);

    Map<String, Class> requestSubTypes = new HashMap<>();
    requestSubTypes.put("AlexaSkillEvent.SkillEnabled", com.amazon.ask.model.events.skillevents.SkillEnabledRequest.class);
    requestSubTypes.put("AlexaHouseholdListEvent.ListUpdated", com.amazon.ask.model.services.listManagement.ListUpdatedEventRequest.class);
    requestSubTypes.put("Alexa.Presentation.APL.UserEvent", com.amazon.ask.model.interfaces.alexa.presentation.apl.UserEvent.class);
    requestSubTypes.put("AlexaSkillEvent.SkillDisabled", com.amazon.ask.model.events.skillevents.SkillDisabledRequest.class);
    requestSubTypes.put("AlexaHouseholdListEvent.ItemsCreated", com.amazon.ask.model.services.listManagement.ListItemsCreatedEventRequest.class);
    requestSubTypes.put("SessionResumedRequest", com.amazon.ask.model.SessionResumedRequest.class);
    requestSubTypes.put("SessionEndedRequest", com.amazon.ask.model.SessionEndedRequest.class);
    requestSubTypes.put("AudioPlayer.PlaybackFailed", com.amazon.ask.model.interfaces.audioplayer.PlaybackFailedRequest.class);
    requestSubTypes.put("CanFulfillIntentRequest", com.amazon.ask.model.canfulfill.CanFulfillIntentRequest.class);
    requestSubTypes.put("CustomInterfaceController.Expired", com.amazon.ask.model.interfaces.customInterfaceController.ExpiredRequest.class);
    requestSubTypes.put("LaunchRequest", com.amazon.ask.model.LaunchRequest.class);
    requestSubTypes.put("Reminders.ReminderCreated", com.amazon.ask.model.services.reminderManagement.ReminderCreatedEventRequest.class);
    requestSubTypes.put("Alexa.Presentation.APLT.UserEvent", com.amazon.ask.model.interfaces.alexa.presentation.aplt.UserEvent.class);
    requestSubTypes.put("AlexaHouseholdListEvent.ItemsUpdated", com.amazon.ask.model.services.listManagement.ListItemsUpdatedEventRequest.class);
    requestSubTypes.put("AlexaHouseholdListEvent.ListCreated", com.amazon.ask.model.services.listManagement.ListCreatedEventRequest.class);
    requestSubTypes.put("AudioPlayer.PlaybackStarted", com.amazon.ask.model.interfaces.audioplayer.PlaybackStartedRequest.class);
    requestSubTypes.put("AudioPlayer.PlaybackNearlyFinished", com.amazon.ask.model.interfaces.audioplayer.PlaybackNearlyFinishedRequest.class);
    requestSubTypes.put("CustomInterfaceController.EventsReceived", com.amazon.ask.model.interfaces.customInterfaceController.EventsReceivedRequest.class);
    requestSubTypes.put("Reminders.ReminderStatusChanged", com.amazon.ask.model.services.reminderManagement.ReminderStatusChangedEventRequest.class);
    requestSubTypes.put("AlexaHouseholdListEvent.ItemsDeleted", com.amazon.ask.model.services.listManagement.ListItemsDeletedEventRequest.class);
    requestSubTypes.put("Reminders.ReminderDeleted", com.amazon.ask.model.services.reminderManagement.ReminderDeletedEventRequest.class);
    requestSubTypes.put("Connections.Response", com.amazon.ask.model.interfaces.connections.ConnectionsResponse.class);
    requestSubTypes.put("AlexaHouseholdListEvent.ListDeleted", com.amazon.ask.model.services.listManagement.ListDeletedEventRequest.class);
    requestSubTypes.put("GameEngine.InputHandlerEvent", com.amazon.ask.model.interfaces.gameEngine.InputHandlerEventRequest.class);
    requestSubTypes.put("PlaybackController.PauseCommandIssued", com.amazon.ask.model.interfaces.playbackcontroller.PauseCommandIssuedRequest.class);
    requestSubTypes.put("PlaybackController.PlayCommandIssued", com.amazon.ask.model.interfaces.playbackcontroller.PlayCommandIssuedRequest.class);
    requestSubTypes.put("AudioPlayer.PlaybackFinished", com.amazon.ask.model.interfaces.audioplayer.PlaybackFinishedRequest.class);
    requestSubTypes.put("AlexaSkillEvent.ProactiveSubscriptionChanged", com.amazon.ask.model.events.skillevents.ProactiveSubscriptionChangedRequest.class);
    requestSubTypes.put("Display.ElementSelected", com.amazon.ask.model.interfaces.display.ElementSelectedRequest.class);
    requestSubTypes.put("AlexaSkillEvent.SkillPermissionChanged", com.amazon.ask.model.events.skillevents.PermissionChangedRequest.class);
    requestSubTypes.put("Reminders.ReminderUpdated", com.amazon.ask.model.services.reminderManagement.ReminderUpdatedEventRequest.class);
    requestSubTypes.put("IntentRequest", com.amazon.ask.model.IntentRequest.class);
    requestSubTypes.put("Reminders.ReminderStarted", com.amazon.ask.model.services.reminderManagement.ReminderStartedEventRequest.class);
    requestSubTypes.put("AudioPlayer.PlaybackStopped", com.amazon.ask.model.interfaces.audioplayer.PlaybackStoppedRequest.class);
    requestSubTypes.put("PlaybackController.PreviousCommandIssued", com.amazon.ask.model.interfaces.playbackcontroller.PreviousCommandIssuedRequest.class);
    requestSubTypes.put("AlexaSkillEvent.SkillAccountLinked", com.amazon.ask.model.events.skillevents.AccountLinkedRequest.class);
    requestSubTypes.put("Messaging.MessageReceived", com.amazon.ask.model.interfaces.messaging.MessageReceivedRequest.class);
    requestSubTypes.put("Connections.Request", com.amazon.ask.model.interfaces.connections.ConnectionsRequest.class);
    requestSubTypes.put("System.ExceptionEncountered", com.amazon.ask.model.interfaces.system.ExceptionEncounteredRequest.class);
    requestSubTypes.put("AlexaSkillEvent.SkillPermissionAccepted", com.amazon.ask.model.events.skillevents.PermissionAcceptedRequest.class);
    requestSubTypes.put("PlaybackController.NextCommandIssued", com.amazon.ask.model.interfaces.playbackcontroller.NextCommandIssuedRequest.class);
    baseTypes.put(com.amazon.ask.model.Request.class, requestSubTypes);

    Map<String, Class> interfacesAlexaPresentationAplAnimatedPropertySubTypes = new HashMap<>();
    interfacesAlexaPresentationAplAnimatedPropertySubTypes.put("opacity", com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedOpacityProperty.class);
    interfacesAlexaPresentationAplAnimatedPropertySubTypes.put("transform", com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedTransformProperty.class);
    baseTypes.put(com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimatedProperty.class, interfacesAlexaPresentationAplAnimatedPropertySubTypes);

    Map<String, Class> interfacesAlexaPresentationAplCommandSubTypes = new HashMap<>();
    interfacesAlexaPresentationAplCommandSubTypes.put("SetPage", com.amazon.ask.model.interfaces.alexa.presentation.apl.SetPageCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("ControlMedia", com.amazon.ask.model.interfaces.alexa.presentation.apl.ControlMediaCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("AutoPage", com.amazon.ask.model.interfaces.alexa.presentation.apl.AutoPageCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("PlayMedia", com.amazon.ask.model.interfaces.alexa.presentation.apl.PlayMediaCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("Scroll", com.amazon.ask.model.interfaces.alexa.presentation.apl.ScrollCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("Idle", com.amazon.ask.model.interfaces.alexa.presentation.apl.IdleCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("AnimateItem", com.amazon.ask.model.interfaces.alexa.presentation.apl.AnimateItemCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("SendEvent", com.amazon.ask.model.interfaces.alexa.presentation.apl.SendEventCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("SpeakList", com.amazon.ask.model.interfaces.alexa.presentation.apl.SpeakListCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("Sequential", com.amazon.ask.model.interfaces.alexa.presentation.apl.SequentialCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("SetState", com.amazon.ask.model.interfaces.alexa.presentation.apl.SetStateCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("SpeakItem", com.amazon.ask.model.interfaces.alexa.presentation.apl.SpeakItemCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("Parallel", com.amazon.ask.model.interfaces.alexa.presentation.apl.ParallelCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("OpenURL", com.amazon.ask.model.interfaces.alexa.presentation.apl.OpenUrlCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("ClearFocus", com.amazon.ask.model.interfaces.alexa.presentation.apl.ClearFocusCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("ScrollToIndex", com.amazon.ask.model.interfaces.alexa.presentation.apl.ScrollToIndexCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("SetValue", com.amazon.ask.model.interfaces.alexa.presentation.apl.SetValueCommand.class);
    interfacesAlexaPresentationAplCommandSubTypes.put("SetFocus", com.amazon.ask.model.interfaces.alexa.presentation.apl.SetFocusCommand.class);
    baseTypes.put(com.amazon.ask.model.interfaces.alexa.presentation.apl.Command.class, interfacesAlexaPresentationAplCommandSubTypes);

    Map<String, Class> interfacesAlexaPresentationApltCommandSubTypes = new HashMap<>();
    interfacesAlexaPresentationApltCommandSubTypes.put("SetValue", com.amazon.ask.model.interfaces.alexa.presentation.aplt.SetValueCommand.class);
    interfacesAlexaPresentationApltCommandSubTypes.put("Idle", com.amazon.ask.model.interfaces.alexa.presentation.aplt.IdleCommand.class);
    interfacesAlexaPresentationApltCommandSubTypes.put("AutoPage", com.amazon.ask.model.interfaces.alexa.presentation.aplt.AutoPageCommand.class);
    interfacesAlexaPresentationApltCommandSubTypes.put("Scroll", com.amazon.ask.model.interfaces.alexa.presentation.aplt.ScrollCommand.class);
    interfacesAlexaPresentationApltCommandSubTypes.put("SendEvent", com.amazon.ask.model.interfaces.alexa.presentation.aplt.SendEventCommand.class);
    interfacesAlexaPresentationApltCommandSubTypes.put("Parallel", com.amazon.ask.model.interfaces.alexa.presentation.aplt.ParallelCommand.class);
    interfacesAlexaPresentationApltCommandSubTypes.put("SetPage", com.amazon.ask.model.interfaces.alexa.presentation.aplt.SetPageCommand.class);
    interfacesAlexaPresentationApltCommandSubTypes.put("Sequential", com.amazon.ask.model.interfaces.alexa.presentation.aplt.SequentialCommand.class);
    baseTypes.put(com.amazon.ask.model.interfaces.alexa.presentation.aplt.Command.class, interfacesAlexaPresentationApltCommandSubTypes);

    Map<String, Class> interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes = new HashMap<>();
    interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes.put("SellerBillingAgreementAttributes", com.amazon.ask.model.interfaces.amazonpay.model.request.SellerBillingAgreementAttributes.class);
    interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes.put("Price", com.amazon.ask.model.interfaces.amazonpay.model.request.Price.class);
    interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes.put("ChargeAmazonPayRequest", com.amazon.ask.model.interfaces.amazonpay.request.ChargeAmazonPayRequest.class);
    interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes.put("BillingAgreementAttributes", com.amazon.ask.model.interfaces.amazonpay.model.request.BillingAgreementAttributes.class);
    interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes.put("SellerOrderAttributes", com.amazon.ask.model.interfaces.amazonpay.model.request.SellerOrderAttributes.class);
    interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes.put("ProviderAttributes", com.amazon.ask.model.interfaces.amazonpay.model.request.ProviderAttributes.class);
    interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes.put("AuthorizeAttributes", com.amazon.ask.model.interfaces.amazonpay.model.request.AuthorizeAttributes.class);
    interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes.put("SetupAmazonPayRequest", com.amazon.ask.model.interfaces.amazonpay.request.SetupAmazonPayRequest.class);
    interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes.put("ProviderCredit", com.amazon.ask.model.interfaces.amazonpay.model.request.ProviderCredit.class);
    baseTypes.put(com.amazon.ask.model.interfaces.amazonpay.model.request.BaseAmazonPayEntity.class, interfacesAmazonpayModelRequestBaseAmazonPayEntitySubTypes);

    Map<String, Class> interfacesConnectionsEntitiesBaseEntitySubTypes = new HashMap<>();
    interfacesConnectionsEntitiesBaseEntitySubTypes.put("PostalAddress", com.amazon.ask.model.interfaces.connections.entities.PostalAddress.class);
    interfacesConnectionsEntitiesBaseEntitySubTypes.put("Restaurant", com.amazon.ask.model.interfaces.connections.entities.Restaurant.class);
    baseTypes.put(com.amazon.ask.model.interfaces.connections.entities.BaseEntity.class, interfacesConnectionsEntitiesBaseEntitySubTypes);

    Map<String, Class> interfacesConnectionsRequestsBaseRequestSubTypes = new HashMap<>();
    interfacesConnectionsRequestsBaseRequestSubTypes.put("ScheduleFoodEstablishmentReservationRequest", com.amazon.ask.model.interfaces.connections.requests.ScheduleFoodEstablishmentReservationRequest.class);
    interfacesConnectionsRequestsBaseRequestSubTypes.put("PrintImageRequest", com.amazon.ask.model.interfaces.connections.requests.PrintImageRequest.class);
    interfacesConnectionsRequestsBaseRequestSubTypes.put("PrintWebPageRequest", com.amazon.ask.model.interfaces.connections.requests.PrintWebPageRequest.class);
    interfacesConnectionsRequestsBaseRequestSubTypes.put("PrintPDFRequest", com.amazon.ask.model.interfaces.connections.requests.PrintPDFRequest.class);
    interfacesConnectionsRequestsBaseRequestSubTypes.put("ScheduleTaxiReservationRequest", com.amazon.ask.model.interfaces.connections.requests.ScheduleTaxiReservationRequest.class);
    baseTypes.put(com.amazon.ask.model.interfaces.connections.requests.BaseRequest.class, interfacesConnectionsRequestsBaseRequestSubTypes);

    Map<String, Class> interfacesDisplayHintSubTypes = new HashMap<>();
    interfacesDisplayHintSubTypes.put("PlainText", com.amazon.ask.model.interfaces.display.PlainTextHint.class);
    baseTypes.put(com.amazon.ask.model.interfaces.display.Hint.class, interfacesDisplayHintSubTypes);

    Map<String, Class> interfacesDisplayTemplateSubTypes = new HashMap<>();
    interfacesDisplayTemplateSubTypes.put("ListTemplate2", com.amazon.ask.model.interfaces.display.ListTemplate2.class);
    interfacesDisplayTemplateSubTypes.put("ListTemplate1", com.amazon.ask.model.interfaces.display.ListTemplate1.class);
    interfacesDisplayTemplateSubTypes.put("BodyTemplate7", com.amazon.ask.model.interfaces.display.BodyTemplate7.class);
    interfacesDisplayTemplateSubTypes.put("BodyTemplate6", com.amazon.ask.model.interfaces.display.BodyTemplate6.class);
    interfacesDisplayTemplateSubTypes.put("BodyTemplate3", com.amazon.ask.model.interfaces.display.BodyTemplate3.class);
    interfacesDisplayTemplateSubTypes.put("BodyTemplate2", com.amazon.ask.model.interfaces.display.BodyTemplate2.class);
    interfacesDisplayTemplateSubTypes.put("BodyTemplate1", com.amazon.ask.model.interfaces.display.BodyTemplate1.class);
    baseTypes.put(com.amazon.ask.model.interfaces.display.Template.class, interfacesDisplayTemplateSubTypes);

    Map<String, Class> interfacesDisplayTextFieldSubTypes = new HashMap<>();
    interfacesDisplayTextFieldSubTypes.put("RichText", com.amazon.ask.model.interfaces.display.RichText.class);
    interfacesDisplayTextFieldSubTypes.put("PlainText", com.amazon.ask.model.interfaces.display.PlainText.class);
    baseTypes.put(com.amazon.ask.model.interfaces.display.TextField.class, interfacesDisplayTextFieldSubTypes);

    Map<String, Class> interfacesViewportTypedViewportStateSubTypes = new HashMap<>();
    interfacesViewportTypedViewportStateSubTypes.put("APL", com.amazon.ask.model.interfaces.viewport.APLViewportState.class);
    interfacesViewportTypedViewportStateSubTypes.put("APLT", com.amazon.ask.model.interfaces.viewport.APLTViewportState.class);
    baseTypes.put(com.amazon.ask.model.interfaces.viewport.TypedViewportState.class, interfacesViewportTypedViewportStateSubTypes);

    Map<String, Class> interfacesViewportSizeViewportSizeSubTypes = new HashMap<>();
    interfacesViewportSizeViewportSizeSubTypes.put("CONTINUOUS", com.amazon.ask.model.interfaces.viewport.size.ContinuousViewportSize.class);
    interfacesViewportSizeViewportSizeSubTypes.put("DISCRETE", com.amazon.ask.model.interfaces.viewport.size.DiscreteViewportSize.class);
    baseTypes.put(com.amazon.ask.model.interfaces.viewport.size.ViewportSize.class, interfacesViewportSizeViewportSizeSubTypes);

    Map<String, Class> servicesDirectiveDirectiveSubTypes = new HashMap<>();
    servicesDirectiveDirectiveSubTypes.put("VoicePlayer.Speak", com.amazon.ask.model.services.directive.SpeakDirective.class);
    baseTypes.put(com.amazon.ask.model.services.directive.Directive.class, servicesDirectiveDirectiveSubTypes);

    Map<String, Class> servicesGameEngineRecognizerSubTypes = new HashMap<>();
    servicesGameEngineRecognizerSubTypes.put("match", com.amazon.ask.model.services.gameEngine.PatternRecognizer.class);
    servicesGameEngineRecognizerSubTypes.put("deviation", com.amazon.ask.model.services.gameEngine.DeviationRecognizer.class);
    servicesGameEngineRecognizerSubTypes.put("progress", com.amazon.ask.model.services.gameEngine.ProgressRecognizer.class);
    baseTypes.put(com.amazon.ask.model.services.gameEngine.Recognizer.class, servicesGameEngineRecognizerSubTypes);

    Map<String, Class> uiCardSubTypes = new HashMap<>();
    uiCardSubTypes.put("AskForPermissionsConsent", com.amazon.ask.model.ui.AskForPermissionsConsentCard.class);
    uiCardSubTypes.put("LinkAccount", com.amazon.ask.model.ui.LinkAccountCard.class);
    uiCardSubTypes.put("Standard", com.amazon.ask.model.ui.StandardCard.class);
    uiCardSubTypes.put("Simple", com.amazon.ask.model.ui.SimpleCard.class);
    baseTypes.put(com.amazon.ask.model.ui.Card.class, uiCardSubTypes);

    Map<String, Class> uiOutputSpeechSubTypes = new HashMap<>();
    uiOutputSpeechSubTypes.put("SSML", com.amazon.ask.model.ui.SsmlOutputSpeech.class);
    uiOutputSpeechSubTypes.put("PlainText", com.amazon.ask.model.ui.PlainTextOutputSpeech.class);
    baseTypes.put(com.amazon.ask.model.ui.OutputSpeech.class, uiOutputSpeechSubTypes);
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