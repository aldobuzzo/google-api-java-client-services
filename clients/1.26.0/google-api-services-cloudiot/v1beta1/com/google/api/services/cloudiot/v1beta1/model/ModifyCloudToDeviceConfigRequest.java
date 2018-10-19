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

package com.google.api.services.cloudiot.v1beta1.model;

/**
 * Request for `ModifyCloudToDeviceConfig`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud IoT API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModifyCloudToDeviceConfigRequest extends com.google.api.client.json.GenericJson {

  /**
   * The configuration data for the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceConfigData data;

  /**
   * The version number to update. If this value is zero, it will not check the version number of
   * the server and will always update the current version; otherwise, this update will fail if the
   * version number found on the server does not match this version number. This is used to support
   * multiple simultaneous updates without losing data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long versionToUpdate;

  /**
   * The configuration data for the device.
   * @return value or {@code null} for none
   */
  public DeviceConfigData getData() {
    return data;
  }

  /**
   * The configuration data for the device.
   * @param data data or {@code null} for none
   */
  public ModifyCloudToDeviceConfigRequest setData(DeviceConfigData data) {
    this.data = data;
    return this;
  }

  /**
   * The version number to update. If this value is zero, it will not check the version number of
   * the server and will always update the current version; otherwise, this update will fail if the
   * version number found on the server does not match this version number. This is used to support
   * multiple simultaneous updates without losing data.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersionToUpdate() {
    return versionToUpdate;
  }

  /**
   * The version number to update. If this value is zero, it will not check the version number of
   * the server and will always update the current version; otherwise, this update will fail if the
   * version number found on the server does not match this version number. This is used to support
   * multiple simultaneous updates without losing data.
   * @param versionToUpdate versionToUpdate or {@code null} for none
   */
  public ModifyCloudToDeviceConfigRequest setVersionToUpdate(java.lang.Long versionToUpdate) {
    this.versionToUpdate = versionToUpdate;
    return this;
  }

  @Override
  public ModifyCloudToDeviceConfigRequest set(String fieldName, Object value) {
    return (ModifyCloudToDeviceConfigRequest) super.set(fieldName, value);
  }

  @Override
  public ModifyCloudToDeviceConfigRequest clone() {
    return (ModifyCloudToDeviceConfigRequest) super.clone();
  }

}
