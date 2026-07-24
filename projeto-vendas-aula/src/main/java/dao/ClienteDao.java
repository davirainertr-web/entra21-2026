package dao;

import java.util.ArrayList;
import java.util.List;

import modelos.Cliente;

public class ClienteDao {

    private static List<Cliente> clientes = new ArrayList<>();

    public void salvar(Cliente cliente){
        clientes.add(cliente);
    }

    public List<Cliente> consultar(){
        return clientes;
    }

    public Cliente consultar(int id){

        for(Cliente cliente : clientes){

            if(cliente.getId() == id){

                return cliente;

            }

        }

        return null;

    }
    
    public void excluir(int id){

        Cliente cliente = consultar(id);

        if(cliente != null){

            clientes.remove(cliente);

        }

    }

}