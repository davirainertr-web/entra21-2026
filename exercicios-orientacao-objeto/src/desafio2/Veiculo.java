package desafio2;

public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private boolean disponivel;

    public Veiculo(String placa, String modelo, int ano, boolean disponivel) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = true;
    }

    public void alugar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Carro alugado com Sucesso!");
        } else {
            System.out.println("O carro não esta disponível para aluguel.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Carro devolvido com sucesso!");
        } else {
            System.out.println("Este carro ja está disponível");
        }
    }

    public void Informações() {
        System.out.println("Informações do Veículo");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}
