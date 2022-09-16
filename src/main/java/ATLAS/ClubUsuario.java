/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATLAS;

/**
 *
 * @author Connectis
 */
public class ClubUsuario {
    
    private int id;
    private String fecha_inicio_suscripcion;
    private int valor_suscripcion;
    private String equipo_suscrito;
    private int abono;
    private int correlativo_venta;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fecha_inicio_suscripcion
     */
    public String getFecha_inicio_suscripcion() {
        return fecha_inicio_suscripcion;
    }

    /**
     * @param fecha_inicio_suscripcion the fecha_inicio_suscripcion to set
     */
    public void setFecha_inicio_suscripcion(String fecha_inicio_suscripcion) {
        this.fecha_inicio_suscripcion = fecha_inicio_suscripcion;
    }

    /**
     * @return the valor_suscripcion
     */
    public int getValor_suscripcion() {
        return valor_suscripcion;
    }

    /**
     * @param valor_suscripcion the valor_suscripcion to set
     */
    public void setValor_suscripcion(int valor_suscripcion) {
        this.valor_suscripcion = valor_suscripcion;
    }

    /**
     * @return the equipo_suscrito
     */
    public String getEquipo_suscrito() {
        return equipo_suscrito;
    }

    /**
     * @param equipo_suscrito the equipo_suscrito to set
     */
    public void setEquipo_suscrito(String equipo_suscrito) {
        this.equipo_suscrito = equipo_suscrito;
    }

    /**
     * @return the abono
     */
    public int getAbono() {
        return abono;
    }

    /**
     * @param abono the abono to set
     */
    public void setAbono(int abono) {
        this.abono = abono;
    }

    /**
     * @return the correlativo_venta
     */
    public int getCorrelativo_venta() {
        return correlativo_venta;
    }

    /**
     * @param correlativo_venta the correlativo_venta to set
     */
    public void setCorrelativo_venta(int correlativo_venta) {
        this.correlativo_venta = correlativo_venta;
    }
    
    
    
}
