package com.example.demo.services;

import com.example.livros.models.LivroModel;
import com.example.livros.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public LivroModel criarLivro(LivroModel livroModel){
        return livroModel;
    }

    public List<LivroModel> findAll(){
        return livroRepository.findAll();
    }

    public void deletar(Long id){
        livroRepository.deleteById(id);
    }

    public Optional<LivroModel> buscarPorId(Long id){
        return livroRepository.findById(id);
    }

    public void deletarLivro(Long id){
        livroRepository.deleteById(id);
    }
}
