/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.controllers;

import com.application.datapools.ChildReportDataPool;
import com.application.datapools.ChildUpdateDetailsDataPool;
import com.application.datapools.UserAccountsDataPool;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author kadhush
 */
public class GuiTablesListener extends MouseAdapter implements MouseListener {

    private final static ChildReportDataPool crDataPool = new ChildReportDataPool();
    private final static UserAccountsDataPool uaDataPool = new UserAccountsDataPool();
    private final static ChildUpdateDetailsDataPool cuDataPool = new ChildUpdateDetailsDataPool();
    private static JTable searchTable, uTable, ucTable;
    private static final Logger LOG = Logger.getLogger(GuiTablesListener.class.getName());

    /**
     *
     * @param sTable
     */
    public void setAddAccountSearchTable(JTable sTable) {
        GuiTablesListener.searchTable = sTable;
    }

    public void setSearchUpdateTable(JTable uTable) {
        GuiTablesListener.uTable = uTable;
    }

    public void setUpdateChildDetails(JTable ucTable) {
        GuiTablesListener.ucTable = ucTable;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        JTable tab = (JTable) e.getSource();
        if (tab.equals(GuiTablesListener.searchTable)) {
            int row = GuiTablesListener.searchTable.getSelectedRow();
            Object cID = GuiTablesListener.searchTable.getValueAt(row, 1);
            crDataPool.getChildReport(cID.toString());
        } else if (tab.equals(uTable)) {
            int row = GuiTablesListener.uTable.getSelectedRow();
            Object uN = GuiTablesListener.uTable.getValueAt(row, 0);
            uaDataPool.getUserInfoForUpdate(uN.toString());
        } else if (tab.equals(ucTable)) {
            int row = GuiTablesListener.ucTable.getSelectedRow();
            Object uN = GuiTablesListener.ucTable.getValueAt(row, 1);
            cuDataPool.setSelectedChildForUpdate(uN.toString());
        }
    }

}
