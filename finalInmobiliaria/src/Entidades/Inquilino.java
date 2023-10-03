
package Entidades;


public class Inquilino {
    private String apellido;
    private char detalle;
    private int dni;
    private int id_inquilino;
    private String nombre;
    private char tipo;

    public Inquilino(String apellido, char detalle, int dni, int id_inquilino, String nombre, char tipo) {
        this.apellido = apellido;
        this.detalle = detalle;
        this.dni = dni;
        this.id_inquilino = id_inquilino;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Inquilino() {
    }

    public Inquilino(String apellido, char detalle, int dni, String nombre, char tipo) {
        this.apellido = apellido;
        this.detalle = detalle;
        this.dni = dni;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getDetalle() {
        return detalle;
    }

    public void setDetalle(char detalle) {
        this.detalle = detalle;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getId_inquilino() {
        return id_inquilino;
    }

    public void setId_inquilino(int id_inquilino) {
        this.id_inquilino = id_inquilino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "apellido=" + apellido + ", detalle=" + detalle + ", dni=" + dni + ", id_inquilino=" + id_inquilino + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
    
    
    
    
}
