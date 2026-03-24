package com.example.demo.services;


import com.example.demo.models.TarefaModel;
import com.example.demo.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;


    public TarefaModel criarTarefa(TarefaModel novaTarefa) {
        return tarefaRepository.save(novaTarefa);
    }

    public List<TarefaModel> listarTodos() {
        return tarefaRepository.findAll();
    }

    public void deletarTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }

    public Optional<TarefaModel> buscarPorId(Long id) {
        return tarefaRepository.findById(id);
    }
}