package com.Api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Api.entities.Produto;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();


    @GetMapping
    public ResponseEntity<List<Produto>> getProdutos() {
        return ResponseEntity.status(HttpStatus.OK).body(produtos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable long id) {
        for (Produto prod : produtos) {
            if (prod.getId() == id) {
                return ResponseEntity.status(HttpStatus.OK).body(prod);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Produto produto) {
        produto.setId((long) (produtos.size() + 1));
        produtos.add(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> alterar(@PathVariable long id, @RequestBody Produto produto) {
        for (Produto prod : produtos) {
            if (prod.getId() == id) {
                prod.setDescricao(produto.getDescricao());
                prod.setPreco(produto.getPreco());
                prod.setEstoque(produto.getEstoque());
                return ResponseEntity.status(HttpStatus.OK).body(prod);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable long id) {
        for (Produto prod : produtos) {
            if (prod.getId() == id) {
                produtos.remove(prod);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Produto não encontrado");
    }
}