
package accesoADatos;

import Entidades.Propietario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PropietarioData {
     
    private Connection con = null;
    
    public PropietarioData(){
        
        con = miConexion.getConexion();//me conecto a la base
             
    }
    
     public void guardarPropietario(Propietario propietario) {

        String sql = " INSERT INTO `propietario`(`apellido`, `nombre`, `DNI`, `domicilio`, `telefono`)VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, propietario.getApellido());  
            ps.setString(2, propietario.getNombre());
            ps.setInt(3, propietario.getDni());
            ps.setString(4, propietario.getDomicilio());
            ps.setString(5, propietario.getTelefono());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

               propietario.setId_propietario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "propietario Guardado");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Acceder a la tabla propietario");
        }

    }
    
    
}
