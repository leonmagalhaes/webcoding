package com.ds.ds.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds.ds.Entidade.Aluno;

public interface RepositorioAluno extends JpaRepository<Aluno,String>{
    
}
