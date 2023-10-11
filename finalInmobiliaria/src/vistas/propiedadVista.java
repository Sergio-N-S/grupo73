package vistas;

import Entidades.Propiedad;
import Entidades.Propietario;
import accesoADatos.PropiedadData;
import accesoADatos.PropietarioData;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class propiedadVista extends javax.swing.JInternalFrame {

    public propiedadVista() {
        initComponents();
        llenarCombo();

    }
    private Connection con;
    Propietario propietarioSelect;
    Propiedad propiedad1;
    int idProSelect;
    private boolean si;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        textAcce = new javax.swing.JTextField();
        textDire = new javax.swing.JTextField();
        comboPropietario = new javax.swing.JComboBox<>();
        textForma = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        textRevisor = new javax.swing.JTextField();
        textSuper = new javax.swing.JTextField();
        textTipo = new javax.swing.JTextField();
        textZona = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Propiedad");

        jLabel2.setText("Legajo Propiedad");

        jLabel3.setText("Accesibilidad");

        jLabel4.setText("Direccion");

        jLabel5.setText("Propietario");

        jLabel7.setText("Forma");

        jLabel8.setText("Precio");

        jLabel9.setText("Revisor");

        jLabel10.setText("Superficie Minima");

        jLabel11.setText("Tipo de propiedad");

        jLabel12.setText("Zona");

        textId.setEditable(false);

        comboPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPropietarioActionPerformed(evt);
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
                .addGap(31, 31, 31)
                .addComponent(nuevo)
                .addGap(38, 38, 38)
                .addComponent(guardar)
                .addGap(42, 42, 42)
                .addComponent(modificar)
                .addGap(43, 43, 43)
                .addComponent(eliminar)
                .addGap(27, 27, 27)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jLabel12)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textAcce, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textDire, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textRevisor, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textSuper, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textForma, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(14, 14, 14)
                            .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textZona, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAcce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(textRevisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(textSuper, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(textZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_salirActionPerformed

    private void comboPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPropietarioActionPerformed
        propietarioSelect = (Propietario) comboPropietario.getSelectedItem();
        idProSelect = propietarioSelect.getId_propietario();
        System.out.println(idProSelect);

        // TODO add your handling code here:
    }//GEN-LAST:event_comboPropietarioActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed

        crearPropiedad();
        PropiedadData pd = new PropiedadData();
        pd.guardarPropiedad(propiedad1);
        textAcce.setText("");
        textDire.setText("");
        textForma.setText("");
        textPrecio.setText("");
        textRevisor.setText("");
        textSuper.setText("");
        textTipo.setText("");
        textZona.setText("");

        modificar.setEnabled(false);
        eliminar.setEnabled(false);
        guardar.setEnabled(false);

    }//GEN-LAST:event_guardarActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
//        llenarCombo();
        textId.setText("");
        textAcce.setText("");
        textDire.setText("");
        textForma.setText("");
        textPrecio.setText("");
        textRevisor.setText("");
        textSuper.setText("");
        textTipo.setText("");
        textZona.setText("");
        textAcce.requestFocus();
        // TODO add your handling code here:
        buscar.setVisible(false);
        modificar.setVisible(false);
        eliminar.setVisible(false);
        guardar.setVisible(true);
    }//GEN-LAST:event_nuevoActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        guardar.setEnabled(false);
//        llenarCombo();
        String opciones = (JOptionPane.showInputDialog(null, "seleccione una opcion", "Buscar", JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Buscar por id"}, "seleccion")).toString();

        switch (opciones) {

            case "Buscar por id":
                String id = JOptionPane.showInputDialog("Ingrese el id");

                int miId = Integer.parseInt(id);
                PropiedadData pd = new PropiedadData();
                Propiedad propie1 = pd.buscarPropiedadPorID(miId);
                //for para recorrer la lista

                // Propietario modelo= comboPropietario.
                DefaultComboBoxModel<Propietario> model = (DefaultComboBoxModel<Propietario>) comboPropietario.getModel();
                int contador = model.getSize();
                for (int i = 0; i < contador; i++) {
                    Propietario p = model.getElementAt(i);
                    if (propie1.getPropietario().getId_propietario() == p.getId_propietario()) {
                        comboPropietario.setSelectedIndex(i);
                    }
                }
                textId.setText(id);
                textAcce.setText(propie1.getAccesibilidad());
                textDire.setText(propie1.getDireccion());
                //textPropie.setVisible(true);
                // aca quiero agregar el dato de la base
                //textPropie.setText(propie1.getPropietario().toString());
                //comboPropietario.setVisible(false);
                textForma.setText(propie1.getForma());
                textPrecio.setText(String.valueOf(propie1.getPrecio()));
                textRevisor.setText(propie1.getRevisor());
                textSuper.setText(String.valueOf(propie1.getSuperficieMinima()));
                textTipo.setText(propie1.getTipoPropiedad());
                textZona.setText(propie1.getZona());

                break;
        }

        modificar.setEnabled(true);
        eliminar.setEnabled(true);
        nuevo.setEnabled(true);
        guardar.setEnabled(false);

        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed

        Propiedad propie1 = new Propiedad();
        PropiedadData pd = new PropiedadData();
        propie1.setId_propiedad(Integer.parseInt(textId.getText()));
        propie1.setPropietario(propietarioSelect);
        propie1.setAccesibilidad(textAcce.getText());
        propie1.setDireccion(textDire.getText());
        propie1.setForma(textForma.getText());
        propie1.setPrecio(Float.parseFloat(textPrecio.getText()));
        propie1.setRevisor(textRevisor.getText());
        propie1.setSuperficieMinima(Integer.parseInt(textSuper.getText()));
        propie1.setTipoPropiedad(textTipo.getText());
        propie1.setZona(textZona.getText());


        pd.modificarPropiedad(propie1);

        // TODO add your handling code here:
        textId.setText("");
        textAcce.setText("");
        textDire.setText("");
        textForma.setText("");
        textPrecio.setText("");
        textRevisor.setText("");
        textSuper.setText("");
        textTipo.setText("");
        textZona.setText("");
        
        nuevo.setEnabled(true);
        modificar.setEnabled(false);
        guardar.setEnabled(false);
        eliminar.setEnabled(false);
    }//GEN-LAST:event_modificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JComboBox<Propietario> comboPropietario;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField textAcce;
    private javax.swing.JTextField textDire;
    private javax.swing.JTextField textForma;
    private javax.swing.JTextField textId;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JTextField textRevisor;
    private javax.swing.JTextField textSuper;
    private javax.swing.JTextField textTipo;
    private javax.swing.JTextField textZona;
    // End of variables declaration//GEN-END:variables

    public void llenarCombo() {
        List<Propietario> propietarios = new ArrayList<>();

        PropietarioData pd = new PropietarioData();
        propietarios = pd.listarPropietarios();

        for (Propietario p1 : propietarios) {
            comboPropietario.addItem(p1);

        }
    }

    public Propiedad crearPropiedad() {

        String acceso = textAcce.getText();
        String direcion = textDire.getText();
        String forma = textForma.getText();
        float precio = Float.parseFloat(textPrecio.getText());
        String revisor = textRevisor.getText();
        int superficieMinima = Integer.parseInt(textSuper.getText());
        String tipoPropiedad = textTipo.getText();
        String zona = textZona.getText();
        boolean estado = true;

        propiedad1 = new Propiedad(acceso, direcion, propietarioSelect, forma, precio, revisor, superficieMinima, tipoPropiedad, zona, estado);
        System.out.println(propiedad1);
        return propiedad1;
    }
}
