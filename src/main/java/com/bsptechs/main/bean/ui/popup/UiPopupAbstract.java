/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsptechs.main.bean.ui.popup;

import com.bsptechs.main.Main; 
import com.bsptechs.main.bean.Config;
import com.bsptechs.main.bean.EmptyFI;
import com.bsptechs.main.bean.ui.tree.node.CustomTreeNode;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author sarkhanrasullu
 */
public abstract class UiPopupAbstract extends JPopupMenu {

    private CustomTreeNode selectedElement = null;

    public UiPopupAbstract() {
        this.selectedElement = Main.instance().getConnectionTree().getSelectedCustomTreeNode();
    }
    
    public CustomTreeNode getSelectedElement(){
        return this.selectedElement;
    }

    protected final void addMenuItem(String text, EmptyFI adder) {
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
