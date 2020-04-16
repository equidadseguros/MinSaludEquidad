package com.co.persistence;

import com.co.entities.Retractacion;
import com.co.entities.Sede;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@Transactional
@Repository
public interface SedesRepository extends CrudRepository<Sede, Long>
{
    @Query("SELECT a FROM Sede a WHERE a.estructuraEmpresa.id IN :id")
    List<Sede> getSedeByEstructuraId(@Param("id") BigDecimal id);
}
