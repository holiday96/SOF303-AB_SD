package com.sof303.ui.service;

import javax.swing.table.DefaultTableModel;

public class DetailsOrganisations extends javax.swing.JPanel {

    private DefaultTableModel _modelTableOrganization;

    public DetailsOrganisations() {
        initComponents();
        tbOrganisations.setModel(_modelTableOrganization = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        setColumnTableOrganisation();
    }

    private void setColumnTableOrganisation() {
        String[] arrCol = {"Organisation Name", "Description", "Roles", "", ""};
        for (String x : arrCol) {
            _modelTableOrganization.addColumn(x);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnelOrganisations = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrganisations = new javax.swing.JTable();

        tbOrganisations.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbOrganisations);

        javax.swing.GroupLayout pnelOrganisationsLayout = new javax.swing.GroupLayout(pnelOrganisations);
        pnelOrganisations.setLayout(pnelOrganisationsLayout);
        pnelOrganisationsLayout.setHorizontalGroup(
            pnelOrganisationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
        );
        pnelOrganisationsLayout.setVerticalGroup(
            pnelOrganisationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnelOrganisations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnelOrganisations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnelOrganisations;
    private javax.swing.JTable tbOrganisations;
    // End of variables declaration//GEN-END:variables
}
