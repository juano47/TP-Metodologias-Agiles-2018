package Pantallas;

import Dao.DaoLicencia;
import Entidades.Titular;
import Entidades.TitularAuxParaTabla;
import Gestores.GestorAdministrativo;
import Gestores.GestorLicencias;
import Gestores.GestorTitular;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Juan Ignacio de la Iglesia
 */
public class GestionLicencias extends javax.swing.JFrame {

    TablaModeloTitular modeloTabla = new TablaModeloTitular();
    
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel_superior3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_user = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_nombre_user = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel_centro = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 0), new java.awt.Dimension(25, 32767));
        jLabel3 = new javax.swing.JLabel();
        txt_dni = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(250, 0), new java.awt.Dimension(250, 0), new java.awt.Dimension(250, 0));
        boton_buscar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        boton_emitir_licencia = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        boton_modificar_titular = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        boton_nuevo_titular = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jButton1 = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jButton3 = new javax.swing.JButton();
        jPanel_inferior = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        boton_atras = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(150, 0), new java.awt.Dimension(150, 0), new java.awt.Dimension(150, 0));
        txt_mensaje_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel_superior3.setMaximumSize(new java.awt.Dimension(1280, 120));
        jPanel_superior3.setMinimumSize(new java.awt.Dimension(1280, 120));
        jPanel_superior3.setPreferredSize(new java.awt.Dimension(1280, 120));
        jPanel_superior3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jPanel2.setMaximumSize(new java.awt.Dimension(250, 120));
        jPanel2.setMinimumSize(new java.awt.Dimension(250, 120));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 120));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setMaximumSize(new java.awt.Dimension(250, 60));
        jPanel5.setMinimumSize(new java.awt.Dimension(250, 60));
        jPanel5.setPreferredSize(new java.awt.Dimension(250, 60));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel11.setText("Usuario: ");
        jPanel5.add(jLabel11, new java.awt.GridBagConstraints());

        txt_user.setText("jLabel9");
        txt_user.setMaximumSize(new java.awt.Dimension(150, 17));
        txt_user.setMinimumSize(new java.awt.Dimension(150, 17));
        txt_user.setPreferredSize(new java.awt.Dimension(150, 17));
        jPanel5.add(txt_user, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel18.setText("Nombre:");
        jPanel4.add(jLabel18, new java.awt.GridBagConstraints());

        txt_nombre_user.setText("jLabel9");
        txt_nombre_user.setMaximumSize(new java.awt.Dimension(150, 17));
        txt_nombre_user.setMinimumSize(new java.awt.Dimension(150, 17));
        txt_nombre_user.setPreferredSize(new java.awt.Dimension(150, 17));
        jPanel4.add(txt_nombre_user, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel4);

        jPanel_superior3.add(jPanel2);

        jPanel1.setMaximumSize(new java.awt.Dimension(700, 120));
        jPanel1.setMinimumSize(new java.awt.Dimension(700, 120));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 120));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestión de Licencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 164, 39, 165);
        jPanel1.add(jLabel4, gridBagConstraints);

        jPanel_superior3.add(jPanel1);

        jPanel3.setMaximumSize(new java.awt.Dimension(250, 120));
        jPanel3.setMinimumSize(new java.awt.Dimension(250, 120));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 120));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        jPanel_superior3.add(jPanel3);

        getContentPane().add(jPanel_superior3);

        jPanel_centro.setMaximumSize(new java.awt.Dimension(1280, 500));
        jPanel_centro.setMinimumSize(new java.awt.Dimension(1280, 500));
        jPanel_centro.setPreferredSize(new java.awt.Dimension(1280, 500));
        jPanel_centro.setRequestFocusEnabled(false);
        jPanel_centro.setLayout(new javax.swing.BoxLayout(jPanel_centro, javax.swing.BoxLayout.Y_AXIS));

        jPanel8.setMaximumSize(new java.awt.Dimension(1280, 70));
        jPanel8.setMinimumSize(new java.awt.Dimension(1280, 70));
        jPanel8.setPreferredSize(new java.awt.Dimension(1280, 70));
        jPanel8.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Apellido:");
        jPanel8.add(jLabel1, new java.awt.GridBagConstraints());

        txt_nombre.setMaximumSize(new java.awt.Dimension(200, 27));
        txt_nombre.setMinimumSize(new java.awt.Dimension(200, 27));
        txt_nombre.setPreferredSize(new java.awt.Dimension(200, 27));
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreKeyPressed(evt);
            }
        });
        jPanel8.add(txt_nombre, new java.awt.GridBagConstraints());
        jPanel8.add(filler2, new java.awt.GridBagConstraints());

        jLabel2.setText("Nombre:");
        jPanel8.add(jLabel2, new java.awt.GridBagConstraints());

        txt_apellido.setMaximumSize(new java.awt.Dimension(200, 27));
        txt_apellido.setMinimumSize(new java.awt.Dimension(200, 27));
        txt_apellido.setPreferredSize(new java.awt.Dimension(200, 27));
        txt_apellido.setRequestFocusEnabled(false);
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyPressed(evt);
            }
        });
        jPanel8.add(txt_apellido, new java.awt.GridBagConstraints());
        jPanel8.add(filler3, new java.awt.GridBagConstraints());

        jLabel3.setText("DNI:");
        jPanel8.add(jLabel3, new java.awt.GridBagConstraints());

        txt_dni.setMaximumSize(new java.awt.Dimension(200, 27));
        txt_dni.setMinimumSize(new java.awt.Dimension(200, 27));
        txt_dni.setPreferredSize(new java.awt.Dimension(200, 27));
        txt_dni.setRequestFocusEnabled(false);
        txt_dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_dniKeyPressed(evt);
            }
        });
        jPanel8.add(txt_dni, new java.awt.GridBagConstraints());
        jPanel8.add(filler1, new java.awt.GridBagConstraints());

        boton_buscar.setText("Buscar");
        boton_buscar.setMaximumSize(new java.awt.Dimension(100, 29));
        boton_buscar.setMinimumSize(new java.awt.Dimension(100, 29));
        boton_buscar.setPreferredSize(new java.awt.Dimension(100, 29));
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });
        boton_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boton_buscarKeyPressed(evt);
            }
        });
        jPanel8.add(boton_buscar, new java.awt.GridBagConstraints());

        jPanel_centro.add(jPanel8);

        jPanel7.setMaximumSize(new java.awt.Dimension(1280, 350));
        jPanel7.setMinimumSize(new java.awt.Dimension(1280, 350));
        jPanel7.setPreferredSize(new java.awt.Dimension(1280, 350));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

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

        jPanel7.add(jScrollPane13);

        jPanel_centro.add(jPanel7);

        jPanel6.setLayout(new java.awt.GridBagLayout());

        boton_emitir_licencia.setText("Emitir Licencia");
        boton_emitir_licencia.setMaximumSize(new java.awt.Dimension(175, 40));
        boton_emitir_licencia.setMinimumSize(new java.awt.Dimension(175, 40));
        boton_emitir_licencia.setPreferredSize(new java.awt.Dimension(175, 40));
        boton_emitir_licencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_emitir_licenciaActionPerformed(evt);
            }
        });
        boton_emitir_licencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boton_emitir_licenciaKeyPressed(evt);
            }
        });
        jPanel6.add(boton_emitir_licencia, new java.awt.GridBagConstraints());
        jPanel6.add(filler4, new java.awt.GridBagConstraints());

        boton_modificar_titular.setText("Modificar Titular");
        boton_modificar_titular.setMaximumSize(new java.awt.Dimension(175, 40));
        boton_modificar_titular.setMinimumSize(new java.awt.Dimension(175, 40));
        boton_modificar_titular.setPreferredSize(new java.awt.Dimension(175, 40));
        boton_modificar_titular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificar_titularActionPerformed(evt);
            }
        });
        boton_modificar_titular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boton_modificar_titularKeyPressed(evt);
            }
        });
        jPanel6.add(boton_modificar_titular, new java.awt.GridBagConstraints());
        jPanel6.add(filler5, new java.awt.GridBagConstraints());

        boton_nuevo_titular.setText("Crear Nuevo Titular");
        boton_nuevo_titular.setMaximumSize(new java.awt.Dimension(175, 40));
        boton_nuevo_titular.setMinimumSize(new java.awt.Dimension(175, 40));
        boton_nuevo_titular.setPreferredSize(new java.awt.Dimension(175, 40));
        boton_nuevo_titular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevo_titularActionPerformed(evt);
            }
        });
        jPanel6.add(boton_nuevo_titular, new java.awt.GridBagConstraints());
        jPanel6.add(filler6, new java.awt.GridBagConstraints());

        jButton1.setText("Renovar Licencia");
        jButton1.setMaximumSize(new java.awt.Dimension(175, 40));
        jButton1.setMinimumSize(new java.awt.Dimension(175, 40));
        jButton1.setPreferredSize(new java.awt.Dimension(175, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_renovar_licenciaActionPermirmed(evt);
            }
        });
        jPanel6.add(jButton1, new java.awt.GridBagConstraints());
        jPanel6.add(filler7, new java.awt.GridBagConstraints());

        jButton3.setText("Emitir Copia");
        jButton3.setMaximumSize(new java.awt.Dimension(175, 40));
        jButton3.setMinimumSize(new java.awt.Dimension(175, 40));
        jButton3.setPreferredSize(new java.awt.Dimension(175, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_copiaActionPreformed(evt);
            }
        });
        jPanel6.add(jButton3, new java.awt.GridBagConstraints());

        jPanel_centro.add(jPanel6);

        getContentPane().add(jPanel_centro);

        jPanel_inferior.setMaximumSize(new java.awt.Dimension(1280, 100));
        jPanel_inferior.setMinimumSize(new java.awt.Dimension(1280, 100));
        jPanel_inferior.setPreferredSize(new java.awt.Dimension(1280, 100));

        jPanel9.setLayout(new java.awt.GridBagLayout());

        boton_atras.setText("Atras");
        boton_atras.setMaximumSize(new java.awt.Dimension(175, 40));
        boton_atras.setMinimumSize(new java.awt.Dimension(175, 40));
        boton_atras.setPreferredSize(new java.awt.Dimension(175, 40));
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });
        boton_atras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                boton_atrasKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 30, 0);
        jPanel9.add(boton_atras, gridBagConstraints);

        jPanel_inferior.add(jPanel9);
        jPanel_inferior.add(filler8);

        txt_mensaje_error.setForeground(new java.awt.Color(255, 0, 0));
        txt_mensaje_error.setPreferredSize(new java.awt.Dimension(600, 50));
        jPanel_inferior.add(txt_mensaje_error);

        getContentPane().add(jPanel_inferior);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        Gestion obj = new Gestion();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_atrasActionPerformed

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        //borro resultados anteriores al hacer busquedas sucesivas
        limpiarTabla(tabla, modeloTabla);
        txt_mensaje_error.setText("");
        //obtengo los datos ingresados en los filtros de busqueda
        String nombre = txt_nombre.getText();    
        String apellido = txt_apellido.getText();
        String dni = txt_dni.getText();
        
        GestorTitular gestorTitular = GestorTitular.getInstance(); //se pide la instancia de GestorTitular
        List<TitularAuxParaTabla> listaTitularAux= new ArrayList<TitularAuxParaTabla>();
        if("".equals(nombre) && "".equals(apellido) && "".equals(dni)){ //no completo al menos un criterio de busqueda, se buscan todos los titulares  
            listaTitularAux = gestorTitular.buscarTitulares();  //busca en la BS y pasa una lista con TODOS los titulares
            modeloTabla.addAllTitulares(listaTitularAux);
        }
        else{
            listaTitularAux = gestorTitular.buscarTitulares(nombre, apellido, dni);  //busca en la BS y pasa una lista con los titulares filtrados
            modeloTabla.addAllTitulares(listaTitularAux);
        }
        
        if(modeloTabla.getListaTitularesAux().size()==0)
            txt_mensaje_error.setText("No se encontraron registros");
    }//GEN-LAST:event_boton_buscarActionPerformed

    private void boton_emitir_licenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_emitir_licenciaActionPerformed
       //http://www.lawebdelprogramador.com/foros/Java/719076-Obtener-el-valor-de-una-celda-el-JTABLE.html
       Integer filaSeleccionada= tabla.getSelectedRow();
       //si no hay una fila seleccionada filaSeleccionada= -1 por default
        if (filaSeleccionada != -1) {
            TitularAuxParaTabla titularAuxParaTabla = modeloTabla.getTitularAuxParaTabla(tabla.getSelectedRow());
            EmitirLicencia obj = new EmitirLicencia(titularAuxParaTabla);
            obj.setVisible(true);
            dispose();
       }
        else{
            txt_mensaje_error.setText("Seleccione el titular al cual desea emitir una licencia"); 
        }
    }//GEN-LAST:event_boton_emitir_licenciaActionPerformed

    private void txt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           boton_buscarActionPerformed(null);
        }
    }//GEN-LAST:event_txt_nombreKeyPressed

    private void txt_apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           boton_buscarActionPerformed(null);
        }
    }//GEN-LAST:event_txt_apellidoKeyPressed

    private void txt_dniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           boton_buscarActionPerformed(null);
        }
    }//GEN-LAST:event_txt_dniKeyPressed

    private void boton_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boton_buscarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           boton_buscarActionPerformed(null);
        }
    }//GEN-LAST:event_boton_buscarKeyPressed

    private void boton_emitir_licenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boton_emitir_licenciaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           boton_emitir_licenciaActionPerformed(null);
        }
    }//GEN-LAST:event_boton_emitir_licenciaKeyPressed

    private void boton_atrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boton_atrasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
           boton_atrasActionPerformed(null);
        }
    }//GEN-LAST:event_boton_atrasKeyPressed

    private void boton_modificar_titularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificar_titularActionPerformed
        Integer filaSeleccionada= tabla.getSelectedRow();
       //si no hay una fila seleccionada filaSeleccionada= -1 por default
        if (filaSeleccionada != -1) {
            TitularAuxParaTabla titularAuxParaTabla = modeloTabla.getTitularAuxParaTabla(tabla.getSelectedRow());
            Titular titular = titularAuxParaTabla.getTitularOriginal();
            ModificarTitular obj = new ModificarTitular(titular);
            obj.setVisible(true);
            dispose();
       }
        else{
            txt_mensaje_error.setText("Seleccione el titular al cual desea modificar"); 
        }
    }//GEN-LAST:event_boton_modificar_titularActionPerformed

    private void boton_modificar_titularKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boton_modificar_titularKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_modificar_titularKeyPressed

    private void boton_nuevo_titularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevo_titularActionPerformed
        NuevoTitular obj = new NuevoTitular();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_nuevo_titularActionPerformed

    private void boton_renovar_licenciaActionPermirmed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_renovar_licenciaActionPermirmed
        // TODO add your handling code here:
        Integer filaSeleccionada= tabla.getSelectedRow();
       if (filaSeleccionada != -1) {
            TitularAuxParaTabla titularAuxParaTabla = modeloTabla.getTitularAuxParaTabla(tabla.getSelectedRow());
            RenovarLicencia obj = new RenovarLicencia(titularAuxParaTabla);
            obj.setVisible(true);
            dispose();
       }
        else{
            txt_mensaje_error.setText("Seleccione el titular al cual desea emitir una licencia"); 
        }
    }//GEN-LAST:event_boton_renovar_licenciaActionPermirmed

    private void boton_copiaActionPreformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_copiaActionPreformed
        //TODO  code here:
        
       Integer filaSeleccionada= tabla.getSelectedRow();
       if (filaSeleccionada != -1) {
           TitularAuxParaTabla titularAuxParaTabla = modeloTabla.getTitularAuxParaTabla(tabla.getSelectedRow());
           if(GestorLicencias.realizarCopia(titularAuxParaTabla.getLicencia())){
               String sEstado_old = titularAuxParaTabla.getLicencia().getEstado();
               int iCopia = obtenerNumeroCopia(sEstado_old) + 1;
               String sMensaje = "Realmente deséa crear una nueva copia de la Licencia de "+ titularAuxParaTabla.getTitularOriginal().getApellido() + ", " + titularAuxParaTabla.getTitularOriginal().getNombre() + " la misma será la número: " + iCopia + ".";
               if(JOptionPane.showConfirmDialog(null,sMensaje, "Confirmar Acción", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
                    titularAuxParaTabla.getLicencia().setEstado("Copia Numero: " + iCopia);
                    titularAuxParaTabla.getLicencia().setAdministrativo(GestorAdministrativo.getInstance().getAdministrativo());
                    DaoLicencia lic = new DaoLicencia();
                    lic.update( titularAuxParaTabla.getLicencia());
                    GestorLicencias.imprimirLicencia(titularAuxParaTabla.getLicencia());
               }
           }
           else{
               txt_mensaje_error.setText("Ésta licencia no está en Vigencia, deberá renovarla.");
           }
       }
        
           else{
            txt_mensaje_error.setText("Seleccione el titular al cual desea crear una copia"); 
        }
       
       
    }//GEN-LAST:event_boton_copiaActionPreformed

    private void limpiarTabla(JTable tabla, TablaModeloTitular modeloTabla){
       modeloTabla.deleteAllTitulares();
    }

    private int obtenerNumeroCopia(String sEstado_old) {
        int iResultado = 0;
        if(sEstado_old.equals("Original")){
            iResultado = 0;
        }
        else{
            int iTamanio = sEstado_old.length();
            int iDiferencia = iTamanio - 14;
            String sNumero = sEstado_old.charAt(iTamanio - iDiferencia)+"";
            iResultado = Integer.parseInt(sNumero);
        }
        return iResultado;
    }
    
    public class TablaModeloTitular extends AbstractTableModel {

    private String[] columnNames = {"Nombre", "Apellido","DNI", "Clase Licencia", "Estado", "Vigencia", "Registrada"};
    private List<TitularAuxParaTabla> data = new ArrayList<TitularAuxParaTabla>();

    public void addTitular(TitularAuxParaTabla titularAuxParaTabla) {
        data.add(titularAuxParaTabla);
        fireTableDataChanged();
    }
    
     public void addAllTitulares(List<TitularAuxParaTabla> listaTitularAuxParaTabla ) {
        data.addAll(listaTitularAuxParaTabla);
        fireTableDataChanged();
    }

    public void deleteTitular(int rowIndex) {
        data.remove(rowIndex);
        fireTableDataChanged();
    }
    
    public void deleteAllTitulares() {
        data.clear();
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return data.get(rowIndex).getTitularOriginal().getNombre();
            case 1:
                return data.get(rowIndex).getTitularOriginal().getApellido();
            case 2:
                return data.get(rowIndex).getTitularOriginal().getDni();
            case 3:
                if(data.get(rowIndex).getLicencia() == null)
                    return " ";
                else
                    return data.get(rowIndex).getLicencia().getClase();
            case 4:
                if(data.get(rowIndex).getLicencia() == null)
                    return " ";
                else
                return data.get(rowIndex).getLicencia().getEstado();
            case 5: 
                if(data.get(rowIndex).getLicencia() == null)
                    return " ";
                else
                return data.get(rowIndex).getLicencia().getFechaVenc();
            case 6: 
                if(data.get(rowIndex).getLicencia() == null)
                    return " ";
                else
                return data.get(rowIndex).getLicencia().getFechaRegistro();
            default:
                return null;
        }
    }
    
    public TitularAuxParaTabla getTitularAuxParaTabla(int fila) {
            return (TitularAuxParaTabla) data.get(fila);
        }

    @Override
    public Class getColumnClass(int columnIndex) {
//        return getValueAt(0, columnIndex).getClass();
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        
    }
    
    public List<TitularAuxParaTabla> getListaTitularesAux() {
            return data;
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
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_emitir_licencia;
    private javax.swing.JButton boton_modificar_titular;
    private javax.swing.JButton boton_nuevo_titular;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_centro;
    private javax.swing.JPanel jPanel_inferior;
    private javax.swing.JPanel jPanel_superior3;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JLabel txt_mensaje_error;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JLabel txt_nombre_user;
    private javax.swing.JLabel txt_user;
    // End of variables declaration//GEN-END:variables
}
