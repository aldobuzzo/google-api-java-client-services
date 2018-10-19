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

package com.google.api.services.cloudtalentsolution.v3.model;

/**
 * Input only.
 *
 * Compensation based histogram request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CompensationHistogramRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required.
   *
   * Numeric histogram options, like buckets, whether include min or max value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NumericBucketingOption bucketingOption;

  /**
   * Required.
   *
   * Type of the request, representing which field the histogramming should be performed over. A
   * single request can only specify one histogram of each `CompensationHistogramRequestType`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Required.
   *
   * Numeric histogram options, like buckets, whether include min or max value.
   * @return value or {@code null} for none
   */
  public NumericBucketingOption getBucketingOption() {
    return bucketingOption;
  }

  /**
   * Required.
   *
   * Numeric histogram options, like buckets, whether include min or max value.
   * @param bucketingOption bucketingOption or {@code null} for none
   */
  public CompensationHistogramRequest setBucketingOption(NumericBucketingOption bucketingOption) {
    this.bucketingOption = bucketingOption;
    return this;
  }

  /**
   * Required.
   *
   * Type of the request, representing which field the histogramming should be performed over. A
   * single request can only specify one histogram of each `CompensationHistogramRequestType`.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required.
   *
   * Type of the request, representing which field the histogramming should be performed over. A
   * single request can only specify one histogram of each `CompensationHistogramRequestType`.
   * @param type type or {@code null} for none
   */
  public CompensationHistogramRequest setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public CompensationHistogramRequest set(String fieldName, Object value) {
    return (CompensationHistogramRequest) super.set(fieldName, value);
  }

  @Override
  public CompensationHistogramRequest clone() {
    return (CompensationHistogramRequest) super.clone();
  }

}
