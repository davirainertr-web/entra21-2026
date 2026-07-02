package exercicio07;

public class lampada {
    private boolean ligada;

    public lampada() {
        this.ligada = false;
    }

    public void ligar() {
        ligada = true;
        System.out.println("lâmpada ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("lâmpada desligada");
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("Estado: LIGADA");
        } else {
            System.out.println("Estado: DESLIGADA");
        }
    }
}