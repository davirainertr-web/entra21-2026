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
    
    public void alterar(int id, Cliente novoCliente){

        Cliente cliente = consultar(id);

        if(cliente != null){

            cliente.setCpf(novoCliente.getCpf());
            cliente.setNome(novoCliente.getNome());
            cliente.setEmail(novoCliente.getEmail());
            cliente.setCep(novoCliente.getCep());
            cliente.setRua(novoCliente.getRua());
            cliente.setNumero(novoCliente.getNumero());
            cliente.setBairro(novoCliente.getBairro());
            cliente.setCidade(novoCliente.getCidade());
            cliente.setEstado(novoCliente.getEstado());

        }

    }

}