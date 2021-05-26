package com.sof303.ui.service;

import javax.swing.table.DefaultTableModel;

public class ServiceListForm extends javax.swing.JFrame {

    private DefaultTableModel _modelTableServiceList;

    public ServiceListForm() {
        initComponents();
        tbServiceList.setModel(_modelTableServiceList = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        setColumnsTable();
    }

    private void setColumnsTable() {
        String[] arrCol = {"", "Service Name", "Description", "Service Type", "Contact", "Is Active?"};
        for (String x : arrCol) {
            _modelTableServiceList.addColumn(x);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceListForm().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAll = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl09 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblABCDE = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblFGHIJ = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblKLMN = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblOPQR = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblSTUV = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblWXYZ = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCopy = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        chkInactive = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        lblFirstPage = new javax.swing.JLabel();
        lblPrev = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtInputPage = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        lblCountPages = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        lblLastPage = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbServiceList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Service List");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        lblAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAll.setForeground(new java.awt.Color(51, 51, 255));
        lblAll.setText("All");
        jPanel2.add(lblAll);

        jLabel3.setText(" | ");
        jPanel2.add(jLabel3);

        lbl09.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl09.setForeground(new java.awt.Color(51, 51, 255));
        lbl09.setText("0 - 9");
        jPanel2.add(lbl09);

        jLabel5.setText(" | ");
        jPanel2.add(jLabel5);

        lblABCDE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblABCDE.setForeground(new java.awt.Color(51, 51, 255));
        lblABCDE.setText("A B C D E");
        jPanel2.add(lblABCDE);

        jLabel7.setText(" | ");
        jPanel2.add(jLabel7);

        lblFGHIJ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblFGHIJ.setForeground(new java.awt.Color(51, 51, 255));
        lblFGHIJ.setText("F G H I J");
        jPanel2.add(lblFGHIJ);

        jLabel9.setText(" | ");
        jPanel2.add(jLabel9);

        lblKLMN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblKLMN.setForeground(new java.awt.Color(51, 51, 255));
        lblKLMN.setText("K L M N");
        jPanel2.add(lblKLMN);

        jLabel11.setText(" | ");
        jPanel2.add(jLabel11);

        lblOPQR.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOPQR.setForeground(new java.awt.Color(51, 51, 255));
        lblOPQR.setText("O P Q R");
        jPanel2.add(lblOPQR);

        jLabel13.setText(" | ");
        jPanel2.add(jLabel13);

        lblSTUV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSTUV.setForeground(new java.awt.Color(51, 51, 255));
        lblSTUV.setText("S T U V");
        jPanel2.add(lblSTUV);

        jLabel15.setText(" | ");
        jPanel2.add(jLabel15);

        lblWXYZ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblWXYZ.setForeground(new java.awt.Color(51, 51, 255));
        lblWXYZ.setText("W X Y Z");
        jPanel2.add(lblWXYZ);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnCopy.setText("Copy");
        jPanel3.add(btnCopy);

        btnCreate.setText("Create");
        jPanel3.add(btnCreate);

        chkInactive.setText("Include In-active");
        jPanel3.add(chkInactive);

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        lblFirstPage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFirstPage.setIcon(new javax.swing.ImageIcon("images/first-page-regular-24.png")); // NOI18N
        jPanel4.add(lblFirstPage);

        lblPrev.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPrev.setIcon(new javax.swing.ImageIcon("images/skip-previous-regular-24.png")); // NOI18N
        jPanel4.add(lblPrev);

        jLabel19.setText(" | ");
        jPanel4.add(jLabel19);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Page ");
        jPanel4.add(jLabel20);
        jPanel4.add(txtInputPage);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText(" of ");
        jPanel4.add(jLabel21);

        lblCountPages.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCountPages.setText("20");
        jPanel4.add(lblCountPages);

        jLabel23.setText(" | ");
        jPanel4.add(jLabel23);

        lblNext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNext.setIcon(new javax.swing.ImageIcon("images/skip-next-regular-24.png")); // NOI18N
        jPanel4.add(lblNext);

        lblLastPage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLastPage.setIcon(new javax.swing.ImageIcon("images/last-page-regular-24.png")); // NOI18N
        jPanel4.add(lblLastPage);

        tbServiceList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbServiceList);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnCreate;
    private javax.swing.JCheckBox chkInactive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl09;
    private javax.swing.JLabel lblABCDE;
    private javax.swing.JLabel lblAll;
    private javax.swing.JLabel lblCountPages;
    private javax.swing.JLabel lblFGHIJ;
    private javax.swing.JLabel lblFirstPage;
    private javax.swing.JLabel lblKLMN;
    private javax.swing.JLabel lblLastPage;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblOPQR;
    private javax.swing.JLabel lblPrev;
    private javax.swing.JLabel lblSTUV;
    private javax.swing.JLabel lblWXYZ;
    private javax.swing.JTable tbServiceList;
    private javax.swing.JTextField txtInputPage;
    // End of variables declaration//GEN-END:variables
}
