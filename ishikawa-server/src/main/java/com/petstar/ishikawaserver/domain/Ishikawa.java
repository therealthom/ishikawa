package com.petstar.ishikawaserver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ishikawa {
    @Id
    @GeneratedValue
    private Long id;
    private String que;
    private String donde;
    private String cuando;
    private String como;
    private String definicionDelProblema;
    private Date fechaDeAnalisis;
    private String nombreEtad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public String getDonde() {
        return donde;
    }

    public void setDonde(String donde) {
        this.donde = donde;
    }

    public String getCuando() {
        return cuando;
    }

    public void setCuando(String cuando) {
        this.cuando = cuando;
    }

    public String getComo() {
        return como;
    }

    public void setComo(String como) {
        this.como = como;
    }

    public String getDefinicionDelProblema() {
        return definicionDelProblema;
    }

    public void setDefinicionDelProblema(String definicionDelProblema) {
        this.definicionDelProblema = definicionDelProblema;
    }

    public Date getFechaDeAnalisis() {
        return fechaDeAnalisis;
    }

    public void setFechaDeAnalisis(Date fechaDeAnalisis) {
        this.fechaDeAnalisis = fechaDeAnalisis;
    }

    public String getNombreEtad() {
        return nombreEtad;
    }

    public void setNombreEtad(String nombreEtad) {
        this.nombreEtad = nombreEtad;
    }

    @Override
    public String toString() {
        return String.format("Ishikawa [id=%s, correct=%s]", getId());
    }
}
