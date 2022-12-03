package com.ds.ds;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ds.ds.Entidade.Empresa;
import com.ds.ds.database.RepositorioEmpresa;

@Controller
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

    @PutMapping
    public void alterar_empresa(@RequestBody Empresa empresa){
        if(empresa.getEmailempresa() != " " || empresa.getEmailempresa() != null)
            rempresa.save(empresa);
    }    

    @DeleteMapping
    public void excluir_empresa(@RequestBody Empresa empresa){
        rempresa.delete(empresa);
    }
}    

