package exercicio3;

public class principal {

    public static void main(String[] args) {

        aluno aluno = new aluno("Yuri Alberto", 2.0, 2.5);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Situação: " + aluno.verificarSituacao());
    }
}
