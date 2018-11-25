/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsptechs.main.bean.ui.panel.queryresult;

import com.bsptechs.main.bean.ui.tree.database.bean.SUConnectionBean;
import com.bsptechs.main.bean.ui.tree.database.bean.SUDatabaseBean;
import com.bsptechs.main.bean.ui.table.CustomTable;
import com.bsptechs.main.bean.ui.table.CustomTableModel;
import com.bsptechs.main.bean.ui.table.TableRow;
import com.bsptechs.main.dao.impl.DatabaseDAOImpl;
import com.bsptechs.main.dao.inter.DatabaseDAOInter;
import lombok.SneakyThrows;

/**
 *
 * @author sarkhanrasullu
 */
public class PanelQueryResult extends javax.swing.JPanel {

    private static final DatabaseDAOInter db = new DatabaseDAOImpl();

    /**
     * Creates new form PanelQueryResult
     */
    public PanelQueryResult() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnSaveChangesForTable = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblQueryResult = new CustomTable();

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSaveChangesForTable.setText("S");
        btnSaveChangesForTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesForTableActionPerformed(evt);
            }
        });

        btnDelete.setText("-");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCancel.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveChangesForTable, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSaveChangesForTable)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel)))
        );

        tblQueryResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        tblQueryResult.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblQueryResultFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblQueryResultFocusLost(evt);
            }
        });
        tblQueryResult.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblQueryResultPropertyChange(evt);
            }
        });
        jScrollPane4.setViewportView(tblQueryResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private CustomTable getTable() {
        return (CustomTable) tblQueryResult;
    }

    private String queryStr;
    private SUConnectionBean connection;
    private SUDatabaseBean database;

    @SneakyThrows
    public void runQuery(String queryStr, SUConnectionBean connection, SUDatabaseBean database) {
        this.queryStr = queryStr;
        this.connection = connection;
        this.database = database;

        CustomTable tbl = getTable();
        CustomTableModel model = db.runQuery(queryStr, connection, database);
        tbl.setModel(model);
    }

    private void runQuery() {
        runQuery(queryStr, connection, database);
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        CustomTable tbl = getTable();
        TableRow addedRow = tbl.addEmptyRow();
        System.out.println("row added");
        btnAdd.setEnabled(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveChangesForTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesForTableActionPerformed
        CustomTable table = getTable();
        TableRow row = table.getSelectedTableRow();
        db.saveRow(table.getConnection(), row);
        runQuery(table.getQuery(), table.getConnection(), table.getDatabase());
    }//GEN-LAST:event_btnSaveChangesForTableActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        CustomTable tbl = getTable();
        db.deleteRow(connection, tbl.getSelectedTableRow());
        runQuery();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblQueryResultFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblQueryResultFocusGained
        CustomTable table = getTable();
        TableRow row = table.getSelectedTableRow();
        System.out.println("tblQueryResultFocusGained=" + row);
    }//GEN-LAST:event_tblQueryResultFocusGained

    private void tblQueryResultFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblQueryResultFocusLost
        CustomTable table = getTable();
        TableRow row = table.getSelectedTableRow();
        System.out.println("tblQueryResultFocusLost=" + row);
    }//GEN-LAST:event_tblQueryResultFocusLost

    private void tblQueryResultPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblQueryResultPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tblQueryResultPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSaveChangesForTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblQueryResult;
    // End of variables declaration//GEN-END:variables
}
