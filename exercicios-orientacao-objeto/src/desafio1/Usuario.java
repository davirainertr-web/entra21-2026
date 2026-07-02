package desafio1;

public class Usuario {
    String nome;
    int matricula;

    public Usuario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirUsuario() {
        System.out.println("Informações do Usuráio");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}
