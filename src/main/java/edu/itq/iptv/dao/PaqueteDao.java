package edu.itq.iptv.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import edu.itq.iptv.dto.PaqueteDto;

public class PaqueteDao {
    
    protected JdbcTemplate jdbcTemplate;
    
    public List<PaqueteDto> buscarPaquete(int idPaquete) {
        List<PaqueteDto> resultList = null;
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM Paquete WHERE id_paquete ='"+ idPaquete + "'");
        if (list != null && !list.isEmpty()) {
            resultList = new ArrayList<PaqueteDto>();
            for (Map<String, Object> userMap : list) {
                PaqueteDto dto = new PaqueteDto();
                dto.setIdPaquete((int) userMap.get("id_paquete"));
                dto.setNombre((String) userMap.get("nombre"));
                dto.setPrecio((BigDecimal) userMap.get("precio"));
                dto.setDescripcion((String) userMap.get("descripcion"));
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
