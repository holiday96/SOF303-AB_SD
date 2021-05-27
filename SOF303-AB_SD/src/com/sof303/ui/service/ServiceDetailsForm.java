package com.sof303.ui.service;

import java.awt.*;

public class ServiceDetailsForm extends javax.swing.JFrame {

    private Details1 pnelDetails1;
    private Details2 pnelDetails2;
    private Details3 pnelDetails3;
    private DetailsContact pnelDetailsContact;
    private DetailsFunding pnelDetailsFunding;
    private DetailsOrganisations pnelDetailsOrganisations;
    private DetailsPremises pnelDetailsPremises;

    public ServiceDetailsForm() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Service Details");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setDetails();
    }

    public ServiceDetailsForm(Component component) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Service Details");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setDetails();
    }

    private void setDetails() {
        pnelDetails1 = new Details1();
        pnelDetails2 = new Details2();
        pnelDetails3 = new Details3();
        pnelDetailsContact = new DetailsContact();
        pnelDetailsFunding = new DetailsFunding();
        pnelDetailsOrganisations = new DetailsOrganisations();
        pnelDetailsPremises = new DetailsPremises();
        pnelDetails1.setLayout(new java.awt.GridLayout(1, 2));
        pnelDetails2.setLayout(new java.awt.GridLayout(1, 2));
        pnelDetails3.setLayout(new java.awt.GridLayout(1, 2));
        pnelDetailsContact.setLayout(new java.awt.GridLayout(1, 2));
        pnelDetailsFunding.setLayout(new java.awt.GridLayout(1, 2));
        pnelDetailsOrganisations.setLayout(new java.awt.GridLayout(1, 2));
        pnelDetailsPremises.setLayout(new java.awt.GridLayout(1, 2));
        jTabbedPane1.addTab("Details 1", pnelDetails1);
        jTabbedPane1.addTab("Details 2", pnelDetails2);
        jTabbedPane1.addTab("Details 3", pnelDetails3);
        jTabbedPane1.addTab("Contract", pnelDetailsContact);
        jTabbedPane1.addTab("Organisations", pnelDetailsOrganisations);
        jTabbedPane1.addTab("Premises", pnelDetailsPremises);
        jTabbedPane1.addTab("Funding", pnelDetailsFunding);
        jTabbedPane1.remove(pnelDetailsOrganisations);
        jTabbedPane1.remove(pnelDetailsContact);
        jTabbedPane1.remove(pnelDetailsPremises);
        jTabbedPane1.remove(pnelDetailsFunding);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceDetailsForm().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Service Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addGap(3, 3, 3)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration                   
}
