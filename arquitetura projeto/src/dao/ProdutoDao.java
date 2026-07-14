package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import interfaces.ICRUD;
import modelos.Produto;

import utils.ConectaDB;

public class ProdutoDao implements ICRUD {

    @Override
    public Produto salvar(Produto prod) {
        String sql = "insert into tb_produtos(descricao, preco) values(?,?)";

        Connection con = ConectaDB.conectar();
        try {
            PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, prod.getDescricao());
            stm.setDouble(2, prod.getPreco());
            stm.execute();

            ResultSet rs = stm.getGeneratedKeys();

            if(rs.next()) {
                prod.setId(rs.getInt(1));
            }

            stm.close();;
            con.close();
            rs.close();

            return prod;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void deletar(int id) {
        String sql = "DELETE FROM tb_produtos WHERE id = ?";
 
        Connection con = ConectaDB.conectar();
 
        try {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setInt(1, id);
 
            stm.executeUpdate();
 
            stm.close();
            con.close();
 
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Produto prod) {
        System.out.println("alterando produto: " + prod.getId());
    }

    @Override
    public Produto consultar(int id) {
        Produto produto = null;
        Connection con = ConectaDB.conectar();
       try {
        PreparedStatement stm = con.prepareStatement("select * from tb_Produtos where id = ?");
        stm.setInt((1), id);
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            produto = new Produto(rs.getInt(1),rs.getString(2),rs.getDouble(3));
        }
        rs.close();
        stm.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return produto;
    }

    @Override
    public List<Produto> consultar() {
       List<Produto> produtos = new ArrayList<Produto>();
       Connection con = ConectaDB.conectar();
       try {
        PreparedStatement stm = con.prepareStatement("select * from tb_Produtos");
        ResultSet rs = stm.executeQuery();
        while (rs.next()) {
            Produto p = new Produto(rs.getInt(1),rs.getString(2),rs.getDouble(3));
            produtos.add(p);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

       return produtos;
    }
    
}
