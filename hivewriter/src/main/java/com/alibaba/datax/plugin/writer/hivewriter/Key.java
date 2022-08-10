package com.alibaba.datax.plugin.writer.hivewriter;

/**
 * Created by shf on 15/10/8.
 */
public class Key {
    // must have
    public static final String PATH = "path";
    //must have
    public final static String DEFAULT_FS = "defaultFS";
    //must have
    public final static String FILE_TYPE = "fileType";
    // must have
    public static final String FILE_NAME = "fileName";
    // must have
    public static final String JDBC_URL= "jdbc_url";
    // must have
    public static final String USERNAME = "username";
    // must have
    public static final String PASSWORD = "password";
    // must have
    public static final String TABLE_NAME = "table_name";
    // must have for column
    public static final String COLUMN = "column";
    public static final String NAME = "name";
    public static final String TYPE = "type";
    public static final String DATE_FORMAT = "dateFormat";
    // must have
    public static final String WRITE_MODE = "writeMode";
    // must have
    public static final String FIELD_DELIMITER = "fieldDelimiter";
    // not must, default UTF-8
    public static final String ENCODING = "encoding";
    // not must, default no compress
    public static final String COMPRESS = "compress";
    // not must, not default \N
    public static final String NULL_FORMAT = "nullFormat";
    // Kerberos
    public static final String HAVE_KERBEROS = "haveKerberos";
    public static final String KERBEROS_KEYTAB_FILE_PATH = "kerberosKeytabFilePath";
    public static final String KERBEROS_PRINCIPAL = "kerberosPrincipal";
    // hadoop config
    public static final String HADOOP_CONFIG = "hadoopConfig";
}
