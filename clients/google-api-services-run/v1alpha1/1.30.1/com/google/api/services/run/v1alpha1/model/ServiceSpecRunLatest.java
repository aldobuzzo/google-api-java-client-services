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

package com.google.api.services.run.v1alpha1.model;

/**
 * ServiceSpecRunLatest contains the options for always having a route to the latest configuration.
 * See ServiceSpec for more details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceSpecRunLatest extends com.google.api.client.json.GenericJson {

  /**
   * The configuration for this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfigurationSpec configuration;

  /**
   * The configuration for this service.
   * @return value or {@code null} for none
   */
  public ConfigurationSpec getConfiguration() {
    return configuration;
  }

  /**
   * The configuration for this service.
   * @param configuration configuration or {@code null} for none
   */
  public ServiceSpecRunLatest setConfiguration(ConfigurationSpec configuration) {
    this.configuration = configuration;
    return this;
  }

  @Override
  public ServiceSpecRunLatest set(String fieldName, Object value) {
    return (ServiceSpecRunLatest) super.set(fieldName, value);
  }

  @Override
  public ServiceSpecRunLatest clone() {
    return (ServiceSpecRunLatest) super.clone();
  }

}
