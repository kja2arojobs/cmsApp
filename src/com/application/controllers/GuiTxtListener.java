/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.controllers;

import com.application.datapools.ChildReportDataPool;
import com.application.datapools.ChildUpdateDetailsDataPool;
import com.application.datapools.StaffReportsDataPool;
import com.application.datapools.UserAccountsDataPool;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author kadhush
 */
public class GuiTxtListener extends MouseAdapter implements ActionListener, FocusListener, KeyListener, MouseListener {

    private static final ChildReportDataPool crDAtaPool = new ChildReportDataPool();
    private static final UserAccountsDataPool uaDataPool = new UserAccountsDataPool();
    private static final ChildUpdateDetailsDataPool cuDatapool = new ChildUpdateDetailsDataPool();
    private static final StaffReportsDataPool srDataPool = new StaffReportsDataPool();
    private static final Logger LOG = Logger.getLogger(GuiTxtListener.class.getName());
    private JTextField txtChildReportSearch;
    private JTextField txtDUserSearch;
    private JTextField txtUUserSearch;
    private JTextField txtCUSearch, txtStaffReport;

    //CLICKING
    @Override

    public void actionPerformed(ActionEvent e) {

    }

    //*********************************************FOCUS**************************************//
    @Override
    public void focusGained(FocusEvent e) {

    }

    @Override
    public void focusLost(FocusEvent e) {

    }

    //**********************************************KEYING****************************************//
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

        JTextField txt = (JTextField) e.getSource();
        if (txt.equals(txtChildReportSearch)) {
            crDAtaPool.searchChildData();
        } else if (txt.equals(txtDUserSearch)) {
            uaDataPool.searchUserToDelete(txtDUserSearch.getText().trim());
        } else if (txt.equals(txtUUserSearch)) {
            uaDataPool.setData("update_user");
            uaDataPool.searchUserToUpdate(txtUUserSearch.getText().trim());
        }else if(txt.equals(txtCUSearch)){
            cuDatapool.getSelection(txtCUSearch.getText().trim());
        }else if(txt.equals(txtStaffReport)){
            srDataPool.setStaffChoice();
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    /**
     *
     * @param txtC
     */
    public void setChildReportDataControls(JTextField[] txtC) {
        txtChildReportSearch = txtC[0];
    }

    /**
     *
     * @param txtU
     */
    public void setUserControls(JTextField[] txtU) {
        txtDUserSearch = txtU[0];
        txtUUserSearch = txtU[4];
    }
    public void setChildUpdateControls(JTextField[] txtCU){
      txtCUSearch = txtCU[3];  
        
    }
    public void setStaffReport(JTextField[] txtSR){
        txtStaffReport =  txtSR[0];
    }
}
