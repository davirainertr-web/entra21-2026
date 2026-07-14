import java.util.List;

import dao.ProdutoDao;
import modelos.Produto;

public class Main {
public static void main(String[] args) {
    Produto p1 = new Produto("Maça", 50.85);

    ProdutoDao dao = new ProdutoDao();

    /*Produto retorno = dao.salvar(p1);
     System.out.println(retorno.getId() + " - " + retorno.getDescricao());
     /*List<Produto> lista = dao.consultar();
     for (Produto p : lista) {
        System.out.println(p.getId() + " - " + p.getDescricao() + " " + p.getPreco());
    
     }
        /* */
    /*Produto p = dao.consultar(4);
    System.out.println(p.getId() + " " + p.getDescricao() + " " + p.getPreco());/* */

    dao.deletar(3);


 }
}