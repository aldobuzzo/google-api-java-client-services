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

package com.google.api.services.jobservice.v2.model;

/**
 * Job compensation details.
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
public final class CompensationInfo extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * The amount of compensation or pay for the job. As an alternative, compensation_amount_min and
   * compensation_amount_max may be used to define a range of compensation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money amount;

  /**
   * Output only.
   *
   * Annualized base compensation range. Computed as base compensation entry's
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompensationRange annualizedBaseCompensationRange;

  /**
   * Output only.
   *
   * Annualized total compensation range. Computed as all compensation entries'
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CompensationRange annualizedTotalCompensationRange;

  /**
   * Optional.
   *
   * Job compensation information.
   *
   * At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as
   * ** base compensation entry ** for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CompensationEntry> entries;

  static {
    // hack to force ProGuard to consider CompensationEntry used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CompensationEntry.class);
  }

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * An upper bound on a range for compensation or pay for the job. The currency type is specified
   * in compensation_amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money max;

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * A lower bound on a range for compensation or pay for the job. The currency type is specified in
   * compensation_amount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Money min;

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * Type of job compensation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * The amount of compensation or pay for the job. As an alternative, compensation_amount_min and
   * compensation_amount_max may be used to define a range of compensation.
   * @return value or {@code null} for none
   */
  public Money getAmount() {
    return amount;
  }

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * The amount of compensation or pay for the job. As an alternative, compensation_amount_min and
   * compensation_amount_max may be used to define a range of compensation.
   * @param amount amount or {@code null} for none
   */
  public CompensationInfo setAmount(Money amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Output only.
   *
   * Annualized base compensation range. Computed as base compensation entry's
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * @return value or {@code null} for none
   */
  public CompensationRange getAnnualizedBaseCompensationRange() {
    return annualizedBaseCompensationRange;
  }

  /**
   * Output only.
   *
   * Annualized base compensation range. Computed as base compensation entry's
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * @param annualizedBaseCompensationRange annualizedBaseCompensationRange or {@code null} for none
   */
  public CompensationInfo setAnnualizedBaseCompensationRange(CompensationRange annualizedBaseCompensationRange) {
    this.annualizedBaseCompensationRange = annualizedBaseCompensationRange;
    return this;
  }

  /**
   * Output only.
   *
   * Annualized total compensation range. Computed as all compensation entries'
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * @return value or {@code null} for none
   */
  public CompensationRange getAnnualizedTotalCompensationRange() {
    return annualizedTotalCompensationRange;
  }

  /**
   * Output only.
   *
   * Annualized total compensation range. Computed as all compensation entries'
   * CompensationEntry.compensation times CompensationEntry.expected_units_per_year.
   *
   * See CompensationEntry for explanation on compensation annualization.
   * @param annualizedTotalCompensationRange annualizedTotalCompensationRange or {@code null} for none
   */
  public CompensationInfo setAnnualizedTotalCompensationRange(CompensationRange annualizedTotalCompensationRange) {
    this.annualizedTotalCompensationRange = annualizedTotalCompensationRange;
    return this;
  }

  /**
   * Optional.
   *
   * Job compensation information.
   *
   * At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as
   * ** base compensation entry ** for the job.
   * @return value or {@code null} for none
   */
  public java.util.List<CompensationEntry> getEntries() {
    return entries;
  }

  /**
   * Optional.
   *
   * Job compensation information.
   *
   * At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as
   * ** base compensation entry ** for the job.
   * @param entries entries or {@code null} for none
   */
  public CompensationInfo setEntries(java.util.List<CompensationEntry> entries) {
    this.entries = entries;
    return this;
  }

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * An upper bound on a range for compensation or pay for the job. The currency type is specified
   * in compensation_amount.
   * @return value or {@code null} for none
   */
  public Money getMax() {
    return max;
  }

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * An upper bound on a range for compensation or pay for the job. The currency type is specified
   * in compensation_amount.
   * @param max max or {@code null} for none
   */
  public CompensationInfo setMax(Money max) {
    this.max = max;
    return this;
  }

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * A lower bound on a range for compensation or pay for the job. The currency type is specified in
   * compensation_amount.
   * @return value or {@code null} for none
   */
  public Money getMin() {
    return min;
  }

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * A lower bound on a range for compensation or pay for the job. The currency type is specified in
   * compensation_amount.
   * @param min min or {@code null} for none
   */
  public CompensationInfo setMin(Money min) {
    this.min = min;
    return this;
  }

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * Type of job compensation.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Deprecated. Use entries instead.
   *
   * Optional.
   *
   * Type of job compensation.
   * @param type type or {@code null} for none
   */
  public CompensationInfo setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public CompensationInfo set(String fieldName, Object value) {
    return (CompensationInfo) super.set(fieldName, value);
  }

  @Override
  public CompensationInfo clone() {
    return (CompensationInfo) super.clone();
  }

}
