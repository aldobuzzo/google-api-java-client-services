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

package com.google.api.services.sqladmin.model;

/**
 * Maintenance window. This specifies when a v2 Cloud SQL instance should preferably be restarted
 * for system maintenance puruposes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MaintenanceWindow extends com.google.api.client.json.GenericJson {

  /**
   * day of week (1-7), starting on Monday.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer day;

  /**
   * hour of day - 0 to 23.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer hour;

  /**
   * This is always sql#maintenanceWindow.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Maintenance timing setting: canary (Earlier) or stable (Later).  Learn more.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updateTrack;

  /**
   * day of week (1-7), starting on Monday.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDay() {
    return day;
  }

  /**
   * day of week (1-7), starting on Monday.
   * @param day day or {@code null} for none
   */
  public MaintenanceWindow setDay(java.lang.Integer day) {
    this.day = day;
    return this;
  }

  /**
   * hour of day - 0 to 23.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHour() {
    return hour;
  }

  /**
   * hour of day - 0 to 23.
   * @param hour hour or {@code null} for none
   */
  public MaintenanceWindow setHour(java.lang.Integer hour) {
    this.hour = hour;
    return this;
  }

  /**
   * This is always sql#maintenanceWindow.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#maintenanceWindow.
   * @param kind kind or {@code null} for none
   */
  public MaintenanceWindow setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Maintenance timing setting: canary (Earlier) or stable (Later).  Learn more.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdateTrack() {
    return updateTrack;
  }

  /**
   * Maintenance timing setting: canary (Earlier) or stable (Later).  Learn more.
   * @param updateTrack updateTrack or {@code null} for none
   */
  public MaintenanceWindow setUpdateTrack(java.lang.String updateTrack) {
    this.updateTrack = updateTrack;
    return this;
  }

  @Override
  public MaintenanceWindow set(String fieldName, Object value) {
    return (MaintenanceWindow) super.set(fieldName, value);
  }

  @Override
  public MaintenanceWindow clone() {
    return (MaintenanceWindow) super.clone();
  }

}
