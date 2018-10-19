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

package com.google.api.services.cloudtalentsolution.v3.model;

/**
 * Output only.
 *
 * Derived details about the job posting.
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
public final class JobDerivedInfo extends com.google.api.client.json.GenericJson {

  /**
   * Job categories derived from Job.title and Job.description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> jobCategories;

  /**
   * Structured locations of the job, resolved from Job.addresses.
   *
   * locations are exactly matched to Job.addresses in the same order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Location> locations;

  static {
    // hack to force ProGuard to consider Location used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Location.class);
  }

  /**
   * Job categories derived from Job.title and Job.description.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getJobCategories() {
    return jobCategories;
  }

  /**
   * Job categories derived from Job.title and Job.description.
   * @param jobCategories jobCategories or {@code null} for none
   */
  public JobDerivedInfo setJobCategories(java.util.List<java.lang.String> jobCategories) {
    this.jobCategories = jobCategories;
    return this;
  }

  /**
   * Structured locations of the job, resolved from Job.addresses.
   *
   * locations are exactly matched to Job.addresses in the same order.
   * @return value or {@code null} for none
   */
  public java.util.List<Location> getLocations() {
    return locations;
  }

  /**
   * Structured locations of the job, resolved from Job.addresses.
   *
   * locations are exactly matched to Job.addresses in the same order.
   * @param locations locations or {@code null} for none
   */
  public JobDerivedInfo setLocations(java.util.List<Location> locations) {
    this.locations = locations;
    return this;
  }

  @Override
  public JobDerivedInfo set(String fieldName, Object value) {
    return (JobDerivedInfo) super.set(fieldName, value);
  }

  @Override
  public JobDerivedInfo clone() {
    return (JobDerivedInfo) super.clone();
  }

}
