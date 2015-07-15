package com.library;

import com.application.controllers.GuiButtonRibbonHelpListener;
import com.application.controllers.GuiButtonRibbonListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import org.pushingpixels.flamingo.api.common.JCommandButton;
import org.pushingpixels.flamingo.api.common.icon.ImageWrapperResizableIcon;
import org.pushingpixels.flamingo.api.common.icon.ResizableIcon;
import org.pushingpixels.flamingo.api.ribbon.JRibbon;
import org.pushingpixels.flamingo.api.ribbon.JRibbonBand;
import org.pushingpixels.flamingo.api.ribbon.RibbonElementPriority;
import org.pushingpixels.flamingo.api.ribbon.RibbonTask;
import org.pushingpixels.flamingo.api.ribbon.resize.CoreRibbonResizePolicies;
import org.pushingpixels.flamingo.api.ribbon.resize.IconRibbonBandResizePolicy;
import org.pushingpixels.flamingo.api.ribbon.resize.RibbonBandResizePolicy;

/**
 *
 * @author kadhush
 */
public final class GuiTemplate extends JFrame {

    private static final long serialVersionUID = 1L;
    private static JDesktopPane theDesktop;
    private final static JTabbedPane tabPane = new JTabbedPane();
    private static JProgressBar bar;
    private static JLabel lbl;
    private static JPanel sthPanel;
    private static URL imgUrl = null;
    private static ImageIcon imgIcon = null;
    private static JRibbon ribbon;
    private static final Logger LOG = Logger.getLogger(GuiTemplate.class.getName());

    // RESIZE THE ICON
    private static ResizableIcon getResizableIconFromResource(String resource) {
        return ImageWrapperResizableIcon.getIcon(
                GuiTemplate.class.getResource(resource), new Dimension(16, 16));
    }
    private final ResizableIcon exit, help, regChild, editChild, childReport, sysConf, userAcc, logOut, regStaff;
    private final GuiButtonRibbonListener guiBtnL;
    private final GuiButtonRibbonHelpListener btnHelpL;
    private final String companyName = "";

    /**
     *
     */    public GuiTemplate() {
         tabPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
         tabPane.setDoubleBuffered(true);
         
         this.guiBtnL = new GuiButtonRibbonListener(tabPane);
         this.btnHelpL = new GuiButtonRibbonHelpListener(tabPane);
         this.guiBtnL.startUp();
         //add-worker
         
         
        
         exit = getResizableIconFromResource("/com/publik/img/exit.png");
         userAcc = getResizableIconFromResource("/com/publik/img/add-account.png");
         regStaff = getResizableIconFromResource("/com/publik/img/add-worker.jpg");
         sysConf = getResizableIconFromResource("/com/publik/img/system-conf.png");
         regChild = getResizableIconFromResource("/com/publik/img/add_child.gif");
         editChild = getResizableIconFromResource("/com/publik/img/edit-child.png");
         childReport = getResizableIconFromResource("/com/publik/img/child_report.png");
         logOut = getResizableIconFromResource("/com/publik/img/lock.png");
         help = getResizableIconFromResource("/com/publik/img/help.png");
         
       
         
         
         // createGuiTemplate();
     }

    /**
     *
     * @param strUserName
     * @param strLevel
     */
     public void createGuiTemplate(String strUserName, String strLevel) {
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         imgUrl = GuiTemplate.class
                 .getResource("/com/publik/img/3bg_softs_logo.png");
         imgIcon = new ImageIcon(imgUrl);
         Image imgI = imgIcon.getImage();
         this.setIconImage(imgI);
         
         theDesktop = new JDesktopPane() {
             private static final long serialVersionUID = 1L;
             
             Image img = new javax.swing.ImageIcon(getClass().getResource(
                     "/com/publik/img/comp.jpg")).getImage();
             
             @Override
             protected void paintComponent(Graphics g) {
                 super.paintComponent(g);
                 g.drawImage(img, ((int) theDesktop.getBounds().getWidth() - img
                         .getWidth(theDesktop)) / 2,
                         ((int) theDesktop.getBounds().getHeight() - img
                                 .getHeight(theDesktop)) / 2, this);
             }
         };
         
         sthPanel = new JPanel();
         bar = new JProgressBar(0, 100);
         bar.setSize(300, 20);
         
         lbl = new JLabel("Ready");
         
         sthPanel.add(bar);
         sthPanel.add(lbl);
         
         theDesktop.setBackground(Color.LIGHT_GRAY);
         setContentPane(theDesktop);
         
         theDesktop.setOpaque(true);
         theDesktop.setDoubleBuffered(true);
         theDesktop.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
         
         theDesktop.setLayout(new BorderLayout());
         
         theDesktop.add(createRibbonMenu(strLevel), BorderLayout.NORTH);
         theDesktop.add(tabPane, BorderLayout.CENTER);
         //theDesktop.add(sthPanel, BorderLayout.SOUTH);
         bar.setVisible(false);
         this.guiBtnL.setLabelProgress(lbl, bar);
         
         if (theDesktop != null) {
             
         }
     }
     
     // CREATING JRIBBON MENU'S
     
     /**
      *
      * @param strLevel
      * @return
      */
     protected final JRibbon createRibbonMenu(String strLevel) {
         
         JRibbon ribbons = null;
         switch (strLevel) {
             
             case "Administrator":
                 ribbons = createAdminRibbon();
                 break;
                 
             case "User":
                 ribbons = createUserRibbon();
                 break;
                 
         }
         return ribbons;
         
     }
     
     /**
      *
      * @return
      */
     protected final JRibbon createAdminRibbon() {
         
         //CREATING RIBBON
         ribbon = new JRibbon();
         
         //DATA ADD CHILD AND EDIT BAND
         JRibbonBand detailsBand = new JRibbonBand("DETAILS",
                 null, null);
         detailsBand.setBackground(Color.green);
         
         JCommandButton btnNewChild = new JCommandButton("ADD CHILD",
                 regChild);
         btnNewChild.setFont(new Font("Tohama", 4, 12));
         btnNewChild.addActionListener(guiBtnL);
         
         
            JCommandButton btnNewStaff = new JCommandButton("ADD STAFF",
                 regStaff);
         btnNewStaff.setFont(new Font("Tohama", 4, 12));
         btnNewStaff.addActionListener(guiBtnL);
         
         JCommandButton btnUpdateChildDetails = new JCommandButton("UPDATE DETAILS", editChild);
         btnUpdateChildDetails.setFont(new Font("Tohama", 4, 12));
         btnUpdateChildDetails.addActionListener(guiBtnL);
         
         JCommandButton btnChildReport = new JCommandButton("CHILD REPORTS", childReport);
         btnChildReport.setFont(new Font("Tohama", 4, 12));
         btnChildReport.addActionListener(guiBtnL);
         
         JCommandButton btnStaffReport = new JCommandButton("STAFF REPORTS", childReport);
         btnStaffReport.setFont(new Font("Tohama", 4, 12));
         btnStaffReport.addActionListener(guiBtnL);
         
         // Setting Command Button Priority
         detailsBand.addCommandButton(btnNewChild,
                 RibbonElementPriority.TOP);
         detailsBand.addCommandButton(btnNewStaff,
                 RibbonElementPriority.TOP);
         detailsBand.addCommandButton(btnUpdateChildDetails,
                 RibbonElementPriority.TOP);
         
         detailsBand.addCommandButton(btnChildReport,
                 RibbonElementPriority.TOP);
         
          detailsBand.addCommandButton(btnStaffReport,
                 RibbonElementPriority.TOP);
         
         
         // Setting the priorities for the buttons
         detailsBand.setResizePolicies(Arrays
                 .<RibbonBandResizePolicy>asList(
                         new CoreRibbonResizePolicies.Mirror(detailsBand
                                 .getControlPanel()),
                         new IconRibbonBandResizePolicy(detailsBand
                                 .getControlPanel())));
         
         JRibbonBand systemBand;
         systemBand = new JRibbonBand("SYSTEM", null, null);
         
         JCommandButton btnUserAcc = new JCommandButton(
                 "USER ACCOUNTS", userAcc);
         btnUserAcc.addActionListener(guiBtnL);
         btnUserAcc.setFont(new Font("Tohama", 4, 12));
         
         JCommandButton btnSystemConf = new JCommandButton(
                 "SYSTEM CONFIGURATION", sysConf);
         btnSystemConf.addActionListener(guiBtnL);
         btnSystemConf.setFont(new Font("Tohama", 4, 12));
         btnSystemConf.setEnabled(false);
         
         
         
         JCommandButton btnAboutUs = new JCommandButton(
                 "ABOUT US", sysConf);
         btnAboutUs.addActionListener(guiBtnL);
         btnAboutUs.setFont(new Font("Tohama", 4, 12));
         btnAboutUs.setEnabled(true);
         
         systemBand.addCommandButton(btnUserAcc,
                 RibbonElementPriority.TOP);
         systemBand.addCommandButton(btnSystemConf,
                 RibbonElementPriority.TOP);
           systemBand.addCommandButton(btnAboutUs,
                 RibbonElementPriority.TOP);
           
         systemBand.setResizePolicies(Arrays
                 .<RibbonBandResizePolicy>asList(
                         new CoreRibbonResizePolicies.Mirror(
                                 systemBand.getControlPanel()),
                         new IconRibbonBandResizePolicy(systemBand
                                 .getControlPanel())));
         
         RibbonTask taskDetails = new RibbonTask("DETAILS", detailsBand,
                 systemBand);
         ribbon.addTask(taskDetails);
         ribbon.updateUI();
         
         /*
         * END OF DETAILS
         * START OF Exit Button
         */
         JCommandButton btnLogOut = new JCommandButton("Logout", logOut);
         JCommandButton btnExit = new JCommandButton("Exit", exit);
         
         btnExit.addActionListener(guiBtnL);
         btnLogOut.addActionListener(guiBtnL);
         ribbon.addTaskbarComponent(btnLogOut);
         ribbon.addTaskbarComponent(btnExit);
         ribbon.updateUI();
         
         /*
         * End Of Exit Button
         */
         ribbon.configureHelp(help, btnHelpL);
         ribbon.updateUI();
         
         return ribbon;
         
     }
     
     /**
      *
      * @return
      */
     protected final JRibbon createUserRibbon() {
         
         //CREATING RIBBON
         ribbon = new JRibbon();
         
         //DATA ADD CHILD AND EDIT BAND
         JRibbonBand detailsBand = new JRibbonBand("CHILD DETAILS",
                 null, null);
         detailsBand.setBackground(Color.green);
         
         JCommandButton btnNewChild = new JCommandButton("ADD CHILD",
                 regChild);
         btnNewChild.setFont(new Font("Tohama", 4, 12));
         btnNewChild.addActionListener(guiBtnL);
         
         JCommandButton btnUpdateChildDetails = new JCommandButton("UPDATE DETAILS",
                 editChild);
         btnUpdateChildDetails.setFont(new Font("Tohama", 4, 12));
         btnUpdateChildDetails.addActionListener(guiBtnL);
         
         JCommandButton btnChildReport = new JCommandButton("REPORTS",
                 childReport);
         btnChildReport.setFont(new Font("Tohama", 4, 12));
         btnChildReport.addActionListener(guiBtnL);
         
         // Setting Command Button Priority
         detailsBand.addCommandButton(btnNewChild,
                 RibbonElementPriority.TOP);
         detailsBand.addCommandButton(btnUpdateChildDetails,
                 RibbonElementPriority.TOP);
         
         detailsBand.addCommandButton(btnChildReport,
                 RibbonElementPriority.TOP);
         
         // Setting the priorities for the buttons
         detailsBand.setResizePolicies(Arrays
                 .<RibbonBandResizePolicy>asList(
                         new CoreRibbonResizePolicies.Mirror(detailsBand
                                 .getControlPanel()),
                         new IconRibbonBandResizePolicy(detailsBand
                                 .getControlPanel())));
         
         RibbonTask taskDetails = new RibbonTask("DETAILS", detailsBand);
         ribbon.addTask(taskDetails);
         ribbon.updateUI();
         
         /*
         *
         * END OF DETAILS
         */
         /*
         * START OF Exit Button
         */
         JCommandButton btnLogOut = new JCommandButton("Logout", logOut);
         // btnLogOut.setToolTipText("Logout");
         JCommandButton btnExit = new JCommandButton("Exit", exit);
         // btnExit.setToolTipText("Exit Application");
         
         btnExit.addActionListener(guiBtnL);
         btnLogOut.addActionListener(guiBtnL);
         ribbon.addTaskbarComponent(btnLogOut);
         ribbon.addTaskbarComponent(btnExit);
         ribbon.updateUI();
         
         /*
         * End Of Exit Button
         */
         ribbon.configureHelp(help, btnHelpL);
         ribbon.updateUI();
         
         return ribbon;
         
     }
     
     // method to create the graphical user interface
     
     /**
      *
      * @param strUserName
      * @param strLevel
      * @return
      */
     public GuiTemplate createGui(String strUserName, String strLevel) {
         GuiTemplate guiControls = new GuiTemplate();

        guiBtnL.setGuiTemplate(guiControls);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        guiControls.setSize(screenSize.width, 94 * screenSize.height / 100);
        guiControls.createGuiTemplate(strUserName, strLevel);

        centerFrame(guiControls);

        guiControls.setTitle("  WELCOME : " + strUserName.toUpperCase() + "   YOU ARE LOGGED IN AS:   " + strLevel.toUpperCase() + "         " + companyName.toUpperCase() + "CMS"
        );
        guiControls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // guiControls.addWindowListener(this);
        return guiControls;

    }

    // method for centering the JFrame

    /**
     *
     * @param guiControls
     */
        public void centerFrame(GuiTemplate guiControls) {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = guiControls.getSize();

        screenSize.height = screenSize.height / 2;
        screenSize.width = screenSize.width / 2;

        frameSize.height = frameSize.height / 2;
        frameSize.width = frameSize.width / 2;

        int y = screenSize.height - frameSize.height;
        int x = screenSize.width - frameSize.width;

        guiControls.setLocation(x, y / 2);
        // guiControls.setSize(screenSize.width, screenSize.height);

    }


}
