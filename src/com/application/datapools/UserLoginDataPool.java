/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.datapools;

import com.Loader;
import com.application.controllers.JGuiButtonListener;
import com.application.models.UserAccountsModel;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author kadhush
 */
public class UserLoginDataPool extends DataPool {

    private static JButton[] btn;
    private static JLabel[] lbl;
    private static JTextField[] txt;
    private final static UserAccountsModel userAccountModel = new UserAccountsModel();
    private final static UserAccountsDataPool uaDataPool = new UserAccountsDataPool();
    private String strUserName = "";
    private String strUserPassword = "";

    /**
     *
     * @param btnC
     * @param lblC
     * @param txtC
     */
    public void setDataControls(JButton[] btnC, JLabel[] lblC, JTextField[] txtC) {
        btn = btnC;
        lbl = lblC;
        txt = txtC;

        JGuiButtonListener btnListener = new JGuiButtonListener();
        btn[0].addActionListener(btnListener);
        btn[1].addActionListener(btnListener);

        btnListener.setLoginBtn(btn);
    }

    /**
     *
     * @param strusername
     */
    public void setUserName(String strusername) {
        if (strusername.equals("")) {
            if (txt[0].getText().equals("")) {
                errorDetect(txt[0]);
            } else {
                strUserName = txt[0].getText().trim();
            }
        }
    }

    /**
     *
     * @param struserpassword
     */
    public void setUserPassword(String struserpassword) {
        if (struserpassword.equals("")) {
            if (txt[1].getText().equals("")) {
                errorDetect(txt[1]);
            } else {
                strUserPassword = txt[1].getText().trim();
            }
        }
    }

    /**
     *
     * @return
     */
    public String getUserName() {
        return strUserName;
    }

    /**
     *
     * @return
     */
    public String getUserPassword() {
        return strUserPassword;
    }

    /**
     *
     */
    public void loginUser() {
        System.out.println("System validating user credentials....");
        txt[0].setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1, false));
        txt[1].setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1, false));

        String[] user;
        if (txt[0].getText().equals("") || txt[1].getText().equals("")) {
            lbl[1].setText("Login Status:Input Username and Password");
            txt[0].setBorder(javax.swing.BorderFactory.createLineBorder(Color.red, 1, false));
            txt[1].setBorder(javax.swing.BorderFactory.createLineBorder(Color.red, 1, false));
        } else {
            if (validateData()) {
                user = userAccountModel.getUser(txt[0].getText().trim(), txt[1].getText().trim());
                if (user[0].isEmpty()) {
                    lbl[1].setText("Login Status:Wrong Username and Password");
                    txt[0].setBorder(javax.swing.BorderFactory.createLineBorder(Color.red, 1, false));
                    txt[1].setBorder(javax.swing.BorderFactory.createLineBorder(Color.red, 1, false));

                    //Loader.continueWithLoading(false, "", "");
                } else {
                    this.lbl[1].setText("Login Status:Logged in, Intiatlizing GUI.... ");
                    System.out.println("User logged in successfully....");

                    /*  try { */
                    //Thread.sleep(30000);
                    resetInput();
                    Loader.continueWithLoading(true, user[0], user[2]);
                    uaDataPool.setLoggedInUsers(user[0]);
                    /* } catch (InterruptedException ex) {
                     Logger.getLogger(UserLoginDataPool.class.getName()).log(Level.SEVERE, null, ex);
                     } */
                }
            }
        }
    }

    /**
     *
     */
    @Override
    public void setData() {
        setUserPassword("");
        setUserName("");
    }

    /**
     *
     */
    @Override
    public void resetInput() {
        lbl[1].setText("Login Status:Input Username and Password");
        txt[0].setText("");
        txt[1].setText("");
        txt[0].setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1, false));
        txt[1].setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 1, false));

    }

    /**
     *
     */
    @Override
    public void resetBorder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public boolean validateData() {
        setData();
        return !getUserName().equals("") && !getUserPassword().equals("");
    }

}
