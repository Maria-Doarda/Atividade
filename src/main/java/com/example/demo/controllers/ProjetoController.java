package com.example.demo.controllers;

import com.example.demo.services.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/projetos")
public class ProjetoController {

    private ProjetoService projetoService;

    @PostMapping
    public com.example.Projeto.models.ProjetoModel criarProjeto(@RequestBody com.example.Projeto.models.ProjetoModel novoProjeto){
        return projetoService.criarProjeto(novoProjeto);
    }

    @GetMapping
    public List<com.example.Projeto.models.ProjetoModel> listarTodos(){
        return projetoService.listarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletarProjeto(@PathVariable Long id){
        projetoService.deletarProjeto(id);
    }

    @GetMapping("/{id}")
    public Optional<com.example.Projeto.models.ProjetoModel> buscarPorId(@PathVariable Long id) {
        return projetoService.buscarPorId(id);
    }
}
