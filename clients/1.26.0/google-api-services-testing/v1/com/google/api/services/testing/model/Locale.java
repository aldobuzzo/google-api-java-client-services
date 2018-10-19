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

package com.google.api.services.testing.model;

/**
 * A location/region designation for language.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Locale extends com.google.api.client.json.GenericJson {

  /**
   * The id for this locale. Example: "en_US" @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * A human-friendly name for this language/locale. Example: "English" @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A human-friendly string representing the region for this locale. Example: "United States" Not
   * present for every locale. @OutputOnly
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Tags for this dimension. Examples: "default"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * The id for this locale. Example: "en_US" @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The id for this locale. Example: "en_US" @OutputOnly
   * @param id id or {@code null} for none
   */
  public Locale setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * A human-friendly name for this language/locale. Example: "English" @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A human-friendly name for this language/locale. Example: "English" @OutputOnly
   * @param name name or {@code null} for none
   */
  public Locale setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly string representing the region for this locale. Example: "United States" Not
   * present for every locale. @OutputOnly
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * A human-friendly string representing the region for this locale. Example: "United States" Not
   * present for every locale. @OutputOnly
   * @param region region or {@code null} for none
   */
  public Locale setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Tags for this dimension. Examples: "default"
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Tags for this dimension. Examples: "default"
   * @param tags tags or {@code null} for none
   */
  public Locale setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  @Override
  public Locale set(String fieldName, Object value) {
    return (Locale) super.set(fieldName, value);
  }

  @Override
  public Locale clone() {
    return (Locale) super.clone();
  }

}
