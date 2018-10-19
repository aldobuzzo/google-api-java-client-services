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

package com.google.api.services.cloudnaturallanguage.v1beta1.model;

/**
 * Represents a sentence in the input document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Sentence extends com.google.api.client.json.GenericJson {

  /**
   * For calls to AnalyzeSentiment or if AnnotateTextRequest.Features.extract_document_sentiment is
   * set to true, this field will contain the sentiment for the sentence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Sentiment sentiment;

  /**
   * The sentence text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextSpan text;

  /**
   * For calls to AnalyzeSentiment or if AnnotateTextRequest.Features.extract_document_sentiment is
   * set to true, this field will contain the sentiment for the sentence.
   * @return value or {@code null} for none
   */
  public Sentiment getSentiment() {
    return sentiment;
  }

  /**
   * For calls to AnalyzeSentiment or if AnnotateTextRequest.Features.extract_document_sentiment is
   * set to true, this field will contain the sentiment for the sentence.
   * @param sentiment sentiment or {@code null} for none
   */
  public Sentence setSentiment(Sentiment sentiment) {
    this.sentiment = sentiment;
    return this;
  }

  /**
   * The sentence text.
   * @return value or {@code null} for none
   */
  public TextSpan getText() {
    return text;
  }

  /**
   * The sentence text.
   * @param text text or {@code null} for none
   */
  public Sentence setText(TextSpan text) {
    this.text = text;
    return this;
  }

  @Override
  public Sentence set(String fieldName, Object value) {
    return (Sentence) super.set(fieldName, value);
  }

  @Override
  public Sentence clone() {
    return (Sentence) super.clone();
  }

}
