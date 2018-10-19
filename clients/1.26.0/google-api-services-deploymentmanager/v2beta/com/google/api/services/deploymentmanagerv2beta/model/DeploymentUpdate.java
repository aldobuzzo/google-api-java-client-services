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

package com.google.api.services.deploymentmanagerv2beta.model;

/**
 * Model definition for DeploymentUpdate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager API V2Beta Methods.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeploymentUpdate extends com.google.api.client.json.GenericJson {

  /**
   * Output only. An optional user-provided description of the deployment after the current update
   * has been applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Output only. Map of labels; provided by the client when the resource is created or updated.
   * Specifically: Label keys must be between 1 and 63 characters long and must conform to the
   * following regular expression: [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
   * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeploymentUpdateLabelEntry> labels;

  /**
   * Output only. URL of the manifest representing the update configuration of this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manifest;

  /**
   * Output only. An optional user-provided description of the deployment after the current update
   * has been applied.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Output only. An optional user-provided description of the deployment after the current update
   * has been applied.
   * @param description description or {@code null} for none
   */
  public DeploymentUpdate setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Output only. Map of labels; provided by the client when the resource is created or updated.
   * Specifically: Label keys must be between 1 and 63 characters long and must conform to the
   * following regular expression: [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
   * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?
   * @return value or {@code null} for none
   */
  public java.util.List<DeploymentUpdateLabelEntry> getLabels() {
    return labels;
  }

  /**
   * Output only. Map of labels; provided by the client when the resource is created or updated.
   * Specifically: Label keys must be between 1 and 63 characters long and must conform to the
   * following regular expression: [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63
   * characters long and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?
   * @param labels labels or {@code null} for none
   */
  public DeploymentUpdate setLabels(java.util.List<DeploymentUpdateLabelEntry> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. URL of the manifest representing the update configuration of this deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getManifest() {
    return manifest;
  }

  /**
   * Output only. URL of the manifest representing the update configuration of this deployment.
   * @param manifest manifest or {@code null} for none
   */
  public DeploymentUpdate setManifest(java.lang.String manifest) {
    this.manifest = manifest;
    return this;
  }

  @Override
  public DeploymentUpdate set(String fieldName, Object value) {
    return (DeploymentUpdate) super.set(fieldName, value);
  }

  @Override
  public DeploymentUpdate clone() {
    return (DeploymentUpdate) super.clone();
  }

}
