package com.application.controllers;

import com.application.views.LocalHelp;
import com.library.ButtonTabComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;
import javax.swing.JTabbedPane;

/**
 *
 * @author kadhush
 */
public class GuiButtonRibbonHelpListener implements ActionListener {
    private static final Logger LOG = Logger.getLogger(GuiButtonRibbonHelpListener.class.getName());

    private final ButtonTabComponent tab;
    private final LocalHelp form = new LocalHelp();

    /**
     *
     * @param tabPane
     */
    public GuiButtonRibbonHelpListener(JTabbedPane tabPane) {
        this.tab = new ButtonTabComponent(tabPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tab.addTabbTotabbedPane("Systems Help", form.init());
    }
}
