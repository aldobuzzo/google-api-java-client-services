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

package com.google.api.services.games.model;

/**
 * This is a JSON template for a list of score submission statuses.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PlayerScoreListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerScoreListResponse.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The score submissions statuses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PlayerScoreResponse> submittedScores;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerScoreListResponse.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#playerScoreListResponse.
   * @param kind kind or {@code null} for none
   */
  public PlayerScoreListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The score submissions statuses.
   * @return value or {@code null} for none
   */
  public java.util.List<PlayerScoreResponse> getSubmittedScores() {
    return submittedScores;
  }

  /**
   * The score submissions statuses.
   * @param submittedScores submittedScores or {@code null} for none
   */
  public PlayerScoreListResponse setSubmittedScores(java.util.List<PlayerScoreResponse> submittedScores) {
    this.submittedScores = submittedScores;
    return this;
  }

  @Override
  public PlayerScoreListResponse set(String fieldName, Object value) {
    return (PlayerScoreListResponse) super.set(fieldName, value);
  }

  @Override
  public PlayerScoreListResponse clone() {
    return (PlayerScoreListResponse) super.clone();
  }

}
