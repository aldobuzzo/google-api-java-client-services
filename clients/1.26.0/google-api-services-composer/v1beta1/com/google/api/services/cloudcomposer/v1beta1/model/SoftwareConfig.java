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

package com.google.api.services.cloudcomposer.v1beta1.model;

/**
 * Specifies the selection and configuration of software inside the environment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SoftwareConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Apache Airflow configuration properties to override.
   *
   * Property keys contain the section and property names, separated by a hyphen, for example "core-
   * dags_are_paused_at_creation". Section names must not contain hyphens ("-"), opening square
   * brackets ("["),  or closing square brackets ("]"). The property name must not be empty and must
   * not contain an equals sign ("=") or semicolon (";"). Section and property names must not
   * contain a period ("."). Apache Airflow configuration property names must be written in
   * [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any
   * character, and can be written in any lower/upper case format.
   *
   * Certain Apache Airflow configuration property values are [blacklisted](/composer/docs/how-
   * to/managing/setting-airflow-configurations#airflow_configuration_blacklists), and cannot be
   * overridden.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> airflowConfigOverrides;

  /**
   * Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker,
   * and webserver processes.
   *
   * Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify
   * Apache Airflow software configuration overrides (they cannot match the regular expression
   * `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names:
   *
   * * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` *
   * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` *
   * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> envVariables;

  /**
   * Immutable. The version of the software running in the environment. This encapsulates both the
   * version of Cloud Composer functionality and the version of Apache Airflow. It must match the
   * regular expression
   * `composer-([0-9]+\.[0-9]+(\.[0-9]+)?|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as
   * input, the server will also check if the provided version is supported and deny the creation
   * request for an unsupported version.
   *
   * The Cloud Composer portion of the version is a [semantic version](https://semver.org) or
   * `latest`. The patch version can be omitted and the current Cloud Composer patch version will be
   * selected. When `latest` is provided instead of an explicit version number, the server will
   * replace `latest` with the current Cloud Composer version and store that version number in the
   * same field.
   *
   * The portion of the image version that follows airflow- is an official Apache Airflow repository
   * [release name](https://github.com/apache/incubator-airflow/releases).
   *
   * Supported values for input are: * `composer-latest-airflow-latest` * `composer-latest-
   * airflow-1.10.0` * `composer-latest-airflow-1.9.0` * `composer-latest-airflow-1.10` * `composer-
   * latest-airflow-1.9` * `composer-1.1.1-airflow-latest` * `composer-1.1.1-airflow-1.10.0` *
   * `composer-1.1.1-airflow-1.9.0` * `composer-1.1.1-airflow-1.10` * `composer-1.1.1-airflow-1.9`
   *
   * See also [Release Notes](/composer/docs/release-notes).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageVersion;

  /**
   * Optional. Custom Python Package Index (PyPI) packages to be installed in the environment.
   *
   * Keys refer to the lowercase package name such as "numpy" and values are the lowercase extras
   * and version specifier such as "==1.12.0", "[devel,gcp_api]", or "[devel]>=1.8.2, <1.9.2". To
   * specify a package without pinning it to a version specifier, use the empty string as the value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> pypiPackages;

  /**
   * Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and
   * webserver processes.
   *
   * Can be set to '2' or '3'. If not specified, the default is '2'. Cannot be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pythonVersion;

  /**
   * Optional. Apache Airflow configuration properties to override.
   *
   * Property keys contain the section and property names, separated by a hyphen, for example "core-
   * dags_are_paused_at_creation". Section names must not contain hyphens ("-"), opening square
   * brackets ("["),  or closing square brackets ("]"). The property name must not be empty and must
   * not contain an equals sign ("=") or semicolon (";"). Section and property names must not
   * contain a period ("."). Apache Airflow configuration property names must be written in
   * [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any
   * character, and can be written in any lower/upper case format.
   *
   * Certain Apache Airflow configuration property values are [blacklisted](/composer/docs/how-
   * to/managing/setting-airflow-configurations#airflow_configuration_blacklists), and cannot be
   * overridden.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAirflowConfigOverrides() {
    return airflowConfigOverrides;
  }

  /**
   * Optional. Apache Airflow configuration properties to override.
   *
   * Property keys contain the section and property names, separated by a hyphen, for example "core-
   * dags_are_paused_at_creation". Section names must not contain hyphens ("-"), opening square
   * brackets ("["),  or closing square brackets ("]"). The property name must not be empty and must
   * not contain an equals sign ("=") or semicolon (";"). Section and property names must not
   * contain a period ("."). Apache Airflow configuration property names must be written in
   * [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values can contain any
   * character, and can be written in any lower/upper case format.
   *
   * Certain Apache Airflow configuration property values are [blacklisted](/composer/docs/how-
   * to/managing/setting-airflow-configurations#airflow_configuration_blacklists), and cannot be
   * overridden.
   * @param airflowConfigOverrides airflowConfigOverrides or {@code null} for none
   */
  public SoftwareConfig setAirflowConfigOverrides(java.util.Map<String, java.lang.String> airflowConfigOverrides) {
    this.airflowConfigOverrides = airflowConfigOverrides;
    return this;
  }

  /**
   * Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker,
   * and webserver processes.
   *
   * Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify
   * Apache Airflow software configuration overrides (they cannot match the regular expression
   * `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names:
   *
   * * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` *
   * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` *
   * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getEnvVariables() {
    return envVariables;
  }

  /**
   * Optional. Additional environment variables to provide to the Apache Airflow scheduler, worker,
   * and webserver processes.
   *
   * Environment variable names must match the regular expression `a-zA-Z_*`. They cannot specify
   * Apache Airflow software configuration overrides (they cannot match the regular expression
   * `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot match any of the following reserved names:
   *
   * * `AIRFLOW_HOME` * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` *
   * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` * `SQL_PASSWORD` *
   * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
   * @param envVariables envVariables or {@code null} for none
   */
  public SoftwareConfig setEnvVariables(java.util.Map<String, java.lang.String> envVariables) {
    this.envVariables = envVariables;
    return this;
  }

  /**
   * Immutable. The version of the software running in the environment. This encapsulates both the
   * version of Cloud Composer functionality and the version of Apache Airflow. It must match the
   * regular expression
   * `composer-([0-9]+\.[0-9]+(\.[0-9]+)?|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as
   * input, the server will also check if the provided version is supported and deny the creation
   * request for an unsupported version.
   *
   * The Cloud Composer portion of the version is a [semantic version](https://semver.org) or
   * `latest`. The patch version can be omitted and the current Cloud Composer patch version will be
   * selected. When `latest` is provided instead of an explicit version number, the server will
   * replace `latest` with the current Cloud Composer version and store that version number in the
   * same field.
   *
   * The portion of the image version that follows airflow- is an official Apache Airflow repository
   * [release name](https://github.com/apache/incubator-airflow/releases).
   *
   * Supported values for input are: * `composer-latest-airflow-latest` * `composer-latest-
   * airflow-1.10.0` * `composer-latest-airflow-1.9.0` * `composer-latest-airflow-1.10` * `composer-
   * latest-airflow-1.9` * `composer-1.1.1-airflow-latest` * `composer-1.1.1-airflow-1.10.0` *
   * `composer-1.1.1-airflow-1.9.0` * `composer-1.1.1-airflow-1.10` * `composer-1.1.1-airflow-1.9`
   *
   * See also [Release Notes](/composer/docs/release-notes).
   * @return value or {@code null} for none
   */
  public java.lang.String getImageVersion() {
    return imageVersion;
  }

  /**
   * Immutable. The version of the software running in the environment. This encapsulates both the
   * version of Cloud Composer functionality and the version of Apache Airflow. It must match the
   * regular expression
   * `composer-([0-9]+\.[0-9]+(\.[0-9]+)?|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`. When used as
   * input, the server will also check if the provided version is supported and deny the creation
   * request for an unsupported version.
   *
   * The Cloud Composer portion of the version is a [semantic version](https://semver.org) or
   * `latest`. The patch version can be omitted and the current Cloud Composer patch version will be
   * selected. When `latest` is provided instead of an explicit version number, the server will
   * replace `latest` with the current Cloud Composer version and store that version number in the
   * same field.
   *
   * The portion of the image version that follows airflow- is an official Apache Airflow repository
   * [release name](https://github.com/apache/incubator-airflow/releases).
   *
   * Supported values for input are: * `composer-latest-airflow-latest` * `composer-latest-
   * airflow-1.10.0` * `composer-latest-airflow-1.9.0` * `composer-latest-airflow-1.10` * `composer-
   * latest-airflow-1.9` * `composer-1.1.1-airflow-latest` * `composer-1.1.1-airflow-1.10.0` *
   * `composer-1.1.1-airflow-1.9.0` * `composer-1.1.1-airflow-1.10` * `composer-1.1.1-airflow-1.9`
   *
   * See also [Release Notes](/composer/docs/release-notes).
   * @param imageVersion imageVersion or {@code null} for none
   */
  public SoftwareConfig setImageVersion(java.lang.String imageVersion) {
    this.imageVersion = imageVersion;
    return this;
  }

  /**
   * Optional. Custom Python Package Index (PyPI) packages to be installed in the environment.
   *
   * Keys refer to the lowercase package name such as "numpy" and values are the lowercase extras
   * and version specifier such as "==1.12.0", "[devel,gcp_api]", or "[devel]>=1.8.2, <1.9.2". To
   * specify a package without pinning it to a version specifier, use the empty string as the value.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getPypiPackages() {
    return pypiPackages;
  }

  /**
   * Optional. Custom Python Package Index (PyPI) packages to be installed in the environment.
   *
   * Keys refer to the lowercase package name such as "numpy" and values are the lowercase extras
   * and version specifier such as "==1.12.0", "[devel,gcp_api]", or "[devel]>=1.8.2, <1.9.2". To
   * specify a package without pinning it to a version specifier, use the empty string as the value.
   * @param pypiPackages pypiPackages or {@code null} for none
   */
  public SoftwareConfig setPypiPackages(java.util.Map<String, java.lang.String> pypiPackages) {
    this.pypiPackages = pypiPackages;
    return this;
  }

  /**
   * Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and
   * webserver processes.
   *
   * Can be set to '2' or '3'. If not specified, the default is '2'. Cannot be updated.
   * @return value or {@code null} for none
   */
  public java.lang.String getPythonVersion() {
    return pythonVersion;
  }

  /**
   * Optional. The major version of Python used to run the Apache Airflow scheduler, worker, and
   * webserver processes.
   *
   * Can be set to '2' or '3'. If not specified, the default is '2'. Cannot be updated.
   * @param pythonVersion pythonVersion or {@code null} for none
   */
  public SoftwareConfig setPythonVersion(java.lang.String pythonVersion) {
    this.pythonVersion = pythonVersion;
    return this;
  }

  @Override
  public SoftwareConfig set(String fieldName, Object value) {
    return (SoftwareConfig) super.set(fieldName, value);
  }

  @Override
  public SoftwareConfig clone() {
    return (SoftwareConfig) super.clone();
  }

}
