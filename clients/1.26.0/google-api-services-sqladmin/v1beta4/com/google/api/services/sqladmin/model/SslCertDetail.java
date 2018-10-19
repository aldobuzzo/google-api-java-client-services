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

package com.google.api.services.sqladmin.model;

/**
 * SslCertDetail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SslCertDetail extends com.google.api.client.json.GenericJson {

  /**
   * The public information about the cert.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SslCert certInfo;

  /**
   * The private key for the client cert, in pem format. Keep private in order to protect your
   * security.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String certPrivateKey;

  /**
   * The public information about the cert.
   * @return value or {@code null} for none
   */
  public SslCert getCertInfo() {
    return certInfo;
  }

  /**
   * The public information about the cert.
   * @param certInfo certInfo or {@code null} for none
   */
  public SslCertDetail setCertInfo(SslCert certInfo) {
    this.certInfo = certInfo;
    return this;
  }

  /**
   * The private key for the client cert, in pem format. Keep private in order to protect your
   * security.
   * @return value or {@code null} for none
   */
  public java.lang.String getCertPrivateKey() {
    return certPrivateKey;
  }

  /**
   * The private key for the client cert, in pem format. Keep private in order to protect your
   * security.
   * @param certPrivateKey certPrivateKey or {@code null} for none
   */
  public SslCertDetail setCertPrivateKey(java.lang.String certPrivateKey) {
    this.certPrivateKey = certPrivateKey;
    return this;
  }

  @Override
  public SslCertDetail set(String fieldName, Object value) {
    return (SslCertDetail) super.set(fieldName, value);
  }

  @Override
  public SslCertDetail clone() {
    return (SslCertDetail) super.clone();
  }

}
