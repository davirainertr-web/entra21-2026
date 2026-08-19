package com.Api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.entities.Produto;
import com.Api.repositories.ProdutoRespository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRespository respository;

    public Produto salvar(Produto produto) {
        if (produto.getDescricao().isEmpty()) {
            throw new RuntimeException("A descrição deve ser informada");
        }

        if (produto.getPreco() < 0) {
            throw new RuntimeException("O preço não pode ser negativo");
        }

        if (produto.getEstoque() < 0) {
            produto.setEstoque(1);
        }

        return respository.save(produto);
    }

    public List<Produto> consultar() {
        return respository.findAll();
    }

    public Produto getUm(Long id) {
        Optional<Produto> opt = respository.findById(id); 
        Produto prod = opt.orElseThrow(() -> new RuntimeException("Produto não encontrado"));
        return prod;
    }

    public Produto alterar(Long id, Produto produto) {
        Produto prod = getUm(id);

        prod.setDescricao(produto.getDescricao());
        prod.setPreco(produto.getPreco());
        prod.setEstoque(produto.getEstoque());

        return respository.save(prod);
    }

    public void excluir(Long id) {
    respository.deleteById(id);
    }
}
