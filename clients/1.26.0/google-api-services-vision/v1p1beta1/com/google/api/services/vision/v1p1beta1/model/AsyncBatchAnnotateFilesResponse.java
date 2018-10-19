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

package com.google.api.services.vision.v1p1beta1.model;

/**
 * Response to an async batch file annotation request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AsyncBatchAnnotateFilesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of file annotation responses, one for each request in AsyncBatchAnnotateFilesRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AsyncAnnotateFileResponse> responses;

  /**
   * The list of file annotation responses, one for each request in AsyncBatchAnnotateFilesRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<AsyncAnnotateFileResponse> getResponses() {
    return responses;
  }

  /**
   * The list of file annotation responses, one for each request in AsyncBatchAnnotateFilesRequest.
   * @param responses responses or {@code null} for none
   */
  public AsyncBatchAnnotateFilesResponse setResponses(java.util.List<AsyncAnnotateFileResponse> responses) {
    this.responses = responses;
    return this;
  }

  @Override
  public AsyncBatchAnnotateFilesResponse set(String fieldName, Object value) {
    return (AsyncBatchAnnotateFilesResponse) super.set(fieldName, value);
  }

  @Override
  public AsyncBatchAnnotateFilesResponse clone() {
    return (AsyncBatchAnnotateFilesResponse) super.clone();
  }

}
