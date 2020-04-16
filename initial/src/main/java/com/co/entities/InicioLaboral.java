package com.co.entities;

import com.co.builder.SerializerCustom;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import javax.persistence.*;
import java.math.BigDecimal;


@JsonPropertyOrder({ "CodigoArl", "TipoDocumentoEmpleador", "NumeroDocumentoEmpleador", "ConsecutivoNITEmpleador",
        "CodigoSede", "CodigoCentroTrabajo", "FechaInicioNovedad", "TipoDocumentoEmpleado",
        "NumeroDocumentoEmpleado", "PrimerNombreEmpleado", "PrimerApellidoEmpleado", "TipoCotizante", "SubTipoCotizante",
        "IBC", "TipoSalario"})
@JsonIgnoreProperties(value = { "id",
        "empreForm", "tokenMin", "fecCaptura", "fecReporte",
        "fecRespuesta", "estadoMin", "estadoMin" })
@Entity
@Table(name = "SRV_INICIO_LABORAL")
public class InicioLaboral extends BaseEntity
{
    @Id
    @Column(name = "SRV_INICIO_LABORAL_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "CONSEC_DESENT")
    private BigDecimal consecDesent;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "COD_SEDE")
    private String codSede;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "COD_CENTRO")
    private String codCentro;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "FECINI_NOV")
    private String fecIniNov;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "EMPLE_TIPDOC")
    private String empleTipDoc;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "EMPLE_ID")
    private String empleId;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "EMPLE_PAPELLIDO")
    private String empleApellido;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "EMPLE_PNOMBRE")
    private String empleNombre;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "TIPO_COTIZANTE")
    private BigDecimal tipoCotizante;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "SUBTIPO_COTIZANTE")
    private BigDecimal subTipoCotizante;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "IBC")
    private BigDecimal ibc;

    @JsonSerialize(using = SerializerCustom.class)
    @Column(name = "TIPO_SALARIO")
    private BigDecimal tipoSalario;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getConsecDesent() {
        return consecDesent;
    }

    @JsonProperty("ConsecutivoNITEmpleador")
    public void setConsecDesent(BigDecimal consecDesent) {
        this.consecDesent = consecDesent;
    }

    public String getCodSede() {
        return codSede;
    }

    @JsonProperty("CodigoSede")
    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public String getCodCentro() {
        return codCentro;
    }

    @JsonProperty("CodigoCentroTrabajo")
    public void setCodCentro(String codCentro) {
        this.codCentro = codCentro;
    }

    public String getFecIniNov() {
        return fecIniNov;
    }

    @JsonProperty("FechaInicioNovedad")
    public void setFecIniNov(String fecIniNov) {
        this.fecIniNov = fecIniNov;
    }

    public String getEmpleTipDoc() {
        return empleTipDoc;
    }

    @JsonProperty("TipoDocumentoEmpleado")
    public void setEmpleTipDoc(String empleTipDoc) {
        this.empleTipDoc = empleTipDoc;
    }

    public String getEmpleId() {
        return empleId;
    }

    @JsonProperty("NumeroDocumentoEmpleado")
    public void setEmpleId(String empleId) {
        this.empleId = empleId;
    }

    public String getEmpleApellido() {
        return empleApellido;
    }

    @JsonProperty("PrimerNombreEmpleado")
    public void setEmpleApellido(String empleApellido) {
        this.empleApellido = empleApellido;
    }

    public String getEmpleNombre() {
        return empleNombre;
    }

    @JsonProperty("PrimerApellidoEmpleado")
    public void setEmpleNombre(String empleNombre) {
        this.empleNombre = empleNombre;
    }

    public BigDecimal getTipoCotizante() {
        return tipoCotizante;
    }
    @JsonProperty("TipoCotizante")
    public void setTipoCotizante(BigDecimal tipoCotizante) {
        this.tipoCotizante = tipoCotizante;
    }

    public BigDecimal getSubTipoCotizante() {
        return subTipoCotizante;
    }

    @JsonProperty("SubTipoCotizante")
    public void setSubTipoCotizante(BigDecimal subTipoCotizante) {
        this.subTipoCotizante = subTipoCotizante;
    }

    public BigDecimal getIbc() {
        return ibc;
    }

    @JsonProperty("IBC")
    public void setIbc(BigDecimal ibc) {
        this.ibc = ibc;
    }

    public BigDecimal getTipoSalario() {
        return tipoSalario;
    }

    @JsonProperty("TipoSalario")
    public void setTipoSalario(BigDecimal tipoSalario) {
        this.tipoSalario = tipoSalario;
    }
}
