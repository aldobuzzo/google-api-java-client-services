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

package com.google.api.services.servicenetworking.v1beta.model;

/**
 * A backend rule provides configuration for an individual API element.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Networking API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendRule extends com.google.api.client.json.GenericJson {

  /**
   * The address of the API backend.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String address;

  /**
   * The number of seconds to wait for a response from a request.  The default deadline for gRPC is
   * infinite (no deadline) and HTTP requests is 5 seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double deadline;

  /**
   * Minimum deadline in seconds needed for this method. Calls having deadline value lower than this
   * will be rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minDeadline;

  /**
   * Selects the methods to which this rule applies.
   *
   * Refer to selector for syntax details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selector;

  /**
   * The address of the API backend.
   * @return value or {@code null} for none
   */
  public java.lang.String getAddress() {
    return address;
  }

  /**
   * The address of the API backend.
   * @param address address or {@code null} for none
   */
  public BackendRule setAddress(java.lang.String address) {
    this.address = address;
    return this;
  }

  /**
   * The number of seconds to wait for a response from a request.  The default deadline for gRPC is
   * infinite (no deadline) and HTTP requests is 5 seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDeadline() {
    return deadline;
  }

  /**
   * The number of seconds to wait for a response from a request.  The default deadline for gRPC is
   * infinite (no deadline) and HTTP requests is 5 seconds.
   * @param deadline deadline or {@code null} for none
   */
  public BackendRule setDeadline(java.lang.Double deadline) {
    this.deadline = deadline;
    return this;
  }

  /**
   * Minimum deadline in seconds needed for this method. Calls having deadline value lower than this
   * will be rejected.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinDeadline() {
    return minDeadline;
  }

  /**
   * Minimum deadline in seconds needed for this method. Calls having deadline value lower than this
   * will be rejected.
   * @param minDeadline minDeadline or {@code null} for none
   */
  public BackendRule setMinDeadline(java.lang.Double minDeadline) {
    this.minDeadline = minDeadline;
    return this;
  }

  /**
   * Selects the methods to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelector() {
    return selector;
  }

  /**
   * Selects the methods to which this rule applies.
   *
   * Refer to selector for syntax details.
   * @param selector selector or {@code null} for none
   */
  public BackendRule setSelector(java.lang.String selector) {
    this.selector = selector;
    return this;
  }

  @Override
  public BackendRule set(String fieldName, Object value) {
    return (BackendRule) super.set(fieldName, value);
  }

  @Override
  public BackendRule clone() {
    return (BackendRule) super.clone();
  }

}
