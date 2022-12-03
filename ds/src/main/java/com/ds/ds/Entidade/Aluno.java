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

    
}
