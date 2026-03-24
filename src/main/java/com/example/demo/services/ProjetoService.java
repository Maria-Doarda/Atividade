package com.example.demo.services;

import com.example.demo.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public com.example.Projeto.models.ProjetoModel criarProjeto(com.example.Projeto.models.ProjetoModel novoProjeto){
        return projetoRepository.save(novoProjeto);
    }

    public List<com.example.Projeto.models.ProjetoModel> listarTodos(){
        return projetoRepository.findAll();
    }

    public void deletarProjeto(Long id){
        projetoRepository.deleteById(id);
    }

    public Optional<com.example.Projeto.models.ProjetoModel> buscarPorId(Long id){
        return projetoRepository.findById(id);
    }

}
