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

package com.google.api.services.compute.model;

/**
 * A specification of the type and number of accelerator cards attached to the instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AcceleratorConfig extends com.google.api.client.json.GenericJson {

  /**
   * The number of the guest accelerator cards exposed to this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer acceleratorCount;

  /**
   * Full or partial URL of the accelerator type resource to attach to this instance. If you are
   * creating an instance template, specify only the accelerator name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String acceleratorType;

  /**
   * The number of the guest accelerator cards exposed to this instance.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAcceleratorCount() {
    return acceleratorCount;
  }

  /**
   * The number of the guest accelerator cards exposed to this instance.
   * @param acceleratorCount acceleratorCount or {@code null} for none
   */
  public AcceleratorConfig setAcceleratorCount(java.lang.Integer acceleratorCount) {
    this.acceleratorCount = acceleratorCount;
    return this;
  }

  /**
   * Full or partial URL of the accelerator type resource to attach to this instance. If you are
   * creating an instance template, specify only the accelerator name.
   * @return value or {@code null} for none
   */
  public java.lang.String getAcceleratorType() {
    return acceleratorType;
  }

  /**
   * Full or partial URL of the accelerator type resource to attach to this instance. If you are
   * creating an instance template, specify only the accelerator name.
   * @param acceleratorType acceleratorType or {@code null} for none
   */
  public AcceleratorConfig setAcceleratorType(java.lang.String acceleratorType) {
    this.acceleratorType = acceleratorType;
    return this;
  }

  @Override
  public AcceleratorConfig set(String fieldName, Object value) {
    return (AcceleratorConfig) super.set(fieldName, value);
  }

  @Override
  public AcceleratorConfig clone() {
    return (AcceleratorConfig) super.clone();
  }

}
