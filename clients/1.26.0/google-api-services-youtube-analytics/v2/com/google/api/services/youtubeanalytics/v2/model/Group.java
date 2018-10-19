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

package com.google.api.services.youtubeanalytics.v2.model;

/**
 * A group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Analytics API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Group extends com.google.api.client.json.GenericJson {

  /**
   * The `contentDetails` object contains additional information about the group, such as the number
   * and type of items that it contains.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GroupContentDetails contentDetails;

  /**
   * Apiary error details
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Errors errors;

  /**
   * The Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID that YouTube uses to uniquely identify the group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Identifies the API resource's type. The value will be `youtube#group`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The `snippet` object contains basic information about the group, including its creation date
   * and name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GroupSnippet snippet;

  /**
   * The `contentDetails` object contains additional information about the group, such as the number
   * and type of items that it contains.
   * @return value or {@code null} for none
   */
  public GroupContentDetails getContentDetails() {
    return contentDetails;
  }

  /**
   * The `contentDetails` object contains additional information about the group, such as the number
   * and type of items that it contains.
   * @param contentDetails contentDetails or {@code null} for none
   */
  public Group setContentDetails(GroupContentDetails contentDetails) {
    this.contentDetails = contentDetails;
    return this;
  }

  /**
   * Apiary error details
   * @return value or {@code null} for none
   */
  public Errors getErrors() {
    return errors;
  }

  /**
   * Apiary error details
   * @param errors errors or {@code null} for none
   */
  public Group setErrors(Errors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * The Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public Group setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the group.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID that YouTube uses to uniquely identify the group.
   * @param id id or {@code null} for none
   */
  public Group setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies the API resource's type. The value will be `youtube#group`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the API resource's type. The value will be `youtube#group`.
   * @param kind kind or {@code null} for none
   */
  public Group setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The `snippet` object contains basic information about the group, including its creation date
   * and name.
   * @return value or {@code null} for none
   */
  public GroupSnippet getSnippet() {
    return snippet;
  }

  /**
   * The `snippet` object contains basic information about the group, including its creation date
   * and name.
   * @param snippet snippet or {@code null} for none
   */
  public Group setSnippet(GroupSnippet snippet) {
    this.snippet = snippet;
    return this;
  }

  @Override
  public Group set(String fieldName, Object value) {
    return (Group) super.set(fieldName, value);
  }

  @Override
  public Group clone() {
    return (Group) super.clone();
  }

}
