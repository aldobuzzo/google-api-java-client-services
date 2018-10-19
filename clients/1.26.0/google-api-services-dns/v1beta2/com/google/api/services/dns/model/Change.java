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

package com.google.api.services.dns.model;

/**
 * An atomic update to a collection of ResourceRecordSets.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Change extends com.google.api.client.json.GenericJson {

  /**
   * Which ResourceRecordSets to add?
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceRecordSet> additions;

  /**
   * Which ResourceRecordSets to remove? Must match existing data exactly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceRecordSet> deletions;

  /**
   * Unique identifier for the resource; defined by the server (output only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * If the DNS queries for the zone will be served.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isServing;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#change".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The time that this operation was started by the server (output only). This is in RFC3339 text
   * format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTime;

  /**
   * Status of the operation (output only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Which ResourceRecordSets to add?
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceRecordSet> getAdditions() {
    return additions;
  }

  /**
   * Which ResourceRecordSets to add?
   * @param additions additions or {@code null} for none
   */
  public Change setAdditions(java.util.List<ResourceRecordSet> additions) {
    this.additions = additions;
    return this;
  }

  /**
   * Which ResourceRecordSets to remove? Must match existing data exactly.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceRecordSet> getDeletions() {
    return deletions;
  }

  /**
   * Which ResourceRecordSets to remove? Must match existing data exactly.
   * @param deletions deletions or {@code null} for none
   */
  public Change setDeletions(java.util.List<ResourceRecordSet> deletions) {
    this.deletions = deletions;
    return this;
  }

  /**
   * Unique identifier for the resource; defined by the server (output only).
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier for the resource; defined by the server (output only).
   * @param id id or {@code null} for none
   */
  public Change setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * If the DNS queries for the zone will be served.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsServing() {
    return isServing;
  }

  /**
   * If the DNS queries for the zone will be served.
   * @param isServing isServing or {@code null} for none
   */
  public Change setIsServing(java.lang.Boolean isServing) {
    this.isServing = isServing;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#change".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#change".
   * @param kind kind or {@code null} for none
   */
  public Change setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The time that this operation was started by the server (output only). This is in RFC3339 text
   * format.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTime() {
    return startTime;
  }

  /**
   * The time that this operation was started by the server (output only). This is in RFC3339 text
   * format.
   * @param startTime startTime or {@code null} for none
   */
  public Change setStartTime(java.lang.String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Status of the operation (output only).
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the operation (output only).
   * @param status status or {@code null} for none
   */
  public Change setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public Change set(String fieldName, Object value) {
    return (Change) super.set(fieldName, value);
  }

  @Override
  public Change clone() {
    return (Change) super.clone();
  }

}
