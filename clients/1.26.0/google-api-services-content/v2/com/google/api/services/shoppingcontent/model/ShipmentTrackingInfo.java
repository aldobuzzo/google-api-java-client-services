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
 * Model definition for ShipmentTrackingInfo.
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
public final class ShipmentTrackingInfo extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String carrier;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackingNumber;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCarrier() {
    return carrier;
  }

  /**
   * @param carrier carrier or {@code null} for none
   */
  public ShipmentTrackingInfo setCarrier(java.lang.String carrier) {
    this.carrier = carrier;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackingNumber() {
    return trackingNumber;
  }

  /**
   * @param trackingNumber trackingNumber or {@code null} for none
   */
  public ShipmentTrackingInfo setTrackingNumber(java.lang.String trackingNumber) {
    this.trackingNumber = trackingNumber;
    return this;
  }

  @Override
  public ShipmentTrackingInfo set(String fieldName, Object value) {
    return (ShipmentTrackingInfo) super.set(fieldName, value);
  }

  @Override
  public ShipmentTrackingInfo clone() {
    return (ShipmentTrackingInfo) super.clone();
  }

}
