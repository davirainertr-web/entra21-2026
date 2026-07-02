package exercicio04;

public class Funcionario {

    private String nome;
    private double salario;

    public void cadastrar(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void exibirDados() {
        System.out.println("\n=== Dados do Funcionário ===");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}