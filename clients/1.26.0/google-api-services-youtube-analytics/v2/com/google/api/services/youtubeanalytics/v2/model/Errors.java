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
 * Request Error information.
 *
 * The presence of an error field signals that the operation has failed.
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
public final class Errors extends com.google.api.client.json.GenericJson {

  /**
   * Global error code. Deprecated and ignored. Set custom error codes in ErrorProto.domain and
   * ErrorProto.code instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Specific error description and codes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ErrorProto> error;

  static {
    // hack to force ProGuard to consider ErrorProto used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ErrorProto.class);
  }

  /**
   * Request identifier generated by the service, which can be used to identify the error in the
   * logs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Global error code. Deprecated and ignored. Set custom error codes in ErrorProto.domain and
   * ErrorProto.code instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Global error code. Deprecated and ignored. Set custom error codes in ErrorProto.domain and
   * ErrorProto.code instead.
   * @param code code or {@code null} for none
   */
  public Errors setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Specific error description and codes
   * @return value or {@code null} for none
   */
  public java.util.List<ErrorProto> getError() {
    return error;
  }

  /**
   * Specific error description and codes
   * @param error error or {@code null} for none
   */
  public Errors setError(java.util.List<ErrorProto> error) {
    this.error = error;
    return this;
  }

  /**
   * Request identifier generated by the service, which can be used to identify the error in the
   * logs
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Request identifier generated by the service, which can be used to identify the error in the
   * logs
   * @param requestId requestId or {@code null} for none
   */
  public Errors setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public Errors set(String fieldName, Object value) {
    return (Errors) super.set(fieldName, value);
  }

  @Override
  public Errors clone() {
    return (Errors) super.clone();
  }

}
