package edu.itq.iptv.dto;

import java.math.BigDecimal;

public class PaqueteDto {

    private int idPaquete;
    private String nombre;
    private BigDecimal precio;
    private String descripcion;
    /**
     * @return the idPaquete
     */
    public int getIdPaquete() {
        return idPaquete;
    }
    /**
     * @param idPaquete the idPaquete to set
     */
    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the precio
     */
    public BigDecimal getPrecio() {
        return precio;
    }
    /**
     * @param precio the precio to set
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
