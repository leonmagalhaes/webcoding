package com.ds.ds.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.ds.Entidade.Vaga;

public interface RepositorioVaga extends JpaRepository<Vaga,Long> {
    
}
