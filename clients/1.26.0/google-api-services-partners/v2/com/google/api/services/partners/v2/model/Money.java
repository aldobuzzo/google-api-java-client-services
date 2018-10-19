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

package com.google.api.services.partners.v2.model;

/**
 * Represents an amount of money with its currency type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Money extends com.google.api.client.json.GenericJson {

  /**
   * The 3-letter currency code defined in ISO 4217.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and
   * +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is
   * zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be
   * negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nanos;

  /**
   * The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US
   * dollar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long units;

  /**
   * The 3-letter currency code defined in ISO 4217.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * The 3-letter currency code defined in ISO 4217.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public Money setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and
   * +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is
   * zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be
   * negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNanos() {
    return nanos;
  }

  /**
   * Number of nano (10^-9) units of the amount. The value must be between -999,999,999 and
   * +999,999,999 inclusive. If `units` is positive, `nanos` must be positive or zero. If `units` is
   * zero, `nanos` can be positive, zero, or negative. If `units` is negative, `nanos` must be
   * negative or zero. For example $-1.75 is represented as `units`=-1 and `nanos`=-750,000,000.
   * @param nanos nanos or {@code null} for none
   */
  public Money setNanos(java.lang.Integer nanos) {
    this.nanos = nanos;
    return this;
  }

  /**
   * The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US
   * dollar.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUnits() {
    return units;
  }

  /**
   * The whole units of the amount. For example if `currencyCode` is `"USD"`, then 1 unit is one US
   * dollar.
   * @param units units or {@code null} for none
   */
  public Money setUnits(java.lang.Long units) {
    this.units = units;
    return this;
  }

  @Override
  public Money set(String fieldName, Object value) {
    return (Money) super.set(fieldName, value);
  }

  @Override
  public Money clone() {
    return (Money) super.clone();
  }

}
