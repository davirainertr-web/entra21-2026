package exercicio1;

public class Main {

    public static void main(String[] args) {

        Objeto produto = new Objeto();

        produto.cadastrar("Notebook", 3500.00, 10);

        produto.aumentarEstoque(20);

        produto.diminuirEstoque(5);

        produto.exibirDados();
    }
}
