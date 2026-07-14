package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import interfaces.ICRUD;
import modelos.Produto;

import utils.ConectaDB;

public class ProdutoDao implements ICRUD {

    @Override
    public Produto salvar(Produto prod) {
        String sql = "insert into tb_produtos(descricao, preco) values(?,?)";

        Connection con = ConectaDB.conectar();
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, prod.getDescricao());
            stm.setDouble(2, prod.getPreco());
            stm.execute();

            stm.close();;
            con.close();

            return prod;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void deletar(int id) {
        System.out.println("Deletando produto: " + id);
    }

    @Override
    public void alterar(Produto prod) {
        System.out.println("alterando produto: " + prod.getId());
    }

    @Override
    public Produto consultar(int id) {
        return null;
    }

    @Override
    public List<Produto> consultar() {
       return null;
    }
    
}
