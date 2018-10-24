/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Entidades.Titular;
import Entidades.TitularAuxParaTabla;
import Gestores.GestorAdministrativo;
import Gestores.GestorTitular;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mueve el toto
 */
public class GestionLicencias extends javax.swing.JFrame {

    CustomTableModel modeloTabla = new CustomTableModel();
    
    /**
     * Creates new form Inicio2
     */
    public GestionLicencias() {
        initComponents();
        setTitle("Gestión");
        setLocationRelativeTo(null);
        //se pide al gestor y se muestra por pantalla los datos del administrativo registrado
        txt_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getUsername());
        txt_nombre_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getNombre() + " " + GestorAdministrativo.getInstance().getAdministrativo().getApellido());
        tabla.setModel(modeloTabla);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_inferior = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel_izq = new javax.swing.JPanel();
        jPanel_der = new javax.swing.JPanel();
        jPanel_centro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        boton_buscar = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel_superior3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_user = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_nombre_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton2.setText("jButton1");

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_inferiorLayout = new javax.swing.GroupLayout(jPanel_inferior);
        jPanel_inferior.setLayout(jPanel_inferiorLayout);
        jPanel_inferiorLayout.setHorizontalGroup(
            jPanel_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inferiorLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel_inferiorLayout.setVerticalGroup(
            jPanel_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_izqLayout = new javax.swing.GroupLayout(jPanel_izq);
        jPanel_izq.setLayout(jPanel_izqLayout);
        jPanel_izqLayout.setHorizontalGroup(
            jPanel_izqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel_izqLayout.setVerticalGroup(
            jPanel_izqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_derLayout = new javax.swing.GroupLayout(jPanel_der);
        jPanel_der.setLayout(jPanel_derLayout);
        jPanel_derLayout.setHorizontalGroup(
            jPanel_derLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel_derLayout.setVerticalGroup(
            jPanel_derLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Apellido:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("DNI:");

        boton_buscar.setText("Buscar");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "DNI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(tabla);

        javax.swing.GroupLayout jPanel_centroLayout = new javax.swing.GroupLayout(jPanel_centro);
        jPanel_centro.setLayout(jPanel_centroLayout);
        jPanel_centroLayout.setHorizontalGroup(
            jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_centroLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel_centroLayout.setVerticalGroup(
            jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centroLayout.createSequentialGroup()
                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel3))
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_buscar))))
                .addGap(318, 318, 318))
            .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_centroLayout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(30, Short.MAX_VALUE)))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestión de Licencias");

        jLabel11.setText("Usuario: ");

        txt_user.setText("jLabel9");

        jLabel18.setText("Nombre:");

        txt_nombre_user.setText("jLabel9");

        javax.swing.GroupLayout jPanel_superior3Layout = new javax.swing.GroupLayout(jPanel_superior3);
        jPanel_superior3.setLayout(jPanel_superior3Layout);
        jPanel_superior3Layout.setHorizontalGroup(
            jPanel_superior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_superior3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_superior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_superior3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_user))
                    .addGroup(jPanel_superior3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre_user)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel_superior3Layout.setVerticalGroup(
            jPanel_superior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_superior3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_superior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_superior3Layout.createSequentialGroup()
                        .addGroup(jPanel_superior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_user))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_superior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txt_nombre_user)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_izq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_centro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_der, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel_superior3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_superior3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_izq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_der, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_centro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
       limpiarTabla(tabla,modeloTabla);    //se limpia la tabla para que al hacer busquedas consecutivas se borren los resultados anteriores
       String nombre = txt_nombre.getText();    
        String apellido = txt_apellido.getText();
        String dni = txt_dni.getText();
        
        if("".equals(nombre) && "".equals(apellido) && "".equals(dni)){ //no completo al menos un criterio de busqueda
            
            GestorTitular gestorTitular = GestorTitular.getInstance();     //se pide la instancia de GestorPuesto
            gestorTitular.buscarTitulares(modeloTabla);  //busca en la BS y completa la tabla que es pasada por parametro con los resultados
            
        }
    }//GEN-LAST:event_boton_buscarActionPerformed

    private void limpiarTabla(JTable tabla, CustomTableModel modeloTabla){
       for (int i = 0; i < tabla.getRowCount(); i++) {
           modeloTabla.deleteRow(i);
           i-=1;
       }
    }
    
    public class CustomTableModel extends AbstractTableModel {

        private ArrayList<TitularAuxParaTabla> data = new ArrayList<TitularAuxParaTabla>();
        private int numColumns = 4; //cant de columnas con la que se crea la tabla
        private String columnNames[] = {"Nombre", "Apellido", "DNI", "Clase"};   
        
        @Override
        public int getRowCount() {  
            
            return data.size();
        }

        @Override
        public int getColumnCount() { //construye la cantidad de columnas que se retorna

            return numColumns;
        }

        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }

        @Override
        public Class getColumnClass(int col) {
            //return classes[col];
            return String.class; //no cambiar a int u otra cosa porque pierde la propiedad de editable
        }

        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }

        @Override
        // Cambia el valor que contiene una determinada casilla de
        // la tabla
        public void setValueAt(Object value, int row, int col) {
            String c = (String)value;
            Integer valorNumerico = null;
            
            fireTableCellUpdated(row, col);
            // Indica que se ha cambiado
            //fireTableDataChanged();
        }
        

        public TitularAuxParaTabla getTitular(int fila) {
            return (TitularAuxParaTabla) data.get(fila);
        }

        public List<TitularAuxParaTabla> getListaTitulares() {
            return data;
        }


        @Override
        //este metodo muestra por pantalla los nombres pero en realidad se esta manejando una lista con Titulares por detras
        public Object getValueAt(int row, int col) {
            Object retorno=null;
            TitularAuxParaTabla t = (TitularAuxParaTabla) data.get(row);
            System.out.println("get: " + data.size()+ "\n");
            switch(col){
                case 0:
                    retorno= t.getNombre();
                    break;
                case 1:
                    retorno= t.getApellido();
                    break;
                case 2:
                    retorno= t.getDni();
                    break;
                case 3:
                    retorno=t.getClase();
            }
            return retorno;
        }

        public void addTitular(TitularAuxParaTabla titular) {
            data.add(titular);
            System.out.println("gestion: " + titular.getApellido() + "\n");
            fireTableDataChanged();
        }

        private void deleteRow(int row) {
            data.remove(row);
            
            fireTableDataChanged();
        }

    }
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
            java.util.logging.Logger.getLogger(GestionLicencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionLicencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionLicencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionLicencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionLicencias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel_centro;
    private javax.swing.JPanel jPanel_der;
    private javax.swing.JPanel jPanel_inferior;
    private javax.swing.JPanel jPanel_izq;
    private javax.swing.JPanel jPanel_superior3;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JLabel txt_nombre_user;
    private javax.swing.JLabel txt_user;
    // End of variables declaration//GEN-END:variables
}
