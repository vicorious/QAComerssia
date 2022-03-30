package com.example.springboot.repository;

import com.example.springboot.dto.CustomResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

import com.example.springboot.entity.*;

@Transactional
@Repository
public interface QADRepository extends CrudRepository<Comerssia, Long> {

    /**
     * Esto es el script
     */
    @Query(value = "SELECT * FROM Commersia_Despachos", nativeQuery = true)
    List<Comerssia> getInfoFromQAD();
}