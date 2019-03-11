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

package com.google.api.services.jobs.v3p1beta1.model;

/**
 * An event issued when an end user interacts with the application that implements Cloud Talent
 * Solution. Providing this information improves the quality of search and recommendation for the
 * API clients, enabling the service to perform optimally. The number of events sent must be
 * consistent with other calls, such as job searches, issued to the service by the client.
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
public final class ClientEvent extends com.google.api.client.json.GenericJson {

  /**
   * Required.
   *
   * The timestamp of the event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required.
   *
   * A unique identifier, generated by the client application. This `event_id` is used to establish
   * the relationship between different events (see parent_event_id).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventId;

  /**
   * Optional.
   *
   * Extra information about this event. Used for storing information with no matching field in
   * event payload, for example, user application specific context or details.
   *
   * At most 20 keys are supported. The maximum total size of all keys and values is 2 KB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> extraInfo;

  /**
   * A event issued when a job seeker interacts with the application that implements Cloud Talent
   * Solution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobEvent jobEvent;

  /**
   * Optional.
   *
   * The event_id of an event that resulted in the current event. For example, a Job view event
   * usually follows a parent impression event: A job seeker first does a search where a list of
   * jobs appears (impression). The job seeker then selects a result and views the description of a
   * particular job (Job view).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentEventId;

  /**
   * Required.
   *
   * A unique ID generated in the API responses. It can be found in ResponseMetadata.request_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestId;

  /**
   * Required.
   *
   * The timestamp of the event.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Required.
   *
   * The timestamp of the event.
   * @param createTime createTime or {@code null} for none
   */
  public ClientEvent setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required.
   *
   * A unique identifier, generated by the client application. This `event_id` is used to establish
   * the relationship between different events (see parent_event_id).
   * @return value or {@code null} for none
   */
  public java.lang.String getEventId() {
    return eventId;
  }

  /**
   * Required.
   *
   * A unique identifier, generated by the client application. This `event_id` is used to establish
   * the relationship between different events (see parent_event_id).
   * @param eventId eventId or {@code null} for none
   */
  public ClientEvent setEventId(java.lang.String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Optional.
   *
   * Extra information about this event. Used for storing information with no matching field in
   * event payload, for example, user application specific context or details.
   *
   * At most 20 keys are supported. The maximum total size of all keys and values is 2 KB.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getExtraInfo() {
    return extraInfo;
  }

  /**
   * Optional.
   *
   * Extra information about this event. Used for storing information with no matching field in
   * event payload, for example, user application specific context or details.
   *
   * At most 20 keys are supported. The maximum total size of all keys and values is 2 KB.
   * @param extraInfo extraInfo or {@code null} for none
   */
  public ClientEvent setExtraInfo(java.util.Map<String, java.lang.String> extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

  /**
   * A event issued when a job seeker interacts with the application that implements Cloud Talent
   * Solution.
   * @return value or {@code null} for none
   */
  public JobEvent getJobEvent() {
    return jobEvent;
  }

  /**
   * A event issued when a job seeker interacts with the application that implements Cloud Talent
   * Solution.
   * @param jobEvent jobEvent or {@code null} for none
   */
  public ClientEvent setJobEvent(JobEvent jobEvent) {
    this.jobEvent = jobEvent;
    return this;
  }

  /**
   * Optional.
   *
   * The event_id of an event that resulted in the current event. For example, a Job view event
   * usually follows a parent impression event: A job seeker first does a search where a list of
   * jobs appears (impression). The job seeker then selects a result and views the description of a
   * particular job (Job view).
   * @return value or {@code null} for none
   */
  public java.lang.String getParentEventId() {
    return parentEventId;
  }

  /**
   * Optional.
   *
   * The event_id of an event that resulted in the current event. For example, a Job view event
   * usually follows a parent impression event: A job seeker first does a search where a list of
   * jobs appears (impression). The job seeker then selects a result and views the description of a
   * particular job (Job view).
   * @param parentEventId parentEventId or {@code null} for none
   */
  public ClientEvent setParentEventId(java.lang.String parentEventId) {
    this.parentEventId = parentEventId;
    return this;
  }

  /**
   * Required.
   *
   * A unique ID generated in the API responses. It can be found in ResponseMetadata.request_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestId() {
    return requestId;
  }

  /**
   * Required.
   *
   * A unique ID generated in the API responses. It can be found in ResponseMetadata.request_id.
   * @param requestId requestId or {@code null} for none
   */
  public ClientEvent setRequestId(java.lang.String requestId) {
    this.requestId = requestId;
    return this;
  }

  @Override
  public ClientEvent set(String fieldName, Object value) {
    return (ClientEvent) super.set(fieldName, value);
  }

  @Override
  public ClientEvent clone() {
    return (ClientEvent) super.clone();
  }

}
