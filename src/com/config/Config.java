package com.config;

import com.library.Generators;

/**
 *
 * @author kadhush
 */
public class Config {
   private static Generators gen = new Generators();
   
    private final static String strDBPath = gen.getDatabaseURL() + "\\cmsappdb.db";

    /**
     *
     * @return
     */
    public static String getDatabasePAth() {
        return Config.strDBPath;
    }

    String home_drive = System.getenv("HOMEDRIVE");
    String home_path = System.getenv("HOMEPATH");

    private String dbms = "sqlite";
    private String portNumber = "3306";
    private String dbName = "";

    private String userName = "root";
    private String password = "";

    private String serverName = "localhost";
    private final String JDBC_DRIVER = "org.sqlite.JDBC";
   
    private final String DATABASE_URL = "jdbc:sqlite:" +strDBPath;

    // setter methods

    /**
     *
     * @param strDBPath
     */
        public void setDatabasePAth(String strDBPath) {
        //Config.strDBPath = strDBPath;
    }

    /**
     *
     * @param dbms
     */
    public void setDbms(String dbms) {
        this.dbms = dbms;
    }

    /**
     *
     * @param portNumber
     */
    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    /**
     *
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    /**
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param serverName
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    // getter methods

    /**
     *
     * @return
     */
        public String getPortNumber() {
        return portNumber;
    }

    /**
     *
     * @return
     */
    public String getDbName() {
        return dbName;
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return userName;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getDbms() {
        return dbms;
    }

    /**
     *
     * @return
     */
    public String getServerName() {
        return serverName;
    }

    /**
     *
     * @return
     */
    public String getJDBC_DRIVER() {
        return JDBC_DRIVER;
    }

    /**
     *
     * @return
     */
    public String getDATABASE_URL() {
        return DATABASE_URL;
    }


}
