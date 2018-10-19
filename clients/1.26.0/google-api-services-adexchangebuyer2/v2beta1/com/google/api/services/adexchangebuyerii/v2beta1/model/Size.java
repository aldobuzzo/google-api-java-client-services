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

package com.google.api.services.adexchangebuyerii.v2beta1.model;

/**
 * Message depicting the size of the creative. The units of width and height depend on the type of
 * the targeting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Size extends com.google.api.client.json.GenericJson {

  /**
   * The height of the creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * The width of the creative
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * The height of the creative.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * The height of the creative.
   * @param height height or {@code null} for none
   */
  public Size setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * The width of the creative
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * The width of the creative
   * @param width width or {@code null} for none
   */
  public Size setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public Size set(String fieldName, Object value) {
    return (Size) super.set(fieldName, value);
  }

  @Override
  public Size clone() {
    return (Size) super.clone();
  }

}
