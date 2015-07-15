package com.application.controllers;

import com.application.datapools.ChildReportDataPool;
import com.application.datapools.UserAccountsDataPool;
import com.application.views.ChildReport;
import com.application.views.ChildrenRegistration;
import com.application.views.EditChildrenDetails;
import com.application.views.LoginForm;
import com.application.views.StaffDetails;
import com.application.views.StaffReports;
import com.application.views.SystemSettings;
import com.application.views.UserAccounts;
import com.library.ButtonTabComponent;
import com.library.GuiTemplate;
import com.library.SystemSecurity;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;

/**
 * *************************************************************
 *
 * @author kadhuwa
 *
 *
 *
 * GUI BUTTON LISTENER
 * ************************************************************
 */
public class GuiButtonRibbonListener implements ActionListener {

    private static final ChildReportDataPool crDataPool = new ChildReportDataPool();
    private static final UserAccountsDataPool uaDataPool = new UserAccountsDataPool();

    private static GuiTemplate guiControl;

    private static LoginForm lg;

    /**
     * *******************************************************************************************
     *
     * START OF STUDENTS
     *
     **********************************************************************************************
     */
    /**
     * **********************************************************************************************
     *
     *
     * END OF STUDENTS
     *
     */
    private static ButtonTabComponent tab;

    private static final ChildrenRegistration cRegForm = new ChildrenRegistration();
    private static final EditChildrenDetails eCDForm = new EditChildrenDetails();
    private static final ChildReport cRForm = new ChildReport();
    private static final UserAccounts uaForm = new UserAccounts();
    private static final SystemSettings ssForm = new SystemSettings();
    private static final StaffDetails sdForm = new StaffDetails();
    private static final StaffReports srForm = new StaffReports();

    private static final Logger LOG = Logger.getLogger(GuiButtonRibbonListener.class.getName());

    // POPUP PANEL
    static ResizableIcon getResizableIconFromResource(String resource) {
        return ImageWrapperResizableIcon.getIcon(
                GuiTemplate.class.getResource(resource), new Dimension(16, 16));
    }
    JLabel lblStatus;
    JProgressBar progress;

    /**
     *
     * @param tabPane
     */
    public GuiButtonRibbonListener(JTabbedPane tabPane) {
        tab = new ButtonTabComponent(tabPane);
    }

    /**
     *
     */
    public GuiButtonRibbonListener() {
    }

    /**
     *
     * @param guiControl
     */
    public void setGuiTemplate(GuiTemplate guiControl) {
        GuiButtonRibbonListener.guiControl = guiControl;
    }

    /**
     *
     * @param lg
     */
    public void setLoginForm(LoginForm lg) {
        GuiButtonRibbonListener.lg = lg;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JCommandButton btn = (JCommandButton) e.getSource();
        try {

            switch (btn.getText()) {
                case "ADD CHILD":
                    Cursor rg = new Cursor(Cursor.WAIT_CURSOR);
                    guiControl.setCursor(rg);
                    showTabs("registration");
                    Cursor ng = new Cursor(Cursor.DEFAULT_CURSOR);
                    guiControl.setCursor(ng);
                    break;
                case "ADD STAFF":
                    Cursor rs = new Cursor(Cursor.WAIT_CURSOR);
                    guiControl.setCursor(rs);
                    showTabs("new_staff");
                    Cursor ns = new Cursor(Cursor.DEFAULT_CURSOR);
                    guiControl.setCursor(ns);
                    break;
                case "UPDATE DETAILS":
                    Cursor hourglassCursor = new Cursor(Cursor.WAIT_CURSOR);
                    guiControl.setCursor(hourglassCursor);
                    showTabs("updates");
                    Cursor normalCursor = new Cursor(Cursor.DEFAULT_CURSOR);
                    guiControl.setCursor(normalCursor);

                    break;
                case "CHILD REPORTS":
                    Cursor rh = new Cursor(Cursor.WAIT_CURSOR);
                    guiControl.setCursor(rh);
                    showTabs("child_reports");
                    crDataPool.searchChildData();
                    Cursor nr = new Cursor(Cursor.DEFAULT_CURSOR);
                    guiControl.setCursor(nr);
                    break;
                case "STAFF REPORTS":
                    Cursor us = new Cursor(Cursor.WAIT_CURSOR);
                    guiControl.setCursor(us);
                    showTabs("staff_reports");
                    Cursor urr = new Cursor(Cursor.DEFAULT_CURSOR);
                    guiControl.setCursor(urr);
                    break;

                case "USER ACCOUNTS":
                    Cursor uh = new Cursor(Cursor.WAIT_CURSOR);
                    guiControl.setCursor(uh);
                    showTabs("user_accounts");
                    uaDataPool.searchUserToDelete("");
                    uaDataPool.searchUserToUpdate("");
                    uaDataPool.getUsers();
                    Cursor ur = new Cursor(Cursor.DEFAULT_CURSOR);
                    guiControl.setCursor(ur);
                    break;
                case "SYSTEM CONFIGURATION":
                    Cursor sh = new Cursor(Cursor.WAIT_CURSOR);
                    guiControl.setCursor(sh);
                    showTabs("system_settings");
                    Cursor sr = new Cursor(Cursor.DEFAULT_CURSOR);
                    guiControl.setCursor(sr);
                    break;
                case "Logout":
                    Cursor lh = new Cursor(Cursor.WAIT_CURSOR);
                    guiControl.setCursor(lh);
                    uaDataPool.removeLoggedUser("");
                    guiControl.removeAll();
                    guiControl.dispose();
                    tab.removeTabsFromTabbedPane();
                    SystemSecurity.getGarbageCollector();
                    lg.showGui();
                    Cursor lr = new Cursor(Cursor.DEFAULT_CURSOR);
                    guiControl.setCursor(lr);
                    break;
                case "Exit":
                    Cursor eh = new Cursor(Cursor.WAIT_CURSOR);
                    guiControl.setCursor(eh);
                    uaDataPool.removeLoggedUser("");
                    SystemSecurity.getGarbageCollector();
                    System.exit(0);
                    Cursor er = new Cursor(Cursor.DEFAULT_CURSOR);
                    guiControl.setCursor(er);
                    break;

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * *******************************************************************************************
     *
     * START OF STUDENTS
     *
     **********************************************************************************************
     */
    //GET LABEL AND PROGRESS BAR
    public void setLabelProgress(JLabel lblStatus, JProgressBar progress) {
        this.lblStatus = lblStatus;
        this.progress = progress;
    }

    //SHOW TABS
    private void showTabs(final String tabs) {
        switch (tabs) {
            case "registration":
                tab.addTabbTotabbedPane("ADD CHILD", cRegForm.init());
                break;
            case "new_staff":
                tab.addTabbTotabbedPane("ADD STAFF", sdForm.init());
                break;
            case "updates":
                tab.addTabbTotabbedPane("UPDATE DETAILS", eCDForm.init());
                break;
            case "child_reports":
                tab.addTabbTotabbedPane("CHILD REPORTS", cRForm.init());
                break;
            case "staff_reports":
                tab.addTabbTotabbedPane("STAFF REPORTS", srForm.init());
                break;
            case "user_accounts":
                tab.addTabbTotabbedPane("USER ACCOUNTS", uaForm.init());
                break;
            case "system_settings":
                tab.addTabbTotabbedPane("SYSTEM SETTINGS", ssForm.init());
                break;

        }
    }

    /**
     *
     */
    public void startUp() {
        // tab.addTabbTotabbedPane("Welcome", form.init());
    }

}
