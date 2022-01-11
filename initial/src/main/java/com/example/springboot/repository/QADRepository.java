package com.example.springboot.repository;

import com.example.springboot.dto.CustomResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface QADRepository extends CrudRepository<Object, Long> {

    /**
     * Esto es
     */
    @Query("select new com.example.springboot.dto.CustomResponse (p.pt_domain, p.pt_part, p.pt_article"+
            "    p.pt_desc1"+
            "    p.pt_desc2"+
            "    p.pt_status"+
            "    e.ld_domain"+
            "    e.ld_site"+
            "    e.ld_loc"+
            "    e.ld_qty_oh) from Ld_det e, Pt_mstr p "+
            "    WHERE ld_det.ld_domain = global_domain AND"+
            "    ld_det.ld_site        = alm_destino  AND"+
            "    ld_det.ld_loc         = "+"TRA001"+" AND /*Ubicacion Transito*/"+
            "    ld_det.ld_qty_oh > 0"+
            "    AND pt_mstr.pt_domain  = global_domain  AND"+
            "        pt_mstr.pt_part        = ld_det.ld_part")
    List<CustomResponse> getInfoFromQAD();
}