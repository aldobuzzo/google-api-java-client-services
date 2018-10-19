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

package com.google.api.services.fusiontables.model;

/**
 * Specifies the identifier, name, and type of a task in a table.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fusion Tables API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Task extends com.google.api.client.json.GenericJson {

  /**
   * Type of the resource. This is always "fusiontables#task".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * An indication of task progress.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String progress;

  /**
   * false while the table is busy with some other task. true if this background task is currently
   * running.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean started;

  /**
   * Identifier for the task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long taskId;

  /**
   * Type of background task. One of  DELETE_ROWS Deletes one or more rows from the table. ADD_ROWS
   * "Adds one or more rows to a table. Includes importing data into a new table and importing more
   * rows into an existing table. ADD_COLUMN Adds a new column to the table. CHANGE_TYPE Changes the
   * type of a column.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Type of the resource. This is always "fusiontables#task".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of the resource. This is always "fusiontables#task".
   * @param kind kind or {@code null} for none
   */
  public Task setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * An indication of task progress.
   * @return value or {@code null} for none
   */
  public java.lang.String getProgress() {
    return progress;
  }

  /**
   * An indication of task progress.
   * @param progress progress or {@code null} for none
   */
  public Task setProgress(java.lang.String progress) {
    this.progress = progress;
    return this;
  }

  /**
   * false while the table is busy with some other task. true if this background task is currently
   * running.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStarted() {
    return started;
  }

  /**
   * false while the table is busy with some other task. true if this background task is currently
   * running.
   * @param started started or {@code null} for none
   */
  public Task setStarted(java.lang.Boolean started) {
    this.started = started;
    return this;
  }

  /**
   * Identifier for the task.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTaskId() {
    return taskId;
  }

  /**
   * Identifier for the task.
   * @param taskId taskId or {@code null} for none
   */
  public Task setTaskId(java.lang.Long taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Type of background task. One of  DELETE_ROWS Deletes one or more rows from the table. ADD_ROWS
   * "Adds one or more rows to a table. Includes importing data into a new table and importing more
   * rows into an existing table. ADD_COLUMN Adds a new column to the table. CHANGE_TYPE Changes the
   * type of a column.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of background task. One of  DELETE_ROWS Deletes one or more rows from the table. ADD_ROWS
   * "Adds one or more rows to a table. Includes importing data into a new table and importing more
   * rows into an existing table. ADD_COLUMN Adds a new column to the table. CHANGE_TYPE Changes the
   * type of a column.
   * @param type type or {@code null} for none
   */
  public Task setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Task set(String fieldName, Object value) {
    return (Task) super.set(fieldName, value);
  }

  @Override
  public Task clone() {
    return (Task) super.clone();
  }

}
