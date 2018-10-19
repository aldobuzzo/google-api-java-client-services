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

package com.google.api.services.cloudnaturallanguage.v1beta1.model;

/**
 * Represents the smallest syntactic building block of the text.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Natural Language API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Token extends com.google.api.client.json.GenericJson {

  /**
   * Dependency tree parse for this token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DependencyEdge dependencyEdge;

  /**
   * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lemma;

  /**
   * Parts of speech tag for this token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PartOfSpeech partOfSpeech;

  /**
   * The token text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextSpan text;

  /**
   * Dependency tree parse for this token.
   * @return value or {@code null} for none
   */
  public DependencyEdge getDependencyEdge() {
    return dependencyEdge;
  }

  /**
   * Dependency tree parse for this token.
   * @param dependencyEdge dependencyEdge or {@code null} for none
   */
  public Token setDependencyEdge(DependencyEdge dependencyEdge) {
    this.dependencyEdge = dependencyEdge;
    return this;
  }

  /**
   * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
   * @return value or {@code null} for none
   */
  public java.lang.String getLemma() {
    return lemma;
  }

  /**
   * [Lemma](https://en.wikipedia.org/wiki/Lemma_%28morphology%29) of the token.
   * @param lemma lemma or {@code null} for none
   */
  public Token setLemma(java.lang.String lemma) {
    this.lemma = lemma;
    return this;
  }

  /**
   * Parts of speech tag for this token.
   * @return value or {@code null} for none
   */
  public PartOfSpeech getPartOfSpeech() {
    return partOfSpeech;
  }

  /**
   * Parts of speech tag for this token.
   * @param partOfSpeech partOfSpeech or {@code null} for none
   */
  public Token setPartOfSpeech(PartOfSpeech partOfSpeech) {
    this.partOfSpeech = partOfSpeech;
    return this;
  }

  /**
   * The token text.
   * @return value or {@code null} for none
   */
  public TextSpan getText() {
    return text;
  }

  /**
   * The token text.
   * @param text text or {@code null} for none
   */
  public Token setText(TextSpan text) {
    this.text = text;
    return this;
  }

  @Override
  public Token set(String fieldName, Object value) {
    return (Token) super.set(fieldName, value);
  }

  @Override
  public Token clone() {
    return (Token) super.clone();
  }

}
