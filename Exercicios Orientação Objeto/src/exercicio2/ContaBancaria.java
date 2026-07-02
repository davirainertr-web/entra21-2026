package exercicio2;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("você precisa depositar um valor maior que zero");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("saldo de R$" + valor + "realizado com sucesso");
        }
    }

    public double ConsultarSaldo() {
        return saldo;
    }

    public void ExibirDados() {
        System.out.println("\n=== Dados da Conta ===");
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }
}
