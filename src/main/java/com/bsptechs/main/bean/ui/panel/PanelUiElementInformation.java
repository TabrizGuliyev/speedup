/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bsptechs.main.bean.ui.panel;

import com.bsptechs.main.bean.ui.tree.node.CustomTreeNode;
import com.bsptechs.main.bean.ui.tree.database.node.ConnectionTreeNode;
import com.bsptechs.main.bean.ui.tree.database.node.DatabaseTreeNode;
import com.bsptechs.main.bean.ui.tree.database.node.TableTreeNode;
import com.bsptechs.main.util.ImageUtil;

/**
 *
 * @author sarkhanrasullu
 */
public class PanelUiElementInformation extends javax.swing.JPanel {

    /**
     * Creates new form PanelUiElementInformation
     */
    public PanelUiElementInformation() {
        initComponents();
        iconinfo.setIcon(ImageUtil.getIconforQueryPanel("/info.png"));
        iconforconnecteddatabase.setIcon(ImageUtil.getIconforMysql("/mysql.png"));
        setVisible(true);
    }

    public void preparePanel(CustomTreeNode element) {
        System.out.println("element="+element);
        if (element == null) {
            return;
        }

        if (element instanceof ConnectionTreeNode) {
            System.out.println("connection");
            ConnectionTreeNode el = (ConnectionTreeNode) element;
            String name = el.getName();
            String port = el.getPort();
            String ipAdress = el.getIpAdr();
            String userName = el.getUserName();

            lblconnecteddatabase.setText(name);
            lblisconnectornoconnect.setText("Connected");
            lblHost.setText(ipAdress);
            lblPort.setText(port);
            lblUserName1.setText(userName);
        }else if(element instanceof TableTreeNode){
             TableTreeNode el = (TableTreeNode) element;
        }else if(element instanceof DatabaseTreeNode){
             DatabaseTreeNode el = (DatabaseTreeNode) element;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconinfo = new javax.swing.JLabel();
        iconforconnecteddatabase = new javax.swing.JLabel();
        lblconnecteddatabase = new javax.swing.JLabel();
        lblisconnectornoconnect = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblServerVersion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSessions = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblHost = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPort = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblEncoding = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSSHHost = new javax.swing.JLabel();
        lblUserName1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        iconforconnecteddatabase.setBackground(new java.awt.Color(0, 0, 0));

        lblconnecteddatabase.setText("            ");

        lblisconnectornoconnect.setText("localhost                      ");

        lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl.setText("Server Version:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Sessions:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Host:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Port:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("User Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Settings Location:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Encoding:");

        lblEncoding.setText("                                  ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("SSH Host:");

        lblSSHHost.setText("                                ");

        lblUserName1.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(iconforconnecteddatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl)
                            .addComponent(lblServerVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblSessions, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(lblHost, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(lblPort, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(lblUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(lblEncoding)
                            .addComponent(jLabel8)
                            .addComponent(lblSSHHost)
                            .addComponent(lblconnecteddatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(iconinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblisconnectornoconnect))))
                    .addComponent(lblUserName))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(iconinfo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconforconnecteddatabase, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUserName)
                .addGap(0, 0, 0)
                .addComponent(lblconnecteddatabase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblisconnectornoconnect)
                .addGap(40, 40, 40)
                .addComponent(lbl)
                .addGap(6, 6, 6)
                .addComponent(lblServerVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(lblSessions, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(lblHost, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(lblPort, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(17, 17, 17)
                .addComponent(lblUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(6, 6, 6)
                .addComponent(lblEncoding)
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(lblSSHHost)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconforconnecteddatabase;
    private javax.swing.JLabel iconinfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblEncoding;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblPort;
    private javax.swing.JLabel lblSSHHost;
    private javax.swing.JLabel lblServerVersion;
    private javax.swing.JLabel lblSessions;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblUserName1;
    private javax.swing.JLabel lblconnecteddatabase;
    private javax.swing.JLabel lblisconnectornoconnect;
    // End of variables declaration//GEN-END:variables
}
