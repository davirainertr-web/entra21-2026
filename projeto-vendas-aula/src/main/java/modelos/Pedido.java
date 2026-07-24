package modelos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private Cliente cliente;
    private List<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public double getTotal() {

        double total = 0;

        for(ItemPedido item : itens) {
            total += item.getSubtotal();
        }

        return total;
    }

}