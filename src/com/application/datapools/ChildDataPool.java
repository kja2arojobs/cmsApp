/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.datapools;

import com.application.controllers.GuiCmbxListener;
import com.application.controllers.GuiRadioButtonListener;
import com.application.controllers.JGuiButtonListener;
import com.application.models.ChildBioModel;
import com.application.models.ChildFatherModel;
import com.application.models.ChildMotherModel;
import com.library.Generators;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.imgscalr.Scalr;

/**
 *
 * @author kadhush
 */
public class ChildDataPool extends DataPool {

    private static JTextField[] chldTxt;
    private static JTextArea[] chldTxtArea;
    private static JCheckBox[] chldChkBx;
    private static JComboBox[] chldCmbx;
    private static JRadioButton[] chldRb;
    private static JButton[] chldBtn;
    private static JLabel[] chldLbl;

    private static final Generators gen = new Generators();
    private static final ChildFatherModel cfModel = new ChildFatherModel();
    private static final ChildBioModel cbModel = new ChildBioModel();
    private static final ChildMotherModel cmModel = new ChildMotherModel();

    private static String strChildNo = "", strChildName = "",
            strChildCourse = "", strChldAttendschl = "",
            strChldSchool = "", strChlLivingUnder = "", strChldParents2gether = "",
            strChldParentsMaritalStatus = "", strChldCoordinatorComments = "",
            strChldFatherAlive = "", strChldFatherLivingWithCild = "",
            strChldFatherFinancial = "", strChldFatherHandicapped = "",
            strChldFatherHandicappedHow = "", strChldFatherChronicallyIll = "",
            strChldFatherchronicallyIllHow = "", strChldFatherMentallyIll = "",
            strChldFatherInPrison = "", strChldFatherEmployment = "", strChldFatherDescription = "",
            strChldMotherAlive = "", strChldMotherLivingWithCild = "",
            strChldMotherFinancial = "", strChldMotherHandicapped = "",
            strChldMotherHandicappedHow = "", strChldMotherChronicallyIll = "",
            strChldMotherchronicallyIllHow = "", strChldMotherMentallyIll = "",
            strChldMotherInPrison = "", strChldMotherEmployment = "",
            strChldResidence = "", strChldPhoto = "",
            strChldMotherDescription = "";
    private static String strCDW;
   
    private static BufferedImage srcImg = null, scaledImg = null;
    private static URL imgUrl = null;
    private static ImageIcon imgIcon = null;

    /**
     *
     */
    public static void resetDetails() {
        chldTxt[0].setText("");
        chldTxt[1].setText("");
        chldTxt[2].setText("");
        chldRb[0].setSelected(true);
        chldCmbx[4].setSelectedIndex(0);
        chldCmbx[0].setSelectedIndex(0);
    }

    /**
     *
     * @param txt
     * @param txtArea
     * @param chkBx
     * @param cmbx
     * @param rb
     * @param btn
     * @param lbl
     */
    public void setChildControls(JTextField[] txt, JTextArea[] txtArea, JCheckBox[] chkBx, JComboBox[] cmbx, JRadioButton[] rb, JButton[] btn, JLabel[] lbl) {

        JGuiButtonListener guiBtnL = new JGuiButtonListener();
        GuiRadioButtonListener guiRbL = new GuiRadioButtonListener();
        GuiCmbxListener guiCmbxL = new GuiCmbxListener();

        chldTxt = txt;
        chldTxtArea = txtArea;
        chldChkBx = chkBx;
        chldCmbx = cmbx;
        chldRb = rb;
        chldBtn = btn;

        //BUTTONSADMIN
        guiBtnL.setChildRegistrationBtn(btn);
        chldBtn[0].addActionListener(guiBtnL);
        chldBtn[1].addActionListener(guiBtnL);
        chldBtn[2].addActionListener(guiBtnL);

        guiRbL.setChildRbControls(rb);
        chldRb[0].addItemListener(guiRbL);
        chldRb[1].addItemListener(guiRbL);
        chldRb[2].addItemListener(guiRbL);

        guiCmbxL.setChildCmbxControl(cmbx);
        chldCmbx[4].addItemListener(guiCmbxL);
        chldLbl = lbl;

    }

    //SETTERS
    public void setChildResidence(String strResidence) {
        if (strResidence.equals("")) {
            if (chldTxt[3].getText().equals("")) {
                errorDetect(chldTxt[3]);
            } else {
                strChldResidence = chldTxt[3].getText().trim()+":;;";
            }
        } else {
            strChldResidence = strResidence+":;;";
        }
    }

    /**
     *
     * @param strNo
     */
    public void setChildNo(String strNo) {
        if (chldTxt[0].getText().equals("")) {
            errorDetect(chldTxt[0]);
        } else {
            strChildNo = chldTxt[0].getText().trim().toUpperCase() + "::;";
        }

    }

    /**
     *
     * @param strName
     */
    public void setChildName(String strName) {
        if (chldTxt[1].getText().equals("")) {
            errorDetect(chldTxt[1]);
        } else {
            strChildName = chldTxt[1].getText().trim().toUpperCase() +"::;";
        }
    }

    /**
     *
     * @param strCourse
     */
    public void setChildCourseofStudy(String strCourse) {

        if (chldTxt[2].isEnabled()) {
            if (chldTxt[2].getText().equals("")) {
                errorDetect(chldTxt[2]);
            } else {
                strChildCourse = chldTxt[2].getText().trim().toUpperCase()+"::;";
            }

        }

    }

    /**
     *
     * @param strAttendSchl
     */
    public void setChildAttendingSchool(String strAttendSchl) {

        if (chldRb[0].isSelected()) {
            strChldAttendschl = "No" +"::;";
        } else if (chldRb[1].isSelected()) {
            strChldAttendschl = "Yes" +"::;";
        }
    }

    /**
     *
     * @param strSchool
     */
    public void setChildSchool(String strSchool) {
        if (chldCmbx[4].isEnabled()) {
            if (chldCmbx[4].getSelectedIndex() == 0) {
                errorDetect(chldCmbx[4]);
            } else {
                strChldSchool = chldCmbx[4].getSelectedItem().toString().toUpperCase() +"::;";
            }

        }
    }

    /**
     *
     * @param strLivingUnder
     */
    public void setChildLivingUnderSuperVisionOf(String strLivingUnder) {
        if (chldCmbx[0].getSelectedIndex() == 0) {
            errorDetect(chldCmbx[0]);
        } else {
            strChlLivingUnder = chldCmbx[0].getSelectedItem().toString().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strParents2gether
     */
    public void setChildParentsTogether(String strParents2gether) {
        if (chldRb[40].isSelected()) {
            strChldParents2gether = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[41].isSelected()) {
            strChldParents2gether = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[42].isSelected()) {
            strChldParents2gether = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strMarital
     */
    public void setChildParentsMarital(String strMarital) {
        if (chldCmbx[2].getSelectedIndex() == 0) {
            errorDetect(chldCmbx[2]);
        } else {
            strChldParentsMaritalStatus = chldCmbx[2].getSelectedItem().toString().toUpperCase()+"::;";
        }

    }

    /**
     *
     * @param strFatherAlive
     */
    public void setChildFatherIsAlive(String strFatherAlive) {
        if (chldRb[2].isSelected()) {
            strChldFatherAlive = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[3].isSelected()) {
            strChldFatherAlive = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[4].isSelected()) {
            strChldFatherAlive = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strMotherAlive
     */
    public void setChildMotherIsAlive(String strMotherAlive) {
        if (chldRb[21].isSelected()) {
            strChldMotherAlive = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[22].isSelected()) {
            strChldMotherAlive = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[23].isSelected()) {
            strChldMotherAlive = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strFatherLivingWithChilAd
     */
    public void setChildFatherLivingWithChild(String strFatherLivingWithChilAd) {

        if (chldRb[16].isSelected()) {
            strChldFatherLivingWithCild = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[17].isSelected()) {
            strChldFatherLivingWithCild = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strMotherLivingWithChild
     */
    public void setChildMotherLivingWithChild(String strMotherLivingWithChild) {
        if (chldRb[34].isSelected()) {
            strChldMotherLivingWithCild = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[35].isSelected()) {
            strChldMotherLivingWithCild = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strFatherFinancially
     */
    public void setChildFatherContributingFinancially(String strFatherFinancially) {
        if (chldRb[8].isSelected()) {
            strChldFatherFinancial = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[9].isSelected()) {
            strChldFatherFinancial = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strMotherFinancially
     */
    public void setChildMotherContributingFinancially(String strMotherFinancially) {

        if (chldRb[27].isSelected()) {
            strChldMotherFinancial = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[28].isSelected()) {
            strChldMotherFinancial = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strFatherHandicapped
     */
    public void setChildFatherHandicapped(String strFatherHandicapped) {

        if (chldRb[10].isSelected()) {
            strChldFatherHandicapped = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[11].isSelected()) {
            strChldFatherHandicapped = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[12].isSelected()) {
            strChldFatherHandicapped = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strMotherHandicapped
     */
    public void setChildMotherHandicapped(String strMotherHandicapped) {

        if (chldRb[29].isSelected()) {
            strChldMotherHandicapped = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[30].isSelected()) {
            strChldMotherHandicapped = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[31].isSelected()) {
            strChldMotherHandicapped = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strFatherHandicappedHow
     */
    public void setChildFatherHandicappedHow(String strFatherHandicappedHow) {
        strChldFatherHandicappedHow = chldTxtArea[1].getText().trim().toUpperCase().equals("") ? "N/A"+"::;" :chldTxtArea[1].getText().trim().toUpperCase()+"::;";
    }

    /**
     *
     * @param strMotherHandicappedHow
     */
    public void setChildMotherHandicappedHow(String strMotherHandicappedHow) {
        strChldMotherHandicappedHow = chldTxtArea[3].getText().trim().toUpperCase().equals("")?"N/A"+"::;":chldTxtArea[3].getText().trim().toUpperCase()+"::;";
    }

    /**
     *
     * @param strFatherChronicallyIll
     */
    public void setChildFatherChronicallyIll(String strFatherChronicallyIll) {

        if (chldRb[5].isSelected()) {
            strChldFatherChronicallyIll = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[6].isSelected()) {
            strChldFatherChronicallyIll = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[7].isSelected()) {
            strChldFatherChronicallyIll = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strMotherChronicallyIll
     */
    public void setChildMotherChronicallyIll(String strMotherChronicallyIll) {

        if (chldRb[24].isSelected()) {
            strChldMotherChronicallyIll = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[25].isSelected()) {
            strChldMotherChronicallyIll = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[26].isSelected()) {
            strChldMotherChronicallyIll = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strFatherChronicallyIllHow
     */
    public void setChildFatherChronicallyIllHow(String strFatherChronicallyIllHow) {
        strChldFatherchronicallyIllHow = chldTxtArea[0].getText().trim().toUpperCase().equals("") ? "N/A"+"::;":chldTxtArea[0].getText().trim().toUpperCase()+"::;";
    }

    /**
     *
     * @param strMotherChronicallyIllHow
     */
    public void setChildMotherChronicallyIllHow(String strMotherChronicallyIllHow) {
        strChldMotherchronicallyIllHow = chldTxtArea[2].getText().trim().toUpperCase().equals("") ?"N/A"+"::;":chldTxtArea[2].getText().trim().toUpperCase()+"::;";
    }

    /**
     *
     * @param strFatherMentally
     */
    public void setChildFatherMentallyIll(String strFatherMentally) {
        if (chldRb[19].isSelected()) {
            strChldFatherMentallyIll = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[20].isSelected()) {
            strChldFatherMentallyIll = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[18].isSelected()) {
            strChldFatherMentallyIll = "Yes".trim().toUpperCase()+"::;";
        }

    }

    /**
     *
     * @param strMotherMentally
     */
    public void setChildMotherMentallyIll(String strMotherMentally) {

        if (chldRb[36].isSelected()) {
            strChldMotherMentallyIll = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[37].isSelected()) {
            strChldMotherMentallyIll = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[38].isSelected()) {
            strChldMotherMentallyIll = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strFatherInPrison
     */
    public void setChildFatherInPrison(String strFatherInPrison) {

        if (chldRb[13].isSelected()) {
            strChldFatherInPrison = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[14].isSelected()) {
            strChldFatherInPrison = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[15].isSelected()) {
            strChldFatherInPrison = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strMotherInprison
     */
    public void setChildMotherInPrison(String strMotherInprison) {

        if (chldRb[32].isSelected()) {
            strChldMotherInPrison = "No".trim().toUpperCase()+"::;";
        } else if (chldRb[33].isSelected()) {
            strChldMotherInPrison = "Unknown".trim().toUpperCase()+"::;";
        } else if (chldRb[39].isSelected()) {
            strChldMotherInPrison = "Yes".trim().toUpperCase()+"::;";
        }
    }

    /**
     *
     * @param strFatherEmployment
     */
    public void setChildFatherEmployment(String strFatherEmployment) {
        if (chldCmbx[1].getSelectedIndex() == 0) {
            errorDetect(chldCmbx[1]);
        } else {
            strChldFatherEmployment = chldCmbx[1].getSelectedItem().toString().toUpperCase()+"::;";
        }

    }

    /**
     *
     * @param strMotherEmployment
     */
    public void setChildMotherEmployment(String strMotherEmployment) {
        if (chldCmbx[3].getSelectedIndex() == 0) {
            errorDetect(chldCmbx[3]);
        } else {
            strChldMotherEmployment = chldCmbx[3].getSelectedItem().toString().toUpperCase()+"::;";
        }

    }

    /**
     *
     * @param strFatherDescription
     */
    public void setChildFatherDescription(String strFatherDescription) {
        strChldFatherDescription = "";
        //Vector<String> strDescrpt = new Vector();
        ArrayList<String> strDescrpt = new ArrayList<>();
        strDescrpt.clear();

        if (chldChkBx[1].isSelected()) {
            strDescrpt.add("Farmer ".trim().toUpperCase());
        }
        if (chldChkBx[4].isSelected()) {
            strDescrpt.add("Sales in Market".trim().toUpperCase());
        }
        if (chldChkBx[0].isSelected()) {
            strDescrpt.add("Church Worker".trim().toUpperCase());
        }
        if (chldChkBx[3].isSelected()) {
            strDescrpt.add("Project Worker".trim().toUpperCase());
        }
        if (chldChkBx[5].isSelected()) {
            strDescrpt.add("Teacher".trim().toUpperCase());
        }
        if (chldChkBx[2].isSelected()) {
            strDescrpt.add("Laborer".trim().toUpperCase());
        }
        if (chldChkBx[13].isSelected()) {
            strDescrpt.add("Other".trim().toUpperCase());
        }

        strChldFatherDescription = strDescrpt.toString();
        strChldFatherDescription = strChldFatherDescription.substring(1, strChldFatherDescription.length() - 1).replace(",", ";")+"::;";

    }

    public void setPhoto() {

        //OPEN FILE CHOOSER
        Cursor rs = new Cursor(Cursor.WAIT_CURSOR);
        chldLbl[0].setCursor(rs);
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showDialog(chldBtn[2], "Attach");
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Images files", new String[]{"png", "jpg", "jepg", "gif"}));
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {

                Image image = ImageIO.read(fc.getSelectedFile());
                srcImg = ImageIO.read(fc.getSelectedFile());
                scaledImg = Scalr.resize(srcImg, Scalr.Method.SPEED, Scalr.Mode.AUTOMATIC, 102, 102, Scalr.OP_ANTIALIAS);
                ImageIO.read(fc.getSelectedFile());
                chldLbl[0].setText("");
                chldLbl[0].setIcon(new ImageIcon(scaledImg));

            } catch (IOException ex) {
                Logger.getLogger(StaffRegistrationDataPool.class.getName()).log(Level.SEVERE, null, ex);
            }
            Cursor ns = new Cursor(Cursor.DEFAULT_CURSOR);
            chldLbl[0].setCursor(ns);
        }
    }

    /**
     *
     * @param strMotherDescription
     */
    public void setChildMotherDescription(String strMotherDescription) {
        strChldMotherDescription = "";
        ArrayList<String> strDescrpt = new ArrayList<>();
        strDescrpt.clear();

        if (chldChkBx[7].isSelected()) {
            strDescrpt.add("Farmer".trim().toUpperCase());
        }
        if (chldChkBx[11].isSelected()) {
            strDescrpt.add("Sales in Market".trim().toUpperCase());
        }
        if (chldChkBx[6].isSelected()) {
            strDescrpt.add("Church Worker".trim().toUpperCase());
        }
        if (chldChkBx[10].isSelected()) {
            strDescrpt.add("Project Worker".trim().toUpperCase());
        }
        if (chldChkBx[12].isSelected()) {
            strDescrpt.add("Teacher".trim().toUpperCase());
        }
        if (chldChkBx[8].isSelected()) {
            strDescrpt.add("Laborer".trim().toUpperCase());
        }
        if (chldChkBx[9].isSelected()) {
            strDescrpt.add("Other".trim().toUpperCase());
        }

        strChldMotherDescription = strDescrpt.toString();

        strChldMotherDescription = strChldMotherDescription.substring(1, strChldMotherDescription.length() - 1).replace(",", ";")+"::;";
    }

    /**
     *
     * @param strChildDescription
     */
    public void setChildDescription(String strChildDescription) {
        strChldCoordinatorComments = chldTxtArea[4].getText().trim().toUpperCase().equals("")?"N/A"+"::;":chldTxtArea[4].getText().trim().toUpperCase()+"::;";
    }

    //GETTER METHODS
    /**
     *
     * @return
     */
    public String getChildNo() {
        return strChildNo;
    }

    public String getChildResidence() {
        return strChldResidence;
    }

    /**
     *
     * @return
     */
    public String getChildName() {
        return strChildName;
    }

    /**
     *
     * @return
     */
    public String getChildCourseofStudy() {
        return strChildCourse;
    }

    /**
     *
     * @return
     */
    public String getChildAttendingSchool() {
        return strChldAttendschl;
    }

    /**
     *
     * @return
     */
    public String getChildSchool() {
        return strChldSchool;
    }

    /**
     *
     * @return
     */
    public String getChildLivingUnderSuperVisionOf() {
        return strChlLivingUnder;
    }

    /**
     *
     * @return
     */
    public String getChildParentsTogether() {
        return strChldParents2gether;
    }

    /**
     *
     * @return
     */
    public String getChildParentsMarital() {
        return strChldParentsMaritalStatus;
    }

    /**
     *
     * @return
     */
    public String getChildFatherIsAlive() {
        return strChldFatherAlive;
    }

    /**
     *
     * @return
     */
    public String getChildMotherIsAlive() {
        return strChldMotherAlive;
    }

    /**
     *
     * @return
     */
    public String getChildFatherLivingWithChild() {
        return strChldFatherLivingWithCild;
    }

    /**
     *
     * @return
     */
    public String getChildMotherLivingWithChild() {
        return strChldMotherLivingWithCild;
    }

    public String getChildDescription() {
        return strChldCoordinatorComments;
    }

    public String getChildFatherContributingFinancially() {
        return strChldFatherFinancial;
    }

    public String getChildFatherHandicapped() {
        return strChldFatherHandicapped;
    }

    public String getChildFatherHandicappedHow() {
        return strChldFatherHandicappedHow;
    }

    public String getChildFatherChronicallyIll() {
        return strChldFatherChronicallyIll;
    }

    public String getChildFatherChronicallyIllHow() {
        return strChldFatherchronicallyIllHow;
    }

    public String getChildFatherMentallyIll() {
        return strChldFatherMentallyIll;
    }

    public String getChildFatherInPrison() {
        return strChldFatherInPrison;
    }

    public String getChildFatherEmployment() {
        return strChldFatherEmployment;
    }

    public String getChildFatherDescription() {
        return strChldFatherDescription;
    }

    /**
     *
     * @return
     */
    public String getChildMotherContributingFinancially() {
        return strChldMotherFinancial;
    }

    public String getChildMotherHandicapped() {
        return strChldMotherHandicapped;
    }

    public String getChildMotherHandicappedHow() {
        return strChldMotherHandicappedHow;
    }

    public String getChildMotherChronicallyIll() {
        return strChldMotherChronicallyIll;
    }

    public String getChildMotherChronicallyIllHow() {
        return strChldMotherchronicallyIllHow;
    }

    public String getChildMotherMentallyIll() {
        return strChldMotherMentallyIll;
    }

    public String getChildMotherInPrison() {
        return strChldMotherInPrison;
    }

    public String getChildMotherEmployment() {
        return strChldMotherEmployment;
    }

    public String getChildMotherDescription() {
        return strChldMotherDescription;
    }

    public void childBioDetails() {

        try {

            strCDW = String.valueOf(gen.getMillTime());
            //SAVE THE IMAGES
            ImageIO.write(scaledImg, "png", new File(gen.getImageURL() + "\\" + getChildNo().substring(0, getChildNo().length()-3).trim() + strCDW + ".png"));

        } catch (IOException ex) {
            Logger.getLogger(ChildDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @return
     */
    public void childFatherDetails() {

    }

    /**
     *
     * @return
     */
    public void childMotherDetails() {

    }

    public void setRegistationData() {
        try {

            childBioDetails();
            Map<String, String> childBioData = new LinkedHashMap<>();
            childBioData.clear();
            childBioData.put("chld_no", getChildNo());
            childBioData.put("chld_name", getChildName());
            childBioData.put("chld_att_schl", getChildAttendingSchool());
            childBioData.put("chld_schl", getChildSchool());
            childBioData.put("chld_course", getChildCourseofStudy());
            childBioData.put("under_supervision", getChildLivingUnderSuperVisionOf());
            childBioData.put("parents_together", getChildParentsTogether());
            childBioData.put("parents_marital", getChildParentsMarital());
            childBioData.put("coordinator_project", getChildDescription());
            childBioData.put("chld_residence", getChildResidence());
            childBioData.put("chld_photo", getChildNo().substring(0, getChildNo().length()-3).trim() + strCDW + ".png");

            cbModel.addNewData(childBioData);

            childMotherDetails();
            Map<String, String> childMData = new LinkedHashMap<>();
            childMData.clear();

            childMData.put("id_m", String.valueOf(gen.getMillTime()));
            childMData.put("chld_no_m", getChildNo());
            childMData.put("alive_m", getChildMotherIsAlive());
            childMData.put("live_chld_m", getChildMotherLivingWithChild());
            childMData.put("finance_chld_m", getChildMotherContributingFinancially());
            childMData.put("handicapped_m", getChildMotherHandicapped());
            childMData.put("how_handicapped_m", getChildMotherHandicappedHow());
            childMData.put("chronically_ill_m", getChildMotherChronicallyIll());
            childMData.put("how_chronically_m", getChildMotherChronicallyIllHow());
            childMData.put("mentally_ill_m", getChildMotherMentallyIll());
            childMData.put("in_prison_m", getChildMotherInPrison());
            childMData.put("employment_m", getChildMotherEmployment());
            childMData.put("description_m", getChildMotherDescription());

            cmModel.addNewData(childMData);

            childFatherDetails();
            Map<String, String> childFData = new LinkedHashMap<>();
            childFData.clear();

            childFData.put("id_f", String.valueOf(gen.getMillTime()));
            childFData.put("chld_no_f", getChildNo());
            childFData.put("alive_f", getChildFatherIsAlive());
            childFData.put("live_chld_f", getChildFatherLivingWithChild());
            childFData.put("finance_chld_f", getChildFatherContributingFinancially());
            childFData.put("handicapped_f", getChildFatherHandicapped());
            childFData.put("how_handicapped_f", getChildFatherHandicappedHow());
            childFData.put("chronically_ill_f", getChildFatherChronicallyIll());
            childFData.put("how_chronically_f", getChildFatherChronicallyIllHow());
            childFData.put("mentally_ill_f", getChildFatherMentallyIll());
            childFData.put("in_prison_f", getChildFatherInPrison());
            childFData.put("employment_f", getChildFatherEmployment());
            childFData.put("description_f", getChildFatherDescription());

            cfModel.addNewData(childFData);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ChildDataPool.class.getName()).log(Level.SEVERE, null, ex);
            // JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /**
     *
     */
    public void activateCmbxSchool() {
        chldCmbx[4].setEnabled(true);
        chldCmbx[4].setSelectedIndex(0);
    }

    /**
     *
     */
    public void deactivateCmbxSchool() {
        chldCmbx[4].setSelectedIndex(0);
        chldCmbx[4].setEnabled(false);
    }

    /**
     *
     */
    public void activateTxtCourse() {
        chldTxt[2].setEnabled(true);
        chldTxt[2].setText("");
    }

    /**
     *
     */
    public void deactivateTxtCourse() {
        chldTxt[2].setText("");
        chldTxt[2].setEnabled(false);
    }

    public void setChildPhoto() {
        if (chldLbl[0].getText().equals("photo")) {
            errorDetect(chldLbl[0]);
        }
    }

    /**
     *
     */
    @Override
    public void setData() {
        setChildNo(null);
        setChildName(null);
        setChildCourseofStudy(null);
        setChildAttendingSchool(null);
        setChildSchool(null);
        setChildLivingUnderSuperVisionOf(null);
        setChildParentsTogether(null);
        setChildParentsMarital(null);
        setChildFatherIsAlive(null);
        setChildMotherIsAlive(null);
        setChildFatherLivingWithChild(null);
        setChildMotherLivingWithChild(null);
        setChildFatherContributingFinancially(null);
        setChildMotherContributingFinancially(null);
        setChildFatherHandicapped(null);
        setChildMotherHandicapped(null);
        setChildFatherHandicappedHow(null);
        setChildMotherHandicappedHow(null);
        setChildFatherChronicallyIll(null);
        setChildMotherChronicallyIll(null);
        setChildFatherChronicallyIllHow(null);
        setChildMotherChronicallyIllHow(null);
        setChildFatherMentallyIll(null);
        setChildMotherMentallyIll(null);
        setChildFatherInPrison(null);
        setChildMotherInPrison(null);
        setChildFatherEmployment(null);
        setChildMotherEmployment(null);
        setChildFatherDescription(null);
        setChildMotherDescription(null);
        setChildDescription(null);
        setChildResidence("");
        setChildPhoto();
    }

    /**
     *
     */
    @Override
    public void resetInput() {

        chldRb[0].setSelected(true);
        chldRb[1].setSelected(true);
        chldRb[2].setSelected(true);
        chldRb[3].setSelected(true);
        chldRb[4].setSelected(true);
        chldRb[5].setSelected(true);
        chldRb[6].setSelected(true);
        chldRb[7].setSelected(true);
        chldRb[8].setSelected(true);
        chldRb[9].setSelected(true);
        chldRb[10].setSelected(true);
        chldRb[11].setSelected(true);
        chldRb[12].setSelected(true);
        chldRb[13].setSelected(true);
        chldRb[14].setSelected(true);
        chldRb[15].setSelected(true);

        chldTxt[0].setText("");
        chldTxt[1].setText("");
        chldTxt[2].setText("");
        chldTxt[3].setText("");

        chldTxtArea[0].setText("");
        chldTxtArea[1].setText("");
        chldTxtArea[2].setText("");
        chldTxtArea[3].setText("");
        chldTxtArea[4].setText("");

        chldChkBx[0].setSelected(false);
        chldChkBx[1].setSelected(false);
        chldChkBx[2].setSelected(false);
        chldChkBx[3].setSelected(false);
        chldChkBx[4].setSelected(false);
        chldChkBx[5].setSelected(false);
        chldChkBx[6].setSelected(false);
        chldChkBx[7].setSelected(false);
        chldChkBx[8].setSelected(false);
        chldChkBx[9].setSelected(false);
        chldChkBx[10].setSelected(false);
        chldChkBx[11].setSelected(false);
        chldChkBx[12].setSelected(false);
        chldChkBx[13].setSelected(false);

        chldCmbx[0].setSelectedIndex(0);
        chldCmbx[1].setSelectedIndex(0);
        chldCmbx[2].setSelectedIndex(0);
        chldCmbx[3].setSelectedIndex(0);
        chldCmbx[4].setSelectedIndex(0);
        chldLbl[0].setIcon(null);
        chldLbl[0].setText("photo");

    }

    /**
     *
     */
    @Override
    public void resetBorder() {
        chldCmbx[0].setBorder(javax.swing.BorderFactory.createCompoundBorder());
        chldCmbx[1].setBorder(javax.swing.BorderFactory.createCompoundBorder());
        chldCmbx[2].setBorder(javax.swing.BorderFactory.createCompoundBorder());
        chldCmbx[3].setBorder(javax.swing.BorderFactory.createCompoundBorder());
        chldCmbx[4].setBorder(javax.swing.BorderFactory.createCompoundBorder());

        chldTxt[0].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        chldTxt[1].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        chldTxt[2].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        chldTxt[3].setBorder(javax.swing.BorderFactory.createEtchedBorder());
        chldLbl[0].setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 2, false));
    }

    /**
     *
     * @return
     */
    @Override
    public boolean validateData() {
        setData();
        return !chldTxt[0].getText().equals("") && !chldTxt[1].getText().equals("")
                && chldCmbx[0].getSelectedIndex() != 0 && chldCmbx[1].getSelectedIndex() != 0
                && chldCmbx[2].getSelectedIndex() != 0 && chldCmbx[3].getSelectedIndex() != 0 && !chldLbl[0].getText().equals("photo");
    }

}
