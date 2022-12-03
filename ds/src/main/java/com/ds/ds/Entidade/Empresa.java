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

    

    
}
