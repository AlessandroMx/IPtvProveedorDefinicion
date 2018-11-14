package edu.itq.iptv.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import edu.itq.iptv.dto.SolicitudDto;

public class SolicitudDao {
    protected JdbcTemplate jdbcTemplate;

    public void addSolicitud(SolicitudDto solicitudDto) {
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");

        jdbcTemplate.execute(
                "INSERT INTO Solicitud (id_cliente, id_paquete, fecha) "
                        + "VALUES('" + solicitudDto.getIdCliente() + "', '"
                        + solicitudDto.getIdPaquete() + "', '"
                        + hourdateFormat.format(date) + "')");
    }

    public List<SolicitudDto> buscarSolicitud(int idSolicitud) {
        List<SolicitudDto> resultList = null;
        List<Map<String, Object>> list = jdbcTemplate
                .queryForList("SELECT * FROM Solicitud WHERE id_solicitud ='"
                        + idSolicitud + "'");
        if (list != null && !list.isEmpty()) {
            resultList = new ArrayList<SolicitudDto>();
            for (Map<String, Object> userMap : list) {
                SolicitudDto dto = new SolicitudDto();
                dto.setIdSolicitud((int) userMap.get("id_solicitud"));
                dto.setIdCliente((int) userMap.get("id_cliente"));
                dto.setIdPaquete((int) userMap.get("id_paquete"));
                dto.setFecha((Date) userMap.get("fecha"));
                resultList.add(dto);
            }
        }
        return resultList;
    }

    /**
     * @param jdbcTemplate the jdbcTemplate to set
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
