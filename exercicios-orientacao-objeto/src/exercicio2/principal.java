package exercicio2;

public class principal {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("12345-6", "João Silva");

        conta.depositar(1000);
        conta.sacar(300);
        conta.sacar(900);

        conta.ExibirDados();

    }
}