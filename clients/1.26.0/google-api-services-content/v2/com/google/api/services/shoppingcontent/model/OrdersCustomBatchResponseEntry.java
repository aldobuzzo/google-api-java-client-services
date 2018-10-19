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
 * Model definition for OrdersCustomBatchResponseEntry.
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
public final class OrdersCustomBatchResponseEntry extends com.google.api.client.json.GenericJson {

  /**
   * The ID of the request entry this entry responds to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long batchId;

  /**
   * A list of errors defined if and only if the request failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Errors errors;

  /**
   * The status of the execution. Only defined if - the request was successful; and  - the method is
   * not get, getByMerchantOrderId, or one of the test methods.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionStatus;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#ordersCustomBatchResponseEntry".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The retrieved order. Only defined if the method is get and if the request was successful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Order order;

  /**
   * The ID of the request entry this entry responds to.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBatchId() {
    return batchId;
  }

  /**
   * The ID of the request entry this entry responds to.
   * @param batchId batchId or {@code null} for none
   */
  public OrdersCustomBatchResponseEntry setBatchId(java.lang.Long batchId) {
    this.batchId = batchId;
    return this;
  }

  /**
   * A list of errors defined if and only if the request failed.
   * @return value or {@code null} for none
   */
  public Errors getErrors() {
    return errors;
  }

  /**
   * A list of errors defined if and only if the request failed.
   * @param errors errors or {@code null} for none
   */
  public OrdersCustomBatchResponseEntry setErrors(Errors errors) {
    this.errors = errors;
    return this;
  }

  /**
   * The status of the execution. Only defined if - the request was successful; and  - the method is
   * not get, getByMerchantOrderId, or one of the test methods.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionStatus() {
    return executionStatus;
  }

  /**
   * The status of the execution. Only defined if - the request was successful; and  - the method is
   * not get, getByMerchantOrderId, or one of the test methods.
   * @param executionStatus executionStatus or {@code null} for none
   */
  public OrdersCustomBatchResponseEntry setExecutionStatus(java.lang.String executionStatus) {
    this.executionStatus = executionStatus;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#ordersCustomBatchResponseEntry".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "content#ordersCustomBatchResponseEntry".
   * @param kind kind or {@code null} for none
   */
  public OrdersCustomBatchResponseEntry setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The retrieved order. Only defined if the method is get and if the request was successful.
   * @return value or {@code null} for none
   */
  public Order getOrder() {
    return order;
  }

  /**
   * The retrieved order. Only defined if the method is get and if the request was successful.
   * @param order order or {@code null} for none
   */
  public OrdersCustomBatchResponseEntry setOrder(Order order) {
    this.order = order;
    return this;
  }

  @Override
  public OrdersCustomBatchResponseEntry set(String fieldName, Object value) {
    return (OrdersCustomBatchResponseEntry) super.set(fieldName, value);
  }

  @Override
  public OrdersCustomBatchResponseEntry clone() {
    return (OrdersCustomBatchResponseEntry) super.clone();
  }

}
