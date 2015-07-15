/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.models;

import com.library.BaseModel;
import java.sql.SQLException;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kadhush
 */
public class ChildBioModel extends BaseModel {

    private static Vector<?> cData = new Vector<>();
    private final String table = "child_bio";

    /**
     *
     */
    public ChildBioModel() {

    }

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
     * @param strSql
     * @return
     */
    public Vector<?> getAllInfo(String strSql) {
        cData.clear();
        try {

            cData = selectRecords(table, "*", strSql).get("tableData");
            System.out.println(cData.toString());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ChildBioModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cData;
    }
     
    public void editData(Map<String, String> strData, String strCond) throws SQLException, ClassNotFoundException {
       sanitizeData(strData);
       updateDb(table, strCond);
    }
}
