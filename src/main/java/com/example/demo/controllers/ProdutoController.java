package com.example.demo.controllers;

import com.example.demo.models.ProdutoModel;
import com.example.demo.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    public ResponseEntity<List<ProdutoModel>> findAll(){
        List<ProdutoModel> request = produtoService.findAll();
        return ResponseEntity.ok().body(request);
    }
}
