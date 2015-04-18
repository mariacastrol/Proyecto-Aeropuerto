/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.FuncionesGenerales;
import javax.swing.JOptionPane;

/**
 *
 * @author ADOLFO
 */
public class NJDialogListaSobrecargos extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPersonalVuelo
     */
    public NJDialogListaSobrecargos(java.awt.Frame parent, boolean modal) {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        botonGrabar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSobrecargos = new javax.swing.JTable();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modificar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LISTA DE SOBRECARGOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jLabel12.setText("NOMBRE");

        botonGrabar.setText("GRABAR LISTA DE SOBRECARGOS");
        botonGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGrabarActionPerformed(evt);
            }
        });

        jTableSobrecargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSobrecargos.setComponentPopupMenu(jPopupMenu1);
        jTableSobrecargos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSobrecargosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSobrecargos);

        botonAgregar.setText("AGREGAR");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonModificar.setText("ACTUALIZAR");
        botonModificar.setEnabled(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonModificar)
                                .addGap(18, 18, 18)
                                .addComponent(botonAgregar))
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonGrabar))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar)
                    .addComponent(botonAgregar))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(botonGrabar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        if (jTextFieldNombre.getText() == null || jTextFieldNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Escriba el nombre del/de la sobrecargo","",JOptionPane.INFORMATION_MESSAGE);
        } else {
            String [] sobrecargo = {jTextFieldNombre.getText()};
            FuncionesGenerales.agregarFila(jTableSobrecargos,sobrecargo);
            jTextFieldNombre.setText(null);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (jTextFieldNombre.getText() == null || jTextFieldNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this,"Escriba el nombre del/de la sobrecargo","",JOptionPane.INFORMATION_MESSAGE);
        } else {
            String [] sobrecargo = {jTextFieldNombre.getText()};
            FuncionesGenerales.modificarFila(jTableSobrecargos,filaAModificar,0,sobrecargo);
            botonAgregar.setEnabled(true);
            botonGrabar.setEnabled(true);
            botonModificar.setEnabled(false);
            jTextFieldNombre.setText(null);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int filaAEliminar = jTableSobrecargos.getSelectedRow();
        if (filaAEliminar != -1) {           
            FuncionesGenerales.eliminarFila(jTableSobrecargos,filaAEliminar);            
        } else {
            JOptionPane.showMessageDialog(this,"Seleccione el/la sobrecargo a eliminar","",JOptionPane.INFORMATION_MESSAGE);
        }  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        funcionSeleccionar(); 
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        int limite = 100;
        char caracterValidar = evt.getKeyChar();
        if (!((Character.isAlphabetic(caracterValidar) || Character.isISOControl(caracterValidar) || Character.isSpaceChar(caracterValidar)) && jTextFieldNombre.getText().length() < limite)){
            getToolkit().beep(); 
            evt.consume();
        } else {
            char caracterMayuscula = Character.toUpperCase(caracterValidar);
            evt.setKeyChar(caracterMayuscula);
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void botonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGrabarActionPerformed
        if (jTableSobrecargos.getRowCount() > 0) {
            String sobrecargos = "";
            for (int i = 0; i < jTableSobrecargos.getRowCount(); i++) {
                if (i != jTableSobrecargos.getRowCount() - 1) {
                    sobrecargos += jTableSobrecargos.getValueAt(i,0) + ", ";
                } else {
                    sobrecargos += jTableSobrecargos.getValueAt(i,0);
                }
            }
            AJFrameVentanaCapturas.listaSobrecargos = sobrecargos;
            AJFrameVentanaCapturas.jLabel48.setEnabled(true);   
        } else {
            AJFrameVentanaCapturas.listaSobrecargos = null;
            AJFrameVentanaCapturas.jLabel48.setEnabled(false);
        }
        this.dispose();     
    }//GEN-LAST:event_botonGrabarActionPerformed

    private void jTableSobrecargosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSobrecargosMouseClicked
        if (evt.getClickCount() == 2) {
            funcionSeleccionar();       
        }
    }//GEN-LAST:event_jTableSobrecargosMouseClicked

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
            java.util.logging.Logger.getLogger(NJDialogListaSobrecargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NJDialogListaSobrecargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NJDialogListaSobrecargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NJDialogListaSobrecargos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                NJDialogListaSobrecargos dialog = new NJDialogListaSobrecargos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botonGrabar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableSobrecargos;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
    int filaAModificar;
    
    private void funcionSeleccionar() {
        filaAModificar = jTableSobrecargos.getSelectedRow();
        if (filaAModificar != -1) {           
            jTextFieldNombre.setText(jTableSobrecargos.getValueAt(filaAModificar,0).toString());
            botonAgregar.setEnabled(false);
            botonGrabar.setEnabled(false);
            botonModificar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this,"Seleccione el/la sobrecargo a modificar","",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
