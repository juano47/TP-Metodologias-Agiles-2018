/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Entidades.Licencia;
import Entidades.Titular;
import Gestores.GestorAdministrativo;
import static com.mchange.v2.c3p0.impl.C3P0Defaults.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import Gestores.GestorLicencias;

/**
 *
 * @author mueve el toto
 */
public class EmitirLicencia extends javax.swing.JFrame {
    Titular titular_aux;
    Connection conexion = null;
    PreparedStatement sentencia;
    String ruta="jdbc:mysql://sql141.main-hosting.eu:3306/u248270916_ma18";
    String driver="com.mysql.jdbc.Driver";
    String user="u248270916_admin";
    String pass="admin18";
    
    /**
     * Creates new form Inicio2
     */
    
    public EmitirLicencia() {
        //borrar todo cuando este listo el metodo de abajo
        initComponents();
        setTitle("Emitir Licencia");
        setLocationRelativeTo(null);
        //se pide al gestor y se muestra por pantalla los datos del administrativo registrado
        txt_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getUsername());
        txt_nombre_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getNombre() + " " + GestorAdministrativo.getInstance().getAdministrativo().getApellido());
        //borrar hasta aca
    }
    
    public EmitirLicencia(Titular titular) {
        titular_aux = titular; 
        initComponents();
        setTitle("Emitir Licencia");
        setLocationRelativeTo(null);
        //se pide al gestor y se muestra por pantalla los datos del administrativo registrado
        txt_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getUsername());
        txt_nombre_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getNombre() + " " + GestorAdministrativo.getInstance().getAdministrativo().getApellido());
   
        //se setean los datos no modificables (datos del titular)
        txt_nombre.setText((String.valueOf(titular.getNombre())));
        txt_apellido.setText((String.valueOf(titular.getApellido())));
        txt_nro_doc.setText((String.valueOf(titular.getDni())));
        txt_direccion.setText((String.valueOf(titular.getDomicilio())));
        txt_fecha_nac.setText((String.valueOf(titular.getFechaNac())));
        txt_tipo_doc.setText((String.valueOf(titular.getTipoDni())));
        txt_grupo_sanguineo.setText((String.valueOf(titular.getGrupoSanguineo())));
        txt_factor_sanguineo.setText((String.valueOf(titular.getFactorSanguineo())));
       
        
        
       // txt_grupo_sanguineo.setText((String.valueOf(titular.getGrupoSanguineo())));
       // txt_tipo_doc.setText((String.valueOf(titular.getTipoDoc())));
       // txt_nro_doc.setText((String.valueOf(titular.getNroDoc())));
       // txt_factor_sanguineo.setText((String.valueOf(titular.getFactorSanguineo())));
       // txt_fecha_nac.setText((String.valueOf(titular.getFechaNacimiento())));
       // txt_direccion.setText((String.valueOf(titular.getDireccion())));
       // clase
       // donante
       // observaciones
       
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_superior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_user = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_nombre_user = new javax.swing.JLabel();
        jPanel_inferior = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        boton_atras = new javax.swing.JButton();
        jPanel_izq = new javax.swing.JPanel();
        jPanel_der = new javax.swing.JPanel();
        jPanel_centro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        txt_tipo_doc = new javax.swing.JLabel();
        txt_fecha_nac = new javax.swing.JLabel();
        listaClase = new javax.swing.JComboBox<>();
        txt_apellido = new javax.swing.JLabel();
        txt_nro_doc = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JLabel();
        listaDonante = new javax.swing.JComboBox<>();
        txt_grupo_sanguineo = new javax.swing.JLabel();
        txt_factor_sanguineo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 525));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Emitir Licencia");

        jLabel8.setText("Usuario: ");

        txt_user.setText("jLabel9");

        jLabel15.setText("Nombre:");

        txt_nombre_user.setText("jLabel9");

        javax.swing.GroupLayout jPanel_superiorLayout = new javax.swing.GroupLayout(jPanel_superior);
        jPanel_superior.setLayout(jPanel_superiorLayout);
        jPanel_superiorLayout.setHorizontalGroup(
            jPanel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_superiorLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_user))
                    .addGroup(jPanel_superiorLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre_user)))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel_superiorLayout.setVerticalGroup(
            jPanel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_superiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_superiorLayout.createSequentialGroup()
                        .addGroup(jPanel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_user))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txt_nombre_user)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton2.setText("Finalizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        boton_atras.setText("Atrás");
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_inferiorLayout = new javax.swing.GroupLayout(jPanel_inferior);
        jPanel_inferior.setLayout(jPanel_inferiorLayout);
        jPanel_inferiorLayout.setHorizontalGroup(
            jPanel_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inferiorLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_inferiorLayout.setVerticalGroup(
            jPanel_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_inferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_inferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGap(0, 352, Short.MAX_VALUE)
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

        jLabel2.setText("Nombre");

        jLabel3.setText("Tipo Doc");

        jLabel4.setText("Fecha Nac.");

        jLabel5.setText("Clase");

        jLabel6.setText("Limitaciones/");

        jLabel7.setText("Observaciones");

        jLabel9.setText("Apellido");

        jLabel10.setText("N° Doc");

        jLabel11.setText("Dirección");

        jLabel12.setText("Donante");

        jLabel13.setText("Grupo Sanguineo");

        jLabel14.setText("Factor RH");

        txt_nombre.setText("jLabel15");
        txt_nombre.setName("li_nombre"); // NOI18N

        txt_tipo_doc.setText("jLabel15");

        txt_fecha_nac.setText("jLabel15");

        listaClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G" }));
        listaClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaClaseActionPerformed(evt);
            }
        });

        txt_apellido.setText("jLabel15");

        txt_nro_doc.setText("jLabel15");

        txt_direccion.setText("jLabel15");

        listaDonante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        listaDonante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDonanteActionPerformed(evt);
            }
        });

        txt_grupo_sanguineo.setText("jLabel15");

        txt_factor_sanguineo.setText("jLabel15");

        txt_observaciones.setColumns(20);
        txt_observaciones.setLineWrap(true);
        txt_observaciones.setRows(5);
        txt_observaciones.setToolTipText("");
        txt_observaciones.setWrapStyleWord(true);
        txt_observaciones.setName("li_nombre"); // NOI18N
        txt_observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_observacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txt_observaciones);

        javax.swing.GroupLayout jPanel_centroLayout = new javax.swing.GroupLayout(jPanel_centro);
        jPanel_centro.setLayout(jPanel_centroLayout);
        jPanel_centroLayout.setHorizontalGroup(
            jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_centroLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fecha_nac))
                            .addGroup(jPanel_centroLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_tipo_doc))
                            .addGroup(jPanel_centroLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nombre))
                            .addGroup(jPanel_centroLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listaClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(130, 130, 130)
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_centroLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(listaDonante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_centroLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_direccion))
                            .addGroup(jPanel_centroLayout.createSequentialGroup()
                                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_nro_doc))
                                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_apellido)))
                                .addGap(120, 120, 120)
                                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_factor_sanguineo)
                                    .addComponent(txt_grupo_sanguineo)))))
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel_centroLayout.setVerticalGroup(
            jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_centroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_tipo_doc))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_fecha_nac))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(listaClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_centroLayout.createSequentialGroup()
                                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(txt_apellido))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_nro_doc)))
                            .addGroup(jPanel_centroLayout.createSequentialGroup()
                                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txt_grupo_sanguineo))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(txt_factor_sanguineo))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_direccion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(listaDonante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel_centroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_centroLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_nombre.getAccessibleContext().setAccessibleName("li_nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_izq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_der, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
         Gestion obj = new Gestion();
            obj.setVisible(true);
            dispose();
    }//GEN-LAST:event_boton_atrasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Licencia licencia = new Licencia();
         licencia.setAdministrativo(GestorAdministrativo.getInstance().getAdministrativo());
         licencia.setTitular(titular_aux);
         String ls_clase = (String) listaClase.getSelectedItem();
         licencia.setClase(ls_clase);
         String ls_donante = (String) listaDonante.getSelectedItem();
         licencia.setDonante(ls_donante);
         licencia.setEstado("Original");
         String ls_observaciones = (String) txt_observaciones.getText();
         licencia.setObservaciones(ls_observaciones);
         licencia.setFechaRegistro();
         Date fecha_venc = GestorLicencias.calcularFechaLicencia(titular_aux.getFechaNac(), null);
         
        try { 
            Class.forName(driver);
            conexion=DriverManager.getConnection(ruta,user,pass);
            sentencia = conexion.prepareStatement("insert into Licencia values (?,?,?,?,?,?,?,?,?)");
            //IdTitular va a ser un contador que nunca se reinicie.
             int contador = 0000;
            
            sentencia.setInt(1,contador);
            sentencia.setString(2,txt_nombre.getText());
            sentencia.setString(3,txt_apellido.getText());
            sentencia.setString(4,txt_nro_doc.getText());
            sentencia.setString(5,txt_direccion.getText());
            sentencia.setString(6,txt_fecha_nac.getText());
            sentencia.setString(7,txt_tipo_doc.getText());
            sentencia.setString(8,txt_grupo_sanguineo.getText());
            sentencia.setString(9,txt_factor_sanguineo.getText());
            sentencia.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos Guardados con exito");
                 
            
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,e);}
          catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);}
         
         
                
        
           
     
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_observacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyTyped
        //se limita a 500 caracteres el campo observaciones
        if (txt_observaciones.getText().length()>= 500){

        evt.consume();
        JOptionPane.showMessageDialog(rootPane,"Alcanzo el maximo de caracteres (500 caracteres)");
        }
    }//GEN-LAST:event_txt_observacionesKeyTyped

    private void listaDonanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDonanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaDonanteActionPerformed

    private void listaClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaClaseActionPerformed

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
            java.util.logging.Logger.getLogger(EmitirLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmitirLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmitirLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmitirLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmitirLicencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel_centro;
    private javax.swing.JPanel jPanel_der;
    private javax.swing.JPanel jPanel_inferior;
    private javax.swing.JPanel jPanel_izq;
    private javax.swing.JPanel jPanel_superior;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JComboBox<String> listaClase;
    private javax.swing.JComboBox<String> listaDonante;
    private javax.swing.JLabel txt_apellido;
    private javax.swing.JLabel txt_direccion;
    private javax.swing.JLabel txt_factor_sanguineo;
    private javax.swing.JLabel txt_fecha_nac;
    private javax.swing.JLabel txt_grupo_sanguineo;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JLabel txt_nombre_user;
    private javax.swing.JLabel txt_nro_doc;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JLabel txt_tipo_doc;
    private javax.swing.JLabel txt_user;
    // End of variables declaration//GEN-END:variables
}
