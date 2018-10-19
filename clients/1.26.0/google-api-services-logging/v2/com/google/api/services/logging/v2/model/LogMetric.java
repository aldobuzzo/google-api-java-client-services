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

package com.google.api.services.logging.v2.model;

/**
 * Describes a logs-based metric. The value of the metric is the number of log entries that match a
 * logs filter in a given time interval.Logs-based metric can also be used to extract values from
 * logs and create a a distribution of the values. The distribution records the statistics of the
 * extracted values along with an optional histogram of the values as specified by the bucket
 * options.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Logging API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogMetric extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The bucket_options are required when the logs-based metric is using a DISTRIBUTION
   * value type and it describes the bucket boundaries used to create a histogram of the extracted
   * values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BucketOptions bucketOptions;

  /**
   * Optional. A description of this metric, which is used in documentation. The maximum length of
   * the description is 8000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. An advanced logs filter which is used to match log entries. Example:
   * "resource.type=gae_app AND severity>=ERROR" The maximum length of the filter is 20000
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Optional. A map from a label key string to an extractor expression which is used to extract
   * data from a log entry field and assign as the label value. Each label key specified in the
   * LabelDescriptor must have an associated extractor expression in this map. The syntax of the
   * extractor expression is the same as for the value_extractor field.The extracted value is
   * converted to the type defined in the label descriptor. If the either the extraction or the type
   * conversion fails, the label will have a default value. The default value for a string label is
   * an empty string, for an integer label its 0, and for a boolean label its false.Note that there
   * are upper bounds on the maximum number of labels and the number of active time series that are
   * allowed in a project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labelExtractors;

  /**
   * Optional. The metric descriptor associated with the logs-based metric. If unspecified, it uses
   * a default metric descriptor with a DELTA metric kind, INT64 value type, with no labels and a
   * unit of "1". Such a metric counts the number of log entries matching the filter expression.The
   * name, type, and description fields in the metric_descriptor are output only, and is constructed
   * using the name and description field in the LogMetric.To create a logs-based metric that
   * records a distribution of log values, a DELTA metric kind with a DISTRIBUTION value type must
   * be used along with a value_extractor expression in the LogMetric.Each label in the metric
   * descriptor must have a matching label name as the key and an extractor expression as the value
   * in the label_extractors map.The metric_kind and value_type fields in the metric_descriptor
   * cannot be updated once initially configured. New labels can be added in the metric_descriptor,
   * but existing labels cannot be modified except for their description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricDescriptor metricDescriptor;

  /**
   * Required. The client-assigned metric identifier. Examples: "error_count",
   * "nginx/requests".Metric identifiers are limited to 100 characters and can include only the
   * following characters: A-Z, a-z, 0-9, and the special characters _-.,+!*',()%/. The forward-
   * slash character (/) denotes a hierarchy of name pieces, and it cannot be the first character of
   * the name.The metric identifier in this field must not be URL-encoded
   * (https://en.wikipedia.org/wiki/Percent-encoding). However, when the metric identifier appears
   * as the [METRIC_ID] part of a metric_name API parameter, then the metric identifier must be URL-
   * encoded. Example: "projects/my-project/metrics/nginx%2Frequests".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. A value_extractor is required when using a distribution logs-based metric to extract
   * the values to record from a log entry. Two functions are supported for value extraction:
   * EXTRACT(field) or REGEXP_EXTRACT(field, regex). The argument are:  1. field: The name of the
   * log entry field from which the value is to be  extracted.  2. regex: A regular expression using
   * the Google RE2 syntax  (https://github.com/google/re2/wiki/Syntax) with a single capture  group
   * to extract data from the specified log entry field. The value  of the field is converted to a
   * string before applying the regex.  It is an error to specify a regex that does not include
   * exactly one  capture group.The result of the extraction must be convertible to a double type,
   * as the distribution always records double values. If either the extraction or the conversion to
   * double fails, then those values are not recorded in the distribution.Example:
   * REGEXP_EXTRACT(jsonPayload.request, ".*quantity=(\d+).*")
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueExtractor;

  /**
   * Deprecated. The API version that created or updated this metric. The v2 format is used by
   * default and cannot be changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Optional. The bucket_options are required when the logs-based metric is using a DISTRIBUTION
   * value type and it describes the bucket boundaries used to create a histogram of the extracted
   * values.
   * @return value or {@code null} for none
   */
  public BucketOptions getBucketOptions() {
    return bucketOptions;
  }

  /**
   * Optional. The bucket_options are required when the logs-based metric is using a DISTRIBUTION
   * value type and it describes the bucket boundaries used to create a histogram of the extracted
   * values.
   * @param bucketOptions bucketOptions or {@code null} for none
   */
  public LogMetric setBucketOptions(BucketOptions bucketOptions) {
    this.bucketOptions = bucketOptions;
    return this;
  }

  /**
   * Optional. A description of this metric, which is used in documentation. The maximum length of
   * the description is 8000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A description of this metric, which is used in documentation. The maximum length of
   * the description is 8000 characters.
   * @param description description or {@code null} for none
   */
  public LogMetric setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. An advanced logs filter which is used to match log entries. Example:
   * "resource.type=gae_app AND severity>=ERROR" The maximum length of the filter is 20000
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Required. An advanced logs filter which is used to match log entries. Example:
   * "resource.type=gae_app AND severity>=ERROR" The maximum length of the filter is 20000
   * characters.
   * @param filter filter or {@code null} for none
   */
  public LogMetric setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Optional. A map from a label key string to an extractor expression which is used to extract
   * data from a log entry field and assign as the label value. Each label key specified in the
   * LabelDescriptor must have an associated extractor expression in this map. The syntax of the
   * extractor expression is the same as for the value_extractor field.The extracted value is
   * converted to the type defined in the label descriptor. If the either the extraction or the type
   * conversion fails, the label will have a default value. The default value for a string label is
   * an empty string, for an integer label its 0, and for a boolean label its false.Note that there
   * are upper bounds on the maximum number of labels and the number of active time series that are
   * allowed in a project.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabelExtractors() {
    return labelExtractors;
  }

  /**
   * Optional. A map from a label key string to an extractor expression which is used to extract
   * data from a log entry field and assign as the label value. Each label key specified in the
   * LabelDescriptor must have an associated extractor expression in this map. The syntax of the
   * extractor expression is the same as for the value_extractor field.The extracted value is
   * converted to the type defined in the label descriptor. If the either the extraction or the type
   * conversion fails, the label will have a default value. The default value for a string label is
   * an empty string, for an integer label its 0, and for a boolean label its false.Note that there
   * are upper bounds on the maximum number of labels and the number of active time series that are
   * allowed in a project.
   * @param labelExtractors labelExtractors or {@code null} for none
   */
  public LogMetric setLabelExtractors(java.util.Map<String, java.lang.String> labelExtractors) {
    this.labelExtractors = labelExtractors;
    return this;
  }

  /**
   * Optional. The metric descriptor associated with the logs-based metric. If unspecified, it uses
   * a default metric descriptor with a DELTA metric kind, INT64 value type, with no labels and a
   * unit of "1". Such a metric counts the number of log entries matching the filter expression.The
   * name, type, and description fields in the metric_descriptor are output only, and is constructed
   * using the name and description field in the LogMetric.To create a logs-based metric that
   * records a distribution of log values, a DELTA metric kind with a DISTRIBUTION value type must
   * be used along with a value_extractor expression in the LogMetric.Each label in the metric
   * descriptor must have a matching label name as the key and an extractor expression as the value
   * in the label_extractors map.The metric_kind and value_type fields in the metric_descriptor
   * cannot be updated once initially configured. New labels can be added in the metric_descriptor,
   * but existing labels cannot be modified except for their description.
   * @return value or {@code null} for none
   */
  public MetricDescriptor getMetricDescriptor() {
    return metricDescriptor;
  }

  /**
   * Optional. The metric descriptor associated with the logs-based metric. If unspecified, it uses
   * a default metric descriptor with a DELTA metric kind, INT64 value type, with no labels and a
   * unit of "1". Such a metric counts the number of log entries matching the filter expression.The
   * name, type, and description fields in the metric_descriptor are output only, and is constructed
   * using the name and description field in the LogMetric.To create a logs-based metric that
   * records a distribution of log values, a DELTA metric kind with a DISTRIBUTION value type must
   * be used along with a value_extractor expression in the LogMetric.Each label in the metric
   * descriptor must have a matching label name as the key and an extractor expression as the value
   * in the label_extractors map.The metric_kind and value_type fields in the metric_descriptor
   * cannot be updated once initially configured. New labels can be added in the metric_descriptor,
   * but existing labels cannot be modified except for their description.
   * @param metricDescriptor metricDescriptor or {@code null} for none
   */
  public LogMetric setMetricDescriptor(MetricDescriptor metricDescriptor) {
    this.metricDescriptor = metricDescriptor;
    return this;
  }

  /**
   * Required. The client-assigned metric identifier. Examples: "error_count",
   * "nginx/requests".Metric identifiers are limited to 100 characters and can include only the
   * following characters: A-Z, a-z, 0-9, and the special characters _-.,+!*',()%/. The forward-
   * slash character (/) denotes a hierarchy of name pieces, and it cannot be the first character of
   * the name.The metric identifier in this field must not be URL-encoded
   * (https://en.wikipedia.org/wiki/Percent-encoding). However, when the metric identifier appears
   * as the [METRIC_ID] part of a metric_name API parameter, then the metric identifier must be URL-
   * encoded. Example: "projects/my-project/metrics/nginx%2Frequests".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The client-assigned metric identifier. Examples: "error_count",
   * "nginx/requests".Metric identifiers are limited to 100 characters and can include only the
   * following characters: A-Z, a-z, 0-9, and the special characters _-.,+!*',()%/. The forward-
   * slash character (/) denotes a hierarchy of name pieces, and it cannot be the first character of
   * the name.The metric identifier in this field must not be URL-encoded
   * (https://en.wikipedia.org/wiki/Percent-encoding). However, when the metric identifier appears
   * as the [METRIC_ID] part of a metric_name API parameter, then the metric identifier must be URL-
   * encoded. Example: "projects/my-project/metrics/nginx%2Frequests".
   * @param name name or {@code null} for none
   */
  public LogMetric setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. A value_extractor is required when using a distribution logs-based metric to extract
   * the values to record from a log entry. Two functions are supported for value extraction:
   * EXTRACT(field) or REGEXP_EXTRACT(field, regex). The argument are:  1. field: The name of the
   * log entry field from which the value is to be  extracted.  2. regex: A regular expression using
   * the Google RE2 syntax  (https://github.com/google/re2/wiki/Syntax) with a single capture  group
   * to extract data from the specified log entry field. The value  of the field is converted to a
   * string before applying the regex.  It is an error to specify a regex that does not include
   * exactly one  capture group.The result of the extraction must be convertible to a double type,
   * as the distribution always records double values. If either the extraction or the conversion to
   * double fails, then those values are not recorded in the distribution.Example:
   * REGEXP_EXTRACT(jsonPayload.request, ".*quantity=(\d+).*")
   * @return value or {@code null} for none
   */
  public java.lang.String getValueExtractor() {
    return valueExtractor;
  }

  /**
   * Optional. A value_extractor is required when using a distribution logs-based metric to extract
   * the values to record from a log entry. Two functions are supported for value extraction:
   * EXTRACT(field) or REGEXP_EXTRACT(field, regex). The argument are:  1. field: The name of the
   * log entry field from which the value is to be  extracted.  2. regex: A regular expression using
   * the Google RE2 syntax  (https://github.com/google/re2/wiki/Syntax) with a single capture  group
   * to extract data from the specified log entry field. The value  of the field is converted to a
   * string before applying the regex.  It is an error to specify a regex that does not include
   * exactly one  capture group.The result of the extraction must be convertible to a double type,
   * as the distribution always records double values. If either the extraction or the conversion to
   * double fails, then those values are not recorded in the distribution.Example:
   * REGEXP_EXTRACT(jsonPayload.request, ".*quantity=(\d+).*")
   * @param valueExtractor valueExtractor or {@code null} for none
   */
  public LogMetric setValueExtractor(java.lang.String valueExtractor) {
    this.valueExtractor = valueExtractor;
    return this;
  }

  /**
   * Deprecated. The API version that created or updated this metric. The v2 format is used by
   * default and cannot be changed.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Deprecated. The API version that created or updated this metric. The v2 format is used by
   * default and cannot be changed.
   * @param version version or {@code null} for none
   */
  public LogMetric setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public LogMetric set(String fieldName, Object value) {
    return (LogMetric) super.set(fieldName, value);
  }

  @Override
  public LogMetric clone() {
    return (LogMetric) super.clone();
  }

}
