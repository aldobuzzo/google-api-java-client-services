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
 * Represents the feeling associated with the entire text or entities in the text.
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
public final class Sentiment extends com.google.api.client.json.GenericJson {

  /**
   * A non-negative number in the [0, +inf) range, which represents the absolute magnitude of
   * sentiment regardless of score (positive or negative).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float magnitude;

  /**
   * DEPRECATED FIELD - This field is being deprecated in favor of score. Please refer to our
   * documentation at https://cloud.google.com/natural-language/docs for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float polarity;

  /**
   * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive sentiment).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * A non-negative number in the [0, +inf) range, which represents the absolute magnitude of
   * sentiment regardless of score (positive or negative).
   * @return value or {@code null} for none
   */
  public java.lang.Float getMagnitude() {
    return magnitude;
  }

  /**
   * A non-negative number in the [0, +inf) range, which represents the absolute magnitude of
   * sentiment regardless of score (positive or negative).
   * @param magnitude magnitude or {@code null} for none
   */
  public Sentiment setMagnitude(java.lang.Float magnitude) {
    this.magnitude = magnitude;
    return this;
  }

  /**
   * DEPRECATED FIELD - This field is being deprecated in favor of score. Please refer to our
   * documentation at https://cloud.google.com/natural-language/docs for more information.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPolarity() {
    return polarity;
  }

  /**
   * DEPRECATED FIELD - This field is being deprecated in favor of score. Please refer to our
   * documentation at https://cloud.google.com/natural-language/docs for more information.
   * @param polarity polarity or {@code null} for none
   */
  public Sentiment setPolarity(java.lang.Float polarity) {
    this.polarity = polarity;
    return this;
  }

  /**
   * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive sentiment).
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * Sentiment score between -1.0 (negative sentiment) and 1.0 (positive sentiment).
   * @param score score or {@code null} for none
   */
  public Sentiment setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  @Override
  public Sentiment set(String fieldName, Object value) {
    return (Sentiment) super.set(fieldName, value);
  }

  @Override
  public Sentiment clone() {
    return (Sentiment) super.clone();
  }

}
