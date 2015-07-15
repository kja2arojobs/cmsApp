package com.application.controllers;

import com.application.datapools.ChildDataPool;
import com.application.datapools.ChildUpdateDetailsDataPool;
import com.application.datapools.StaffReportsDataPool;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author kadhush
 */
public class GuiCmbxListener implements ItemListener {

    private static final ChildDataPool cDataPool = new ChildDataPool();
    private static final ChildUpdateDetailsDataPool cuDataPool = new ChildUpdateDetailsDataPool();
    private static final StaffReportsDataPool srDatapool = new StaffReportsDataPool();
    private static final Logger LOG = Logger.getLogger(GuiCmbxListener.class.getName());

    private static JComboBox cmbxSchool, cmbxUpdateSchool, cmbxSearchStaff;

    @Override
    public void itemStateChanged(ItemEvent e) {
        JComboBox<String> cmbx = (JComboBox<String>) e.getSource();
        if (cmbx.equals(cmbxSchool)) {
            if (cmbxSchool.getSelectedIndex() == 8 || cmbxSchool.getSelectedIndex() == 6 || cmbxSchool.getSelectedIndex() == 7) {
                cDataPool.activateTxtCourse();
            } else {
                cDataPool.deactivateTxtCourse();
            }
        } else if (cmbx.equals(cmbxUpdateSchool)) {
            if (cmbxUpdateSchool.getSelectedIndex() == 8 || cmbxUpdateSchool.getSelectedIndex() == 6 || cmbxUpdateSchool.getSelectedIndex() == 7) {
                cuDataPool.activateTxtCourse();
            } else {
                cuDataPool.deactivateTxtCourse();
            }

        } else if (cmbx.equals(cmbxSearchStaff)) {
            srDatapool.activateDeactivateControls();
        }
    }

    /**
     *
     * @param cmbx
     */
    public void setChildCmbxControl(JComboBox[] cmbx) {
        cmbxSchool = cmbx[4];
    }

    public void setChildUpdataCmbxControl(JComboBox[] cmbx) {
        cmbxUpdateSchool = cmbx[4];
    }

    public void setStaffReportDataControls(JComboBox[] cmbx) {
        cmbxSearchStaff = cmbx[0];
    }

}
