package com.example.springboot.repository;

import com.example.springboot.entity.Comerssia;
import com.example.springboot.entity.ReporteComerssia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ReporteRepository extends CrudRepository<ReporteComerssia, Long> {
}
