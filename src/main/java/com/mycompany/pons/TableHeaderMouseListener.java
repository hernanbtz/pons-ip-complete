/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pons;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

/**
 *
 * @author bec_cal_trans
 */
public class TableHeaderMouseListener extends MouseAdapter {

    private JTable table;

    public TableHeaderMouseListener(JTable table) {
        this.table = table;
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        Point point = event.getPoint();
        int column = table.columnAtPoint(point);
        table.setColumnSelectionInterval(column, column);
    }
}
