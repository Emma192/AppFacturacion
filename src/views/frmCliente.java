/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Clases.Cliente;
import Clases.ClienteDAO;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;


/**
 *
 * @author Reymond xD
 */
public class frmCliente extends javax.swing.JInternalFrame {

    ClienteDAO clienteDao;
   
    public frmCliente() {
        initComponents();
        this.setSize(632, 448);
        
        //this.setLocation(WIDTH, WIDTH);
        clienteDao = new ClienteDAO();
        cargarDatos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        winCliente = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Cbo_Fecha_Nac = new datechooser.beans.DateChooserCombo();
        jLabel10 = new javax.swing.JLabel();
        CboCategoria = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        rptClientes = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Identificación");

        jLabel2.setText("Apellido 1");

        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Telefono");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido 2");

        txtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Correo");

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        jLabel8.setText("Direccion");

        jLabel9.setText("Fecha Nacimiento");

        jLabel10.setText("Categoria");

        CboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...Elegir...", "Contado", "Credito" }));
        CboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboCategoriaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(236, 236, 236)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(CboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(Cbo_Fecha_Nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAceptar)
                        .addGap(35, 35, 35)
                        .addComponent(btnCancelar)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbo_Fecha_Nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout winClienteLayout = new javax.swing.GroupLayout(winCliente.getContentPane());
        winCliente.getContentPane().setLayout(winClienteLayout);
        winClienteLayout.setHorizontalGroup(
            winClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        winClienteLayout.setVerticalGroup(
            winClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(winClienteLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setVisible(true);
        getContentPane().setLayout(null);

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        btnGuardar.setText("Guardar");
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);

        btnEditar.setText("Editar");
        btnEditar.setFocusable(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditar);

        btnEliminar.setText("Eliminar");
        btnEliminar.setFocusable(false);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEliminar);

        btnSalir.setText("Salir");
        btnSalir.setFocusable(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSalir);

        jButton1.setText("Actualizar");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        rptClientes.setText("Imprimir Reporte");
        rptClientes.setFocusable(false);
        rptClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rptClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rptClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rptClientesActionPerformed(evt);
            }
        });
        jToolBar1.add(rptClientes);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(90, 20, 400, 64);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblCliente);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 110, 580, 205);

        lblTotal.setBackground(new java.awt.Color(0, 0, 0));
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total:  0");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(20, 330, 113, 26);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ggg.png"))); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(-10, -1, 630, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
      
        int fila = tblCliente.getSelectedRow();
        if (fila != -1) {
            winCliente.setTitle("Editar");
            winCliente.setSize(840, 450);
            txtId.setEditable(false);
            winCliente.setVisible(true);
            String indetificacion = tblCliente.getValueAt(fila, 0).toString();
            Cliente cliente = clienteDao.buscarCliente(indetificacion);
            txtId.setText(cliente.getidPersona());
            txtNombre.setText(cliente.getNombre());
            txtApellido1.setText(cliente.getApellido1());
            txtApellido2.setText(cliente.getApellido2());
            Date date = Date.valueOf(cliente.getFecha());
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            Cbo_Fecha_Nac.setSelectedDate(cal);
            txtTelefono.setText(cliente.getTelefono());
            txtCorreo.setText(cliente.getCorreo());
            txtDireccion.setText(cliente.getDireccion());
            CboCategoria.setSelectedItem(cliente.getCategoria());
        } else {

            JOptionPane.showMessageDialog(rootPane, "Elija el cliente a editar", "Editar", JOptionPane.ERROR_MESSAGE);

        }  // le falta un monto de codigo ! suave  
         
    }//GEN-LAST:event_btnEditarActionPerformed
    
    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void CboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CboCategoriaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        winCliente.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       
        String msgError = validarDatos();
        if (msgError.equals("")) {
            Cliente cliente = new Cliente();
            cliente.setidPersona(txtId.getText());
            cliente.setNombre(txtNombre.getText());
            cliente.setApellido1(txtApellido1.getText());
            cliente.setApellido2(txtApellido2.getText());
            String fechaNac = new SimpleDateFormat("dd/MM/yyyy").format(Cbo_Fecha_Nac.getSelectedDate().getTime());
            cliente.setFecha(fechaNac);
            cliente.setTelefono(txtTelefono.getText());
            cliente.setCorreo(txtCorreo.getText());
            cliente.setDireccion(txtDireccion.getText());
            cliente.setCategoria(CboCategoria.getSelectedItem().toString());
            if (winCliente.getTitle().equals("Guardar")) {
                if (clienteDao.buscarCliente(cliente.getidPersona()) == null) {
                    if (clienteDao.insertarClient(cliente)) {
                        cargarDatos();
                        JOptionPane.showMessageDialog(winCliente,
                                "Cliente guardaod exitosamente", "Guardar",
                                JOptionPane.INFORMATION_MESSAGE);
                        winCliente.dispose();
                    } else {
                        JOptionPane.showMessageDialog(winCliente,
                                "Error al intentar guardar ", "Guardar",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(winCliente, "Identificacion ya registrada",
                            "Guardar", JOptionPane.ERROR_MESSAGE);
                }

            } else {//Desea editar
                if (clienteDao.editarCliente(cliente)) {
                    cargarDatos();
                    JOptionPane.showMessageDialog(winCliente,
                            "Cliente editado exitosamente", "Editar",
                            JOptionPane.INFORMATION_MESSAGE);
                    winCliente.dispose();
                } else {
                    JOptionPane.showMessageDialog(winCliente,
                            "Error al intentar editar", "Editar",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {//Si hay errores
            JOptionPane.showMessageDialog(winCliente, msgError, "Guardar",
                    JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        int fila = tblCliente.getSelectedRow();
        if (fila != -1) {
            String identificacion = tblCliente.getValueAt(fila, 0).toString();
            int resp = JOptionPane.showConfirmDialog(rootPane, "Esta seguro que dessea eliminar a " + identificacion, "Eliminar", JOptionPane.YES_NO_OPTION);

            if (resp == JOptionPane.YES_OPTION) {
                if (clienteDao.eliminarCliente(identificacion)) {
                    JOptionPane.showMessageDialog(rootPane, "Eliminado");
                    cargarDatos();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "problemas...");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Seleccionar una fila a eliminar", "Eliminar", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        winCliente.setSize(670, 450);
        winCliente.setTitle("Guardar");
        winCliente.setVisible(true);
        txtId.setEditable(true);
        limpiarCampos();
    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      cargarDatos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rptClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rptClientesActionPerformed
       clienteDao.cargarReporteCategoria();
    }//GEN-LAST:event_rptClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboCategoria;
    private datechooser.beans.DateChooserCombo Cbo_Fecha_Nac;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JButton rptClientes;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JDialog winCliente;
    // End of variables declaration//GEN-END:variables


private void limpiarCampos(){

txtNombre.setText("");
txtApellido1.setText("");
txtApellido2.setText("");
txtCorreo.setText("");
txtTelefono.setText("");
CboCategoria.setSelectedIndex(0);


}

private void cargarDatos(){

        clienteDao.conectarBD();
        ResultSet rs = clienteDao.cargarClientes();

        if (rs != null) {
            tblCliente.setModel(clienteDao.cargarEnTabla(rs));
            lblTotal.setText("Total: " + tblCliente.getRowCount());
        }
        clienteDao.desconectarBD();
    }
private String validarDatos(){

    if(txtId.getText().trim().equals("")){
    txtId.requestFocus();//posociona el cursor en la casilla 
    return "La identificacion requerda es";
    }
    if(txtNombre.getText().trim().equals("")){
    txtNombre.requestFocus();//posociona el cursor en la casilla 
    return "El nombre es requerio ";
    }
    if(txtApellido1.getText().trim().equals("")){
    txtApellido1.requestFocus();//posociona el cursor en la casilla 
    return "El Apellido 1 es requerio ";
    }
    if(txtApellido2.getText().trim().equals("")){
    txtApellido2.requestFocus();//posociona el cursor en la casilla 
    return "El Apellido 2 es requerio ";
    }
    if(txtTelefono.getText().trim().equals("")){
    txtTelefono.requestFocus();//posociona el cursor en la casilla 
    return "Eltelefono es requerio ";
    }
    else{
    try{
    Integer.parseInt(txtTelefono.getText());
    }catch(NumberFormatException e){
    return "solo se admiten numeros";
    } 
    }
     if(txtCorreo.getText().trim().equals("")){
    txtCorreo.requestFocus();//posociona el cursor en la casilla 
    return "el Correo es requerio ";
    }else{
     if(!txtCorreo.getText().contains("@")){
    return"Formato de correo incorrecto";
    }
             }
      if(txtDireccion.getText().trim().equals("")){
    txtDireccion.requestFocus();//posociona el cursor en la casilla 
    return "La Direccion es requerida "; 
}
      if(CboCategoria.getSelectedIndex()==0){
          CboCategoria.requestFocus();
          CboCategoria.showPopup(); //se desplega la lista del combo box
          return "Por favor Elija categoria";

 
      }
      return "";
}



}