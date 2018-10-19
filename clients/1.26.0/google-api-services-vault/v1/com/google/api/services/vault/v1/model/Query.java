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

package com.google.api.services.vault.v1.model;

/**
 * A query definition relevant for search & export.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Query extends com.google.api.client.json.GenericJson {

  /**
   * When 'ACCOUNT' is chosen as search method, account_info needs to be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AccountInfo accountInfo;

  /**
   * The corpus to search.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String corpus;

  /**
   * The data source to search from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataScope;

  /**
   * For Drive search, specify more options in this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveOptions driveOptions;

  /**
   * The end time range for the search query. These timestamps are in GMT and rounded down to the
   * start of the given date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * When 'ROOM' is chosen as search method, hangout_chats_info needs to be specified. (read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HangoutsChatInfo hangoutsChatInfo;

  /**
   * For hangouts chat search, specify more options in this field. (read-only)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HangoutsChatOptions hangoutsChatOptions;

  /**
   * For mail search, specify more options in this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MailOptions mailOptions;

  /**
   * When 'ORG_UNIT' is chosen as as search method, org_unit_info needs to be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OrgUnitInfo orgUnitInfo;

  /**
   * The search method to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchMethod;

  /**
   * The start time range for the search query. These timestamps are in GMT and rounded down to the
   * start of the given date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * When 'TEAM_DRIVE' is chosen as search method, team_drive_info needs to be specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TeamDriveInfo teamDriveInfo;

  /**
   * The corpus-specific search operators used to generate search results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String terms;

  /**
   * The time zone name. It should be an IANA TZ name, such as "America/Los_Angeles". For more
   * information, see Time Zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeZone;

  /**
   * When 'ACCOUNT' is chosen as search method, account_info needs to be specified.
   * @return value or {@code null} for none
   */
  public AccountInfo getAccountInfo() {
    return accountInfo;
  }

  /**
   * When 'ACCOUNT' is chosen as search method, account_info needs to be specified.
   * @param accountInfo accountInfo or {@code null} for none
   */
  public Query setAccountInfo(AccountInfo accountInfo) {
    this.accountInfo = accountInfo;
    return this;
  }

  /**
   * The corpus to search.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorpus() {
    return corpus;
  }

  /**
   * The corpus to search.
   * @param corpus corpus or {@code null} for none
   */
  public Query setCorpus(java.lang.String corpus) {
    this.corpus = corpus;
    return this;
  }

  /**
   * The data source to search from.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataScope() {
    return dataScope;
  }

  /**
   * The data source to search from.
   * @param dataScope dataScope or {@code null} for none
   */
  public Query setDataScope(java.lang.String dataScope) {
    this.dataScope = dataScope;
    return this;
  }

  /**
   * For Drive search, specify more options in this field.
   * @return value or {@code null} for none
   */
  public DriveOptions getDriveOptions() {
    return driveOptions;
  }

  /**
   * For Drive search, specify more options in this field.
   * @param driveOptions driveOptions or {@code null} for none
   */
  public Query setDriveOptions(DriveOptions driveOptions) {
    this.driveOptions = driveOptions;
    return this;
  }

  /**
   * The end time range for the search query. These timestamps are in GMT and rounded down to the
   * start of the given date.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The end time range for the search query. These timestamps are in GMT and rounded down to the
   * start of the given date.
   * @param endTime endTime or {@code null} for none
   */
  public Query setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * When 'ROOM' is chosen as search method, hangout_chats_info needs to be specified. (read-only)
   * @return value or {@code null} for none
   */
  public HangoutsChatInfo getHangoutsChatInfo() {
    return hangoutsChatInfo;
  }

  /**
   * When 'ROOM' is chosen as search method, hangout_chats_info needs to be specified. (read-only)
   * @param hangoutsChatInfo hangoutsChatInfo or {@code null} for none
   */
  public Query setHangoutsChatInfo(HangoutsChatInfo hangoutsChatInfo) {
    this.hangoutsChatInfo = hangoutsChatInfo;
    return this;
  }

  /**
   * For hangouts chat search, specify more options in this field. (read-only)
   * @return value or {@code null} for none
   */
  public HangoutsChatOptions getHangoutsChatOptions() {
    return hangoutsChatOptions;
  }

  /**
   * For hangouts chat search, specify more options in this field. (read-only)
   * @param hangoutsChatOptions hangoutsChatOptions or {@code null} for none
   */
  public Query setHangoutsChatOptions(HangoutsChatOptions hangoutsChatOptions) {
    this.hangoutsChatOptions = hangoutsChatOptions;
    return this;
  }

  /**
   * For mail search, specify more options in this field.
   * @return value or {@code null} for none
   */
  public MailOptions getMailOptions() {
    return mailOptions;
  }

  /**
   * For mail search, specify more options in this field.
   * @param mailOptions mailOptions or {@code null} for none
   */
  public Query setMailOptions(MailOptions mailOptions) {
    this.mailOptions = mailOptions;
    return this;
  }

  /**
   * When 'ORG_UNIT' is chosen as as search method, org_unit_info needs to be specified.
   * @return value or {@code null} for none
   */
  public OrgUnitInfo getOrgUnitInfo() {
    return orgUnitInfo;
  }

  /**
   * When 'ORG_UNIT' is chosen as as search method, org_unit_info needs to be specified.
   * @param orgUnitInfo orgUnitInfo or {@code null} for none
   */
  public Query setOrgUnitInfo(OrgUnitInfo orgUnitInfo) {
    this.orgUnitInfo = orgUnitInfo;
    return this;
  }

  /**
   * The search method to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchMethod() {
    return searchMethod;
  }

  /**
   * The search method to use.
   * @param searchMethod searchMethod or {@code null} for none
   */
  public Query setSearchMethod(java.lang.String searchMethod) {
    this.searchMethod = searchMethod;
    return this;
  }

  /**
   * The start time range for the search query. These timestamps are in GMT and rounded down to the
   * start of the given date.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The start time range for the search query. These timestamps are in GMT and rounded down to the
   * start of the given date.
   * @param startTime startTime or {@code null} for none
   */
  public Query setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * When 'TEAM_DRIVE' is chosen as search method, team_drive_info needs to be specified.
   * @return value or {@code null} for none
   */
  public TeamDriveInfo getTeamDriveInfo() {
    return teamDriveInfo;
  }

  /**
   * When 'TEAM_DRIVE' is chosen as search method, team_drive_info needs to be specified.
   * @param teamDriveInfo teamDriveInfo or {@code null} for none
   */
  public Query setTeamDriveInfo(TeamDriveInfo teamDriveInfo) {
    this.teamDriveInfo = teamDriveInfo;
    return this;
  }

  /**
   * The corpus-specific search operators used to generate search results.
   * @return value or {@code null} for none
   */
  public java.lang.String getTerms() {
    return terms;
  }

  /**
   * The corpus-specific search operators used to generate search results.
   * @param terms terms or {@code null} for none
   */
  public Query setTerms(java.lang.String terms) {
    this.terms = terms;
    return this;
  }

  /**
   * The time zone name. It should be an IANA TZ name, such as "America/Los_Angeles". For more
   * information, see Time Zone.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeZone() {
    return timeZone;
  }

  /**
   * The time zone name. It should be an IANA TZ name, such as "America/Los_Angeles". For more
   * information, see Time Zone.
   * @param timeZone timeZone or {@code null} for none
   */
  public Query setTimeZone(java.lang.String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

  @Override
  public Query set(String fieldName, Object value) {
    return (Query) super.set(fieldName, value);
  }

  @Override
  public Query clone() {
    return (Query) super.clone();
  }

}
