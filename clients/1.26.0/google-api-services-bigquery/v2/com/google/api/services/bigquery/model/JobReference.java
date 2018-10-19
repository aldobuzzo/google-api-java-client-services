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

package com.google.api.services.bigquery.model;

/**
 * Model definition for JobReference.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobReference extends com.google.api.client.json.GenericJson {

  /**
   * [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), or dashes (-). The maximum length is 1,024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * The geographic location of the job. Required except for US and EU. See details at
   * https://cloud.google.com/bigquery/docs/dataset-locations#specifying_your_location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * [Required] The ID of the project containing this job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), or dashes (-). The maximum length is 1,024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * [Required] The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), or dashes (-). The maximum length is 1,024 characters.
   * @param jobId jobId or {@code null} for none
   */
  public JobReference setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * The geographic location of the job. Required except for US and EU. See details at
   * https://cloud.google.com/bigquery/docs/dataset-locations#specifying_your_location.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The geographic location of the job. Required except for US and EU. See details at
   * https://cloud.google.com/bigquery/docs/dataset-locations#specifying_your_location.
   * @param location location or {@code null} for none
   */
  public JobReference setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * [Required] The ID of the project containing this job.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * [Required] The ID of the project containing this job.
   * @param projectId projectId or {@code null} for none
   */
  public JobReference setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public JobReference set(String fieldName, Object value) {
    return (JobReference) super.set(fieldName, value);
  }

  @Override
  public JobReference clone() {
    return (JobReference) super.clone();
  }

}
