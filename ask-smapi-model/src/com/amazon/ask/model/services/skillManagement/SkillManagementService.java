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

package com.amazon.ask.model.services.skillManagement;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import java.math.BigDecimal;import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;



public interface SkillManagementService {

    void createCatalogUploadV1(String catalogId, com.amazon.ask.smapi.model.v1.catalog.upload.CatalogUploadBase catalogUploadRequestBody) throws ServiceException;

    ApiResponse<Void> callCreateCatalogUploadV1(String catalogId, com.amazon.ask.smapi.model.v1.catalog.upload.CatalogUploadBase catalogUploadRequestBody) throws ServiceException;


    com.amazon.ask.smapi.model.v1.catalog.upload.GetContentUploadResponse getContentUploadByIdV1(String catalogId, String uploadId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.catalog.upload.GetContentUploadResponse> callGetContentUploadByIdV1(String catalogId, String uploadId) throws ServiceException;


    com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlResponse generateCatalogUploadUrlV1(String catalogId, com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlRequest generateCatalogUploadUrlRequestBody) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlResponse> callGenerateCatalogUploadUrlV1(String catalogId, com.amazon.ask.smapi.model.v1.catalog.CreateContentUploadUrlRequest generateCatalogUploadUrlRequestBody) throws ServiceException;


    com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse getIspListForVendorV1(String vendorId, String nextToken, BigDecimal maxResults, List<String> productId, String stage, String type, String referenceName, String status, String isAssociatedWithSkill) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse> callGetIspListForVendorV1(String vendorId, String nextToken, BigDecimal maxResults, List<String> productId, String stage, String type, String referenceName, String status, String isAssociatedWithSkill) throws ServiceException;


    com.amazon.ask.smapi.model.v1.isp.ProductResponse createIspForVendorV1(com.amazon.ask.smapi.model.v1.isp.CreateInSkillProductRequest createInSkillProductRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.isp.ProductResponse> callCreateIspForVendorV1(com.amazon.ask.smapi.model.v1.isp.CreateInSkillProductRequest createInSkillProductRequest) throws ServiceException;


    void disassociateIspWithSkillV1(String productId, String skillId) throws ServiceException;

    ApiResponse<Void> callDisassociateIspWithSkillV1(String productId, String skillId) throws ServiceException;


    void associateIspWithSkillV1(String productId, String skillId) throws ServiceException;

    ApiResponse<Void> callAssociateIspWithSkillV1(String productId, String skillId) throws ServiceException;


    void deleteIspForProductV1(String productId, String stage, String ifMatch) throws ServiceException;

    ApiResponse<Void> callDeleteIspForProductV1(String productId, String stage, String ifMatch) throws ServiceException;


    void resetEntitlementForProductV1(String productId, String stage) throws ServiceException;

    ApiResponse<Void> callResetEntitlementForProductV1(String productId, String stage) throws ServiceException;


    com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinitionResponse getIspDefinitionV1(String productId, String stage) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.isp.InSkillProductDefinitionResponse> callGetIspDefinitionV1(String productId, String stage) throws ServiceException;


    void updateIspForProductV1(String productId, String stage, com.amazon.ask.smapi.model.v1.isp.UpdateInSkillProductRequest updateInSkillProductRequest, String ifMatch) throws ServiceException;

    ApiResponse<Void> callUpdateIspForProductV1(String productId, String stage, com.amazon.ask.smapi.model.v1.isp.UpdateInSkillProductRequest updateInSkillProductRequest, String ifMatch) throws ServiceException;


    com.amazon.ask.smapi.model.v1.isp.AssociatedSkillResponse getIspAssociatedSkillsV1(String productId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.isp.AssociatedSkillResponse> callGetIspAssociatedSkillsV1(String productId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException;


    com.amazon.ask.smapi.model.v1.isp.InSkillProductSummaryResponse getIspSummaryV1(String productId, String stage) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.isp.InSkillProductSummaryResponse> callGetIspSummaryV1(String productId, String stage) throws ServiceException;


    void deleteInteractionModelCatalogV1(String catalogId) throws ServiceException;

    ApiResponse<Void> callDeleteInteractionModelCatalogV1(String catalogId) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogDefinitionOutput getInteractionModelCatalogDefinitionV1(String catalogId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogDefinitionOutput> callGetInteractionModelCatalogDefinitionV1(String catalogId) throws ServiceException;


    void updateInteractionModelCatalogV1(String catalogId, com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.UpdateRequest updateRequest) throws ServiceException;

    ApiResponse<Void> callUpdateInteractionModelCatalogV1(String catalogId, com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.UpdateRequest updateRequest) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogStatus getInteractionModelCatalogUpdateStatusV1(String catalogId, String updateRequestId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogStatus> callGetInteractionModelCatalogUpdateStatusV1(String catalogId, String updateRequestId) throws ServiceException;


    void createInteractionModelCatalogVersionV1(String catalogId, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionData catalog) throws ServiceException;

    ApiResponse<Void> callCreateInteractionModelCatalogVersionV1(String catalogId, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.VersionData catalog) throws ServiceException;


    void deleteInteractionModelCatalogVersionV1(String catalogId, String version) throws ServiceException;

    ApiResponse<Void> callDeleteInteractionModelCatalogVersionV1(String catalogId, String version) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogVersionData getInteractionModelCatalogVersionV1(String catalogId, String version) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogVersionData> callGetInteractionModelCatalogVersionV1(String catalogId, String version) throws ServiceException;


    void updateInteractionModelCatalogVersionV1(String catalogId, String version, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogUpdate catalogUpdate) throws ServiceException;

    ApiResponse<Void> callUpdateInteractionModelCatalogVersionV1(String catalogId, String version, com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogUpdate catalogUpdate) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogValues getInteractionModelCatalogValuesV1(String catalogId, String version, BigDecimal maxResults, String nextToken) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.CatalogValues> callGetInteractionModelCatalogValuesV1(String catalogId, String version, BigDecimal maxResults, String nextToken) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.ListCatalogResponse listInteractionModelCatalogsV1(String vendorId, BigDecimal maxResults, String nextToken, String sortDirection) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.ListCatalogResponse> callListInteractionModelCatalogsV1(String vendorId, BigDecimal maxResults, String nextToken, String sortDirection) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogResponse createInteractionModelCatalogV1(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.DefinitionData catalog) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.CatalogResponse> callCreateInteractionModelCatalogV1(com.amazon.ask.smapi.model.v1.skill.interactionModel.catalog.DefinitionData catalog) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.ExportResponse getStatusOfExportRequestV1(String exportId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.ExportResponse> callGetStatusOfExportRequestV1(String exportId) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.ListSkillResponse listSkillsForVendorV1(String vendorId, String nextToken, BigDecimal maxResults, List<String> skillId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.ListSkillResponse> callListSkillsForVendorV1(String vendorId, String nextToken, BigDecimal maxResults, List<String> skillId) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.ImportResponse getImportStatusV1(String importId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.ImportResponse> callGetImportStatusV1(String importId) throws ServiceException;


    void createSkillPackageV1(com.amazon.ask.smapi.model.v1.skill.CreateSkillWithPackageRequest createSkillWithPackageRequest) throws ServiceException;

    ApiResponse<Void> callCreateSkillPackageV1(com.amazon.ask.smapi.model.v1.skill.CreateSkillWithPackageRequest createSkillWithPackageRequest) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.CreateSkillResponse createSkillForVendorV1(com.amazon.ask.smapi.model.v1.skill.CreateSkillRequest createSkillRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.CreateSkillResponse> callCreateSkillForVendorV1(com.amazon.ask.smapi.model.v1.skill.CreateSkillRequest createSkillRequest) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillMetadata getAlexaHostedSkillMetadataV1(String skillId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillMetadata> callGetAlexaHostedSkillMetadataV1(String skillId) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsList generateCredentialsForAlexaHostedSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsRequest hostedSkillRepositoryCredentialsRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsList> callGenerateCredentialsForAlexaHostedSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillRepositoryCredentialsRequest hostedSkillRepositoryCredentialsRequest) throws ServiceException;


    void endBetaTestV1(String skillId) throws ServiceException;

    ApiResponse<Void> callEndBetaTestV1(String skillId) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.betaTest.BetaTest getBetaTestV1(String skillId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.betaTest.BetaTest> callGetBetaTestV1(String skillId) throws ServiceException;


    void createBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.TestBody createTestBody) throws ServiceException;

    ApiResponse<Void> callCreateBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.TestBody createTestBody) throws ServiceException;


    void updateBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.TestBody createTestBody) throws ServiceException;

    ApiResponse<Void> callUpdateBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.TestBody createTestBody) throws ServiceException;


    void startBetaTestV1(String skillId) throws ServiceException;

    ApiResponse<Void> callStartBetaTestV1(String skillId) throws ServiceException;


    void addTestersToBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException;

    ApiResponse<Void> callAddTestersToBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.betaTest.testers.ListTestersResponse getListOfTestersV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.betaTest.testers.ListTestersResponse> callGetListOfTestersV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException;


    void removeTestersFromBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException;

    ApiResponse<Void> callRemoveTestersFromBetaTestV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException;


    void requestFeedbackFromTestersV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException;

    ApiResponse<Void> callRequestFeedbackFromTestersV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException;


    void sendReminderToTestersV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException;

    ApiResponse<Void> callSendReminderToTestersV1(String skillId, com.amazon.ask.smapi.model.v1.skill.betaTest.testers.TestersList testersRequest) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.certification.CertificationResponse getCertificationReviewV1(String skillId, String certificationId, String acceptLanguage) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.certification.CertificationResponse> callGetCertificationReviewV1(String skillId, String certificationId, String acceptLanguage) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.certification.ListCertificationsResponse getCertificationsListV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.certification.ListCertificationsResponse> callGetCertificationsListV1(String skillId, String nextToken, BigDecimal maxResults) throws ServiceException;


    void deleteSkillV1(String skillId) throws ServiceException;

    ApiResponse<Void> callDeleteSkillV1(String skillId) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.history.IntentRequests getUtteranceDataV1(String skillId, String nextToken, BigDecimal maxResults, String sortDirection, String sortField, List<com.amazon.ask.smapi.model.v1.StageType> stage, List<com.amazon.ask.smapi.model.v1.skill.history.LocaleInQuery> locale, List<com.amazon.ask.smapi.model.v1.skill.history.DialogActName> dialogActName, List<com.amazon.ask.smapi.model.v1.skill.history.IntentConfidenceBin> intentConfidenceBin, List<String> intentName, List<String> intentSlotsName, List<com.amazon.ask.smapi.model.v1.skill.history.InteractionType> interactionType, List<com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus> publicationStatus, List<String> utteranceText) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.history.IntentRequests> callGetUtteranceDataV1(String skillId, String nextToken, BigDecimal maxResults, String sortDirection, String sortField, List<com.amazon.ask.smapi.model.v1.StageType> stage, List<com.amazon.ask.smapi.model.v1.skill.history.LocaleInQuery> locale, List<com.amazon.ask.smapi.model.v1.skill.history.DialogActName> dialogActName, List<com.amazon.ask.smapi.model.v1.skill.history.IntentConfidenceBin> intentConfidenceBin, List<String> intentName, List<String> intentSlotsName, List<com.amazon.ask.smapi.model.v1.skill.history.InteractionType> interactionType, List<com.amazon.ask.smapi.model.v1.skill.history.PublicationStatus> publicationStatus, List<String> utteranceText) throws ServiceException;


    void importSkillPackageV1(com.amazon.ask.smapi.model.v1.skill.UpdateSkillWithPackageRequest updateSkillWithPackageRequest, String skillId, String ifMatch) throws ServiceException;

    ApiResponse<Void> callImportSkillPackageV1(com.amazon.ask.smapi.model.v1.skill.UpdateSkillWithPackageRequest updateSkillWithPackageRequest, String skillId, String ifMatch) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.metrics.GetMetricDataResponse getSkillMetricsV1(String skillId, OffsetDateTime startTime, OffsetDateTime endTime, String period, String metric, String stage, String skillType, String intent, String locale, BigDecimal maxResults, String nextToken) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.metrics.GetMetricDataResponse> callGetSkillMetricsV1(String skillId, OffsetDateTime startTime, OffsetDateTime endTime, String period, String metric, String stage, String skillType, String intent, String locale, BigDecimal maxResults, String nextToken) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse simulateSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiRequest simulationsApiRequest) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse> callSimulateSkillV1(String skillId, com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiRequest simulationsApiRequest) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse getSkillSimulationV1(String skillId, String simulationId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.simulations.SimulationsApiResponse> callGetSkillSimulationV1(String skillId, String simulationId) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload getSSLCertificatesV1(String skillId) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload> callGetSSLCertificatesV1(String skillId) throws ServiceException;


    void setSSLCertificatesV1(String skillId, com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload sslCertificatePayload) throws ServiceException;

    ApiResponse<Void> callSetSSLCertificatesV1(String skillId, com.amazon.ask.smapi.model.v1.skill.SSLCertificatePayload sslCertificatePayload) throws ServiceException;


    void deleteSkillEnablementV1(String skillId, String stage) throws ServiceException;

    ApiResponse<Void> callDeleteSkillEnablementV1(String skillId, String stage) throws ServiceException;


    void getSkillEnablementStatusV1(String skillId, String stage) throws ServiceException;

    ApiResponse<Void> callGetSkillEnablementStatusV1(String skillId, String stage) throws ServiceException;


    void setSkillEnablementV1(String skillId, String stage) throws ServiceException;

    ApiResponse<Void> callSetSkillEnablementV1(String skillId, String stage) throws ServiceException;


    void createExportRequestForSkillV1(String skillId, String stage) throws ServiceException;

    ApiResponse<Void> callCreateExportRequestForSkillV1(String skillId, String stage) throws ServiceException;


    com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse getIspListForSkillIdV1(String skillId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.isp.ListInSkillProductResponse> callGetIspListForSkillIdV1(String skillId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluResponse profileNluV1(com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluRequest profileNluRequest, String skillId, String stage, String locale) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluResponse> callProfileNluV1(com.amazon.ask.smapi.model.v1.skill.evaluations.ProfileNluRequest profileNluRequest, String skillId, String stage, String locale) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.Private.ListPrivateDistributionAccountsResponse listPrivateDistributionAccountsV1(String skillId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.Private.ListPrivateDistributionAccountsResponse> callListPrivateDistributionAccountsV1(String skillId, String stage, String nextToken, BigDecimal maxResults) throws ServiceException;


    void deletePrivateDistributionAccountIdV1(String skillId, String stage, String id) throws ServiceException;

    ApiResponse<Void> callDeletePrivateDistributionAccountIdV1(String skillId, String stage, String id) throws ServiceException;


    void setPrivateDistributionAccountIdV1(String skillId, String stage, String id) throws ServiceException;

    ApiResponse<Void> callSetPrivateDistributionAccountIdV1(String skillId, String stage, String id) throws ServiceException;


    void deleteAccountLinkingInfoV1(String skillId, String stageV2) throws ServiceException;

    ApiResponse<Void> callDeleteAccountLinkingInfoV1(String skillId, String stageV2) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingResponse getAccountLinkingInfoV1(String skillId, String stageV2) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingResponse> callGetAccountLinkingInfoV1(String skillId, String stageV2) throws ServiceException;


    void updateAccountLinkingInfoV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingRequest accountLinkingRequest, String ifMatch) throws ServiceException;

    ApiResponse<Void> callUpdateAccountLinkingInfoV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.accountLinking.AccountLinkingRequest accountLinkingRequest, String ifMatch) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData getInteractionModelV1(String skillId, String stageV2, String locale) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData> callGetInteractionModelV1(String skillId, String stageV2, String locale) throws ServiceException;


    void getInteractionModelMetadataV1(String skillId, String stageV2, String locale) throws ServiceException;

    ApiResponse<Void> callGetInteractionModelMetadataV1(String skillId, String stageV2, String locale) throws ServiceException;


    void setInteractionModelV1(String skillId, String stageV2, String locale, com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData interactionModel, String ifMatch) throws ServiceException;

    ApiResponse<Void> callSetInteractionModelV1(String skillId, String stageV2, String locale, com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData interactionModel, String ifMatch) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListResponse listInteractionModelVersionsV1(String skillId, String stageV2, String locale, String nextToken, BigDecimal maxResults, String sortDirection, String sortField) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.version.ListResponse> callListInteractionModelVersionsV1(String skillId, String stageV2, String locale, String nextToken, BigDecimal maxResults, String sortDirection, String sortField) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData getInteractionModelVersionV1(String skillId, String stageV2, String locale, String version) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.interactionModel.InteractionModelData> callGetInteractionModelVersionV1(String skillId, String stageV2, String locale, String version) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope getSkillManifestV1(String skillId, String stageV2) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope> callGetSkillManifestV1(String skillId, String stageV2) throws ServiceException;


    void updateSkillManifestV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope updateSkillRequest, String ifMatch) throws ServiceException;

    ApiResponse<Void> callUpdateSkillManifestV1(String skillId, String stageV2, com.amazon.ask.smapi.model.v1.skill.Manifest.SkillManifestEnvelope updateSkillRequest, String ifMatch) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse submitSkillValidationV1(com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiRequest validationsApiRequest, String skillId, String stage) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse> callSubmitSkillValidationV1(com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiRequest validationsApiRequest, String skillId, String stage) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse getSkillValidationsV1(String skillId, String validationId, String stage, String acceptLanguage) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.validations.ValidationsApiResponse> callGetSkillValidationsV1(String skillId, String validationId, String stage, String acceptLanguage) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.SkillStatus getSkillStatusV1(String skillId, String resource) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.SkillStatus> callGetSkillStatusV1(String skillId, String resource) throws ServiceException;


    void submitSkillForCertificationV1(String skillId, com.amazon.ask.smapi.model.v1.skill.SubmitSkillForCertificationRequest submitSkillForCertificationRequest) throws ServiceException;

    ApiResponse<Void> callSubmitSkillForCertificationV1(String skillId, com.amazon.ask.smapi.model.v1.skill.SubmitSkillForCertificationRequest submitSkillForCertificationRequest) throws ServiceException;


    void withdrawSkillFromCertificationV1(String skillId, com.amazon.ask.smapi.model.v1.skill.WithdrawRequest withdrawRequest) throws ServiceException;

    ApiResponse<Void> callWithdrawSkillFromCertificationV1(String skillId, com.amazon.ask.smapi.model.v1.skill.WithdrawRequest withdrawRequest) throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.UploadResponse createUploadUrlV1() throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.UploadResponse> callCreateUploadUrlV1() throws ServiceException;


    com.amazon.ask.smapi.model.v1.vendorManagement.Vendors getVendorListV1() throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.vendorManagement.Vendors> callGetVendorListV1() throws ServiceException;


    com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermission getAlexaHostedSkillUserPermissionsV1(String vendorId, String permission) throws ServiceException;

    ApiResponse<com.amazon.ask.smapi.model.v1.skill.AlexaHosted.HostedSkillPermission> callGetAlexaHostedSkillUserPermissionsV1(String vendorId, String permission) throws ServiceException;

}
