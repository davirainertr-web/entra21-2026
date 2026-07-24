package dao;

import java.util.ArrayList;
import java.util.List;

import modelos.Cliente;
import modelos.ItemPedido;
import modelos.Pedido;

public class PedidoDao {

    private static List<Pedido> pedidos = new ArrayList<>();

    public Pedido criarPedido(Cliente cliente){

        Pedido pedido = new Pedido();

        pedido.setId(pedidos.size() + 1);
        pedido.setCliente(cliente);

        return pedido;

    }

    public void salvar(Pedido pedido){

        pedidos.add(pedido);

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

    public void adicionarItem(Pedido pedido, ItemPedido item){

        pedido.getItens().add(item);

    }

    public void removerItem(Pedido pedido, ItemPedido item){

        pedido.getItens().remove(item);

    }

}