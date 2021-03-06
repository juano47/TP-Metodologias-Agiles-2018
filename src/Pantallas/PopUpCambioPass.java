package Pantallas;

import Entidades.Administrativo;
import Gestores.GestorAdministrativo;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Ignacio de la Iglesia
 */
public class PopUpCambioPass extends javax.swing.JFrame {

    /**
     * Creates new form PopUpCambioPass
     */
    public PopUpCambioPass() {
        initComponents();
        setTitle("Modificar contraseña");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        boton_confirmar = new javax.swing.JButton();
        txt_nuevo_pass = new javax.swing.JPasswordField();
        txt_repetir_pass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cambiar contraseña");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Usted a ingresado por primera vez al sistema,se le solicita elegir una nueva contraseña.");

        jLabel2.setText("Nueva contraseña:");

        jLabel3.setText("Repetir contraseña:");

        boton_confirmar.setText("Confirmar");
        boton_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_confirmarActionPerformed(evt);
            }
        });
        boton_confirmar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boton_confirmarKeyPressed(evt);
            }
        });

        txt_nuevo_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nuevo_passKeyPressed(evt);
            }
        });

        txt_repetir_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_repetir_passKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_nuevo_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(txt_repetir_pass))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_nuevo_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_repetir_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(boton_confirmar)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_confirmarActionPerformed
        String nuevo_pass = new String(txt_nuevo_pass.getPassword());
        String repetir_pass = new String(txt_repetir_pass.getPassword());
        
        
        if(nuevo_pass.equals("")){
            JOptionPane.showMessageDialog(null, "No ha ingresado ningún caracter", "Contraseña vacia", JOptionPane.ERROR_MESSAGE);
        }
        else if(nuevo_pass.toString().length() > 8){
            JOptionPane.showMessageDialog(null, "La contraseña debe tener como máximo 8 caracteres", "Límite de caracteres excedido", JOptionPane.ERROR_MESSAGE);
        }
        else if(!nuevo_pass.equals(repetir_pass)){
            JOptionPane.showMessageDialog(null, "Las contraseñas ingresadas no coinciden", "Contraseñas distintas", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            Administrativo administrativo = GestorAdministrativo.getInstance().getAdministrativo();
            administrativo.setPassword(nuevo_pass);
            administrativo.setUser_nuevo(0);
            GestorAdministrativo.getInstance().modificarAdministrativo(administrativo);
            JOptionPane.showMessageDialog(null, "Su contraseña ha sido modificada con exito");
            dispose();
        }
    }//GEN-LAST:event_boton_confirmarActionPerformed

    private void txt_nuevo_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nuevo_passKeyPressed
        //da al enter la misma accion que el click
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           boton_confirmarActionPerformed(null);
        }
    }//GEN-LAST:event_txt_nuevo_passKeyPressed

    private void txt_repetir_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_repetir_passKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           boton_confirmarActionPerformed(null);
        }
    }//GEN-LAST:event_txt_repetir_passKeyPressed

    private void boton_confirmarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boton_confirmarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           boton_confirmarActionPerformed(null);
        }
    }//GEN-LAST:event_boton_confirmarKeyPressed

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
            java.util.logging.Logger.getLogger(PopUpCambioPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpCambioPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpCambioPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpCambioPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpCambioPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPasswordField txt_nuevo_pass;
    private javax.swing.JPasswordField txt_repetir_pass;
    // End of variables declaration//GEN-END:variables
}
