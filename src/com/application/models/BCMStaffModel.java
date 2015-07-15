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
public class BCMStaffModel extends BaseModel{
     private static Vector<?> cData = new Vector<>();
    private final String table = "staff_commitee";
    
      public void addNewData(Map<String, String> strData) throws SQLException, ClassNotFoundException {
        sanitizeData(strData);
        insertToDbTbName(table);
    }
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
}
