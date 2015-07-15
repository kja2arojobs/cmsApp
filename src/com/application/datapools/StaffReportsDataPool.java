/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.datapools;

import com.application.controllers.GuiCmbxListener;
import com.application.controllers.GuiTxtListener;
import com.application.controllers.JGuiButtonListener;
import com.application.models.BCMStaffModel;
import com.application.models.DEEStaffModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author kadhush
 */
public class StaffReportsDataPool extends DataPool {

    private static JButton[] btn;
    private static JScrollPane[] jsp;
    private static JTextField[] txt;
    private static JComboBox[] cmbx;
    private static JEditorPane htmlPaneR;

    public void setDataControls(JScrollPane[] jspS, JTextField[] txtS, JComboBox[] cmbxS, JButton[] btnS) {
        JGuiButtonListener btnListener = new JGuiButtonListener();
        GuiTxtListener txtListener = new GuiTxtListener();
        GuiCmbxListener cmbxListener = new GuiCmbxListener();

        btn = btnS;
        btn[0].addActionListener(btnListener);
        btn[1].addActionListener(btnListener);
        btnListener.setStaffReportDataControl(btn);

        jsp = jspS;
        txt = txtS;
        txt[0].addKeyListener(txtListener);
        txtListener.setStaffReport(txt);
        cmbx = cmbxS;
        cmbx[0].addItemListener(cmbxListener);
        cmbx[1].addItemListener(cmbxListener);
        cmbxListener.setStaffReportDataControls(cmbx);
    }

    @Override
    public void setData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public void printReport() {

    }

    public void exportPDF() {

    }

    public void setStaffChoice() {
        System.out.println("Staff Choice");
    }

    public void activateDeactivateControls() {
        if (cmbx[0].getSelectedIndex() == 0 || cmbx[0].getSelectedIndex() == 2 || cmbx[0].getSelectedIndex() == 4) {
            txt[0].setEnabled(false);
            txt[0].setText("");
            cmbx[1].setEnabled(false);
        } else {
            txt[0].setEnabled(true);
            cmbx[1].setEnabled(true);
        }
        displayStaff();
    }

    private void displayStaff() {

        if (cmbx[0].getSelectedIndex() == 2) {
            displayBCMStaff();
        } else if (cmbx[0].getSelectedIndex() == 4) {
displayEEStaff();
        }

    }

    private void displayCDWStaff() {

    }

    private static final BCMStaffModel bcmModel = new BCMStaffModel();
    private String[] iSData, iSData0;
    private Object[] iOData, iOData0;

    private void displayBCMStaff() {
        //HERE
        String strHTM = "";
        iOData = bcmModel.getAllInfo("").toArray();

        if (iOData.length > 0) {

            for(Object iOData1 : iOData){
            iSData = iOData[0].toString().split(",\\s*");

            strHTM = "<html>"
                    + "<head>"
                    + "</head>"
                    + "<body>"
                    + "<center><b><br/><br/>"
                    + "COMPASSION INFORMATION MANAGEMENT SYSTEM"
                    + "<br/><br/>"
                    
                    + "<table width=\"100%\" bgcolor=\"black\">"
                    + "<tr >"
                    + "<td colspan=\"3\" align=\"center\"  bgcolor=\"white\">"
                    + "<b><center>B. COMMITEE MEMBERS</center></b>"
                    + "</td>"
                    + "</tr>"
                    
                    
                    
                     + "<tr>"
                    + "<td align=\"center\" bgcolor=\"white\"><b><u>CHAIRPERSON</u></b><br/>"
                    + iSData[0].substring(1)+""
                    + "</td>"
                     + "<td align=\"center\" bgcolor=\"white\"><b><u>SECRETARY</u></b><br/>"
                    + iSData[1]+"</td>"
                   
                     + "<td align=\"center\" bgcolor=\"white\"><b><u>OTHERS</u></b><br/>"
                  +iSData[3].replace(";", ",").substring(0, iSData[3].length()-1)+"</td>"
                    + "</tr>"
                    + "</table>"
                     + "</center>"
                    + "<body>"
                    + "</html>";
            }} else {
            strHTM = "<html>"
                    + "<head>"
                    + "</head>"
                    + "<body>"
                    + "<center><b><br/><br/>"
                    + "COMPASSION INFORMATION MANAGEMENT SYSTEM<br/><br/>"
                    + "NO RECORDS FOUND !"
                    + "</center>"
                    + "<body>"
                    + "</html>";
        }
        htmlPaneR = new JEditorPane();
        htmlPaneR.removeAll();
        htmlPaneR.setContentType("text/html");
        htmlPaneR.setEditable(false);
        htmlPaneR.setText(strHTM);
        jsp[1].setViewportView(htmlPaneR);
    }

    private void displayCYTStaff(String strCYTUser) {

    }

    private static final DEEStaffModel deeModel = new DEEStaffModel();
    private void displayEEStaff() {
 //HERE
        String strHTM = "";
        iOData = deeModel.getAllInfo("").toArray();

        if (iOData.length > 0) {
            for (Object iOData1 : iOData) {
                iSData = iOData1.toString().split(",\\s*");
                strHTM = "<html>"
                        + "<head>"
                        + "</head>"
                        + "<body>"
                        + "<center><b><br/><br/>"
                        + "<u>COMPASSION INFORMATION MANAGEMENT SYSTEM</u>"
                        + "<br/><br/>"
                        
                        + "<table width=\"100%\" bgcolor=\"black\">"
                        + "<tr >"
                        + "<td colspan=\"3\" align=\"center\"  bgcolor=\"white\">"
                        + "<b><center>ESTER ENCOUNTER</center></b>"
                        + "</td>"
                        + "</tr>"
                        
                        
                        
                        + "<tr>"
                        + "<td align=\"center\" bgcolor=\"white\"><b><u>CHAIRPERSON</u></b><br/>"
                        + iSData[0].substring(1)+""
                        + "</td>"
                        + "<td align=\"center\" bgcolor=\"white\"><b><u>SECRETARY</u></b><br/>"
                        + iSData[1]+"</td>"
                        
                        + "<td align=\"center\" bgcolor=\"white\"><b><u>OTHERS</u></b><br/>"
                        +iSData[3].replace(";", ",").substring(0, iSData[3].length()-1)+"</td>"
                        + "</tr>"
                        + "</table>"
                        + "</center>"
                        + "<body>"
                        + "</html>";
            }
} else {
            strHTM = "<html>"
                    + "<head>"
                    + "</head>"
                    + "<body>"
                    + "<center><b><br/><br/>"
                    + "COMPASSION INFORMATION MANAGEMENT SYSTEM<br/><br/>"
                    + "NO RECORDS FOUND !"
                    + "</center>"
                    + "<body>"
                    + "</html>";
        }
        htmlPaneR = new JEditorPane();
        htmlPaneR.removeAll();
        htmlPaneR.setContentType("text/html");
        htmlPaneR.setEditable(false);
        htmlPaneR.setText(strHTM);
        jsp[1].setViewportView(htmlPaneR);
    }

}
