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

package com.google.api.services.vision.v1p2beta1.model;

/**
 * Contains metadata for the BatchAnnotateImages operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p3beta1OperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The time when the batch request was received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Current state of the batch operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The time when the operation result was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The time when the batch request was received.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the batch request was received.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1OperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Current state of the batch operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Current state of the batch operation.
   * @param state state or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1OperationMetadata setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The time when the operation result was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time when the operation result was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1OperationMetadata setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p3beta1OperationMetadata set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p3beta1OperationMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p3beta1OperationMetadata clone() {
    return (GoogleCloudVisionV1p3beta1OperationMetadata) super.clone();
  }

}
