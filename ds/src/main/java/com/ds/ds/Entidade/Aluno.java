package com.ds.ds.Entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    private String emailaluno;
    @Column(nullable = false)
    private String senhaaluno;
    @Column(nullable = false)
    private String useraluno;

    private String face;
    private String twitter;
    private String linkedin;
    private String insta;
    private String telefone;
    private String endereco;

    public String getEmailaluno() {
        return emailaluno;
    }
    public void setEmailaluno(String emailaluno) {
        this.emailaluno = emailaluno;
    }
    public String getSenhaaluno() {
        return senhaaluno;
    }
    public void setSenhaaluno(String senhaaluno) {
        this.senhaaluno = senhaaluno;
    }
    public String getUseraluno() {
        return useraluno;
    }
    public void setUseraluno(String useraluno) {
        this.useraluno = useraluno;
    }
    public String getFace() {
        return face;
    }
    public void setFace(String face) {
        this.face = face;
    }
    public String getTwitter() {
        return twitter;
    }
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
    public String getLinkedin() {
        return linkedin;
    }
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }
    public String getInsta() {
        return insta;
    }
    public void setInsta(String insta) {
        this.insta = insta;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
}
