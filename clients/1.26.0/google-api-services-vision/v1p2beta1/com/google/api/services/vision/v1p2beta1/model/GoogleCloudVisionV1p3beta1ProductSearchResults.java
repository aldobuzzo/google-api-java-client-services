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
 * Results for a product search request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p3beta1ProductSearchResults extends com.google.api.client.json.GenericJson {

  /**
   * Timestamp of the index which provided these results. Changes made after this time are not
   * reflected in the current results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String indexTime;

  /**
   * List of results, one for each product match.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p3beta1ProductSearchResultsResult> results;

  /**
   * Timestamp of the index which provided these results. Changes made after this time are not
   * reflected in the current results.
   * @return value or {@code null} for none
   */
  public String getIndexTime() {
    return indexTime;
  }

  /**
   * Timestamp of the index which provided these results. Changes made after this time are not
   * reflected in the current results.
   * @param indexTime indexTime or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ProductSearchResults setIndexTime(String indexTime) {
    this.indexTime = indexTime;
    return this;
  }

  /**
   * List of results, one for each product match.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p3beta1ProductSearchResultsResult> getResults() {
    return results;
  }

  /**
   * List of results, one for each product match.
   * @param results results or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1ProductSearchResults setResults(java.util.List<GoogleCloudVisionV1p3beta1ProductSearchResultsResult> results) {
    this.results = results;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p3beta1ProductSearchResults set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p3beta1ProductSearchResults) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p3beta1ProductSearchResults clone() {
    return (GoogleCloudVisionV1p3beta1ProductSearchResults) super.clone();
  }

}
