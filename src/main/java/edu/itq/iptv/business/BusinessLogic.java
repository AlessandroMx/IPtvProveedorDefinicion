package edu.itq.iptv.business;

import java.util.List;
import java.util.Random;

import edu.itq.iptv.dao.ClienteDao;
import edu.itq.iptv.dao.PaqueteDao;
import edu.itq.iptv.dao.SolicitudDao;
import edu.itq.iptv.dto.ClienteDto;
import edu.itq.iptv.dto.PaqueteDto;
import edu.itq.iptv.dto.SolicitudDto;

public class BusinessLogic {

    private ClienteDao clienteDao;
    private PaqueteDao paqueteDao;
    private SolicitudDao solicitudDao;

    public String defineService(int idSolicitud) {

        List<SolicitudDto> solicitud = solicitudDao
                .buscarSolicitud(idSolicitud);

        if (solicitud == null) {
            return "No se encontró la solicitud de servicio. "
                    + "Procedimiento no válido.";
        }

        SolicitudDto tmpSol = solicitud.get(0);
        // System.out.println("Solicitud: " + tmpSol.getIdSolicitud() + "
        // encontrada.");

        List<ClienteDto> cliente = clienteDao
                .buscarCliente(tmpSol.getIdSolicitud());

        ClienteDto tmpCli = cliente.get(0);
        // System.out.println("Cliente: " + tmpCli.getIdCliente() + "
        // encontrado.");

        List<PaqueteDto> paquete = paqueteDao
                .buscarPaquete(solicitud.get(0).getIdPaquete());

        PaqueteDto tmpPaq = paquete.get(0);
        // System.out.println("Paquete: " + tmpPaq.getIdPaquete() + "
        // encontrado.");

        // Generate random numbers to create a random "Folio"
        Random rng = new Random();
        int tmpFolio1 = rng.nextInt(90000) + 10000;
        int tmpFolio2 = rng.nextInt(90000) + 10000;
        int tmpFolio3 = rng.nextInt(90000) + 10000;
        String tmpFolio = Integer.toString(tmpFolio1)
                + Integer.toString(tmpFolio2) + Integer.toString(tmpFolio3);

        String finalResponse = "Paquete contratado: " + tmpPaq.getNombre()
                + "\nDescripción de servicio: " + tmpPaq.getDescripcion()
                + "\nCosto del servicio: $" + tmpPaq.getPrecio()
                + "\nServicio a nombre de: " + tmpCli.getNombre() + " "
                + tmpCli.getApellidoPaterno() + " "
                + tmpCli.getApellidoMaterno() + "\nFolio: " + tmpFolio;

        return finalResponse;

    }

    /**
     * @return the clienteDao
     */
    public ClienteDao getClienteDao() {
        return clienteDao;
    }

    /**
     * @param clienteDao the clienteDao to set
     */
    public void setClienteDao(ClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    /**
     * @return the paqueteDao
     */
    public PaqueteDao getPaqueteDao() {
        return paqueteDao;
    }

    /**
     * @param paqueteDao the paqueteDao to set
     */
    public void setPaqueteDao(PaqueteDao paqueteDao) {
        this.paqueteDao = paqueteDao;
    }

    /**
     * @return the solicitudDao
     */
    public SolicitudDao getSolicitudDao() {
        return solicitudDao;
    }

    /**
     * @param solicitudDao the solicitudDao to set
     */
    public void setSolicitudDao(SolicitudDao solicitudDao) {
        this.solicitudDao = solicitudDao;
    }

}
