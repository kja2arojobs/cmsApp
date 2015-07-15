package com.application.views;

import com.application.controllers.JGuiButtonListener;
import com.library.Generators;

/**
 *
 * @author kadhush
 */
public class FormsTemplate {
	//PANEL FOR GENERATING THE INTERFACE
	private javax.swing.JPanel pUser;
	
	/**CLASS IMPORTS
	 * 
	 */
	JGuiButtonListener btnListener = new JGuiButtonListener();
	Generators gen = new Generators();
	/**End of variables declaration
	 * 	/**End of variables declaration
	 * 
	 */
	
	
	
	
/**
     * USED TO CREATE  THE USER INTERFACE
     * @return
     */
	
	
	public javax.swing.JPanel init(){
            //<editor-fold> set  the layout panel
            pUser = new javax.swing.JPanel();
            //</editor-fold> set  the layout panel
            
            
            
            // <editor-fold>Interface starts here.
            pUser = create_Interface_Hook(pUser);
            // </editor-fold>End of Interface codes.
            
            
            
            //<editor-fold>Interface controls action listener and passing form controls
            formControls_Hook_Up();
            //</editor-fold>Interface controls action listener and passing form controls
            
            
            return pUser;
        }// 

    //VARIABLE DECLARATION
        private void formControls_Hook_Up() {
    }

    /**
     *
     * do not modify
     * INTERFACE LOOK
     *
     */
    private javax.swing.JPanel create_Interface_Hook(javax.swing.JPanel pUser) {
        return pUser;
    }
	
}
