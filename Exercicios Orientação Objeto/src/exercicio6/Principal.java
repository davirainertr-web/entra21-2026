package exercicio6;

public class Principal {
    public static void main(String[] args) {

        Carro carro = new Carro("Civic", "Honda");

        carro.exibirVelocidade();

        carro.acelerar(50);
        carro.exibirVelocidade();

        carro.acelerar(30);
        carro.exibirVelocidade();

        carro.frear(60);
        carro.exibirVelocidade();

        carro.frear(50);
        carro.exibirVelocidade();
    }
}