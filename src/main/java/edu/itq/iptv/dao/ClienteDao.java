package edu.itq.iptv.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import edu.itq.iptv.dto.ClienteDto;

public class ClienteDao {

    protected JdbcTemplate jdbcTemplate;

    public void addCliente(ClienteDto clienteDto) {
        jdbcTemplate.execute(
                "INSERT INTO  Cliente (nombre, apellido_paterno, apellido_materno, calle, ciudad, codigo_postal, telefono, correo, numero_tarjeta) "
                        + "VALUES('" + clienteDto.getNombre() + "', '"
                        + clienteDto.getApellidoPaterno() + "', '"
                        + clienteDto.getApellidoMaterno() + "', '"
                        + clienteDto.getCalle() + "', '"
                        + clienteDto.getCiudad() + "', '"
                        + clienteDto.getCodigoPostal() + "', '"
                        + clienteDto.getTelefono() + "', '"
                        + clienteDto.getCorreo() + "', '"
                        + clienteDto.getNumeroTarjeta() + "')");
    }

    public List<ClienteDto> buscarCliente(int idCliente) {
        List<ClienteDto> resultList = null;
        List<Map<String, Object>> list = jdbcTemplate.queryForList(
                "SELECT * FROM Cliente WHERE id_cliente = '" + idCliente + "'");
        if (list != null && !list.isEmpty()) {
            resultList = new ArrayList<ClienteDto>();
            for (Map<String, Object> userMap : list) {
                ClienteDto dto = new ClienteDto();
                dto.setIdCliente((int) userMap.get("id_cliente"));
                dto.setNombre((String) userMap.get("nombre"));
                dto.setApellidoPaterno(
                        (String) userMap.get("apellido_paterno"));
                dto.setApellidoMaterno(
                        (String) userMap.get("apellido_materno"));
                dto.setCalle((String) userMap.get("calle"));
                dto.setCiudad((String) userMap.get("ciudad"));
                dto.setCodigoPostal((String) userMap.get("codigo_postal"));
                dto.setTelefono((String) userMap.get("telefono"));
                dto.setCorreo((String) userMap.get("correo"));
                dto.setNumeroTarjeta((String) userMap.get("numero_tarjeta"));
                if (userMap.get("id_paquete") != null) {
                    dto.setIdPaquete((int) userMap.get("id_paquete"));
                } else {
                    dto.setIdPaquete(4);
                }
                resultList.add(dto);
            }
        }
        return resultList;
    }

    public void insertDummy() {
        jdbcTemplate.execute(
                "INSERT INTO Cliente (nombre, apellido_paterno, apellido_materno, calle, ciudad, codigo_postal, telefono, correo, numero_tarjeta)"
                        + "VALUES ('Miguel', 'Chavez', 'Acosta', 'Calle Primavera', 'Quer�taro', '98712', '4422116633', 'john_lenon@coldmail.com', '9999000099990123')");
    }

    /**
     * @param jdbcTemplate the jdbcTemplate to set
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
