
package Entidades;


public class Propietario {
    private int id_propietario;
    private String apellido;
    private int dni;
    private String domicilio;
    private String nombre;
    private int telefono;

    public Propietario() {
    }

    public Propietario(String apellido, int dni, String domicilio, String nombre, int telefono) {
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Propietario(int id_propietario, String apellido, int dni, String domicilio, String nombre, int telefono) {
        this.id_propietario = id_propietario;
        this.apellido = apellido;
        this.dni = dni;
        this.domicilio = domicilio;
        this.nombre = nombre;
        this.telefono = telefono;
    }

   

    public int getId_propietario() {
        return id_propietario;
    }

    public void setId_propietario(int id_propietario) {
        this.id_propietario = id_propietario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Propietario{" + "id_propietario=" + id_propietario + ", apellido=" + apellido + ", dni=" + dni + ", domicilio=" + domicilio + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
    
}
