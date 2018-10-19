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

package com.google.api.services.fitness.model;

/**
 * Definition of a unique source of sensor data. Data sources can expose raw data coming from
 * hardware sensors on local or companion devices. They can also expose derived data, created by
 * transforming or merging other data sources. Multiple data sources can exist for the same data
 * type. Every data point inserted into or read from this service has an associated data source.
 *
 * The data source contains enough information to uniquely identify its data, including the hardware
 * device and the application that collected and/or transformed the data. It also holds useful
 * metadata, such as the hardware and application versions, and the device type.
 *
 * Each data source produces a unique stream of data, with a unique identifier. Not all changes to
 * data source affect the stream identifier, so that data collected by updated versions of the same
 * application/device can still be considered to belong to the same data stream.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Fitness. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSource extends com.google.api.client.json.GenericJson {

  /**
   * Information about an application which feeds sensor data into the platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Application application;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dataQualityStandard;

  /**
   * A unique identifier for the data stream produced by this data source. The identifier includes:
   *
   *   - The physical device's manufacturer, model, and serial number (UID).  - The application's
   * package name or name. Package name is used when the data source was created by an Android
   * application. The developer project number is used when the data source was created by a REST
   * client.  - The data source's type.  - The data source's stream name.  Note that not all
   * attributes of the data source are used as part of the stream identifier. In particular, the
   * version of the hardware/the application isn't used. This allows us to preserve the same stream
   * through version updates. This also means that two DataSource objects may represent the same
   * data stream even if they're not equal.
   *
   * The exact format of the data stream ID created by an Android application is: type:dataType.name
   * :application.packageName:device.manufacturer:device.model:device.uid:dataStreamName
   *
   * The exact format of the data stream ID created by a REST client is:
   * type:dataType.name:developer project
   * number:device.manufacturer:device.model:device.uid:dataStreamName
   *
   * When any of the optional fields that comprise of the data stream ID are blank, they will be
   * omitted from the data stream ID. The minimum viable data stream ID would be:
   * type:dataType.name:developer project number
   *
   * Finally, the developer project number is obfuscated when read by any REST or Android client
   * that did not create the data source. Only the data source creator will see the developer
   * project number in clear and normal form.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataStreamId;

  /**
   * The stream name uniquely identifies this particular data source among other data sources of the
   * same type from the same underlying producer. Setting the stream name is optional, but should be
   * done whenever an application exposes two streams for the same data type, or when a device has
   * two equivalent sensors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataStreamName;

  /**
   * The data type defines the schema for a stream of data being collected by, inserted into, or
   * queried from the Fitness API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataType dataType;

  /**
   * Representation of an integrated device (such as a phone or a wearable) that can hold sensors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Device device;

  /**
   * An end-user visible name for this data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A constant describing the type of this data source. Indicates whether this data source produces
   * raw or derived data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Information about an application which feeds sensor data into the platform.
   * @return value or {@code null} for none
   */
  public Application getApplication() {
    return application;
  }

  /**
   * Information about an application which feeds sensor data into the platform.
   * @param application application or {@code null} for none
   */
  public DataSource setApplication(Application application) {
    this.application = application;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDataQualityStandard() {
    return dataQualityStandard;
  }

  /**
   * @param dataQualityStandard dataQualityStandard or {@code null} for none
   */
  public DataSource setDataQualityStandard(java.util.List<java.lang.String> dataQualityStandard) {
    this.dataQualityStandard = dataQualityStandard;
    return this;
  }

  /**
   * A unique identifier for the data stream produced by this data source. The identifier includes:
   *
   *   - The physical device's manufacturer, model, and serial number (UID).  - The application's
   * package name or name. Package name is used when the data source was created by an Android
   * application. The developer project number is used when the data source was created by a REST
   * client.  - The data source's type.  - The data source's stream name.  Note that not all
   * attributes of the data source are used as part of the stream identifier. In particular, the
   * version of the hardware/the application isn't used. This allows us to preserve the same stream
   * through version updates. This also means that two DataSource objects may represent the same
   * data stream even if they're not equal.
   *
   * The exact format of the data stream ID created by an Android application is: type:dataType.name
   * :application.packageName:device.manufacturer:device.model:device.uid:dataStreamName
   *
   * The exact format of the data stream ID created by a REST client is:
   * type:dataType.name:developer project
   * number:device.manufacturer:device.model:device.uid:dataStreamName
   *
   * When any of the optional fields that comprise of the data stream ID are blank, they will be
   * omitted from the data stream ID. The minimum viable data stream ID would be:
   * type:dataType.name:developer project number
   *
   * Finally, the developer project number is obfuscated when read by any REST or Android client
   * that did not create the data source. Only the data source creator will see the developer
   * project number in clear and normal form.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataStreamId() {
    return dataStreamId;
  }

  /**
   * A unique identifier for the data stream produced by this data source. The identifier includes:
   *
   *   - The physical device's manufacturer, model, and serial number (UID).  - The application's
   * package name or name. Package name is used when the data source was created by an Android
   * application. The developer project number is used when the data source was created by a REST
   * client.  - The data source's type.  - The data source's stream name.  Note that not all
   * attributes of the data source are used as part of the stream identifier. In particular, the
   * version of the hardware/the application isn't used. This allows us to preserve the same stream
   * through version updates. This also means that two DataSource objects may represent the same
   * data stream even if they're not equal.
   *
   * The exact format of the data stream ID created by an Android application is: type:dataType.name
   * :application.packageName:device.manufacturer:device.model:device.uid:dataStreamName
   *
   * The exact format of the data stream ID created by a REST client is:
   * type:dataType.name:developer project
   * number:device.manufacturer:device.model:device.uid:dataStreamName
   *
   * When any of the optional fields that comprise of the data stream ID are blank, they will be
   * omitted from the data stream ID. The minimum viable data stream ID would be:
   * type:dataType.name:developer project number
   *
   * Finally, the developer project number is obfuscated when read by any REST or Android client
   * that did not create the data source. Only the data source creator will see the developer
   * project number in clear and normal form.
   * @param dataStreamId dataStreamId or {@code null} for none
   */
  public DataSource setDataStreamId(java.lang.String dataStreamId) {
    this.dataStreamId = dataStreamId;
    return this;
  }

  /**
   * The stream name uniquely identifies this particular data source among other data sources of the
   * same type from the same underlying producer. Setting the stream name is optional, but should be
   * done whenever an application exposes two streams for the same data type, or when a device has
   * two equivalent sensors.
   * @return value or {@code null} for none
   */
  public java.lang.String getDataStreamName() {
    return dataStreamName;
  }

  /**
   * The stream name uniquely identifies this particular data source among other data sources of the
   * same type from the same underlying producer. Setting the stream name is optional, but should be
   * done whenever an application exposes two streams for the same data type, or when a device has
   * two equivalent sensors.
   * @param dataStreamName dataStreamName or {@code null} for none
   */
  public DataSource setDataStreamName(java.lang.String dataStreamName) {
    this.dataStreamName = dataStreamName;
    return this;
  }

  /**
   * The data type defines the schema for a stream of data being collected by, inserted into, or
   * queried from the Fitness API.
   * @return value or {@code null} for none
   */
  public DataType getDataType() {
    return dataType;
  }

  /**
   * The data type defines the schema for a stream of data being collected by, inserted into, or
   * queried from the Fitness API.
   * @param dataType dataType or {@code null} for none
   */
  public DataSource setDataType(DataType dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Representation of an integrated device (such as a phone or a wearable) that can hold sensors.
   * @return value or {@code null} for none
   */
  public Device getDevice() {
    return device;
  }

  /**
   * Representation of an integrated device (such as a phone or a wearable) that can hold sensors.
   * @param device device or {@code null} for none
   */
  public DataSource setDevice(Device device) {
    this.device = device;
    return this;
  }

  /**
   * An end-user visible name for this data source.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * An end-user visible name for this data source.
   * @param name name or {@code null} for none
   */
  public DataSource setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A constant describing the type of this data source. Indicates whether this data source produces
   * raw or derived data.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * A constant describing the type of this data source. Indicates whether this data source produces
   * raw or derived data.
   * @param type type or {@code null} for none
   */
  public DataSource setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public DataSource set(String fieldName, Object value) {
    return (DataSource) super.set(fieldName, value);
  }

  @Override
  public DataSource clone() {
    return (DataSource) super.clone();
  }

}
