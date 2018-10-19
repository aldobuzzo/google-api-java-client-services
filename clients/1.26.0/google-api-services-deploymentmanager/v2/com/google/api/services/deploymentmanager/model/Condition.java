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

package com.google.api.services.deploymentmanager.model;

/**
 * A condition to be met.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Condition extends com.google.api.client.json.GenericJson {

  /**
   * Trusted attributes supplied by the IAM system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iam;

  /**
   * An operator to apply the subject with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String op;

  /**
   * Trusted attributes discharged by the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String svc;

  /**
   * Trusted attributes supplied by any service that owns resources and uses the IAM system for
   * access control.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sys;

  /**
   * DEPRECATED. Use 'values' instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The objects of the condition. This is mutually exclusive with 'value'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * Trusted attributes supplied by the IAM system.
   * @return value or {@code null} for none
   */
  public java.lang.String getIam() {
    return iam;
  }

  /**
   * Trusted attributes supplied by the IAM system.
   * @param iam iam or {@code null} for none
   */
  public Condition setIam(java.lang.String iam) {
    this.iam = iam;
    return this;
  }

  /**
   * An operator to apply the subject with.
   * @return value or {@code null} for none
   */
  public java.lang.String getOp() {
    return op;
  }

  /**
   * An operator to apply the subject with.
   * @param op op or {@code null} for none
   */
  public Condition setOp(java.lang.String op) {
    this.op = op;
    return this;
  }

  /**
   * Trusted attributes discharged by the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getSvc() {
    return svc;
  }

  /**
   * Trusted attributes discharged by the service.
   * @param svc svc or {@code null} for none
   */
  public Condition setSvc(java.lang.String svc) {
    this.svc = svc;
    return this;
  }

  /**
   * Trusted attributes supplied by any service that owns resources and uses the IAM system for
   * access control.
   * @return value or {@code null} for none
   */
  public java.lang.String getSys() {
    return sys;
  }

  /**
   * Trusted attributes supplied by any service that owns resources and uses the IAM system for
   * access control.
   * @param sys sys or {@code null} for none
   */
  public Condition setSys(java.lang.String sys) {
    this.sys = sys;
    return this;
  }

  /**
   * DEPRECATED. Use 'values' instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * DEPRECATED. Use 'values' instead.
   * @param value value or {@code null} for none
   */
  public Condition setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * The objects of the condition. This is mutually exclusive with 'value'.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * The objects of the condition. This is mutually exclusive with 'value'.
   * @param values values or {@code null} for none
   */
  public Condition setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public Condition set(String fieldName, Object value) {
    return (Condition) super.set(fieldName, value);
  }

  @Override
  public Condition clone() {
    return (Condition) super.clone();
  }

}
