package com.application.views;

/*
 * SplashDemo.java
 *
 */
import com.application.models.BootStrapModel;
import com.application.models.SystemSecurityModel;
import com.library.Generators;
import com.library.SystemSecurity;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

/**
 *
 * @author kadhush
 */
public class SplashScreen extends JPanel {

    private static final Logger LOG = Logger.getLogger(SplashScreen.class.getName());

    /**
     * Creates Splash Screen & shows it.
     */
    private JWindow mySplash;
    private final JLabel stats = new JLabel("");
    private final JLabel label = new JLabel("");
    private final SystemSecurityModel sys = new SystemSecurityModel();
    private final SystemSecurity sec = new SystemSecurity();
    private final Generators gen = new Generators();
    private final BootStrapModel bmModel = new BootStrapModel();
    private final Map<String, String> sysData = new LinkedHashMap<>();
    private Object[] objSysSec;
    private String[] strSysSec;

    /**
     *
     * @return
     */
    public String showSplashScreen() {
        System.out.println("Show Splash screen.....");
        mySplash = new JWindow();
        JPanel content = (JPanel) mySplash.getContentPane();
        content.setLayout(new BorderLayout());
        content.setBackground(Color.WHITE);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        ImageIcon icn = new javax.swing.ImageIcon(getClass().getResource(
                "/com/publik/img/compassion.png"));
        System.out.println("Centering Splash screen....");
        int width = icn.getIconWidth() + 100;
        int height = 210;
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
        mySplash.setBounds(x, y, width, height);

        content.add(new JLabel(new javax.swing.ImageIcon(getClass().getResource(
                "/com/publik/img/compassion.png"))),
                BorderLayout.NORTH);
        content.add(label, BorderLayout.CENTER);

        content.add(stats, BorderLayout.SOUTH);

        content.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        System.out.println("Showing Splash screen GUI....");
        mySplash.setVisible(true);
        setStatusSplash("System loading, Please wait....");
        String strState = "";
        try {

            try {
                Thread.sleep(3000);

                /*Create all the system directory if not created */
                System.out.println("Creating system directories");
                Generators.createDirs();

                /*Create Database and Tables*/
                System.out.println("Creating system database");
                bmModel.getTheDatabase();

                setStatusSplash("Loading is complete....");
                Thread.sleep(1000);
                System.out.println("Changing Splash screen opacity");
                for (int i = 1; i <= 5000; i++) {
                    double opacityValue = 1 - (0.0002 * i);
                    mySplash.setOpacity((float) opacityValue);
                    // Thread.sleep(500);
                }
                Thread.sleep(1000);
                Class.forName("com.Loader").getMethod("timerLoader", new Class[]{String[].class});
            } catch (ClassNotFoundException | NoSuchMethodException | SecurityException ex) {
                Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (Exception ex) {
        }

        //CONTINUE LOADING
        return null;
    }

    /**
     * Hides the Splash Screen
     */
    public void hideSplash() {
        mySplash.setVisible(false);
       System.out.println("Hidding splash screen....");
    }

    /**
     *
     * @param thisStat
     */
    public void setStatusSplash(String thisStat) {
        System.out.println("Setting the loading system status....");
        stats.remove(this);
        int w = stats.getWidth();
        int h = stats.getHeight();
        stats.setSize(w, h + 100);
        stats.setHorizontalAlignment(javax.swing.JTextField.LEADING);
        stats.setVerticalAlignment(javax.swing.JTextField.TOP);
        stats.setIconTextGap(30);
        if (stats.getText().isEmpty()) {

            stats.setText(thisStat);
            //stats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/publik/img/loading.gif")));

        } else {
            //System.out.println("Setting the complete system status....");
            stats.setText(thisStat);
            //stats.setIcon(icon);

        }

    }

}
