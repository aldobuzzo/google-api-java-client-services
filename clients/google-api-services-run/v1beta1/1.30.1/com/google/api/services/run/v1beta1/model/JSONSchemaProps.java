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

package com.google.api.services.run.v1beta1.model;

/**
 * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JSONSchemaProps extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JSONSchemaPropsOrBool additionalItems;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JSONSchemaPropsOrBool additionalProperties;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<JSONSchemaProps> allOf;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<JSONSchemaProps> anyOf;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("default")
  private JSON default__;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, JSONSchemaProps> definitions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, JSONSchemaPropsOrStringArray> dependencies;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("enum")
  private java.util.List<java.lang.String> enum__;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JSON example;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exclusiveMaximum;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exclusiveMinimum;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExternalDocumentation externalDocs;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JSONSchemaPropsOrArray items;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxItems;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxLength;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long maxProperties;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maximum;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minItems;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minLength;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long minProperties;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minimum;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double multipleOf;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JSONSchemaProps not;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<JSONSchemaProps> oneOf;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pattern;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, JSONSchemaProps> patternProperties;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, JSONSchemaProps> properties;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ref;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> required;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schema;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean uniqueItems;

  /**
   * @return value or {@code null} for none
   */
  public JSONSchemaPropsOrBool getAdditionalItems() {
    return additionalItems;
  }

  /**
   * @param additionalItems additionalItems or {@code null} for none
   */
  public JSONSchemaProps setAdditionalItems(JSONSchemaPropsOrBool additionalItems) {
    this.additionalItems = additionalItems;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JSONSchemaPropsOrBool getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * @param additionalProperties additionalProperties or {@code null} for none
   */
  public JSONSchemaProps setAdditionalProperties(JSONSchemaPropsOrBool additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<JSONSchemaProps> getAllOf() {
    return allOf;
  }

  /**
   * @param allOf allOf or {@code null} for none
   */
  public JSONSchemaProps setAllOf(java.util.List<JSONSchemaProps> allOf) {
    this.allOf = allOf;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<JSONSchemaProps> getAnyOf() {
    return anyOf;
  }

  /**
   * @param anyOf anyOf or {@code null} for none
   */
  public JSONSchemaProps setAnyOf(java.util.List<JSONSchemaProps> anyOf) {
    this.anyOf = anyOf;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JSON getDefault() {
    return default__;
  }

  /**
   * @param default__ default__ or {@code null} for none
   */
  public JSONSchemaProps setDefault(JSON default__) {
    this.default__ = default__;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, JSONSchemaProps> getDefinitions() {
    return definitions;
  }

  /**
   * @param definitions definitions or {@code null} for none
   */
  public JSONSchemaProps setDefinitions(java.util.Map<String, JSONSchemaProps> definitions) {
    this.definitions = definitions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, JSONSchemaPropsOrStringArray> getDependencies() {
    return dependencies;
  }

  /**
   * @param dependencies dependencies or {@code null} for none
   */
  public JSONSchemaProps setDependencies(java.util.Map<String, JSONSchemaPropsOrStringArray> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public JSONSchemaProps setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnum() {
    return enum__;
  }

  /**
   * @param enum__ enum__ or {@code null} for none
   */
  public JSONSchemaProps setEnum(java.util.List<java.lang.String> enum__) {
    this.enum__ = enum__;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JSON getExample() {
    return example;
  }

  /**
   * @param example example or {@code null} for none
   */
  public JSONSchemaProps setExample(JSON example) {
    this.example = example;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExclusiveMaximum() {
    return exclusiveMaximum;
  }

  /**
   * @param exclusiveMaximum exclusiveMaximum or {@code null} for none
   */
  public JSONSchemaProps setExclusiveMaximum(java.lang.Boolean exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExclusiveMinimum() {
    return exclusiveMinimum;
  }

  /**
   * @param exclusiveMinimum exclusiveMinimum or {@code null} for none
   */
  public JSONSchemaProps setExclusiveMinimum(java.lang.Boolean exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ExternalDocumentation getExternalDocs() {
    return externalDocs;
  }

  /**
   * @param externalDocs externalDocs or {@code null} for none
   */
  public JSONSchemaProps setExternalDocs(ExternalDocumentation externalDocs) {
    this.externalDocs = externalDocs;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * @param format format or {@code null} for none
   */
  public JSONSchemaProps setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public JSONSchemaProps setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JSONSchemaPropsOrArray getItems() {
    return items;
  }

  /**
   * @param items items or {@code null} for none
   */
  public JSONSchemaProps setItems(JSONSchemaPropsOrArray items) {
    this.items = items;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxItems() {
    return maxItems;
  }

  /**
   * @param maxItems maxItems or {@code null} for none
   */
  public JSONSchemaProps setMaxItems(java.lang.Long maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxLength() {
    return maxLength;
  }

  /**
   * @param maxLength maxLength or {@code null} for none
   */
  public JSONSchemaProps setMaxLength(java.lang.Long maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getMaxProperties() {
    return maxProperties;
  }

  /**
   * @param maxProperties maxProperties or {@code null} for none
   */
  public JSONSchemaProps setMaxProperties(java.lang.Long maxProperties) {
    this.maxProperties = maxProperties;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaximum() {
    return maximum;
  }

  /**
   * @param maximum maximum or {@code null} for none
   */
  public JSONSchemaProps setMaximum(java.lang.Double maximum) {
    this.maximum = maximum;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinItems() {
    return minItems;
  }

  /**
   * @param minItems minItems or {@code null} for none
   */
  public JSONSchemaProps setMinItems(java.lang.Long minItems) {
    this.minItems = minItems;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinLength() {
    return minLength;
  }

  /**
   * @param minLength minLength or {@code null} for none
   */
  public JSONSchemaProps setMinLength(java.lang.Long minLength) {
    this.minLength = minLength;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getMinProperties() {
    return minProperties;
  }

  /**
   * @param minProperties minProperties or {@code null} for none
   */
  public JSONSchemaProps setMinProperties(java.lang.Long minProperties) {
    this.minProperties = minProperties;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinimum() {
    return minimum;
  }

  /**
   * @param minimum minimum or {@code null} for none
   */
  public JSONSchemaProps setMinimum(java.lang.Double minimum) {
    this.minimum = minimum;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getMultipleOf() {
    return multipleOf;
  }

  /**
   * @param multipleOf multipleOf or {@code null} for none
   */
  public JSONSchemaProps setMultipleOf(java.lang.Double multipleOf) {
    this.multipleOf = multipleOf;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JSONSchemaProps getNot() {
    return not;
  }

  /**
   * @param not not or {@code null} for none
   */
  public JSONSchemaProps setNot(JSONSchemaProps not) {
    this.not = not;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<JSONSchemaProps> getOneOf() {
    return oneOf;
  }

  /**
   * @param oneOf oneOf or {@code null} for none
   */
  public JSONSchemaProps setOneOf(java.util.List<JSONSchemaProps> oneOf) {
    this.oneOf = oneOf;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPattern() {
    return pattern;
  }

  /**
   * @param pattern pattern or {@code null} for none
   */
  public JSONSchemaProps setPattern(java.lang.String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, JSONSchemaProps> getPatternProperties() {
    return patternProperties;
  }

  /**
   * @param patternProperties patternProperties or {@code null} for none
   */
  public JSONSchemaProps setPatternProperties(java.util.Map<String, JSONSchemaProps> patternProperties) {
    this.patternProperties = patternProperties;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.Map<String, JSONSchemaProps> getProperties() {
    return properties;
  }

  /**
   * @param properties properties or {@code null} for none
   */
  public JSONSchemaProps setProperties(java.util.Map<String, JSONSchemaProps> properties) {
    this.properties = properties;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRef() {
    return ref;
  }

  /**
   * @param ref ref or {@code null} for none
   */
  public JSONSchemaProps setRef(java.lang.String ref) {
    this.ref = ref;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRequired() {
    return required;
  }

  /**
   * @param required required or {@code null} for none
   */
  public JSONSchemaProps setRequired(java.util.List<java.lang.String> required) {
    this.required = required;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSchema() {
    return schema;
  }

  /**
   * @param schema schema or {@code null} for none
   */
  public JSONSchemaProps setSchema(java.lang.String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * @param title title or {@code null} for none
   */
  public JSONSchemaProps setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public JSONSchemaProps setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUniqueItems() {
    return uniqueItems;
  }

  /**
   * @param uniqueItems uniqueItems or {@code null} for none
   */
  public JSONSchemaProps setUniqueItems(java.lang.Boolean uniqueItems) {
    this.uniqueItems = uniqueItems;
    return this;
  }

  @Override
  public JSONSchemaProps set(String fieldName, Object value) {
    return (JSONSchemaProps) super.set(fieldName, value);
  }

  @Override
  public JSONSchemaProps clone() {
    return (JSONSchemaProps) super.clone();
  }

}
