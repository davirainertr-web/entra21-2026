package desafio1;

public class Livro {
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, int quantidadeDisponível) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponível;
    }

    public void emprestarLivro() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("Livro não está disponível para empréstimo.");
        }
    }

    public void devolverLivro() {
        quantidadeDisponivel++;
        System.out.println("Livro devolvido com sucesso.");
    }

    public void exibirLivro() {
        System.out.println("Informações do Livro");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Quantidade disponível: " + quantidadeDisponivel);
    }
}
