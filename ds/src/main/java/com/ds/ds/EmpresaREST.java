package com.ds.ds;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ds.ds.Entidade.Empresa;
import com.ds.ds.database.RepositorioEmpresa;

@RestController
@RequestMapping("/empresa")
public class EmpresaREST {
    
    @Autowired
    private RepositorioEmpresa rempresa;

    @GetMapping
    public List<Empresa>listar_empresa(){
        return rempresa.findAll();
    }

    @PostMapping
    public void salvar_empresa(@RequestBody Empresa empresa){
        rempresa.save(empresa);
    }

    @PutMapping("/alterar")
    public void alterar_empresa(@RequestBody Empresa empresa){
        if(empresa.getEmailempresa() != " " || empresa.getEmailempresa() != null)
            rempresa.save(empresa);
    }    

    @DeleteMapping("/excluir/{id}")
    public void excluir_empresa(@PathVariable String id){
        rempresa.deleteById(id);
    }
}    

