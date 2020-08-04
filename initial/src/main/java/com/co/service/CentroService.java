package com.co.service;

import com.co.entities.CentroTrabajo;
import com.co.persistence.CentroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Component
@Service
public class CentroService {

    @Autowired
    CentroRepository centroRepository;

    public List<CentroTrabajo> getCentroPorSedeId(BigDecimal id) {

        return this.centroRepository.getCentroBySedeId(id);
    }
}
