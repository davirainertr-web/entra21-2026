package exercicio10;

public class Celular {
    String modelo;
    int bateria;

    public Celular(String modelo, int bateria) {
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public void carregar() {
        bateria += 10;
        if (bateria > 100) {
            bateria = 100;
        }
    }

    public void usar(int percentual) {
        bateria -= percentual;
        if (bateria < 0) {
            bateria = 0;
        }
    }

    public void mostrarBateria() {
        System.out.println("Celular: " + modelo);
        System.out.println("Bateria atual: " + bateria + "%");
    }
}
