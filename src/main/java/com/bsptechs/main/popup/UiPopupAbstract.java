/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsptechs.main.popup;

import com.bsptechs.main.bean.EmptyFI;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author sarkhanrasullu
 */
public abstract class UiPopupAbstract extends JPopupMenu{
 
    protected void addMenuItem(String text, EmptyFI adder) {
        JMenuItem item = menuItem(text);
        item.addActionListener((java.awt.event.ActionEvent evt) -> {
            adder.action();
        });
    }

    protected JMenuItem menuItem(String text) {
        JMenuItem item = new JMenuItem(text);
        this.add(item);
        return item;
    }
}
