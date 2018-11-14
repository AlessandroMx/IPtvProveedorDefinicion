package edu.itq.iptv.dto;

import java.util.Date;

public class SolicitudDto {

    private int idSolicitud;
    private int idCliente;
    private int idPaquete;
    private Date fecha;
    /**
     * @return the idSolicitud
     */
    public int getIdSolicitud() {
        return idSolicitud;
    }
    /**
     * @param idSolicitud the idSolicitud to set
     */
    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }
    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
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
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }
    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
