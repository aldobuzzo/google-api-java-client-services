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

package com.google.api.services.monitoring.v3.model;

/**
 * A single field of a message type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Stackdriver Monitoring API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Field extends com.google.api.client.json.GenericJson {

  /**
   * The field cardinality.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cardinality;

  /**
   * The string value of the default value of this field. Proto2 syntax only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultValue;

  /**
   * The field JSON name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jsonName;

  /**
   * The field type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The field name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The field number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer number;

  /**
   * The index of the field type in Type.oneofs, for message or enumeration types. The first type
   * has index 1; zero means the type is not in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer oneofIndex;

  /**
   * The protocol buffer options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Option> options;

  static {
    // hack to force ProGuard to consider Option used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Option.class);
  }

  /**
   * Whether to use alternative packed wire representation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean packed;

  /**
   * The field type URL, without the scheme, for message or enumeration types. Example:
   * "type.googleapis.com/google.protobuf.Timestamp".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String typeUrl;

  /**
   * The field cardinality.
   * @return value or {@code null} for none
   */
  public java.lang.String getCardinality() {
    return cardinality;
  }

  /**
   * The field cardinality.
   * @param cardinality cardinality or {@code null} for none
   */
  public Field setCardinality(java.lang.String cardinality) {
    this.cardinality = cardinality;
    return this;
  }

  /**
   * The string value of the default value of this field. Proto2 syntax only.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultValue() {
    return defaultValue;
  }

  /**
   * The string value of the default value of this field. Proto2 syntax only.
   * @param defaultValue defaultValue or {@code null} for none
   */
  public Field setDefaultValue(java.lang.String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The field JSON name.
   * @return value or {@code null} for none
   */
  public java.lang.String getJsonName() {
    return jsonName;
  }

  /**
   * The field JSON name.
   * @param jsonName jsonName or {@code null} for none
   */
  public Field setJsonName(java.lang.String jsonName) {
    this.jsonName = jsonName;
    return this;
  }

  /**
   * The field type.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The field type.
   * @param kind kind or {@code null} for none
   */
  public Field setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The field name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The field name.
   * @param name name or {@code null} for none
   */
  public Field setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The field number.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumber() {
    return number;
  }

  /**
   * The field number.
   * @param number number or {@code null} for none
   */
  public Field setNumber(java.lang.Integer number) {
    this.number = number;
    return this;
  }

  /**
   * The index of the field type in Type.oneofs, for message or enumeration types. The first type
   * has index 1; zero means the type is not in the list.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getOneofIndex() {
    return oneofIndex;
  }

  /**
   * The index of the field type in Type.oneofs, for message or enumeration types. The first type
   * has index 1; zero means the type is not in the list.
   * @param oneofIndex oneofIndex or {@code null} for none
   */
  public Field setOneofIndex(java.lang.Integer oneofIndex) {
    this.oneofIndex = oneofIndex;
    return this;
  }

  /**
   * The protocol buffer options.
   * @return value or {@code null} for none
   */
  public java.util.List<Option> getOptions() {
    return options;
  }

  /**
   * The protocol buffer options.
   * @param options options or {@code null} for none
   */
  public Field setOptions(java.util.List<Option> options) {
    this.options = options;
    return this;
  }

  /**
   * Whether to use alternative packed wire representation.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPacked() {
    return packed;
  }

  /**
   * Whether to use alternative packed wire representation.
   * @param packed packed or {@code null} for none
   */
  public Field setPacked(java.lang.Boolean packed) {
    this.packed = packed;
    return this;
  }

  /**
   * The field type URL, without the scheme, for message or enumeration types. Example:
   * "type.googleapis.com/google.protobuf.Timestamp".
   * @return value or {@code null} for none
   */
  public java.lang.String getTypeUrl() {
    return typeUrl;
  }

  /**
   * The field type URL, without the scheme, for message or enumeration types. Example:
   * "type.googleapis.com/google.protobuf.Timestamp".
   * @param typeUrl typeUrl or {@code null} for none
   */
  public Field setTypeUrl(java.lang.String typeUrl) {
    this.typeUrl = typeUrl;
    return this;
  }

  @Override
  public Field set(String fieldName, Object value) {
    return (Field) super.set(fieldName, value);
  }

  @Override
  public Field clone() {
    return (Field) super.clone();
  }

}
