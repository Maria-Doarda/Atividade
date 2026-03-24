package com.example.demo.controllers;

import com.example.demo.models.TarefaModel;
import com.example.demo.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @PostMapping
    public TarefaModel criarTarefa(TarefaModel novaTarefa){
        return tarefaService.criarTarefa(novaTarefa);
    }

    @GetMapping
    public List<TarefaModel> listarTodos(){
        return tarefaService.listarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(Long id){
        tarefaService.deletarTarefa(id);
    }

    @GetMapping("/{id}")
    public Optional<TarefaModel> buscarPorId(Long id){
        return tarefaService.buscarPorId(id);}
}
