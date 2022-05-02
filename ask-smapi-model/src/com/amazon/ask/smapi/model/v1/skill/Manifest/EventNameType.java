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
  
  LEGACY_AUDIOPLAYERGUI_LYRICSVIEWEDEVENT("Legacy.AudioPlayerGui.LyricsViewedEvent"),
  
  LEGACY_LISTMODEL_DELETEITEMREQUEST("Legacy.ListModel.DeleteItemRequest"),
  
  LEGACY_MEDIAPLAYER_SEQUENCEMODIFIED("Legacy.MediaPlayer.SequenceModified"),
  
  LEGACY_PLAYBACKCONTROLLER_BUTTONCOMMAND("Legacy.PlaybackController.ButtonCommand"),
  
  EFFECTSCONTROLLER_REQUESTEFFECTCHANGEREQUEST("EffectsController.RequestEffectChangeRequest"),
  
  LEGACY_EXTERNALMEDIAPLAYER_REQUESTTOKEN("Legacy.ExternalMediaPlayer.RequestToken"),
  
  ITEMS_UPDATED("ITEMS_UPDATED"),
  
  ALEXA_VIDEO_XRAY_SHOWDETAILSSUCCESSFUL("Alexa.Video.Xray.ShowDetailsSuccessful"),
  
  PLAYBACKCONTROLLER_NEXTCOMMANDISSUED("PlaybackController.NextCommandIssued"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKFINISHED("Legacy.MediaPlayer.PlaybackFinished"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CAPTUREFAILED("Alexa.Camera.VideoCaptureController.CaptureFailed"),
  
  SKILL_DISABLED("SKILL_DISABLED"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CANCELCAPTUREFAILED("Alexa.Camera.VideoCaptureController.CancelCaptureFailed"),
  
  CUSTOMINTERFACECONTROLLER_EVENTSRECEIVED("CustomInterfaceController.EventsReceived"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONSTARTED("Legacy.DeviceNotification.NotificationStarted"),
  
  REMINDER_UPDATED("REMINDER_UPDATED"),
  
  AUDIO_ITEM_PLAYBACK_STOPPED("AUDIO_ITEM_PLAYBACK_STOPPED"),
  
  LEGACY_AUXCONTROLLER_INPUTACTIVITYSTATECHANGED("Legacy.AuxController.InputActivityStateChanged"),
  
  LOCALAPPLICATION_MSHOPPURCHASING_EVENT("LocalApplication.MShopPurchasing.Event"),
  
  LEGACY_EXTERNALMEDIAPLAYER_AUTHORIZATIONCOMPLETE("Legacy.ExternalMediaPlayer.AuthorizationComplete"),
  
  LOCALAPPLICATION_HHOPHOTOS_EVENT("LocalApplication.HHOPhotos.Event"),
  
  ALEXA_PRESENTATION_APL_USEREVENT("Alexa.Presentation.APL.UserEvent"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKINTERRUPTED("Legacy.AudioPlayer.PlaybackInterrupted"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEUNPAIRFAILURE("Legacy.BluetoothNetwork.DeviceUnpairFailure"),
  
  IN_SKILL_PRODUCT_SUBSCRIPTION_ENDED("IN_SKILL_PRODUCT_SUBSCRIPTION_ENDED"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_UPLOADFAILED("Alexa.FileManager.UploadController.UploadFailed"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICECONNECTEDFAILURE("Legacy.BluetoothNetwork.DeviceConnectedFailure"),
  
  LEGACY_AUDIOPLAYER_AUDIOSTUTTER("Legacy.AudioPlayer.AudioStutter"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CAPTURESTARTED("Alexa.Camera.VideoCaptureController.CaptureStarted"),
  
  LEGACY_SPEAKER_MUTECHANGED("Legacy.Speaker.MuteChanged"),
  
  CARDRENDERER_DISPLAYCONTENTFINISHED("CardRenderer.DisplayContentFinished"),
  
  LEGACY_SPEECHSYNTHESIZER_SPEECHSTARTED("Legacy.SpeechSynthesizer.SpeechStarted"),
  
  AUDIOPLAYER_PLAYBACKSTOPPED("AudioPlayer.PlaybackStopped"),
  
  LEGACY_SOFTWAREUPDATE_CHECKSOFTWAREUPDATEREPORT("Legacy.SoftwareUpdate.CheckSoftwareUpdateReport"),
  
  CARDRENDERER_DISPLAYCONTENTSTARTED("CardRenderer.DisplayContentStarted"),
  
  LOCALAPPLICATION_NOTIFICATIONSAPP_EVENT("LocalApplication.NotificationsApp.Event"),
  
  AUDIOPLAYER_PLAYBACKSTARTED("AudioPlayer.PlaybackStarted"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONENTEREDFORGROUND("Legacy.DeviceNotification.NotificationEnteredForground"),
  
  LEGACY_DEVICENOTIFICATION_SETNOTIFICATIONFAILED("Legacy.DeviceNotification.SetNotificationFailed"),
  
  LEGACY_AUDIOPLAYER_PERIODICPLAYBACKPROGRESSREPORT("Legacy.AudioPlayer.PeriodicPlaybackProgressReport"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_HTTPNOTIFIED("Legacy.HomeAutoWifiController.HttpNotified"),
  
  ALEXA_CAMERA_PHOTOCAPTURECONTROLLER_CANCELCAPTUREFAILED("Alexa.Camera.PhotoCaptureController.CancelCaptureFailed"),
  
  SKILL_ACCOUNT_LINKED("SKILL_ACCOUNT_LINKED"),
  
  LIST_UPDATED("LIST_UPDATED"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONSYNC("Legacy.DeviceNotification.NotificationSync"),
  
  LEGACY_SCONEREMOTECONTROL_VOLUMEDOWN("Legacy.SconeRemoteControl.VolumeDown"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKPAUSED("Legacy.MediaPlayer.PlaybackPaused"),
  
  LEGACY_PRESENTATION_PRESENTATIONUSEREVENT("Legacy.Presentation.PresentationUserEvent"),
  
  PLAYBACKCONTROLLER_PLAYCOMMANDISSUED("PlaybackController.PlayCommandIssued"),
  
  LEGACY_LISTMODEL_UPDATEITEMREQUEST("Legacy.ListModel.UpdateItemRequest"),
  
  MESSAGING_MESSAGERECEIVED("Messaging.MessageReceived"),
  
  LEGACY_SOFTWAREUPDATE_INITIATESOFTWAREUPDATEREPORT("Legacy.SoftwareUpdate.InitiateSoftwareUpdateReport"),
  
  AUDIO_ITEM_PLAYBACK_FAILED("AUDIO_ITEM_PLAYBACK_FAILED"),
  
  LOCALAPPLICATION_DEVICEMESSAGING_EVENT("LocalApplication.DeviceMessaging.Event"),
  
  ALEXA_CAMERA_PHOTOCAPTURECONTROLLER_CAPTUREFAILED("Alexa.Camera.PhotoCaptureController.CaptureFailed"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKIDLE("Legacy.AudioPlayer.PlaybackIdle"),
  
  LEGACY_BLUETOOTHNETWORK_ENTERPAIRINGMODESUCCESS("Legacy.BluetoothNetwork.EnterPairingModeSuccess"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKERROR("Legacy.AudioPlayer.PlaybackError"),
  
  LEGACY_LISTMODEL_GETPAGEBYORDINALREQUEST("Legacy.ListModel.GetPageByOrdinalRequest"),
  
  LEGACY_MEDIAGROUPING_GROUPCHANGERESPONSEEVENT("Legacy.MediaGrouping.GroupChangeResponseEvent"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEDISCONNECTEDFAILURE("Legacy.BluetoothNetwork.DeviceDisconnectedFailure"),
  
  LEGACY_BLUETOOTHNETWORK_ENTERPAIRINGMODEFAILURE("Legacy.BluetoothNetwork.EnterPairingModeFailure"),
  
  LEGACY_SPEECHSYNTHESIZER_SPEECHINTERRUPTED("Legacy.SpeechSynthesizer.SpeechInterrupted"),
  
  PLAYBACKCONTROLLER_PREVIOUSCOMMANDISSUED("PlaybackController.PreviousCommandIssued"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKFINISHED("Legacy.AudioPlayer.PlaybackFinished"),
  
  LEGACY_SYSTEM_USERINACTIVITY("Legacy.System.UserInactivity"),
  
  DISPLAY_USEREVENT("Display.UserEvent"),
  
  LEGACY_PHONECALLCONTROLLER_EVENT("Legacy.PhoneCallController.Event"),
  
  LEGACY_DEVICENOTIFICATION_SETNOTIFICATIONSUCCEEDED("Legacy.DeviceNotification.SetNotificationSucceeded"),
  
  LOCALAPPLICATION_PHOTOS_EVENT("LocalApplication.Photos.Event"),
  
  LOCALAPPLICATION_VIDEOEXPERIENCESERVICE_EVENT("LocalApplication.VideoExperienceService.Event"),
  
  LEGACY_CONTENTMANAGER_CONTENTPLAYBACKTERMINATED("Legacy.ContentManager.ContentPlaybackTerminated"),
  
  LEGACY_PLAYBACKCONTROLLER_PLAYCOMMAND("Legacy.PlaybackController.PlayCommand"),
  
  LEGACY_PLAYLISTCONTROLLER_ERRORRESPONSE("Legacy.PlaylistController.ErrorResponse"),
  
  LEGACY_SCONEREMOTECONTROL_VOLUMEUP("Legacy.SconeRemoteControl.VolumeUp"),
  
  MESSAGINGCONTROLLER_UPDATECONVERSATIONSSTATUS("MessagingController.UpdateConversationsStatus"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEDISCONNECTEDSUCCESS("Legacy.BluetoothNetwork.DeviceDisconnectedSuccess"),
  
  LOCALAPPLICATION_COMMUNICATIONS_EVENT("LocalApplication.Communications.Event"),
  
  AUDIO_ITEM_PLAYBACK_STARTED("AUDIO_ITEM_PLAYBACK_STARTED"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEPAIRFAILURE("Legacy.BluetoothNetwork.DevicePairFailure"),
  
  LIST_DELETED("LIST_DELETED"),
  
  LEGACY_PLAYBACKCONTROLLER_TOGGLECOMMAND("Legacy.PlaybackController.ToggleCommand"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEPAIRSUCCESS("Legacy.BluetoothNetwork.DevicePairSuccess"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKERROR("Legacy.MediaPlayer.PlaybackError"),
  
  AUDIOPLAYER_PLAYBACKFINISHED("AudioPlayer.PlaybackFinished"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONSTOPPED("Legacy.DeviceNotification.NotificationStopped"),
  
  LEGACY_SIPCLIENT_EVENT("Legacy.SipClient.Event"),
  
  DISPLAY_ELEMENTSELECTED("Display.ElementSelected"),
  
  LOCALAPPLICATION_MSHOP_EVENT("LocalApplication.MShop.Event"),
  
  LEGACY_LISTMODEL_ADDITEMREQUEST("Legacy.ListModel.AddItemRequest"),
  
  LEGACY_BLUETOOTHNETWORK_SCANDEVICESREPORT("Legacy.BluetoothNetwork.ScanDevicesReport"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKSTOPPED("Legacy.MediaPlayer.PlaybackStopped"),
  
  LEGACY_AUDIOPLAYERGUI_BUTTONCLICKEDEVENT("Legacy.AudioPlayerGui.ButtonClickedEvent"),
  
  LOCALAPPLICATION_ALEXAVOICELAYER_EVENT("LocalApplication.AlexaVoiceLayer.Event"),
  
  LEGACY_PLAYBACKCONTROLLER_PREVIOUSCOMMAND("Legacy.PlaybackController.PreviousCommand"),
  
  LEGACY_AUDIOPLAYER_INITIALPLAYBACKPROGRESSREPORT("Legacy.AudioPlayer.InitialPlaybackProgressReport"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICECONNECTEDSUCCESS("Legacy.BluetoothNetwork.DeviceConnectedSuccess"),
  
  LIST_CREATED("LIST_CREATED"),
  
  LEGACY_ACTIVITYMANAGER_ACTIVITYCONTEXTREMOVEDEVENT("Legacy.ActivityManager.ActivityContextRemovedEvent"),
  
  ALL_LISTS_CHANGED("ALL_LISTS_CHANGED"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKNEARLYFINISHED("Legacy.AudioPlayer.PlaybackNearlyFinished"),
  
  LEGACY_MEDIAGROUPING_GROUPCHANGENOTIFICATIONEVENT("Legacy.MediaGrouping.GroupChangeNotificationEvent"),
  
  LOCALAPPLICATION_SENTRY_EVENT("LocalApplication.Sentry.Event"),
  
  SKILL_PROACTIVE_SUBSCRIPTION_CHANGED("SKILL_PROACTIVE_SUBSCRIPTION_CHANGED"),
  
  SKILL_NOTIFICATION_SUBSCRIPTION_CHANGED("SKILL_NOTIFICATION_SUBSCRIPTION_CHANGED"),
  
  REMINDER_CREATED("REMINDER_CREATED"),
  
  ALEXA_PRESENTATION_HTML_EVENT("Alexa.Presentation.HTML.Event"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONERROR("FitnessSessionController.FitnessSessionError"),
  
  LEGACY_SCONEREMOTECONTROL_NEXT("Legacy.SconeRemoteControl.Next"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CAPTUREFINISHED("Alexa.Camera.VideoCaptureController.CaptureFinished"),
  
  LEGACY_MEDIAPLAYER_SEQUENCEITEMSREQUESTED("Legacy.MediaPlayer.SequenceItemsRequested"),
  
  LEGACY_PLAYBACKCONTROLLER_PAUSECOMMAND("Legacy.PlaybackController.PauseCommand"),
  
  LOCALAPPLICATION_ALEXAVISION_EVENT("LocalApplication.AlexaVision.Event"),
  
  LOCALAPPLICATION_CLOSET_EVENT("LocalApplication.Closet.Event"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_CANCELUPLOADFAILED("Alexa.FileManager.UploadController.CancelUploadFailed"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKRESUMED("Legacy.MediaPlayer.PlaybackResumed"),
  
  SKILL_PERMISSION_ACCEPTED("SKILL_PERMISSION_ACCEPTED"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONPAUSED("FitnessSessionController.FitnessSessionPaused"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKPAUSED("Legacy.AudioPlayer.PlaybackPaused"),
  
  ALEXA_PRESENTATION_HTML_LIFECYCLESTATECHANGED("Alexa.Presentation.HTML.LifecycleStateChanged"),
  
  LOCALAPPLICATION_SIPUSERAGENT_EVENT("LocalApplication.SipUserAgent.Event"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKSTARTED("Legacy.MediaPlayer.PlaybackStarted"),
  
  REMINDER_STATUS_CHANGED("REMINDER_STATUS_CHANGED"),
  
  MESSAGINGCONTROLLER_UPLOADCONVERSATIONS("MessagingController.UploadConversations"),
  
  ITEMS_DELETED("ITEMS_DELETED"),
  
  LEGACY_AUXCONTROLLER_PLUGGEDSTATECHANGED("Legacy.AuxController.PluggedStateChanged"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKSTARTED("Legacy.AudioPlayer.PlaybackStarted"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_UPLOADSTARTED("Alexa.FileManager.UploadController.UploadStarted"),
  
  ITEMS_CREATED("ITEMS_CREATED"),
  
  LEGACY_EXTERNALMEDIAPLAYER_EVENT("Legacy.ExternalMediaPlayer.Event"),
  
  LOCALAPPLICATION_LOCALMEDIAPLAYER_EVENT("LocalApplication.LocalMediaPlayer.Event"),
  
  LOCALAPPLICATION_KNIGHTCONTACTS_EVENT("LocalApplication.KnightContacts.Event"),
  
  LOCALAPPLICATION_CALENDAR_EVENT("LocalApplication.Calendar.Event"),
  
  LEGACY_ALERTSCONTROLLER_DISMISSCOMMAND("Legacy.AlertsController.DismissCommand"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKSTUTTERFINISHED("Legacy.AudioPlayer.PlaybackStutterFinished"),
  
  LEGACY_SPEECHSYNTHESIZER_SPEECHFINISHED("Legacy.SpeechSynthesizer.SpeechFinished"),
  
  LEGACY_EXTERNALMEDIAPLAYER_REPORTDISCOVEREDPLAYERS("Legacy.ExternalMediaPlayer.ReportDiscoveredPlayers"),
  
  LOCALAPPLICATION_SIPCLIENT_EVENT("LocalApplication.SipClient.Event"),
  
  LEGACY_BLUETOOTHNETWORK_DEVICEUNPAIRSUCCESS("Legacy.BluetoothNetwork.DeviceUnpairSuccess"),
  
  LEGACY_SPEAKER_VOLUMECHANGED("Legacy.Speaker.VolumeChanged"),
  
  CARDRENDERER_READCONTENTFINISHED("CardRenderer.ReadContentFinished"),
  
  LOCALAPPLICATION_HOMEAUTOMATIONMEDIA_EVENT("LocalApplication.HomeAutomationMedia.Event"),
  
  LEGACY_BLUETOOTHNETWORK_CANCELPAIRINGMODE("Legacy.BluetoothNetwork.CancelPairingMode"),
  
  LOCALAPPLICATION_DIGITALDASH_EVENT("LocalApplication.DigitalDash.Event"),
  
  CARDRENDERER_READCONTENTSTARTED("CardRenderer.ReadContentStarted"),
  
  LEGACY_GAMEENGINE_GAMEINPUTEVENT("Legacy.GameEngine.GameInputEvent"),
  
  LOCALAPPLICATION_LOCALVOICEUI_EVENT("LocalApplication.LocalVoiceUI.Event"),
  
  LEGACY_MICROPHONE_AUDIORECORDING("Legacy.Microphone.AudioRecording"),
  
  LOCALAPPLICATION_ALEXAPLATFORMTESTSPEECHLET_EVENT("LocalApplication.AlexaPlatformTestSpeechlet.Event"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_SSDPSERVICEDISCOVERED("Legacy.HomeAutoWifiController.SsdpServiceDiscovered"),
  
  ALEXA_CAMERA_PHOTOCAPTURECONTROLLER_CANCELCAPTUREFINISHED("Alexa.Camera.PhotoCaptureController.CancelCaptureFinished"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_DEVICERECONNECTED("Legacy.HomeAutoWifiController.DeviceReconnected"),
  
  SKILL_ENABLED("SKILL_ENABLED"),
  
  ALEXA_CAMERA_VIDEOCAPTURECONTROLLER_CANCELCAPTUREFINISHED("Alexa.Camera.VideoCaptureController.CancelCaptureFinished"),
  
  MESSAGINGCONTROLLER_UPDATEMESSAGESSTATUSREQUEST("MessagingController.UpdateMessagesStatusRequest"),
  
  REMINDER_STARTED("REMINDER_STARTED"),
  
  CUSTOMINTERFACECONTROLLER_EXPIRED("CustomInterfaceController.Expired"),
  
  LOCALAPPLICATION_AVAPHYSICALSHOPPING_EVENT("LocalApplication.AvaPhysicalShopping.Event"),
  
  LOCALAPPLICATION_WEBVIDEOPLAYER_EVENT("LocalApplication.WebVideoPlayer.Event"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_SSDPSERVICETERMINATED("Legacy.HomeAutoWifiController.SsdpServiceTerminated"),
  
  LOCALAPPLICATION_FIREFLYSHOPPING_EVENT("LocalApplication.FireflyShopping.Event"),
  
  LEGACY_PLAYBACKCONTROLLER_NEXTCOMMAND("Legacy.PlaybackController.NextCommand"),
  
  LOCALAPPLICATION_GALLERY_EVENT("LocalApplication.Gallery.Event"),
  
  ALEXA_PRESENTATION_PRESENTATIONDISMISSED("Alexa.Presentation.PresentationDismissed"),
  
  EFFECTSCONTROLLER_STATERECEIPTCHANGEREQUEST("EffectsController.StateReceiptChangeRequest"),
  
  LOCALAPPLICATION_ALEXA_TRANSLATION_LIVETRANSLATION_EVENT("LocalApplication.Alexa.Translation.LiveTranslation.Event"),
  
  LOCALAPPLICATION_ALEXANOTIFICATIONS_EVENT("LocalApplication.AlexaNotifications.Event"),
  
  REMINDER_DELETED("REMINDER_DELETED"),
  
  GAMEENGINE_INPUTHANDLEREVENT("GameEngine.InputHandlerEvent"),
  
  LEGACY_PLAYLISTCONTROLLER_RESPONSE("Legacy.PlaylistController.Response"),
  
  LOCALAPPLICATION_KNIGHTHOME_EVENT("LocalApplication.KnightHome.Event"),
  
  LEGACY_LISTRENDERER_LISTITEMEVENT("Legacy.ListRenderer.ListItemEvent"),
  
  AUDIOPLAYER_PLAYBACKFAILED("AudioPlayer.PlaybackFailed"),
  
  LOCALAPPLICATION_KNIGHTHOMETHINGSTOTRY_EVENT("LocalApplication.KnightHomeThingsToTry.Event"),
  
  LEGACY_BLUETOOTHNETWORK_SETDEVICECATEGORIESFAILED("Legacy.BluetoothNetwork.SetDeviceCategoriesFailed"),
  
  LEGACY_EXTERNALMEDIAPLAYER_LOGOUT("Legacy.ExternalMediaPlayer.Logout"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_UPLOADFINISHED("Alexa.FileManager.UploadController.UploadFinished"),
  
  LEGACY_ACTIVITYMANAGER_FOCUSCHANGED("Legacy.ActivityManager.FocusChanged"),
  
  LEGACY_ALERTSCONTROLLER_SNOOZECOMMAND("Legacy.AlertsController.SnoozeCommand"),
  
  LEGACY_SPEECHRECOGNIZER_WAKEWORDCHANGED("Legacy.SpeechRecognizer.WakeWordChanged"),
  
  LEGACY_LISTRENDERER_GETLISTPAGEBYTOKEN("Legacy.ListRenderer.GetListPageByToken"),
  
  MESSAGINGCONTROLLER_UPDATESENDMESSAGESTATUSREQUEST("MessagingController.UpdateSendMessageStatusRequest"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONENDED("FitnessSessionController.FitnessSessionEnded"),
  
  ALEXA_PRESENTATION_APL_RUNTIMEERROR("Alexa.Presentation.APL.RuntimeError"),
  
  LEGACY_LISTRENDERER_GETLISTPAGEBYORDINAL("Legacy.ListRenderer.GetListPageByOrdinal"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONRESUMED("FitnessSessionController.FitnessSessionResumed"),
  
  IN_SKILL_PRODUCT_SUBSCRIPTION_STARTED("IN_SKILL_PRODUCT_SUBSCRIPTION_STARTED"),
  
  LEGACY_DEVICENOTIFICATION_DELETENOTIFICATIONSUCCEEDED("Legacy.DeviceNotification.DeleteNotificationSucceeded"),
  
  LEGACY_SPEECHSYNTHESIZER_SPEECHSYNTHESIZERERROR("Legacy.SpeechSynthesizer.SpeechSynthesizerError"),
  
  ALEXA_VIDEO_XRAY_SHOWDETAILSFAILED("Alexa.Video.Xray.ShowDetailsFailed"),
  
  ALEXA_FILEMANAGER_UPLOADCONTROLLER_CANCELUPLOADFINISHED("Alexa.FileManager.UploadController.CancelUploadFinished"),
  
  LEGACY_SCONEREMOTECONTROL_PLAYPAUSE("Legacy.SconeRemoteControl.PlayPause"),
  
  LEGACY_DEVICENOTIFICATION_NOTIFICATIONENTEREDBACKGROUND("Legacy.DeviceNotification.NotificationEnteredBackground"),
  
  SKILL_PERMISSION_CHANGED("SKILL_PERMISSION_CHANGED"),
  
  LEGACY_AUDIOPLAYER_METADATA("Legacy.AudioPlayer.Metadata"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKSTUTTERSTARTED("Legacy.AudioPlayer.PlaybackStutterStarted"),
  
  AUDIO_ITEM_PLAYBACK_FINISHED("AUDIO_ITEM_PLAYBACK_FINISHED"),
  
  EFFECTSCONTROLLER_REQUESTGUICHANGEREQUEST("EffectsController.RequestGuiChangeRequest"),
  
  FITNESSSESSIONCONTROLLER_FITNESSSESSIONSTARTED("FitnessSessionController.FitnessSessionStarted"),
  
  LEGACY_PLAYBACKCONTROLLER_LYRICSVIEWEDEVENT("Legacy.PlaybackController.LyricsViewedEvent"),
  
  LEGACY_EXTERNALMEDIAPLAYER_LOGIN("Legacy.ExternalMediaPlayer.Login"),
  
  PLAYBACKCONTROLLER_PAUSECOMMANDISSUED("PlaybackController.PauseCommandIssued"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKIDLE("Legacy.MediaPlayer.PlaybackIdle"),
  
  LEGACY_SCONEREMOTECONTROL_PREVIOUS("Legacy.SconeRemoteControl.Previous"),
  
  DEVICESETUP_SETUPCOMPLETED("DeviceSetup.SetupCompleted"),
  
  LEGACY_MEDIAPLAYER_PLAYBACKNEARLYFINISHED("Legacy.MediaPlayer.PlaybackNearlyFinished"),
  
  LOCALAPPLICATION_TODORENDERER_EVENT("LocalApplication.todoRenderer.Event"),
  
  LEGACY_BLUETOOTHNETWORK_SETDEVICECATEGORIESSUCCEEDED("Legacy.BluetoothNetwork.SetDeviceCategoriesSucceeded"),
  
  LEGACY_BLUETOOTHNETWORK_MEDIACONTROLSUCCESS("Legacy.BluetoothNetwork.MediaControlSuccess"),
  
  LEGACY_HOMEAUTOWIFICONTROLLER_SSDPDISCOVERYFINISHED("Legacy.HomeAutoWifiController.SsdpDiscoveryFinished"),
  
  ALEXA_PRESENTATION_APL_LOADINDEXLISTDATA("Alexa.Presentation.APL.LoadIndexListData"),
  
  IN_SKILL_PRODUCT_SUBSCRIPTION_RENEWED("IN_SKILL_PRODUCT_SUBSCRIPTION_RENEWED"),
  
  LEGACY_BLUETOOTHNETWORK_MEDIACONTROLFAILURE("Legacy.BluetoothNetwork.MediaControlFailure"),
  
  LEGACY_AUXCONTROLLER_ENABLEDSTATECHANGED("Legacy.AuxController.EnabledStateChanged"),
  
  LEGACY_FAVORITESCONTROLLER_RESPONSE("Legacy.FavoritesController.Response"),
  
  LEGACY_LISTMODEL_LISTSTATEUPDATEREQUEST("Legacy.ListModel.ListStateUpdateRequest"),
  
  LEGACY_EQUALIZERCONTROLLER_EQUALIZERCHANGED("Legacy.EqualizerController.EqualizerChanged"),
  
  LEGACY_MEDIAGROUPING_GROUPSYNCEVENT("Legacy.MediaGrouping.GroupSyncEvent"),
  
  LEGACY_FAVORITESCONTROLLER_ERROR("Legacy.FavoritesController.Error"),
  
  LEGACY_LISTMODEL_GETPAGEBYTOKENREQUEST("Legacy.ListModel.GetPageByTokenRequest"),
  
  LEGACY_ACTIVITYMANAGER_ACTIVITYINTERRUPTED("Legacy.ActivityManager.ActivityInterrupted"),
  
  LEGACY_MEETINGCLIENTCONTROLLER_EVENT("Legacy.MeetingClientController.Event"),
  
  LEGACY_PRESENTATION_PRESENTATIONDISMISSEDEVENT("Legacy.Presentation.PresentationDismissedEvent"),
  
  LEGACY_SPOTIFY_EVENT("Legacy.Spotify.Event"),
  
  LEGACY_EXTERNALMEDIAPLAYER_ERROR("Legacy.ExternalMediaPlayer.Error"),
  
  LEGACY_AUXCONTROLLER_DIRECTIONCHANGED("Legacy.AuxController.DirectionChanged"),
  
  AUDIOPLAYER_PLAYBACKNEARLYFINISHED("AudioPlayer.PlaybackNearlyFinished"),
  
  ALEXA_CAMERA_PHOTOCAPTURECONTROLLER_CAPTUREFINISHED("Alexa.Camera.PhotoCaptureController.CaptureFinished"),
  
  LEGACY_UDPCONTROLLER_BROADCASTRESPONSE("Legacy.UDPController.BroadcastResponse"),
  
  LEGACY_AUDIOPLAYER_PLAYBACKRESUMED("Legacy.AudioPlayer.PlaybackResumed"),
  
  LEGACY_DEVICENOTIFICATION_DELETENOTIFICATIONFAILED("Legacy.DeviceNotification.DeleteNotificationFailed"),
  
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

