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

package com.google.api.services.cloudsourcerepositories.v1.model;

/**
 * Provides the configuration for logging a type of permissions. Example:
 *
 *     {       "audit_log_configs": [         {           "log_type": "DATA_READ",
 * "exempted_members": [             "user:foo@gmail.com"           ]         },         {
 * "log_type": "DATA_WRITE",         }       ]     }
 *
 * This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting foo@gmail.com from DATA_READ
 * logging.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Source Repositories API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AuditLogConfig extends com.google.api.client.json.GenericJson {

  /**
   * Specifies the identities that do not cause logging for this type of permission. Follows the
   * same format of Binding.members.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> exemptedMembers;

  /**
   * The log type that this config enables.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logType;

  /**
   * Specifies the identities that do not cause logging for this type of permission. Follows the
   * same format of Binding.members.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExemptedMembers() {
    return exemptedMembers;
  }

  /**
   * Specifies the identities that do not cause logging for this type of permission. Follows the
   * same format of Binding.members.
   * @param exemptedMembers exemptedMembers or {@code null} for none
   */
  public AuditLogConfig setExemptedMembers(java.util.List<java.lang.String> exemptedMembers) {
    this.exemptedMembers = exemptedMembers;
    return this;
  }

  /**
   * The log type that this config enables.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogType() {
    return logType;
  }

  /**
   * The log type that this config enables.
   * @param logType logType or {@code null} for none
   */
  public AuditLogConfig setLogType(java.lang.String logType) {
    this.logType = logType;
    return this;
  }

  @Override
  public AuditLogConfig set(String fieldName, Object value) {
    return (AuditLogConfig) super.set(fieldName, value);
  }

  @Override
  public AuditLogConfig clone() {
    return (AuditLogConfig) super.clone();
  }

}
