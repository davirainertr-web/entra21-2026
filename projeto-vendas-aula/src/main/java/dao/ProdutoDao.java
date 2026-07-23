package dao;

import java.util.ArrayList;
import java.util.List;

import modelos.Produto;

public class ProdutoDao {

    private static List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> consultar() {
        return produtos;
    }

}