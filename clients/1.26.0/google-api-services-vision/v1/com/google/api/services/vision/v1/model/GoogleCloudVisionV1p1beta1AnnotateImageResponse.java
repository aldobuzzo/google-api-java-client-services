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

package com.google.api.services.vision.v1.model;

/**
 * Response to an image annotation request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p1beta1AnnotateImageResponse extends com.google.api.client.json.GenericJson {

  /**
   * If present, contextual information is needed to understand where this image comes from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1ImageAnnotationContext context;

  /**
   * If present, crop hints have completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1CropHintsAnnotation cropHintsAnnotation;

  /**
   * If set, represents the error message for the operation. Note that filled-in image annotations
   * are guaranteed to be correct, even when `error` is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status error;

  /**
   * If present, face detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p1beta1FaceAnnotation> faceAnnotations;

  /**
   * If present, text (OCR) detection or document (OCR) text detection has completed successfully.
   * This annotation provides the structural hierarchy for the OCR detected text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1TextAnnotation fullTextAnnotation;

  /**
   * If present, image properties were extracted successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1ImageProperties imagePropertiesAnnotation;

  /**
   * If present, label detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> labelAnnotations;

  /**
   * If present, landmark detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> landmarkAnnotations;

  /**
   * If present, localized object detection has completed successfully. This will be sorted
   * descending by confidence score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p1beta1LocalizedObjectAnnotation> localizedObjectAnnotations;

  /**
   * If present, logo detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> logoAnnotations;

  /**
   * If present, safe-search annotation has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1SafeSearchAnnotation safeSearchAnnotation;

  /**
   * If present, text (OCR) detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> textAnnotations;

  /**
   * If present, web detection has completed successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p1beta1WebDetection webDetection;

  /**
   * If present, contextual information is needed to understand where this image comes from.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageAnnotationContext getContext() {
    return context;
  }

  /**
   * If present, contextual information is needed to understand where this image comes from.
   * @param context context or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setContext(GoogleCloudVisionV1p1beta1ImageAnnotationContext context) {
    this.context = context;
    return this;
  }

  /**
   * If present, crop hints have completed successfully.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1CropHintsAnnotation getCropHintsAnnotation() {
    return cropHintsAnnotation;
  }

  /**
   * If present, crop hints have completed successfully.
   * @param cropHintsAnnotation cropHintsAnnotation or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setCropHintsAnnotation(GoogleCloudVisionV1p1beta1CropHintsAnnotation cropHintsAnnotation) {
    this.cropHintsAnnotation = cropHintsAnnotation;
    return this;
  }

  /**
   * If set, represents the error message for the operation. Note that filled-in image annotations
   * are guaranteed to be correct, even when `error` is set.
   * @return value or {@code null} for none
   */
  public Status getError() {
    return error;
  }

  /**
   * If set, represents the error message for the operation. Note that filled-in image annotations
   * are guaranteed to be correct, even when `error` is set.
   * @param error error or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setError(Status error) {
    this.error = error;
    return this;
  }

  /**
   * If present, face detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p1beta1FaceAnnotation> getFaceAnnotations() {
    return faceAnnotations;
  }

  /**
   * If present, face detection has completed successfully.
   * @param faceAnnotations faceAnnotations or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setFaceAnnotations(java.util.List<GoogleCloudVisionV1p1beta1FaceAnnotation> faceAnnotations) {
    this.faceAnnotations = faceAnnotations;
    return this;
  }

  /**
   * If present, text (OCR) detection or document (OCR) text detection has completed successfully.
   * This annotation provides the structural hierarchy for the OCR detected text.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1TextAnnotation getFullTextAnnotation() {
    return fullTextAnnotation;
  }

  /**
   * If present, text (OCR) detection or document (OCR) text detection has completed successfully.
   * This annotation provides the structural hierarchy for the OCR detected text.
   * @param fullTextAnnotation fullTextAnnotation or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setFullTextAnnotation(GoogleCloudVisionV1p1beta1TextAnnotation fullTextAnnotation) {
    this.fullTextAnnotation = fullTextAnnotation;
    return this;
  }

  /**
   * If present, image properties were extracted successfully.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1ImageProperties getImagePropertiesAnnotation() {
    return imagePropertiesAnnotation;
  }

  /**
   * If present, image properties were extracted successfully.
   * @param imagePropertiesAnnotation imagePropertiesAnnotation or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setImagePropertiesAnnotation(GoogleCloudVisionV1p1beta1ImageProperties imagePropertiesAnnotation) {
    this.imagePropertiesAnnotation = imagePropertiesAnnotation;
    return this;
  }

  /**
   * If present, label detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> getLabelAnnotations() {
    return labelAnnotations;
  }

  /**
   * If present, label detection has completed successfully.
   * @param labelAnnotations labelAnnotations or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setLabelAnnotations(java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> labelAnnotations) {
    this.labelAnnotations = labelAnnotations;
    return this;
  }

  /**
   * If present, landmark detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> getLandmarkAnnotations() {
    return landmarkAnnotations;
  }

  /**
   * If present, landmark detection has completed successfully.
   * @param landmarkAnnotations landmarkAnnotations or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setLandmarkAnnotations(java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> landmarkAnnotations) {
    this.landmarkAnnotations = landmarkAnnotations;
    return this;
  }

  /**
   * If present, localized object detection has completed successfully. This will be sorted
   * descending by confidence score.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p1beta1LocalizedObjectAnnotation> getLocalizedObjectAnnotations() {
    return localizedObjectAnnotations;
  }

  /**
   * If present, localized object detection has completed successfully. This will be sorted
   * descending by confidence score.
   * @param localizedObjectAnnotations localizedObjectAnnotations or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setLocalizedObjectAnnotations(java.util.List<GoogleCloudVisionV1p1beta1LocalizedObjectAnnotation> localizedObjectAnnotations) {
    this.localizedObjectAnnotations = localizedObjectAnnotations;
    return this;
  }

  /**
   * If present, logo detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> getLogoAnnotations() {
    return logoAnnotations;
  }

  /**
   * If present, logo detection has completed successfully.
   * @param logoAnnotations logoAnnotations or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setLogoAnnotations(java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> logoAnnotations) {
    this.logoAnnotations = logoAnnotations;
    return this;
  }

  /**
   * If present, safe-search annotation has completed successfully.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1SafeSearchAnnotation getSafeSearchAnnotation() {
    return safeSearchAnnotation;
  }

  /**
   * If present, safe-search annotation has completed successfully.
   * @param safeSearchAnnotation safeSearchAnnotation or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setSafeSearchAnnotation(GoogleCloudVisionV1p1beta1SafeSearchAnnotation safeSearchAnnotation) {
    this.safeSearchAnnotation = safeSearchAnnotation;
    return this;
  }

  /**
   * If present, text (OCR) detection has completed successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> getTextAnnotations() {
    return textAnnotations;
  }

  /**
   * If present, text (OCR) detection has completed successfully.
   * @param textAnnotations textAnnotations or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setTextAnnotations(java.util.List<GoogleCloudVisionV1p1beta1EntityAnnotation> textAnnotations) {
    this.textAnnotations = textAnnotations;
    return this;
  }

  /**
   * If present, web detection has completed successfully.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1WebDetection getWebDetection() {
    return webDetection;
  }

  /**
   * If present, web detection has completed successfully.
   * @param webDetection webDetection or {@code null} for none
   */
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse setWebDetection(GoogleCloudVisionV1p1beta1WebDetection webDetection) {
    this.webDetection = webDetection;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p1beta1AnnotateImageResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p1beta1AnnotateImageResponse clone() {
    return (GoogleCloudVisionV1p1beta1AnnotateImageResponse) super.clone();
  }

}
