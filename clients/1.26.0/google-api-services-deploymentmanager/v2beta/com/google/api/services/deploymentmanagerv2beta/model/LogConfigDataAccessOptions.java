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
 * Write a Data Access (Gin) log
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
public final class LogConfigDataAccessOptions extends com.google.api.client.json.GenericJson {

  /**
   * Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant only
   * in the LocalIAM implementation, for now.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logMode;

  /**
   * Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant only
   * in the LocalIAM implementation, for now.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogMode() {
    return logMode;
  }

  /**
   * Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant only
   * in the LocalIAM implementation, for now.
   * @param logMode logMode or {@code null} for none
   */
  public LogConfigDataAccessOptions setLogMode(java.lang.String logMode) {
    this.logMode = logMode;
    return this;
  }

  @Override
  public LogConfigDataAccessOptions set(String fieldName, Object value) {
    return (LogConfigDataAccessOptions) super.set(fieldName, value);
  }

  @Override
  public LogConfigDataAccessOptions clone() {
    return (LogConfigDataAccessOptions) super.clone();
  }

}
