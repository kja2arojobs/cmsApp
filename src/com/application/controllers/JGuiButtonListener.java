/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.controllers;

import com.application.datapools.ChildDataPool;
import com.application.datapools.ChildReportDataPool;
import com.application.datapools.ChildUpdateDetailsDataPool;
import com.application.datapools.StaffRegistrationDataPool;
import com.application.datapools.StaffReportsDataPool;
import com.application.datapools.UserAccountsDataPool;
import com.application.datapools.UserLoginDataPool;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author KADHUSH
 */
public class JGuiButtonListener implements ActionListener {

    private static JButton btnLoginReset, btnLoginLogin, btnRegistrationReset,
            btnRegistrationSave, btnReportPrintExportDOC, btnReportExportPDF,
            btnReportPrint, btnNewUserReset, btnNewUserSave, btnUserDDelete,
            btnUserDReset, btnChildUpdateUpdate, btnChildUpdateReset,
            btnCYTUploadPhoto, btnCDWUploadPhoto, btnCDWReset, btnCDWSave,
            btnBCMReset, btnBCMSave, btnCYTReset, btnCYTSave, btnDEEReset,
            btnDEESave, btnUploadPhoto, btnUploadChildData
            ,btnPrintStaffReport, btnExportStaffReport;
    private static final UserLoginDataPool ulDataPool = new UserLoginDataPool();
    private static final ChildDataPool cDataPool = new ChildDataPool();
    private static final ChildReportDataPool crDataPool = new ChildReportDataPool();
    private static final UserAccountsDataPool uaDataPool = new UserAccountsDataPool();
    private static final StaffRegistrationDataPool srDataPool = new StaffRegistrationDataPool();
    private static final Logger LOG = Logger.getLogger(JGuiButtonListener.class.getName());
    private static final ChildUpdateDetailsDataPool cuDataPool = new ChildUpdateDetailsDataPool();
    private static final StaffReportsDataPool sreDataPool = new StaffReportsDataPool();

    /**
     *
     */
    public JGuiButtonListener(){
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        if (btn.equals(btnLoginReset)) {

            ulDataPool.resetInput();
        } else if (btn.equals(btnLoginLogin)) {
            ulDataPool.loginUser();

        } else if (btn.equals(btnRegistrationReset)) {
            cDataPool.resetInput();
            cDataPool.resetBorder();
        } else if (btn.equals(btnRegistrationSave)) {
            if (cDataPool.validateData()) {
               // JOptionPane.showMessageDialog(null, "Here");
                cDataPool.setRegistationData();
                cDataPool.resetInput();
                cDataPool.resetBorder();
            }
        } else if (btn.equals(btnReportPrintExportDOC)) {
            crDataPool.exportDOC();
        } else if (btn.equals(btnReportExportPDF)) {
            crDataPool.exportPDF();
        } else if (btn.equals(btnReportPrint)) {
            crDataPool.printReport();
        } else if (btn.equals(btnNewUserReset)) {
            uaDataPool.resetNewUser();
        } else if (btn.equals(btnNewUserSave)) {
            uaDataPool.saveNewUser();
            uaDataPool.searchUserToDelete("");
            uaDataPool.searchUserToUpdate("");
            uaDataPool.getUsers();
        } else if (btn.equals(btnUserDDelete)) {
            uaDataPool.deletUsers();
        } else if (btn.equals(btnUserDReset)) {

        } else if (btn.equals(btnChildUpdateReset)) {
            cuDataPool.resetInput();
        } else if (btn.equals(btnChildUpdateUpdate)) {
            cuDataPool.setUpdateDetails();
        } else if (btn.equals(btnCDWUploadPhoto)) {
            srDataPool.setCDWPhoto();
        } else if (btn.equals(btnCYTUploadPhoto)) {
            srDataPool.setCTYPhoto();
        } else if (btn.equals(btnCDWReset)) {
            srDataPool.resetCDWData();
        } else if (btn.equals(btnCDWSave)) {
            srDataPool.saveCDWData();
        } else if (btn.equals(btnBCMReset)) {
            srDataPool.resetBCMData();
        } else if (btn.equals(btnBCMSave)) {
            srDataPool.saveBCMData();
        } else if (btn.equals(btnCYTReset)) {
            srDataPool.resetCYTData();
        } else if (btn.equals(btnCYTSave)) {
            srDataPool.saveCYTData();
        } else if (btn.equals(btnDEEReset)) {
            srDataPool.resetDEEData();
        } else if (btn.equals(btnDEESave)) {
            srDataPool.saveDEEData();
        } else if (btn.equals(btnUploadPhoto)) {
            
            cDataPool.setPhoto();
        }else if(btn.equals(btnUploadChildData)){
            cuDataPool.setPhoto();
        }else if(btn.equals(btnPrintStaffReport)){
        sreDataPool.printReport();
        }else if(btn.equals(btnExportStaffReport)){
           sreDataPool.exportPDF();
        }
    }

    /**
     *
     * @param btn
     */
    public void setLoginBtn(JButton[] btn) {
        btnLoginReset = btn[0];
        btnLoginLogin = btn[1];

    }

    /**
     *
     * @param btn
     */
    public void setChildRegistrationBtn(JButton[] btn) {
        btnRegistrationReset = btn[0];
        btnRegistrationSave = btn[1];
        btnUploadPhoto = btn[2];
    }

    /**
     *
     * @param btn
     */
    public void setChildReportBtn(JButton[] btn) {
        btnReportPrint = btn[1];
        btnReportExportPDF = btn[0];

    }

    /**
     *
     * @param btn
     */
    public void setUserControls(JButton[] btn) {
        btnNewUserReset = btn[0];
        btnNewUserSave = btn[1];
        btnUserDDelete = btn[2];
        btnUserDReset = btn[3];
    }

    public void setChildUpdateControls(JButton[] btn) {
        btnChildUpdateReset = btn[0];
        btnChildUpdateUpdate = btn[1];
        btnUploadChildData = btn[2];

    }

    public void setStaffRegestrationControls(JButton[] btn) {
        btnBCMReset = btn[0];
        btnBCMSave = btn[1];
        btnCDWReset = btn[2];
        btnCDWSave = btn[3];
        btnCYTReset = btn[5];
        btnCYTSave = btn[6];
        btnCDWUploadPhoto = btn[4];
        btnCYTUploadPhoto = btn[7];
        btnDEEReset = btn[8];
        btnDEESave = btn[9];

    }
    public void setStaffReportDataControl(JButton[] btn){
       btnPrintStaffReport = btn[0];
       btnExportStaffReport = btn[1] ;
       
    }

}
