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

package com.google.api.services.dialogflow.v2beta1.model;

/**
 * Represents intent parameters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2IntentParameter extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The default value to use when the `value` yields an empty result. Default values can
   * be extracted from contexts by using the following syntax: `#context_name.parameter_name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String defaultValue;

  /**
   * Required. The name of the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. The name of the entity type, prefixed with `@`, that describes values of the
   * parameter. If the parameter is required, this must be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityTypeDisplayName;

  /**
   * Optional. Indicates whether the parameter represents a list of values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isList;

  /**
   * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be
   * completed without collecting the parameter value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean mandatory;

  /**
   * The unique identifier of this parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The collection of prompts that the agent can present to the user in order to collect
   * value for the parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> prompts;

  /**
   * Optional. The definition of the parameter value. It can be: - a constant string, - a parameter
   * value defined as `$parameter_name`, - an original parameter value defined as
   * `$parameter_name.original`, - a parameter value from some context defined as
   * `#context_name.parameter_name`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Optional. The default value to use when the `value` yields an empty result. Default values can
   * be extracted from contexts by using the following syntax: `#context_name.parameter_name`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDefaultValue() {
    return defaultValue;
  }

  /**
   * Optional. The default value to use when the `value` yields an empty result. Default values can
   * be extracted from contexts by using the following syntax: `#context_name.parameter_name`.
   * @param defaultValue defaultValue or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentParameter setDefaultValue(java.lang.String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * Required. The name of the parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The name of the parameter.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentParameter setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. The name of the entity type, prefixed with `@`, that describes values of the
   * parameter. If the parameter is required, this must be provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityTypeDisplayName() {
    return entityTypeDisplayName;
  }

  /**
   * Optional. The name of the entity type, prefixed with `@`, that describes values of the
   * parameter. If the parameter is required, this must be provided.
   * @param entityTypeDisplayName entityTypeDisplayName or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentParameter setEntityTypeDisplayName(java.lang.String entityTypeDisplayName) {
    this.entityTypeDisplayName = entityTypeDisplayName;
    return this;
  }

  /**
   * Optional. Indicates whether the parameter represents a list of values.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsList() {
    return isList;
  }

  /**
   * Optional. Indicates whether the parameter represents a list of values.
   * @param isList isList or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentParameter setIsList(java.lang.Boolean isList) {
    this.isList = isList;
    return this;
  }

  /**
   * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be
   * completed without collecting the parameter value.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getMandatory() {
    return mandatory;
  }

  /**
   * Optional. Indicates whether the parameter is required. That is, whether the intent cannot be
   * completed without collecting the parameter value.
   * @param mandatory mandatory or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentParameter setMandatory(java.lang.Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

  /**
   * The unique identifier of this parameter.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier of this parameter.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentParameter setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The collection of prompts that the agent can present to the user in order to collect
   * value for the parameter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrompts() {
    return prompts;
  }

  /**
   * Optional. The collection of prompts that the agent can present to the user in order to collect
   * value for the parameter.
   * @param prompts prompts or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentParameter setPrompts(java.util.List<java.lang.String> prompts) {
    this.prompts = prompts;
    return this;
  }

  /**
   * Optional. The definition of the parameter value. It can be: - a constant string, - a parameter
   * value defined as `$parameter_name`, - an original parameter value defined as
   * `$parameter_name.original`, - a parameter value from some context defined as
   * `#context_name.parameter_name`.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * Optional. The definition of the parameter value. It can be: - a constant string, - a parameter
   * value defined as `$parameter_name`, - an original parameter value defined as
   * `$parameter_name.original`, - a parameter value from some context defined as
   * `#context_name.parameter_name`.
   * @param value value or {@code null} for none
   */
  public GoogleCloudDialogflowV2IntentParameter setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2IntentParameter set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2IntentParameter) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2IntentParameter clone() {
    return (GoogleCloudDialogflowV2IntentParameter) super.clone();
  }

}
