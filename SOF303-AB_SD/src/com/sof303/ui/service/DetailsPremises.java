package com.sof303.ui.service;

import javax.swing.table.DefaultTableModel;

public class DetailsPremises extends javax.swing.JPanel {

    private DefaultTableModel _modelTablePremise;

    public DetailsPremises() {
        initComponents();
        tbPremises.setModel(_modelTablePremise = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        setColumnTablePremise();
    }

    private void setColumnTablePremise() {
        String[] arrCol = {"Premise Name", "Address", "Phone Number", "Project Code", ""};
        for (String x : arrCol) {
            _modelTablePremise.addColumn(x);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnelPremises = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPremises = new javax.swing.JTable();

        tbPremises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbPremises);

        javax.swing.GroupLayout pnelPremisesLayout = new javax.swing.GroupLayout(pnelPremises);
        pnelPremises.setLayout(pnelPremisesLayout);
        pnelPremisesLayout.setHorizontalGroup(
            pnelPremisesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
        );
        pnelPremisesLayout.setVerticalGroup(
            pnelPremisesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnelPremises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnelPremises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnelPremises;
    private javax.swing.JTable tbPremises;
    // End of variables declaration//GEN-END:variables
}
