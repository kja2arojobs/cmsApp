/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.datapools;

import com.application.controllers.JGuiButtonListener;
import com.application.models.BCMStaffModel;
import com.application.models.CDWStaffModel;
import com.application.models.CYTStaffModel;
import com.application.models.DEEStaffModel;
import com.library.Generators;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.imgscalr.Scalr;
import org.imgscalr.Scalr.Method;

/**
 *
 * @author kadhush
 */
public class StaffRegistrationDataPool extends DataPool {

    private static JButton[] btn;
    private static JTextField[] txt;
    private static JTextArea[] txtArea;
    private static JComboBox[] cmbx;
    private static JDateChooser[] dtChooser;
    private static JLabel[] lbl;

    private static String strBCMChairPerson, strBCMSecretary, strCDWBasicSalary,
            strCDWDesignation, strCDWHouseAllowance, strCDWIdNumber, strCDWMedicalAllowance,
            strCDWNSSF, strCDWPAYE, strCDWTransportAllowance, strCYTDesignation, strCYTFullName,
            strCYTIDNumber, strCYTSalary, strDEEChairPerson, strDEESecretary, strCDWEducationLevel, strCDWSex, strCTYEducationLevel, strCYTSex, strCDWHire, strCYTHire, strDEEOthers, strBCMOthers;

    private static final CDWStaffModel cdwModel = new CDWStaffModel();
    private static final BCMStaffModel bcmModel = new BCMStaffModel();
    private static final CYTStaffModel cytModel = new CYTStaffModel();
    private static final DEEStaffModel deeModel = new DEEStaffModel();
    private static String dirName;
    private static BufferedImage srcImgCDW = null, scldImgCDW = null, srcImgCYT = null, scldImgCYT = null;
    private static URL imgUrl = null;
    private static ImageIcon imgIcon = null;
    private static final Generators gen = new Generators();
    private static String strCYT = "", strCDW = "";
    private String strCDWFullName;

    public StaffRegistrationDataPool() {

    }

    public void setDataControls(JButton[] btnS, JTextField[] txt, JTextArea[] txtArea, JComboBox[] cmbx, JDateChooser[] dtChooser, JLabel[] lbl) {
        JGuiButtonListener guiListener = new JGuiButtonListener();
        btn = btnS;
        btn[0].addActionListener(guiListener);
        btn[1].addActionListener(guiListener);
        btn[2].addActionListener(guiListener);
        btn[3].addActionListener(guiListener);
        btn[4].addActionListener(guiListener);
        btn[5].addActionListener(guiListener);
        btn[6].addActionListener(guiListener);
        btn[7].addActionListener(guiListener);
        btn[8].addActionListener(guiListener);
        btn[9].addActionListener(guiListener);
        guiListener.setStaffRegestrationControls(btn);

        StaffRegistrationDataPool.txt = txt;
        StaffRegistrationDataPool.txtArea = txtArea;
        StaffRegistrationDataPool.cmbx = cmbx;
        StaffRegistrationDataPool.dtChooser = dtChooser;
        StaffRegistrationDataPool.lbl = lbl;

    }

    public void setBCMChairPerson(String strChairPerson) {

        if (strChairPerson.equals("")) {

            if (txt[0].getText().equals("")) {
                errorDetect(txt[0]);
            } else {
                strBCMChairPerson = txt[0].getText().trim();
            }

        } else {
            strBCMChairPerson = strChairPerson;
        }
    }

    public void setBCMSecretary(String strSectary) {
        if (strSectary.equals("")) {

            if (txt[1].getText().equals("")) {
                errorDetect(txt[1]);
            } else {
                strBCMSecretary = txt[1].getText().trim();
            }

        } else {
            strBCMSecretary = strSectary;
        }
    }

    public void setCDWBasicSalary(String strBasicSalary) {
        if (strBasicSalary.equals("")) {

            if (txt[2].getText().equals("")) {
                errorDetect(txt[2]);
            } else {
                strCDWBasicSalary = txt[2].getText().trim();
            }

        } else {
            strCDWBasicSalary = strBasicSalary;
        }
    }

    public void setCDWDesignation(String strDesignation) {
        if (strDesignation.equals("")) {

            if (txt[3].getText().equals("")) {
                errorDetect(txt[3]);
            } else {
                strCDWDesignation = txt[3].getText().trim();
            }

        } else {
            strCDWDesignation = strDesignation;
        }
    }

    public void setCDWHouseAllowance(String strHouseAllowance) {
        if (strHouseAllowance.equals("")) {

            if (txt[4].getText().equals("")) {
                errorDetect(txt[4]);
            } else {
                strCDWHouseAllowance = txt[4].getText().trim();
            }

        } else {
            strCDWHouseAllowance = strHouseAllowance;
        }
    }

    public void setCDWIdNumber(String strIdNumber) {
        if (strIdNumber.equals("")) {

            if (txt[5].getText().equals("")) {
                errorDetect(txt[5]);
            } else {
                strCDWIdNumber = txt[5].getText().trim();
            }

        } else {
            strCDWIdNumber = strIdNumber;
        }
    }

    public void setCDWMedicalAllowance(String strMedicalAllowance) {
        if (strMedicalAllowance.equals("")) {

            if (txt[6].getText().equals("")) {
                errorDetect(txt[6]);
            } else {
                strCDWMedicalAllowance = txt[6].getText().trim();
            }

        } else {
            strCDWMedicalAllowance = strMedicalAllowance;
        }
    }

    public void setCDWNSSF(String strNSSF) {
        if (strNSSF.equals("")) {

            if (txt[7].getText().equals("")) {
                errorDetect(txt[7]);
            } else {
                strCDWNSSF = txt[7].getText().trim();
            }

        } else {
            strCDWNSSF = strNSSF;
        }
    }

    public void setCDWPAYE(String strPAYE) {
        if (strPAYE.equals("")) {

            if (txt[8].getText().equals("")) {
                errorDetect(txt[8]);
            } else {
                strCDWPAYE = txt[8].getText().trim();
            }

        } else {
            strCDWPAYE = strPAYE;
        }
    }

    public void setCDWTransportAllowance(String strTransportAllowance) {
        if (strTransportAllowance.equals("")) {

            if (txt[9].getText().equals("")) {
                errorDetect(txt[9]);
            } else {
                strCDWTransportAllowance = txt[9].getText().trim();
            }

        } else {
            strCDWTransportAllowance = strTransportAllowance;
        }
    }

    public void setCYTDesignation(String strDesignation) {
        if (strDesignation.equals("")) {

            if (txt[10].getText().equals("")) {
                errorDetect(txt[10]);
            } else {
                strCYTDesignation = txt[10].getText().trim();
            }

        } else {
            strCYTDesignation = strDesignation;
        }
    }

    public void setCYTFullName(String strFullName) {
        if (strFullName.equals("")) {

            if (txt[11].getText().equals("")) {
                errorDetect(txt[11]);
            } else {
                strCYTFullName = txt[11].getText().trim();
            }

        } else {
            strCYTFullName = strFullName;
        }
    }

    public void setCYTIDNumber(String strIDNumber) {
        if (strIDNumber.equals("")) {

            if (txt[12].getText().equals("")) {
                errorDetect(txt[12]);
            } else {
                strCYTIDNumber = txt[12].getText().trim();
            }

        } else {
            strCYTIDNumber = strIDNumber;
        }
    }

    public void setCYTSalary(String strSalary) {
        if (strSalary.equals("")) {

            if (txt[13].getText().equals("")) {
                errorDetect(txt[13]);
            } else {
                strCYTSalary = txt[13].getText().trim();
            }

        } else {
            strCYTSalary = strSalary;
        }
    }

    public void setDEEChairPerson(String strChairPerson) {
        if (strChairPerson.equals("")) {

            if (txt[14].getText().equals("")) {
                errorDetect(txt[14]);
            } else {
                strDEEChairPerson = txt[14].getText().trim();
            }

        } else {
            strDEEChairPerson = strChairPerson;
        }
    }

    public void setDEESecretary(String strSecretary) {
        if (strSecretary.equals("")) {

            if (txt[15].getText().equals("")) {
                errorDetect(txt[15]);
            } else {
                strDEESecretary = txt[15].getText().trim();
            }

        } else {
            strDEESecretary = strSecretary;
        }
    }

    public void setCDWFullName(String strFName) {
        if (strFName.equals("")) {

            if (txt[16].getText().equals("")) {
                errorDetect(txt[16]);
            } else {
                strCDWFullName = txt[16].getText().trim();
            }

        } else {
            strCDWFullName = strFName;
        }
    }

    public void setCDWEducationalLevel() {
        if (cmbx[0].getSelectedIndex() == 0) {
            errorDetect(cmbx[0]);

        } else {
            strCDWEducationLevel = cmbx[0].getSelectedItem().toString().trim();
        }
    }

    public void setCDWSex() {

        if (cmbx[1].getSelectedIndex() == 0) {
            errorDetect(cmbx[1]);
        } else {
            strCDWSex = cmbx[1].getSelectedItem().toString().trim();
        }
    }

    public void setCYTEducationalLevel() {

        if (cmbx[2].getSelectedIndex() == 0) {
            errorDetect(cmbx[2]);
        } else {
            strCTYEducationLevel = cmbx[2].getSelectedItem().toString().trim();
        }
    }

    public void setCYTSex() {

        if (cmbx[3].getSelectedIndex() == 0) {
            errorDetect(cmbx[3]);
        } else {
            strCYTSex = cmbx[3].getSelectedItem().toString().trim();
        }
    }

    public void setCDWHire() {
       
        if (dtChooser[0].getDate().toString().equals("")) {
            errorDetect(dtChooser[0]);
        } else {
            strCDWHire = dtChooser[0].getDate().toString();
        }
    }

    public void setCYTHire() {
        if (dtChooser[1].getDate().toString().equals("")) {
            errorDetect(dtChooser[1]);
        } else {
            strCYTHire = dtChooser[1].getDate().toString();
        }
    }
    
    public void setCDWPhot(){
        if(lbl[0].getText().equals("photo")){
            errorDetect(lbl[0]);
        }
    }

    public void setCTYPhoto() {
        //OPEN FILE CHOOSER
        Cursor rs = new Cursor(Cursor.WAIT_CURSOR);
        lbl[1].setCursor(rs);
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showDialog(btn[7], "Attach");
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Images files", new String[]{"png", "jpg", "jepg", "gif"}));
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {

                Image image = ImageIO.read(fc.getSelectedFile());
                srcImgCYT = ImageIO.read(fc.getSelectedFile());
                scldImgCYT = Scalr.resize(srcImgCYT, Method.SPEED, Scalr.Mode.AUTOMATIC, 102, 102, Scalr.OP_ANTIALIAS);
                ImageIO.read(fc.getSelectedFile());
                lbl[1].setText("");
                lbl[1].setIcon(new ImageIcon(scldImgCYT));

            } catch (IOException ex) {
                Logger.getLogger(StaffRegistrationDataPool.class.getName()).log(Level.SEVERE, null, ex);
            }
            Cursor ns = new Cursor(Cursor.DEFAULT_CURSOR);
            lbl[1].setCursor(ns);
        }
    }

    public void setCDWPhoto() {
        //OPEN FILE CHOOSER

        Cursor rs = new Cursor(Cursor.WAIT_CURSOR);
        lbl[0].setCursor(rs);
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showDialog(btn[4], "Attach");
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Images files", new String[]{"png", "jpg", "jepg", "gif"}));
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {

                Image image = ImageIO.read(fc.getSelectedFile());
                srcImgCDW = ImageIO.read(fc.getSelectedFile());
                scldImgCDW = Scalr.resize(srcImgCDW, Method.SPEED, Scalr.Mode.AUTOMATIC, 102, 102, Scalr.OP_ANTIALIAS);
                ImageIO.read(fc.getSelectedFile());
                lbl[0].setText("");
                lbl[0].setIcon(new ImageIcon(scldImgCDW));

            } catch (IOException ex) {
                Logger.getLogger(StaffRegistrationDataPool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        Cursor ns = new Cursor(Cursor.DEFAULT_CURSOR);
        lbl[0].setCursor(ns);
    }

    private void createDir() {

        String path = System.getProperty("user.home");
        File dir = new File(path + "/ims/img");
        if (dir.exists()) {

        } else {
            dir.mkdir();
        }

        dirName = dir.getAbsolutePath();

    }

    private boolean validateCDW() {
        return !getCDWIdNumber().equals("") && !getCDWFullName().equals("")
                && !getCDWSex().equals("") && !getCDWHire().equals("")
                && !getCDWDesignation().equals("") && !getCDWEducationalLevel().equals("")
                && !getCDWBasicSalary().equals("") && !getCDWHouseAllowance().equals("")
                && !getCDWPAYE().equals("") && !getCDWNSSF().equals("") && !getCDWNSSF().equals("") && !lbl[0].getText().equals("photo");
    }

    public void saveCDWData() {
        try {
            setCDWData();
            createDir();
            strCDW = String.valueOf(gen.getMillTime());
            //SAVE THE IMAGES
            ImageIO.write(scldImgCDW, "png", new File(dirName + "\\" + getCDWIdNumber() + strCDW + ".png"));
            Map<String, String> strData = new LinkedHashMap<>();

            strData.put("cdw_id", getCDWIdNumber());
            strData.put("cdw_fullname", getCDWFullName());
            strData.put("cdw_sex", getCDWSex());
            strData.put("cdw_hire_date", getCDWHire());
            strData.put("cdw_designation", getCDWDesignation());
            strData.put("cdw_education_level", getCDWEducationalLevel());
            strData.put("cdw_basic_salary", getCDWBasicSalary());
            strData.put("cdw_house_allowance", getCDWHouseAllowance());
            strData.put("cdw_transport_allowance", getCDWTransportAllowance());
            strData.put("cdw_medical_allowance", getCDWMedicalAllowance());
            strData.put("cdw_paye", getCDWPAYE());
            strData.put("cdw_nssf", getCDWNSSF());
            strData.put("cdw_photo", getCDWIdNumber() + strCDW + ".png");

            if (validateCDW()) {
                cdwModel.addNewData(strData);

                resetCDWData();
            }

        } catch (IOException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StaffRegistrationDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setBCMData() {
        setBCMChairPerson("");
        setBCMSecretary("");
        setBCMOthers("");
    }

    private void setDEEData() {
        setDEEChairPerson("");
        setDEESecretary("");
        setDEEOthers();
    }

    private boolean validateDEE() {
        return !getDEEChairPerson().equals("") && !getDEESecretary().equals("")
                && !getDEEOthers().equals("");

    }

    public void saveDEEData() {
        try {
            setDEEData();

            Map<String, String> strData = new LinkedHashMap<>();
            strData.put("ester_id", String.valueOf(gen.getMillTime()));
            strData.put("ester_chairman", getDEEChairPerson());
            strData.put("ester_secretary", getDEESecretary());
            strData.put("ester_others", getDEEOthers().replace(",", ";"));

            if (validateDEE()) {
                deeModel.addNewData(strData);
                resetDEEData();
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StaffRegistrationDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean validateBCM() {
        return !getBCMChairPerson().equals("")
                && !getBCMSecretary().equals("") && !getBCMOthers().equals("");
    }

    public void saveBCMData() {
        try {
            setBCMData();
            Map<String, String> strData = new LinkedHashMap<>();
            strData.put("commitee_id", String.valueOf(gen.getMillTime()));
            strData.put("commitee_chairman", getBCMChairPerson());
            strData.put("commitee_secretary", getBCMSecretary());
            strData.put("commitee_others", getBCMOthers().replace(",", ";"));

            if (validateBCM()) {
                bcmModel.addNewData(strData);
                //RESET DATA
                resetBCMData();
            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StaffRegistrationDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean validateCYT() {
        return !getCYTIDNumber().equals("") && !getCYTFullName().equals("") && !getCYTSex().equals("")
                && !getCYTHire().equals("") && !getCYTDesignation().equals("") && !getCYTEducationLevel().equals("")
                && !getCYTSalary().equals("") && lbl[1].getText().equals("photo");

    }

    public void saveCYTData() {
        try {
            setCYTData();
            setCYTPhot();
            createDir();
            strCYT = String.valueOf(gen.getMillTime());
            //SAVE THE IMAgetCYTIDNumber()GES
            ImageIO.write(scldImgCYT, "png", new File(dirName + "\\" + getCYTIDNumber() + strCYT + ".png"));

            Map<String, String> strData = new LinkedHashMap<>();
            strData.put("cyt_id", getCYTIDNumber());
            strData.put("cyt_fullname", getCYTFullName());
            strData.put("cyt_sex", getCYTSex());
            strData.put("cyt_hire_date", getCYTHire());
            strData.put("cyt_designation", getCYTDesignation());
            strData.put("cyt_education_level", getCYTEducationLevel());
            strData.put("cyt_salary", getCYTSalary());
            strData.put("cyt_photo", getCYTIDNumber() + strCYT + ".png");

            if (validateCYT()) {
                cytModel.addNewData(strData);
                resetCYTData();

            }
        } catch (IOException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StaffRegistrationDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resetCDWData() {
        txt[2].setText("");
        txt[3].setText("");
        txt[4].setText("");
        txt[5].setText("");
        txt[6].setText("");
        txt[7].setText("");
        txt[8].setText("");
        txt[9].setText("");
        txt[16].setText("");
        cmbx[1].setSelectedIndex(0);
        cmbx[0].setSelectedIndex(0);
        lbl[0].setIcon(null);
        lbl[0].setText("photo");
        dtChooser[0].setDate(null);

        txt[2].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[3].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[4].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[5].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[6].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[7].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[8].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[9].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[16].setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmbx[0].setBorder(javax.swing.BorderFactory.createCompoundBorder());
        cmbx[1].setBorder(javax.swing.BorderFactory.createCompoundBorder());
        dtChooser[0].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lbl[0].setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2, false));

    }

    public void resetBCMData() {
        txtArea[0].setText("");
        txt[0].setText("");
        txt[1].setText("");
        txt[0].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[1].setBorder(javax.swing.BorderFactory.createEtchedBorder());

    }

    public void setCYTPhot(){
        if(lbl[1].getText().equals("photo")){
            errorDetect(lbl[1]);
        }
    }
    public void resetCYTData() {
        txt[10].setText("");
        txt[11].setText("");
        txt[12].setText("");
        txt[13].setText("");
        cmbx[2].setSelectedIndex(0);
        cmbx[3].setSelectedIndex(0);
        dtChooser[1].setDate(null);
        lbl[1].setIcon(null);
        lbl[1].setText("photo");
        
        txt[10].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[11].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[12].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt[13].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        
         cmbx[2].setBorder(javax.swing.BorderFactory.createCompoundBorder());
          cmbx[3].setBorder(javax.swing.BorderFactory.createCompoundBorder());
          lbl[1].setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2, false));
     }

    public void resetDEEData() {
        txt[14].setText("");
        txt[15].setText("");
        txtArea[1].setText("");
        
        txt[14].setBorder(javax.swing.BorderFactory.createEtchedBorder());
                txt[15].setBorder(javax.swing.BorderFactory.createEtchedBorder());
    }

    public void setBCMOthers(String strOthers) {
        
        strBCMOthers = txtArea[0].getText();
    }

    public void setDEEOthers() {
        strDEEOthers = txtArea[1].getText();
    }

    //GETTER METHODS
    public String getCDWFullName() {
        return strCDWFullName;
    }

    public String getBCMOthers() {
        return strBCMOthers;
    }

    public String getDEEOthers() {
        return strDEEOthers;
    }

    public String getCDWHire() {
        return strCDWHire;
    }

    public String getCYTHire() {
        return strCYTHire;
    }

    public String getCYTEducationLevel() {
        return strCTYEducationLevel;
    }

    public String getCYTSex() {
        return strCYTSex;
    }

    public String getCDWSex() {
        return strCDWSex;
    }

    public String getCDWEducationalLevel() {
        return strCDWEducationLevel;
    }

    public String getDEESecretary() {
        return strDEESecretary;
    }

    public String getDEEChairPerson() {
        return strDEEChairPerson;
    }

    public String getCYTSalary() {
        return strCYTSalary;
    }

    public String getCYTIDNumber() {
        return strCYTIDNumber;
    }

    public String getCYTFullName() {
        return strCYTFullName;
    }

    public String getCYTDesignation() {
        return strCYTDesignation;
    }

    public String getCDWTransportAllowance() {
        return strCDWTransportAllowance;
    }

    public String getCDWPAYE() {
        return strCDWPAYE;
    }

    public String getCDWNSSF() {
        return strCDWNSSF;
    }

    public String getCDWMedicalAllowance() {
        return strCDWMedicalAllowance;
    }

    public String getCDWIdNumber() {
        return strCDWIdNumber;
    }

    public String getCDWHouseAllowance() {
        return strCDWHouseAllowance;
    }

    public String getCDWDesignation() {
        return strCDWDesignation;
    }

    public String getCDWBasicSalary() {
        return strCDWBasicSalary;
    }

    public String getBCMSecretary() {
        return strBCMSecretary;
    }

    public String getBCMChairPerson() {
        return strBCMChairPerson;
    }

    @Override
    public void setData() {
    }

    private void setCDWData() {
        setCDWIdNumber("");
        setCDWFullName("");
        setCDWSex();
        setCDWDesignation("");
        setCDWEducationalLevel();
        setCDWBasicSalary("");
        setCDWHouseAllowance("");
        setCDWTransportAllowance("");
        setCDWMedicalAllowance("");
        setCDWPAYE("");
        setCDWNSSF("");
        setCDWPhot();
        setCDWHire();
        

    }

    private void setCYTData() {
        setCYTDesignation("");
        setCYTFullName("");
        setCYTIDNumber("");
        setCYTSalary("");
        setCYTEducationalLevel();
        setCYTSex();
        setCYTPhot();
        setCYTHire();
    }

    @Override
    public void resetInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetBorder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validateData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
