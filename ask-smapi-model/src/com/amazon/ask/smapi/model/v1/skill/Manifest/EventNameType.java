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
 * Name of the event to be subscribed to.
 */
public enum EventNameType {
  
  SKILL_ENABLED("SKILL_ENABLED"),
  
  SKILL_DISABLED("SKILL_DISABLED"),
  
  SKILL_PERMISSION_ACCEPTED("SKILL_PERMISSION_ACCEPTED"),
  
  SKILL_PERMISSION_CHANGED("SKILL_PERMISSION_CHANGED"),
  
  SKILL_ACCOUNT_LINKED("SKILL_ACCOUNT_LINKED"),
  
  ITEMS_CREATED("ITEMS_CREATED"),
  
  ITEMS_UPDATED("ITEMS_UPDATED"),
  
  ITEMS_DELETED("ITEMS_DELETED"),
  
  LIST_CREATED("LIST_CREATED"),
  
  LIST_UPDATED("LIST_UPDATED"),
  
  LIST_DELETED("LIST_DELETED"),
  
  ALL_LISTS_CHANGED("ALL_LISTS_CHANGED"),
  
  REMINDER_STARTED("REMINDER_STARTED"),
  
  REMINDER_CREATED("REMINDER_CREATED"),
  
  REMINDER_UPDATED("REMINDER_UPDATED"),
  
  REMINDER_DELETED("REMINDER_DELETED"),
  
  REMINDER_STATUS_CHANGED("REMINDER_STATUS_CHANGED"),
  
  AUDIO_ITEM_PLAYBACK_STARTED("AUDIO_ITEM_PLAYBACK_STARTED"),
  
  AUDIO_ITEM_PLAYBACK_FINISHED("AUDIO_ITEM_PLAYBACK_FINISHED"),
  
  AUDIO_ITEM_PLAYBACK_STOPPED("AUDIO_ITEM_PLAYBACK_STOPPED"),
  
  AUDIO_ITEM_PLAYBACK_FAILED("AUDIO_ITEM_PLAYBACK_FAILED"),
  
  SKILL_PROACTIVE_SUBSCRIPTION_CHANGED("SKILL_PROACTIVE_SUBSCRIPTION_CHANGED"),
  
  IN_SKILL_PRODUCT_SUBSCRIPTION_STARTED("IN_SKILL_PRODUCT_SUBSCRIPTION_STARTED"),
  
  IN_SKILL_PRODUCT_SUBSCRIPTION_RENEWED("IN_SKILL_PRODUCT_SUBSCRIPTION_RENEWED"),
  
  IN_SKILL_PRODUCT_SUBSCRIPTION_ENDED("IN_SKILL_PRODUCT_SUBSCRIPTION_ENDED"),
  
  LEGACY_ACTIVITYMANAGER_ACTIVITYCONTEXTREMOVEDEVENT("Legacy.ActivityManager.ActivityContextRemovedEvent"),
  
  LEGACY_ACTIVITYMANAGER_ACTIVITYINTERRUPTED("Legacy.ActivityManager.ActivityInterrupted"),
  
  LEGACY_ACTIVITYMANAGER_FOCUSCHANGED("Legacy.ActivityManager.FocusChanged"),
  
  LEGACY_ALERTSCONTROLLER_DISMISSCOMMAND("Legacy.AlertsController.DismissCommand"),
  
  LEGACY_ALERTSCONTROLLER_SNOOZECOMMAND("Legacy.AlertsController.SnoozeCommand"),
  
  LEGACY_AUDIOPLAYER_AUDIOSTUTTER("Legacy.AudioPlayer.AudioStutter"),
  
  LEGACY_AUDIOPLAYER_INITIALPLAYBACKPROGRESSREPORT("Legacy.AudioPlayer.InitialPlaybackProgressReport"),
  
  LEGACY_AUDIOPLAYER_METADATA("Legacy.AudioPlayer.Metadata"),
  
  LEGACY_AUDIOPLAYER_PERIODICPLAYBACKPROGRESSREPORT("Legacy.AudioPlayer.PeriodicPlaybackProgressReport"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKERROR("Legacy.AudioPlayer.PlaybackError"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKFINISHED("Legacy.AudioPlayer.PlaybackFinished"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKIDLE("Legacy.AudioPlayer.PlaybackIdle"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKINTERRUPTED("Legacy.AudioPlayer.PlaybackInterrupted"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKNEARLYFINISHED("Legacy.AudioPlayer.PlaybackNearlyFinished"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKPAUSED("Legacy.AudioPlayer.PlaybackPaused"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKRESUMED("Legacy.AudioPlayer.PlaybackResumed"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKSTARTED("Legacy.AudioPlayer.PlaybackStarted"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKSTUTTERFINISHED("Legacy.AudioPlayer.PlaybackStutterFinished"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKSTUTTERSTARTED("Legacy.AudioPlayer.PlaybackStutterStarted"),
  
  LEGACY_AUDIOPLAYERGUI_BUTTONCLICKEDEVENT("Legacy.AudioPlayerGui.ButtonClickedEvent"),
  
  LEGACY_AUDIOPLAYERGUI_LYRICSVIEWEDEVENT("Legacy.AudioPlayerGui.LyricsViewedEvent"),
  
  LEGACY_AUXCONTROLLER_DIRECTIONCHANGED("Legacy.AuxController.DirectionChanged"),
  
  LEGACY_AUXCONTROLLER_ENABLEDSTATECHANGED("Legacy.AuxController.EnabledStateChanged"),
  
  LEGACY_AUXCONTROLLER_INPUTACTIVITYSTATECHANGED("Legacy.AuxController.InputActivityStateChanged"),
  
  LEGACY_AUXCONTROLLER_PLUGGEDSTATECHANGED("Legacy.AuxController.PluggedStateChanged"),
  
  LEGACY_BLUETOOTHNETWORK_CANCELPAIRINGMODE("Legacy.BluetoothNetwork.CancelPairingMode"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICECONNECTEDFAILURE("Legacy.BluetoothNetwork.DeviceConnectedFailure"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICECONNECTEDSUCCESS("Legacy.BluetoothNetwork.DeviceConnectedSuccess"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEDISCONNECTEDFAILURE("Legacy.BluetoothNetwork.DeviceDisconnectedFailure"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEDISCONNECTEDSUCCESS("Legacy.BluetoothNetwork.DeviceDisconnectedSuccess"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEPAIRFAILURE("Legacy.BluetoothNetwork.DevicePairFailure"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEPAIRSUCCESS("Legacy.BluetoothNetwork.DevicePairSuccess"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEUNPAIRFAILURE("Legacy.BluetoothNetwork.DeviceUnpairFailure"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEUNPAIRSUCCESS("Legacy.BluetoothNetwork.DeviceUnpairSuccess"),
  
  LEGACY_BLUETOOTHNETWORK_ENTERPAIRINGMODEFAILURE("Legacy.BluetoothNetwork.EnterPairingModeFailure"),
  
  LEGACY_BLUETOOTHNETWORK_ENTERPAIRINGMODESUCCESS("Legacy.BluetoothNetwork.EnterPairingModeSuccess"),
  
  LEGACY_BLUETOOTHNETWORK_MEDIACONTROLFAILURE("Legacy.BluetoothNetwork.MediaControlFailure"),
  
  LEGACY_BLUETOOTHNETWORK_MEDIACONTROLSUCCESS("Legacy.BluetoothNetwork.MediaControlSuccess"),
  
  LEGACY_BLUETOOTHNETWORK_SCANDEVICESREPORT("Legacy.BluetoothNetwork.ScanDevicesReport"),
  
  LEGACY_BLUETOOTHNETWORK_SETDEVICECATEGORIESFAILED("Legacy.BluetoothNetwork.SetDeviceCategoriesFailed"),
  
  LEGACY_BLUETOOTHNETWORK_SETDEVICECATEGORIESSUCCEEDED("Legacy.BluetoothNetwork.SetDeviceCategoriesSucceeded"),
  
  LEGACY_CONTENTMANAGER_CONTENTPLAYBACKTERMINATED("Legacy.ContentManager.ContentPlaybackTerminated"),
  
  LEGACY_DEVICENOTIFICATION_DELETENOTIFICATIONFAILED("Legacy.DeviceNotification.DeleteNotificationFailed"),
  
  LEGACY_DEVICENOTIFICATION_DELETENOTIFICATIONSUCCEEDED("Legacy.DeviceNotification.DeleteNotificationSucceeded"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONENTEREDBACKGROUND("Legacy.DeviceNotification.NotificationEnteredBackground"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONENTEREDFORGROUND("Legacy.DeviceNotification.NotificationEnteredForground"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONSTARTED("Legacy.DeviceNotification.NotificationStarted"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONSTOPPED("Legacy.DeviceNotification.NotificationStopped"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONSYNC("Legacy.DeviceNotification.NotificationSync"),
  
  LEGACY_DEVICENOTIFICATION_SETNOTIFICATIONFAILED("Legacy.DeviceNotification.SetNotificationFailed"),
  
  LEGACY_DEVICENOTIFICATION_SETNOTIFICATIONSUCCEEDED("Legacy.DeviceNotification.SetNotificationSucceeded"),
  
  LEGACY_EQUALIZERCONTROLLER_EQUALIZERCHANGED("Legacy.EqualizerController.EqualizerChanged"),
  
  LEGACY_EXTERNALMEDIAPLAYER_AUTHORIZATIONCOMPLETE("Legacy.ExternalMediaPlayer.AuthorizationComplete"),
  
  LEGACY_EXTERNALMEDIAPLAYER_ERROR("Legacy.ExternalMediaPlayer.Error"),
  
  LEGACY_EXTERNALMEDIAPLAYER_EVENT("Legacy.ExternalMediaPlayer.Event"),
  
  LEGACY_EXTERNALMEDIAPLAYER_LOGIN("Legacy.ExternalMediaPlayer.Login"),
  
  LEGACY_EXTERNALMEDIAPLAYER_LOGOUT("Legacy.ExternalMediaPlayer.Logout"),
  
  LEGACY_EXTERNALMEDIAPLAYER_REPORTDISCOVEREDPLAYERS("Legacy.ExternalMediaPlayer.ReportDiscoveredPlayers"),
  
  LEGACY_EXTERNALMEDIAPLAYER_REQUESTTOKEN("Legacy.ExternalMediaPlayer.RequestToken"),
  
  LEGACY_FAVORITESCONTROLLER_ERROR("Legacy.FavoritesController.Error"),
  
  LEGACY_FAVORITESCONTROLLER_RESPONSE("Legacy.FavoritesController.Response"),
  
  LEGACY_GAMEENGINE_GAMEINPUTEVENT("Legacy.GameEngine.GameInputEvent"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_DEVICERECONNECTED("Legacy.HomeAutoWifiController.DeviceReconnected"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_HTTPNOTIFIED("Legacy.HomeAutoWifiController.HttpNotified"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_SSDPDISCOVERYFINISHED("Legacy.HomeAutoWifiController.SsdpDiscoveryFinished"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_SSDPSERVICEDISCOVERED("Legacy.HomeAutoWifiController.SsdpServiceDiscovered"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_SSDPSERVICETERMINATED("Legacy.HomeAutoWifiController.SsdpServiceTerminated"),
  
  LEGACY_LISTMODEL_ADDITEMREQUEST("Legacy.ListModel.AddItemRequest"),
  
  LEGACY_LISTMODEL_DELETEITEMREQUEST("Legacy.ListModel.DeleteItemRequest"),
  
  LEGACY_LISTMODEL_GETPAGEBYORDINALREQUEST("Legacy.ListModel.GetPageByOrdinalRequest"),
  
  LEGACY_LISTMODEL_GETPAGEBYTOKENREQUEST("Legacy.ListModel.GetPageByTokenRequest"),
  
  LEGACY_LISTMODEL_LISTSTATEUPDATEREQUEST("Legacy.ListModel.ListStateUpdateRequest"),
  
  LEGACY_LISTMODEL_UPDATEITEMREQUEST("Legacy.ListModel.UpdateItemRequest"),
  
  LEGACY_LISTRENDERER_GETLISTPAGEBYORDINAL("Legacy.ListRenderer.GetListPageByOrdinal"),
  
  LEGACY_LISTRENDERER_GETLISTPAGEBYTOKEN("Legacy.ListRenderer.GetListPageByToken"),
  
  LEGACY_LISTRENDERER_LISTITEMEVENT("Legacy.ListRenderer.ListItemEvent"),
  
  LEGACY_MEDIAGROUPING_GROUPCHANGENOTIFICATIONEVENT("Legacy.MediaGrouping.GroupChangeNotificationEvent"),
  
  LEGACY_MEDIAGROUPING_GROUPCHANGERESPONSEEVENT("Legacy.MediaGrouping.GroupChangeResponseEvent"),
  
  LEGACY_MEDIAGROUPING_GROUPSYNCEVENT("Legacy.MediaGrouping.GroupSyncEvent"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKERROR("Legacy.MediaPlayer.PlaybackError"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKFINISHED("Legacy.MediaPlayer.PlaybackFinished"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKIDLE("Legacy.MediaPlayer.PlaybackIdle"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKNEARLYFINISHED("Legacy.MediaPlayer.PlaybackNearlyFinished"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKPAUSED("Legacy.MediaPlayer.PlaybackPaused"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKRESUMED("Legacy.MediaPlayer.PlaybackResumed"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKSTARTED("Legacy.MediaPlayer.PlaybackStarted"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKSTOPPED("Legacy.MediaPlayer.PlaybackStopped"),
  
  LEGACY_MEDIAPLAYER_SEQUENCEITEMSREQUESTED("Legacy.MediaPlayer.SequenceItemsRequested"),
  
  LEGACY_MEDIAPLAYER_SEQUENCEMODIFIED("Legacy.MediaPlayer.SequenceModified"),
  
  LEGACY_MEETINGCLIENTCONTROLLER_EVENT("Legacy.MeetingClientController.Event"),
  
  LEGACY_MICROPHONE_AUDIORECORDING("Legacy.Microphone.AudioRecording"),
  
  LEGACY_PHONECALLCONTROLLER_EVENT("Legacy.PhoneCallController.Event"),
  
  LEGACY_PLAYBACKCONTROLLER_BUTTONCOMMAND("Legacy.PlaybackController.ButtonCommand"),
  
  LEGACY_PLAYBACKCONTROLLER_LYRICSVIEWEDEVENT("Legacy.PlaybackController.LyricsViewedEvent"),
  
  LEGACY_PLAYBACKCONTROLLER_NEXTCOMMAND("Legacy.PlaybackController.NextCommand"),
  
  LEGACY_PLAYBACKCONTROLLER_PAUSECOMMAND("Legacy.PlaybackController.PauseCommand"),
  
  LEGACY_PLAYBACKCONTROLLER_PLAYCOMMAND("Legacy.PlaybackController.PlayCommand"),
  
  LEGACY_PLAYBACKCONTROLLER_PREVIOUSCOMMAND("Legacy.PlaybackController.PreviousCommand"),
  
  LEGACY_PLAYBACKCONTROLLER_TOGGLECOMMAND("Legacy.PlaybackController.ToggleCommand"),
  
  LEGACY_PLAYLISTCONTROLLER_ERRORRESPONSE("Legacy.PlaylistController.ErrorResponse"),
  
  LEGACY_PLAYLISTCONTROLLER_RESPONSE("Legacy.PlaylistController.Response"),
  
  LEGACY_PRESENTATION_PRESENTATIONDISMISSEDEVENT("Legacy.Presentation.PresentationDismissedEvent"),
  
  LEGACY_PRESENTATION_PRESENTATIONUSEREVENT("Legacy.Presentation.PresentationUserEvent"),
  
  LEGACY_SCONEREMOTECONTROL_NEXT("Legacy.SconeRemoteControl.Next"),
  
  LEGACY_SCONEREMOTECONTROL_PLAYPAUSE("Legacy.SconeRemoteControl.PlayPause"),
  
  LEGACY_SCONEREMOTECONTROL_PREVIOUS("Legacy.SconeRemoteControl.Previous"),
  
  LEGACY_SCONEREMOTECONTROL_VOLUMEDOWN("Legacy.SconeRemoteControl.VolumeDown"),
  
  LEGACY_SCONEREMOTECONTROL_VOLUMEUP("Legacy.SconeRemoteControl.VolumeUp"),
  
  LEGACY_SIPCLIENT_EVENT("Legacy.SipClient.Event"),
  
  LEGACY_SOFTWAREUPDATE_CHECKSOFTWAREUPDATEREPORT("Legacy.SoftwareUpdate.CheckSoftwareUpdateReport"),
  
  LEGACY_SOFTWAREUPDATE_INITIATESOFTWAREUPDATEREPORT("Legacy.SoftwareUpdate.InitiateSoftwareUpdateReport"),
  
  LEGACY_SPEAKER_MUTECHANGED("Legacy.Speaker.MuteChanged"),
  
  LEGACY_SPEAKER_VOLUMECHANGED("Legacy.Speaker.VolumeChanged"),
  
  LEGACY_SPEECHRECOGNIZER_WAKEWORDCHANGED("Legacy.SpeechRecognizer.WakeWordChanged"),
  
  LEGACY_SPEECHSYNTHESIZER_SPEECHFINISHED("Legacy.SpeechSynthesizer.SpeechFinished"),
  
  LEGACY_SPEECHSYNTHESIZER_SPEECHINTERRUPTED("Legacy.SpeechSynthesizer.SpeechInterrupted"),
  
  LEGACY_SPEECHSYNTHESIZER_SPEECHSTARTED("Legacy.SpeechSynthesizer.SpeechStarted"),
  
  LEGACY_SPEECHSYNTHESIZER_SPEECHSYNTHESIZERERROR("Legacy.SpeechSynthesizer.SpeechSynthesizerError"),
  
  LEGACY_SPOTIFY_EVENT("Legacy.Spotify.Event"),
  
  LEGACY_SYSTEM_USERINACTIVITY("Legacy.System.UserInactivity"),
  
  LEGACY_UDPCONTROLLER_BROADCASTRESPONSE("Legacy.UDPController.BroadcastResponse"),
  
  LOCALAPPLICATION_ALEXA_TRANSLATION_LIVETRANSLATION_EVENT("LocalApplication.Alexa.Translation.LiveTranslation.Event"),
  
  LOCALAPPLICATION_ALEXANOTIFICATIONS_EVENT("LocalApplication.AlexaNotifications.Event"),
  
  LOCALAPPLICATION_ALEXAPLATFORMTESTSPEECHLET_EVENT("LocalApplication.AlexaPlatformTestSpeechlet.Event"),
  
  LOCALAPPLICATION_ALEXAVISION_EVENT("LocalApplication.AlexaVision.Event"),
  
  LOCALAPPLICATION_ALEXAVOICELAYER_EVENT("LocalApplication.AlexaVoiceLayer.Event"),
  
  LOCALAPPLICATION_AVAPHYSICALSHOPPING_EVENT("LocalApplication.AvaPhysicalShopping.Event"),
  
  LOCALAPPLICATION_CALENDAR_EVENT("LocalApplication.Calendar.Event"),
  
  LOCALAPPLICATION_CLOSET_EVENT("LocalApplication.Closet.Event"),
  
  LOCALAPPLICATION_COMMUNICATIONS_EVENT("LocalApplication.Communications.Event"),
  
  LOCALAPPLICATION_DEVICEMESSAGING_EVENT("LocalApplication.DeviceMessaging.Event"),
  
  LOCALAPPLICATION_DIGITALDASH_EVENT("LocalApplication.DigitalDash.Event"),
  
  LOCALAPPLICATION_FIREFLYSHOPPING_EVENT("LocalApplication.FireflyShopping.Event"),
  
  LOCALAPPLICATION_GALLERY_EVENT("LocalApplication.Gallery.Event"),
  
  LOCALAPPLICATION_HHOPHOTOS_EVENT("LocalApplication.HHOPhotos.Event"),
  
  LOCALAPPLICATION_HOMEAUTOMATIONMEDIA_EVENT("LocalApplication.HomeAutomationMedia.Event"),
  
  LOCALAPPLICATION_KNIGHTCONTACTS_EVENT("LocalApplication.KnightContacts.Event"),
  
  LOCALAPPLICATION_KNIGHTHOME_EVENT("LocalApplication.KnightHome.Event"),
  
  LOCALAPPLICATION_KNIGHTHOMETHINGSTOTRY_EVENT("LocalApplication.KnightHomeThingsToTry.Event"),
  
  LOCALAPPLICATION_LOCALMEDIAPLAYER_EVENT("LocalApplication.LocalMediaPlayer.Event"),
  
  LOCALAPPLICATION_LOCALVOICEUI_EVENT("LocalApplication.LocalVoiceUI.Event"),
  
  LOCALAPPLICATION_MSHOP_EVENT("LocalApplication.MShop.Event"),
  
  LOCALAPPLICATION_MSHOPPURCHASING_EVENT("LocalApplication.MShopPurchasing.Event"),
  
  LOCALAPPLICATION_NOTIFICATIONSAPP_EVENT("LocalApplication.NotificationsApp.Event"),
  
  LOCALAPPLICATION_PHOTOS_EVENT("LocalApplication.Photos.Event"),
  
  LOCALAPPLICATION_SENTRY_EVENT("LocalApplication.Sentry.Event"),
  
  LOCALAPPLICATION_SIPCLIENT_EVENT("LocalApplication.SipClient.Event"),
  
  LOCALAPPLICATION_SIPUSERAGENT_EVENT("LocalApplication.SipUserAgent.Event"),
  
  LOCALAPPLICATION_TODORENDERER_EVENT("LocalApplication.todoRenderer.Event"),
  
  LOCALAPPLICATION_VIDEOEXPERIENCESERVICE_EVENT("LocalApplication.VideoExperienceService.Event"),
  
  LOCALAPPLICATION_WEBVIDEOPLAYER_EVENT("LocalApplication.WebVideoPlayer.Event"),
  
  ALEXA_CAMERA_PHOTOCAPTURECONTROLLER_CANCELCAPTUREFAILED("Alexa.Camera.PhotoCaptureController.CancelCaptureFailed"),
  
  ALEXA_CAMERA_PHOTOCAPTURECONTROLLER_CANCELCAPTUREFINISHED("Alexa.Camera.PhotoCaptureController.CancelCaptureFinished"),
  
  ALEXA_CAMERA_PHOTOCAPTURECONTROLLER_CAPTUREFAILED("Alexa.Camera.PhotoCaptureController.CaptureFailed"),
  
  ALEXA_CAMERA_PHOTOCAPTURECONTROLLER_CAPTUREFINISHED("Alexa.Camera.PhotoCaptureController.CaptureFinished"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CANCELCAPTUREFAILED("Alexa.Camera.VideoCaptureController.CancelCaptureFailed"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CANCELCAPTUREFINISHED("Alexa.Camera.VideoCaptureController.CancelCaptureFinished"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CAPTUREFAILED("Alexa.Camera.VideoCaptureController.CaptureFailed"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CAPTUREFINISHED("Alexa.Camera.VideoCaptureController.CaptureFinished"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CAPTURESTARTED("Alexa.Camera.VideoCaptureController.CaptureStarted"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_CANCELUPLOADFAILED("Alexa.FileManager.UploadController.CancelUploadFailed"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_CANCELUPLOADFINISHED("Alexa.FileManager.UploadController.CancelUploadFinished"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_UPLOADFAILED("Alexa.FileManager.UploadController.UploadFailed"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_UPLOADFINISHED("Alexa.FileManager.UploadController.UploadFinished"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_UPLOADSTARTED("Alexa.FileManager.UploadController.UploadStarted"),
  
  ALEXA_PRESENTATION_APL_USEREVENT("Alexa.Presentation.APL.UserEvent"),
  
  ALEXA_PRESENTATION_HTML_EVENT("Alexa.Presentation.HTML.Event"),
  
  ALEXA_PRESENTATION_HTML_LIFECYCLESTATECHANGED("Alexa.Presentation.HTML.LifecycleStateChanged"),
  
  ALEXA_PRESENTATION_PRESENTATIONDISMISSED("Alexa.Presentation.PresentationDismissed"),
  
  AUDIOPLAYER_PLAYBACKFAILED("AudioPlayer.PlaybackFailed"),
  
  AUDIOPLAYER_PLAYBACKFINISHED("AudioPlayer.PlaybackFinished"),
  
  AUDIOPLAYER_PLAYBACKNEARLYFINISHED("AudioPlayer.PlaybackNearlyFinished"),
  
  AUDIOPLAYER_PLAYBACKSTARTED("AudioPlayer.PlaybackStarted"),
  
  AUDIOPLAYER_PLAYBACKSTOPPED("AudioPlayer.PlaybackStopped"),
  
  CARDRENDERER_DISPLAYCONTENTFINISHED("CardRenderer.DisplayContentFinished"),
  
  CARDRENDERER_DISPLAYCONTENTSTARTED("CardRenderer.DisplayContentStarted"),
  
  CARDRENDERER_READCONTENTFINISHED("CardRenderer.ReadContentFinished"),
  
  CARDRENDERER_READCONTENTSTARTED("CardRenderer.ReadContentStarted"),
  
  CUSTOMINTERFACECONTROLLER_EVENTSRECEIVED("CustomInterfaceController.EventsReceived"),
  
  CUSTOMINTERFACECONTROLLER_EXPIRED("CustomInterfaceController.Expired"),
  
  DEVICESETUP_SETUPCOMPLETED("DeviceSetup.SetupCompleted"),
  
  DISPLAY_ELEMENTSELECTED("Display.ElementSelected"),
  
  DISPLAY_USEREVENT("Display.UserEvent"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONENDED("FitnessSessionController.FitnessSessionEnded"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONERROR("FitnessSessionController.FitnessSessionError"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONPAUSED("FitnessSessionController.FitnessSessionPaused"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONRESUMED("FitnessSessionController.FitnessSessionResumed"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONSTARTED("FitnessSessionController.FitnessSessionStarted"),
  
  GAMEENGINE_INPUTHANDLEREVENT("GameEngine.InputHandlerEvent"),
  
  MESSAGING_MESSAGERECEIVED("Messaging.MessageReceived"),
  
  MESSAGINGCONTROLLER_UPDATECONVERSATIONSSTATUS("MessagingController.UpdateConversationsStatus"),
  
  MESSAGINGCONTROLLER_UPDATEMESSAGESSTATUSREQUEST("MessagingController.UpdateMessagesStatusRequest"),
  
  MESSAGINGCONTROLLER_UPDATESENDMESSAGESTATUSREQUEST("MessagingController.UpdateSendMessageStatusRequest"),
  
  MESSAGINGCONTROLLER_UPLOADCONVERSATIONS("MessagingController.UploadConversations"),
  
  PLAYBACKCONTROLLER_NEXTCOMMANDISSUED("PlaybackController.NextCommandIssued"),
  
  PLAYBACKCONTROLLER_PAUSECOMMANDISSUED("PlaybackController.PauseCommandIssued"),
  
  PLAYBACKCONTROLLER_PLAYCOMMANDISSUED("PlaybackController.PlayCommandIssued"),
  
  PLAYBACKCONTROLLER_PREVIOUSCOMMANDISSUED("PlaybackController.PreviousCommandIssued"),
  
  EFFECTSCONTROLLER_REQUESTEFFECTCHANGEREQUEST("EffectsController.RequestEffectChangeRequest"),
  
  EFFECTSCONTROLLER_REQUESTGUICHANGEREQUEST("EffectsController.RequestGuiChangeRequest"),
  
  EFFECTSCONTROLLER_STATERECEIPTCHANGEREQUEST("EffectsController.StateReceiptChangeRequest"),
  
  UNKNOWN_TO_SDK_VERSION(null);

  private String value;

  EventNameType(String value) {
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
  public static EventNameType fromValue(String text) {
    for (EventNameType b : EventNameType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return EventNameType.UNKNOWN_TO_SDK_VERSION;
  }
}

