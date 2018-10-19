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

package com.google.api.services.blogger.model;

/**
 * Model definition for BlogList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Blogger API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BlogList extends com.google.api.client.json.GenericJson {

  /**
   * The list of Blogs this user has Authorship or Admin rights over.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Blog> items;

  static {
    // hack to force ProGuard to consider Blog used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Blog.class);
  }

  /**
   * The kind of this entity. Always blogger#blogList
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The list of Blogs this user has Authorship or Admin rights over.
   * @return value or {@code null} for none
   */
  public java.util.List<Blog> getItems() {
    return items;
  }

  /**
   * The list of Blogs this user has Authorship or Admin rights over.
   * @param items items or {@code null} for none
   */
  public BlogList setItems(java.util.List<Blog> items) {
    this.items = items;
    return this;
  }

  /**
   * The kind of this entity. Always blogger#blogList
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of this entity. Always blogger#blogList
   * @param kind kind or {@code null} for none
   */
  public BlogList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public BlogList set(String fieldName, Object value) {
    return (BlogList) super.set(fieldName, value);
  }

  @Override
  public BlogList clone() {
    return (BlogList) super.clone();
  }

}
