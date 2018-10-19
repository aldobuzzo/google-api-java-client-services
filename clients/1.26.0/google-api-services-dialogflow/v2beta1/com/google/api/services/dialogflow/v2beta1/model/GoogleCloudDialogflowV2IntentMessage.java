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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Corresponds to the `Response` field in the Dialogflow console.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentMessage extends com.google.api.client.json.GenericJson {

  /**
   * The basic card response for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageBasicCard basicCard;

  /**
   * The card response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageCard card;

  /**
   * The carousel card response for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageCarouselSelect carouselSelect;

  /**
   * The image response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageImage image;

  /**
   * The link out suggestion chip for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion linkOutSuggestion;

  /**
   * The list card response for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageListSelect listSelect;

  /**
   * Returns a response containing a custom, platform-specific payload. See the
   * Intent.Message.Platform type for a description of the structure that may be required for your
   * platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> payload;

  /**
   * Optional. The platform that this message is intended for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platform;

  /**
   * The quick replies response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageQuickReplies quickReplies;

  /**
   * The voice and text-only responses for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageSimpleResponses simpleResponses;

  /**
   * The suggestion chips for Actions on Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageSuggestions suggestions;

  /**
   * The text response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDialogflowV2IntentMessageText text;

  /**
   * The basic card response for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageBasicCard getBasicCard() {
    return basicCard;
  }

  /**
   * The basic card response for Actions on Google.
   * @param basicCard basicCard or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setBasicCard(GoogleCloudDialogflowV2IntentMessageBasicCard basicCard) {
    this.basicCard = basicCard;
    return this;
  }

  /**
   * The card response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageCard getCard() {
    return card;
  }

  /**
   * The card response.
   * @param card card or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setCard(GoogleCloudDialogflowV2IntentMessageCard card) {
    this.card = card;
    return this;
  }

  /**
   * The carousel card response for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageCarouselSelect getCarouselSelect() {
    return carouselSelect;
  }

  /**
   * The carousel card response for Actions on Google.
   * @param carouselSelect carouselSelect or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setCarouselSelect(GoogleCloudDialogflowV2IntentMessageCarouselSelect carouselSelect) {
    this.carouselSelect = carouselSelect;
    return this;
  }

  /**
   * The image response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageImage getImage() {
    return image;
  }

  /**
   * The image response.
   * @param image image or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setImage(GoogleCloudDialogflowV2IntentMessageImage image) {
    this.image = image;
    return this;
  }

  /**
   * The link out suggestion chip for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion getLinkOutSuggestion() {
    return linkOutSuggestion;
  }

  /**
   * The link out suggestion chip for Actions on Google.
   * @param linkOutSuggestion linkOutSuggestion or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setLinkOutSuggestion(GoogleCloudDialogflowV2IntentMessageLinkOutSuggestion linkOutSuggestion) {
    this.linkOutSuggestion = linkOutSuggestion;
    return this;
  }

  /**
   * The list card response for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageListSelect getListSelect() {
    return listSelect;
  }

  /**
   * The list card response for Actions on Google.
   * @param listSelect listSelect or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setListSelect(GoogleCloudDialogflowV2IntentMessageListSelect listSelect) {
    this.listSelect = listSelect;
    return this;
  }

  /**
   * Returns a response containing a custom, platform-specific payload. See the
   * Intent.Message.Platform type for a description of the structure that may be required for your
   * platform.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getPayload() {
    return payload;
  }

  /**
   * Returns a response containing a custom, platform-specific payload. See the
   * Intent.Message.Platform type for a description of the structure that may be required for your
   * platform.
   * @param payload payload or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setPayload(java.util.Map<String, java.lang.Object> payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Optional. The platform that this message is intended for.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatform() {
    return platform;
  }

  /**
   * Optional. The platform that this message is intended for.
   * @param platform platform or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setPlatform(java.lang.String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * The quick replies response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageQuickReplies getQuickReplies() {
    return quickReplies;
  }

  /**
   * The quick replies response.
   * @param quickReplies quickReplies or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setQuickReplies(GoogleCloudDialogflowV2IntentMessageQuickReplies quickReplies) {
    this.quickReplies = quickReplies;
    return this;
  }

  /**
   * The voice and text-only responses for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageSimpleResponses getSimpleResponses() {
    return simpleResponses;
  }

  /**
   * The voice and text-only responses for Actions on Google.
   * @param simpleResponses simpleResponses or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setSimpleResponses(GoogleCloudDialogflowV2IntentMessageSimpleResponses simpleResponses) {
    this.simpleResponses = simpleResponses;
    return this;
  }

  /**
   * The suggestion chips for Actions on Google.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageSuggestions getSuggestions() {
    return suggestions;
  }

  /**
   * The suggestion chips for Actions on Google.
   * @param suggestions suggestions or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setSuggestions(GoogleCloudDialogflowV2IntentMessageSuggestions suggestions) {
    this.suggestions = suggestions;
    return this;
  }

  /**
   * The text response.
   * @return value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessageText getText() {
    return text;
  }

  /**
   * The text response.
   * @param text text or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentMessage setText(GoogleCloudDialogflowV2IntentMessageText text) {
    this.text = text;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessage set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentMessage) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentMessage clone() {
    return (GoogleCloudDialogflowV2IntentMessage) super.clone();
  }

}
