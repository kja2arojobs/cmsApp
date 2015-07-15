/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.datapools;

import com.application.controllers.GuiCheckBxListener;
import com.application.controllers.GuiCmbxListener;
import com.application.controllers.GuiRadioButtonListener;
import com.application.controllers.GuiTablesListener;
import com.application.controllers.GuiTxtListener;
import com.application.controllers.JGuiButtonListener;
import com.application.models.ChildBioModel;
import com.application.models.ChildDataModel;
import com.application.models.ChildFatherModel;
import com.application.models.ChildMotherModel;
import com.library.Generators;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import org.imgscalr.Scalr;

/**
 *
 * @author kadhush
 */
public class ChildUpdateDetailsDataPool extends DataPool {

    private static Vector<String> cols;
    private static final ChildFatherModel cfModel = new ChildFatherModel();
    private static final ChildBioModel cbModel = new ChildBioModel();
    private static final ChildMotherModel cmModel = new ChildMotherModel();
    private static final Generators gen = new Generators();
     private static final ChildDataModel cdModel = new ChildDataModel();

    private static JTextField[] txt;
    private static JTextArea[] txtArea;
    private static JCheckBox[] chkbx;
    private static JComboBox[] cmbx;
    private static JRadioButton[] rb;
    private static JButton[] btn;
    private static JPanel[] pn;
    private static JScrollPane[] jscrll;
    private static JLabel[] lbl;

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
            strChldMotherDescription = "", strSelectedChild = "", strUpdateCond = "", strChldResidence = "";
    private TableColumn tm;
    private TableColumn tm2;
    private Vector<Vector> tbData = new Vector<>();
    private String[] iSData;
    private String[] iSData0;
    private Object[] iOData;
    private Object[] iOData0;
    private JTable searchTab;
    JEditorPane htmlPaneS;
    private static String dirName, strCDW;
      private static BufferedImage  srcImg = null, scldImg = null;

    public ChildUpdateDetailsDataPool() {
        cols = new Vector<>();
    }

    public void setDataControls(JTextField[] txtU, JTextArea[] txtAreaU, JCheckBox[] chkbxU, JComboBox[] cmbxU, JRadioButton[] rbU, JButton[] btnU,  JScrollPane[] jp, JLabel[] lblU) {

         JGuiButtonListener guiBtnL = new JGuiButtonListener();
         GuiCheckBxListener cListener = new GuiCheckBxListener();
          GuiTxtListener gtxtListener = new GuiTxtListener();
           GuiRadioButtonListener guiRbL = new GuiRadioButtonListener();
           GuiCmbxListener guiCmbxL = new GuiCmbxListener();

          
        btn = btnU;
        btn[0].addActionListener(guiBtnL);
        btn[1].addActionListener(guiBtnL);
        btn[2].addActionListener(guiBtnL);
        guiBtnL.setChildUpdateControls(btn);
           
        rb = rbU;
        guiRbL.setChildUpdateRbControls(rb);
        rb[0].addItemListener(guiRbL);
        rb[1].addItemListener(guiRbL);
        
        
        cmbx = cmbxU;
         guiCmbxL.setChildUpdataCmbxControl(cmbx);
        cmbx[4].addItemListener(guiCmbxL);

        
        chkbx = chkbxU;
        chkbx[14].addItemListener(cListener);
        chkbx[15].addItemListener(cListener);
        chkbx[16].addItemListener(cListener);
        cListener.setChildUpdateControls(chkbxU);

        txtArea = txtAreaU;

       
        txt = txtU;
        txt[3].addKeyListener(gtxtListener);
        gtxtListener.setChildUpdateControls(txtU);


        jscrll = jp;
        
        lbl = lblU;
    }
      public void setChildResidence(String strResidence){
        if(strResidence.equals("")){
            if(txt[3] .getText().equals("")){
             errorDetect(txt[4] );
            }else{
                strChldResidence = txt[4] .getText().trim();
            }
        }else{
           strChldResidence =  strResidence;
        }
    }

     public void setPhoto(){
    
        //OPEN FILE CHOOSER
        
        Cursor rs = new Cursor(Cursor.WAIT_CURSOR);
        lbl[0].setCursor(rs);
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showDialog(btn[2], "Attach");
        fc.addChoosableFileFilter(new FileNameExtensionFilter("Images files", new String[]{"png", "jpg", "jepg", "gif"}));
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {

                Image image = ImageIO.read(fc.getSelectedFile());
                srcImg = ImageIO.read(fc.getSelectedFile());
                scldImg = Scalr.resize(srcImg, Scalr.Method.SPEED, Scalr.Mode.AUTOMATIC, 102, 102, Scalr.OP_ANTIALIAS);
                ImageIO.read(fc.getSelectedFile());
                lbl[0].setText("");
                lbl[0].setIcon(new ImageIcon(scldImg));

            } catch (IOException ex) {
                Logger.getLogger(StaffRegistrationDataPool.class.getName()).log(Level.SEVERE, null, ex);
            }
            Cursor ns = new Cursor(Cursor.DEFAULT_CURSOR);
            lbl[0].setCursor(ns);
        }
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
     

    public void setChildNo(String strNo) {
        if (txt[0].getText().equals("")) {
            errorDetect(txt[0]);
        } else {
            strChildNo = txt[0].getText().trim().toUpperCase();
        }
    }

    /**
     *
     * @param strName
     */
    public void setChildName(String strName) {
        if (txt[1].getText().equals("")) {
            errorDetect(txt[1]);
        } else {
            strChildName = txt[1].getText().trim().toUpperCase();
        }
    }

    /**
     *
     * @param strCourse
     */
    public void setChildCourseofStudy(String strCourse) {

        if (txt[2].isEnabled()) {
            if (txt[2].getText().equals("")) {
                errorDetect(txt[2]);
            } else {
                strChildCourse = txt[2].getText().trim().toUpperCase();
            }

        }

    }

    /**
     *
     * @param strAttendSchl
     */
    public void setChildAttendingSchool(String strAttendSchl) {

        if (rb[0].isSelected()) {
            strChldAttendschl = "No";
        } else if (rb[1].isSelected()) {
            strChldAttendschl = "Yes";
        }
    }

    /**
     *
     * @param strSchool
     */
    public void setChildSchool(String strSchool) {
        if (cmbx[4].isEnabled()) {
            if (cmbx[4].getSelectedIndex() == 0) {
                errorDetect(cmbx[4]);
            } else {
                strChldSchool = cmbx[4].getSelectedItem().toString().toUpperCase();
            }

        }
    }

    /**
     *
     * @param strLivingUnder
     */
    public void setChildLivingUnderSuperVisionOf(String strLivingUnder) {
        if (cmbx[0].getSelectedIndex() == 0) {
            errorDetect(cmbx[0]);
        } else {
            strChlLivingUnder = cmbx[0].getSelectedItem().toString().toUpperCase();
        }
    }

    /**
     *
     * @param strParents2gether
     */
    public void setChildParentsTogether(String strParents2gether) {
        if (rb[40].isSelected()) {
            strChldParents2gether = "No".trim().toUpperCase();
        } else if (rb[41].isSelected()) {
            strChldParents2gether = "Unknown".trim().toUpperCase();
        } else if (rb[42].isSelected()) {
            strChldParents2gether = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strMarital
     */
    public void setChildParentsMarital(String strMarital) {
        if (cmbx[2].getSelectedIndex() == 0) {
            errorDetect(cmbx[2]);
        } else {
            strChldParentsMaritalStatus = cmbx[2].getSelectedItem().toString().toUpperCase();
        }

    }

    /**
     *
     * @param strFatherAlive
     */
    public void setChildFatherIsAlive(String strFatherAlive) {
        if (rb[2].isSelected()) {
            strChldFatherAlive = "No".trim().toUpperCase();
        } else if (rb[3].isSelected()) {
            strChldFatherAlive = "Unknown".trim().toUpperCase();
        } else if (rb[4].isSelected()) {
            strChldFatherAlive = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strMotherAlive
     */
    public void setChildMotherIsAlive(String strMotherAlive) {
        if (rb[21].isSelected()) {
            strChldMotherAlive = "No".trim().toUpperCase();
        } else if (rb[22].isSelected()) {
            strChldMotherAlive = "Unknown".trim().toUpperCase();
        } else if (rb[23].isSelected()) {
            strChldMotherAlive = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strFatherLivingWithChilAd
     */
    public void setChildFatherLivingWithChild(String strFatherLivingWithChilAd) {

        if (rb[16].isSelected()) {
            strChldFatherLivingWithCild = "No".trim().toUpperCase();
        } else if (rb[17].isSelected()) {
            strChldFatherLivingWithCild = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strMotherLivingWithChild
     */
    public void setChildMotherLivingWithChild(String strMotherLivingWithChild) {
        if (rb[34].isSelected()) {
            strChldMotherLivingWithCild = "No".trim().toUpperCase();
        } else if (rb[35].isSelected()) {
            strChldMotherLivingWithCild = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strFatherFinancially
     */
    public void setChildFatherContributingFinancially(String strFatherFinancially) {
        if (rb[8].isSelected()) {
            strChldFatherFinancial = strChldMotherLivingWithCild = "No".trim().toUpperCase();
        } else if (rb[9].isSelected()) {
            strChldFatherFinancial = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strMotherFinancially
     */
    public void setChildMotherContributingFinancially(String strMotherFinancially) {

        if (rb[27].isSelected()) {
            strChldMotherFinancial = "No".trim().toUpperCase();
        } else if (rb[28].isSelected()) {
            strChldMotherFinancial = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strFatherHandicapped
     */
    public void setChildFatherHandicapped(String strFatherHandicapped) {

        if (rb[10].isSelected()) {
            strChldFatherHandicapped = "No".trim().toUpperCase();
        } else if (rb[11].isSelected()) {
            strChldFatherHandicapped = "Unknown".trim().toUpperCase();
        } else if (rb[12].isSelected()) {
            strChldFatherHandicapped = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strMotherHandicapped
     */
    public void setChildMotherHandicapped(String strMotherHandicapped) {

        if (rb[29].isSelected()) {
            strChldMotherHandicapped = "No".trim().toUpperCase();
        } else if (rb[30].isSelected()) {
            strChldMotherHandicapped = "Unknown".trim().toUpperCase();
        } else if (rb[31].isSelected()) {
            strChldMotherHandicapped = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strFatherHandicappedHow
     */
    public void setChildFatherHandicappedHow(String strFatherHandicappedHow) {
        strChldFatherHandicappedHow = txtArea[1].getText().trim().toUpperCase();
    }

    /**
     *
     * @param strMotherHandicappedHow
     */
    public void setChildMotherHandicappedHow(String strMotherHandicappedHow) {
        strChldMotherHandicappedHow = txtArea[3].getText().trim().toUpperCase();
    }

    /**
     *
     * @param strFatherChronicallyIll
     */
    public void setChildFatherChronicallyIll(String strFatherChronicallyIll) {

        if (rb[5].isSelected()) {
            strChldFatherChronicallyIll = "No".trim().toUpperCase();
        } else if (rb[6].isSelected()) {
            strChldFatherChronicallyIll = "Unknown".trim().toUpperCase();
        } else if (rb[7].isSelected()) {
            strChldFatherChronicallyIll = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strMotherChronicallyIll
     */
    public void setChildMotherChronicallyIll(String strMotherChronicallyIll) {

        if (rb[24].isSelected()) {
            strChldMotherChronicallyIll = "No".trim().toUpperCase();
        } else if (rb[25].isSelected()) {
            strChldMotherChronicallyIll = "Unknown".trim().toUpperCase();
        } else if (rb[26].isSelected()) {
            strChldMotherChronicallyIll = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strFatherChronicallyIllHow
     */
    public void setChildFatherChronicallyIllHow(String strFatherChronicallyIllHow) {
        strChldFatherchronicallyIllHow = txtArea[0].getText().trim().toUpperCase();
    }

    /**
     *
     * @param strMotherChronicallyIllHow
     */
    public void setChildMotherChronicallyIllHow(String strMotherChronicallyIllHow) {
        strChldMotherchronicallyIllHow = txtArea[2].getText().trim().toUpperCase();
    }

    /**
     *
     * @param strFatherMentally
     */
    public void setChildFatherMentallyIll(String strFatherMentally) {
        if (rb[19].isSelected()) {
            strChldFatherMentallyIll = "No".trim().toUpperCase();
        } else if (rb[20].isSelected()) {
            strChldFatherMentallyIll = "Unknown".trim().toUpperCase();
        } else if (rb[18].isSelected()) {
            strChldFatherMentallyIll = "Yes".trim().toUpperCase();
        }

    }

    /**
     *
     * @param strMotherMentally
     */
    public void setChildMotherMentallyIll(String strMotherMentally) {

        if (rb[36].isSelected()) {
            strChldMotherMentallyIll = "No".trim().toUpperCase();
        } else if (rb[37].isSelected()) {
            strChldMotherMentallyIll = "Unknown".trim().toUpperCase();
        } else if (rb[38].isSelected()) {
            strChldMotherMentallyIll = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strFatherInPrison
     */
    public void setChildFatherInPrison(String strFatherInPrison) {

        if (rb[13].isSelected()) {
            strChldFatherInPrison = "No".trim().toUpperCase();
        } else if (rb[14].isSelected()) {
            strChldFatherInPrison = "Unknown".trim().toUpperCase();
        } else if (rb[15].isSelected()) {
            strChldFatherInPrison = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strMotherInprison
     */
    public void setChildMotherInPrison(String strMotherInprison) {

        if (rb[32].isSelected()) {
            strChldMotherInPrison = "No".trim().toUpperCase();
        } else if (rb[33].isSelected()) {
            strChldMotherInPrison = "Unknown".trim().toUpperCase();
        } else if (rb[39].isSelected()) {
            strChldMotherInPrison = "Yes".trim().toUpperCase();
        }
    }

    /**
     *
     * @param strFatherEmployment
     */
    public void setChildFatherEmployment(String strFatherEmployment) {
        if (cmbx[1].getSelectedIndex() == 0) {
            errorDetect(cmbx[1]);
        } else {
            strChldFatherEmployment = cmbx[1].getSelectedItem().toString().toUpperCase();
        }

    }

    /**
     *
     * @param strMotherEmployment
     */
    public void setChildMotherEmployment(String strMotherEmployment) {
        if (cmbx[3].getSelectedIndex() == 0) {
            errorDetect(cmbx[3]);
        } else {
            strChldMotherEmployment = cmbx[3].getSelectedItem().toString().toUpperCase();
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

        if (chkbx[1].isSelected()) {
            strDescrpt.add("Farmer ".trim().toUpperCase());
        }
        if (chkbx[4].isSelected()) {
            strDescrpt.add("Sales in Market".trim().toUpperCase());
        }
        if (chkbx[0].isSelected()) {
            strDescrpt.add("Church Worker".trim().toUpperCase());
        }
        if (chkbx[3].isSelected()) {
            strDescrpt.add("Project Worker".trim().toUpperCase());
        }
        if (chkbx[5].isSelected()) {
            strDescrpt.add("Teacher".trim().toUpperCase());
        }
        if (chkbx[2].isSelected()) {
            strDescrpt.add("Laborer".trim().toUpperCase());
        }
        if (chkbx[13].isSelected()) {
            strDescrpt.add("Other".trim().toUpperCase());
        }

        strChldFatherDescription = strDescrpt.toString();
        strChldFatherDescription = strChldFatherDescription.substring(1, strChldFatherDescription.length() - 1).replace(",", ";");

    }

    /**
     *
     * @param strMotherDescription
     */
    public void setChildMotherDescription(String strMotherDescription) {
        strChldMotherDescription = "";
        ArrayList<String> strDescrpt = new ArrayList<>();
        strDescrpt.clear();

        if (chkbx[7].isSelected()) {
            strDescrpt.add("Farmer".trim().toUpperCase());
        }
        if (chkbx[11].isSelected()) {
            strDescrpt.add("Sales in Market".trim().toUpperCase());
        }
        if (chkbx[6].isSelected()) {
            strDescrpt.add("Church Worker".trim().toUpperCase());
        }
        if (chkbx[10].isSelected()) {
            strDescrpt.add("Project Worker".trim().toUpperCase());
        }
        if (chkbx[12].isSelected()) {
            strDescrpt.add("Teacher".trim().toUpperCase());
        }
        if (chkbx[8].isSelected()) {
            strDescrpt.add("Laborer".trim().toUpperCase());
        }
        if (chkbx[9].isSelected()) {
            strDescrpt.add("Other".trim().toUpperCase());
        }

        strChldMotherDescription = strDescrpt.toString();

        strChldMotherDescription = strChldMotherDescription.substring(1, strChldMotherDescription.length() - 1).replace(",", ";");
    }

    /**
     *
     * @param strChildDescription
     */
    public void setChildDescription(String strChildDescription) {
        strChldCoordinatorComments = txtArea[4].getText().trim().toUpperCase();
    }
 public void setChildPhoto(){
        if(  lbl[0].getText().equals("photo")){
           errorDetect(lbl[0]); 
        }
    }
    //GETTER METHODS
    /**
     *
     * @return
     */
    public String getChildNo() {
        return strChildNo;
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

    /**
     *
     * @return
     */
    public String getChildFatherContributingFinancially() {
        return strChldFatherFinancial;
    }

    /**
     *
     * @return
     */
    public String getChildMotherContributingFinancially() {
        return strChldMotherFinancial;
    }

    /**
     *
     * @return
     */
    public String getChildFatherHandicapped() {
        return strChldFatherHandicapped;
    }

    /**
     *
     * @return
     */
    public String getChildMotherHandicapped() {
        return strChldMotherHandicapped;
    }

    /**
     *
     * @return
     */
    public String getChildFatherHandicappedHow() {
        return strChldFatherHandicappedHow;
    }

    /**
     *
     * @return
     */
    public String getChildMotherHandicappedHow() {
        return strChldMotherHandicappedHow;
    }

    /**
     *
     * @return
     */
    public String getChildFatherChronicallyIll() {
        return strChldFatherChronicallyIll;
    }

    /**
     *
     * @return
     */
    public String getChildMotherChronicallyIll() {
        return strChldMotherChronicallyIll;
    }

    /**
     *
     * @return
     */
    public String getChildFatherChronicallyIllHow() {
        return strChldFatherchronicallyIllHow;
    }

    /**
     *
     * @return
     */
    public String getChildMotherChronicallyIllHow() {
        return strChldMotherchronicallyIllHow;
    }

    /**
     *
     * @return
     */
    public String getChildFatherMentallyIll() {
        return strChldFatherMentallyIll;
    }

    /**
     *
     * @return
     */
    public String getChildMotherMentallyIll() {
        return strChldMotherMentallyIll;
    }

    /**
     *
     * @return
     */
    public String getChildFatherInPrison() {
        return strChldFatherInPrison;
    }

    /**
     *
     * @return
     */
    public String getChildMotherInPrison() {
        return strChldMotherInPrison;
    }

    /**
     *
     * @return
     */
    public String getChildFatherEmployment() {
        return strChldFatherEmployment;
    }

    /**
     *
     * @return
     */
    public String getChildMotherEmployment() {
        return strChldMotherEmployment;
    }

    /**
     *
     * @return
     */
    public String getChildFatherDescription() {
        return strChldFatherDescription;
    }
  public String getChildResidence(){
        return strChldResidence;
    }
    /**
     *
     * @return
     */
    public String getChildMotherDescription() {
        return strChldMotherDescription;
    }

    /**
     *
     * @return
     */
    public String getChildDescription() {
        return strChldCoordinatorComments;
    }

    public String getSelectedChildForUpdate() {
        return strSelectedChild;
    }

    public Map<String, String> childAllBioDetails() {
        try {
            createDir();
            strCDW = String.valueOf(gen.getMillTime());
            //SAVE THE IMAGES
            ImageIO.write(scldImg, "png", new File(dirName + "\\" + getChildNo() + strCDW + ".png"));
            Map<String, String> childData = new LinkedHashMap<>();
            childData.clear();
            childData.put("chld_no", getChildNo());
            childData.put("chld_name", getChildName());
            childData.put("chld_att_schl", getChildAttendingSchool());
            childData.put("chld_schl", getChildSchool());
            childData.put("chld_course", getChildCourseofStudy());
            childData.put("under_supervision", getChildLivingUnderSuperVisionOf());
            childData.put("parents_together", getChildParentsTogether());
            childData.put("parents_marital", getChildParentsMarital());
            childData.put("coordinator_project", getChildDescription());
            childData.put("chld_residence", getChildResidence());
            childData.put("chld_photo",  getChildNo() + strCDW + ".png" );
            return childData;
        } catch (IOException ex) {
            Logger.getLogger(ChildUpdateDetailsDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Map<String, String> childBioDetails() {
        Map<String, String> childData = new LinkedHashMap<>();
        childData.clear();
        childData.put("chld_no", getChildNo());
        childData.put("chld_name", getChildName());
        childData.put("chld_att_schl", getChildAttendingSchool());
        childData.put("chld_schl", getChildSchool());
        childData.put("chld_course", getChildCourseofStudy());
        //childData.put("under_supervision", getChildLivingUnderSuperVisionOf());
       // childData.put("parents_together", getChildParentsTogether());
        //childData.put("parents_marital", getChildParentsMarital());
        return childData;
    }

    public Map<String, String> childDierctorDescription() {
        Map<String, String> childData = new LinkedHashMap<>();
        childData.clear();
        childData.put("coordinator_project", getChildDescription());
        return childData;
    }

    /**
     *
     * @return
     */
    public Map<String, String> childFatherDetails() {
        Map<String, String> childData = new LinkedHashMap<>();
        childData.clear();

        childData.put("id_f", gen.getMillTime() + "");
        childData.put("chld_no_f", getChildNo());
        childData.put("alive_f", getChildFatherIsAlive());
        childData.put("live_chld_f", getChildFatherLivingWithChild());
        childData.put("finance_chld_f", getChildFatherContributingFinancially());
        childData.put("handicapped_f", getChildFatherHandicapped());
        childData.put("how_handicapped_f", getChildFatherHandicappedHow());
        childData.put("chronically_ill_f", getChildFatherChronicallyIll());
        childData.put("how_chronically_f", getChildFatherChronicallyIllHow());
        childData.put("mentally_ill_f", getChildFatherMentallyIll());
        childData.put("in_prison_f", getChildFatherInPrison());
        childData.put("employment_f", getChildFatherEmployment());
        childData.put("description_f", getChildFatherDescription());
        return childData;
    }

    /**
     *
     * @return
     */
    public Map<String, String> childMotherDetails() {
        Map<String, String> childData = new LinkedHashMap<>();
        childData.clear();

        childData.put("id_m", gen.getMillTime() + "");
        childData.put("chld_no_m", getChildNo());
        childData.put("alive_m", getChildMotherIsAlive());
        childData.put("live_chld_m", getChildMotherLivingWithChild());
        childData.put("finance_chld_m", getChildMotherContributingFinancially());
        childData.put("handicapped_m", getChildMotherHandicapped());
        childData.put("how_handicapped_m", getChildMotherHandicappedHow());
        childData.put("chronically_ill_m", getChildMotherChronicallyIll());
        childData.put("how_chronically_m", getChildMotherChronicallyIllHow());
        childData.put("mentally_ill_m", getChildMotherMentallyIll());
        childData.put("in_prison_m", getChildMotherInPrison());
        childData.put("employment_m", getChildMotherEmployment());
        childData.put("description_m", getChildMotherDescription());

        return childData;
    }

    public void setUpdateDetails() {
        setData();
 strUpdateCond = "bio_guard_director";
        try {
            switch (strUpdateCond) {
                case "bio_guard_director":
                    cbModel.editData(childAllBioDetails(), "chld_no =\"" + getSelectedChildForUpdate() + "\"");
                    cmModel.editData(childMotherDetails(), "chld_no_m =\"" + getSelectedChildForUpdate() + "\"");
                    cfModel.editData(childFatherDetails(), "chld_no_f =\"" + getSelectedChildForUpdate() + "\"");
                    break;
                case "bio_guard":
                    cbModel.editData(childBioDetails(), "chld_no =\"" + getSelectedChildForUpdate() + "\"");
                    cmModel.editData(childMotherDetails(), "chld_no_m =\"" + getSelectedChildForUpdate() + "\"");
                    cfModel.editData(childFatherDetails(), "chld_no_f =\"" + getSelectedChildForUpdate() + "\"");
                    break;
                case "bio_director":
                    cbModel.editData(childAllBioDetails(), "chld_no =\"" + getSelectedChildForUpdate() + "\"");
                    break;
                case "bio":
                    cbModel.editData(childBioDetails(), "chld_no =\"" + getSelectedChildForUpdate() + "\"");
                    break;
                case "guard_director":
                    cmModel.editData(childMotherDetails(), "chld_no_m =\"" + getSelectedChildForUpdate() + "\"");
                    cfModel.editData(childFatherDetails(), "chld_no_f =\"" + getSelectedChildForUpdate() + "\"");
                    cbModel.editData(childDierctorDescription(), "chld_no =\"" + getSelectedChildForUpdate() + "\"");
                    break;
                case "guard":
                    cmModel.editData(childMotherDetails(), "chld_no_m =\"" + getSelectedChildForUpdate() + "\"");
                    cfModel.editData(childFatherDetails(), "chld_no_f =\"" + getSelectedChildForUpdate() + "\"");
                    break;
                case "director":
                    cbModel.editData(childDierctorDescription(), "chld_no =\"" + getSelectedChildForUpdate() + "\"");
                    break;
                case "none":
                    break;

            }

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ChildDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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

    @Override
    public void resetInput() {
        lbl[0].setIcon(null);
        lbl[0].setText("photo");
        txt[3].setText("");

    }

    @Override
    public void resetBorder() {

    }

    @Override
    public boolean validateData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void enableControls(String strControl) {
/*
        switch (strControl) {
            
            case "bio_guard_director":
                strUpdateCond = "bio_guard_director";
                for (int i = 0; i < pn[0].getComponentCount(); i++) {
                    pn[0].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[1].getComponentCount(); i++) {
                    pn[1].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[2].getComponentCount(); i++) {
                    pn[2].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[4].getComponentCount(); i++) {
                    pn[4].getComponent(i).setEnabled(true);
                }
                
                for (int i = 0; i < pn[5].getComponentCount(); i++) {
                    pn[5].getComponent(i).setEnabled(true);
                }
                
                for (int i = 0; i < pn[3].getComponentCount(); i++) {
                    pn[3].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[6].getComponentCount(); i++) {
                    pn[6].getComponent(i).setEnabled(true);
                }
                txtArea[4].setEnabled(true);
                
                break;
            case "bio_guard":
                strUpdateCond = "bio_guard";
                for (int i = 0; i < pn[0].getComponentCount(); i++) {
                    pn[0].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[1].getComponentCount(); i++) {
                    pn[1].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[2].getComponentCount(); i++) {
                    pn[2].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[4].getComponentCount(); i++) {
                    pn[4].getComponent(i).setEnabled(true);
                }
                
                for (int i = 0; i < pn[5].getComponentCount(); i++) {
                    pn[5].getComponent(i).setEnabled(true);
                }
                
                for (int i = 0; i < pn[3].getComponentCount(); i++) {
                    pn[3].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[6].getComponentCount(); i++) {
                    pn[6].getComponent(i).setEnabled(false);
                }
                txtArea[4].setEnabled(false);
                break;
            case "bio_director":
                strUpdateCond = "bio_director";
                for (int i = 0; i < pn[0].getComponentCount(); i++) {
                    pn[0].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[1].getComponentCount(); i++) {
                    pn[1].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[2].getComponentCount(); i++) {
                    pn[2].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[4].getComponentCount(); i++) {
                    pn[4].getComponent(i).setEnabled(false);
                }
                
                for (int i = 0; i < pn[5].getComponentCount(); i++) {
                    pn[5].getComponent(i).setEnabled(false);
                }
                
                for (int i = 0; i < pn[3].getComponentCount(); i++) {
                    pn[3].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[6].getComponentCount(); i++) {
                    pn[6].getComponent(i).setEnabled(true);
                }
                txtArea[4].setEnabled(true);
                break;
            case "bio":
                strUpdateCond = "bio";
                for (int i = 0; i < pn[0].getComponentCount(); i++) {
                    pn[0].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[1].getComponentCount(); i++) {
                    pn[1].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[2].getComponentCount(); i++) {
                    pn[2].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[4].getComponentCount(); i++) {
                    pn[4].getComponent(i).setEnabled(false);
                }
                
                for (int i = 0; i < pn[5].getComponentCount(); i++) {
                    pn[5].getComponent(i).setEnabled(false);
                }
                
                for (int i = 0; i < pn[3].getComponentCount(); i++) {
                    pn[3].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[6].getComponentCount(); i++) {
                    pn[6].getComponent(i).setEnabled(false);
                }
                txtArea[4].setEnabled(false);
                break;
            case "guard_director":
                strUpdateCond = "guard_director";
                for (int i = 0; i < pn[0].getComponentCount(); i++) {
                    pn[0].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[1].getComponentCount(); i++) {
                    pn[1].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[2].getComponentCount(); i++) {
                    pn[2].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[4].getComponentCount(); i++) {
                    pn[4].getComponent(i).setEnabled(true);
                }
                
                for (int i = 0; i < pn[5].getComponentCount(); i++) {
                    pn[5].getComponent(i).setEnabled(true);
                }
                
                for (int i = 0; i < pn[3].getComponentCount(); i++) {
                    pn[3].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[6].getComponentCount(); i++) {
                    pn[6].getComponent(i).setEnabled(true);
                }
                txtArea[4].setEnabled(true);
                break;
                
            case "guard":
                strUpdateCond = "guard";
                for (int i = 0; i < pn[0].getComponentCount(); i++) {
                    pn[0].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[1].getComponentCount(); i++) {
                    pn[1].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[2].getComponentCount(); i++) {
                    pn[2].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[4].getComponentCount(); i++) {
                    pn[4].getComponent(i).setEnabled(true);
                }
                
                for (int i = 0; i < pn[5].getComponentCount(); i++) {
                    pn[5].getComponent(i).setEnabled(true);
                }
                
                for (int i = 0; i < pn[3].getComponentCount(); i++) {
                    pn[3].getComponent(i).setEnabled(true);
                }
                for (int i = 0; i < pn[6].getComponentCount(); i++) {
                    pn[6].getComponent(i).setEnabled(false);
                }
                txtArea[4].setEnabled(false);
                break;
            case "director":
                strUpdateCond = "director";
                for (int i = 0; i < pn[0].getComponentCount(); i++) {
                    pn[0].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[1].getComponentCount(); i++) {
                    pn[1].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[2].getComponentCount(); i++) {
                    pn[2].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[4].getComponentCount(); i++) {
                    pn[4].getComponent(i).setEnabled(false);
                }
                
                for (int i = 0; i < pn[5].getComponentCount(); i++) {
                    pn[5].getComponent(i).setEnabled(false);
                }
                
                for (int i = 0; i < pn[3].getComponentCount(); i++) {
                    pn[3].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[6].getComponentCount(); i++) {
                    pn[6].getComponent(i).setEnabled(true);
                }
                txtArea[4].setEnabled(true);
                break;
            case "none":
                strUpdateCond = "none";
                for (int i = 0; i < pn[0].getComponentCount(); i++) {
                    pn[0].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[1].getComponentCount(); i++) {
                    pn[1].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[2].getComponentCount(); i++) {
                    pn[2].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[4].getComponentCount(); i++) {
                    pn[4].getComponent(i).setEnabled(false);
                }
                
                for (int i = 0; i < pn[5].getComponentCount(); i++) {
                    pn[5].getComponent(i).setEnabled(false);
                }
                
                for (int i = 0; i < pn[3].getComponentCount(); i++) {
                    pn[3].getComponent(i).setEnabled(false);
                }
                for (int i = 0; i < pn[6].getComponentCount(); i++) {
                    pn[6].getComponent(i).setEnabled(false);
                }
                txtArea[4].setEnabled(false);
                break;
                
        }
        deactivateCmbxSchool();
        deactivateTxtCourse();
*/
    }

      /**
     *
     */
    public void activateCmbxSchool() {
        cmbx[4].setEnabled(true);
        cmbx[4].setSelectedIndex(0);
    }

    /**
     *
     */
    public void deactivateCmbxSchool() {
        cmbx[4].setSelectedIndex(0);
        cmbx[4].setEnabled(false);
    }

    /**
     *
     */
    public void activateTxtCourse() {
        txt[2].setEnabled(true);
        txt[2].setText("");
    }

    /**
     *
     */
    public void deactivateTxtCourse() {
        txt[2].setText("");
        txt[2].setEnabled(false);
    }

    public void getSelection(String strChildNo) {
        System.out.println(strChildNo);

        GuiTablesListener tabListener = new GuiTablesListener();

        iOData = cbModel.getAllInfo("chld_no LIKE  \"" + strChildNo + "%\"").toArray();

        if (iOData.length > 0) {

            Vector<String> strData;
            tbData.clear();
            if (iOData.length >= 1) {

                for (int i = 0; i <= iOData.length - 1; i++) {

                    strData = new Vector<>();
                    iSData = iOData[i].toString().split(",\\s*");

                    strData.add(0, iSData[1]); //
                    strData.add(1, iSData[0].substring(1));

                    this.tbData.add(i, strData);
                }

            }

            searchTab = new JTable(new ChildUpdateTables(tbData, searchHeaderGenerator()));
            searchTab.setAutoCreateRowSorter(false);
            searchTab.setModel(new ChildUpdateTables(tbData, searchHeaderGenerator()));
            searchTab.addMouseListener(tabListener);
            tabListener.setUpdateChildDetails(searchTab);

        //CENTER THE DATA
      /*  DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
             centerRenderer.setHorizontalAlignment(JLabel.CENTER);
             searchTab.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

             searchTab.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);*/
            //SET COLUMN WIDTH
            for (int i = 0; i < searchTab.getColumnCount(); i++) {

                if (i == 0) {
                    tm = searchTab.getColumnModel().getColumn(i);
                    int colLength = (int) (searchTab.getColumnModel().getColumn(i).getHeaderValue().toString().length() * 0);
                    tm.setPreferredWidth(colLength);

                } else {
                    tm = searchTab.getColumnModel().getColumn(i);
                    int colLength = (int) (searchTab.getColumnModel().getColumn(i).getHeaderValue().toString().length() * 0);
                    tm.setPreferredWidth(colLength);
                }
            }

            //SET COLOR
            for (int i = 0; i < searchTab.getColumnCount(); i++) {
                //ADDING COLORS

                if (i != 3) {
                    tm2 = searchTab.getColumnModel().getColumn(i);

                    tm2.setCellRenderer(new ColorColumnRenderer(Color.lightGray, Color.WHITE));
                }

            }
            searchTab.setFont(new java.awt.Font("Tohama", 1, 12)); // NOI18N
            searchTab.setDoubleBuffered(true);
            searchTab.setDragEnabled(true);
            searchTab.setFillsViewportHeight(true);
            jscrll[0].setViewportView(searchTab);
        } else {

            String strHTM = "<html>"
                    + "<head>"
                    + "</head>"
                    + "<body>"
                    + "<center><b>No data found !</b></center>"
                    + "<body>"
                    + "</html>";
            htmlPaneS = new JEditorPane();
            htmlPaneS.removeAll();
            htmlPaneS.setContentType("text/html");
            htmlPaneS.setEditable(false);
            htmlPaneS.setText(strHTM);
            jscrll[0].setViewportView(htmlPaneS);

        }
    }

    public void setSelectedChildForUpdate(String strChild) {
        if (strChild.equals("")) {
            errorDetect(txt[3]);
        } else {

            strSelectedChild = strChild.trim();
            txt[3].setText(strChild.trim());
        }
    }

    private Vector<String> searchHeaderGenerator() {

        cols.clear();
        String[] colHeader = {"<html><b>NAME</b></html>", "<html><b>CHILD NUMBER</b></html>"};
        cols.addAll(Arrays.asList(colHeader));
        return cols;

    }

    private class ChildUpdateTables extends AbstractTableModel {

        private Vector<Vector> tbData = new Vector<>();
        private Vector<String> cols = new Vector();
        private Vector row = new Vector();

        public ChildUpdateTables() {
        }

        public ChildUpdateTables(Vector<Vector> tbData, Vector<String> cols) {
            this.tbData = tbData;
            this.cols = cols;
        }

        @Override
        public int getRowCount() {
            return this.tbData.size();
        }

        @Override
        public int getColumnCount() {
            return this.cols.size();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            row = (Vector) this.tbData.elementAt(rowIndex);
            return row.elementAt(columnIndex);
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        @Override
        public void setValueAt(Object value, int rowIndex, int col) {
            row = (Vector) this.tbData.elementAt(rowIndex);
            try {
                float flt = Float.parseFloat(value.toString());
                row.setElementAt(value, col);
                fireTableDataChanged();
                fireTableCellUpdated(rowIndex, col);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Check your input Values");
            }

        }

        @Override
        public String getColumnName(int col) {
            return cols.elementAt(col);
        }
    }
}
