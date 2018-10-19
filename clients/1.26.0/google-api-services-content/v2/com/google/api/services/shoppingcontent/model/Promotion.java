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

package com.google.api.services.shoppingcontent.model;

/**
 * Model definition for Promotion.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Promotion extends com.google.api.client.json.GenericJson {

  /**
   * [required] Amount of the promotion. The values here are the promotion applied to the unit price
   * pretax and to the total of the tax amounts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Amount promotionAmount;

  /**
   * [required] ID of the promotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String promotionId;

  /**
   * [required] Amount of the promotion. The values here are the promotion applied to the unit price
   * pretax and to the total of the tax amounts.
   * @return value or {@code null} for none
   */
  public Amount getPromotionAmount() {
    return promotionAmount;
  }

  /**
   * [required] Amount of the promotion. The values here are the promotion applied to the unit price
   * pretax and to the total of the tax amounts.
   * @param promotionAmount promotionAmount or {@code null} for none
   */
  public Promotion setPromotionAmount(Amount promotionAmount) {
    this.promotionAmount = promotionAmount;
    return this;
  }

  /**
   * [required] ID of the promotion.
   * @return value or {@code null} for none
   */
  public java.lang.String getPromotionId() {
    return promotionId;
  }

  /**
   * [required] ID of the promotion.
   * @param promotionId promotionId or {@code null} for none
   */
  public Promotion setPromotionId(java.lang.String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

  @Override
  public Promotion set(String fieldName, Object value) {
    return (Promotion) super.set(fieldName, value);
  }

  @Override
  public Promotion clone() {
    return (Promotion) super.clone();
  }

}
