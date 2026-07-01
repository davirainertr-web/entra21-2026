package exercicio4;

public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.cadastrar("Carlos", 3000.00);

        double salarioAntigo = funcionario.getSalario();

        funcionario.aumentarSalario(15);

        double salarioNovo = funcionario.getSalario();

        System.out.println("Salário antigo: R$ " + salarioAntigo);
        System.out.println("Salário novo: R$ " + salarioNovo);
        System.out.println("Salário anual: R$ " + funcionario.calcularSalarioAnual());
    }
}