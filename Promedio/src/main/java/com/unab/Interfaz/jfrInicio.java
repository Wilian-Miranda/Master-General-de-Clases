/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.Interfaz;

import com.unab.Dominio.Datos;
import com.unab.Promedio.ClsPromedio;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class jfrInicio extends javax.swing.JFrame {

    /**
     * Creates new form jfrInicio
     */
    public jfrInicio() {
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

        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLaboratorio1 = new javax.swing.JTextField();
        txtParcial1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNotaPeriodo1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLaboratorio2 = new javax.swing.JTextField();
        txtParcial2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNotaPeriodo2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtLaboratorio3 = new javax.swing.JTextField();
        txtParcial3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNotaPeriodo3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPromedioFinal = new javax.swing.JTextField();
        btnCalculo = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LABORATORIO 1");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PARCIAL 1");

        txtLaboratorio1.setBackground(new java.awt.Color(153, 153, 153));
        txtLaboratorio1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtLaboratorio1.setForeground(new java.awt.Color(255, 255, 255));
        txtLaboratorio1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLaboratorio1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtLaboratorio1.setCaretColor(new java.awt.Color(127, 127, 127));
        txtLaboratorio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLaboratorio1ActionPerformed(evt);
            }
        });

        txtParcial1.setBackground(new java.awt.Color(153, 153, 153));
        txtParcial1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtParcial1.setForeground(new java.awt.Color(255, 255, 255));
        txtParcial1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtParcial1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtParcial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParcial1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NOTA DE PERIODO I");

        txtNotaPeriodo1.setEditable(false);
        txtNotaPeriodo1.setBackground(new java.awt.Color(153, 153, 153));
        txtNotaPeriodo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNotaPeriodo1.setForeground(new java.awt.Color(255, 255, 255));
        txtNotaPeriodo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNotaPeriodo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtNotaPeriodo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaPeriodo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addComponent(txtLaboratorio1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtParcial1))
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(59, 59, 59))
                    .addComponent(txtNotaPeriodo1))
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtLaboratorio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtNotaPeriodo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtParcial1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LABORATORIO 2");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PARCIAL 2");

        txtLaboratorio2.setBackground(new java.awt.Color(153, 153, 153));
        txtLaboratorio2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtLaboratorio2.setForeground(new java.awt.Color(255, 255, 255));
        txtLaboratorio2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLaboratorio2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtLaboratorio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLaboratorio2ActionPerformed(evt);
            }
        });

        txtParcial2.setBackground(new java.awt.Color(153, 153, 153));
        txtParcial2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtParcial2.setForeground(new java.awt.Color(255, 255, 255));
        txtParcial2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtParcial2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtParcial2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParcial2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NOTA DE PERIODO II");

        txtNotaPeriodo2.setEditable(false);
        txtNotaPeriodo2.setBackground(new java.awt.Color(153, 153, 153));
        txtNotaPeriodo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNotaPeriodo2.setForeground(new java.awt.Color(255, 255, 255));
        txtNotaPeriodo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNotaPeriodo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addComponent(txtLaboratorio2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtParcial2))
                .addGap(65, 65, 65)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(56, 56, 56))
                    .addComponent(txtNotaPeriodo2))
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtLaboratorio2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNotaPeriodo2)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtParcial2)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LABORATORIO 3");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PARCIAL 3");

        txtLaboratorio3.setBackground(new java.awt.Color(153, 153, 153));
        txtLaboratorio3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtLaboratorio3.setForeground(new java.awt.Color(255, 255, 255));
        txtLaboratorio3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLaboratorio3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtParcial3.setBackground(new java.awt.Color(153, 153, 153));
        txtParcial3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtParcial3.setForeground(new java.awt.Color(255, 255, 255));
        txtParcial3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtParcial3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtParcial3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParcial3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOTA DE PERIODO III");

        txtNotaPeriodo3.setEditable(false);
        txtNotaPeriodo3.setBackground(new java.awt.Color(153, 153, 153));
        txtNotaPeriodo3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNotaPeriodo3.setForeground(new java.awt.Color(255, 255, 255));
        txtNotaPeriodo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNotaPeriodo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtParcial3)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))
                    .addComponent(txtLaboratorio3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addComponent(txtNotaPeriodo3))
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtLaboratorio3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNotaPeriodo3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtParcial3)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PROMEDIO DE ASIGNATURA POR CICLO");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("RESULTADO");

        txtPromedioFinal.setEditable(false);
        txtPromedioFinal.setBackground(new java.awt.Color(153, 153, 153));
        txtPromedioFinal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPromedioFinal.setForeground(new java.awt.Color(255, 255, 255));
        txtPromedioFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPromedioFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btnCalculo.setBackground(new java.awt.Color(0, 51, 51));
        btnCalculo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCalculo.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculo.setText("CALCULAR");
        btnCalculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 476, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPromedioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(btnCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtPromedioFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCalculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtParcial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParcial1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParcial1ActionPerformed

    private void txtParcial2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParcial2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParcial2ActionPerformed

    private void txtParcial3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParcial3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParcial3ActionPerformed

    private void txtLaboratorio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaboratorio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLaboratorio2ActionPerformed

    private void btnCalculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculoActionPerformed
        // TODO add your handling code here:
        String resultado = "";
        boolean Error1 = false;
        boolean Error2 = false;
        boolean Error3 = false;

        //Creando objetos
        Datos atributo = new Datos();
        ClsPromedio calculo = new ClsPromedio();

        //PERIODO1
        String resultado1 = "";

        /*Si se escriben letras en las casilla laboratorio1 y parcial1 la 
        variable Error tomará el valor de true indicando que se ingresó 
        texto*/
        try {
            Double a = Double.parseDouble(txtLaboratorio1.getText());
        } catch (Exception e) {
            Error1 = true;
        }

        try {
            Double a = Double.parseDouble(txtParcial1.getText());
        } catch (Exception e) {
            Error1 = true;
        }

        /*Si una o las dos casillas están vacias y se presiona igual,
        se le asignará un cero a cada casilla vacía*/
        if (txtLaboratorio1.getText().equals("")) {
            txtLaboratorio1.setText("0");

        }
        if (txtParcial1.getText().equals("")) {
            txtParcial1.setText("0");
        }

        /*Si se ingresa texto los metodos no se utilizan y se muestran un 
        mensaje de error, la variable error es utilizada para verificar 
        si el usuario ingresó texto*/
        if (Error1 == true) {
            txtNotaPeriodo1.setText("Datos no válidos");
        } else {
            //Asignando los valores ingresados a los atributos correspondientes
            atributo.setLaboratorio(txtLaboratorio1.getText());
            atributo.setParcial(txtParcial1.getText());

            /*Utilizando el método para calcular el periodo 1 y 
            mostrando al usuario*/
            resultado1 = calculo.periodo(atributo);
            txtNotaPeriodo1.setText(resultado1);
        }

        //PERIODO2
        String resultado2 = "";
        
        /*Si se escriben letras en las casilla laboratorio2 y parcial2 la 
        variable Error tomará el valor de true indicando que se ingresó 
        texto*/
        try {
            Double a = Double.parseDouble(txtLaboratorio2.getText());
        } catch (Exception e) {
            Error2 = true;
        }
        try {
            Double a = Double.parseDouble(txtParcial2.getText());
        } catch (Exception e) {
            Error2 = true;
        }

        /*Si una o las dos casillas están vacias y se presiona igual,
        se le asignará un cero a cada casilla vacía*/
        if (txtLaboratorio2.getText().equals("")) {
            txtLaboratorio2.setText("0");

        }
        if (txtParcial2.getText().equals("")) {
            txtParcial2.setText("0");
        }

        /*Si se ingresa texto los metodos no se utilizan y se muestran un 
        mensaje de error, la variable error es utilizada para verificar 
        si el usuario ingresó texto*/
        if (Error2 == true) {
            txtNotaPeriodo2.setText("Datos no válidos");
        } else {
            //Asignando los valores ingresados a los atributos correspondientes
            atributo.setLaboratorio(txtLaboratorio2.getText());
            atributo.setParcial(txtParcial2.getText());

            /*Utilizando el método para calcular el periodo 2 y 
            mostrando al usuario el resultado*/
            resultado2 = calculo.periodo(atributo);
            txtNotaPeriodo2.setText(resultado2);
        }

        //PERIODO3
        String resultado3 = "";
        
        /*Si se escriben letras en las casilla laboratorio3 y parcial3 la 
        variable Error tomará el valor de true indicando que se ingresó 
        texto*/
        try {
            Double a = Double.parseDouble(txtLaboratorio3.getText());
        } catch (Exception e) {
            Error3 = true;
        }
        try {
            Double a = Double.parseDouble(txtParcial3.getText());
        } catch (Exception e) {
            Error3 = true;
        }

        /*Si una o las dos casillas están vacias y se presiona igual,
        se le asignará un cero a cada casilla vacía*/
        if (txtLaboratorio3.getText().equals("")) {
            txtLaboratorio3.setText("0");

        }
        if (txtParcial3.getText().equals("")) {
            txtParcial3.setText("0");
        }

        /*Si se ingresa texto los metodos no se utilizan y se muestran un 
        mensaje de error, la variable error es utilizada para verificar 
        si el usuario ingresó texto*/
        if (Error3 == true) {
            txtNotaPeriodo3.setText("Datos no válidos");
        } else {
            //Asignando los valores ingresados a los atributos correspondientes
            atributo.setLaboratorio(txtLaboratorio3.getText());
            atributo.setParcial(txtParcial3.getText());

            /*Utilizando el método para calcular el periodo 3 y 
            mostrando al usuario el resultado*/
            resultado3 = calculo.periodo(atributo);
            txtNotaPeriodo3.setText(resultado3);
        }

        //Calculando el resultado final y mostrando al usuario
        resultado = calculo.aprobarCiclo(resultado1, resultado2, resultado3);

        txtPromedioFinal.setText(resultado);
    }//GEN-LAST:event_btnCalculoActionPerformed

    private void txtLaboratorio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLaboratorio1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtLaboratorio1ActionPerformed

    private void txtNotaPeriodo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaPeriodo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaPeriodo1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfrInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtLaboratorio1;
    private javax.swing.JTextField txtLaboratorio2;
    private javax.swing.JTextField txtLaboratorio3;
    private javax.swing.JTextField txtNotaPeriodo1;
    private javax.swing.JTextField txtNotaPeriodo2;
    private javax.swing.JTextField txtNotaPeriodo3;
    private javax.swing.JTextField txtParcial1;
    private javax.swing.JTextField txtParcial2;
    private javax.swing.JTextField txtParcial3;
    private javax.swing.JTextField txtPromedioFinal;
    // End of variables declaration//GEN-END:variables
}