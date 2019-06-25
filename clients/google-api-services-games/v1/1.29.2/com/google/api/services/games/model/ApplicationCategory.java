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

package com.google.api.services.games.model;

/**
 * This is a JSON template for an application category object.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplicationCategory extends com.google.api.client.json.GenericJson {

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#applicationCategory.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The primary category.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primary;

  /**
   * The secondary category.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secondary;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#applicationCategory.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#applicationCategory.
   * @param kind kind or {@code null} for none
   */
  public ApplicationCategory setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The primary category.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimary() {
    return primary;
  }

  /**
   * The primary category.
   * @param primary primary or {@code null} for none
   */
  public ApplicationCategory setPrimary(java.lang.String primary) {
    this.primary = primary;
    return this;
  }

  /**
   * The secondary category.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecondary() {
    return secondary;
  }

  /**
   * The secondary category.
   * @param secondary secondary or {@code null} for none
   */
  public ApplicationCategory setSecondary(java.lang.String secondary) {
    this.secondary = secondary;
    return this;
  }

  @Override
  public ApplicationCategory set(String fieldName, Object value) {
    return (ApplicationCategory) super.set(fieldName, value);
  }

  @Override
  public ApplicationCategory clone() {
    return (ApplicationCategory) super.clone();
  }

}
