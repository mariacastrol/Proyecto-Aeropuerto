/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.FuncionesGenerales;
import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author ADOLFO
 */
public class PJDialogDesembarque extends javax.swing.JDialog {

    /**
     * Creates new form JDialogDesembarque
     */
    public PJDialogDesembarque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTtlPersonas1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTtlPersonas2 = new javax.swing.JTextField();
        jTextFieldTtlPersonas3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEquipajeKg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEquipajePzas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCargaKg = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCargaPzas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCorreoPzas = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldCorreoKg = new javax.swing.JTextField();
        jTextFieldPersonasTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DESEMBARQUE: MANIFIESTO DE LLEGADA");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("PASAJEROS");

        jTextFieldTtlPersonas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTtlPersonas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTtlPersonas1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTtlPersonas1KeyTyped(evt);
            }
        });

        jLabel5.setText("/");

        jTextFieldTtlPersonas2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTtlPersonas2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTtlPersonas2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTtlPersonas2KeyTyped(evt);
            }
        });

        jTextFieldTtlPersonas3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTtlPersonas3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldTtlPersonas3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTtlPersonas3KeyTyped(evt);
            }
        });

        jLabel6.setText("/");

        jTextFieldEquipajeKg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEquipajeKg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEquipajeKgKeyTyped(evt);
            }
        });

        jLabel2.setText("EQUIPAJE");

        jTextFieldEquipajePzas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEquipajePzas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEquipajePzasKeyTyped(evt);
            }
        });

        jLabel7.setText("/");

        jTextFieldCargaKg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCargaKg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCargaKgKeyTyped(evt);
            }
        });

        jLabel8.setText("/");

        jTextFieldCargaPzas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCargaPzas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCargaPzasKeyTyped(evt);
            }
        });

        jLabel3.setText("CARGA");

        jLabel4.setText("CORREO");

        jTextFieldCorreoPzas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCorreoPzas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoPzasKeyTyped(evt);
            }
        });

        jLabel9.setText("/");

        jTextFieldCorreoKg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCorreoKg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCorreoKgKeyTyped(evt);
            }
        });

        jTextFieldPersonasTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldPersonasTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPersonasTotalKeyTyped(evt);
            }
        });

        jLabel10.setText("Núm.");

        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel17.setText("* CAMPOS OBLIGATORIOS");

        jButton1.setText("CEROS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldCargaPzas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEquipajePzas, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldTtlPersonas1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldCorreoPzas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldEquipajeKg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCargaKg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCorreoKg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldTtlPersonas2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldTtlPersonas3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldPersonasTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTtlPersonas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldTtlPersonas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldTtlPersonas3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPersonasTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEquipajePzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldEquipajeKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldCargaPzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldCargaKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCorreoPzas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCorreoKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTtlPersonas1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTtlPersonas1KeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldTtlPersonas1.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        } else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel1.getForeground().getRGB() == cError.getRGB()) {
                int jTextFieldVacios = 0;
                jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacio(jTextFieldTtlPersonas2,1);
                jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacio(jTextFieldTtlPersonas3,1);
                if (jTextFieldVacios == 0) {
                    jLabel1.setForeground(new java.awt.Color(0,0,0));
                    jLabel1.setText("PASAJEROS");
                }
            }
            desaparecerEtiqueta(0);
        }
    }//GEN-LAST:event_jTextFieldTtlPersonas1KeyTyped

    private void jTextFieldTtlPersonas2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTtlPersonas2KeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldTtlPersonas2.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        } else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel1.getForeground().getRGB() == cError.getRGB()) {
                int jTextFieldVacios = 0;
                jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacio(jTextFieldTtlPersonas1,1);
                jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacio(jTextFieldTtlPersonas3,1);
                if (jTextFieldVacios == 0) {
                    jLabel1.setForeground(new java.awt.Color(0,0,0));
                    jLabel1.setText("PASAJEROS");
                }
            }
            desaparecerEtiqueta(1);
        }
    }//GEN-LAST:event_jTextFieldTtlPersonas2KeyTyped

    private void jTextFieldTtlPersonas3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTtlPersonas3KeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldTtlPersonas3.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        } else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel1.getForeground().getRGB() == cError.getRGB()) {
                int jTextFieldVacios = 0;
                jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacio(jTextFieldTtlPersonas1,1);
                jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacio(jTextFieldTtlPersonas2,1);
                if (jTextFieldVacios == 0) {
                    jLabel1.setForeground(new java.awt.Color(0,0,0));
                    jLabel1.setText("PASAJEROS");
                }
            }
            desaparecerEtiqueta(2);
        }
    }//GEN-LAST:event_jTextFieldTtlPersonas3KeyTyped

    private void jTextFieldPersonasTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPersonasTotalKeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldPersonasTotal.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        } else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel10.getForeground().getRGB() == cError.getRGB()) {
                jLabel10.setForeground(new java.awt.Color(0,0,0));
                jLabel10.setText("Núm.");
            }
            desaparecerEtiqueta(9);
        }
    }//GEN-LAST:event_jTextFieldPersonasTotalKeyTyped

    private void jTextFieldEquipajePzasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEquipajePzasKeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldEquipajePzas.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        } else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel2.getForeground().getRGB() == cError.getRGB()) {
                if (FuncionesGenerales.sumarSiEstaVacio(jTextFieldEquipajeKg,1) == 0) {
                    jLabel2.setForeground(new java.awt.Color(0,0,0));
                    jLabel2.setText("EQUIPAJE");
                }
            }
            desaparecerEtiqueta(3);
        }
    }//GEN-LAST:event_jTextFieldEquipajePzasKeyTyped

    private void jTextFieldEquipajeKgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEquipajeKgKeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldEquipajeKg.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        }  else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel2.getForeground().getRGB() == cError.getRGB()) {
                if (FuncionesGenerales.sumarSiEstaVacio(jTextFieldEquipajePzas,1) == 0) {
                    jLabel2.setForeground(new java.awt.Color(0,0,0));
                    jLabel2.setText("EQUIPAJE");
                }
            }
            desaparecerEtiqueta(4);
        }
    }//GEN-LAST:event_jTextFieldEquipajeKgKeyTyped

    private void jTextFieldCargaPzasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCargaPzasKeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldCargaPzas.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        } else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel3.getForeground().getRGB() == cError.getRGB()) {
                if (FuncionesGenerales.sumarSiEstaVacio(jTextFieldCargaKg,1) == 0) {
                    jLabel3.setForeground(new java.awt.Color(0,0,0));
                    jLabel3.setText("CARGA");
                }
            }
            desaparecerEtiqueta(5);
        }
    }//GEN-LAST:event_jTextFieldCargaPzasKeyTyped

    private void jTextFieldCargaKgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCargaKgKeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldCargaKg.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        } else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel3.getForeground().getRGB() == cError.getRGB()) {
                if (FuncionesGenerales.sumarSiEstaVacio(jTextFieldCargaPzas,1) == 0) {
                    jLabel3.setForeground(new java.awt.Color(0,0,0));
                    jLabel3.setText("CARGA");
                }
            }
            desaparecerEtiqueta(6);
        }
    }//GEN-LAST:event_jTextFieldCargaKgKeyTyped

    private void jTextFieldCorreoPzasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoPzasKeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldCorreoPzas.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        }  else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel4.getForeground().getRGB() == cError.getRGB()) {
                if (FuncionesGenerales.sumarSiEstaVacio(jTextFieldCorreoKg,1) == 0) {
                    jLabel4.setForeground(new java.awt.Color(0,0,0));
                    jLabel4.setText("CORREO");
                }
            }
            desaparecerEtiqueta(7);
        }
    }//GEN-LAST:event_jTextFieldCorreoPzasKeyTyped

    private void jTextFieldCorreoKgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCorreoKgKeyTyped
        int limite = 4;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isDigit(caracterValidar) || Character.isISOControl(caracterValidar)) && jTextFieldCorreoKg.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        } else {
            Color cError = new Color(rError,gError,bError);
            if (jLabel4.getForeground().getRGB() == cError.getRGB()) {
                if (FuncionesGenerales.sumarSiEstaVacio(jTextFieldCorreoPzas,1) == 0) {
                    jLabel4.setForeground(new java.awt.Color(0,0,0));
                    jLabel4.setText("CORREO");
                }
            }
            desaparecerEtiqueta(8);
        }
    }//GEN-LAST:event_jTextFieldCorreoKgKeyTyped

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        int jTextFieldVacios = 0;
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldTtlPersonas1,jLabel1,"PASAJEROS*",1,rError,gError,bError);
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldTtlPersonas2,jLabel1,"PASAJEROS*",1,rError,gError,bError);
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldTtlPersonas3,jLabel1,"PASAJEROS*",1,rError,gError,bError);
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldEquipajePzas,jLabel2,"EQUIPAJE*",1,rError,gError,bError);
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldEquipajeKg,jLabel2,"EQUIPAJE*",1,rError,gError,bError);
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldCargaPzas,jLabel3,"CARGA*",1,rError,gError,bError);
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldCargaKg,jLabel3,"CARGA*",1,rError,gError,bError);
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldCorreoPzas,jLabel4,"CORREO*",1,rError,gError,bError);
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldCorreoKg,jLabel4,"CORREO*",1,rError,gError,bError);
        jTextFieldVacios += FuncionesGenerales.sumarSiEstaVacioColor(jTextFieldPersonasTotal,jLabel10,"Núm.*",1,rError,gError,bError);
        if (jTextFieldVacios == 0) {
            String [] desembarqueDeclarado = {
                jTextFieldPersonasTotal.getText(),
                jTextFieldTtlPersonas1.getText() + "/" + jTextFieldTtlPersonas2.getText() + "/" + jTextFieldTtlPersonas3.getText(),
                jTextFieldEquipajePzas.getText() + "/" + jTextFieldEquipajeKg.getText(),
                jTextFieldCargaPzas.getText() + "/" + jTextFieldCargaKg.getText(),
                jTextFieldCorreoPzas.getText() + "/" + jTextFieldCorreoKg.getText()
            };
            AJFrameVentanaCapturas.desembarque = desembarqueDeclarado;
            AJFrameVentanaCapturas.jLabel40.setEnabled(true);
            this.dispose();
        } else {
            jLabel17.setForeground(new java.awt.Color(rError,gError,bError));
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FuncionesGenerales.ponerEnCeros(jTextFieldTtlPersonas1,jLabel1,"PASAJEROS");
        FuncionesGenerales.ponerEnCeros(jTextFieldTtlPersonas2,jLabel1,"PASAJEROS");
        FuncionesGenerales.ponerEnCeros(jTextFieldTtlPersonas3,jLabel1,"PASAJEROS");
        FuncionesGenerales.ponerEnCeros(jTextFieldEquipajePzas,jLabel2,"EQUIPAJE");
        FuncionesGenerales.ponerEnCeros(jTextFieldEquipajeKg,jLabel2,"EQUIPAJE");
        FuncionesGenerales.ponerEnCeros(jTextFieldCargaPzas,jLabel3,"CARGA");
        FuncionesGenerales.ponerEnCeros(jTextFieldCargaKg,jLabel3,"CARGA");
        FuncionesGenerales.ponerEnCeros(jTextFieldCorreoPzas,jLabel4,"CORREO");
        FuncionesGenerales.ponerEnCeros(jTextFieldCorreoKg,jLabel4,"CORREO");
        FuncionesGenerales.ponerEnCeros(jTextFieldPersonasTotal,jLabel10,"Núm.");
        jLabel17.setForeground(colorFondo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldTtlPersonas1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTtlPersonas1KeyReleased
        sumaPasajeros();
    }//GEN-LAST:event_jTextFieldTtlPersonas1KeyReleased

    private void jTextFieldTtlPersonas2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTtlPersonas2KeyReleased
        sumaPasajeros();
    }//GEN-LAST:event_jTextFieldTtlPersonas2KeyReleased

    private void jTextFieldTtlPersonas3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTtlPersonas3KeyReleased
        sumaPasajeros();
    }//GEN-LAST:event_jTextFieldTtlPersonas3KeyReleased

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PJDialogDesembarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PJDialogDesembarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PJDialogDesembarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PJDialogDesembarque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PJDialogDesembarque dialog = new PJDialogDesembarque(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldCargaKg;
    public javax.swing.JTextField jTextFieldCargaPzas;
    public javax.swing.JTextField jTextFieldCorreoKg;
    public javax.swing.JTextField jTextFieldCorreoPzas;
    public javax.swing.JTextField jTextFieldEquipajeKg;
    public javax.swing.JTextField jTextFieldEquipajePzas;
    public javax.swing.JTextField jTextFieldPersonasTotal;
    public javax.swing.JTextField jTextFieldTtlPersonas1;
    public javax.swing.JTextField jTextFieldTtlPersonas2;
    public javax.swing.JTextField jTextFieldTtlPersonas3;
    // End of variables declaration//GEN-END:variables

    private final int rError = 255;
    private final int gError = 0;
    private final int bError = 0;
    private final JTextField [] camposTextos = new JTextField[10];
    private Color colorFondo;
    
    public void arregloTextField() {
        camposTextos[0] = jTextFieldTtlPersonas1;
        camposTextos[1] = jTextFieldTtlPersonas2;
        camposTextos[2] = jTextFieldTtlPersonas3;
        camposTextos[3] = jTextFieldEquipajePzas;
        camposTextos[4] = jTextFieldEquipajeKg;
        camposTextos[5] = jTextFieldCargaPzas;
        camposTextos[6] = jTextFieldCargaKg;
        camposTextos[7] = jTextFieldCorreoPzas;
        camposTextos[8] = jTextFieldCorreoKg;
        camposTextos[9] = jTextFieldPersonasTotal;
        colorFondo = jPanel1.getBackground();
        jLabel17.setForeground(colorFondo);
    }
    
    private void desaparecerEtiqueta(int indiceCajaTexto) {
        Color cError = new Color(rError,gError,bError);
        if (jLabel17.getForeground().getRGB() == cError.getRGB()) {
            int camposVacios = 0;
            for (int i = 0; i < camposTextos.length; i++) {
                if (i != indiceCajaTexto) {
                    JTextField campo = camposTextos[i];
                    if ((campo.getText() == null || "".equals(campo.getText()))) {
                        camposVacios++;
                    }
                }
            }
            if (camposVacios == 0) {
                jLabel17.setForeground(colorFondo);
            }
        }
    } 
    
    private void sumaPasajeros() {
        int totalPasajeros = 0;
        if (!FuncionesGenerales.estaVacioJTextField(jTextFieldTtlPersonas1)) {
            totalPasajeros += Integer.parseInt(jTextFieldTtlPersonas1.getText());
        }
        if (!FuncionesGenerales.estaVacioJTextField(jTextFieldTtlPersonas2)) {
            totalPasajeros += Integer.parseInt(jTextFieldTtlPersonas2.getText());
        }
        if (!FuncionesGenerales.estaVacioJTextField(jTextFieldTtlPersonas3)) {
            totalPasajeros += Integer.parseInt(jTextFieldTtlPersonas3.getText());
        }
        jTextFieldPersonasTotal.setText(Integer.toString(totalPasajeros));
    }
    
}
