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

package com.google.api.services.androidpublisher;

/**
 * Service definition for AndroidPublisher (v1).
 *
 * <p>
 * Accesses Android application developers' Google Play accounts.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://developers.google.com/android-publisher" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AndroidPublisherRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class AndroidPublisher extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.26.0 of the Google Play Developer API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://www.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "androidpublisher/v1/applications/";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch/androidpublisher/v1";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public AndroidPublisher(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  AndroidPublisher(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Purchases collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code AndroidPublisher androidpublisher = new AndroidPublisher(...);}
   *   {@code AndroidPublisher.Purchases.List request = androidpublisher.purchases().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Purchases purchases() {
    return new Purchases();
  }

  /**
   * The "purchases" collection of methods.
   */
  public class Purchases {

    /**
     * Cancels a user's subscription purchase. The subscription remains valid until its expiration time.
     *
     * Create a request for the method "purchases.cancel".
     *
     * This request holds the parameters needed by the androidpublisher server.  After setting any
     * optional parameters, call the {@link Cancel#execute()} method to invoke the remote operation.
     *
     * @param packageName The package name of the application for which this subscription was purchased (for example,
     *        'com.some.thing').
     * @param subscriptionId The purchased subscription ID (for example, 'monthly001').
     * @param token The token provided to the user's device when the subscription was purchased.
     * @return the request
     */
    public Cancel cancel(java.lang.String packageName, java.lang.String subscriptionId, java.lang.String token) throws java.io.IOException {
      Cancel result = new Cancel(packageName, subscriptionId, token);
      initialize(result);
      return result;
    }

    public class Cancel extends AndroidPublisherRequest<Void> {

      private static final String REST_PATH = "{packageName}/subscriptions/{subscriptionId}/purchases/{token}/cancel";

      /**
       * Cancels a user's subscription purchase. The subscription remains valid until its expiration
       * time.
       *
       * Create a request for the method "purchases.cancel".
       *
       * This request holds the parameters needed by the the androidpublisher server.  After setting any
       * optional parameters, call the {@link Cancel#execute()} method to invoke the remote operation.
       * <p> {@link
       * Cancel#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param packageName The package name of the application for which this subscription was purchased (for example,
     *        'com.some.thing').
       * @param subscriptionId The purchased subscription ID (for example, 'monthly001').
       * @param token The token provided to the user's device when the subscription was purchased.
       * @since 1.13
       */
      protected Cancel(java.lang.String packageName, java.lang.String subscriptionId, java.lang.String token) {
        super(AndroidPublisher.this, "POST", REST_PATH, null, Void.class);
        this.packageName = com.google.api.client.util.Preconditions.checkNotNull(packageName, "Required parameter packageName must be specified.");
        this.subscriptionId = com.google.api.client.util.Preconditions.checkNotNull(subscriptionId, "Required parameter subscriptionId must be specified.");
        this.token = com.google.api.client.util.Preconditions.checkNotNull(token, "Required parameter token must be specified.");
      }

      @Override
      public Cancel setAlt(java.lang.String alt) {
        return (Cancel) super.setAlt(alt);
      }

      @Override
      public Cancel setFields(java.lang.String fields) {
        return (Cancel) super.setFields(fields);
      }

      @Override
      public Cancel setKey(java.lang.String key) {
        return (Cancel) super.setKey(key);
      }

      @Override
      public Cancel setOauthToken(java.lang.String oauthToken) {
        return (Cancel) super.setOauthToken(oauthToken);
      }

      @Override
      public Cancel setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Cancel) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Cancel setQuotaUser(java.lang.String quotaUser) {
        return (Cancel) super.setQuotaUser(quotaUser);
      }

      @Override
      public Cancel setUserIp(java.lang.String userIp) {
        return (Cancel) super.setUserIp(userIp);
      }

      /**
       * The package name of the application for which this subscription was purchased (for example,
       * 'com.some.thing').
       */
      @com.google.api.client.util.Key
      private java.lang.String packageName;

      /** The package name of the application for which this subscription was purchased (for example,
     'com.some.thing').
       */
      public java.lang.String getPackageName() {
        return packageName;
      }

      /**
       * The package name of the application for which this subscription was purchased (for example,
       * 'com.some.thing').
       */
      public Cancel setPackageName(java.lang.String packageName) {
        this.packageName = packageName;
        return this;
      }

      /** The purchased subscription ID (for example, 'monthly001'). */
      @com.google.api.client.util.Key
      private java.lang.String subscriptionId;

      /** The purchased subscription ID (for example, 'monthly001').
       */
      public java.lang.String getSubscriptionId() {
        return subscriptionId;
      }

      /** The purchased subscription ID (for example, 'monthly001'). */
      public Cancel setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
      }

      /** The token provided to the user's device when the subscription was purchased. */
      @com.google.api.client.util.Key
      private java.lang.String token;

      /** The token provided to the user's device when the subscription was purchased.
       */
      public java.lang.String getToken() {
        return token;
      }

      /** The token provided to the user's device when the subscription was purchased. */
      public Cancel setToken(java.lang.String token) {
        this.token = token;
        return this;
      }

      @Override
      public Cancel set(String parameterName, Object value) {
        return (Cancel) super.set(parameterName, value);
      }
    }
    /**
     * Checks whether a user's subscription purchase is valid and returns its expiry time.
     *
     * Create a request for the method "purchases.get".
     *
     * This request holds the parameters needed by the androidpublisher server.  After setting any
     * optional parameters, call the {@link Get#execute()} method to invoke the remote operation.
     *
     * @param packageName The package name of the application for which this subscription was purchased (for example,
     *        'com.some.thing').
     * @param subscriptionId The purchased subscription ID (for example, 'monthly001').
     * @param token The token provided to the user's device when the subscription was purchased.
     * @return the request
     */
    public Get get(java.lang.String packageName, java.lang.String subscriptionId, java.lang.String token) throws java.io.IOException {
      Get result = new Get(packageName, subscriptionId, token);
      initialize(result);
      return result;
    }

    public class Get extends AndroidPublisherRequest<com.google.api.services.androidpublisher.model.SubscriptionPurchase> {

      private static final String REST_PATH = "{packageName}/subscriptions/{subscriptionId}/purchases/{token}";

      /**
       * Checks whether a user's subscription purchase is valid and returns its expiry time.
       *
       * Create a request for the method "purchases.get".
       *
       * This request holds the parameters needed by the the androidpublisher server.  After setting any
       * optional parameters, call the {@link Get#execute()} method to invoke the remote operation. <p>
       * {@link Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param packageName The package name of the application for which this subscription was purchased (for example,
     *        'com.some.thing').
       * @param subscriptionId The purchased subscription ID (for example, 'monthly001').
       * @param token The token provided to the user's device when the subscription was purchased.
       * @since 1.13
       */
      protected Get(java.lang.String packageName, java.lang.String subscriptionId, java.lang.String token) {
        super(AndroidPublisher.this, "GET", REST_PATH, null, com.google.api.services.androidpublisher.model.SubscriptionPurchase.class);
        this.packageName = com.google.api.client.util.Preconditions.checkNotNull(packageName, "Required parameter packageName must be specified.");
        this.subscriptionId = com.google.api.client.util.Preconditions.checkNotNull(subscriptionId, "Required parameter subscriptionId must be specified.");
        this.token = com.google.api.client.util.Preconditions.checkNotNull(token, "Required parameter token must be specified.");
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public Get setAlt(java.lang.String alt) {
        return (Get) super.setAlt(alt);
      }

      @Override
      public Get setFields(java.lang.String fields) {
        return (Get) super.setFields(fields);
      }

      @Override
      public Get setKey(java.lang.String key) {
        return (Get) super.setKey(key);
      }

      @Override
      public Get setOauthToken(java.lang.String oauthToken) {
        return (Get) super.setOauthToken(oauthToken);
      }

      @Override
      public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Get) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Get setQuotaUser(java.lang.String quotaUser) {
        return (Get) super.setQuotaUser(quotaUser);
      }

      @Override
      public Get setUserIp(java.lang.String userIp) {
        return (Get) super.setUserIp(userIp);
      }

      /**
       * The package name of the application for which this subscription was purchased (for example,
       * 'com.some.thing').
       */
      @com.google.api.client.util.Key
      private java.lang.String packageName;

      /** The package name of the application for which this subscription was purchased (for example,
     'com.some.thing').
       */
      public java.lang.String getPackageName() {
        return packageName;
      }

      /**
       * The package name of the application for which this subscription was purchased (for example,
       * 'com.some.thing').
       */
      public Get setPackageName(java.lang.String packageName) {
        this.packageName = packageName;
        return this;
      }

      /** The purchased subscription ID (for example, 'monthly001'). */
      @com.google.api.client.util.Key
      private java.lang.String subscriptionId;

      /** The purchased subscription ID (for example, 'monthly001').
       */
      public java.lang.String getSubscriptionId() {
        return subscriptionId;
      }

      /** The purchased subscription ID (for example, 'monthly001'). */
      public Get setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
      }

      /** The token provided to the user's device when the subscription was purchased. */
      @com.google.api.client.util.Key
      private java.lang.String token;

      /** The token provided to the user's device when the subscription was purchased.
       */
      public java.lang.String getToken() {
        return token;
      }

      /** The token provided to the user's device when the subscription was purchased. */
      public Get setToken(java.lang.String token) {
        this.token = token;
        return this;
      }

      @Override
      public Get set(String parameterName, Object value) {
        return (Get) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link AndroidPublisher}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link AndroidPublisher}. */
    @Override
    public AndroidPublisher build() {
      return new AndroidPublisher(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link AndroidPublisherRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAndroidPublisherRequestInitializer(
        AndroidPublisherRequestInitializer androidpublisherRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(androidpublisherRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
