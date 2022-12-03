package com.ds.ds.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.ds.Entidade.Empresa;


public interface RepositorioEmpresa extends JpaRepository<Empresa,String>{
    
}
