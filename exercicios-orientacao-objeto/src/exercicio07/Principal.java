package exercicio07;

public class Principal {
    public static void main(String[] args) {

        lampada lampada = new lampada();

        lampada.mostrarEstado();

        lampada.ligar();
        lampada.mostrarEstado();

        lampada.desligar();
        lampada.mostrarEstado();
    }
}
