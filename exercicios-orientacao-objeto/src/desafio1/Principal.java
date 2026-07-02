package desafio1;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Moby Dick", "Matheus", 10);
        Livro livro2 = new Livro("A Hora da Estrela", "Cristiane", 30);

        Usuario usuario = new Usuario("Pedro Henrique", 17867);

        usuario.exibirUsuario();

        livro.emprestarLivro();
        livro2.emprestarLivro();

        livro.devolverLivro();
        livro2.devolverLivro();

        livro.exibirLivro();
        livro2.exibirLivro();
    }
}
