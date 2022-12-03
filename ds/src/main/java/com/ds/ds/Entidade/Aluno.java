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
}
