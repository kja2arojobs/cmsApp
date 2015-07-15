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
public class SystemSecurityModel extends BaseModel {

    private static final Logger LOG = Logger.getLogger(SystemSecurityModel.class.getName());

    /**
     *
     * @param sysData
     */
    public void setActivationDetails(Map<String, String> sysData) {
        try {
            sanitizeData(sysData);
            insertToDbTbName("sys_security");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SystemSecurityModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param sysData
     * @param cond
     */
    public void setRegistrationDetails(Map<String, String> sysData, String cond) {
        try {
            sanitizeData(sysData);
            updateDb("sys_security", cond);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SystemSecurityModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @return
     */
    public Map<String, Vector<?>> getAllDetails() {
        try {
            return selectRecords("sys_security", "*", " 1");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SystemSecurityModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
