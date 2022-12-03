package com.ds.ds.Entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int nvagas; //numero de vagas  

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)
    private String local;

    @Column(nullable = false)
    private String link_form;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLink_form() {
        return link_form;
    }

    public void setLink_form(String link_form) {
        this.link_form = link_form;
    }

    public int getNvagas() {
        return nvagas;
    }

    public void setNvagas(int nvagas) {
        this.nvagas = nvagas;
    }
    
}
