package exercicio02;

public class principal {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("56251-96", "Pablo Vegetti");

        conta.depositar(1000);
        conta.sacar(300);
        conta.sacar(900);

        conta.ExibirDados();

    }
}