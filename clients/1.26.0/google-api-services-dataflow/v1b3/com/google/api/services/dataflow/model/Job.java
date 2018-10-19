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

package com.google.api.services.dataflow.model;

/**
 * Defines a job to be run by the Cloud Dataflow service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dataflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Job extends com.google.api.client.json.GenericJson {

  /**
   * The client's unique identifier of the job, re-used across retried attempts. If this field is
   * set, the service will ensure its uniqueness. The request to create a job will fail if the
   * service has knowledge of a previously submitted job with the same client's ID and job name. The
   * caller may use this field to ensure idempotence of job creation across retried attempts to
   * create a job. By default, the field is empty and, in that case, the service ignores it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientRequestId;

  /**
   * The timestamp when the job was initially created. Immutable and set by the Cloud Dataflow
   * service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The current state of the job.
   *
   * Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise specified.
   *
   * A job in the `JOB_STATE_RUNNING` state may asynchronously enter a terminal state. After a job
   * has reached a terminal state, no further state updates may be made.
   *
   * This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currentState;

  /**
   * The timestamp associated with the current state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String currentStateTime;

  /**
   * The environment for the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Environment environment;

  /**
   * Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobExecutionInfo executionInfo;

  /**
   * The unique ID of this job.
   *
   * This field is set by the Cloud Dataflow service when the Job is created, and is immutable for
   * the life of the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * This field is populated by the Dataflow service to support filtering jobs by the metadata
   * values provided here. Populated for ListJobs and all GetJob views SUMMARY and higher.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobMetadata jobMetadata;

  /**
   * User-defined labels for this job.
   *
   * The labels map can contain no more than 64 entries.  Entries of the labels map are UTF8 strings
   * that comply with the following restrictions:
   *
   * * Keys must conform to regexp:  \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128
   * bytes in size.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The location that contains this job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The user-specified Cloud Dataflow job name.
   *
   * Only one Job with a given name may exist in a project at any given time. If a caller attempts
   * to create a Job with the same name as an already-existing Job, the attempt returns the existing
   * Job.
   *
   * The name must match the regular expression `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Preliminary field: The format of this data may change at any time. A description of the user
   * pipeline and stages through which it is executed. Created by Cloud Dataflow service.  Only
   * retrieved with JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PipelineDescription pipelineDescription;

  /**
   * The ID of the Cloud Platform project that the job belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * If this job is an update of an existing job, this field is the job ID of the job it replaced.
   *
   * When sending a `CreateJobRequest`, you can update a job by specifying it here. The job named
   * here is stopped, and its intermediate state is transferred to this job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replaceJobId;

  /**
   * If another job is an update of this job (and thus, this job is in `JOB_STATE_UPDATED`), this
   * field contains the ID of that job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String replacedByJobId;

  /**
   * The job's requested state.
   *
   * `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and `JOB_STATE_RUNNING`
   * states, by setting requested_state.  `UpdateJob` may also be used to directly set a job's
   * requested state to `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the job
   * if it has not already reached a terminal state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestedState;

  /**
   * This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExecutionStageState> stageStates;

  static {
    // hack to force ProGuard to consider ExecutionStageState used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ExecutionStageState.class);
  }

  /**
   * The top-level steps that constitute the entire job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Step> steps;

  static {
    // hack to force ProGuard to consider Step used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Step.class);
  }

  /**
   * A set of files the system should be aware of that are used for temporary storage. These
   * temporary files will be removed on job completion. No duplicates are allowed. No file patterns
   * are supported.
   *
   * The supported files are:
   *
   * Google Cloud Storage:
   *
   *    storage.googleapis.com/{bucket}/{object}    bucket.storage.googleapis.com/{object}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tempFiles;

  /**
   * The map of transform name prefixes of the job to be replaced to the corresponding name prefixes
   * of the new job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> transformNameMapping;

  /**
   * The type of Cloud Dataflow job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The client's unique identifier of the job, re-used across retried attempts. If this field is
   * set, the service will ensure its uniqueness. The request to create a job will fail if the
   * service has knowledge of a previously submitted job with the same client's ID and job name. The
   * caller may use this field to ensure idempotence of job creation across retried attempts to
   * create a job. By default, the field is empty and, in that case, the service ignores it.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientRequestId() {
    return clientRequestId;
  }

  /**
   * The client's unique identifier of the job, re-used across retried attempts. If this field is
   * set, the service will ensure its uniqueness. The request to create a job will fail if the
   * service has knowledge of a previously submitted job with the same client's ID and job name. The
   * caller may use this field to ensure idempotence of job creation across retried attempts to
   * create a job. By default, the field is empty and, in that case, the service ignores it.
   * @param clientRequestId clientRequestId or {@code null} for none
   */
  public Job setClientRequestId(java.lang.String clientRequestId) {
    this.clientRequestId = clientRequestId;
    return this;
  }

  /**
   * The timestamp when the job was initially created. Immutable and set by the Cloud Dataflow
   * service.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The timestamp when the job was initially created. Immutable and set by the Cloud Dataflow
   * service.
   * @param createTime createTime or {@code null} for none
   */
  public Job setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The current state of the job.
   *
   * Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise specified.
   *
   * A job in the `JOB_STATE_RUNNING` state may asynchronously enter a terminal state. After a job
   * has reached a terminal state, no further state updates may be made.
   *
   * This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrentState() {
    return currentState;
  }

  /**
   * The current state of the job.
   *
   * Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise specified.
   *
   * A job in the `JOB_STATE_RUNNING` state may asynchronously enter a terminal state. After a job
   * has reached a terminal state, no further state updates may be made.
   *
   * This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
   * @param currentState currentState or {@code null} for none
   */
  public Job setCurrentState(java.lang.String currentState) {
    this.currentState = currentState;
    return this;
  }

  /**
   * The timestamp associated with the current state.
   * @return value or {@code null} for none
   */
  public String getCurrentStateTime() {
    return currentStateTime;
  }

  /**
   * The timestamp associated with the current state.
   * @param currentStateTime currentStateTime or {@code null} for none
   */
  public Job setCurrentStateTime(String currentStateTime) {
    this.currentStateTime = currentStateTime;
    return this;
  }

  /**
   * The environment for the job.
   * @return value or {@code null} for none
   */
  public Environment getEnvironment() {
    return environment;
  }

  /**
   * The environment for the job.
   * @param environment environment or {@code null} for none
   */
  public Job setEnvironment(Environment environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Deprecated.
   * @return value or {@code null} for none
   */
  public JobExecutionInfo getExecutionInfo() {
    return executionInfo;
  }

  /**
   * Deprecated.
   * @param executionInfo executionInfo or {@code null} for none
   */
  public Job setExecutionInfo(JobExecutionInfo executionInfo) {
    this.executionInfo = executionInfo;
    return this;
  }

  /**
   * The unique ID of this job.
   *
   * This field is set by the Cloud Dataflow service when the Job is created, and is immutable for
   * the life of the job.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The unique ID of this job.
   *
   * This field is set by the Cloud Dataflow service when the Job is created, and is immutable for
   * the life of the job.
   * @param id id or {@code null} for none
   */
  public Job setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * This field is populated by the Dataflow service to support filtering jobs by the metadata
   * values provided here. Populated for ListJobs and all GetJob views SUMMARY and higher.
   * @return value or {@code null} for none
   */
  public JobMetadata getJobMetadata() {
    return jobMetadata;
  }

  /**
   * This field is populated by the Dataflow service to support filtering jobs by the metadata
   * values provided here. Populated for ListJobs and all GetJob views SUMMARY and higher.
   * @param jobMetadata jobMetadata or {@code null} for none
   */
  public Job setJobMetadata(JobMetadata jobMetadata) {
    this.jobMetadata = jobMetadata;
    return this;
  }

  /**
   * User-defined labels for this job.
   *
   * The labels map can contain no more than 64 entries.  Entries of the labels map are UTF8 strings
   * that comply with the following restrictions:
   *
   * * Keys must conform to regexp:  \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128
   * bytes in size.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User-defined labels for this job.
   *
   * The labels map can contain no more than 64 entries.  Entries of the labels map are UTF8 strings
   * that comply with the following restrictions:
   *
   * * Keys must conform to regexp:  \p{Ll}\p{Lo}{0,62} * Values must conform to regexp:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63} * Both keys and values are additionally constrained to be <= 128
   * bytes in size.
   * @param labels labels or {@code null} for none
   */
  public Job setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The location that contains this job.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * The location that contains this job.
   * @param location location or {@code null} for none
   */
  public Job setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * The user-specified Cloud Dataflow job name.
   *
   * Only one Job with a given name may exist in a project at any given time. If a caller attempts
   * to create a Job with the same name as an already-existing Job, the attempt returns the existing
   * Job.
   *
   * The name must match the regular expression `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The user-specified Cloud Dataflow job name.
   *
   * Only one Job with a given name may exist in a project at any given time. If a caller attempts
   * to create a Job with the same name as an already-existing Job, the attempt returns the existing
   * Job.
   *
   * The name must match the regular expression `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
   * @param name name or {@code null} for none
   */
  public Job setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Preliminary field: The format of this data may change at any time. A description of the user
   * pipeline and stages through which it is executed. Created by Cloud Dataflow service.  Only
   * retrieved with JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
   * @return value or {@code null} for none
   */
  public PipelineDescription getPipelineDescription() {
    return pipelineDescription;
  }

  /**
   * Preliminary field: The format of this data may change at any time. A description of the user
   * pipeline and stages through which it is executed. Created by Cloud Dataflow service.  Only
   * retrieved with JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
   * @param pipelineDescription pipelineDescription or {@code null} for none
   */
  public Job setPipelineDescription(PipelineDescription pipelineDescription) {
    this.pipelineDescription = pipelineDescription;
    return this;
  }

  /**
   * The ID of the Cloud Platform project that the job belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * The ID of the Cloud Platform project that the job belongs to.
   * @param projectId projectId or {@code null} for none
   */
  public Job setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * If this job is an update of an existing job, this field is the job ID of the job it replaced.
   *
   * When sending a `CreateJobRequest`, you can update a job by specifying it here. The job named
   * here is stopped, and its intermediate state is transferred to this job.
   * @return value or {@code null} for none
   */
  public java.lang.String getReplaceJobId() {
    return replaceJobId;
  }

  /**
   * If this job is an update of an existing job, this field is the job ID of the job it replaced.
   *
   * When sending a `CreateJobRequest`, you can update a job by specifying it here. The job named
   * here is stopped, and its intermediate state is transferred to this job.
   * @param replaceJobId replaceJobId or {@code null} for none
   */
  public Job setReplaceJobId(java.lang.String replaceJobId) {
    this.replaceJobId = replaceJobId;
    return this;
  }

  /**
   * If another job is an update of this job (and thus, this job is in `JOB_STATE_UPDATED`), this
   * field contains the ID of that job.
   * @return value or {@code null} for none
   */
  public java.lang.String getReplacedByJobId() {
    return replacedByJobId;
  }

  /**
   * If another job is an update of this job (and thus, this job is in `JOB_STATE_UPDATED`), this
   * field contains the ID of that job.
   * @param replacedByJobId replacedByJobId or {@code null} for none
   */
  public Job setReplacedByJobId(java.lang.String replacedByJobId) {
    this.replacedByJobId = replacedByJobId;
    return this;
  }

  /**
   * The job's requested state.
   *
   * `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and `JOB_STATE_RUNNING`
   * states, by setting requested_state.  `UpdateJob` may also be used to directly set a job's
   * requested state to `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the job
   * if it has not already reached a terminal state.
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestedState() {
    return requestedState;
  }

  /**
   * The job's requested state.
   *
   * `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and `JOB_STATE_RUNNING`
   * states, by setting requested_state.  `UpdateJob` may also be used to directly set a job's
   * requested state to `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the job
   * if it has not already reached a terminal state.
   * @param requestedState requestedState or {@code null} for none
   */
  public Job setRequestedState(java.lang.String requestedState) {
    this.requestedState = requestedState;
    return this;
  }

  /**
   * This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
   * @return value or {@code null} for none
   */
  public java.util.List<ExecutionStageState> getStageStates() {
    return stageStates;
  }

  /**
   * This field may be mutated by the Cloud Dataflow service; callers cannot mutate it.
   * @param stageStates stageStates or {@code null} for none
   */
  public Job setStageStates(java.util.List<ExecutionStageState> stageStates) {
    this.stageStates = stageStates;
    return this;
  }

  /**
   * The top-level steps that constitute the entire job.
   * @return value or {@code null} for none
   */
  public java.util.List<Step> getSteps() {
    return steps;
  }

  /**
   * The top-level steps that constitute the entire job.
   * @param steps steps or {@code null} for none
   */
  public Job setSteps(java.util.List<Step> steps) {
    this.steps = steps;
    return this;
  }

  /**
   * A set of files the system should be aware of that are used for temporary storage. These
   * temporary files will be removed on job completion. No duplicates are allowed. No file patterns
   * are supported.
   *
   * The supported files are:
   *
   * Google Cloud Storage:
   *
   *    storage.googleapis.com/{bucket}/{object}    bucket.storage.googleapis.com/{object}
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTempFiles() {
    return tempFiles;
  }

  /**
   * A set of files the system should be aware of that are used for temporary storage. These
   * temporary files will be removed on job completion. No duplicates are allowed. No file patterns
   * are supported.
   *
   * The supported files are:
   *
   * Google Cloud Storage:
   *
   *    storage.googleapis.com/{bucket}/{object}    bucket.storage.googleapis.com/{object}
   * @param tempFiles tempFiles or {@code null} for none
   */
  public Job setTempFiles(java.util.List<java.lang.String> tempFiles) {
    this.tempFiles = tempFiles;
    return this;
  }

  /**
   * The map of transform name prefixes of the job to be replaced to the corresponding name prefixes
   * of the new job.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getTransformNameMapping() {
    return transformNameMapping;
  }

  /**
   * The map of transform name prefixes of the job to be replaced to the corresponding name prefixes
   * of the new job.
   * @param transformNameMapping transformNameMapping or {@code null} for none
   */
  public Job setTransformNameMapping(java.util.Map<String, java.lang.String> transformNameMapping) {
    this.transformNameMapping = transformNameMapping;
    return this;
  }

  /**
   * The type of Cloud Dataflow job.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of Cloud Dataflow job.
   * @param type type or {@code null} for none
   */
  public Job setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Job set(String fieldName, Object value) {
    return (Job) super.set(fieldName, value);
  }

  @Override
  public Job clone() {
    return (Job) super.clone();
  }

}
