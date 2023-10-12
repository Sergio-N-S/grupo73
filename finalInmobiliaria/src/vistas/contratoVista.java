/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Entidades.Contrato;
import Entidades.Inquilino;
import Entidades.Propiedad;
import accesoADatos.InquilinoData;
import accesoADatos.PropiedadData;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ULP
 */
public class contratoVista extends javax.swing.JInternalFrame {

    /**
     * Creates new form contratoVista
     */
    public contratoVista() {
        initComponents();
    }
    private Connection con;
    private Inquilino inquilinoSelec;
    private int idInquilinoSelec;
    private Propiedad propiedadSelec;
    private int idPropiedSelec;
    private Date fechaHoy;
    private String fechaFormateadaInicio;
    private String fechaFormateadaFinal;
    private Contrato contrato1;
    private Date fecha1;
    private Date fecha2;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textTel = new javax.swing.JTextField();
        textMarca = new javax.swing.JTextField();
        textVendedor = new javax.swing.JTextField();
        textVigencia = new javax.swing.JTextField();
        textGarante = new javax.swing.JTextField();
        textDni = new javax.swing.JTextField();
        comboInquilino = new javax.swing.JComboBox<>();
        comboPropiedad = new javax.swing.JComboBox<>();
        buscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        firmar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jdFecha1 = new com.toedter.calendar.JDateChooser();
        jdFecha2 = new com.toedter.calendar.JDateChooser();
        jlFecha1 = new javax.swing.JLabel();
        jlFecha2 = new javax.swing.JLabel();

        jLabel1.setText("Codigo de contrato");

        jLabel2.setText("Inquilino");

        jLabel3.setText("Propiedad");

        jLabel4.setText("Fecha Inicio");

        jLabel5.setText("Fecha Final");

        jLabel6.setText("Fecha de Realizacion");

        jLabel7.setText("Marca");

        jLabel8.setText("Vendedor");

        jLabel9.setText("Vigencia");

        jLabel10.setText("Garante");

        jLabel11.setText("DNI Garante");

        jLabel12.setText("Tel. Garante");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Contrato");

        comboInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboInquilinoActionPerformed(evt);
            }
        });

        comboPropiedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPropiedadActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");

        jButton2.setText("Nuevo");

        firmar.setText("Firmar");
        firmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");

        eliminar.setText("Eliminar");

        salir.setText("Salir");

        jdFecha1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFecha1PropertyChange(evt);
            }
        });

        jdFecha2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdFecha2PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(37, 37, 37)
                        .addComponent(firmar)
                        .addGap(33, 33, 33)
                        .addComponent(modificar)
                        .addGap(26, 26, 26)
                        .addComponent(eliminar)
                        .addGap(30, 30, 30)
                        .addComponent(salir)
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(229, 229, 229))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jdFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMarca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboInquilino, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboPropiedad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textVendedor, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textVigencia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textGarante, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textDni, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(buscar)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlFecha2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(21, 21, 21))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboPropiedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jdFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlFecha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textVigencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(firmar)
                    .addComponent(modificar)
                    .addComponent(eliminar)
                    .addComponent(salir))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // FECHA INICIO
    private void jdFecha1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFecha1PropertyChange
        // TODO add your handling code here:
        if (jdFecha1.getDate() != null) {
            // Obtener la fecha seleccionada del componente jdFecha y convertirla a Instant
            Instant instant = jdFecha1.getDate().toInstant();

            // Convertir Instant a Date utilizando la zona horaria del sistema por defecto
            fecha1 = Date.from(instant.atZone(ZoneId.systemDefault()).toInstant());

            // Formatear la fecha al formato deseado ("aaaa-MM-dd")
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            fechaFormateadaInicio = sdf.format(fecha1);

            // Establecer el texto del componente jlFecha con la fecha formateada
            //jlFecha1.setText(fechaFormateada);
        }


    }//GEN-LAST:event_jdFecha1PropertyChange

    // FECHA FINAL
    private void jdFecha2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdFecha2PropertyChange
        // TODO add your handling code here:
        if (jdFecha2.getDate() != null) {
            // Obtener la fecha seleccionada del componente jdFecha y convertirla a Instant
            Instant instant = jdFecha2.getDate().toInstant();

            // Convertir Instant a Date utilizando la zona horaria del sistema por defecto
            fecha2 = Date.from(instant.atZone(ZoneId.systemDefault()).toInstant());

            // Formatear la fecha al formato deseado ("aaaa-MM-dd")
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            fechaFormateadaFinal = sdf.format(fecha2);

            // Establecer el texto del componente jlFecha con la fecha formateada
            //jlFecha2.setText(fechaFormateada);
        }


    }//GEN-LAST:event_jdFecha2PropertyChange

    private void firmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmarActionPerformed
        //aca guardamos firmar contrato
        fechaHoy = new Date();
// TODO add your handling code here:
    }//GEN-LAST:event_firmarActionPerformed

    private void comboInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboInquilinoActionPerformed
        inquilinoSelec = (Inquilino) comboInquilino.getSelectedItem();
        idInquilinoSelec = inquilinoSelec.getId_Inquilino();

        // TODO add your handling code here:
    }//GEN-LAST:event_comboInquilinoActionPerformed

    private void comboPropiedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPropiedadActionPerformed
        propiedadSelec = (Propiedad) comboPropiedad.getSelectedItem();
        idPropiedSelec = propiedadSelec.getId_propiedad();
// TODO add your handling code here:
    }//GEN-LAST:event_comboPropiedadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<Inquilino> comboInquilino;
    private javax.swing.JComboBox<Propiedad> comboPropiedad;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton firmar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JDateChooser jdFecha1;
    private com.toedter.calendar.JDateChooser jdFecha2;
    private javax.swing.JLabel jlFecha1;
    private javax.swing.JLabel jlFecha2;
    private javax.swing.JButton modificar;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textDni;
    private javax.swing.JTextField textGarante;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textTel;
    private javax.swing.JTextField textVendedor;
    private javax.swing.JTextField textVigencia;
    // End of variables declaration//GEN-END:variables

    public void llenarComboPropiedad() {
        List<Propiedad> propiedades = new ArrayList<>();

        PropiedadData pd = new PropiedadData();
        propiedades = pd.listarPropiedad();

        for (Propiedad p1 : propiedades) {
            comboPropiedad.addItem(p1);

        }
    }

    public void llenarComboInquilino() {
        List<Inquilino> inquilinos = new ArrayList<>();

        InquilinoData ind = new InquilinoData();
        inquilinos = ind.listarinquilino();

        for (Inquilino in1 : inquilinos) {
            comboInquilino.addItem(in1);

        }
    }

    public Contrato crearContrato() {

        char marca = textMarca.getText().charAt(0);
        String vendendor = textVendedor.getText();
        String vigencia = textVigencia.getText();
        String garante = textGarante.getText();
        String dniGarante = textDni.getText();
        String telGarante = textTel.getText();
        boolean estado = true;

        contrato1 = new Contrato(inquilinoSelec, fecha2, fecha1, fechaHoy, marca, propiedadSelec, vendendor, estado, vigencia, garante, dniGarante, telGarante);
        System.out.println(contrato1);
        return contrato1;
    }
}
