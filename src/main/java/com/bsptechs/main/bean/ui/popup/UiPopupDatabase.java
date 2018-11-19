/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsptechs.main.bean.ui.popup;

import com.bsptechs.main.bean.ui.panel.PanelQuery;
import com.bsptechs.main.dao.impl.DatabaseDAOImpl;
import javax.swing.JList;
import com.bsptechs.main.bean.Config;
import com.bsptechs.main.bean.ui.tree.CustomJTree;
import com.bsptechs.main.bean.ui.uielement.UiElement;
import com.bsptechs.main.bean.ui.uielement.UiElementConnection;
import com.bsptechs.main.bean.ui.uielement.UiElementDatabase;
import com.bsptechs.main.util.Util;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sarkhanrasullu
 */
public class UiPopupDatabase extends UiPopupAbstract {

    DatabaseDAOImpl database = new DatabaseDAOImpl();

    JList list;

    public UiPopupDatabase() {
        addMenuItem("Database Properties", () -> {
            properties();
        });
        addMenuItem("Delete Database", () -> {
            delete();
        });
        addMenuItem("New Query", () -> {
            try {
                newQuery();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UiPopupDatabase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(UiPopupDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }

    public void delete() {
        System.out.println("delete database");
        //Tebriz burani dolduracaq
    }

    public void properties() {
        System.out.println("properites database");
        //Tebriz burani dolduracaq
    }

    public void newQuery() throws ClassNotFoundException, SQLException {
        System.out.println("new query");
        CustomJTree tree = Config.getMain().getListTable();
        UiElementConnection cnn = tree.getSelectedConnection();
        UiElementDatabase db = tree.getSelectedDatabase();
        Config.getMain().prepareNewQuery(cnn, db);
    }

}
