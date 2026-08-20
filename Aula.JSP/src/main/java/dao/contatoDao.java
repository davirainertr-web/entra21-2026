package dao;

import java.util.ArrayList;
import java.util.List;
import modelos.Contato;

public class contatoDao {
    private static List<Contato> contatos = new ArrayList<>();
    
    public void salvar(Contato ct) {
        ct.setId(contatos.size() + 1);
        contatos.add(ct);
    }
    
    public List<Contato> consultar() {
        return contatos;
    }

    public void excluir(int id) {
        contatos.removeIf(c -> c.getId() == id);
    }
}