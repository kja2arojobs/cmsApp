/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.controllers;

import com.application.datapools.ChildDataPool;
import com.application.datapools.ChildUpdateDetailsDataPool;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JRadioButton;

/**
 *
 * @author kadhush
 */
public class GuiRadioButtonListener implements ItemListener {

    private static final ChildDataPool cDataPool = new ChildDataPool();
      private static final ChildUpdateDetailsDataPool cuDataPool = new ChildUpdateDetailsDataPool();
    private static JRadioButton rbGo2SchlYes, rbGo2SchlNo, rbUGo2SchlYes, rbUGo2SchlNo;

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton rb = (JRadioButton) e.getSource();

        if (rb.equals(rbGo2SchlNo)) {
            cDataPool.deactivateCmbxSchool();
        } else if (rb.equals(rbGo2SchlYes)) {
            cDataPool.activateCmbxSchool();
        }else  if (rb.equals(rbUGo2SchlNo)) {
            cuDataPool.deactivateCmbxSchool();
        } else if (rb.equals(rbUGo2SchlYes)) {
            cuDataPool.activateCmbxSchool();
        }
    }

    /**
     *
     * @param rbC
     */
    public void setChildRbControls(JRadioButton[] rbC) {
        rbGo2SchlYes = rbC[1];
        rbGo2SchlNo = rbC[0];
    }
    
    public void setChildUpdateRbControls(JRadioButton[] rbC){
       rbUGo2SchlYes = rbC[1];
        rbUGo2SchlNo = rbC[0];  
    }
}
