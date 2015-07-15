/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.datapools;

import com.application.controllers.GuiTablesListener;
import com.application.controllers.GuiTxtListener;
import com.application.controllers.JGuiButtonListener;
import com.application.models.ChildBioModel;
import com.application.models.ChildDataModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.library.DocumentRendererPrinter;
import com.library.Generators;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author kadhush
 */
public class ChildReportDataPool extends DataPool {

    private static JButton[] btn;
    private static JComboBox[] cmbx;
    private static JScrollPane[] jscrll;
    private static JTextField[] txt;

    private static Vector<String> cols;
    private static JEditorPane htmlPane, htmlPaneS, htmlPaneR;
    private static String dirName;
    private static String strHtml;
    private static boolean strLock = false, strLockO = false;
    private static final ChildBioModel cbModel = new ChildBioModel();
    private static final ChildDataModel cdModel = new ChildDataModel();
    private static final Generators gen = new Generators();
    private static final DocumentRendererPrinter drPrinter = new DocumentRendererPrinter();
    private TableColumn tm, tm2;
    private Vector<Vector> tbData = new Vector<>();
    private String[] iSData, iSData0;
    private Object[] iOData, iOData0;
    private JTable searchTab;
    private String strSearchChild;
    private String localImageSrc = "file:///"+gen.getImageURL().replace("\\", "/")+"/compR.png";
    private String localPDFImageSrc = gen.getImageURL().replace("\\", "/")+"/compR.png";
    private static String  localImageChildPhoto = "";
    private  static String localPDFImageChildPhoto = "";
    private BufferedImage buffImg, buffImgC;

    /**
     *
     */
    public ChildReportDataPool() {
        cols = new Vector();
    }

    private void createDirImg() {

  

        dirName = gen.getImageURL();

    }

    /**
     *
     * @param btnC
     * @param cmbxC
     * @param jscrllC
     * @param txtC
     */
    public void setDataControls(JButton[] btnC, JComboBox[] cmbxC, JScrollPane[] jscrllC, JTextField[] txtC) {

        btn = btnC;
        cmbx = cmbxC;
        jscrll = jscrllC;
        txt = txtC;
        JGuiButtonListener guiBtnListener = new JGuiButtonListener();

        btn[0].addActionListener(guiBtnListener);
        btn[1].addActionListener(guiBtnListener);
        guiBtnListener.setChildReportBtn(btn);

        GuiTxtListener txtListener = new GuiTxtListener();
        txt[0].addKeyListener(txtListener);
        txtListener.setChildReportDataControls(txtC);
    }

    /**
     *
     * @param chldNo
     */
    public void setChildNo(String chldNo) {
        if (chldNo.equals("")) {
            strSearchChild = txt[0].getText().toUpperCase();
        } else {
            strSearchChild = "";
        }

    }

    /**
     *
     * @return
     */
    public String getChildNo() {
        return strSearchChild;
    }

    /**
     *
     */
    @Override
    public void setData() {
        setChildNo("");
    }

    /**
     *
     */
    @Override
    public void resetInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    public void searchChildData() {

        setData();
        displayData();
        String strSQL = "chld_no LIKE  \"" + strSearchChild + "%\"";
        displayChildSearch(strSQL);
    }

    /**
     *
     */
    public void displayData() {
        String strHTM = "<html>"
                + "<head>"
                + "</head>"
                + "<body>"
                + "<center><b><br/><br/>"
                + "COMPASSION INFORMATION MANAGEMENT SYSTEM<br/><br/>Select CHILD to display REPORT.</b></center>"
                + "<body>"
                + "</html>";
        htmlPaneR = new JEditorPane();
        htmlPaneR.removeAll();
        htmlPaneR.setContentType("text/html");
        htmlPaneR.setEditable(false);
        htmlPaneR.setText(strHTM);
        jscrll[0].setViewportView(htmlPaneR);
        strLockO = false;
    }

    /**
     *
     * @param strSQL
     */
    public void displayChildSearch(String strSQL) {
        GuiTablesListener tabListener = new GuiTablesListener();

        iOData = cbModel.getAllInfo(strSQL).toArray();

        if (iOData.length > 0) {
            strLock = true;

            Vector<String> strData;
            tbData.clear();
            if (iOData.length >= 1) {

                for (int i = 0; i <= iOData.length - 1; i++) {

                    strData = new Vector<>();
                    iSData = iOData[i].toString().split("::;,\\s*");

                    strData.add(0, iSData[1]); //
                    strData.add(1, iSData[0].substring(1));

                    this.tbData.add(i, strData);
                }

            }

            searchTab = new JTable(new ChildReportTables(tbData, searchHeaderGenerator()));
            searchTab.setAutoCreateRowSorter(false);
            searchTab.setModel(new ChildReportTables(tbData, searchHeaderGenerator()));
            searchTab.addMouseListener(tabListener);
            tabListener.setAddAccountSearchTable(searchTab);

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
            jscrll[1].setViewportView(searchTab);
        } else {
            strLock = false;
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
            jscrll[1].setViewportView(htmlPaneS);

        }
    }

    /**
     *
     * @param strChldNo
     */
    public void getChildReport(String strChldNo) {

        txt[0].setText(strChldNo);
        displayChildReport(strChldNo);
    }

    /**
     *
     * @param strChldNo
     */
    public void displayChildReport(String strChldNo) {
        try {
        localImageChildPhoto = "";
        localPDFImageChildPhoto ="";
            
            Image localImage = createImage();

            strHtml = "";

            String strSql = "SELECT      child_bio.chld_no, child_bio.chld_name, child_bio.chld_att_schl, "
                    + "child_bio.chld_schl, child_bio.chld_course, child_bio.under_supervision, "
                    + "child_bio.parents_together ,child_bio.parents_marital ,child_bio.coordinator_project, "
                    + "child_father.alive_f, child_father.live_chld_f, child_father.finance_chld_f, "
                    + "child_father.handicapped_f, child_father.how_handicapped_f, child_father.chronically_ill_f, "
                    + "child_father.how_chronically_f, child_father.mentally_ill_f, child_father.in_prison_f, "
                    + "child_father.employment_f, child_father.description_f ,"
                    + "child_mother.alive_m, child_mother.live_chld_m, child_mother.finance_chld_m,"
                    + "child_mother.handicapped_m , child_mother.how_handicapped_m, "
                    + "child_mother.chronically_ill_m ,child_mother.how_chronically_m, "
                    + "child_mother.mentally_ill_m, child_mother.in_prison_m, "
                    + "child_mother.employment_m,  child_mother.description_m, "
                    + "child_bio.chld_residence, child_bio.chld_photo"
                    + "      FROM    child_bio, child_father, child_mother "
                    + " WHERE child_bio.chld_no = child_father.chld_no_f  AND  child_bio.chld_no = child_mother.chld_no_m  AND  child_bio.chld_no =\"" + strChldNo + "::;\"";

            iOData0 = cdModel.getAllChildData(strSql).toArray();

            iSData0 = iOData0[0].toString().split("::;,\\s*");
            
            
           // System.out.println(iOData0[0]);

            localImageChildPhoto ="file:///"+ gen.getImageURL().replace("\\", "/") + "/" + iSData0[33].substring(0, iSData0[33].length() - 1);
           // 
            System.out.println(localImageChildPhoto);
            localPDFImageChildPhoto = gen.getImageURL().replace("\\", "/") + "/" + iSData0[33].substring(0, iSData0[33].length() - 1);

            Image localChlsImage = createChildImage();
            strHtml = "<html>"
                    + "<head>"
                    + "<style type=\"text/css\">"
                    + "#imgTtl{top:3px;margin-bottom:3px;}"
                    + "#tabContent{margin-left:10%;}"
                    + "</style>"
                    + "</head>"
                    + "<body>"
                    + "<div id=\"header\">"
                    + "<table id= \"imgTtl\" width=\"100%\">"
                    + "<tr>"
                    + "<td align=\"center\" width=\"30%\">"
                    + " <img src=\"" + localImageSrc + "\" width=\"102px\" height=\"102px\" align=\"left\"></img>"
                    + "</td>"
                    + "<td align=\"center\" width=\"40%\">"
                    + "<p><b>TZ 555 MORAVIAN KIGOTO STUDENT CENTRE<br/>CHILD REPORT</b>"
                    + "<br/><b>AS AT &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + gen.getTodayDate("dash") + "</b></p>"
                    + "</td>"
                    // localImageChildPhoto, localPDFImageChildPhoto
                    + "<td align=\"center\"  width=\"30%\">"
                    + " <img src=\"" + localImageChildPhoto + "\" width=\"102px\" height=\"102px\" align=\"right\"></img>"
                    + "</td>"
                    + "</tr>"
                    + "</table>"
                    + "<table width=\"100%\">"
                    + "<tr>"
                    + "<td align=\"center\"><b>CHILD NAME</b>&nbsp;&nbsp;&nbsp;" + iSData0[1] + "</td>"
                    + "<td align=\"center\"><b>CHILD NUMBER</b>&nbsp;&nbsp;&nbsp;" + iSData0[0].substring(1) + "</td>"
                    + "</tr>"
                    //DATA DISPLAY
                    + "</table>"
                    + "<hr/>"
                    + "</div>"
                    + "<div id=\"content\">"
                    + "<table width=\"80%\" id=\"tabContent\">"
                    + "<tr>"
                    + "<td>"
                    //START OF REPORT DATA
                    + "<dl>"
                    //SCHOOL
                    + "<dt><b><u>SCHOOL</u></b></dt>"
                    + "<dd> i)  Child Residence ? &nbsp;&nbsp;   <b>" + iSData0[31].toLowerCase() + "</b></dd>"
                    + "<dd> ii)  Is the child attending school ? &nbsp;&nbsp;   <b>" + iSData0[2].toLowerCase() + "</b></dd>"
                    + "<dd> iii) Level of the school ? &nbsp;&nbsp;&nbsp;&nbsp;  <b>" + iSData0[3].toLowerCase() + "</b></dd>";
            if (!iSData0[4].equals("")) {
                strHtml += "<dd> iv)  Course of study ? &nbsp;&nbsp; <b>" + iSData0[4].toLowerCase() + "</b></dd>";
            }

            //GUARDIANS
            strHtml += "<dt><br/><b><u>GUARDIANS</u></b></dt>"
                    + "<dd> i) Child is living under supervision of ? &nbsp;  <b>" + iSData0[5].toLowerCase() + "</b></dd>"
                    //NATURAL PARENTS
                    + "<dt><br/><b><u>NATURAL PARENTS</u></b></dt>"
                    + "<dd> i) Are the natural parents together now ? &nbsp;  <b>" + iSData0[6].toLowerCase() + "</b></dd>"
                    + "<dd> ii)The marital status of the natural parents:&nbsp;<b>" + iSData0[7].toLowerCase() + "</b></dd>"
                    //NATURAL FATHER
                    + "<dt><br/><b><u>NATURAL FATHER</u></b></dt>"
                    + "<dd> i)Is the natural father:</dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;a)Alive ?&nbsp;<b>" + iSData0[9].toLowerCase() + "</b></dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;b)Living with this child ?&nbsp;<b>" + iSData0[10].toLowerCase() + "</b></dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;c)Contributing financially to this child ?&nbsp;<b>" + iSData0[11].toLowerCase() + "</b></dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;d)Handicapped ? &nbsp;<b>" + iSData0[12].toLowerCase() + "</b></dd>";
            if (iSData0[12].toLowerCase().equals("yes")) {
                strHtml += "<dd> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;How ? &nbsp;<b>" + iSData0[13].toLowerCase() + "</b></dd>";
            }
            strHtml += "<dd> &nbsp;&nbsp;&nbsp;e)Chronically ill ? &nbsp;<b>" + iSData0[14].toLowerCase() + "</b></dd>";
            if (iSData0[14].toLowerCase().equals("yes")) {
                strHtml += "<dd> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;How ? &nbsp;<b>" + iSData0[15].toLowerCase() + "</b></dd>";
            }
            strHtml += "<dd> &nbsp;&nbsp;&nbsp;f)Mentally ill ? &nbsp;<b>" + iSData0[16].toLowerCase() + "</b></dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;g)In prison ?&nbsp;<b>" + iSData0[17].toLowerCase() + "</b></dd>"
                    //NATURAL MOTHER
                    + "<dt><br/><b><u>NATURAL MOTHER</u></b></dt>"
                    + "<dd> i)Is the natural mother:</dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;a)Alive ?&nbsp;<b>" + iSData0[20].toLowerCase() + "</b></dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;b)Living with this child ?&nbsp;<b>" + iSData0[21].toLowerCase() + "</b></dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;c)Contributing financially to this child ?&nbsp;<b>" + iSData0[22].toLowerCase() + "</b></dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;d)Handicapped ? &nbsp;<b>" + iSData0[23].toLowerCase() + "</b></dd>";
            if (iSData0[23].toLowerCase().equals("yes")) {
                strHtml += "<dd> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;How ? &nbsp;<b>" + iSData0[24].toLowerCase() + "</b></dd>";
            }
            strHtml += "<dd> &nbsp;&nbsp;&nbsp;e)Chronically ill ? &nbsp;<b>" + iSData0[25].toLowerCase() + "</b></dd>";
            if (iSData0[25].toLowerCase().equals("yes")) {
                strHtml += "<dd> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;How ? &nbsp;<b>" + iSData0[26].toLowerCase() + "</b></dd>";
            }
            strHtml += "<dd> &nbsp;&nbsp;&nbsp;f)Mentally ill ? &nbsp;<b>" + iSData0[27].toLowerCase() + "</b></dd>"
                    + "<dd> &nbsp;&nbsp;&nbsp;g)In prison ?&nbsp;<b>" + iSData0[28].toLowerCase() + "</b></dd>"
                    //FATHER OR MALE GUARDIAN
                    + "<dt><br/><b><u>FATHER OR MALE GUARDIAN</u></b></dt>"
                    + "<dd> i)   &nbsp;<b>" + iSData0[18].toLowerCase() + "</b></dd>"
                    + "<dd> ii) Father or male guardian employment description &nbsp;<b>" + iSData0[19].toLowerCase().replace(";", ",") + "</b></dd>"
                    //MOTHER OR FEMALE GUARDIAN
                    + "<dt><br/><b><u>MOTHER OR FEMALE GUARDIAN</u></b></dt>"
                    + "<dd> i)  &nbsp;<b>" + iSData0[29].toLowerCase().replace(";", ",") + "</b></dd>"
                    + "<dd> ii) Mother or female guardian employment description &nbsp;<b>" + iSData0[30].toLowerCase().replace(";", ",") + "</b></dd>"
                    //PROJECT DIRECTOR COMMENTS PER CHILD
                    + "<dt><br/><b><u>PROJECT DIRECTOR COMMENTS PER CHILD</u></b></dt>"
                    + "<dd> i)&nbsp;<b>" + iSData0[8].toLowerCase() + "</b></dd>"
                    + "</dl>"
                    //END OF REPORT DATA
                    + "</td>"
                    + "</tr>"
                    + "</table>"
                    + "</div>"
                    + "</body>"
                    + "</html>";

            strLockO = true;

            //DISPLAY THE REPORT
            htmlPane = new JEditorPane();
            htmlPane.removeAll();
            htmlPane.setContentType("text/html");
            htmlPane.setEditable(false);
            htmlPane.setText(strHtml);

            Dictionary cache = (Dictionary) htmlPane.getDocument().getProperty("imageCache");
            if (cache == null) {
                cache = new Hashtable();
                htmlPane.getDocument().putProperty("imageCache", cache);
            }
            
             Dictionary cacheChild = (Dictionary) htmlPane.getDocument().getProperty("imageCache");
            if (cache == null) {
                cacheChild = new Hashtable();
                htmlPane.getDocument().putProperty("imageCache", cacheChild);
            }

            URL u = new URL(localImageSrc);
            cache.put(u, localImage);

            URL c = new URL(localImageChildPhoto);
            cacheChild.put(c, localChlsImage);

            jscrll[0].setViewportView(htmlPane);

        } catch (ClassNotFoundException | SQLException | MalformedURLException ex) {
            Logger.getLogger(ChildReportDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Image createImage() {
        try {
            URL url = URI.create(localImageSrc).toURL();
            buffImg = ImageIO.read(url);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ChildReportDataPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChildReportDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buffImg;
    }

    private Image createChildImage() {
        try {
            //URL url = URI.create(localImageChildPhoto).toURL();
            System.out.println(localPDFImageChildPhoto);
            File url = new File(localPDFImageChildPhoto);
            buffImgC = ImageIO.read(url);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ChildReportDataPool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ChildReportDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
        return buffImgC;
    }

    private Vector<String> searchHeaderGenerator() {

        cols.clear();
        String[] colHeader = {"<html><b>NAME</b></html>", "<html><b>CHILD NUMBER</b></html>"};
        cols.addAll(Arrays.asList(colHeader));
        return cols;

    }

    /**
     *
     */
    public void printReport() {
        if (strLock && strLockO) {
            System.out.println("printing report");
            drPrinter.print(htmlPane);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No REPORT to print.",
                    "Information Management System",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void createDir() {

       
        

    }

    /**
     *
     */
    public void exportPDF() {
        if (strLock && strLockO) {
            setData();
            Document document = new Document(PageSize.LETTER);
            OutputStream out = null;
            try {
               
                // Create new PDF document
                out = new FileOutputStream(gen.getPDFURL() + "\\" + getChildNo() + ".pdf");

                // Get a PdfWriter instance to write in PDF document.
                PdfWriter pdfWriter = PdfWriter.getInstance(document, out);
                // Open the PDF document
                document.open();
                XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
                
                strHtml = strHtml.replace(localImageChildPhoto, localPDFImageChildPhoto);
               strHtml = strHtml.replace(localImageSrc, localPDFImageSrc);
                worker.parseXHtml(pdfWriter, document, new StringReader(strHtml));

            } catch (FileNotFoundException | DocumentException ex) {
                Logger.getLogger(ChildReportDataPool.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ChildReportDataPool.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    document.close();
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(ChildReportDataPool.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "No REPORT to Export to PDF.",
                    "Information Management System",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     *
     */
    public void exportDOC() {
        createDir();
    }

    private class ChildReportTables extends AbstractTableModel {

        private Vector<Vector> tbData = new Vector<>();
        private Vector<String> cols = new Vector();
        private Vector row = new Vector();

        public ChildReportTables() {
        }

        public ChildReportTables(Vector<Vector> tbData, Vector<String> cols) {
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

            return cols.elementAt(col).toString();
        }
    }

}
