/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.application.datapools;

import com.application.interfaces.InterfaceDataPool;
import java.awt.Color;
import java.awt.Component;
import java.io.Serializable;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author kadhush
 */
public abstract class DataPool implements Serializable, InterfaceDataPool {

    /**
     *
     * @param component
     */
    public void errorDetect(JComponent component) {
        component.setBorder(javax.swing.BorderFactory.createLineBorder(Color.red, 2, false));
    }

    class ColorColumnRenderer extends DefaultTableCellRenderer {

        Color bgColor, frColor;

        public ColorColumnRenderer(Color bgColor, Color frColor) {
            super();
            this.bgColor = bgColor;
            this.frColor = frColor;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            cell.setBackground(bgColor);
            cell.setForeground(frColor);
            return cell;
        }
    }

}
