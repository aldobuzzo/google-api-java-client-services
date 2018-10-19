/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.shoppingcontent.model;

/**
 * Account data. After the creation of a new account it may take a few minutes before it is fully
 * operational.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Account extends com.google.api.client.json.GenericJson {

  /**
   * Indicates whether the merchant sells adult content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean adultContent;

  /**
   * List of linked AdWords accounts that are active or pending approval. To create a new link
   * request, add a new link with status active to the list. It will remain in a pending state until
   * approved or rejected either in the AdWords interface or through the  AdWords API. To delete an
   * active link, or to cancel a link request, remove it from the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AccountAdwordsLink> adwordsLinks;

  /**
   * The business information of the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AccountBusinessInformation businessInformation;

  /**
   * The GMB account which is linked or in the process of being linked with the Merchant Center
   * account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AccountGoogleMyBusinessLink googleMyBusinessLink;

  /**
   * Merchant Center account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "content#account".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Display name for the account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [DEPRECATED] This field is never returned and will be ignored if provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reviewsUrl;

  /**
   * Client-specific, locally-unique, internal ID for the child account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sellerId;

  /**
   * Users with access to the account. Every account (except for subaccounts) must have at least one
   * admin user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AccountUser> users;

  /**
   * The merchant's website.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String websiteUrl;

  /**
   * List of linked YouTube channels that are active or pending approval. To create a new link
   * request, add a new link with status active to the list. It will remain in a pending state until
   * approved or rejected in the YT Creator Studio interface. To delete an active link, or to cancel
   * a link request, remove it from the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AccountYouTubeChannelLink> youtubeChannelLinks;

  /**
   * Indicates whether the merchant sells adult content.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAdultContent() {
    return adultContent;
  }

  /**
   * Indicates whether the merchant sells adult content.
   * @param adultContent adultContent or {@code null} for none
   */
  public Account setAdultContent(java.lang.Boolean adultContent) {
    this.adultContent = adultContent;
    return this;
  }

  /**
   * List of linked AdWords accounts that are active or pending approval. To create a new link
   * request, add a new link with status active to the list. It will remain in a pending state until
   * approved or rejected either in the AdWords interface or through the  AdWords API. To delete an
   * active link, or to cancel a link request, remove it from the list.
   * @return value or {@code null} for none
   */
  public java.util.List<AccountAdwordsLink> getAdwordsLinks() {
    return adwordsLinks;
  }

  /**
   * List of linked AdWords accounts that are active or pending approval. To create a new link
   * request, add a new link with status active to the list. It will remain in a pending state until
   * approved or rejected either in the AdWords interface or through the  AdWords API. To delete an
   * active link, or to cancel a link request, remove it from the list.
   * @param adwordsLinks adwordsLinks or {@code null} for none
   */
  public Account setAdwordsLinks(java.util.List<AccountAdwordsLink> adwordsLinks) {
    this.adwordsLinks = adwordsLinks;
    return this;
  }

  /**
   * The business information of the account.
   * @return value or {@code null} for none
   */
  public AccountBusinessInformation getBusinessInformation() {
    return businessInformation;
  }

  /**
   * The business information of the account.
   * @param businessInformation businessInformation or {@code null} for none
   */
  public Account setBusinessInformation(AccountBusinessInformation businessInformation) {
    this.businessInformation = businessInformation;
    return this;
  }

  /**
   * The GMB account which is linked or in the process of being linked with the Merchant Center
   * account.
   * @return value or {@code null} for none
   */
  public AccountGoogleMyBusinessLink getGoogleMyBusinessLink() {
    return googleMyBusinessLink;
  }

  /**
   * The GMB account which is linked or in the process of being linked with the Merchant Center
   * account.
   * @param googleMyBusinessLink googleMyBusinessLink or {@code null} for none
   */
  public Account setGoogleMyBusinessLink(AccountGoogleMyBusinessLink googleMyBusinessLink) {
    this.googleMyBusinessLink = googleMyBusinessLink;
    return this;
  }

  /**
   * Merchant Center account ID.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * Merchant Center account ID.
   * @param id id or {@code null} for none
   */
  public Account setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "content#account".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "content#account".
   * @param kind kind or {@code null} for none
   */
  public Account setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Display name for the account.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Display name for the account.
   * @param name name or {@code null} for none
   */
  public Account setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [DEPRECATED] This field is never returned and will be ignored if provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getReviewsUrl() {
    return reviewsUrl;
  }

  /**
   * [DEPRECATED] This field is never returned and will be ignored if provided.
   * @param reviewsUrl reviewsUrl or {@code null} for none
   */
  public Account setReviewsUrl(java.lang.String reviewsUrl) {
    this.reviewsUrl = reviewsUrl;
    return this;
  }

  /**
   * Client-specific, locally-unique, internal ID for the child account.
   * @return value or {@code null} for none
   */
  public java.lang.String getSellerId() {
    return sellerId;
  }

  /**
   * Client-specific, locally-unique, internal ID for the child account.
   * @param sellerId sellerId or {@code null} for none
   */
  public Account setSellerId(java.lang.String sellerId) {
    this.sellerId = sellerId;
    return this;
  }

  /**
   * Users with access to the account. Every account (except for subaccounts) must have at least one
   * admin user.
   * @return value or {@code null} for none
   */
  public java.util.List<AccountUser> getUsers() {
    return users;
  }

  /**
   * Users with access to the account. Every account (except for subaccounts) must have at least one
   * admin user.
   * @param users users or {@code null} for none
   */
  public Account setUsers(java.util.List<AccountUser> users) {
    this.users = users;
    return this;
  }

  /**
   * The merchant's website.
   * @return value or {@code null} for none
   */
  public java.lang.String getWebsiteUrl() {
    return websiteUrl;
  }

  /**
   * The merchant's website.
   * @param websiteUrl websiteUrl or {@code null} for none
   */
  public Account setWebsiteUrl(java.lang.String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  /**
   * List of linked YouTube channels that are active or pending approval. To create a new link
   * request, add a new link with status active to the list. It will remain in a pending state until
   * approved or rejected in the YT Creator Studio interface. To delete an active link, or to cancel
   * a link request, remove it from the list.
   * @return value or {@code null} for none
   */
  public java.util.List<AccountYouTubeChannelLink> getYoutubeChannelLinks() {
    return youtubeChannelLinks;
  }

  /**
   * List of linked YouTube channels that are active or pending approval. To create a new link
   * request, add a new link with status active to the list. It will remain in a pending state until
   * approved or rejected in the YT Creator Studio interface. To delete an active link, or to cancel
   * a link request, remove it from the list.
   * @param youtubeChannelLinks youtubeChannelLinks or {@code null} for none
   */
  public Account setYoutubeChannelLinks(java.util.List<AccountYouTubeChannelLink> youtubeChannelLinks) {
    this.youtubeChannelLinks = youtubeChannelLinks;
    return this;
  }

  @Override
  public Account set(String fieldName, Object value) {
    return (Account) super.set(fieldName, value);
  }

  @Override
  public Account clone() {
    return (Account) super.clone();
  }

}
