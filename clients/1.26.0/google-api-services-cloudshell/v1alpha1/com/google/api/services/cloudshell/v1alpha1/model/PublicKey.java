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

package com.google.api.services.cloudshell.v1alpha1.model;

/**
 * A public SSH key, corresponding to a private SSH key held by the client.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Shell API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PublicKey extends com.google.api.client.json.GenericJson {

  /**
   * Required. Format of this key's content.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Required. Content of this key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Output only. Full name of this resource, in the format
   * `users/{owner_email}/environments/{environment_id}/publicKeys/{key_id}`. `{owner_email}` is the
   * email address of the user to whom the key belongs. `{environment_id}` is the identifier of the
   * environment to which the key grants access. `{key_id}` is the unique identifier of the key. For
   * example, `users/someone@example.com/environments/default/publicKeys/myKey`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Format of this key's content.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * Required. Format of this key's content.
   * @param format format or {@code null} for none
   */
  public PublicKey setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * Required. Content of this key.
   * @see #decodeKey()
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * Required. Content of this key.
   * @see #getKey()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeKey() {
    return com.google.api.client.util.Base64.decodeBase64(key);
  }

  /**
   * Required. Content of this key.
   * @see #encodeKey()
   * @param key key or {@code null} for none
   */
  public PublicKey setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Required. Content of this key.
   * @see #setKey()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public PublicKey encodeKey(byte[] key) {
    this.key = com.google.api.client.util.Base64.encodeBase64URLSafeString(key);
    return this;
  }

  /**
   * Output only. Full name of this resource, in the format
   * `users/{owner_email}/environments/{environment_id}/publicKeys/{key_id}`. `{owner_email}` is the
   * email address of the user to whom the key belongs. `{environment_id}` is the identifier of the
   * environment to which the key grants access. `{key_id}` is the unique identifier of the key. For
   * example, `users/someone@example.com/environments/default/publicKeys/myKey`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Full name of this resource, in the format
   * `users/{owner_email}/environments/{environment_id}/publicKeys/{key_id}`. `{owner_email}` is the
   * email address of the user to whom the key belongs. `{environment_id}` is the identifier of the
   * environment to which the key grants access. `{key_id}` is the unique identifier of the key. For
   * example, `users/someone@example.com/environments/default/publicKeys/myKey`.
   * @param name name or {@code null} for none
   */
  public PublicKey setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public PublicKey set(String fieldName, Object value) {
    return (PublicKey) super.set(fieldName, value);
  }

  @Override
  public PublicKey clone() {
    return (PublicKey) super.clone();
  }

}
