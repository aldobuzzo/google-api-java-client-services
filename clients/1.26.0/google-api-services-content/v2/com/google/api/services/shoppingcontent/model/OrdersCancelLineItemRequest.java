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
 * Model definition for OrdersCancelLineItemRequest.
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
public final class OrdersCancelLineItemRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Please use amountPretax and amountTax instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price amount;

  /**
   * Amount to refund for the cancelation. Optional. If not set, Google will calculate the default
   * based on the price and tax of the items involved. The amount must not be larger than the net
   * amount left on the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price amountPretax;

  /**
   * Tax amount that correspond to cancellation amount in amountPretax.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price amountTax;

  /**
   * The ID of the line item to cancel. Either lineItemId or productId is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lineItemId;

  /**
   * The ID of the operation. Unique across all operations for a given order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * The ID of the product to cancel. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String productId;

  /**
   * The quantity to cancel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long quantity;

  /**
   * The reason for the cancellation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The explanation of the reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reasonText;

  /**
   * Deprecated. Please use amountPretax and amountTax instead.
   * @return value or {@code null} for none
   */
  public Price getAmount() {
    return amount;
  }

  /**
   * Deprecated. Please use amountPretax and amountTax instead.
   * @param amount amount or {@code null} for none
   */
  public OrdersCancelLineItemRequest setAmount(Price amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Amount to refund for the cancelation. Optional. If not set, Google will calculate the default
   * based on the price and tax of the items involved. The amount must not be larger than the net
   * amount left on the order.
   * @return value or {@code null} for none
   */
  public Price getAmountPretax() {
    return amountPretax;
  }

  /**
   * Amount to refund for the cancelation. Optional. If not set, Google will calculate the default
   * based on the price and tax of the items involved. The amount must not be larger than the net
   * amount left on the order.
   * @param amountPretax amountPretax or {@code null} for none
   */
  public OrdersCancelLineItemRequest setAmountPretax(Price amountPretax) {
    this.amountPretax = amountPretax;
    return this;
  }

  /**
   * Tax amount that correspond to cancellation amount in amountPretax.
   * @return value or {@code null} for none
   */
  public Price getAmountTax() {
    return amountTax;
  }

  /**
   * Tax amount that correspond to cancellation amount in amountPretax.
   * @param amountTax amountTax or {@code null} for none
   */
  public OrdersCancelLineItemRequest setAmountTax(Price amountTax) {
    this.amountTax = amountTax;
    return this;
  }

  /**
   * The ID of the line item to cancel. Either lineItemId or productId is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getLineItemId() {
    return lineItemId;
  }

  /**
   * The ID of the line item to cancel. Either lineItemId or productId is required.
   * @param lineItemId lineItemId or {@code null} for none
   */
  public OrdersCancelLineItemRequest setLineItemId(java.lang.String lineItemId) {
    this.lineItemId = lineItemId;
    return this;
  }

  /**
   * The ID of the operation. Unique across all operations for a given order.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * The ID of the operation. Unique across all operations for a given order.
   * @param operationId operationId or {@code null} for none
   */
  public OrdersCancelLineItemRequest setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * The ID of the product to cancel. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * @return value or {@code null} for none
   */
  public java.lang.String getProductId() {
    return productId;
  }

  /**
   * The ID of the product to cancel. This is the REST ID used in the products service. Either
   * lineItemId or productId is required.
   * @param productId productId or {@code null} for none
   */
  public OrdersCancelLineItemRequest setProductId(java.lang.String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * The quantity to cancel.
   * @return value or {@code null} for none
   */
  public java.lang.Long getQuantity() {
    return quantity;
  }

  /**
   * The quantity to cancel.
   * @param quantity quantity or {@code null} for none
   */
  public OrdersCancelLineItemRequest setQuantity(java.lang.Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * The reason for the cancellation.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason for the cancellation.
   * @param reason reason or {@code null} for none
   */
  public OrdersCancelLineItemRequest setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The explanation of the reason.
   * @return value or {@code null} for none
   */
  public java.lang.String getReasonText() {
    return reasonText;
  }

  /**
   * The explanation of the reason.
   * @param reasonText reasonText or {@code null} for none
   */
  public OrdersCancelLineItemRequest setReasonText(java.lang.String reasonText) {
    this.reasonText = reasonText;
    return this;
  }

  @Override
  public OrdersCancelLineItemRequest set(String fieldName, Object value) {
    return (OrdersCancelLineItemRequest) super.set(fieldName, value);
  }

  @Override
  public OrdersCancelLineItemRequest clone() {
    return (OrdersCancelLineItemRequest) super.clone();
  }

}
