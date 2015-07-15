package com.library;

import com.config.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kadhush
 */
public class BaseModel {

    private static boolean DBCreated  = false;
    private static final Logger LOG = Logger.getLogger(BaseModel.class.getName());

    // xxxxxxxxxxxxxxxxxxxxxx
    // ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
    private static Connection conn = null;
    private Statement stmt = null;

    private String fld = "";
    private String val = "";
    private String fldval = "";
    private String cond = "";

    private String sqlQuery = "";

    private final Config conf = new Config();

    private final String databaseURL = conf.getDATABASE_URL();
    private final String JDBC_DRIVER = conf.getJDBC_DRIVER();
    private final String userName = conf.getUserName();
    private final String password = conf.getPassword();

    Map<String, Vector<?>> table = new LinkedHashMap<>();
    // SCHEMA
    private final Vector<Object> tableName = new Vector<>();
    private final Vector<Object> columnCount = new Vector<>();
    private final Vector<Object> columnNames = new Vector<>();
    private final Vector<Object> rowCount = new Vector<>();
    private final Vector<Object> tableData = new Vector<>();
    private boolean connectedToDb = false;

    /**
     *
     */
    public BaseModel() {

        // JOptionPane.showMessageDialog(null, databaseURL[0]);
    }

    public synchronized void init() {
        try {
            dbConnection();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(BaseModel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @return @throws ClassNotFoundException
     * @throws SQLException
     */
    public synchronized Connection dbConnection() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        try {
            conn = DriverManager.getConnection(databaseURL);

        } catch (Exception ex) {

        }
        //System.out.println("Connected !");
        connectedToDb = true;
        return conn;

    }

    /**
     *
     * @throws SQLException
     */
    public synchronized void closeDbConnection()
            throws SQLException {
        if (!connectedToDb) {
        } else {

            // close Statement and Connection
            stmt.close();
            conn.close();
            connectedToDb = false;

        }
    }

    //CREATE DATABASE
    private void createTables() {

    }

    /**
     *
     */
    public void dropTable_s() {

    }

    private void setDatabasePassword() {

    }

    /**
     *
     * @param tbName
     * @param condition
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void deleteRecord(String tbName, String condition)
            throws ClassNotFoundException, SQLException {

        if (condition.isEmpty()) {
            sqlQuery = "DELETE  FROM  " + tbName;
        } else {
            sqlQuery = "DELETE  FROM  " + tbName + " WHERE " + condition;
        }

        excQuery("delete", sqlQuery);
    }

    /**
     *
     * @param strSQL
     * @param tbName
     * @param condition
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void deleteRecord(String strSQL)
            throws ClassNotFoundException, SQLException {
        excQuery("delete", strSQL);
    }

    /**
     *
     * @param tbName
     * @param condition
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void updateDb(String tbName, String condition)
            throws ClassNotFoundException, SQLException {

        sqlQuery = " UPDATE  " + tbName + "   SET   " + fldval + "   WHERE   "
                + condition;
        //OptionPane.showMessageDialog(null, sqlQuery);
        excQuery("update", sqlQuery);

    }

    // SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
    // select queries
    /**
     *
     * @param tbName
     * @param fieldsList
     * @param condition
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Map<String, Vector<?>> selectRecords(String tbName, String fieldsList, String condition)
            throws ClassNotFoundException, SQLException {

        if ("".equals(fld) && "".equals(fieldsList)) {
            fld = "*";
        } else {
            fld = fieldsList;
        }

        if (condition.isEmpty()) {
            sqlQuery = " SELECT " + fld + "  FROM " + tbName;
        } else {
            sqlQuery = " SELECT " + fld + "  FROM " + tbName + "  WHERE  "
                    + condition;
        }

        // JOptionPane.showMessageDialog(null, sqlQuery);
        return excQuery("select", sqlQuery);

    }

    /**
     *
     * @param strQuery
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Map<String, Vector<?>> selectRecords(String strQuery) throws ClassNotFoundException, SQLException {
        return excQuery("select", strQuery);
    }

    // SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS
    // insert query
    /**
     *
     * @param tbName
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void insertToDbTbName(String tbName) throws ClassNotFoundException,
            SQLException {
        sqlQuery = "";

        sqlQuery = "INSERT INTO  " + tbName + "(" + fld + ") VALUES( " + val
                + " );";

        excQuery("insert", sqlQuery);
    }

    /**
     *
     * @param strSql
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void insertToDBStrSQL(String strSql) throws ClassNotFoundException, SQLException {
        excQuery("insert", strSql);
    }

    /**
     *
     * @param DBNAME USED TO SPECIFY THE DATABASE TO BE USED BY THE APPLICATION
     *
     *
     */
    /**
     * XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
     * DATA SANITIZATION WHERE This is where the map passed is split into fields
     * and values so that they can be used to create queries. This function
     * accepts single parameter in the form of :
     *
     * @param data
     */
    public void sanitizeData(Map<String, String> data) {
        fld = "";
        val = "";
        fldval = "";
        cond = "";

        for (Map.Entry<String, String> entry : data.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            fld += "`" + key + "`,";
            val += "'" + value + "'" + ",";
            fldval += "`" + key + "` = '" + value + "'" + ",";

            cond += key + " = " + value + " AND ";
        }
        // JOptionPane.showMessageDialog(null, fldvalup);
        fld = fld.substring(0, fld.length() - 1);
        val = val.substring(0, val.length() - 1);
        fldval = fldval.substring(0, fldval.length() - 1);

        cond = cond.substring(0, cond.length() - 4);
    }

    //
    /**
     *
     * @param swtch
     * @param sqlQuery
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Map<String, Vector<?>> excQuery(String swtch, String sqlQuery)
            throws ClassNotFoundException, SQLException {

       

        stmt = dbConnection().createStatement();
        System.out.println(sqlQuery);

        switch (swtch) {

            // .......................................................................................
            case "insert":
                //System.out.println(sqlQuery);
                stmt.execute(sqlQuery);
                stmt.close();
                table = null;
                sqlQuery = "";
                break;
            // .............................................................................................

            case "update":
                // JOptionPane.showMessageDialog(null,sqlQuery);
                stmt.executeUpdate(sqlQuery);
                table = null;
                break;
            // ......................................................................................................................

            case "select":
                // JOptionPane.showMessageDialog(null, sqlQuery);
                ResultSet rs = stmt.executeQuery(sqlQuery);
                ResultSetMetaData rsMeta = rs.getMetaData();

                // getting table name
                tableName.addElement(rsMeta.getTableName(1));

                // getting the number of columns
                int columns = rsMeta.getColumnCount();
                columnCount.addElement(columns);

                // getting column names
                for (int i = 1; i <= columns; i++) {
                    columnNames.addElement(rsMeta.getColumnName(i));
                }

                int rows = 0;
                // getting table data
                while (rs.next()) {
                    Vector<Object> row = new Vector<>(columns);
                    for (int i = 1; i <= columns; i++) {
                        row.addElement(rs.getObject(i));
                    }
                    rows = rows + 1;
                    tableData.addElement(row);
                }

                // getting number of rows
                rowCount.addElement(rows);

                Map<String, Vector<?>> tab = new LinkedHashMap<>();
                tab.put("tableName", tableName);
                tab.put("colunmCount", columnCount);
                tab.put("columnNames", columnNames);
                tab.put("rowCount", rowCount);
                tab.put("tableData", tableData);

                table = tab;

                break;

            // ..............................................................................................................................
            case "delete":
                stmt.execute(sqlQuery);
                stmt.close();
                table = null;
                break;

            // .............................................................................................................................
            default:
                JOptionPane.showMessageDialog(null,
                        "Database Connection did not Succeeded !");
                break;

        }

        // end of switch
        // ..................................................................................................................
        stmt.close();
        conn.close();
        connectedToDb = false;
        closeDbConnection();

        return table;
    }

}
