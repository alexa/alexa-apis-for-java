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

package com.amazon.ask.model.services.monetization;

import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.*;
import com.amazon.ask.model.services.lwa.*;
import com.amazon.ask.model.services.lwa.model.GrantType;
import com.amazon.ask.model.services.util.UserAgentHelper;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class MonetizationServiceClient extends BaseServiceClient implements MonetizationService {

  private final UserAgentHelper userAgentHelper;
  public MonetizationServiceClient(ApiConfiguration apiConfiguration) {
      super(apiConfiguration);
      this.userAgentHelper = UserAgentHelper.builder().withSdkVersion("1.45.0").build();
  }

  /**
   * 
   * Gets In-Skill Products based on user&#39;s context for the Skill.
   * @param acceptLanguage User&#39;s locale/language in context (required)
   * @param purchasable Filter products based on whether they are purchasable by the user or not. * &#39;PURCHASABLE&#39; - Products that are purchasable by the user. * &#39;NOT_PURCHASABLE&#39; - Products that are not purchasable by the user. (optional)
   * @param entitled Filter products based on whether they are entitled to the user or not. * &#39;ENTITLED&#39; - Products that the user is entitled to. * &#39;NOT_ENTITLED&#39; - Products that the user is not entitled to. (optional)
   * @param productType Product type. * &#39;SUBSCRIPTION&#39; - Once purchased, customers will own the content for the subscription period. * &#39;ENTITLEMENT&#39; - Once purchased, customers will own the content forever. * &#39;CONSUMABLE&#39; - Once purchased, customers will be entitled to the content until it is consumed. It can also be re-purchased. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element, the value of which can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that In-Skill Products API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 100 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned because maxResults was exceeded, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.model.services.monetization.InSkillProductsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.monetization.InSkillProductsResponse> callGetInSkillProducts(String acceptLanguage, String purchasable, String entitled, String productType, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(purchasable != null) {
    queryParams.add(new Pair<String, String>("purchasable", purchasable));
  }

    if(entitled != null) {
    queryParams.add(new Pair<String, String>("entitled", entitled));
  }

    if(productType != null) {
    queryParams.add(new Pair<String, String>("productType", productType));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (acceptLanguage != null) {
      headerParams.add(new Pair<String, String>("Accept-Language", acceptLanguage));
    }

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/users/~current/skills/~current/inSkillProducts";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.InSkillProductsResponse.class, 200, "Returns a list of In-Skill products on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 400, "Invalid request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 401, "The authentication token is invalid or doesn't have access to make this request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.monetization.InSkillProductsResponse.class, false);
  }

  /**
   * 
   * Gets In-Skill Products based on user&#39;s context for the Skill.
   * @param acceptLanguage User&#39;s locale/language in context (required)
   * @param purchasable Filter products based on whether they are purchasable by the user or not. * &#39;PURCHASABLE&#39; - Products that are purchasable by the user. * &#39;NOT_PURCHASABLE&#39; - Products that are not purchasable by the user. (optional)
   * @param entitled Filter products based on whether they are entitled to the user or not. * &#39;ENTITLED&#39; - Products that the user is entitled to. * &#39;NOT_ENTITLED&#39; - Products that the user is not entitled to. (optional)
   * @param productType Product type. * &#39;SUBSCRIPTION&#39; - Once purchased, customers will own the content for the subscription period. * &#39;ENTITLEMENT&#39; - Once purchased, customers will own the content forever. * &#39;CONSUMABLE&#39; - Once purchased, customers will be entitled to the content until it is consumed. It can also be re-purchased. (optional)
   * @param nextToken When response to this API call is truncated (that is, isTruncated response element value is true), the response also includes the nextToken element, the value of which can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that In-Skill Products API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 100 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned because maxResults was exceeded, the response contains isTruncated &#x3D; true. (optional)
   * @return com.amazon.ask.model.services.monetization.InSkillProductsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.monetization.InSkillProductsResponse getInSkillProducts(String acceptLanguage, String purchasable, String entitled, String productType, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callGetInSkillProducts(acceptLanguage, purchasable, entitled, productType, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * Get In-Skill Product information based on user context for the Skill.
   * @param acceptLanguage User&#39;s locale/language in context (required)
   * @param productId Product Id. (required)
   * @return com.amazon.ask.model.services.monetization.InSkillProduct
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.monetization.InSkillProduct> callGetInSkillProduct(String acceptLanguage, String productId) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    pathParams.put("productId", productId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (acceptLanguage != null) {
      headerParams.add(new Pair<String, String>("Accept-Language", acceptLanguage));
    }

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/users/~current/skills/~current/inSkillProducts/{productId}";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.InSkillProduct.class, 200, "Returns an In-Skill Product on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 400, "Invalid request."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 401, "The authentication token is invalid or doesn't have access to make this request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 404, "Requested resource not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.monetization.InSkillProduct.class, false);
  }

  /**
   * 
   * Get In-Skill Product information based on user context for the Skill.
   * @param acceptLanguage User&#39;s locale/language in context (required)
   * @param productId Product Id. (required)
   * @return com.amazon.ask.model.services.monetization.InSkillProduct
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.monetization.InSkillProduct getInSkillProduct(String acceptLanguage, String productId) throws ServiceException {
    return this.callGetInSkillProduct(acceptLanguage, productId).getResponse();
  }

  /**
   * 
   * Returns transactions of all in skill products purchases of the customer
   * @param acceptLanguage User&#39;s locale/language in context (required)
   * @param productId Product Id. (optional)
   * @param status Transaction status for in skill product purchases. * &#39;PENDING_APPROVAL_BY_PARENT&#39; - The transaction is pending approval from parent. * &#39;APPROVED_BY_PARENT&#39; - The transaction was approved by parent and fulfilled successfully.. * &#39;DENIED_BY_PARENT&#39; - The transaction was declined by parent and hence not fulfilled. * &#39;EXPIRED_NO_ACTION_BY_PARENT&#39; - The transaction was expired due to no response from parent and hence not fulfilled. * &#39;ERROR&#39; - The transaction was not fullfiled as there was an error while processing the transaction. (optional)
   * @param fromLastModifiedTime Filter transactions based on last modified time stamp, FROM duration in format (UTC ISO 8601) i.e. yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39; (optional)
   * @param toLastModifiedTime Filter transactions based on last modified time stamp, TO duration in format (UTC ISO 8601) i.e. yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39; (optional)
   * @param nextToken When response to this API call is truncated, the response also includes the nextToken in metadata, the value of which can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that In-Skill Products API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 100 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned because maxResults was exceeded, the response contains nextToken which can be used to fetch next set of result. (optional)
   * @return com.amazon.ask.model.services.monetization.InSkillProductTransactionsResponse
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<com.amazon.ask.model.services.monetization.InSkillProductTransactionsResponse> callGetInSkillProductsTransactions(String acceptLanguage, String productId, String status, OffsetDateTime fromLastModifiedTime, OffsetDateTime toLastModifiedTime, String nextToken, BigDecimal maxResults) throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();

    if(productId != null) {
    queryParams.add(new Pair<String, String>("productId", productId));
  }

    if(status != null) {
    queryParams.add(new Pair<String, String>("status", status));
  }

    if(fromLastModifiedTime != null) {
    queryParams.add(new Pair<String, String>("fromLastModifiedTime", fromLastModifiedTime.toString()));
  }

    if(toLastModifiedTime != null) {
    queryParams.add(new Pair<String, String>("toLastModifiedTime", toLastModifiedTime.toString()));
  }

    if(nextToken != null) {
    queryParams.add(new Pair<String, String>("nextToken", nextToken));
  }

    if(maxResults != null) {
    queryParams.add(new Pair<String, String>("maxResults", maxResults.toString()));
  }
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    if (acceptLanguage != null) {
      headerParams.add(new Pair<String, String>("Accept-Language", acceptLanguage));
    }

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/users/~current/skills/~current/inSkillProductsTransactions";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.InSkillProductTransactionsResponse.class, 200, "Returns a list of transactions of all in skill products purchases in last 30 days on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 400, "Invalid request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 401, "The authentication token is invalid or doesn't have access to make this request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 403, "Forbidden request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 404, "Product id doesn't exist / invalid / not found."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 412, "Non-Child Directed Skill is not supported."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 429, "The request is throttled."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 500, "Internal Server Error"));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, com.amazon.ask.model.services.monetization.InSkillProductTransactionsResponse.class, false);
  }

  /**
   * 
   * Returns transactions of all in skill products purchases of the customer
   * @param acceptLanguage User&#39;s locale/language in context (required)
   * @param productId Product Id. (optional)
   * @param status Transaction status for in skill product purchases. * &#39;PENDING_APPROVAL_BY_PARENT&#39; - The transaction is pending approval from parent. * &#39;APPROVED_BY_PARENT&#39; - The transaction was approved by parent and fulfilled successfully.. * &#39;DENIED_BY_PARENT&#39; - The transaction was declined by parent and hence not fulfilled. * &#39;EXPIRED_NO_ACTION_BY_PARENT&#39; - The transaction was expired due to no response from parent and hence not fulfilled. * &#39;ERROR&#39; - The transaction was not fullfiled as there was an error while processing the transaction. (optional)
   * @param fromLastModifiedTime Filter transactions based on last modified time stamp, FROM duration in format (UTC ISO 8601) i.e. yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39; (optional)
   * @param toLastModifiedTime Filter transactions based on last modified time stamp, TO duration in format (UTC ISO 8601) i.e. yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39; (optional)
   * @param nextToken When response to this API call is truncated, the response also includes the nextToken in metadata, the value of which can be used in the next request as the continuation-token to list the next set of objects. The continuation token is an opaque value that In-Skill Products API understands. Token has expiry of 24 hours. (optional)
   * @param maxResults sets the maximum number of results returned in the response body. If you want to retrieve fewer than upper limit of 100 results, you can add this parameter to your request. maxResults should not exceed the upper limit. The response might contain fewer results than maxResults, but it will never contain more. If there are additional results that satisfy the search criteria, but these results were not returned because maxResults was exceeded, the response contains nextToken which can be used to fetch next set of result. (optional)
   * @return com.amazon.ask.model.services.monetization.InSkillProductTransactionsResponse
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.monetization.InSkillProductTransactionsResponse getInSkillProductsTransactions(String acceptLanguage, String productId, String status, OffsetDateTime fromLastModifiedTime, OffsetDateTime toLastModifiedTime, String nextToken, BigDecimal maxResults) throws ServiceException {
    return this.callGetInSkillProductsTransactions(acceptLanguage, productId, status, fromLastModifiedTime, toLastModifiedTime, nextToken, maxResults).getResponse();
  }

  /**
   * 
   * Returns whether or not voice purchasing is enabled for the skill
   * @return Boolean
   * @throws ServiceException if fails to make API call
   */
  public ApiResponse<Boolean> callGetVoicePurchaseSetting() throws ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    String resourcePath = "/v1/users/~current/skills/~current/settings/voicePurchasing.enabled";

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(Boolean.class, 200, "Returns a boolean value for voice purchase setting on success."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 400, "Invalid request."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 401, "The authentication token is invalid or doesn't have access to make this request"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.monetization.Error.class, 500, "Internal Server Error."));
    headerParams.add(new Pair<>("User-Agent", userAgentHelper.getUserAgent()));


    return this.executeRequest("GET", this.apiEndpoint, resourcePath, queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null, Boolean.class, false);
  }

  /**
   * 
   * Returns whether or not voice purchasing is enabled for the skill
   * @return Boolean
   * @throws ServiceException if fails to make API call
   */
  public Boolean getVoicePurchaseSetting() throws ServiceException {
    return this.callGetVoicePurchaseSetting().getResponse();
  }

}
