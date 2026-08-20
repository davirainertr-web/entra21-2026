import java.util.List;
import dao.ProdutoDao;
import modelos.Produto;

public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Picanha", 49.85);
        
        ProdutoDao dao = new ProdutoDao();
        
        /*
        Produto retorno = dao.salvar(p1);
        System.out.println(retorno.getId() + " " + retorno.getDescricao());
        
        List<Produto> lista = dao.consultar();
        for (Produto p : lista ) {
            System.out.println(p.getId() + " " + p.getDescricao() + " " + p.getPreco());    
        }
        */

        Produto p = dao.consultar(4);
        
        if (p != null) {
            System.out.println("Antes: " + p.getId() + " " + p.getDescricao() + " " + p.getPreco());
            
            p.setDescricao("Alcatra");
            p.setPreco(39.99);
            dao.alterar(p);
            
            Produto alterado = dao.consultar(4);
            System.out.println("Depois: " + alterado.getId() + " " + alterado.getDescricao() + " " + alterado.getPreco());
        } else {
            System.out.println("Produto com ID 4 não existe no banco de dados para ser alterado.");
        }
        
        /*
        dao.deletar(3);
        Produto pDeletado = dao.consultar(3);
        if(pDeletado != null) {
            System.out.println(pDeletado.getId() + " " + pDeletado.getDescricao() + " " + pDeletado.getPreco());
        } else {
            System.out.println("Produto não encontrado");
        }
        */
    } 
} 