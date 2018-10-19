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

package com.google.api.services.cloudredis.v1.model;

/**
 * Response for ListInstances.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Memorystore for Redis API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListInstancesResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of Redis instances in the project in the specified location, or across all locations.
   *
   * If the `location_id` in the parent field of the request is "-", all regions available to the
   * project are queried, and the results aggregated. If in such an aggregated query a location is
   * unavailable, a dummy Redis entry is included in the response with the "name" field set to a
   * value of the form projects/{project_id}/locations/{location_id}/instances/- and the "status"
   * field set to ERROR and "status_message" field set to "location not available for
   * ListInstances".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Instance> instances;

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A list of Redis instances in the project in the specified location, or across all locations.
   *
   * If the `location_id` in the parent field of the request is "-", all regions available to the
   * project are queried, and the results aggregated. If in such an aggregated query a location is
   * unavailable, a dummy Redis entry is included in the response with the "name" field set to a
   * value of the form projects/{project_id}/locations/{location_id}/instances/- and the "status"
   * field set to ERROR and "status_message" field set to "location not available for
   * ListInstances".
   * @return value or {@code null} for none
   */
  public java.util.List<Instance> getInstances() {
    return instances;
  }

  /**
   * A list of Redis instances in the project in the specified location, or across all locations.
   *
   * If the `location_id` in the parent field of the request is "-", all regions available to the
   * project are queried, and the results aggregated. If in such an aggregated query a location is
   * unavailable, a dummy Redis entry is included in the response with the "name" field set to a
   * value of the form projects/{project_id}/locations/{location_id}/instances/- and the "status"
   * field set to ERROR and "status_message" field set to "location not available for
   * ListInstances".
   * @param instances instances or {@code null} for none
   */
  public ListInstancesResponse setInstances(java.util.List<Instance> instances) {
    this.instances = instances;
    return this;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token to retrieve the next page of results, or empty if there are no more results in the list.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListInstancesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListInstancesResponse set(String fieldName, Object value) {
    return (ListInstancesResponse) super.set(fieldName, value);
  }

  @Override
  public ListInstancesResponse clone() {
    return (ListInstancesResponse) super.clone();
  }

}
