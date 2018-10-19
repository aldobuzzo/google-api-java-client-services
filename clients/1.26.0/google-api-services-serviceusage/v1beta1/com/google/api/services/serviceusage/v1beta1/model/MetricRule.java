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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * Bind API methods to metrics. Binding a method to a metric causes that metric's configured quota
 * behaviors to apply to the method call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetricRule extends com.google.api.client.json.GenericJson {

  /**
   * Metrics to update when the selected methods are called, and the associated cost applied to each
   * metric.
   *
   * The key of the map is the metric name, and the values are the amount increased for the metric
   * against which the quota limits are defined. The value must not be negative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.Map<String, java.lang.Long> metricCosts;

  /**
   * Selects the methods to which this rule applies.
   *
   * Refer to selector for syntax details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * Metrics to update when the selected methods are called, and the associated cost applied to each
   * metric.
   *
   * The key of the map is the metric name, and the values are the amount increased for the metric
   * against which the quota limits are defined. The value must not be negative.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Long> getMetricCosts() {
    return metricCosts;
  }

  /**
   * Metrics to update when the selected methods are called, and the associated cost applied to each
   * metric.
   *
   * The key of the map is the metric name, and the values are the amount increased for the metric
   * against which the quota limits are defined. The value must not be negative.
   * @param metricCosts metricCosts or {@code null} for none
   */
  public MetricRule setMetricCosts(java.util.Map<String, java.lang.Long> metricCosts) {
    this.metricCosts = metricCosts;
    return this;
  }

  /**
   * Selects the methods to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * Selects the methods to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @param selector selector or {@code null} for none
   */
  public MetricRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  @Override
  public MetricRule set(String fieldName, Object value) {
    return (MetricRule) super.set(fieldName, value);
  }

  @Override
  public MetricRule clone() {
    return (MetricRule) super.clone();
  }

}
