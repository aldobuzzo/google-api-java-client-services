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
 * Model definition for OrdersShipLineItemsRequest.
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
public final class OrdersShipLineItemsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. Please use shipmentInfo instead. The carrier handling the shipment. See
   * shipments[].carrier in the  Orders resource representation for a list of acceptable values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String carrier;

  /**
   * Line items to ship.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderShipmentLineItemShipment> lineItems;

  static {
    // hack to force ProGuard to consider OrderShipmentLineItemShipment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderShipmentLineItemShipment.class);
  }

  /**
   * The ID of the operation. Unique across all operations for a given order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * ID of the shipment group. Required for orders that use the orderinvoices service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shipmentGroupId;

  /**
   * Deprecated. Please use shipmentInfo instead. The ID of the shipment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shipmentId;

  /**
   * Shipment information. This field is repeated because a single line item can be shipped in
   * several packages (and have several tracking IDs).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo> shipmentInfos;

  static {
    // hack to force ProGuard to consider OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo.class);
  }

  /**
   * Deprecated. Please use shipmentInfo instead. The tracking id for the shipment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackingId;

  /**
   * Deprecated. Please use shipmentInfo instead. The carrier handling the shipment. See
   * shipments[].carrier in the  Orders resource representation for a list of acceptable values.
   * @return value or {@code null} for none
   */
  public java.lang.String getCarrier() {
    return carrier;
  }

  /**
   * Deprecated. Please use shipmentInfo instead. The carrier handling the shipment. See
   * shipments[].carrier in the  Orders resource representation for a list of acceptable values.
   * @param carrier carrier or {@code null} for none
   */
  public OrdersShipLineItemsRequest setCarrier(java.lang.String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * Line items to ship.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderShipmentLineItemShipment> getLineItems() {
    return lineItems;
  }

  /**
   * Line items to ship.
   * @param lineItems lineItems or {@code null} for none
   */
  public OrdersShipLineItemsRequest setLineItems(java.util.List<OrderShipmentLineItemShipment> lineItems) {
    this.lineItems = lineItems;
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
  public OrdersShipLineItemsRequest setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * ID of the shipment group. Required for orders that use the orderinvoices service.
   * @return value or {@code null} for none
   */
  public java.lang.String getShipmentGroupId() {
    return shipmentGroupId;
  }

  /**
   * ID of the shipment group. Required for orders that use the orderinvoices service.
   * @param shipmentGroupId shipmentGroupId or {@code null} for none
   */
  public OrdersShipLineItemsRequest setShipmentGroupId(java.lang.String shipmentGroupId) {
    this.shipmentGroupId = shipmentGroupId;
    return this;
  }

  /**
   * Deprecated. Please use shipmentInfo instead. The ID of the shipment.
   * @return value or {@code null} for none
   */
  public java.lang.String getShipmentId() {
    return shipmentId;
  }

  /**
   * Deprecated. Please use shipmentInfo instead. The ID of the shipment.
   * @param shipmentId shipmentId or {@code null} for none
   */
  public OrdersShipLineItemsRequest setShipmentId(java.lang.String shipmentId) {
    this.shipmentId = shipmentId;
    return this;
  }

  /**
   * Shipment information. This field is repeated because a single line item can be shipped in
   * several packages (and have several tracking IDs).
   * @return value or {@code null} for none
   */
  public java.util.List<OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo> getShipmentInfos() {
    return shipmentInfos;
  }

  /**
   * Shipment information. This field is repeated because a single line item can be shipped in
   * several packages (and have several tracking IDs).
   * @param shipmentInfos shipmentInfos or {@code null} for none
   */
  public OrdersShipLineItemsRequest setShipmentInfos(java.util.List<OrdersCustomBatchRequestEntryShipLineItemsShipmentInfo> shipmentInfos) {
    this.shipmentInfos = shipmentInfos;
    return this;
  }

  /**
   * Deprecated. Please use shipmentInfo instead. The tracking id for the shipment.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackingId() {
    return trackingId;
  }

  /**
   * Deprecated. Please use shipmentInfo instead. The tracking id for the shipment.
   * @param trackingId trackingId or {@code null} for none
   */
  public OrdersShipLineItemsRequest setTrackingId(java.lang.String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

  @Override
  public OrdersShipLineItemsRequest set(String fieldName, Object value) {
    return (OrdersShipLineItemsRequest) super.set(fieldName, value);
  }

  @Override
  public OrdersShipLineItemsRequest clone() {
    return (OrdersShipLineItemsRequest) super.clone();
  }

}
