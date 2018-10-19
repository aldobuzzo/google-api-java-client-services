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

package com.google.api.services.appengine.model;

/**
 * Machine resources for a version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the App Engine Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Resources extends com.google.api.client.json.GenericJson {

  /**
   * Number of CPU cores needed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double cpu;

  /**
   * Disk size (GB) needed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double diskGb;

  /**
   * Memory (GB) needed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double memoryGb;

  /**
   * User specified volumes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Volume> volumes;

  /**
   * Number of CPU cores needed.
   * @return value or {@code null} for none
   */
  public java.lang.Double getCpu() {
    return cpu;
  }

  /**
   * Number of CPU cores needed.
   * @param cpu cpu or {@code null} for none
   */
  public Resources setCpu(java.lang.Double cpu) {
    this.cpu = cpu;
    return this;
  }

  /**
   * Disk size (GB) needed.
   * @return value or {@code null} for none
   */
  public java.lang.Double getDiskGb() {
    return diskGb;
  }

  /**
   * Disk size (GB) needed.
   * @param diskGb diskGb or {@code null} for none
   */
  public Resources setDiskGb(java.lang.Double diskGb) {
    this.diskGb = diskGb;
    return this;
  }

  /**
   * Memory (GB) needed.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMemoryGb() {
    return memoryGb;
  }

  /**
   * Memory (GB) needed.
   * @param memoryGb memoryGb or {@code null} for none
   */
  public Resources setMemoryGb(java.lang.Double memoryGb) {
    this.memoryGb = memoryGb;
    return this;
  }

  /**
   * User specified volumes.
   * @return value or {@code null} for none
   */
  public java.util.List<Volume> getVolumes() {
    return volumes;
  }

  /**
   * User specified volumes.
   * @param volumes volumes or {@code null} for none
   */
  public Resources setVolumes(java.util.List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  @Override
  public Resources set(String fieldName, Object value) {
    return (Resources) super.set(fieldName, value);
  }

  @Override
  public Resources clone() {
    return (Resources) super.clone();
  }

}
