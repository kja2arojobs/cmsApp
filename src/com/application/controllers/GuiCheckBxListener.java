/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.controllers;

import com.application.datapools.ChildUpdateDetailsDataPool;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;

/**
 *
 * @author kadhush
 */
public class GuiCheckBxListener implements ItemListener {

    private String strControl;
    private final ChildUpdateDetailsDataPool cuDataPool = new ChildUpdateDetailsDataPool();
    private JCheckBox chkbxUpdateBio, chkbxUpdateGuardian, chkbxUpdateDirectorComent;

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox chkbx = (JCheckBox) e.getSource();
        strControl = "";

        if (chkbx.equals(chkbxUpdateBio)) {
           
            // bio_guard_director
            //START HERE
            if (chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && chkbxUpdateGuardian.isSelected()) {

                strControl = "bio_guard_director"; //1
            } else if (chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
            
                strControl = "bio_guard";//2
            } else if (chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && chkbxUpdateDirectorComent.isSelected()) {
                strControl = "bio_director";//3
            } else if (chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "bio";//4
            } else if (!chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && chkbxUpdateDirectorComent.isSelected()) {
                strControl = "guard_director";//5
            } else if (!chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "guard";//6
            } else if (!chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && chkbxUpdateDirectorComent.isSelected()) {
                strControl = "director";//7
            } else if (!chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "none";//8
            }

            //END HERE
        } else if (chkbx.equals(chkbxUpdateGuardian)) {
            //START HERE
            if (chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && chkbxUpdateGuardian.isSelected()) {
                strControl = "bio_guard_director"; //1
            } else if (chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "bio_guard";//2
            } else if (chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && chkbxUpdateDirectorComent.isSelected()) {
                strControl = "bio_director";//3
            } else if (chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "bio";//4
            } else if (!chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && chkbxUpdateDirectorComent.isSelected()) {
                strControl = "guard_director";//5
            } else if (!chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "guard";//6
            } else if (!chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && chkbxUpdateDirectorComent.isSelected()) {
                strControl = "director";//7
            } else if (!chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "none";//8
            }

            //END HERE
        } else if (chkbx.equals(chkbxUpdateDirectorComent)) {
            //START HERE
            if (chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && chkbxUpdateGuardian.isSelected()) {
                strControl = "bio_guard_director"; //1
            } else if (chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "bio_guard";//2
            } else if (chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && chkbxUpdateDirectorComent.isSelected()) {
                strControl = "bio_director";//3
            } else if (chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "bio";//4
            } else if (!chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && chkbxUpdateDirectorComent.isSelected()) {
                strControl = "guard_director";//5
            } else if (!chkbxUpdateBio.isSelected() && chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "guard";//6
            } else if (!chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && chkbxUpdateDirectorComent.isSelected()) {
                strControl = "director";//7
            } else if (!chkbxUpdateBio.isSelected() && !chkbxUpdateGuardian.isSelected() && !chkbxUpdateDirectorComent.isSelected()) {
                strControl = "none";//8
            }
            //END HERE
        }
//bio_guard_director
        cuDataPool.enableControls(strControl);
        cuDataPool.enableControls("bio_guard_director");

    }

    public void setChildUpdateControls(JCheckBox[] chkbxUp) {
        chkbxUpdateBio = chkbxUp[14];
        chkbxUpdateGuardian = chkbxUp[16];
        chkbxUpdateDirectorComent = chkbxUp[15];
    }

}
