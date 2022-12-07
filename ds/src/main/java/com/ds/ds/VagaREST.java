package com.ds.ds;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.ds.Entidade.Vaga;
import com.ds.ds.database.RepositorioVaga;

@RestController
@RequestMapping("/vaga")
public class VagaREST {
    
    @Autowired
    private RepositorioVaga rvaga;

    @GetMapping("/listavaga")
    public List<Vaga>lista_vaga(){
        return rvaga.findAll();
    }

    @PostMapping("/salvavaga")
    public void salva_vaga(@RequestBody Vaga vaga){
        rvaga.save(vaga);
    }

    @PutMapping
    public void altera_vaga(@RequestBody Vaga vaga){
        if(vaga.getId()>0)
            rvaga.save(vaga);
    }

    @DeleteMapping
    public void exclui_vaga(@RequestBody Vaga vaga){
        rvaga.delete(vaga);
    }

}
