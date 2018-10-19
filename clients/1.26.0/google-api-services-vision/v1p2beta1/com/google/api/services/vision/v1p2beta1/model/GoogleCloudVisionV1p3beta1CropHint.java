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

package com.google.api.services.vision.v1p2beta1.model;

/**
 * Single crop hint that is used to generate a new crop when serving an image.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p3beta1CropHint extends com.google.api.client.json.GenericJson {

  /**
   * The bounding polygon for the crop region. The coordinates of the bounding box are in the
   * original image's scale, as returned in `ImageParams`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p3beta1BoundingPoly boundingPoly;

  /**
   * Confidence of this being a salient region.  Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Fraction of importance of this salient region with respect to the original image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float importanceFraction;

  /**
   * The bounding polygon for the crop region. The coordinates of the bounding box are in the
   * original image's scale, as returned in `ImageParams`.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1BoundingPoly getBoundingPoly() {
    return boundingPoly;
  }

  /**
   * The bounding polygon for the crop region. The coordinates of the bounding box are in the
   * original image's scale, as returned in `ImageParams`.
   * @param boundingPoly boundingPoly or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1CropHint setBoundingPoly(GoogleCloudVisionV1p3beta1BoundingPoly boundingPoly) {
    this.boundingPoly = boundingPoly;
    return this;
  }

  /**
   * Confidence of this being a salient region.  Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence of this being a salient region.  Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1CropHint setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Fraction of importance of this salient region with respect to the original image.
   * @return value or {@code null} for none
   */
  public java.lang.Float getImportanceFraction() {
    return importanceFraction;
  }

  /**
   * Fraction of importance of this salient region with respect to the original image.
   * @param importanceFraction importanceFraction or {@code null} for none
   */
  public GoogleCloudVisionV1p3beta1CropHint setImportanceFraction(java.lang.Float importanceFraction) {
    this.importanceFraction = importanceFraction;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p3beta1CropHint set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p3beta1CropHint) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p3beta1CropHint clone() {
    return (GoogleCloudVisionV1p3beta1CropHint) super.clone();
  }

}
