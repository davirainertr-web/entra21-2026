package dao;

import java.util.ArrayList;
import java.util.List;

import modelos.Produto;

public class ProdutoDao {

    private static List<Produto> produtos = new ArrayList<>();

    public void salvar(Produto produto) {

        produto.setId(produtos.size() + 1);

        produtos.add(produto);

    }

    public List<Produto> consultar(){
        return produtos;
    }

    public Produto consultar(int id) {

        for (Produto produto : produtos) {

            if (produto.getId() == id) {
                return produto;
            }

        }

        return null;

    }
    
    public boolean baixarEstoque(int id, int quantidade){

        Produto produto = consultar(id);

        if(produto == null){
            return false;
        }

        if(produto.getEstoque() < quantidade){
            return false;
        }

        produto.setEstoque(produto.getEstoque() - quantidade);

        return true;
    }
    
    public void alterar(int id, Produto novoProduto){

        Produto produto = consultar(id);

        if(produto != null){

            produto.setDescricao(novoProduto.getDescricao());
            produto.setPreco(novoProduto.getPreco());
            produto.setEstoque(novoProduto.getEstoque());

        }

    }
    
    public void devolverEstoque(int id, int quantidade){

        Produto produto = consultar(id);

        if(produto != null){

            produto.setEstoque(

                produto.getEstoque() + quantidade

            );

        }

    }
    
    public void excluir(int id){

        Produto produto = consultar(id);

        if(produto != null){

            produtos.remove(produto);

        }

    }
    
    public boolean possuiEstoque(int id, int quantidade){

        Produto produto = consultar(id);

        if(produto == null){
            return false;
        }

        return produto.getEstoque() >= quantidade;

    }
    
}