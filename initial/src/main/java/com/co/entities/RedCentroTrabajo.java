package com.co.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity(name = "SRV_RECL_CENTRO_TRABAJO")
public class RedCentroTrabajo extends BaseEntity
{
    @Id
    @Column(name = "SRV_RECL_CENTRO_TRABAJO_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "CONSEC_DESENT")
    private String consecDesent;

    @Column(name = "SEDE_COD")
    private String sedeCod;

    @Column(name = "CENTRO_COD")
    private String centroCod;

    @Column(name = "COD_ANTE_ACTIVIDAD")
    private BigDecimal codAnteActividad;

    @Column(name = "COD_NUEVA_ACTIVIDAD")
    private BigDecimal codNuevaActividad;

    @Column(name = "SOLICITANTE_RECLASIF")
    private BigDecimal solicitanteReclasif;

}
