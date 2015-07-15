/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.models;

import com.library.BaseModel;
import java.sql.SQLException;
import java.util.Map;

/**
 *
 * @author kadhush
 */
public class ChildFatherModel extends BaseModel {

    private final String table = "child_father";

    /**
     *
     */
    public ChildFatherModel() {

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
     
    public void editData(Map<String, String> strData, String strCond) throws SQLException, ClassNotFoundException {
         sanitizeData(strData);
         updateDb(table, strCond);
    }

}
