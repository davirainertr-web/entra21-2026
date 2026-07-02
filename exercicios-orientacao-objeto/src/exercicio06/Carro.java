package exercicio06;

public class Carro {
    String modelo;
    String marca;
    double velocidadeAtual;

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = 0.0;
    }

    public void acelerar(double velocidade) {
        if (velocidade > 0) {
            this.velocidadeAtual += velocidade;
        } else {
            System.out.println("Acelerando " + velocidade + " km/h");
        }
    }

    public void frear(double velocidade) {
        if (velocidade > 0) {
            this.velocidadeAtual -= velocidade;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("Freando " + velocidade + " km/h");
        }
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}
