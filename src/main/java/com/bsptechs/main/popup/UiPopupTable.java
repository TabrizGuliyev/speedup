/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsptechs.main.popup;

import com.bsptechs.main.Main;
import com.bsptechs.main.bean.Config;
import com.bsptechs.main.bean.TableName;
import com.bsptechs.main.bean.UiElement;
import com.bsptechs.main.dao.impl.DatabaseDAOImpl;
import com.bsptechs.main.dao.inter.DatabaseDAOInter;
import com.bsptechs.main.popup.file.FileUtility;
import com.bsptechs.main.util.ui.MainFrameUtility;
import com.bsptechs.main.util.ui.PanelQueryUtil;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sarkhanrasullu
 */
public class UiPopupTable extends UiPopupAbstract {

    private static DatabaseDAOInter database = new DatabaseDAOImpl();

    public UiPopupTable() {

        addMenuItem("Delete Table", () -> {
            delete();
        });
        addMenuItem("Table Properties", () -> {
            properties();
        });

        addMenuItem("New Query", () -> {
            newQuery();
        });

        addMenuItem("View Table", () -> {
            viewTable();
        });
        addMenuItem("Rename", () -> {
            renameTable();
        });
        addMenuItem("Refresh", () -> {
            refreshDB();
        });
        addMenuItem("Empty Table", () -> {
            emptyTable();
        });
        addMenuItem("Truncate Table", () -> {
            truncateTeable();
        });
        addMenuItem("Copy", () -> {
            copyTable();
        });
        addMenuItem("Paste", () -> {
            pasteTable();
        });
        addMenuItem("Dublicate Table", () -> {
            dublicateTable();
        });
        addMenuItem("Dump Sql file", () -> {
            dumpSqlFile();
        });
        addMenuItem("Object Information", () -> {
            objectInformation();
        });

    }

    public void delete() {
        System.out.println("table delete");
        //Tebriz burani dolduracaq
    }

    public void properties() {
        System.out.println("table properties");
        //Tebriz burani dolduracaq
    }

    public void newQuery() {
        System.out.println("new query");
        //Tebriz burani dolduracaq
    }

    public void viewTable() {
        Main m = Config.getMain();

        UiElement element = (UiElement) m.getListTable().getSelectionPath().getLastPathComponent();
         
        if (element.getData() instanceof TableName) { 
            TableName tb = (TableName) element.getData();
            PanelQueryUtil.runQuery("select * from "+tb.getTableName());
        }
    }

    public void renameTable() {
        TableName tb = MainFrameUtility.getSelectedTableFromList();
        String newTblName = (String) JOptionPane.showInputDialog(
                null, 
                "Enter new name:", 
                "Rename Table",
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                null, 
                tb.getTableName()
        );
        database.renameTable(tb, newTblName);
        List<TableName> tbNames = database.getAllTables(tb.getDatabaseName());
        MainFrameUtility.fillTree(tbNames, Config.getMain(), new UiPopupTable(), "table", Config.getMain().getListTable());
    }

    private void refreshDB() {
        TableName tb = MainFrameUtility.getSelectedTableFromList();
        List<TableName> tbNames = database.getAllTables(tb.getDatabaseName());
        
        Main m = Config.getMain();
        MainFrameUtility.fillTree(tbNames, m, new UiPopupTable(), "table", m.getListTable());
    }

    private void emptyTable() {
        TableName tb = MainFrameUtility.getSelectedTableFromList();
        database.emptyTable(tb.getDatabaseName(), tb.getTableName());
    }

    private void truncateTeable() {
        TableName tb = MainFrameUtility.getSelectedTableFromList();
        database.truncateTable(tb.getDatabaseName(), tb.getTableName());
    }

    private void copyTable() {
        TableName tb = MainFrameUtility.getSelectedTableFromList();
        FileUtility.writeDBAndTblNameFile(tb.getDatabaseName().getName(), tb.getTableName());
    }

    private void pasteTable() {
        TableName tb = MainFrameUtility.getSelectedTableFromList();

        String newTblName = (String) JOptionPane.showInputDialog(null, "Enter name:", "Paste Table",
                JOptionPane.QUESTION_MESSAGE, null, null, tb.getTableName());
        database.pasteTable(FileUtility.readDBAndTblName(), tb.getDatabaseName(), newTblName);
        refreshDB();
    }

    private void dublicateTable() {
        TableName tb = MainFrameUtility.getSelectedTableFromList();
        database.dublicateTable(tb.getDatabaseName(), tb.getTableName());
        refreshDB();
    }

    private void dumpSqlFile() {
    }

    private void objectInformation() {
    }
}
