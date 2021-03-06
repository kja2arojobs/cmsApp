/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.views;

import com.application.datapools.UserLoginDataPool;
import com.library.GuiTemplate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JTextField;

/**
 *
 * @author kadhush
 */
public class LoginForm {

    /**
     * Creates new form Login
     */
  
    private static final UserLoginDataPool ulDataPool = new UserLoginDataPool();

    private static final JFrame fr = new JFrame();
    private static final Logger LOG = Logger.getLogger(LoginForm.class.getName());

    /* Center the GUI */
    public static void centerFrame(JFrame guiControls) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = guiControls.getSize();

        screenSize.height = screenSize.height / 2;
        screenSize.width = screenSize.width / 2;

        frameSize.height = frameSize.height / 2;
        frameSize.width = frameSize.width / 2;

        int y = screenSize.height - frameSize.height;
        int x = screenSize.width - frameSize.width;

        guiControls.setLocation(x, y);
        guiControls.setBackground(Color.WHITE);
    }

    /* Variable Declaration */
    private final URL imgUrl;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnlogin;
    private javax.swing.JPanel jpanelLoginControls;
    private javax.swing.JLabel lblCompanyLogo;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration

    /**
     *
     */
    public LoginForm() {

        imgUrl = GuiTemplate.class
                .getResource("/com/publik/img/3bg_softs_logo.png");
        ImageIcon imgIcon = new ImageIcon(imgUrl);
        Image img = imgIcon.getImage();
        fr.setIconImage(img);
        initComponents();

        txtUserName.setHorizontalAlignment(javax.swing.JTextField.LEADING);
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEADING);

        JButton[] btn = {btnReset, btnlogin};
        JTextField[] txt = {txtUserName, txtPassword};
        JLabel[] lbl = {lblCompanyLogo, lblStatus};
    //User login data pool
        ulDataPool.setDataControls(btn, lbl, txt);
        lblCompanyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/com/publik/img/compassion.png")));
        lblCompanyLogo.setBackground(Color.WHITE);
        JRootPane rootPane = fr.getRootPane();
        rootPane.setDefaultButton(btnlogin);
    //  btnLisener.setLoginControls(btn, txt, lbl);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void initComponents() {
        fr.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        fr.setAlwaysOnTop(true);
        fr.setBounds(new java.awt.Rectangle(0, 0, 500, 300));
        fr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fr.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        fr.setResizable(false);
        fr.setType(java.awt.Window.Type.UTILITY);

        jpanelLoginControls = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnReset = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel("Login Status:Input Username and Password");
        lblCompanyLogo = new javax.swing.JLabel();

        jpanelLoginControls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblUsername.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblUsername.setText("Username:");

        lblPassword.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblPassword.setText("Password:");

        txtUserName.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtPassword.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnReset.setText("Reset");
        btnReset.setBorder(null);
        btnReset.setBorderPainted(false);

        btnlogin.setBorder(null);
        btnlogin.setBorderPainted(false);
        btnlogin.setLabel("Login");

        lblStatus.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));

        lblCompanyLogo.setBackground(new java.awt.Color(255, 255, 255));
        lblCompanyLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblCompanyLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCompanyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/publik/img/compassion.png"))); // NOI18N
        lblCompanyLogo.setOpaque(true);

        javax.swing.GroupLayout jpanelLoginControlsLayout = new javax.swing.GroupLayout(jpanelLoginControls);
        jpanelLoginControls.setLayout(jpanelLoginControlsLayout);
        jpanelLoginControlsLayout.setHorizontalGroup(
                jpanelLoginControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelLoginControlsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpanelLoginControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jpanelLoginControlsLayout.createSequentialGroup()
                                        .addGroup(jpanelLoginControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblUsername)
                                                .addComponent(lblPassword))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jpanelLoginControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtPassword)
                                                .addComponent(txtUserName)))
                                .addGroup(jpanelLoginControlsLayout.createSequentialGroup()
                                        .addGap(0, 301, Short.MAX_VALUE)
                                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                .addComponent(lblCompanyLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpanelLoginControlsLayout.setVerticalGroup(
                jpanelLoginControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpanelLoginControlsLayout.createSequentialGroup()
                        .addComponent(lblCompanyLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelLoginControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelLoginControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpanelLoginControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(fr.getContentPane());
        fr.getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanelLoginControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanelLoginControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
        );

        fr.pack();
    }

    /**
     * @param args the command line arguments
     */
    public void showGui() {
     System.out.println("Show system login form....");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                fr.setBackground(Color.yellow);
                centerFrame(fr);
                fr.addWindowListener(null);

                fr.setVisible(true);
            }
        });
    }

    /**
     *
     */
    public void invisibleGui() {
        fr.setVisible(false);
    }

    /**
     *
     */
    public void disposeGui() {

        fr.dispose();
    }

}
