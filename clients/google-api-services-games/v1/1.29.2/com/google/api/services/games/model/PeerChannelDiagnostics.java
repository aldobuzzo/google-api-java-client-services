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

package com.google.api.services.games.model;

/**
 * This is a JSON template for peer channel diagnostics.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Game Services API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PeerChannelDiagnostics extends com.google.api.client.json.GenericJson {

  /**
   * Number of bytes received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AggregateStats bytesReceived;

  /**
   * Number of bytes sent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AggregateStats bytesSent;

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#peerChannelDiagnostics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Number of messages lost.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numMessagesLost;

  /**
   * Number of messages received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numMessagesReceived;

  /**
   * Number of messages sent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numMessagesSent;

  /**
   * Number of send failures.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numSendFailures;

  /**
   * Roundtrip latency stats in milliseconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AggregateStats roundtripLatencyMillis;

  /**
   * Number of bytes received.
   * @return value or {@code null} for none
   */
  public AggregateStats getBytesReceived() {
    return bytesReceived;
  }

  /**
   * Number of bytes received.
   * @param bytesReceived bytesReceived or {@code null} for none
   */
  public PeerChannelDiagnostics setBytesReceived(AggregateStats bytesReceived) {
    this.bytesReceived = bytesReceived;
    return this;
  }

  /**
   * Number of bytes sent.
   * @return value or {@code null} for none
   */
  public AggregateStats getBytesSent() {
    return bytesSent;
  }

  /**
   * Number of bytes sent.
   * @param bytesSent bytesSent or {@code null} for none
   */
  public PeerChannelDiagnostics setBytesSent(AggregateStats bytesSent) {
    this.bytesSent = bytesSent;
    return this;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#peerChannelDiagnostics.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Uniquely identifies the type of this resource. Value is always the fixed string
   * games#peerChannelDiagnostics.
   * @param kind kind or {@code null} for none
   */
  public PeerChannelDiagnostics setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Number of messages lost.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumMessagesLost() {
    return numMessagesLost;
  }

  /**
   * Number of messages lost.
   * @param numMessagesLost numMessagesLost or {@code null} for none
   */
  public PeerChannelDiagnostics setNumMessagesLost(java.lang.Integer numMessagesLost) {
    this.numMessagesLost = numMessagesLost;
    return this;
  }

  /**
   * Number of messages received.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumMessagesReceived() {
    return numMessagesReceived;
  }

  /**
   * Number of messages received.
   * @param numMessagesReceived numMessagesReceived or {@code null} for none
   */
  public PeerChannelDiagnostics setNumMessagesReceived(java.lang.Integer numMessagesReceived) {
    this.numMessagesReceived = numMessagesReceived;
    return this;
  }

  /**
   * Number of messages sent.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumMessagesSent() {
    return numMessagesSent;
  }

  /**
   * Number of messages sent.
   * @param numMessagesSent numMessagesSent or {@code null} for none
   */
  public PeerChannelDiagnostics setNumMessagesSent(java.lang.Integer numMessagesSent) {
    this.numMessagesSent = numMessagesSent;
    return this;
  }

  /**
   * Number of send failures.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumSendFailures() {
    return numSendFailures;
  }

  /**
   * Number of send failures.
   * @param numSendFailures numSendFailures or {@code null} for none
   */
  public PeerChannelDiagnostics setNumSendFailures(java.lang.Integer numSendFailures) {
    this.numSendFailures = numSendFailures;
    return this;
  }

  /**
   * Roundtrip latency stats in milliseconds.
   * @return value or {@code null} for none
   */
  public AggregateStats getRoundtripLatencyMillis() {
    return roundtripLatencyMillis;
  }

  /**
   * Roundtrip latency stats in milliseconds.
   * @param roundtripLatencyMillis roundtripLatencyMillis or {@code null} for none
   */
  public PeerChannelDiagnostics setRoundtripLatencyMillis(AggregateStats roundtripLatencyMillis) {
    this.roundtripLatencyMillis = roundtripLatencyMillis;
    return this;
  }

  @Override
  public PeerChannelDiagnostics set(String fieldName, Object value) {
    return (PeerChannelDiagnostics) super.set(fieldName, value);
  }

  @Override
  public PeerChannelDiagnostics clone() {
    return (PeerChannelDiagnostics) super.clone();
  }

}
