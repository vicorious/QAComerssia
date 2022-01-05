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
    @Query("select new com.example.springboot.dto.CustomResponse (e.ld_domain, e.ld_site) from Ld_det e")
    List<CustomResponse> getInfoFromQAD();
}