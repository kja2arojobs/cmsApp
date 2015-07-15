/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.views;

import com.application.datapools.ChildDataPool;
import com.library.Generators;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author kadhush
 */
public class ChildrenRegistration {
//PANEL FOR GENERATING THE INTERFACE

    private javax.swing.JPanel pUser;

    /**
     * CLASS IMPORTS
     *
     */
    //set controls
    private final ChildDataPool dtPool = new ChildDataPool();
    private final Generators gen = new Generators();

    /**
     * End of variables declaration
     *
     */
 // Variables declaration - do not modify                     
    private javax.swing.JButton btnChildReg;
    private javax.swing.JButton btnChildRegReset;
    private javax.swing.JButton btnChildUploadPhoto;
    private javax.swing.JCheckBox chkbxFather_MaleGuardianDescriptionChurchWorker;
    private javax.swing.JCheckBox chkbxFather_MaleGuardianDescriptionFarmer;
    private javax.swing.JCheckBox chkbxFather_MaleGuardianDescriptionLaborer;
    private javax.swing.JCheckBox chkbxFather_MaleGuardianDescriptionOther;
    private javax.swing.JCheckBox chkbxFather_MaleGuardianDescriptionProjectWorker;
    private javax.swing.JCheckBox chkbxFather_MaleGuardianDescriptionSalesInMarket;
    private javax.swing.JCheckBox chkbxFather_MaleGuardianDescriptionTeacher;
    private javax.swing.JCheckBox chkbxMother_FemaleGuardianDescriptionChurchWorker;
    private javax.swing.JCheckBox chkbxMother_FemaleGuardianDescriptionFarmer;
    private javax.swing.JCheckBox chkbxMother_FemaleGuardianDescriptionLaborer;
    private javax.swing.JCheckBox chkbxMother_FemaleGuardianDescriptionOther;
    private javax.swing.JCheckBox chkbxMother_FemaleGuardianDescriptionProjectWorker;
    private javax.swing.JCheckBox chkbxMother_FemaleGuardianDescriptionSalesInMarket;
    private javax.swing.JCheckBox chkbxMother_FemaleGuardianDescriptionTeacher;
    private javax.swing.JComboBox cmbxChildLivingUnder;
    private javax.swing.JComboBox cmbxFather_MaleGuardianEmployment;
    private javax.swing.JComboBox cmbxMaritalStatusofParents;
    private javax.swing.JComboBox cmbxMother_FemaleGuardianEmployment;
    private javax.swing.JComboBox cmbxSchool;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JRadioButton rbAttendSchoolNo;
    private javax.swing.JRadioButton rbAttendSchoolYes;
    private javax.swing.JRadioButton rbNaturalFatherAliveNo;
    private javax.swing.JRadioButton rbNaturalFatherAliveUnknown;
    private javax.swing.JRadioButton rbNaturalFatherAliveYes;
    private javax.swing.JRadioButton rbNaturalFatherChronicallyIllNo;
    private javax.swing.JRadioButton rbNaturalFatherChronicallyIllUnknown;
    private javax.swing.JRadioButton rbNaturalFatherChronicallyIllYes;
    private javax.swing.JRadioButton rbNaturalFatherContributingFinanciallytoChildNo;
    private javax.swing.JRadioButton rbNaturalFatherContributingFinanciallytoChildYes;
    private javax.swing.JRadioButton rbNaturalFatherHandicappedNo;
    private javax.swing.JRadioButton rbNaturalFatherHandicappedUnknown;
    private javax.swing.JRadioButton rbNaturalFatherHandicappedYes;
    private javax.swing.JRadioButton rbNaturalFatherInPrisonNo;
    private javax.swing.JRadioButton rbNaturalFatherInPrisonUnknown;
    private javax.swing.JRadioButton rbNaturalFatherInPrisonYes;
    private javax.swing.JRadioButton rbNaturalFatherLivingWithChildNo;
    private javax.swing.JRadioButton rbNaturalFatherLivingWithChildYes;
    private javax.swing.JRadioButton rbNaturalFatherMentallyIllNo;
    private javax.swing.JRadioButton rbNaturalFatherMentallyIllUnknown;
    private javax.swing.JRadioButton rbNaturalFatherMentallyIllYes;
    private javax.swing.JRadioButton rbNaturalMotherAliveNo;
    private javax.swing.JRadioButton rbNaturalMotherAliveUnknown;
    private javax.swing.JRadioButton rbNaturalMotherAliveYes;
    private javax.swing.JRadioButton rbNaturalMotherChronicallyIllNo;
    private javax.swing.JRadioButton rbNaturalMotherChronicallyIllUnknown;
    private javax.swing.JRadioButton rbNaturalMotherChronicallyIllYes;
    private javax.swing.JRadioButton rbNaturalMotherContributingFinanciallytoChildNo;
    private javax.swing.JRadioButton rbNaturalMotherContributingFinanciallytoChildYes;
    private javax.swing.JRadioButton rbNaturalMotherHandicappedNo;
    private javax.swing.JRadioButton rbNaturalMotherHandicappedUnknown;
    private javax.swing.JRadioButton rbNaturalMotherHandicappedYes;
    private javax.swing.JRadioButton rbNaturalMotherInPrisonNo;
    private javax.swing.JRadioButton rbNaturalMotherInPrisonUnknown;
    private javax.swing.JRadioButton rbNaturalMotherInPrisonYes;
    private javax.swing.JRadioButton rbNaturalMotherLivingWithChildNo;
    private javax.swing.JRadioButton rbNaturalMotherLivingWithChildYes;
    private javax.swing.JRadioButton rbNaturalMotherMentallyIllNo;
    private javax.swing.JRadioButton rbNaturalMotherMentallyIllUnknown;
    private javax.swing.JRadioButton rbNaturalMotherMentallyIllYes;
    private javax.swing.JRadioButton rbNaturalParentsTogetherNo;
    private javax.swing.JRadioButton rbNaturalParentsTogetherUnknown;
    private javax.swing.JRadioButton rbNaturalParentsTogetherYes;
    private javax.swing.JTextArea txtAreaNaturalFatherChronicallyIll;
    private javax.swing.JTextArea txtAreaNaturalFatherHandicapped;
    private javax.swing.JTextArea txtAreaNaturalMotherChronicallyIll;
    private javax.swing.JTextArea txtAreaNaturalMotherHandicapped;
    private javax.swing.JTextArea txtAreaProjectDirectorComents;
    private javax.swing.JTextField txtChildName;
    private javax.swing.JTextField txtChildNumber;
    private javax.swing.JTextField txtCourseofStudy;
    private javax.swing.JTextField txtResidence;
    // End of variables declaration              

    /**
     * USED TO CREATE THE USER INTERFACE
     *
     * @return
     */
    public javax.swing.JPanel init() {
        //<editor-fold> set  the layout panel
        pUser = new javax.swing.JPanel();
        //</editor-fold> set  the layout panel

        // <editor-fold>Interface starts here.
        pUser = create_Interface_Hook(pUser);
        // </editor-fold>End of Interface codes.

        //<editor-fold>Interface controls action listener and passing form controls
        formControls_Hook_Up();
        //</editor-fold>Interface controls action listener and passing form controls

        return pUser;
    }//

    //VARIABLE DECLARATION
    private void formControls_Hook_Up() {

        ButtonGroup rbAttendSchl = new ButtonGroup();
        rbAttendSchl.add(rbAttendSchoolNo);
        rbAttendSchl.add(rbAttendSchoolYes);
        rbAttendSchoolNo.setSelected(true);

        ButtonGroup rbNatParents2gether = new ButtonGroup();
        rbNatParents2gether.add(rbNaturalParentsTogetherYes);
        rbNatParents2gether.add(rbNaturalParentsTogetherNo);
        rbNatParents2gether.add(rbNaturalParentsTogetherUnknown);
        rbNaturalParentsTogetherNo.setSelected(true);

        ButtonGroup fatherAlive = new ButtonGroup();
        fatherAlive.add(rbNaturalFatherAliveNo);
        fatherAlive.add(rbNaturalFatherAliveYes);
        fatherAlive.add(rbNaturalFatherAliveUnknown);
        rbNaturalFatherAliveNo.setSelected(true);

        ButtonGroup fatherWithChild = new ButtonGroup();
        fatherWithChild.add(rbNaturalFatherLivingWithChildNo);
        fatherWithChild.add(rbNaturalFatherLivingWithChildYes);
        rbNaturalFatherLivingWithChildNo.setSelected(true);

        ButtonGroup fatherFiancial = new ButtonGroup();
        fatherFiancial.add(rbNaturalFatherContributingFinanciallytoChildYes);
        fatherFiancial.add(rbNaturalFatherContributingFinanciallytoChildNo);
        rbNaturalFatherContributingFinanciallytoChildNo.setSelected(true);

        ButtonGroup fatherHandicapped = new ButtonGroup();
        fatherHandicapped.add(rbNaturalFatherHandicappedUnknown);
        fatherHandicapped.add(rbNaturalFatherHandicappedNo);
        fatherHandicapped.add(rbNaturalFatherHandicappedYes);
        rbNaturalFatherHandicappedNo.setSelected(true);

        ButtonGroup fatherChronicallyIll = new ButtonGroup();
        fatherChronicallyIll.add(rbNaturalFatherChronicallyIllUnknown);
        fatherChronicallyIll.add(rbNaturalFatherChronicallyIllYes);
        fatherChronicallyIll.add(rbNaturalFatherChronicallyIllNo);
        rbNaturalFatherChronicallyIllNo.setSelected(true);

        ButtonGroup fathermentallyIll = new ButtonGroup();
        fathermentallyIll.add(rbNaturalFatherMentallyIllYes);
        fathermentallyIll.add(rbNaturalFatherMentallyIllNo);
        fathermentallyIll.add(rbNaturalFatherMentallyIllUnknown);
        rbNaturalFatherMentallyIllNo.setSelected(true);

        ButtonGroup fatherinPrison = new ButtonGroup();
        fatherinPrison.add(rbNaturalFatherInPrisonUnknown);
        fatherinPrison.add(rbNaturalFatherInPrisonYes);
        fatherinPrison.add(rbNaturalFatherInPrisonNo);
        rbNaturalFatherInPrisonNo.setSelected(true);

        ButtonGroup motherAlive = new ButtonGroup();
        motherAlive.add(rbNaturalMotherAliveNo);
        motherAlive.add(rbNaturalMotherAliveYes);
        motherAlive.add(rbNaturalMotherAliveUnknown);
        rbNaturalMotherAliveNo.setSelected(true);

        ButtonGroup motherWithChild = new ButtonGroup();
        motherWithChild.add(rbNaturalMotherLivingWithChildNo);
        motherWithChild.add(rbNaturalMotherLivingWithChildYes);
        rbNaturalMotherLivingWithChildNo.setSelected(true);

        ButtonGroup motherFiancial = new ButtonGroup();
        motherFiancial.add(rbNaturalMotherContributingFinanciallytoChildYes);
        motherFiancial.add(rbNaturalMotherContributingFinanciallytoChildNo);
        rbNaturalMotherContributingFinanciallytoChildNo.setSelected(true);

        ButtonGroup motherHandicapped = new ButtonGroup();
        motherHandicapped.add(rbNaturalMotherHandicappedUnknown);
        motherHandicapped.add(rbNaturalMotherHandicappedNo);
        motherHandicapped.add(rbNaturalMotherHandicappedYes);
        rbNaturalMotherHandicappedNo.setSelected(true);

        ButtonGroup motherChronicallyIll = new ButtonGroup();
        motherChronicallyIll.add(rbNaturalMotherChronicallyIllUnknown);
        motherChronicallyIll.add(rbNaturalMotherChronicallyIllYes);
        motherChronicallyIll.add(rbNaturalMotherChronicallyIllNo);
        rbNaturalMotherChronicallyIllNo.setSelected(true);

        ButtonGroup mothermentallyIll = new ButtonGroup();
        mothermentallyIll.add(rbNaturalMotherMentallyIllYes);
        mothermentallyIll.add(rbNaturalMotherMentallyIllNo);
        mothermentallyIll.add(rbNaturalMotherMentallyIllUnknown);
        rbNaturalMotherMentallyIllNo.setSelected(true);

        ButtonGroup motherinPrison = new ButtonGroup();
        motherinPrison.add(rbNaturalMotherInPrisonUnknown);
        motherinPrison.add(rbNaturalMotherInPrisonYes);
        motherinPrison.add(rbNaturalMotherInPrisonNo);
        rbNaturalMotherInPrisonNo.setSelected(true);

        //group the controlls
        //TEXTFIELDS
        JTextField[] txt = {txtChildNumber, txtChildName, txtCourseofStudy,txtResidence};
        txtCourseofStudy.setEnabled(false);

        //TEXTAREA
        JTextArea[] txtArea = {
            txtAreaNaturalFatherChronicallyIll, txtAreaNaturalFatherHandicapped,
            txtAreaNaturalMotherChronicallyIll, txtAreaNaturalMotherHandicapped,
            txtAreaProjectDirectorComents};

        //CHECKBOX
        JCheckBox[] chkBx = {
            chkbxFather_MaleGuardianDescriptionChurchWorker, chkbxFather_MaleGuardianDescriptionFarmer,
            chkbxFather_MaleGuardianDescriptionLaborer, chkbxFather_MaleGuardianDescriptionProjectWorker,
            chkbxFather_MaleGuardianDescriptionSalesInMarket, chkbxFather_MaleGuardianDescriptionTeacher,
            chkbxMother_FemaleGuardianDescriptionChurchWorker, chkbxMother_FemaleGuardianDescriptionFarmer,
            chkbxMother_FemaleGuardianDescriptionLaborer, chkbxMother_FemaleGuardianDescriptionOther,
            chkbxMother_FemaleGuardianDescriptionProjectWorker, chkbxMother_FemaleGuardianDescriptionSalesInMarket,
            chkbxMother_FemaleGuardianDescriptionTeacher, chkbxFather_MaleGuardianDescriptionOther};

        //COMBOBOX
        JComboBox[] cmbx = {
            cmbxChildLivingUnder, cmbxFather_MaleGuardianEmployment,
            cmbxMaritalStatusofParents, cmbxMother_FemaleGuardianEmployment,
            cmbxSchool};
        cmbxSchool.setEnabled(false);
        //RADIO BUTTON

        JRadioButton[] rb = {
            rbAttendSchoolNo, rbAttendSchoolYes, rbNaturalFatherAliveNo,
            rbNaturalFatherAliveUnknown, rbNaturalFatherAliveYes, rbNaturalFatherChronicallyIllNo,
            rbNaturalFatherChronicallyIllUnknown, rbNaturalFatherChronicallyIllYes, rbNaturalFatherContributingFinanciallytoChildNo,
            rbNaturalFatherContributingFinanciallytoChildYes, rbNaturalFatherHandicappedNo, rbNaturalFatherHandicappedUnknown,
            rbNaturalFatherHandicappedYes, rbNaturalFatherInPrisonNo, rbNaturalFatherInPrisonUnknown,
            rbNaturalFatherInPrisonYes, rbNaturalFatherLivingWithChildNo, rbNaturalFatherLivingWithChildYes,
            rbNaturalFatherMentallyIllYes, rbNaturalFatherMentallyIllNo, rbNaturalFatherMentallyIllUnknown,
            rbNaturalMotherAliveNo, rbNaturalMotherAliveUnknown, rbNaturalMotherAliveYes,
            rbNaturalMotherChronicallyIllNo, rbNaturalMotherChronicallyIllUnknown, rbNaturalMotherChronicallyIllYes,
            rbNaturalMotherContributingFinanciallytoChildNo, rbNaturalMotherContributingFinanciallytoChildYes, rbNaturalMotherHandicappedNo,
            rbNaturalMotherHandicappedUnknown, rbNaturalMotherHandicappedYes, rbNaturalMotherInPrisonNo,
            rbNaturalMotherInPrisonUnknown, rbNaturalMotherLivingWithChildNo, rbNaturalMotherLivingWithChildYes,
            rbNaturalMotherMentallyIllNo, rbNaturalMotherMentallyIllUnknown, rbNaturalMotherMentallyIllYes,
            rbNaturalMotherInPrisonYes, rbNaturalParentsTogetherNo, rbNaturalParentsTogetherUnknown,
            rbNaturalParentsTogetherYes};

        //BUUTTONS
        JButton[] btn = {btnChildRegReset, btnChildReg,btnChildUploadPhoto};
        //LABELS
        JLabel[] lbl ={lblPhoto};
        // SET THE CONTROLS
        dtPool.setChildControls(txt, txtArea, chkBx, cmbx, rb, btn,lbl);
        

    }
    // End of variables declaration
    /**
     *
     * do not modify INTERFACE LOOK
     *
     */
    private javax.swing.JPanel create_Interface_Hook(javax.swing.JPanel pUser) {
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        cmbxFather_MaleGuardianEmployment = new javax.swing.JComboBox(gen.getCompFatherEmployment());
        jSeparator18 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        chkbxFather_MaleGuardianDescriptionFarmer = new javax.swing.JCheckBox();
        chkbxFather_MaleGuardianDescriptionSalesInMarket = new javax.swing.JCheckBox();
        chkbxFather_MaleGuardianDescriptionChurchWorker = new javax.swing.JCheckBox();
        chkbxFather_MaleGuardianDescriptionProjectWorker = new javax.swing.JCheckBox();
        chkbxFather_MaleGuardianDescriptionTeacher = new javax.swing.JCheckBox();
        chkbxFather_MaleGuardianDescriptionLaborer = new javax.swing.JCheckBox();
        chkbxFather_MaleGuardianDescriptionOther = new javax.swing.JCheckBox();
        jPanel14 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        cmbxMother_FemaleGuardianEmployment = new javax.swing.JComboBox(gen.getCompMotherEmployment());
        jSeparator19 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        chkbxMother_FemaleGuardianDescriptionFarmer = new javax.swing.JCheckBox();
        chkbxMother_FemaleGuardianDescriptionSalesInMarket = new javax.swing.JCheckBox();
        chkbxMother_FemaleGuardianDescriptionChurchWorker = new javax.swing.JCheckBox();
        chkbxMother_FemaleGuardianDescriptionProjectWorker = new javax.swing.JCheckBox();
        chkbxMother_FemaleGuardianDescriptionTeacher = new javax.swing.JCheckBox();
        chkbxMother_FemaleGuardianDescriptionLaborer = new javax.swing.JCheckBox();
        chkbxMother_FemaleGuardianDescriptionOther = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaProjectDirectorComents = new javax.swing.JTextArea();
        btnChildRegReset = new javax.swing.JButton();
        btnChildReg = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel12 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtChildNumber = new javax.swing.JTextField();
        txtChildName = new javax.swing.JTextField();
        rbAttendSchoolYes = new javax.swing.JRadioButton();
        rbAttendSchoolNo = new javax.swing.JRadioButton();
        cmbxSchool = new javax.swing.JComboBox(gen.getCompSchool());
        txtCourseofStudy = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txtResidence = new javax.swing.JTextField();
        lblPhoto = new javax.swing.JLabel();
        btnChildUploadPhoto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbxChildLivingUnder = new javax.swing.JComboBox(gen.getCompGuardian());
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rbNaturalParentsTogetherYes = new javax.swing.JRadioButton();
        rbNaturalParentsTogetherNo = new javax.swing.JRadioButton();
        rbNaturalParentsTogetherUnknown = new javax.swing.JRadioButton();
        cmbxMaritalStatusofParents = new javax.swing.JComboBox(gen.getCompMaritalStatus());
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbNaturalFatherAliveYes = new javax.swing.JRadioButton();
        rbNaturalFatherAliveNo = new javax.swing.JRadioButton();
        rbNaturalFatherAliveUnknown = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rbNaturalFatherLivingWithChildYes = new javax.swing.JRadioButton();
        rbNaturalFatherLivingWithChildNo = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rbNaturalFatherContributingFinanciallytoChildYes = new javax.swing.JRadioButton();
        rbNaturalFatherContributingFinanciallytoChildNo = new javax.swing.JRadioButton();
        rbNaturalFatherHandicappedYes = new javax.swing.JRadioButton();
        rbNaturalFatherHandicappedNo = new javax.swing.JRadioButton();
        rbNaturalFatherHandicappedUnknown = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rbNaturalFatherChronicallyIllYes = new javax.swing.JRadioButton();
        rbNaturalFatherChronicallyIllNo = new javax.swing.JRadioButton();
        rbNaturalFatherChronicallyIllUnknown = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rbNaturalFatherMentallyIllYes = new javax.swing.JRadioButton();
        rbNaturalFatherMentallyIllNo = new javax.swing.JRadioButton();
        rbNaturalFatherMentallyIllUnknown = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        rbNaturalFatherInPrisonYes = new javax.swing.JRadioButton();
        rbNaturalFatherInPrisonNo = new javax.swing.JRadioButton();
        rbNaturalFatherInPrisonUnknown = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaNaturalFatherHandicapped = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaNaturalFatherChronicallyIll = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        rbNaturalMotherAliveYes = new javax.swing.JRadioButton();
        rbNaturalMotherAliveNo = new javax.swing.JRadioButton();
        rbNaturalMotherAliveUnknown = new javax.swing.JRadioButton();
        jLabel29 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        rbNaturalMotherLivingWithChildYes = new javax.swing.JRadioButton();
        rbNaturalMotherLivingWithChildNo = new javax.swing.JRadioButton();
        jLabel31 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        rbNaturalMotherContributingFinanciallytoChildYes = new javax.swing.JRadioButton();
        rbNaturalMotherContributingFinanciallytoChildNo = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        rbNaturalMotherHandicappedYes = new javax.swing.JRadioButton();
        rbNaturalMotherHandicappedNo = new javax.swing.JRadioButton();
        rbNaturalMotherHandicappedUnknown = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel37 = new javax.swing.JLabel();
        rbNaturalMotherChronicallyIllYes = new javax.swing.JRadioButton();
        rbNaturalMotherChronicallyIllNo = new javax.swing.JRadioButton();
        rbNaturalMotherChronicallyIllUnknown = new javax.swing.JRadioButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel40 = new javax.swing.JLabel();
        rbNaturalMotherMentallyIllYes = new javax.swing.JRadioButton();
        rbNaturalMotherMentallyIllNo = new javax.swing.JRadioButton();
        rbNaturalMotherMentallyIllUnknown = new javax.swing.JRadioButton();
        jLabel41 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel42 = new javax.swing.JLabel();
        rbNaturalMotherInPrisonYes = new javax.swing.JRadioButton();
        rbNaturalMotherInPrisonNo = new javax.swing.JRadioButton();
        rbNaturalMotherInPrisonUnknown = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaNaturalMotherHandicapped = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaNaturalMotherChronicallyIll = new javax.swing.JTextArea();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), javax.swing.BorderFactory.createTitledBorder(null, "CHILD DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        jScrollPane1.setBorder(null);
        jScrollPane1.setToolTipText("scroll to access other data");

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(null, "GUARDIAN'S DETAILS [2]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        jPanel13.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), javax.swing.BorderFactory.createTitledBorder(null, "FATHER OR MALE GUARDIAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel44.setText("EMPLOYMENT");

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel45.setText("SELECT ALL THAT DESCRIBE FATHER OR MALE GAURDIAN :");

        chkbxFather_MaleGuardianDescriptionFarmer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxFather_MaleGuardianDescriptionFarmer.setText("FARMER");

        chkbxFather_MaleGuardianDescriptionSalesInMarket.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxFather_MaleGuardianDescriptionSalesInMarket.setText("SELLS IN MARKET");

        chkbxFather_MaleGuardianDescriptionChurchWorker.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxFather_MaleGuardianDescriptionChurchWorker.setText("CHURCH WORKER");

        chkbxFather_MaleGuardianDescriptionProjectWorker.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxFather_MaleGuardianDescriptionProjectWorker.setText("PROJECT WORKER");

        chkbxFather_MaleGuardianDescriptionTeacher.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxFather_MaleGuardianDescriptionTeacher.setText("TEACHER");

        chkbxFather_MaleGuardianDescriptionLaborer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxFather_MaleGuardianDescriptionLaborer.setText("LABORER");
     

        chkbxFather_MaleGuardianDescriptionOther.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxFather_MaleGuardianDescriptionOther.setText("OTHER");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(cmbxFather_MaleGuardianEmployment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel45)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkbxFather_MaleGuardianDescriptionProjectWorker)
                            .addComponent(chkbxFather_MaleGuardianDescriptionFarmer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(chkbxFather_MaleGuardianDescriptionSalesInMarket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkbxFather_MaleGuardianDescriptionChurchWorker))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(chkbxFather_MaleGuardianDescriptionTeacher)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkbxFather_MaleGuardianDescriptionLaborer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkbxFather_MaleGuardianDescriptionOther)
                                .addGap(5, 5, 5)))))
                .addContainerGap())
            .addComponent(jSeparator18)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxFather_MaleGuardianEmployment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addGap(0, 0, 0)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxFather_MaleGuardianDescriptionFarmer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxFather_MaleGuardianDescriptionSalesInMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxFather_MaleGuardianDescriptionChurchWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxFather_MaleGuardianDescriptionTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxFather_MaleGuardianDescriptionLaborer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxFather_MaleGuardianDescriptionOther, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxFather_MaleGuardianDescriptionProjectWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), javax.swing.BorderFactory.createTitledBorder(null, "MOTHER OR FEMALE GUARDIAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel46.setText("EMPLOYMENT");

        
        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel47.setText("SELECT ALL THAT DESCRIBE MOTHER OR FEMALE GAURDIAN :");

        chkbxMother_FemaleGuardianDescriptionFarmer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxMother_FemaleGuardianDescriptionFarmer.setText("FARMER");

        chkbxMother_FemaleGuardianDescriptionSalesInMarket.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxMother_FemaleGuardianDescriptionSalesInMarket.setText("SELLS IN MARKET");

        chkbxMother_FemaleGuardianDescriptionChurchWorker.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxMother_FemaleGuardianDescriptionChurchWorker.setText("CHURCH WORKER");

        chkbxMother_FemaleGuardianDescriptionProjectWorker.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxMother_FemaleGuardianDescriptionProjectWorker.setText("PROJECT WORKER");
      

        chkbxMother_FemaleGuardianDescriptionTeacher.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxMother_FemaleGuardianDescriptionTeacher.setText("TEACHER");

        chkbxMother_FemaleGuardianDescriptionLaborer.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxMother_FemaleGuardianDescriptionLaborer.setText("LABORER");
       

        chkbxMother_FemaleGuardianDescriptionOther.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        chkbxMother_FemaleGuardianDescriptionOther.setText("OTHER");
      

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(cmbxMother_FemaleGuardianEmployment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel47)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkbxMother_FemaleGuardianDescriptionProjectWorker)
                            .addComponent(chkbxMother_FemaleGuardianDescriptionFarmer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(chkbxMother_FemaleGuardianDescriptionSalesInMarket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkbxMother_FemaleGuardianDescriptionChurchWorker))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(chkbxMother_FemaleGuardianDescriptionTeacher)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkbxMother_FemaleGuardianDescriptionLaborer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chkbxMother_FemaleGuardianDescriptionOther)
                                .addGap(5, 5, 5)))))
                .addContainerGap())
            .addComponent(jSeparator19, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxMother_FemaleGuardianEmployment, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(0, 0, 0)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxMother_FemaleGuardianDescriptionFarmer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxMother_FemaleGuardianDescriptionSalesInMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxMother_FemaleGuardianDescriptionChurchWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkbxMother_FemaleGuardianDescriptionTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxMother_FemaleGuardianDescriptionLaborer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxMother_FemaleGuardianDescriptionOther, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbxMother_FemaleGuardianDescriptionProjectWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createTitledBorder(null, "PROJECT DIRECTOR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel43.setText("PROJECT DIRECTOR COMENTS PER CHILD:");

        txtAreaProjectDirectorComents.setColumns(20);
        txtAreaProjectDirectorComents.setRows(5);
        jScrollPane7.setViewportView(txtAreaProjectDirectorComents);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel43)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane7)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        jScrollPane1.setViewportView(jPanel6);

        btnChildRegReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChildRegReset.setText("RESET");

        btnChildReg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChildReg.setText("SAVE");

        jScrollPane2.setBorder(null);

        jPanel12.setBorder(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), javax.swing.BorderFactory.createTitledBorder(null, "CHILD'S BIO DATA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("CHILD NUMBER:");
        jLabel1.setMinimumSize(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("CHILD NAME");
        jLabel2.setMinimumSize(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("IS THE CHILD ATTENDING SCHOOL?");
        jLabel3.setMinimumSize(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("SCHOOL");
        jLabel4.setMinimumSize(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("COURSE OF STUDY:");
        jLabel5.setMinimumSize(null);

     
        rbAttendSchoolYes.setText("YES");

        rbAttendSchoolNo.setText("NO");

       
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel48.setText("RESIDENCE:");

        lblPhoto.setBackground(new java.awt.Color(255, 255, 255));
        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhoto.setText("photo");
        lblPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblPhoto.setOpaque(true);

        btnChildUploadPhoto.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        btnChildUploadPhoto.setText("upload photo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmbxSchool, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(6, 6, 6)
                                .addComponent(btnChildUploadPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtResidence)
                            .addComponent(txtCourseofStudy, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbAttendSchoolYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbAttendSchoolNo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtChildNumber)
                                    .addComponent(txtChildName))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChildNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChildName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAttendSchoolYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbAttendSchoolNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChildUploadPhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseofStudy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), javax.swing.BorderFactory.createTitledBorder(null, "GUARDIANS DETAILS [1]", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12)))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("CHILD IS LIVING UNDER SUPERVISION OF:");

       
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NATURAL PARENTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("ARE THE NATURAL PARENTS TOGETHER NOW ?");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("MARITAL STATUS OF THE NATURAL PARENTS:");

        rbNaturalParentsTogetherYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalParentsTogetherYes.setText("YES");

        rbNaturalParentsTogetherNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalParentsTogetherNo.setText("NO");

        rbNaturalParentsTogetherUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalParentsTogetherUnknown.setText("UNKWON");

         cmbxMaritalStatusofParents.setActionCommand("\n");
       

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NATURAL FATHER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("IS THE NATURAL FATHER:-");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("ALIVE ?");

        rbNaturalFatherAliveYes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbNaturalFatherAliveYes.setText("YES");

        rbNaturalFatherAliveNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherAliveNo.setText("NO");

        rbNaturalFatherAliveUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherAliveUnknown.setText("UNKNOWN");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("LIVING WITH THIS CHILD ?");

        rbNaturalFatherLivingWithChildYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherLivingWithChildYes.setText("YES");

        rbNaturalFatherLivingWithChildNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherLivingWithChildNo.setText("NO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("CONTRIBUTING FINANCIALLY TO THIS CHILD ?");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText("(i) HANDICAPPED?");

        rbNaturalFatherContributingFinanciallytoChildYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherContributingFinanciallytoChildYes.setText("YES");
      

        rbNaturalFatherContributingFinanciallytoChildNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherContributingFinanciallytoChildNo.setText("NO");

        rbNaturalFatherHandicappedYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherHandicappedYes.setText("YES");

        rbNaturalFatherHandicappedNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherHandicappedNo.setText("NO");

        rbNaturalFatherHandicappedUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherHandicappedUnknown.setText("UNKOWN");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("(ii) HOW ?");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText(" (i) CHRONICALLY ILL ?");

        rbNaturalFatherChronicallyIllYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherChronicallyIllYes.setText("YES");

        rbNaturalFatherChronicallyIllNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherChronicallyIllNo.setText("NO");

        rbNaturalFatherChronicallyIllUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherChronicallyIllUnknown.setText("UNKNOWN");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("(ii) HOW ?");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setText(" MENTALLY ILL ?");

        rbNaturalFatherMentallyIllYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherMentallyIllYes.setText("YES");

        rbNaturalFatherMentallyIllNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherMentallyIllNo.setText("NO");

        rbNaturalFatherMentallyIllUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherMentallyIllUnknown.setText("UNKNOWN");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText("IN PRISON ?");

        rbNaturalFatherInPrisonYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherInPrisonYes.setText("YES");

        rbNaturalFatherInPrisonNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherInPrisonNo.setText("NO");
      

        rbNaturalFatherInPrisonUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalFatherInPrisonUnknown.setText("UNKNOWN");

        txtAreaNaturalFatherHandicapped.setColumns(20);
        txtAreaNaturalFatherHandicapped.setRows(5);
        jScrollPane5.setViewportView(txtAreaNaturalFatherHandicapped);

        txtAreaNaturalFatherChronicallyIll.setColumns(20);
        txtAreaNaturalFatherChronicallyIll.setRows(5);
        jScrollPane6.setViewportView(txtAreaNaturalFatherChronicallyIll);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setText("[a]");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel20.setText("[b]");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel21.setText("[c]");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel22.setText("[d]");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel23.setText("[e]");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel24.setText("[f]");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel25.setText("[g]");

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbNaturalFatherChronicallyIllYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalFatherChronicallyIllNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalFatherChronicallyIllUnknown))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbNaturalFatherMentallyIllYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalFatherMentallyIllNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalFatherMentallyIllUnknown))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbNaturalFatherInPrisonYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalFatherInPrisonNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalFatherInPrisonUnknown))
                    .addComponent(jSeparator5)
                    .addComponent(jScrollPane6)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane5)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbNaturalFatherHandicappedYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalFatherHandicappedNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalFatherHandicappedUnknown))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel22))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(rbNaturalFatherContributingFinanciallytoChildYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalFatherContributingFinanciallytoChildNo)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(rbNaturalFatherLivingWithChildYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalFatherLivingWithChildNo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(rbNaturalFatherAliveYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalFatherAliveNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalFatherAliveUnknown))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2)))
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNaturalFatherAliveYes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalFatherAliveUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalFatherAliveNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalFatherLivingWithChildYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalFatherLivingWithChildNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalFatherContributingFinanciallytoChildNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalFatherContributingFinanciallytoChildYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbNaturalFatherHandicappedYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalFatherHandicappedNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalFatherHandicappedUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalFatherChronicallyIllYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalFatherChronicallyIllNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalFatherChronicallyIllUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbNaturalFatherMentallyIllYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalFatherMentallyIllNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalFatherMentallyIllUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNaturalFatherInPrisonUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalFatherInPrisonYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalFatherInPrisonNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NATUTAL MOTHER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel26.setText("IS THE NATURAL MOTHER:-");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel27.setText("[a]");

        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel28.setText("ALIVE ?");

        rbNaturalMotherAliveYes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rbNaturalMotherAliveYes.setText("YES");

        rbNaturalMotherAliveNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherAliveNo.setText("NO");

        rbNaturalMotherAliveUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherAliveUnknown.setText("UNKNOWN");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel29.setText("[b]");

        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel30.setText("LIVING WITH THIS CHILD ?");

        rbNaturalMotherLivingWithChildYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherLivingWithChildYes.setText("YES");

        rbNaturalMotherLivingWithChildNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherLivingWithChildNo.setText("NO");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel31.setText("[c]");

        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel32.setText("CONTRIBUTING FINANCIALLY TO THIS CHILD ?");

        rbNaturalMotherContributingFinanciallytoChildYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherContributingFinanciallytoChildYes.setText("YES");
     
        rbNaturalMotherContributingFinanciallytoChildNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherContributingFinanciallytoChildNo.setText("NO");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel33.setText("[d]");

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel34.setText("(i) HANDICAPPED?");

        rbNaturalMotherHandicappedYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherHandicappedYes.setText("YES");

        rbNaturalMotherHandicappedNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherHandicappedNo.setText("NO");

        rbNaturalMotherHandicappedUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherHandicappedUnknown.setText("UNKOWN");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel35.setText("(ii) HOW ?");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel36.setText("[e]");

        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel37.setText(" (i) CHRONICALLY ILL ?");

        rbNaturalMotherChronicallyIllYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherChronicallyIllYes.setText("YES");

        rbNaturalMotherChronicallyIllNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherChronicallyIllNo.setText("NO");

        rbNaturalMotherChronicallyIllUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherChronicallyIllUnknown.setText("UNKNOWN");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel38.setText("(ii) HOW ?");

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel39.setText("[f]");

        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel40.setText(" MENTALLY ILL ?");

        rbNaturalMotherMentallyIllYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherMentallyIllYes.setText("YES");

        rbNaturalMotherMentallyIllNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherMentallyIllNo.setText("NO");

        rbNaturalMotherMentallyIllUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherMentallyIllUnknown.setText("UNKNOWN");

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel41.setText("[g]");

        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel42.setText("IN PRISON ?");

        rbNaturalMotherInPrisonYes.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherInPrisonYes.setText("YES");

        rbNaturalMotherInPrisonNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherInPrisonNo.setText("NO");
      
        rbNaturalMotherInPrisonUnknown.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rbNaturalMotherInPrisonUnknown.setText("UNKNOWN");

        txtAreaNaturalMotherHandicapped.setColumns(20);
        txtAreaNaturalMotherHandicapped.setRows(5);
        jScrollPane3.setViewportView(txtAreaNaturalMotherHandicapped);

        txtAreaNaturalMotherChronicallyIll.setColumns(20);
        txtAreaNaturalMotherChronicallyIll.setRows(5);
        jScrollPane4.setViewportView(txtAreaNaturalMotherChronicallyIll);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel33)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel35)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbNaturalMotherLivingWithChildYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalMotherLivingWithChildNo))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator11)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbNaturalMotherContributingFinanciallytoChildYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalMotherContributingFinanciallytoChildNo))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator12))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbNaturalMotherHandicappedYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalMotherHandicappedNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalMotherHandicappedUnknown))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jSeparator13)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbNaturalMotherInPrisonYes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalMotherInPrisonNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNaturalMotherInPrisonUnknown))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbNaturalMotherMentallyIllYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalMotherMentallyIllNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalMotherMentallyIllUnknown))
                            .addComponent(jSeparator14)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane4))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbNaturalMotherChronicallyIllYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalMotherChronicallyIllNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalMotherChronicallyIllUnknown))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbNaturalMotherAliveYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalMotherAliveNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalMotherAliveUnknown)
                                .addGap(8, 8, 8))
                            .addComponent(jSeparator10)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9)))
                .addGap(0, 0, 0))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNaturalMotherAliveUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNaturalMotherAliveNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNaturalMotherAliveYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbNaturalMotherLivingWithChildYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rbNaturalMotherLivingWithChildNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalMotherContributingFinanciallytoChildNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalMotherContributingFinanciallytoChildYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbNaturalMotherHandicappedYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalMotherHandicappedNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalMotherHandicappedUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalMotherChronicallyIllYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalMotherChronicallyIllNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbNaturalMotherChronicallyIllUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbNaturalMotherMentallyIllYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalMotherMentallyIllNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalMotherMentallyIllUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbNaturalMotherInPrisonUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalMotherInPrisonYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbNaturalMotherInPrisonNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator16.setForeground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbxMaritalStatusofParents, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addComponent(rbNaturalParentsTogetherYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalParentsTogetherNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbNaturalParentsTogetherUnknown)))
                        .addContainerGap())
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator16)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNaturalParentsTogetherYes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNaturalParentsTogetherNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNaturalParentsTogetherUnknown, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbxMaritalStatusofParents, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jSeparator17.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbxChildLivingUnder, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator17)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxChildLivingUnder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1972, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jScrollPane2.setViewportView(jPanel12);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnChildRegReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnChildReg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChildRegReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChildReg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(pUser);
        pUser.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        return pUser;
    }
}
