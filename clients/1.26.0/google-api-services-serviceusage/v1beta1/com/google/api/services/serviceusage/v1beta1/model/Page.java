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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * Represents a documentation page. A page can contain subpages to represent nested documentation
 * set structure.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Page extends com.google.api.client.json.GenericJson {

  /**
   * The Markdown content of the page. You can use == include {path} == to include content from a
   * Markdown file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The name of the page. It will be used as an identity of the page to generate URI of the page,
   * text of the link to this page in navigation, etc. The full page name (start from the root page
   * name to this page concatenated with `.`) can be used as reference to the page in your
   * documentation. For example: pages: - name: Tutorial   content: == include tutorial.md ==
   * subpages:   - name: Java     content: == include tutorial_java.md ==
   *
   * You can reference `Java` page using Markdown reference link syntax: `Java`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Subpages of this page. The order of subpages specified here will be honored in the generated
   * docset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Page> subpages;

  /**
   * The Markdown content of the page. You can use == include {path} == to include content from a
   * Markdown file.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * The Markdown content of the page. You can use == include {path} == to include content from a
   * Markdown file.
   * @param content content or {@code null} for none
   */
  public Page setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * The name of the page. It will be used as an identity of the page to generate URI of the page,
   * text of the link to this page in navigation, etc. The full page name (start from the root page
   * name to this page concatenated with `.`) can be used as reference to the page in your
   * documentation. For example: pages: - name: Tutorial   content: == include tutorial.md ==
   * subpages:   - name: Java     content: == include tutorial_java.md ==
   *
   * You can reference `Java` page using Markdown reference link syntax: `Java`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the page. It will be used as an identity of the page to generate URI of the page,
   * text of the link to this page in navigation, etc. The full page name (start from the root page
   * name to this page concatenated with `.`) can be used as reference to the page in your
   * documentation. For example: pages: - name: Tutorial   content: == include tutorial.md ==
   * subpages:   - name: Java     content: == include tutorial_java.md ==
   *
   * You can reference `Java` page using Markdown reference link syntax: `Java`.
   * @param name name or {@code null} for none
   */
  public Page setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Subpages of this page. The order of subpages specified here will be honored in the generated
   * docset.
   * @return value or {@code null} for none
   */
  public java.util.List<Page> getSubpages() {
    return subpages;
  }

  /**
   * Subpages of this page. The order of subpages specified here will be honored in the generated
   * docset.
   * @param subpages subpages or {@code null} for none
   */
  public Page setSubpages(java.util.List<Page> subpages) {
    this.subpages = subpages;
    return this;
  }

  @Override
  public Page set(String fieldName, Object value) {
    return (Page) super.set(fieldName, value);
  }

  @Override
  public Page clone() {
    return (Page) super.clone();
  }

}
