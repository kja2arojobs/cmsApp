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

/**
 *
 * @author kadhush
 */
public class CDWStaffModel extends BaseModel{
     private static Vector<?> cData = new Vector<>();
    private final String table = "cdw_staff";
    
      public void addNewData(Map<String, String> strData) throws SQLException, ClassNotFoundException {
        sanitizeData(strData);
        insertToDbTbName(table);
    }
}
