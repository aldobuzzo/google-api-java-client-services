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

package com.google.api.services.gamesConfiguration.model;

/**
 * This is a JSON template for an achievement configuration resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services Publishing API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AchievementConfiguration extends com.google.api.client.json.GenericJson {

  /**
   * The type of the achievement. Possible values are:   - "STANDARD" - Achievement is either locked
   * or unlocked.  - "INCREMENTAL" - Achievement is incremental.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String achievementType;

  /**
   * The draft data of the achievement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AchievementConfigurationDetail draft;

  /**
   * The ID of the achievement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The initial state of the achievement. Possible values are:   - "HIDDEN" - Achievement is
   * hidden.  - "REVEALED" - Achievement is revealed.  - "UNLOCKED" - Achievement is unlocked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String initialState;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * gamesConfiguration#achievementConfiguration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The read-only published data of the achievement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AchievementConfigurationDetail published;

  /**
   * Steps to unlock. Only applicable to incremental achievements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer stepsToUnlock;

  /**
   * The token for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String token;

  /**
   * The type of the achievement. Possible values are:   - "STANDARD" - Achievement is either locked
   * or unlocked.  - "INCREMENTAL" - Achievement is incremental.
   * @return value or {@code null} for none
   */
  public java.lang.String getAchievementType() {
    return achievementType;
  }

  /**
   * The type of the achievement. Possible values are:   - "STANDARD" - Achievement is either locked
   * or unlocked.  - "INCREMENTAL" - Achievement is incremental.
   * @param achievementType achievementType or {@code null} for none
   */
  public AchievementConfiguration setAchievementType(java.lang.String achievementType) {
    this.achievementType = achievementType;
    return this;
  }

  /**
   * The draft data of the achievement.
   * @return value or {@code null} for none
   */
  public AchievementConfigurationDetail getDraft() {
    return draft;
  }

  /**
   * The draft data of the achievement.
   * @param draft draft or {@code null} for none
   */
  public AchievementConfiguration setDraft(AchievementConfigurationDetail draft) {
    this.draft = draft;
    return this;
  }

  /**
   * The ID of the achievement.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the achievement.
   * @param id id or {@code null} for none
   */
  public AchievementConfiguration setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The initial state of the achievement. Possible values are:   - "HIDDEN" - Achievement is
   * hidden.  - "REVEALED" - Achievement is revealed.  - "UNLOCKED" - Achievement is unlocked.
   * @return value or {@code null} for none
   */
  public java.lang.String getInitialState() {
    return initialState;
  }

  /**
   * The initial state of the achievement. Possible values are:   - "HIDDEN" - Achievement is
   * hidden.  - "REVEALED" - Achievement is revealed.  - "UNLOCKED" - Achievement is unlocked.
   * @param initialState initialState or {@code null} for none
   */
  public AchievementConfiguration setInitialState(java.lang.String initialState) {
    this.initialState = initialState;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * gamesConfiguration#achievementConfiguration.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * gamesConfiguration#achievementConfiguration.
   * @param kind kind or {@code null} for none
   */
  public AchievementConfiguration setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The read-only published data of the achievement.
   * @return value or {@code null} for none
   */
  public AchievementConfigurationDetail getPublished() {
    return published;
  }

  /**
   * The read-only published data of the achievement.
   * @param published published or {@code null} for none
   */
  public AchievementConfiguration setPublished(AchievementConfigurationDetail published) {
    this.published = published;
    return this;
  }

  /**
   * Steps to unlock. Only applicable to incremental achievements.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStepsToUnlock() {
    return stepsToUnlock;
  }

  /**
   * Steps to unlock. Only applicable to incremental achievements.
   * @param stepsToUnlock stepsToUnlock or {@code null} for none
   */
  public AchievementConfiguration setStepsToUnlock(java.lang.Integer stepsToUnlock) {
    this.stepsToUnlock = stepsToUnlock;
    return this;
  }

  /**
   * The token for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getToken() {
    return token;
  }

  /**
   * The token for this resource.
   * @param token token or {@code null} for none
   */
  public AchievementConfiguration setToken(java.lang.String token) {
    this.token = token;
    return this;
  }

  @Override
  public AchievementConfiguration set(String fieldName, Object value) {
    return (AchievementConfiguration) super.set(fieldName, value);
  }

  @Override
  public AchievementConfiguration clone() {
    return (AchievementConfiguration) super.clone();
  }

}
