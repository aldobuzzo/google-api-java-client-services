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

package com.google.api.services.run.v1.model;

/**
 * Cloud Run fully managed: not supported
 *
 * Cloud Run on GKE: supported
 *
 * NamespaceSpec describes the attributes on a Namespace.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NamespaceSpec extends com.google.api.client.json.GenericJson {

  /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from
   * storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> finalizers;

  /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from
   * storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFinalizers() {
    return finalizers;
  }

  /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from
   * storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   * @param finalizers finalizers or {@code null} for none
   */
  public NamespaceSpec setFinalizers(java.util.List<java.lang.String> finalizers) {
    this.finalizers = finalizers;
    return this;
  }

  @Override
  public NamespaceSpec set(String fieldName, Object value) {
    return (NamespaceSpec) super.set(fieldName, value);
  }

  @Override
  public NamespaceSpec clone() {
    return (NamespaceSpec) super.clone();
  }

}
