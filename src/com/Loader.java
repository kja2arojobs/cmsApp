package com;

import com.application.controllers.GuiButtonRibbonListener;
import com.application.views.LoginForm;
import com.application.views.SplashScreen;
import com.application.views.SystemRegistration;
import com.library.Bootstrap;
import com.library.GuiTemplate;
import com.library.SystemSecurity;
import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kadhush
 */
public class Loader {

    private static final GuiButtonRibbonListener gi = new GuiButtonRibbonListener();

    /**
     *
     */
    public static boolean isUserLogged = false;

    // PRIVATE //
    private static SplashScreen fSplashScreen;

    // private static final Logger fLogger = Util.getLogger(Loader.class);
    private static final String SPLASH_IMAGE = "/com/publik/img/loadingAnimation.gif";
    private static final SplashScreen splash = new SplashScreen();


    static Bootstrap boot = new Bootstrap();
    static GuiTemplate guiControl;
    private static final LoginForm lg = new LoginForm();
    private static final SystemRegistration sysReg = new SystemRegistration();
    private static final Logger LOG = Logger.getLogger(Loader.class.getName());

    /**
     * @param aArgs the command line arguments
    
     */
    public static void main(String... aArgs) {
        String strState = "";
        // 1) show splash screen
        System.out.println("Content management system is starting....");
        System.out.println("Loading system Splash screen.....");
          showSplashScreen();
        //logBasicSystemInfo();
        System.out.println("Unloading system Splash screen....");

        splash.hideSplash();

        if (strState.isEmpty()) {
            lg.showGui();
        } else {
            SystemRegistration.showGui();
        }
        SystemSecurity.getGarbageCollector();
        //fLogger.info("Launch thread now exiting...");
    }

    /**
     *
     * @param isUserLogged
     * @param strUserName
     * @param strLevel
     */
    public static void continueWithLoading(boolean isUserLogged, String strUserName, String strLevel) {
        if (isUserLogged) {
            gi.setLoginForm(lg);
            showMainWindow(strUserName, strLevel);
            lg.invisibleGui();
            lg.disposeGui();
        }

        EventQueue.invokeLater(new SplashScreenCloser());
    }

    private static synchronized String showSplashScreen() {
        return splash.showSplashScreen();
    }

    /**
     * Display the main window of the application to the user.
     */
    private static synchronized void showMainWindow(String strUserName, String strLevel) {
        guiControl = boot.loadClasses(strUserName, strLevel);
        guiControl.setVisible(true);
    }

    private static synchronized void logBasicSystemInfo() {
        
    }


    
    public static void timerLoader(String ... Args){
        try {  
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Loader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        private static final class SplashScreenCloser implements Runnable {

        @Override
        public synchronized void run() {
           // fLogger.fine("Closing the splash screen.'");
           // splash.hideSplash();
        }
    }
}
