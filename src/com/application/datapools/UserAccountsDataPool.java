/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.datapools;

import com.application.controllers.GuiTablesListener;
import com.application.controllers.GuiTxtListener;
import com.application.controllers.JGuiButtonListener;
import com.application.models.UserAccountsModel;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
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
public class UserAccountsDataPool extends DataPool {

    private static JButton[] btn;
    private static JTextField[] txt;
    private static JScrollPane[] jscrll;
    private static JComboBox[] cmbx;
    private static JLabel[] lbl;


    private static JTable searchUserUpdateTab, searchUserDeleteTab, usersTab, updateTab;
    private static Vector<String> colsSearchUserToUpdate, colsSearchUserToDelete, colsUsers;
    private static JEditorPane htmlPaneUUS, htmlPaneUDS, htmlPaneU, htmlPaneUS;
    private static String strUserName = "";
    private static String strPass = "";
    private static String strRePass = "";
    private static String strUserLevel = "";
    private static String strUserToUpdate = "";
    private static String strUserToDelete = "";
    private static final UserAccountsModel uaModel = new UserAccountsModel();
    private static final GuiTablesListener tabListener = new GuiTablesListener();
    private static Vector<String> loggedUsers = new Vector<>();
    private Object[] iOUData;
    private Object[] iODData;
    private Object[] iOSData;
    private Object[] iOUUData;
    private String[] iSUData;
    private String[] iSDData;
    private String[] iSSData;
    private String[] iSUUData;
    private TableColumn tm;
    private TableColumn tm2;

    private Vector<Vector> tbSUData = new Vector<>();
    private Vector<Vector> tbSDData = new Vector<>();
    private Vector<Vector> tbSSData = new Vector<>();
    private Vector<Vector> tbSUUData = new Vector<>();


    /**
     *
     */
    public UserAccountsDataPool() {
        colsSearchUserToUpdate = new Vector<>();
        colsSearchUserToDelete = new Vector<>();
        colsUsers = new Vector<>();
    }

    /**
     *
     * @param btnC
     * @param txtC
     * @param jscrllC
     * @param cmbxC
     * @param lblC
     */
    public void setDataControls(JButton[] btnC, JTextField[] txtC, JScrollPane[] jscrllC, JComboBox[] cmbxC, JLabel[] lblC) {
        JGuiButtonListener guiBtnListener = new JGuiButtonListener();

        btn = btnC;
        btn[0].addActionListener(guiBtnListener);
        btn[1].addActionListener(guiBtnListener);
        btn[2].addActionListener(guiBtnListener);
        btn[3].addActionListener(guiBtnListener);
        btn[4].addActionListener(guiBtnListener);
        btn[5].addActionListener(guiBtnListener);
        guiBtnListener.setUserControls(btn);

        txt = txtC;
        GuiTxtListener guiTxtListener = new GuiTxtListener();
        txt[0].addKeyListener(guiTxtListener);
        txt[4].addKeyListener(guiTxtListener);
        guiTxtListener.setUserControls(txt);

        jscrll = jscrllC;
        cmbx = cmbxC;
        lbl = lblC;
    }

    /**
     *
     * @param strusertodelete
     */
    public void setUserToDelete(String strusertodelete) {
        if (strusertodelete.equals("")) {
            if (txt[0].getText().trim().equals("")) {
                errorDetect(txt[0]);
            } else {
                strUserToDelete = txt[0].getText().trim();
            }
        } else {

        }
    }

    /**
     *
     * @param strusertoupdate
     */
    public void setUserToUpdate(String strusertoupdate) {
        if (strusertoupdate.equals("")) {
            if (txt[4].getText().trim().equals("")) {
                errorDetect(txt[4]);
            } else {
                strUserToUpdate = txt[4].getText().trim();
            }
        } else {

        }
    }

    /**
     *
     * @param strusername
     */
    public void setUserName(String strusername) {
        if (strusername.equals("")) {
            if (txt[3].getText().trim().equals("")) {
                errorDetect(txt[3]);
            } else {
                strUserName = txt[3].getText().trim();
            }
        }
    }

    /**
     *
     * @param strpass
     */
    public void setUserPass(String strpass) {
        if (strpass.equals("")) {
            if (txt[1].getText().trim().equals("")) {
                errorDetect(txt[1]);
            } else {
                strPass = txt[1].getText().trim();
            }
        }
    }

    /**
     *
     * @param strrepass
     */
    public void setUserRePass(String strrepass) {
        if (strrepass.equals("")) {
            if (txt[2].getText().trim().equals("")) {
                errorDetect(txt[2]);
            } else {
                strRePass = txt[2].getText().trim();
            }
        }
    }

    /**
     *
     * @param struserlevel
     */
    public void setUserLevel(String struserlevel) {
        if (struserlevel.equals("")) {
            strUserLevel = cmbx[1].getSelectedItem().toString();
        }
    }

    /**
     *
     * @return
     */
    public String getUserToUpdate() {
        return strUserToUpdate;
    }

    /**
     *
     * @return
     */
    public String getUserToDelete() {
        return strUserToDelete;
    }

    /**
     *
     * @return
     */
    public String getUserRePass() {
        return strRePass;
    }

    /**
     *
     * @return
     */
    public String getUserPass() {
        return strPass;
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
    public String getUserLevel() {
        return strUserLevel;
    }

    /**
     *
     */
    @Override
    public void setData() {

    }

    /**
     *
     * @param strCondition
     */
    public void setData(String strCondition) {

        switch (strCondition) {

            case "new_user":
                setUserName("");
                setUserRePass("");
                setUserPass("");
                setUserLevel("");
                break;
            case "update_user":
                setUserToUpdate("saro");
                break;
            case "delete_user":
                setUserToDelete("saro");
                break;
        }

    }

    /**
     *
     */
    @Override
    public void resetInput() {

    }

    /**
     *
     */
    @Override
    public void resetBorder() {

    }

    /**
     *
     * @return
     */
    @Override
    public boolean validateData() {
        return false;
    }

    public boolean validateData(String strCondition) {
        boolean yes_no = false;
        switch (strCondition) {

            case "new_user":
                yes_no = !getUserName().equals("") && !getUserPass().equals("");
                break;
            case "update_user":
                setUserToUpdate("saro");
                break;
            case "delete_user":
                setUserToDelete("saro");
                break;
        }

        return yes_no;
    }

    /**
     *
     */
    public void resetNewUser() {
        txt[1].setText("");
        txt[2].setText("");
        txt[3].setText("");
        cmbx[1].setSelectedIndex(0);
    }

    /**
     *
     */
    public void saveNewUser() {
        try {
            setData("new_user");

            if (validateData("new_user")) {

                Map<String, String> strData = new LinkedHashMap();
                if (getUserPass().equals(getUserRePass())) {
                    try {
                        strData.put("username", getUserName());
                        strData.put("password", getUserPass());
                        strData.put("level", getUserLevel());
                        strData.put("reg_date", "");
                        strData.put("exp_date", "");
                        strData.put("status", "active");

                        uaModel.addNewData(strData);
                        resetNewUser();
                        txt[1].setBorder(javax.swing.BorderFactory.createEtchedBorder());
                        txt[1].setBorder(javax.swing.BorderFactory.createEtchedBorder());
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(UserAccountsDataPool.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "The same username is already registered");
        }
    }

    private Vector<String> searchUserToUpdateHeaderGenerator() {

        colsSearchUserToUpdate.clear();
        String[] colHeader = {"<html><b> USER NAME</b></html>", "<html><b>LEVEL</b></html>"};
        colsSearchUserToUpdate.addAll(Arrays.asList(colHeader));
        return colsSearchUserToUpdate;

    }

    private Vector<String> searchUserToDeleteHeaderGenerator() {

        colsSearchUserToDelete.clear();
        String[] colHeader = {"<html><b> USER NAME</b></html>", "<html><b>LEVEL</b></html>", "ACTION [DELETE]"};
        colsSearchUserToDelete.addAll(Arrays.asList(colHeader));
        return colsSearchUserToDelete;

    }

    private Vector<String> usersTableHeader() {
        colsUsers.clear();
        String[] colHeader = {"<html><b> USER NAME</b></html>", "<html><b>LEVEL</b></html>", "<html><b>STATUS</b></html>"};
        colsUsers.addAll(Arrays.asList(colHeader));
        return colsUsers;
    }

    /**
     *
     * @param searchUpdate
     */
    public void searchUserToUpdate(String searchUpdate) {
        try {
            setData("update_user");

            String strSQL = "username LIKE  \"" + searchUpdate + "%\"";
            iOUData = uaModel.getAllUserData(strSQL).toArray();

            if (iOUData.length > 0) {
                Vector<String> strData;
                tbSUData.clear();
                if (iOUData.length >= 1) {

                    for (int i = 0; i <= iOUData.length - 1; i++) {
                        strData = new Vector<>();
                        iSUData = iOUData[i].toString().split(",\\s*");
                        strData.add(0, iSUData[0].toString().substring(1)); //
                        strData.add(1, iSUData[2].toString().toUpperCase());

                        this.tbSUData.add(i, strData);
                    }
                }

                searchUserUpdateTab = new JTable(new UserUpdateSearchResultTable(tbSUData, searchUserToUpdateHeaderGenerator()));
                searchUserUpdateTab.setAutoCreateRowSorter(false);
                searchUserUpdateTab.setModel(new UserUpdateSearchResultTable(tbSUData, searchUserToUpdateHeaderGenerator()));
                searchUserUpdateTab.addMouseListener(tabListener);
                tabListener.setSearchUpdateTable(searchUserUpdateTab);

                //CENTER THE DATA
                //SET COLUMN WIDTH
                for (int i = 0; i < searchUserUpdateTab.getColumnCount(); i++) {

                    if (i == 0) {
                        tm = searchUserUpdateTab.getColumnModel().getColumn(i);
                        int colLength = (int) (searchUserUpdateTab.getColumnModel().getColumn(i).getHeaderValue().toString().length() * 0);
                        tm.setPreferredWidth(colLength);

                    } else {
                        tm = searchUserUpdateTab.getColumnModel().getColumn(i);
                        int colLength = (int) (searchUserUpdateTab.getColumnModel().getColumn(i).getHeaderValue().toString().length() * 0);
                        tm.setPreferredWidth(colLength);
                    }
                }

                //SET COLOR
                for (int i = 0; i < searchUserUpdateTab.getColumnCount(); i++) {
                    //ADDING COLORS

                    if (i != 3) {
                        tm2 = searchUserUpdateTab.getColumnModel().getColumn(i);

                        tm2.setCellRenderer(new ColorColumnRenderer(Color.lightGray, Color.WHITE));
                    }

                }
                searchUserUpdateTab.setFont(new java.awt.Font("Tohama", 1, 12)); // NOI18N

                searchUserUpdateTab.setDoubleBuffered(true);
                searchUserUpdateTab.setDragEnabled(true);
                searchUserUpdateTab.setFillsViewportHeight(true);
                jscrll[2].setViewportView(searchUserUpdateTab);
            } else {
                String strHTM = "<html>"
                        + "<head>"
                        + "</head>"
                        + "<body>"
                        + "<center><b>No data found !</b></center>"
                        + "<body>"
                        + "</html>";
                htmlPaneUUS = new JEditorPane();
                htmlPaneUUS.removeAll();
                htmlPaneUUS.setContentType("text/html");
                htmlPaneUUS.setEditable(false);
                htmlPaneUUS.setText(strHTM);
                jscrll[2].setViewportView(htmlPaneUUS);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserAccountsDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param strSearcDelete
     */
    public void searchUserToDelete(String strSearcDelete) {
        //htmlPaneUDS
        try {
            setData("delete_user");

            String strSQL = "username LIKE  \"" + strSearcDelete + "%\"";
            iODData = uaModel.getAllUserData(strSQL).toArray();

            if (iODData.length > 0) {
                Vector<Object> strData;
                tbSDData.clear();
                if (iODData.length >= 1) {

                    for (int i = 0; i <= iODData.length - 1; i++) {
                        strData = new Vector<>();
                        iSDData = iODData[i].toString().split(",\\s*");
                        strData.add(iSDData[0].toString().substring(1)); //
                        strData.add(1, iSDData[2].toString().toUpperCase());
                        strData.add(2, new Boolean(true));

                        this.tbSDData.add(i, strData);
                    }
                }

                searchUserDeleteTab = new JTable(new UserDeleteTable(tbSDData, searchUserToDeleteHeaderGenerator()));
                searchUserDeleteTab.setAutoCreateRowSorter(false);
                searchUserDeleteTab.setModel(new UserDeleteTable(tbSDData, searchUserToDeleteHeaderGenerator()));
                searchUserDeleteTab.addMouseListener(tabListener);
                //tabListener.setAddAccountSearchTable(searchUserDeleteTab);

                //CENTER THE DATA
                //SET COLUMN WIDTH
                TableColumn column = null;
                for (int i = 0; i < searchUserDeleteTab.getColumnCount(); i++) {
                    column = searchUserDeleteTab.getColumnModel().getColumn(i);
                    if (i == 2) {
                        column.setPreferredWidth(50); //
                    }
                }
                //SET COLOR
                for (int i = 0; i < searchUserDeleteTab.getColumnCount(); i++) {
                    //ADDING COLORS

                    if (i != 2) {
                        tm2 = searchUserDeleteTab.getColumnModel().getColumn(i);

                        tm2.setCellRenderer(new ColorColumnRenderer(Color.lightGray, Color.WHITE));
                    }

                }
                searchUserDeleteTab.setFont(new java.awt.Font("Tohama", 1, 12)); // NOI18N

                searchUserDeleteTab.setDoubleBuffered(true);
                searchUserDeleteTab.setDragEnabled(true);
                searchUserDeleteTab.setFillsViewportHeight(true);

                jscrll[3].setViewportView(searchUserDeleteTab);
            } else {
                String strHTM = "<html>"
                        + "<head>"
                        + "</head>"
                        + "<body>"
                        + "<center><b>No data found !</b></center>"
                        + "<body>"
                        + "</html>";
                htmlPaneUDS = new JEditorPane();
                htmlPaneUDS.removeAll();
                htmlPaneUDS.setContentType("text/html");
                htmlPaneUDS.setEditable(false);
                htmlPaneUDS.setText(strHTM);
                jscrll[3].setViewportView(htmlPaneUDS);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserAccountsDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deletUsers() {

        String strSQL = "";

        int row = UserAccountsDataPool.searchUserDeleteTab.getRowCount();
        for (int i = 0; i < row; i++) {

            Object oUserName = UserAccountsDataPool.searchUserDeleteTab.getValueAt(i, 0);
            Object oUserAction = UserAccountsDataPool.searchUserDeleteTab.getValueAt(i, 2);
            String strUName = oUserName.toString();
            String strUserAction = oUserAction.toString();

            if (strUserAction.equals("true")) {
                strSQL += "DELETE FROM user_acc WHERE username =\"" + strUName + "\";  ";

                if (loggedUsers.contains(strUName)) {
                    JOptionPane.showMessageDialog(null, "You can not delete a logged in user !");
                } else {
                    uaModel.deleteUser(strSQL);
                }
            }

        }
        searchUserToDelete("");
        searchUserToUpdate("");
        getUsers();
    }

    public void getUsers() {
        try {
            int admin = 0, user = 0;
            String strSQL = "username != \"\"";
            iOSData = uaModel.getAllUserData(strSQL).toArray();

            if (iOSData.length > 0) {
                Vector<String> strData;
                tbSSData.clear();
                if (iOSData.length >= 1) {

                    for (int i = 0; i <= iOSData.length - 1; i++) {
                        strData = new Vector<>();
                        iSSData = iOSData[i].toString().split(",\\s*");
                        strData.add(0, iSSData[0].toString().substring(1)); //
                        strData.add(1, iSSData[2].toString().toUpperCase());

                        if (iSSData[2].toString().equals("Administrator")) {
                            admin += 1;
                        } else if (iSSData[2].toString().equals("User")) {
                            user += 1;
                        }
                        strData.add(2, iSSData[5].toString().substring(0, iSSData[5].toString().length() - 1).toUpperCase());

                        this.tbSSData.add(i, strData);
                    }
                }

                usersTab = new JTable(new UsersTable(tbSSData, usersTableHeader()));
                usersTab.setAutoCreateRowSorter(false);
                usersTab.setModel(new UsersTable(tbSSData, usersTableHeader()));

                //SET COLUMN WIDTH
                for (int i = 0; i < usersTab.getColumnCount(); i++) {

                    if (i == 0) {
                        tm = usersTab.getColumnModel().getColumn(i);
                        int colLength = (int) (usersTab.getColumnModel().getColumn(i).getHeaderValue().toString().length() * 0);
                        tm.setPreferredWidth(colLength);

                    } else {
                        tm = usersTab.getColumnModel().getColumn(i);
                        int colLength = (int) (usersTab.getColumnModel().getColumn(i).getHeaderValue().toString().length() * 0);
                        tm.setPreferredWidth(colLength);
                    }
                }

                //SET COLOR
                for (int i = 0; i < usersTab.getColumnCount(); i++) {
                    //ADDING COLORS

                    if (i != 3) {
                        tm2 = usersTab.getColumnModel().getColumn(i);

                        tm2.setCellRenderer(new ColorColumnRenderer(Color.lightGray, Color.WHITE));
                    }

                }
                usersTab.setFont(new java.awt.Font("Tohama", 1, 12)); // NOI18N
                usersTab.setRowSelectionAllowed(true);

                usersTab.setDoubleBuffered(true);
                usersTab.setDragEnabled(true);
                usersTab.setFillsViewportHeight(true);
                jscrll[0].setViewportView(usersTab);

            } else {
                String strHTM = "<html>"
                        + "<head>"
                        + "</head>"
                        + "<body>"
                        + "<center><b>No data found !</b></center>"
                        + "<body>"
                        + "</html>";
                htmlPaneU = new JEditorPane();
                htmlPaneU.removeAll();
                htmlPaneU.setContentType("text/html");
                htmlPaneU.setEditable(false);
                htmlPaneU.setText(strHTM);
                jscrll[0].setViewportView(htmlPaneU);

            }
            lbl[0].setText("Total System Users:  " + (admin + user) + "");
            lbl[1].setText("Admin:   " + admin + "");
            lbl[2].setText("Users:   " + user + "");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserAccountsDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void getUserInfoForUpdate(String strUName) {
        //htmlPaneUDS
        try {

            String strSQL = "username LIKE  \"" + strUName + "%\"";
            iOUUData = uaModel.getAllUserData(strSQL).toArray();

            if (iOUUData.length > 0) {
                Vector<Object> strData;
                tbSUUData.clear();
                if (iOUUData.length >= 1) {

                    for (int i = 0; i <= iOUUData.length - 1; i++) {
                        strData = new Vector<>();
                        iSUUData = iOUUData[i].toString().split(",\\s*");
                        strData.add(iSUUData[0].toString().substring(1)); //
                        strData.add(1, iSUUData[2].toString().toUpperCase());
                        strData.add(2, new Boolean(true));

                        this.tbSUUData.add(i, strData);
                    }
                }

                updateTab = new JTable(new UpdateTable(tbSUUData, searchUserToDeleteHeaderGenerator()));
                updateTab.setAutoCreateRowSorter(false);
                updateTab.setModel(new UpdateTable(tbSUUData, searchUserToDeleteHeaderGenerator()));

                //CENTER THE DATA
                //SET COLUMN WIDTH
                TableColumn column = null;
                for (int i = 0; i < updateTab.getColumnCount(); i++) {
                    column = updateTab.getColumnModel().getColumn(i);
                    if (i == 2) {
                        column.setPreferredWidth(50); //
                    }
                }
                //SET COLOR
                for (int i = 0; i < updateTab.getColumnCount(); i++) {
                    //ADDING COLORS

                    if (i != 2) {
                        tm2 = updateTab.getColumnModel().getColumn(i);

                        tm2.setCellRenderer(new ColorColumnRenderer(Color.lightGray, Color.WHITE));
                    }

                }
                updateTab.setFont(new java.awt.Font("Tohama", 1, 12)); // NOI18N

                updateTab.setDoubleBuffered(true);
                updateTab.setDragEnabled(true);
                updateTab.setFillsViewportHeight(true);

                jscrll[1].setViewportView(updateTab);

            } else {
                String strHTM = "<html>"
                        + "<head>"
                        + "</head>"
                        + "<body>"
                        + "<center><b>No data found !</b></center>"
                        + "<body>"
                        + "</html>";
                htmlPaneUS = new JEditorPane();
                htmlPaneUS.removeAll();
                htmlPaneUS.setContentType("text/html");
                htmlPaneUS.setEditable(false);
                htmlPaneUS.setText(strHTM);
                jscrll[1].setViewportView(htmlPaneUS);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserAccountsDataPool.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public void setLoggedInUsers(String strLUsers) {
        if (loggedUsers.isEmpty()) {
            loggedUsers.add(strLUsers);
        } else {
            if (loggedUsers.contains(strLUsers)) {
            } else {
                loggedUsers.add(strLUsers);
            }
        }
    }

    public boolean checkUser(String strLUsers) {
        return loggedUsers.contains(strLUsers);
    }

    public void removeLoggedUser(String strLUsers) {

        if (strLUsers.equals("")) {
            loggedUsers.removeAllElements();
        } else {
            loggedUsers.remove(strLUsers);
        }

    }

//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
//XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    private class UpdateTable extends AbstractTableModel {

        private Vector<Vector> tbData = new Vector<>();
        private Vector<String> colsSearchUserToUpdate = new Vector();
        private Vector row = new Vector();

        public UpdateTable() {
        }

        public UpdateTable(Vector<Vector> tbData, Vector<String> colsSearchUserToUpdate) {
            this.tbData = tbData;
            this.colsSearchUserToUpdate = colsSearchUserToUpdate;
        }

        @Override
        public int getRowCount() {
            return this.tbData.size();
        }

        @Override
        public int getColumnCount() {
            return this.colsSearchUserToUpdate.size();
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

            return colsSearchUserToUpdate.elementAt(col).toString();
        }
    }

    private class UserUpdateSearchResultTable extends AbstractTableModel {

        private Vector<Vector> tbData = new Vector<>();
        private Vector<String> colsSearchUserToUpdate = new Vector();
        private Vector row = new Vector();

        public UserUpdateSearchResultTable() {
        }

        public UserUpdateSearchResultTable(Vector<Vector> tbData, Vector<String> colsSearchUserToUpdate) {
            this.tbData = tbData;
            this.colsSearchUserToUpdate = colsSearchUserToUpdate;
        }

        @Override
        public int getRowCount() {
            return this.tbData.size();
        }

        @Override
        public int getColumnCount() {
            return this.colsSearchUserToUpdate.size();
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

            return colsSearchUserToUpdate.elementAt(col).toString();
        }
    }

    private class UserDeleteTable extends AbstractTableModel {

        private Vector<Vector> tbData = new Vector<>();
        private Vector<String> colsSearchUserToUpdate = new Vector();
        private Vector row = new Vector();

        public UserDeleteTable() {
        }

        public UserDeleteTable(Vector<Vector> tbData, Vector<String> colsSearchUserToUpdate) {
            this.tbData = tbData;
            this.colsSearchUserToUpdate = colsSearchUserToUpdate;
        }

        @Override
        public int getRowCount() {
            return this.tbData.size();
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (columnIndex != 2) {
                return String.class;
            } else {
                return Boolean.class;
            }
        }

        @Override
        public int getColumnCount() {
            return this.colsSearchUserToUpdate.size();
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            row = (Vector) this.tbData.elementAt(rowIndex);
            return row.elementAt(columnIndex);
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return columnIndex == 2;

        }

        @Override
        public void setValueAt(Object value, int rowIndex, int col) {
            row = (Vector) this.tbData.elementAt(rowIndex);
            try {
                //float flt = Float.parseFloat(value.toString());
                row.setElementAt(value, col);
                fireTableDataChanged();
                fireTableCellUpdated(rowIndex, col);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Check your input Values");
            }

        }

        @Override
        public String getColumnName(int col) {

            return colsSearchUserToUpdate.elementAt(col).toString();
        }
    }

    private class UsersTable extends AbstractTableModel {

        private Vector<Vector> tbData = new Vector<>();
        private Vector<String> colsUser = new Vector();
        private Vector row = new Vector();

        public UsersTable() {
        }

        public UsersTable(Vector<Vector> tbData, Vector<String> colsUser) {
            this.tbData = tbData;
            this.colsUser = colsUser;
        }

        @Override
        public int getRowCount() {
            return this.tbData.size();
        }

        @Override
        public int getColumnCount() {
            return this.colsUser.size();
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
                //float flt = Float.parseFloat(value.toString());
                row.setElementAt(value, col);
                fireTableDataChanged();
                fireTableCellUpdated(rowIndex, col);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Check your input Values");
            }

        }

        @Override
        public String getColumnName(int col) {

            return colsUser.elementAt(col).toString();
        }
    }

}
