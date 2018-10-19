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

package com.google.api.services.youtubeanalytics.v2.model;

/**
 * Describes one specific error.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Analytics API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ErrorProto extends com.google.api.client.json.GenericJson {

  /**
   * Error arguments, to be used when building user-friendly error messages given the error domain
   * and code.  Different error codes require different arguments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> argument;

  /**
   * Error code in the error domain. This should correspond to a value of the enum type whose name
   * is in domain. See the core error domain in error_domain.proto.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Debugging information, which should not be shared externally.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String debugInfo;

  /**
   * Error domain. RoSy services can define their own domain and error codes. This should normally
   * be the name of an enum type, such as: gdata.CoreErrorDomain
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * A short explanation for the error, which can be shared outside Google.
   *
   * Please set domain, code and arguments whenever possible instead of this error message so that
   * external APIs can build safe error messages themselves.
   *
   * External messages built in a RoSy interface will most likely refer to information and concepts
   * that are not available externally and should not be exposed. It is safer if external APIs can
   * understand the errors and decide what the error message should look like.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalErrorMessage;

  /**
   * Location of the error, as specified by the location type.
   *
   * If location_type is PATH, this should be a path to a field that's relative to the request,
   * using FieldPath notation (net/proto2/util/public/field_path.h).
   *
   * Examples:   authenticated_user.gaia_id   resource.address[2].country
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationType;

  /**
   * Error arguments, to be used when building user-friendly error messages given the error domain
   * and code.  Different error codes require different arguments.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArgument() {
    return argument;
  }

  /**
   * Error arguments, to be used when building user-friendly error messages given the error domain
   * and code.  Different error codes require different arguments.
   * @param argument argument or {@code null} for none
   */
  public ErrorProto setArgument(java.util.List<java.lang.String> argument) {
    this.argument = argument;
    return this;
  }

  /**
   * Error code in the error domain. This should correspond to a value of the enum type whose name
   * is in domain. See the core error domain in error_domain.proto.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Error code in the error domain. This should correspond to a value of the enum type whose name
   * is in domain. See the core error domain in error_domain.proto.
   * @param code code or {@code null} for none
   */
  public ErrorProto setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Debugging information, which should not be shared externally.
   * @return value or {@code null} for none
   */
  public java.lang.String getDebugInfo() {
    return debugInfo;
  }

  /**
   * Debugging information, which should not be shared externally.
   * @param debugInfo debugInfo or {@code null} for none
   */
  public ErrorProto setDebugInfo(java.lang.String debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }

  /**
   * Error domain. RoSy services can define their own domain and error codes. This should normally
   * be the name of an enum type, such as: gdata.CoreErrorDomain
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * Error domain. RoSy services can define their own domain and error codes. This should normally
   * be the name of an enum type, such as: gdata.CoreErrorDomain
   * @param domain domain or {@code null} for none
   */
  public ErrorProto setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * A short explanation for the error, which can be shared outside Google.
   *
   * Please set domain, code and arguments whenever possible instead of this error message so that
   * external APIs can build safe error messages themselves.
   *
   * External messages built in a RoSy interface will most likely refer to information and concepts
   * that are not available externally and should not be exposed. It is safer if external APIs can
   * understand the errors and decide what the error message should look like.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalErrorMessage() {
    return externalErrorMessage;
  }

  /**
   * A short explanation for the error, which can be shared outside Google.
   *
   * Please set domain, code and arguments whenever possible instead of this error message so that
   * external APIs can build safe error messages themselves.
   *
   * External messages built in a RoSy interface will most likely refer to information and concepts
   * that are not available externally and should not be exposed. It is safer if external APIs can
   * understand the errors and decide what the error message should look like.
   * @param externalErrorMessage externalErrorMessage or {@code null} for none
   */
  public ErrorProto setExternalErrorMessage(java.lang.String externalErrorMessage) {
    this.externalErrorMessage = externalErrorMessage;
    return this;
  }

  /**
   * Location of the error, as specified by the location type.
   *
   * If location_type is PATH, this should be a path to a field that's relative to the request,
   * using FieldPath notation (net/proto2/util/public/field_path.h).
   *
   * Examples:   authenticated_user.gaia_id   resource.address[2].country
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Location of the error, as specified by the location type.
   *
   * If location_type is PATH, this should be a path to a field that's relative to the request,
   * using FieldPath notation (net/proto2/util/public/field_path.h).
   *
   * Examples:   authenticated_user.gaia_id   resource.address[2].country
   * @param location location or {@code null} for none
   */
  public ErrorProto setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationType() {
    return locationType;
  }

  /**
   * @param locationType locationType or {@code null} for none
   */
  public ErrorProto setLocationType(java.lang.String locationType) {
    this.locationType = locationType;
    return this;
  }

  @Override
  public ErrorProto set(String fieldName, Object value) {
    return (ErrorProto) super.set(fieldName, value);
  }

  @Override
  public ErrorProto clone() {
    return (ErrorProto) super.clone();
  }

}
