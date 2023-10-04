
package Entidades;


public class Propiedad {
  private int id_propiedad;
  private String accesibilidad;
  private String direccion;
  private Propietario propietario;
  private char estadoPropiedad;
  private String forma;
  private Inquilino inquilino;
  private float precio;
  private String revisor;
  private int superficieMinima;
  private String tipoPropiedad;
  private String zona;
  private boolean estado;

    public Propiedad(String accesibilidad, String direccion, Propietario propietario, char estadoPropiedad, String forma, Inquilino inquilino, float precio, String revisor, int superficieMinima, String tipoPropiedad, String zona, boolean estado) {
        this.accesibilidad = accesibilidad;
        this.direccion = direccion;
        this.propietario = propietario;
        this.estadoPropiedad = estadoPropiedad;
        this.forma = forma;
        this.inquilino = inquilino;
        this.precio = precio;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
        this.tipoPropiedad = tipoPropiedad;
        this.zona = zona;
        this.estado = estado;
    }

    public Propiedad() {
    }

    public Propiedad(String accesibilidad, String direccion, Propietario propietario,
                    char estadoPropiedad, String forma, float precio, String revisor,
                    int superficieMinima, String tipoPropiedad, String zona, boolean estado) {
        this.accesibilidad = accesibilidad;
        this.direccion = direccion;
        this.propietario = propietario;
        this.estadoPropiedad = estadoPropiedad;
        this.forma = forma;
        this.precio = precio;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
        this.tipoPropiedad = tipoPropiedad;
        this.zona = zona;
        this.estado = estado;
    }

    public Propiedad(int id_propiedad, String accesibilidad, String direccion, Propietario propietario, char estadoPropiedad, String forma, Inquilino inquilino, float precio, String revisor, int superficieMinima, String tipoPropiedad, String zona, boolean estado) {
        this.id_propiedad = id_propiedad;
        this.accesibilidad = accesibilidad;
        this.direccion = direccion;
        this.propietario = propietario;
        this.estadoPropiedad = estadoPropiedad;
        this.forma = forma;
        this.inquilino = inquilino;
        this.precio = precio;
        this.revisor = revisor;
        this.superficieMinima = superficieMinima;
        this.tipoPropiedad = tipoPropiedad;
        this.zona = zona;
        this.estado = estado;
    }

    public int getId_propiedad() {
        return id_propiedad;
    }

    public void setId_propiedad(int id_propiedad) {
        this.id_propiedad = id_propiedad;
    }

    public String getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(String accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public char getEstadoPropiedad() {
        return estadoPropiedad;
    }

    public void setEstadoPropiedad(char estadoPropiedad) {
        this.estadoPropiedad = estadoPropiedad;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    public int getSuperficieMinima() {
        return superficieMinima;
    }

    public void setSuperficieMinima(int superficieMinima) {
        this.superficieMinima = superficieMinima;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    @Override
    public String toString() {
        return "Propiedad{" + "id_propiedad=" + id_propiedad + ", accesibilidad=" + accesibilidad + ", direccion=" + direccion + ", propietario=" + propietario + ", estadoPropiedad=" + estadoPropiedad + ", forma=" + forma + ", inquilino=" + inquilino + ", precio=" + precio + ", revisor=" + revisor + ", superficieMinima=" + superficieMinima + ", tipoPropiedad=" + tipoPropiedad + ", zona=" + zona + '}';
    }
  
  
  
  
}
