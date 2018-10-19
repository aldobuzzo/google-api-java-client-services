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

package com.google.api.services.dialogflow.v2.model;

/**
 * Represents a context.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowV2Context extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The number of conversational query requests after which the context expires. If set
   * to `0` (the default) the context expires immediately. Contexts expire automatically after 20
   * minutes even if there are no matching queries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer lifespanCount;

  /**
   * Required. The unique identifier of the context. Format: `projects//agent/sessions//contexts/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The collection of parameters associated with this context. Refer to [this
   * doc](https://dialogflow.com/docs/actions-and-parameters) for syntax.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> parameters;

  /**
   * Optional. The number of conversational query requests after which the context expires. If set
   * to `0` (the default) the context expires immediately. Contexts expire automatically after 20
   * minutes even if there are no matching queries.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLifespanCount() {
    return lifespanCount;
  }

  /**
   * Optional. The number of conversational query requests after which the context expires. If set
   * to `0` (the default) the context expires immediately. Contexts expire automatically after 20
   * minutes even if there are no matching queries.
   * @param lifespanCount lifespanCount or {@code null} for none
   */
  public GoogleCloudDialogflowV2Context setLifespanCount(java.lang.Integer lifespanCount) {
    this.lifespanCount = lifespanCount;
    return this;
  }

  /**
   * Required. The unique identifier of the context. Format: `projects//agent/sessions//contexts/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The unique identifier of the context. Format: `projects//agent/sessions//contexts/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowV2Context setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The collection of parameters associated with this context. Refer to [this
   * doc](https://dialogflow.com/docs/actions-and-parameters) for syntax.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParameters() {
    return parameters;
  }

  /**
   * Optional. The collection of parameters associated with this context. Refer to [this
   * doc](https://dialogflow.com/docs/actions-and-parameters) for syntax.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudDialogflowV2Context setParameters(java.util.Map<String, java.lang.Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  @Override
  public GoogleCloudDialogflowV2Context set(String fieldName, Object value) {
    return (GoogleCloudDialogflowV2Context) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowV2Context clone() {
    return (GoogleCloudDialogflowV2Context) super.clone();
  }

}
