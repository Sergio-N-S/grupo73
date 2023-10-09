
package vistas;

import Entidades.Inquilino;
import accesoADatos.InquilinoData;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class inquilinoVista extends javax.swing.JInternalFrame {

   
    public inquilinoVista() {
        initComponents();
        modificar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
    }

    private Connection con;
    Inquilino inquilino1;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textApe = new javax.swing.JTextField();
        textNom = new javax.swing.JTextField();
        textDni = new javax.swing.JTextField();
        textDetalle = new javax.swing.JTextField();
        textTipo = new javax.swing.JTextField();
        textCuit = new javax.swing.JTextField();
        textTel = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Inquilino");

        jLabel2.setText("Id_inquilino");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("DNI");

        jLabel6.setText("Detalle");

        jLabel7.setText("Tipo");

        jLabel8.setText("CUIT");

        jLabel9.setText("Telefono");

        textId.setEditable(false);
        textId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        nuevo.setText("Nuevo");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(258, 258, 258)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addGap(36, 36, 36)
                        .addComponent(guardar)
                        .addGap(36, 36, 36)
                        .addComponent(modificar)
                        .addGap(37, 37, 37)
                        .addComponent(eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel5))
                                    .addGap(59, 59, 59))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4))
                                    .addGap(53, 53, 53)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textApe, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addComponent(textNom)
                                .addComponent(textDni)
                                .addComponent(textDetalle)
                                .addComponent(textTipo)
                                .addComponent(textCuit)
                                .addComponent(textTel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscar)))
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(buscar)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo)
                    .addComponent(guardar)
                    .addComponent(modificar)
                    .addComponent(eliminar)
                    .addComponent(salir))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        buscar.setEnabled(false);
        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        guardar.setEnabled(true);
        textId.setText("");
        textApe.setText("");
        textNom.setText("");
        textDni.setText("");
        textDetalle.setText("");
        textTipo.setText("");
        textCuit.setText("");
        textTel.setText("");
        textApe.requestFocus();
    }//GEN-LAST:event_nuevoActionPerformed

    private void textIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        crearInquilino();
        System.out.println("Inquilino creado");
        InquilinoData idata = new InquilinoData();
        idata.guardarInquilino(inquilino1);
    }//GEN-LAST:event_guardarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        int idBorrar = Integer.parseInt(textId.getText());
        InquilinoData pd = new InquilinoData();
        pd.eliminarInquilino(idBorrar);

        textId.setText("");
        textApe.setText("");
        textNom.setText("");
        textDni.setText("");
        textDetalle.setText("");
        textTipo.setText("");
        textTel.setText("");
        nuevo.setEnabled(true);
        modificar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        guardar.setEnabled(false);

        String opciones = (JOptionPane.showInputDialog(null, "seleccione una opcion", "Buscar", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Buscar por id"}, "seleccion")).toString();

        switch (opciones) {

            case "Buscar por id":
                String id = JOptionPane.showInputDialog("Ingrese el id");

                int miId = Integer.parseInt(id);
                InquilinoData pd = new InquilinoData();
                inquilino1 = pd.buscarInquilinoPorID(miId);
                textId.setText(id);
                textApe.setText(inquilino1.getApellido());
                textNom.setText(inquilino1.getNombre()); //alumno1.getApellido());
                textDni.setText(String.valueOf(inquilino1.getDni()));
                textDetalle.setText(String.valueOf(inquilino1.getDetalle()));
                textTipo.setText(String.valueOf(inquilino1.getTipo()));
                textCuit.setText(inquilino1.getCuit());
                textTel.setText(inquilino1.getTelefono());
                break;
        }

        modificar.setEnabled(true);
        eliminar.setEnabled(true);
        nuevo.setEnabled(true);
        guardar.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        Inquilino inq = new Inquilino();
        InquilinoData id = new InquilinoData();
        inq.setId_Inquilino(Integer.parseInt(textId.getText()));
        inq.setApellido(textApe.getText());
        inq.setNombre(textNom.getText());
        inq.setDni(Integer.parseInt(textDni.getText()));
        String deta=textDetalle.getText();
        char deta1=deta.charAt(0);
        String ti=textTipo.getText();
        char tipo1=ti.charAt(0);
        inq.setDetalle(deta1);
        inq.setTipo(tipo1);
        inq.setCuit(textCuit.getText());
        inq.setTelefono(textTel.getText());
        inq.setEstado(true);

        id.modificarInquilino(inq);

        textId.setText("");
        textApe.setText("");
        textNom.setText("");
        textDni.setText("");
        textDetalle.setText("");
        textTipo.setText("");
        textCuit.setText("");
        textTel.setText("");
        
        nuevo.setEnabled(true);
        modificar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
// TODO add your handling code here:
    }//GEN-LAST:event_modificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textApe;
    private javax.swing.JTextField textCuit;
    private javax.swing.JTextField textDetalle;
    private javax.swing.JTextField textDni;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textNom;
    private javax.swing.JTextField textTel;
    private javax.swing.JTextField textTipo;
    // End of variables declaration//GEN-END:variables

    public Inquilino crearInquilino() {

        
        String apellido = textApe.getText();
        String nombre = textNom.getText();
        int dni = Integer.parseInt(textDni.getText());
        String detalle = textDetalle.getText();
        char deta = detalle.charAt(0);
        String tipo = textTipo.getText();
        char tipo1 = tipo.charAt(0);
        String cuit = textCuit.getText();
        String telefono = textTel.getText();
        boolean estado = true;

        inquilino1 = new Inquilino(apellido, nombre, dni, deta, tipo1, cuit, telefono, estado);
        System.out.println(inquilino1);
        return inquilino1;
    }
}
