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

package com.google.api.services.plusdomains.model;

/**
 * Model definition for Comment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google+ Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Comment extends com.google.api.client.json.GenericJson {

  /**
   * The person who posted this comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Actor actor;

  /**
   * ETag of this response for caching purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The ID of this comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The activity this comment replied to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InReplyTo> inReplyTo;

  static {
    // hack to force ProGuard to consider InReplyTo used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(InReplyTo.class);
  }

  /**
   * Identifies this resource as a comment. Value: "plus#comment".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The object of this comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("object")
  private PlusDomainsObject object__;

  /**
   * People who +1'd this comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Plusoners plusoners;

  /**
   * The time at which this comment was initially published. Formatted as an RFC 3339 timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime published;

  /**
   * Link to this comment resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The time at which this comment was last updated. Formatted as an RFC 3339 timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updated;

  /**
   * This comment's verb, indicating what action was performed. Possible values are: - "post" -
   * Publish content to the stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String verb;

  /**
   * The person who posted this comment.
   * @return value or {@code null} for none
   */
  public Actor getActor() {
    return actor;
  }

  /**
   * The person who posted this comment.
   * @param actor actor or {@code null} for none
   */
  public Comment setActor(Actor actor) {
    this.actor = actor;
    return this;
  }

  /**
   * ETag of this response for caching purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of this response for caching purposes.
   * @param etag etag or {@code null} for none
   */
  public Comment setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The ID of this comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of this comment.
   * @param id id or {@code null} for none
   */
  public Comment setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The activity this comment replied to.
   * @return value or {@code null} for none
   */
  public java.util.List<InReplyTo> getInReplyTo() {
    return inReplyTo;
  }

  /**
   * The activity this comment replied to.
   * @param inReplyTo inReplyTo or {@code null} for none
   */
  public Comment setInReplyTo(java.util.List<InReplyTo> inReplyTo) {
    this.inReplyTo = inReplyTo;
    return this;
  }

  /**
   * Identifies this resource as a comment. Value: "plus#comment".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies this resource as a comment. Value: "plus#comment".
   * @param kind kind or {@code null} for none
   */
  public Comment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The object of this comment.
   * @return value or {@code null} for none
   */
  public PlusDomainsObject getObject() {
    return object__;
  }

  /**
   * The object of this comment.
   * @param object__ object__ or {@code null} for none
   */
  public Comment setObject(PlusDomainsObject object__) {
    this.object__ = object__;
    return this;
  }

  /**
   * People who +1'd this comment.
   * @return value or {@code null} for none
   */
  public Plusoners getPlusoners() {
    return plusoners;
  }

  /**
   * People who +1'd this comment.
   * @param plusoners plusoners or {@code null} for none
   */
  public Comment setPlusoners(Plusoners plusoners) {
    this.plusoners = plusoners;
    return this;
  }

  /**
   * The time at which this comment was initially published. Formatted as an RFC 3339 timestamp.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getPublished() {
    return published;
  }

  /**
   * The time at which this comment was initially published. Formatted as an RFC 3339 timestamp.
   * @param published published or {@code null} for none
   */
  public Comment setPublished(com.google.api.client.util.DateTime published) {
    this.published = published;
    return this;
  }

  /**
   * Link to this comment resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Link to this comment resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Comment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The time at which this comment was last updated. Formatted as an RFC 3339 timestamp.
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdated() {
    return updated;
  }

  /**
   * The time at which this comment was last updated. Formatted as an RFC 3339 timestamp.
   * @param updated updated or {@code null} for none
   */
  public Comment setUpdated(com.google.api.client.util.DateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * This comment's verb, indicating what action was performed. Possible values are: - "post" -
   * Publish content to the stream.
   * @return value or {@code null} for none
   */
  public java.lang.String getVerb() {
    return verb;
  }

  /**
   * This comment's verb, indicating what action was performed. Possible values are: - "post" -
   * Publish content to the stream.
   * @param verb verb or {@code null} for none
   */
  public Comment setVerb(java.lang.String verb) {
    this.verb = verb;
    return this;
  }

  @Override
  public Comment set(String fieldName, Object value) {
    return (Comment) super.set(fieldName, value);
  }

  @Override
  public Comment clone() {
    return (Comment) super.clone();
  }

  /**
   * The person who posted this comment.
   */
  public static final class Actor extends com.google.api.client.json.GenericJson {

    /**
     * Actor info specific to particular clients.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private ClientSpecificActorInfo clientSpecificActorInfo;

    /**
     * The name of this actor, suitable for display.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String displayName;

    /**
     * The ID of the actor.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The image representation of this actor.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Image image;

    /**
     * A link to the Person resource for this actor.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * Verification status of actor.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private Verification verification;

    /**
     * Actor info specific to particular clients.
     * @return value or {@code null} for none
     */
    public ClientSpecificActorInfo getClientSpecificActorInfo() {
      return clientSpecificActorInfo;
    }

    /**
     * Actor info specific to particular clients.
     * @param clientSpecificActorInfo clientSpecificActorInfo or {@code null} for none
     */
    public Actor setClientSpecificActorInfo(ClientSpecificActorInfo clientSpecificActorInfo) {
      this.clientSpecificActorInfo = clientSpecificActorInfo;
      return this;
    }

    /**
     * The name of this actor, suitable for display.
     * @return value or {@code null} for none
     */
    public java.lang.String getDisplayName() {
      return displayName;
    }

    /**
     * The name of this actor, suitable for display.
     * @param displayName displayName or {@code null} for none
     */
    public Actor setDisplayName(java.lang.String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * The ID of the actor.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The ID of the actor.
     * @param id id or {@code null} for none
     */
    public Actor setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * The image representation of this actor.
     * @return value or {@code null} for none
     */
    public Image getImage() {
      return image;
    }

    /**
     * The image representation of this actor.
     * @param image image or {@code null} for none
     */
    public Actor setImage(Image image) {
      this.image = image;
      return this;
    }

    /**
     * A link to the Person resource for this actor.
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl() {
      return url;
    }

    /**
     * A link to the Person resource for this actor.
     * @param url url or {@code null} for none
     */
    public Actor setUrl(java.lang.String url) {
      this.url = url;
      return this;
    }

    /**
     * Verification status of actor.
     * @return value or {@code null} for none
     */
    public Verification getVerification() {
      return verification;
    }

    /**
     * Verification status of actor.
     * @param verification verification or {@code null} for none
     */
    public Actor setVerification(Verification verification) {
      this.verification = verification;
      return this;
    }

    @Override
    public Actor set(String fieldName, Object value) {
      return (Actor) super.set(fieldName, value);
    }

    @Override
    public Actor clone() {
      return (Actor) super.clone();
    }

    /**
     * Actor info specific to particular clients.
     */
    public static final class ClientSpecificActorInfo extends com.google.api.client.json.GenericJson {

      /**
       * Actor info specific to YouTube clients.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private YoutubeActorInfo youtubeActorInfo;

      /**
       * Actor info specific to YouTube clients.
       * @return value or {@code null} for none
       */
      public YoutubeActorInfo getYoutubeActorInfo() {
        return youtubeActorInfo;
      }

      /**
       * Actor info specific to YouTube clients.
       * @param youtubeActorInfo youtubeActorInfo or {@code null} for none
       */
      public ClientSpecificActorInfo setYoutubeActorInfo(YoutubeActorInfo youtubeActorInfo) {
        this.youtubeActorInfo = youtubeActorInfo;
        return this;
      }

      @Override
      public ClientSpecificActorInfo set(String fieldName, Object value) {
        return (ClientSpecificActorInfo) super.set(fieldName, value);
      }

      @Override
      public ClientSpecificActorInfo clone() {
        return (ClientSpecificActorInfo) super.clone();
      }

      /**
       * Actor info specific to YouTube clients.
       */
      public static final class YoutubeActorInfo extends com.google.api.client.json.GenericJson {

        /**
         * ID of the YouTube channel owned by the Actor.
         * The value may be {@code null}.
         */
        @com.google.api.client.util.Key
        private java.lang.String channelId;

        /**
         * ID of the YouTube channel owned by the Actor.
         * @return value or {@code null} for none
         */
        public java.lang.String getChannelId() {
          return channelId;
        }

        /**
         * ID of the YouTube channel owned by the Actor.
         * @param channelId channelId or {@code null} for none
         */
        public YoutubeActorInfo setChannelId(java.lang.String channelId) {
          this.channelId = channelId;
          return this;
        }

        @Override
        public YoutubeActorInfo set(String fieldName, Object value) {
          return (YoutubeActorInfo) super.set(fieldName, value);
        }

        @Override
        public YoutubeActorInfo clone() {
          return (YoutubeActorInfo) super.clone();
        }

      }
    }
    /**
     * The image representation of this actor.
     */
    public static final class Image extends com.google.api.client.json.GenericJson {

      /**
       * The URL of the actor's profile photo. To resize the image and crop it to a square, append the
       * query string ?sz=x, where x is the dimension in pixels of each side.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String url;

      /**
       * The URL of the actor's profile photo. To resize the image and crop it to a square, append the
       * query string ?sz=x, where x is the dimension in pixels of each side.
       * @return value or {@code null} for none
       */
      public java.lang.String getUrl() {
        return url;
      }

      /**
       * The URL of the actor's profile photo. To resize the image and crop it to a square, append the
       * query string ?sz=x, where x is the dimension in pixels of each side.
       * @param url url or {@code null} for none
       */
      public Image setUrl(java.lang.String url) {
        this.url = url;
        return this;
      }

      @Override
      public Image set(String fieldName, Object value) {
        return (Image) super.set(fieldName, value);
      }

      @Override
      public Image clone() {
        return (Image) super.clone();
      }

    }
    /**
     * Verification status of actor.
     */
    public static final class Verification extends com.google.api.client.json.GenericJson {

      /**
       * Verification for one-time or manual processes.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String adHocVerified;

      /**
       * Verification for one-time or manual processes.
       * @return value or {@code null} for none
       */
      public java.lang.String getAdHocVerified() {
        return adHocVerified;
      }

      /**
       * Verification for one-time or manual processes.
       * @param adHocVerified adHocVerified or {@code null} for none
       */
      public Verification setAdHocVerified(java.lang.String adHocVerified) {
        this.adHocVerified = adHocVerified;
        return this;
      }

      @Override
      public Verification set(String fieldName, Object value) {
        return (Verification) super.set(fieldName, value);
      }

      @Override
      public Verification clone() {
        return (Verification) super.clone();
      }

    }
  }

  /**
   * Model definition for CommentInReplyTo.
   */
  public static final class InReplyTo extends com.google.api.client.json.GenericJson {

    /**
     * The ID of the activity.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The URL of the activity.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String url;

    /**
     * The ID of the activity.
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * The ID of the activity.
     * @param id id or {@code null} for none
     */
    public InReplyTo setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * The URL of the activity.
     * @return value or {@code null} for none
     */
    public java.lang.String getUrl() {
      return url;
    }

    /**
     * The URL of the activity.
     * @param url url or {@code null} for none
     */
    public InReplyTo setUrl(java.lang.String url) {
      this.url = url;
      return this;
    }

    @Override
    public InReplyTo set(String fieldName, Object value) {
      return (InReplyTo) super.set(fieldName, value);
    }

    @Override
    public InReplyTo clone() {
      return (InReplyTo) super.clone();
    }

  }

  /**
   * The object of this comment.
   */
  public static final class PlusDomainsObject extends com.google.api.client.json.GenericJson {

    /**
     * The HTML-formatted content, suitable for display.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String content;

    /**
     * The object type of this comment. Possible values are: - "comment" - A comment in reply to an
     * activity.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String objectType;

    /**
     * The content (text) as provided by the author, stored without any HTML formatting. When creating
     * or updating a comment, this value must be supplied as plain text in the request.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String originalContent;

    /**
     * The HTML-formatted content, suitable for display.
     * @return value or {@code null} for none
     */
    public java.lang.String getContent() {
      return content;
    }

    /**
     * The HTML-formatted content, suitable for display.
     * @param content content or {@code null} for none
     */
    public PlusDomainsObject setContent(java.lang.String content) {
      this.content = content;
      return this;
    }

    /**
     * The object type of this comment. Possible values are: - "comment" - A comment in reply to an
     * activity.
     * @return value or {@code null} for none
     */
    public java.lang.String getObjectType() {
      return objectType;
    }

    /**
     * The object type of this comment. Possible values are: - "comment" - A comment in reply to an
     * activity.
     * @param objectType objectType or {@code null} for none
     */
    public PlusDomainsObject setObjectType(java.lang.String objectType) {
      this.objectType = objectType;
      return this;
    }

    /**
     * The content (text) as provided by the author, stored without any HTML formatting. When creating
     * or updating a comment, this value must be supplied as plain text in the request.
     * @return value or {@code null} for none
     */
    public java.lang.String getOriginalContent() {
      return originalContent;
    }

    /**
     * The content (text) as provided by the author, stored without any HTML formatting. When creating
     * or updating a comment, this value must be supplied as plain text in the request.
     * @param originalContent originalContent or {@code null} for none
     */
    public PlusDomainsObject setOriginalContent(java.lang.String originalContent) {
      this.originalContent = originalContent;
      return this;
    }

    @Override
    public PlusDomainsObject set(String fieldName, Object value) {
      return (PlusDomainsObject) super.set(fieldName, value);
    }

    @Override
    public PlusDomainsObject clone() {
      return (PlusDomainsObject) super.clone();
    }

  }

  /**
   * People who +1'd this comment.
   */
  public static final class Plusoners extends com.google.api.client.json.GenericJson {

    /**
     * Total number of people who +1'd this comment.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Long totalItems;

    /**
     * Total number of people who +1'd this comment.
     * @return value or {@code null} for none
     */
    public java.lang.Long getTotalItems() {
      return totalItems;
    }

    /**
     * Total number of people who +1'd this comment.
     * @param totalItems totalItems or {@code null} for none
     */
    public Plusoners setTotalItems(java.lang.Long totalItems) {
      this.totalItems = totalItems;
      return this;
    }

    @Override
    public Plusoners set(String fieldName, Object value) {
      return (Plusoners) super.set(fieldName, value);
    }

    @Override
    public Plusoners clone() {
      return (Plusoners) super.clone();
    }

  }

}
