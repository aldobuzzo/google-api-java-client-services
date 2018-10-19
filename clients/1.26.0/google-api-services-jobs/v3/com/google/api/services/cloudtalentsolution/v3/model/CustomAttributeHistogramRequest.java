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
 * Custom attributes histogram request. An error is thrown if neither string_value_histogram or
 * long_value_histogram_bucketing_option has been defined.
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
public final class CustomAttributeHistogramRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required.
   *
   * Specifies the custom field key to perform a histogram on. If specified without
   * `long_value_histogram_bucketing_option`, histogram on string values of the given `key` is
   * triggered, otherwise histogram is performed on long values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Optional.
   *
   * Specifies buckets used to perform a range histogram on Job's filterable long custom field
   * values, or min/max value requirements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NumericBucketingOption longValueHistogramBucketingOption;

  /**
   * Optional. If set to true, the response includes the histogram value for each key as a string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean stringValueHistogram;

  /**
   * Required.
   *
   * Specifies the custom field key to perform a histogram on. If specified without
   * `long_value_histogram_bucketing_option`, histogram on string values of the given `key` is
   * triggered, otherwise histogram is performed on long values.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Required.
   *
   * Specifies the custom field key to perform a histogram on. If specified without
   * `long_value_histogram_bucketing_option`, histogram on string values of the given `key` is
   * triggered, otherwise histogram is performed on long values.
   * @param key key or {@code null} for none
   */
  public CustomAttributeHistogramRequest setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Optional.
   *
   * Specifies buckets used to perform a range histogram on Job's filterable long custom field
   * values, or min/max value requirements.
   * @return value or {@code null} for none
   */
  public NumericBucketingOption getLongValueHistogramBucketingOption() {
    return longValueHistogramBucketingOption;
  }

  /**
   * Optional.
   *
   * Specifies buckets used to perform a range histogram on Job's filterable long custom field
   * values, or min/max value requirements.
   * @param longValueHistogramBucketingOption longValueHistogramBucketingOption or {@code null} for none
   */
  public CustomAttributeHistogramRequest setLongValueHistogramBucketingOption(NumericBucketingOption longValueHistogramBucketingOption) {
    this.longValueHistogramBucketingOption = longValueHistogramBucketingOption;
    return this;
  }

  /**
   * Optional. If set to true, the response includes the histogram value for each key as a string.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStringValueHistogram() {
    return stringValueHistogram;
  }

  /**
   * Optional. If set to true, the response includes the histogram value for each key as a string.
   * @param stringValueHistogram stringValueHistogram or {@code null} for none
   */
  public CustomAttributeHistogramRequest setStringValueHistogram(java.lang.Boolean stringValueHistogram) {
    this.stringValueHistogram = stringValueHistogram;
    return this;
  }

  @Override
  public CustomAttributeHistogramRequest set(String fieldName, Object value) {
    return (CustomAttributeHistogramRequest) super.set(fieldName, value);
  }

  @Override
  public CustomAttributeHistogramRequest clone() {
    return (CustomAttributeHistogramRequest) super.clone();
  }

}
