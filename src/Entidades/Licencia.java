package Entidades;
// Generated Oct 23, 2018 11:34:50 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Licencia generated by hbm2java
 */
public class Licencia  implements java.io.Serializable {


     private Integer idLicencia;
     private Administrativo administrativo;
     private Titular titular;
     private Date fechaVenc;
     private String clase;
     private String donante;
     private String observaciones;
     private String estado;
     private Date fechaRegistro;

    public Licencia() {
    }

    public Licencia(Administrativo administrativo, Titular titular, Date fechaVenc, String clase, String donante, String observaciones, String estado, Date fechaRegistro) {
       this.administrativo = administrativo;
       this.titular = titular;
       this.fechaVenc = fechaVenc;
       this.clase = clase;
       this.donante = donante;
       this.observaciones = observaciones;
       this.estado = estado;
       this.fechaRegistro = fechaRegistro;
    }
   
    public Integer getIdLicencia() {
        return this.idLicencia;
    }
    
    public void setIdLicencia(Integer idLicencia) {
        this.idLicencia = idLicencia;
    }
    public Administrativo getAdministrativo() {
        return this.administrativo;
    }
    
    public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }
    public Titular getTitular() {
        return this.titular;
    }
    
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    public Date getFechaVenc() {
        return this.fechaVenc;
    }
    
    public void setFechaVenc(Date fechaVenc) {
        this.fechaVenc = fechaVenc;
    }
    public String getClase() {
        return this.clase;
    }
    
    public void setClase(String clase) {
        this.clase = clase;
    }
    public String getDonante() {
        return this.donante;
    }
    
    public void setDonante(String donante) {
        this.donante = donante;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }




}

