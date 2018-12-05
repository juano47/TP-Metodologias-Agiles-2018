/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

import Dao.DaoLicencia;
import Dao.DaoTitular;
import Dao.DataAccessLayerException;
import Entidades.Licencia;
import Entidades.Titular;
import Entidades.TitularAuxParaTabla;
import Gestores.GestorAdministrativo;
import java.util.Date;
import javax.swing.JOptionPane;
import Gestores.GestorLicencias;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mueve el toto
 */
public class RenovarLicencia extends javax.swing.JFrame {
    TitularAuxParaTabla titular_aux;
    
    /**
     * Creates new form Inicio2
     */
    
    public RenovarLicencia() {
        //borrar todo cuando este listo el metodo de abajo
        initComponents();
        setTitle("Renovar Licencia");
        setLocationRelativeTo(null);
        //se pide al gestor y se muestra por pantalla los datos del administrativo registrado
        txt_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getUsername());
        txt_nombre_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getNombre() + " " + GestorAdministrativo.getInstance().getAdministrativo().getApellido());
        //borrar hasta aca
    }
    
    public RenovarLicencia(TitularAuxParaTabla titularAuxParaTabla) {
        titular_aux = titularAuxParaTabla; 
        initComponents();
        setTitle("Renovar Licencia");
        setLocationRelativeTo(null);
        //se pide al gestor y se muestra por pantalla los datos del administrativo registrado
        txt_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getUsername());
        txt_nombre_user.setText(GestorAdministrativo.getInstance().getAdministrativo().getNombre() + " " + GestorAdministrativo.getInstance().getAdministrativo().getApellido());
   
        //se setean los datos no modificables (datos del titular)
        txt_nombre.setText((String.valueOf(titularAuxParaTabla.getTitularOriginal().getNombre())));
        txt_apellido.setText((String.valueOf(titularAuxParaTabla.getTitularOriginal().getApellido())));
        txt_nro_doc.setText((String.valueOf(titularAuxParaTabla.getTitularOriginal().getDni())));
        txt_direccion.setText((String.valueOf(titularAuxParaTabla.getTitularOriginal().getDomicilio())));
        txt_fecha_nac.setText((String.valueOf(titularAuxParaTabla.getTitularOriginal().getFechaNac())));
        txt_fecha_venc.setText(String.valueOf(titularAuxParaTabla.getLicencia().getFechaVenc()));
        combo_tipo_doc.setSelectedItem((String.valueOf(titularAuxParaTabla.getTitularOriginal().getTipoDni())));
        combobox_grupo_sanguineo.setSelectedItem(String.valueOf(titularAuxParaTabla.getTitularOriginal().getGrupoSanguineo()));
        combobox_factor_sanguineo.setSelectedItem(String.valueOf(titularAuxParaTabla.getTitularOriginal().getFactorSanguineo()));
        txt_licencia.setText((String.valueOf(titularAuxParaTabla.getLicencia().getClase())));
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

        jPanel_superior = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_nombre_user = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txt_user = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel_centro = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        combo_tipo_doc = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_nro_doc = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_fecha_nac = new javax.swing.JFormattedTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txt_fecha_venc = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_licencia = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        combobox_grupo_sanguineo = new javax.swing.JComboBox<>();
        jPanel22 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        combobox_factor_sanguineo = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        listaDonante = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 100), new java.awt.Dimension(0, 100), new java.awt.Dimension(32767, 100));
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_observaciones = new javax.swing.JTextArea();
        jPanel_inferior = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        boton_atras = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        boton_emitir_licencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_superior.setMaximumSize(new java.awt.Dimension(1280, 100));
        jPanel_superior.setMinimumSize(new java.awt.Dimension(1280, 100));
        jPanel_superior.setPreferredSize(new java.awt.Dimension(1280, 100));
        jPanel_superior.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jPanel3.setMaximumSize(new java.awt.Dimension(250, 100));
        jPanel3.setMinimumSize(new java.awt.Dimension(250, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(250, 100));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel8.setText("Usuario: ");
        jPanel5.add(jLabel8, new java.awt.GridBagConstraints());

        txt_nombre_user.setText("jLabel9");
        jPanel5.add(txt_nombre_user, new java.awt.GridBagConstraints());

        jPanel3.add(jPanel5);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel15.setText("Nombre:");
        jPanel4.add(jLabel15, new java.awt.GridBagConstraints());

        txt_user.setText("jLabel9");
        jPanel4.add(txt_user, new java.awt.GridBagConstraints());

        jPanel3.add(jPanel4);

        jPanel_superior.add(jPanel3);

        jPanel2.setMaximumSize(new java.awt.Dimension(750, 100));
        jPanel2.setMinimumSize(new java.awt.Dimension(750, 100));
        jPanel2.setPreferredSize(new java.awt.Dimension(750, 100));
        jPanel2.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Renovar Licencia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel_superior.add(jPanel2);

        jPanel1.setMaximumSize(new java.awt.Dimension(250, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(250, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(250, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel_superior.add(jPanel1);

        jPanel_centro.setMaximumSize(new java.awt.Dimension(1280, 500));
        jPanel_centro.setMinimumSize(new java.awt.Dimension(1280, 500));
        jPanel_centro.setPreferredSize(new java.awt.Dimension(1280, 500));
        jPanel_centro.setLayout(new javax.swing.BoxLayout(jPanel_centro, javax.swing.BoxLayout.Y_AXIS));

        jPanel9.setMaximumSize(new java.awt.Dimension(1280, 400));
        jPanel9.setMinimumSize(new java.awt.Dimension(1280, 400));
        jPanel9.setPreferredSize(new java.awt.Dimension(1280, 400));
        jPanel9.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jPanel12.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel12.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel12.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.Y_AXIS));

        jPanel13.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel13.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel13.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel13.add(jLabel2);

        txt_nombre.setMaximumSize(new java.awt.Dimension(225, 30));
        txt_nombre.setMinimumSize(new java.awt.Dimension(225, 30));
        txt_nombre.setPreferredSize(new java.awt.Dimension(225, 30));
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel13.add(txt_nombre);

        jPanel12.add(jPanel13);

        jPanel14.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel14.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel14.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel14.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Apellido:");
        jLabel9.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel9.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel14.add(jLabel9);

        txt_apellido.setText("jTextField1");
        txt_apellido.setMaximumSize(new java.awt.Dimension(225, 30));
        txt_apellido.setMinimumSize(new java.awt.Dimension(225, 30));
        txt_apellido.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel14.add(txt_apellido);

        jPanel12.add(jPanel14);

        jPanel15.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel15.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel15.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo Doc:");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel15.add(jLabel3);

        combo_tipo_doc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "LC", "LE" }));
        combo_tipo_doc.setMaximumSize(new java.awt.Dimension(225, 30));
        combo_tipo_doc.setMinimumSize(new java.awt.Dimension(225, 30));
        combo_tipo_doc.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel15.add(combo_tipo_doc);

        jPanel12.add(jPanel15);

        jPanel16.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel16.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel16.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel16.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("N° Doc:");
        jLabel10.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel10.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel16.add(jLabel10);

        txt_nro_doc.setText("jTextField1");
        txt_nro_doc.setMaximumSize(new java.awt.Dimension(225, 30));
        txt_nro_doc.setMinimumSize(new java.awt.Dimension(225, 30));
        txt_nro_doc.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel16.add(txt_nro_doc);

        jPanel12.add(jPanel16);

        jPanel9.add(jPanel12);

        jPanel11.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel11.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel11.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.Y_AXIS));

        jPanel17.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel17.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel17.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Dirección:");
        jLabel11.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel11.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel17.add(jLabel11);

        txt_direccion.setText("jTextField1");
        txt_direccion.setMaximumSize(new java.awt.Dimension(225, 30));
        txt_direccion.setMinimumSize(new java.awt.Dimension(225, 30));
        txt_direccion.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel17.add(txt_direccion);

        jPanel11.add(jPanel17);

        jPanel18.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel18.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel18.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Fecha Nac.:");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel18.add(jLabel4);

        try {
            txt_fecha_nac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_fecha_nac.setMaximumSize(new java.awt.Dimension(225, 30));
        txt_fecha_nac.setMinimumSize(new java.awt.Dimension(225, 30));
        txt_fecha_nac.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel18.add(txt_fecha_nac);

        jPanel11.add(jPanel18);

        jPanel19.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel19.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel19.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Fecha Ven.:");
        jLabel16.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel16.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel16.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel19.add(jLabel16);

        txt_fecha_venc.setText("jLabel17");
        txt_fecha_venc.setMaximumSize(new java.awt.Dimension(225, 30));
        txt_fecha_venc.setMinimumSize(new java.awt.Dimension(225, 30));
        txt_fecha_venc.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel19.add(txt_fecha_venc);

        jPanel11.add(jPanel19);

        jPanel20.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel20.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel20.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Clase:");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel20.add(jLabel5);

        txt_licencia.setText("jLabel16");
        txt_licencia.setMaximumSize(new java.awt.Dimension(225, 30));
        txt_licencia.setMinimumSize(new java.awt.Dimension(225, 30));
        txt_licencia.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel20.add(txt_licencia);

        jPanel11.add(jPanel20);

        jPanel9.add(jPanel11);

        jPanel10.setMaximumSize(new java.awt.Dimension(400, 400));
        jPanel10.setMinimumSize(new java.awt.Dimension(400, 400));
        jPanel10.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.Y_AXIS));

        jPanel23.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel23.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel23.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Grupo San.:");
        jLabel13.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel13.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel23.add(jLabel13);

        combobox_grupo_sanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "0", "AB" }));
        combobox_grupo_sanguineo.setMaximumSize(new java.awt.Dimension(225, 30));
        combobox_grupo_sanguineo.setMinimumSize(new java.awt.Dimension(225, 30));
        combobox_grupo_sanguineo.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel23.add(combobox_grupo_sanguineo);

        jPanel10.add(jPanel23);

        jPanel22.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel22.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel22.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Factor RH:");
        jLabel14.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel14.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel14.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel22.add(jLabel14);

        combobox_factor_sanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));
        combobox_factor_sanguineo.setMaximumSize(new java.awt.Dimension(225, 30));
        combobox_factor_sanguineo.setMinimumSize(new java.awt.Dimension(225, 30));
        combobox_factor_sanguineo.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel22.add(combobox_factor_sanguineo);

        jPanel10.add(jPanel22);

        jPanel21.setMaximumSize(new java.awt.Dimension(400, 100));
        jPanel21.setMinimumSize(new java.awt.Dimension(400, 100));
        jPanel21.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Donante:");
        jLabel12.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel12.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel21.add(jLabel12);

        listaDonante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));
        listaDonante.setMaximumSize(new java.awt.Dimension(225, 30));
        listaDonante.setMinimumSize(new java.awt.Dimension(225, 30));
        listaDonante.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel21.add(listaDonante);

        jPanel10.add(jPanel21);
        jPanel10.add(filler1);

        jPanel9.add(jPanel10);

        jPanel_centro.add(jPanel9);

        jPanel8.setMaximumSize(new java.awt.Dimension(1280, 100));
        jPanel8.setMinimumSize(new java.awt.Dimension(1280, 100));
        jPanel8.setPreferredSize(new java.awt.Dimension(1280, 100));
        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        jLabel6.setText("Limitaciones/");
        jPanel8.add(jLabel6);

        jLabel7.setText("Observaciones");
        jPanel8.add(jLabel7);

        jScrollPane2.setMaximumSize(new java.awt.Dimension(350, 100));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(350, 100));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(350, 100));

        txt_observaciones.setColumns(20);
        txt_observaciones.setLineWrap(true);
        txt_observaciones.setRows(5);
        txt_observaciones.setToolTipText("");
        txt_observaciones.setWrapStyleWord(true);
        txt_observaciones.setMaximumSize(new java.awt.Dimension(500, 100));
        txt_observaciones.setMinimumSize(new java.awt.Dimension(500, 100));
        txt_observaciones.setName("li_nombre"); // NOI18N
        txt_observaciones.setPreferredSize(new java.awt.Dimension(500, 100));
        txt_observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_observacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txt_observaciones);

        jPanel8.add(jScrollPane2);

        jPanel_centro.add(jPanel8);

        jPanel_inferior.setMaximumSize(new java.awt.Dimension(1280, 100));
        jPanel_inferior.setMinimumSize(new java.awt.Dimension(1280, 100));
        jPanel_inferior.setPreferredSize(new java.awt.Dimension(1280, 100));
        jPanel_inferior.setLayout(new javax.swing.BoxLayout(jPanel_inferior, javax.swing.BoxLayout.X_AXIS));

        jPanel7.setMaximumSize(new java.awt.Dimension(640, 100));
        jPanel7.setMinimumSize(new java.awt.Dimension(640, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(640, 100));
        jPanel7.setLayout(new java.awt.GridBagLayout());

        boton_atras.setText("Atrás");
        boton_atras.setMaximumSize(new java.awt.Dimension(200, 50));
        boton_atras.setMinimumSize(new java.awt.Dimension(200, 50));
        boton_atras.setPreferredSize(new java.awt.Dimension(200, 50));
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 296, 36, 296);
        jPanel7.add(boton_atras, gridBagConstraints);

        jPanel_inferior.add(jPanel7);

        jPanel6.setMaximumSize(new java.awt.Dimension(640, 100));
        jPanel6.setMinimumSize(new java.awt.Dimension(640, 100));
        jPanel6.setPreferredSize(new java.awt.Dimension(640, 100));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        boton_emitir_licencia.setText("Finalizar");
        boton_emitir_licencia.setMaximumSize(new java.awt.Dimension(200, 50));
        boton_emitir_licencia.setMinimumSize(new java.awt.Dimension(200, 50));
        boton_emitir_licencia.setPreferredSize(new java.awt.Dimension(200, 50));
        boton_emitir_licencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_emitir_licenciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(35, 286, 36, 286);
        jPanel6.add(boton_emitir_licencia, gridBagConstraints);

        jPanel_inferior.add(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_inferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel_centro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_centro, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_inferior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        
        GestionLicencias obj = new GestionLicencias();
            obj.setVisible(true);
            dispose();
        
    }//GEN-LAST:event_boton_atrasActionPerformed

    private void boton_emitir_licenciaActionPerformed(java.awt.event.ActionEvent evt) {
        
        Titular renuevaTitu = titular_aux.getTitularOriginal();
        renuevaTitu.setAdministrativo(GestorAdministrativo.getInstance().getAdministrativo());
        renuevaTitu.setApellido(txt_apellido.getText());
        renuevaTitu.setDni(txt_nro_doc.getText());
        renuevaTitu.setDomicilio(txt_direccion.getText());
        renuevaTitu.setFactorSanguineo(combobox_factor_sanguineo.getSelectedItem().toString());
        renuevaTitu.setGrupoSanguineo(combobox_grupo_sanguineo.getSelectedItem().toString());
        renuevaTitu.setNombre(txt_nombre.getText());
        renuevaTitu.setTipoDni(combo_tipo_doc.getSelectedItem().toString());
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            renuevaTitu.setFechaNac(format.parse(txt_fecha_nac.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(RenovarLicencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        renuevaTitu.setFechaUltimaActualizacion(new Date());
        
        Licencia renovada = titular_aux.getLicencia();
        renovada.setAdministrativo(GestorAdministrativo.getInstance().getAdministrativo());
        renovada.setDonante(listaDonante.getSelectedItem().toString());
        renovada.setFechaVenc(GestorLicencias.calcularFechaLicencia(titular_aux.getTitularOriginal().getFechaNac(), null));
       
        DaoLicencia daoLicencia = new DaoLicencia();
        DaoTitular daoTitular = new DaoTitular();
        try{
                daoTitular.update(renuevaTitu);
                System.out.print("Se guardo bien el titular!");
            }
            catch(DataAccessLayerException e){
                System.out.print(e);
            }
            finally{
                try{
                    daoLicencia.update(renovada);
                    System.out.print("Se guardo bien la licencia!");
                    GestorLicencias.imprimirLicencia(renovada);
                    GestionLicencias pantalla = new GestionLicencias();
                    pantalla.setVisible(true);
                    dispose();
                }
                catch(DataAccessLayerException e){
                    System.out.print(e);
                }
            }
    }                                                     

    private void txt_observacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_observacionesKeyTyped
        //se limita a 500 caracteres el campo observaciones
        if (txt_observaciones.getText().length()>= 500){

        evt.consume();
        JOptionPane.showMessageDialog(rootPane,"Alcanzo el maximo de caracteres (500 caracteres)");
        }
    }//GEN-LAST:event_txt_observacionesKeyTyped

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(RenovarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RenovarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RenovarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RenovarLicencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RenovarLicencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton boton_emitir_licencia;
    private javax.swing.JComboBox<String> combo_tipo_doc;
    private javax.swing.JComboBox<String> combobox_factor_sanguineo;
    private javax.swing.JComboBox<String> combobox_grupo_sanguineo;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel_centro;
    private javax.swing.JPanel jPanel_inferior;
    private javax.swing.JPanel jPanel_superior;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listaDonante;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JFormattedTextField txt_fecha_nac;
    private javax.swing.JLabel txt_fecha_venc;
    private javax.swing.JLabel txt_licencia;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JLabel txt_nombre_user;
    private javax.swing.JTextField txt_nro_doc;
    private javax.swing.JTextArea txt_observaciones;
    private javax.swing.JLabel txt_user;
    // End of variables declaration//GEN-END:variables
}
