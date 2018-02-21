/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transacciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Proyecto DNI
 */
// Interfaz con el menú de transacciones de la clase registraduría para la solicitud de documentos
public class Registraduria extends javax.swing.JFrame {
    public Inicio usuario;
    public static int Tipo=0; // En esta variable se indica cual es la transacción a realizar
    /**
     * Creates new form Registraduria
     */
    public Registraduria() {
        initComponents();
    }
   // Función para reiniciar la interfaz y variables de la clase luego de salir del menú de la registraduría
    public void start(){
        Tipo=0;
        Primeravez.setSelected(false);
        Duplicado.setSelected(false);
        Aceptar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Primeravez = new javax.swing.JRadioButton();
        Duplicado = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Aceptar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Registraduria");

        Primeravez.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Primeravez.setText("Expedición por primera vez");
        Primeravez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeravezActionPerformed(evt);
            }
        });

        Duplicado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Duplicado.setText("Duplicados");
        Duplicado.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Duplicado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuplicadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Seleccionar el Tipo de Transacción:");

        Aceptar.setText("Aceptar");
        Aceptar.setEnabled(false);
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Duplicado)
                    .addComponent(Primeravez)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Primeravez)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Duplicado)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   /*Al seleccionar está opción se selecciona la transacción de expedir el DNI
    por primera vez lo que activa el botón de aceptar y anula la opción de Duplicado*/
    private void PrimeravezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrimeravezActionPerformed
        Tipo=1; // el 1 indica que es la transacción de primera vez
        Duplicado.setSelected(false);
        Aceptar.setEnabled(true);
    }//GEN-LAST:event_PrimeravezActionPerformed
    /*Al seleccionar está opción se selecciona la transacción de expedir un duplicado
    del documento lo que activa el botón de aceptar y anula la opción de primera vez*/
    private void DuplicadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuplicadoActionPerformed
        Tipo=2; // el 2 indica que es la transaccion de Duplicado
        Primeravez.setSelected(false);
        Aceptar.setEnabled(true);
    }//GEN-LAST:event_DuplicadoActionPerformed
    // Vuelve al menú de clases de transacciones, reiniciando la interfaz y variables de este menú
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.setVisible(false);
        usuario.Abrirmenu();
        start();
    }//GEN-LAST:event_VolverActionPerformed
    /*al activar este botón se envía la transacción, generando un texto plano con 
    los datos que debe tener una como el ID, Serial del documento. La clase de la 
    transacción como registraduría y el tipo de la transacción, si la variable tipo
    contiene un 1 significa que se está generando el documento por primera vez, de
    lo contrario si es un 2 es una transacción de duplicado (falta hacer que se inhabilite el documento). 
    Luego se debe enviar el texto plano se reinician todos los datos de la app 
    para poder realizar una nueva transacción*/
    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        String tran;
        switch (Tipo) {
            case 1:
                tran= "ID:"+Integer.toString(usuario.ID)+" Serial:"+Integer.toString(usuario.Serial)+" Clase:Registraduria Tipo:PrimeraVez Datos:"+Integer.toString(usuario.Serial);
                System.out.println("Transacción de "+usuario.Nombre+"\n"+tran);
                JOptionPane.showMessageDialog(this,"Transacción Enviada");
                usuario.setVisible(true);
                this.setVisible(false);
                usuario.borrar();
                start();
                break;
            case 2:
                tran= "ID:"+Integer.toString(usuario.ID)+" Serial:"+Integer.toString(usuario.Serial)+" Clase:Registraduria Tipo:Duplicado Datos:"+Integer.toString(usuario.Serial);
                System.out.println("Transacción de "+usuario.Nombre+"\n"+tran);
                JOptionPane.showMessageDialog(this,"Transacción Enviada");
                usuario.setVisible(true);
                this.setVisible(false);
                usuario.borrar();
                start();
                break;
            default:
                JOptionPane.showMessageDialog(this,"ERROR Seleccionar Transacción");
                break;
        }
    }//GEN-LAST:event_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Registraduria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registraduria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registraduria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registraduria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registraduria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JRadioButton Duplicado;
    private javax.swing.JRadioButton Primeravez;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
