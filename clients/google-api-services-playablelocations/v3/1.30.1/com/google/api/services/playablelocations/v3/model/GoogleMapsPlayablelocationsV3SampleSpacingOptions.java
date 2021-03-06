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

package com.google.api.services.playablelocations.v3.model;

/**
 * A set of options that specifies the separation between playable locations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Playable Locations API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleMapsPlayablelocationsV3SampleSpacingOptions extends com.google.api.client.json.GenericJson {

  /**
   * Required. The minimum spacing between any two playable locations, measured in meters. The
   * minimum value is 30. The maximum value is 1000.
   *
   * Inputs will be rounded up to the next 10 meter interval.
   *
   * The default value is 200m.
   *
   * Set this field to remove tight clusters of playable locations.
   *
   * Note:
   *
   * The spacing is a greedy algorithm. It optimizes for selecting the highest ranking locations
   * first, not to maximize the number of locations selected. Consider the following scenario:
   *
   *   * Rank: A: 2, B: 1, C: 3.   * Distance: A--200m--B--200m--C
   *
   * If spacing=250, it will pick the highest ranked location [B], not [A, C].
   *
   * Note:
   *
   * Spacing works within the game object type itself, as well as the previous ones. Suppose three
   * game object types, each with the following spacing:
   *
   *   * X: 400m, Y: undefined, Z: 200m.
   *
   * 1. Add locations for X, within 400m of each other. 2. Add locations for Y, without any spacing.
   * 3. Finally, add locations for Z within 200m of each other as well X and Y.
   *
   * The distance diagram between those locations end up as:
   *
   *   * From->To.   * X->X: 400m   * Y->X, Y->Y: unspecified.   * Z->X, Z->Y, Z->Z: 200m.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minSpacingMeters;

  /**
   * Specifies whether the minimum spacing constraint applies to the center-point or to the snapped
   * point of playable locations. The default value is `CENTER_POINT`.
   *
   * If a snapped point is not available for a playable location, its center-point is used instead.
   *
   * Set this to the point type used in your game.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pointType;

  /**
   * Required. The minimum spacing between any two playable locations, measured in meters. The
   * minimum value is 30. The maximum value is 1000.
   *
   * Inputs will be rounded up to the next 10 meter interval.
   *
   * The default value is 200m.
   *
   * Set this field to remove tight clusters of playable locations.
   *
   * Note:
   *
   * The spacing is a greedy algorithm. It optimizes for selecting the highest ranking locations
   * first, not to maximize the number of locations selected. Consider the following scenario:
   *
   *   * Rank: A: 2, B: 1, C: 3.   * Distance: A--200m--B--200m--C
   *
   * If spacing=250, it will pick the highest ranked location [B], not [A, C].
   *
   * Note:
   *
   * Spacing works within the game object type itself, as well as the previous ones. Suppose three
   * game object types, each with the following spacing:
   *
   *   * X: 400m, Y: undefined, Z: 200m.
   *
   * 1. Add locations for X, within 400m of each other. 2. Add locations for Y, without any spacing.
   * 3. Finally, add locations for Z within 200m of each other as well X and Y.
   *
   * The distance diagram between those locations end up as:
   *
   *   * From->To.   * X->X: 400m   * Y->X, Y->Y: unspecified.   * Z->X, Z->Y, Z->Z: 200m.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinSpacingMeters() {
    return minSpacingMeters;
  }

  /**
   * Required. The minimum spacing between any two playable locations, measured in meters. The
   * minimum value is 30. The maximum value is 1000.
   *
   * Inputs will be rounded up to the next 10 meter interval.
   *
   * The default value is 200m.
   *
   * Set this field to remove tight clusters of playable locations.
   *
   * Note:
   *
   * The spacing is a greedy algorithm. It optimizes for selecting the highest ranking locations
   * first, not to maximize the number of locations selected. Consider the following scenario:
   *
   *   * Rank: A: 2, B: 1, C: 3.   * Distance: A--200m--B--200m--C
   *
   * If spacing=250, it will pick the highest ranked location [B], not [A, C].
   *
   * Note:
   *
   * Spacing works within the game object type itself, as well as the previous ones. Suppose three
   * game object types, each with the following spacing:
   *
   *   * X: 400m, Y: undefined, Z: 200m.
   *
   * 1. Add locations for X, within 400m of each other. 2. Add locations for Y, without any spacing.
   * 3. Finally, add locations for Z within 200m of each other as well X and Y.
   *
   * The distance diagram between those locations end up as:
   *
   *   * From->To.   * X->X: 400m   * Y->X, Y->Y: unspecified.   * Z->X, Z->Y, Z->Z: 200m.
   * @param minSpacingMeters minSpacingMeters or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3SampleSpacingOptions setMinSpacingMeters(java.lang.Double minSpacingMeters) {
    this.minSpacingMeters = minSpacingMeters;
    return this;
  }

  /**
   * Specifies whether the minimum spacing constraint applies to the center-point or to the snapped
   * point of playable locations. The default value is `CENTER_POINT`.
   *
   * If a snapped point is not available for a playable location, its center-point is used instead.
   *
   * Set this to the point type used in your game.
   * @return value or {@code null} for none
   */
  public java.lang.String getPointType() {
    return pointType;
  }

  /**
   * Specifies whether the minimum spacing constraint applies to the center-point or to the snapped
   * point of playable locations. The default value is `CENTER_POINT`.
   *
   * If a snapped point is not available for a playable location, its center-point is used instead.
   *
   * Set this to the point type used in your game.
   * @param pointType pointType or {@code null} for none
   */
  public GoogleMapsPlayablelocationsV3SampleSpacingOptions setPointType(java.lang.String pointType) {
    this.pointType = pointType;
    return this;
  }

  @Override
  public GoogleMapsPlayablelocationsV3SampleSpacingOptions set(String fieldName, Object value) {
    return (GoogleMapsPlayablelocationsV3SampleSpacingOptions) super.set(fieldName, value);
  }

  @Override
  public GoogleMapsPlayablelocationsV3SampleSpacingOptions clone() {
    return (GoogleMapsPlayablelocationsV3SampleSpacingOptions) super.clone();
  }

}
