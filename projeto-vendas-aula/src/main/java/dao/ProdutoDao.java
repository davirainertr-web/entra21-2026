package dao;

import java.util.ArrayList;
import java.util.List;

import modelos.Produto;

public class ProdutoDao {

    private static List<Produto> produtos = new ArrayList<>();

    public void salvar1(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> consultar1() {
        return produtos;
    }
    
    public void salvar(Produto produto){
        produtos.add(produto);
    }

    public List<Produto> consultar(){
        return produtos;
    }

    public Produto consultar(int id){

        if(id <= 0 || id > produtos.size()){
            return null;
        }

        return produtos.get(id - 1);
    }

}