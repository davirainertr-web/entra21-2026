package exercicio05;

public class Principal {

    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");

        livro.exibirInformacoes();

        livro.emprestar();
        livro.exibirInformacoes();

        livro.emprestar();

        livro.devolver();
        livro.exibirInformacoes();
    }
}
