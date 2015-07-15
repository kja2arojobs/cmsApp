package com.library;

import com.application.models.BootStrapModel;
import com.application.views.ChildReport;
import com.application.views.ChildrenRegistration;
import com.form.EditChildrenDetails;
import java.util.logging.Logger;

/**
 *
 * @author kadhush
 */
public class Bootstrap {
    private final static GuiTemplate guiControls = new GuiTemplate();
    private final static ChildReport cr = new ChildReport();
    private final static ChildrenRegistration cR = new ChildrenRegistration();
    private static final EditChildrenDetails ec = new EditChildrenDetails();

    private static final Logger LOG = Logger.getLogger(Bootstrap.class.getName());
    BootStrapModel bsModel;

    /**
     *
     */
    public Bootstrap() {
      
    }

    /**
     *
     * @param strUserName
     * @param strLevel
     * @return
     */
    public GuiTemplate loadClasses(String strUserName, String strLevel) {
        try {
              
           
              bsModel = new BootStrapModel();
              
            cr.init();
            cR.init();
            
            
            return guiControls.createGui(strUserName, strLevel);

        } catch (Exception e) {

        } finally {

        }

        return null;
    }
    
    public static String getDatabaseConnection(){
       //    bsModel.getTheDatabaseConnection();
        return null ;
    }
      
   
     
}
