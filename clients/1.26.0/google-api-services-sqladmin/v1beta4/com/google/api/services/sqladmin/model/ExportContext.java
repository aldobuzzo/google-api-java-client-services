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

package com.google.api.services.sqladmin.model;

/**
 * Database instance export context.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportContext extends com.google.api.client.json.GenericJson {

  /**
   * Options for exporting data as CSV. Exporting in CSV format using the Cloud SQL Admin API is not
   * supported for PostgreSQL instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CsvExportOptions csvExportOptions;

  /**
   * Databases to be exported. MySQL instances: If fileType is SQL and no database is specified, all
   * databases are exported, except for the mysql system database. If fileType is CSV, you can
   * specify one database, either by using this property or by using the
   * csvExportOptions.selectQuery property, which takes precedence over this property. PostgreSQL
   * instances: If fileType is SQL, you must specify one database to be exported. A fileType of CSV
   * is not supported for PostgreSQL instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> databases;

  /**
   * The file type for the specified uri. SQL: The file contains SQL statements. CSV: The file
   * contains CSV data. CSV is not supported for PostgreSQL instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileType;

  /**
   * This is always sql#exportContext.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Options for exporting data as SQL statements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SqlExportOptions sqlExportOptions;

  /**
   * The path to the file in Google Cloud Storage where the export will be stored. The URI is in the
   * form gs://bucketName/fileName. If the file already exists, the requests succeeds, but the
   * operation fails. If fileType is SQL and the filename ends with .gz, the contents are
   * compressed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Options for exporting data as CSV. Exporting in CSV format using the Cloud SQL Admin API is not
   * supported for PostgreSQL instances.
   * @return value or {@code null} for none
   */
  public CsvExportOptions getCsvExportOptions() {
    return csvExportOptions;
  }

  /**
   * Options for exporting data as CSV. Exporting in CSV format using the Cloud SQL Admin API is not
   * supported for PostgreSQL instances.
   * @param csvExportOptions csvExportOptions or {@code null} for none
   */
  public ExportContext setCsvExportOptions(CsvExportOptions csvExportOptions) {
    this.csvExportOptions = csvExportOptions;
    return this;
  }

  /**
   * Databases to be exported. MySQL instances: If fileType is SQL and no database is specified, all
   * databases are exported, except for the mysql system database. If fileType is CSV, you can
   * specify one database, either by using this property or by using the
   * csvExportOptions.selectQuery property, which takes precedence over this property. PostgreSQL
   * instances: If fileType is SQL, you must specify one database to be exported. A fileType of CSV
   * is not supported for PostgreSQL instances.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDatabases() {
    return databases;
  }

  /**
   * Databases to be exported. MySQL instances: If fileType is SQL and no database is specified, all
   * databases are exported, except for the mysql system database. If fileType is CSV, you can
   * specify one database, either by using this property or by using the
   * csvExportOptions.selectQuery property, which takes precedence over this property. PostgreSQL
   * instances: If fileType is SQL, you must specify one database to be exported. A fileType of CSV
   * is not supported for PostgreSQL instances.
   * @param databases databases or {@code null} for none
   */
  public ExportContext setDatabases(java.util.List<java.lang.String> databases) {
    this.databases = databases;
    return this;
  }

  /**
   * The file type for the specified uri. SQL: The file contains SQL statements. CSV: The file
   * contains CSV data. CSV is not supported for PostgreSQL instances.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileType() {
    return fileType;
  }

  /**
   * The file type for the specified uri. SQL: The file contains SQL statements. CSV: The file
   * contains CSV data. CSV is not supported for PostgreSQL instances.
   * @param fileType fileType or {@code null} for none
   */
  public ExportContext setFileType(java.lang.String fileType) {
    this.fileType = fileType;
    return this;
  }

  /**
   * This is always sql#exportContext.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always sql#exportContext.
   * @param kind kind or {@code null} for none
   */
  public ExportContext setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Options for exporting data as SQL statements.
   * @return value or {@code null} for none
   */
  public SqlExportOptions getSqlExportOptions() {
    return sqlExportOptions;
  }

  /**
   * Options for exporting data as SQL statements.
   * @param sqlExportOptions sqlExportOptions or {@code null} for none
   */
  public ExportContext setSqlExportOptions(SqlExportOptions sqlExportOptions) {
    this.sqlExportOptions = sqlExportOptions;
    return this;
  }

  /**
   * The path to the file in Google Cloud Storage where the export will be stored. The URI is in the
   * form gs://bucketName/fileName. If the file already exists, the requests succeeds, but the
   * operation fails. If fileType is SQL and the filename ends with .gz, the contents are
   * compressed.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The path to the file in Google Cloud Storage where the export will be stored. The URI is in the
   * form gs://bucketName/fileName. If the file already exists, the requests succeeds, but the
   * operation fails. If fileType is SQL and the filename ends with .gz, the contents are
   * compressed.
   * @param uri uri or {@code null} for none
   */
  public ExportContext setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public ExportContext set(String fieldName, Object value) {
    return (ExportContext) super.set(fieldName, value);
  }

  @Override
  public ExportContext clone() {
    return (ExportContext) super.clone();
  }

  /**
   * Options for exporting data as CSV. Exporting in CSV format using the Cloud SQL Admin API is not
   * supported for PostgreSQL instances.
   */
  public static final class CsvExportOptions extends com.google.api.client.json.GenericJson {

    /**
     * The select query used to extract the data.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String selectQuery;

    /**
     * The select query used to extract the data.
     * @return value or {@code null} for none
     */
    public java.lang.String getSelectQuery() {
      return selectQuery;
    }

    /**
     * The select query used to extract the data.
     * @param selectQuery selectQuery or {@code null} for none
     */
    public CsvExportOptions setSelectQuery(java.lang.String selectQuery) {
      this.selectQuery = selectQuery;
      return this;
    }

    @Override
    public CsvExportOptions set(String fieldName, Object value) {
      return (CsvExportOptions) super.set(fieldName, value);
    }

    @Override
    public CsvExportOptions clone() {
      return (CsvExportOptions) super.clone();
    }

  }

  /**
   * Options for exporting data as SQL statements.
   */
  public static final class SqlExportOptions extends com.google.api.client.json.GenericJson {

    /**
     * Export only schemas.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean schemaOnly;

    /**
     * Tables to export, or that were exported, from the specified database. If you specify tables,
     * specify one and only one database. For PostgreSQL instances, you can specify only one table.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> tables;

    /**
     * Export only schemas.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getSchemaOnly() {
      return schemaOnly;
    }

    /**
     * Export only schemas.
     * @param schemaOnly schemaOnly or {@code null} for none
     */
    public SqlExportOptions setSchemaOnly(java.lang.Boolean schemaOnly) {
      this.schemaOnly = schemaOnly;
      return this;
    }

    /**
     * Tables to export, or that were exported, from the specified database. If you specify tables,
     * specify one and only one database. For PostgreSQL instances, you can specify only one table.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getTables() {
      return tables;
    }

    /**
     * Tables to export, or that were exported, from the specified database. If you specify tables,
     * specify one and only one database. For PostgreSQL instances, you can specify only one table.
     * @param tables tables or {@code null} for none
     */
    public SqlExportOptions setTables(java.util.List<java.lang.String> tables) {
      this.tables = tables;
      return this;
    }

    @Override
    public SqlExportOptions set(String fieldName, Object value) {
      return (SqlExportOptions) super.set(fieldName, value);
    }

    @Override
    public SqlExportOptions clone() {
      return (SqlExportOptions) super.clone();
    }

  }

}
