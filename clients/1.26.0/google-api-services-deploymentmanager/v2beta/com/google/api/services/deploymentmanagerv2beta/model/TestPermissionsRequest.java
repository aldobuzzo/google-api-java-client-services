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
 * Model definition for TestPermissionsRequest.
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
public final class TestPermissionsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The set of permissions to check for the 'resource'. Permissions with wildcards (such as '*' or
   * 'storage.*') are not allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> permissions;

  /**
   * The set of permissions to check for the 'resource'. Permissions with wildcards (such as '*' or
   * 'storage.*') are not allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPermissions() {
    return permissions;
  }

  /**
   * The set of permissions to check for the 'resource'. Permissions with wildcards (such as '*' or
   * 'storage.*') are not allowed.
   * @param permissions permissions or {@code null} for none
   */
  public TestPermissionsRequest setPermissions(java.util.List<java.lang.String> permissions) {
    this.permissions = permissions;
    return this;
  }

  @Override
  public TestPermissionsRequest set(String fieldName, Object value) {
    return (TestPermissionsRequest) super.set(fieldName, value);
  }

  @Override
  public TestPermissionsRequest clone() {
    return (TestPermissionsRequest) super.clone();
  }

}
