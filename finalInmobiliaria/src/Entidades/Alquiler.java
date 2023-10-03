
package Entidades;

import java.sql.Date;


public class Alquiler {
    private int id_alquiler;
    private Inquilino inquilino;
    private Date fecha_Final;
    private Date fecha_Inicio;
    private Date Fecha_Realizacion;
    private char marca;
    private Propiedad propiedad;
    private String vendedor;

    public Alquiler(Inquilino inquilino, Date fecha_Final, Date fecha_Inicio, Date Fecha_Realizacion, char marca, Propiedad propiedad, String vendedor) {
        this.inquilino = inquilino;
        this.fecha_Final = fecha_Final;
        this.fecha_Inicio = fecha_Inicio;
        this.Fecha_Realizacion = Fecha_Realizacion;
        this.marca = marca;
        this.propiedad = propiedad;
        this.vendedor = vendedor;
    }

    public Alquiler(int id_alquiler, Inquilino inquilino, Date fecha_Final, Date fecha_Inicio, Date Fecha_Realizacion, char marca, Propiedad propiedad, String vendedor) {
        this.id_alquiler = id_alquiler;
        this.inquilino = inquilino;
        this.fecha_Final = fecha_Final;
        this.fecha_Inicio = fecha_Inicio;
        this.Fecha_Realizacion = Fecha_Realizacion;
        this.marca = marca;
        this.propiedad = propiedad;
        this.vendedor = vendedor;
    }

    public Alquiler() {
    }

    public int getId_alquiler() {
        return id_alquiler;
    }

    public void setId_alquiler(int id_alquiler) {
        this.id_alquiler = id_alquiler;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public Date getFecha_Final() {
        return fecha_Final;
    }

    public void setFecha_Final(Date fecha_Final) {
        this.fecha_Final = fecha_Final;
    }

    public Date getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public Date getFecha_Realizacion() {
        return Fecha_Realizacion;
    }

    public void setFecha_Realizacion(Date Fecha_Realizacion) {
        this.Fecha_Realizacion = Fecha_Realizacion;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public Propiedad getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(Propiedad propiedad) {
        this.propiedad = propiedad;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id_alquiler=" + id_alquiler + ", inquilino=" + inquilino + ", fecha_Final=" + fecha_Final + ", fecha_Inicio=" + fecha_Inicio + ", Fecha_Realizacion=" + Fecha_Realizacion + ", marca=" + marca + ", propiedad=" + propiedad + ", vendedor=" + vendedor + '}';
    }
    
    
}
