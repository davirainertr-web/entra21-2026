package com.Api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Api.entities.Produto; 



@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @GetMapping
    public String getProdutos() {
        return "lista de produtos";
    }

    @GetMapping("/{id}")
    public String getUmProduto() {
        return "retorna um produto";
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Produto produto) {
        produto.setId(1l);
        return ResponseEntity.ok(produto);
    }
    
}
