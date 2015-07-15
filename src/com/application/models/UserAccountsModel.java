/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.models;

import com.library.BaseModel;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kadhush
 */
public class UserAccountsModel extends BaseModel {

    private static Vector<?> cData = new Vector<>();

    Vector<?> tableData = new Vector<>();
    Map<String, Vector<?>> users = new LinkedHashMap<>();
    private final String table = "user_acc";

    private Object[] oData;
    private String[] sData;

    /**
     *
     * @param strData
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void addNewData(Map<String, String> strData) throws SQLException, ClassNotFoundException {
        sanitizeData(strData);
        insertToDbTbName(table);
    }

    /**
     *
     * @param userName
     * @param password
     * @return
     */
    public String[] getUser(String userName, String password) {
        String[] user = new String[6];
        try {
            users.clear();
            tableData.clear();
            users = selectRecords("user_acc", "*", "`username` = \"" + userName + "\" AND `password` = \"" + password + "\" AND status=\"active\"");
            System.out.println(users.toString());
            tableData = users.get("tableData");
            if (tableData.size() > 0) {
                oData = tableData.toArray();
                sData = oData[0].toString().split(",\\s*");
                user[0] = sData[0].substring(1, sData[0].length());
                user[1] = sData[1];
                user[2] = sData[2];
                user[3] = sData[3];
                user[4] = sData[4];
                user[5] = sData[5].substring(0, sData[0].length() - 1);
            } else {
                user[0] = "";
                user[1] = "";
                user[2] = "";
                user[3] = "";
                user[4] = "";
                user[5] = "";
            }
            return user;
        } catch (ClassNotFoundException | SQLException ex) {
        }
        return null;
    }

    /**
     *
     * @param strSql
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Vector<?> getAllUserData(String strSql) throws ClassNotFoundException, SQLException {
        cData.clear();
        cData = selectRecords(table, "*", strSql).get("tableData");
        System.out.println(cData.toString());
        return cData;
    }

    public void deleteUser(String strSQL) {
        try {
            deleteRecord(strSQL);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserAccountsModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
