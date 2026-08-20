package dao;

import java.util.ArrayList;
import java.util.List;

import modelos.Cliente;
import modelos.ItemPedido;
import modelos.Pedido;
import modelos.Produto;

public class PedidoDao {

    private static List<Pedido> pedidos = new ArrayList<>();

    public Pedido criarPedido(Cliente cliente){

        Pedido pedido = new Pedido();

        pedido.setId(pedidos.size() + 1);
        pedido.setCliente(cliente);

        return pedido;

    }

    public boolean salvar(Pedido pedido){

        if(pedido == null){
            return false;
        }

        if(pedido.getItens().isEmpty()){
            return false;
        }

        if(!pedidos.contains(pedido)){
            pedidos.add(pedido);
        }

        return true;

    }

    public List<Pedido> consultar(){

        return pedidos;

    }

    public Pedido consultar(int id){

        for(Pedido pedido : pedidos){

            if(pedido.getId() == id){
                return pedido;
            }

        }

        return null;

    }


    public void adicionarItem(Pedido pedido, Produto produto, int quantidade){

        for(ItemPedido item : pedido.getItens()){

            if(item.getProduto().getId() == produto.getId()){

                item.setQuantidade(item.getQuantidade() + quantidade);

                return;

            }

        }

        pedido.getItens().add(new ItemPedido(produto, quantidade));

    }

    public void removerItem(Pedido pedido, int idProduto, int quantidade){

        for(int i = 0; i < pedido.getItens().size(); i++){

            ItemPedido item = pedido.getItens().get(i);

            if(item.getProduto().getId() == idProduto){

                if(quantidade >= item.getQuantidade()){

                    pedido.getItens().remove(i);

                }else{

                    item.setQuantidade(item.getQuantidade() - quantidade);

                }

                return;

            }

        }

    }

}