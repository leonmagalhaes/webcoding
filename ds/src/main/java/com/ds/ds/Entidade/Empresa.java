package com.ds.ds.Entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Empresa {

    @Id
    private String emailempresa;
    @Column (nullable = false)
    private String senhaempresa;
    @Column (nullable = false)
    private String userempresa;

    private String face_empresa;
    private String twitter_empresa;
    private String linkedin_empresa;
    private String insta_empresa;
    private String telefone_empresa;
    private String endereco_empresa;
    private String site_empresa;

    public String getEmailempresa() {
        return emailempresa;
    }
    public void setEmailempresa(String emailempresa) {
        this.emailempresa = emailempresa;
    }
    public String getSenhaempresa() {
        return senhaempresa;
    }
    public void setSenhaempresa(String senhaempresa) {
        this.senhaempresa = senhaempresa;
    }
    public String getUserempresa() {
        return userempresa;
    }
    public void setUserempresa(String userempresa) {
        this.userempresa = userempresa;
    }
    public String getFace_empresa() {
        return face_empresa;
    }
    public void setFace_empresa(String face_empresa) {
        this.face_empresa = face_empresa;
    }
    public String getTwitter_empresa() {
        return twitter_empresa;
    }
    public void setTwitter_empresa(String twitter_empresa) {
        this.twitter_empresa = twitter_empresa;
    }
    public String getLinkedin_empresa() {
        return linkedin_empresa;
    }
    public void setLinkedin_empresa(String linkedin_empresa) {
        this.linkedin_empresa = linkedin_empresa;
    }
    public String getInsta_empresa() {
        return insta_empresa;
    }
    public void setInsta_empresa(String insta_empresa) {
        this.insta_empresa = insta_empresa;
    }
    public String getTelefone_empresa() {
        return telefone_empresa;
    }
    public void setTelefone_empresa(String telefone_empresa) {
        this.telefone_empresa = telefone_empresa;
    }
    public String getEndereco_empresa() {
        return endereco_empresa;
    }
    public void setEndereco_empresa(String endereco_empresa) {
        this.endereco_empresa = endereco_empresa;
    }
    public String getSite_empresa() {
        return site_empresa;
    }
    public void setSite_empresa(String site_empresa) {
        this.site_empresa = site_empresa;
    }

    

    
}
