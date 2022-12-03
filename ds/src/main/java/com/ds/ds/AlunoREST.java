package com.ds.ds;

import java.util.List;

/*import org.hibernate.dialect.function.ConcatPipeFunction;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.ds.Entidade.Aluno;
import com.ds.ds.database.RepositorioAluno;

@RestController
@RequestMapping("/aluno")
public class AlunoREST {
    @Autowired
    private RepositorioAluno raluno;

    @GetMapping
    public List<Aluno>listar(){
        return raluno.findAll();
    }

    @PostMapping
    public void salvar(@RequestBody Aluno aluno){
        raluno.save(aluno);
    }

    @PutMapping
    public void alterar(@RequestBody Aluno aluno){
        if(aluno.getEmailaluno() != " " || aluno.getEmailaluno() != null)
            raluno.save(aluno);
    }

    @DeleteMapping
    public void excluir(@RequestBody Aluno aluno){
        raluno.delete(aluno);
    }
}
