/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.models;

import com.library.BaseModel;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author kadhush
 */
public class ChildDataModel extends BaseModel {

    private static Vector<?> cData = new Vector<>();

    /**
     *
     * @param strSql
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public Vector<?> getAllChildData(String strSql) throws ClassNotFoundException, SQLException {

        cData.clear();

        System.out.println(selectRecords(strSql).toString());
        cData = selectRecords(strSql).get("tableData");
        System.out.println(cData.toString());

        return cData;

    }

}
