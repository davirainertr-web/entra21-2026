package interfaces;
import java.util.List;
import modelos.pig;

public interface ICRUD {
    pig salvar(pig pig);
    void deletar(int id);
    void alterar(pig pig);
    pig consultar(int id);
    List<pig> consultar();
    
} 