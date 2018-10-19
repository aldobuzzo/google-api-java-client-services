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

package com.google.api.services.deploymentmanagerv2beta.model;

/**
 * A response containing a partial list of operations and a page token used to build the next
 * request if the request has been truncated.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager API V2Beta Methods.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OperationsListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Output only. A token used to continue a truncated list request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Output only. Operations contained in this list response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Operation> operations;

  static {
    // hack to force ProGuard to consider Operation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Operation.class);
  }

  /**
   * Output only. A token used to continue a truncated list request.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Output only. A token used to continue a truncated list request.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public OperationsListResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Output only. Operations contained in this list response.
   * @return value or {@code null} for none
   */
  public java.util.List<Operation> getOperations() {
    return operations;
  }

  /**
   * Output only. Operations contained in this list response.
   * @param operations operations or {@code null} for none
   */
  public OperationsListResponse setOperations(java.util.List<Operation> operations) {
    this.operations = operations;
    return this;
  }

  @Override
  public OperationsListResponse set(String fieldName, Object value) {
    return (OperationsListResponse) super.set(fieldName, value);
  }

  @Override
  public OperationsListResponse clone() {
    return (OperationsListResponse) super.clone();
  }

}
