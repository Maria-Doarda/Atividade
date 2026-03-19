package com.example.demo.services;

import com.example.demo.models.ProdutoModel;
import com.example.demo.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produto){
        return produtoRepository.save(produto);
    }

    public Optional<ProdutoModel> buscarId(Long id){
        return produtoRepository.findById(id);
    }

    public ProdutoModel atualizar(Long id, ProdutoModel produto){
        ProdutoModel model =  produtoRepository.findById(id).get();
        model.setNome(produto.getNome());
        return produtoRepository.save(model);
    }

    public void deletar(Long id){
        produtoRepository.deleteById(id);
    }



}
