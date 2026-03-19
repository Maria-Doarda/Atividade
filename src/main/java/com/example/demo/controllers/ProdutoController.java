package com.example.demo.controllers;

import com.example.demo.models.ProdutoModel;
import com.example.demo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> findAll(){
        List<ProdutoModel> request = produtoService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @PostMapping
    public ResponseEntity<ProdutoModel> criarProduto(@RequestBody ProdutoModel produtoModel){
        ProdutoModel request = produtoService.criarProduto(produtoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("{/id}").buildAndExpand(produtoModel.getId()).toUri();
                return ResponseEntity.created(uri).body(request);
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> buscarId(@PathVariable Long id){
        return produtoService.buscarId(id);
    }

    @PutMapping
    public ProdutoModel atualizar(@PathVariable Long id, @RequestBody ProdutoModel produtoModel){
        return produtoService.atualizar(id, produtoModel);
    }
}
