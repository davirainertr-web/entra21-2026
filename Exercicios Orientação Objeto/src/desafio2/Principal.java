package desafio2;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("RAH-019Y", "Nivus", 2021, false);

        veiculo.alugar();
        veiculo.devolver();
        veiculo.Informações();
    }
}
