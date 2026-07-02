package exercicio10;

public class Principal {
    public static void main(String[] args) {

        Celular celular = new Celular("Iphone", 100);

        celular.mostrarBateria();

        celular.usar(50);
        celular.carregar();
        celular.carregar();
        celular.carregar();
        celular.carregar();

        celular.mostrarBateria();
 }
}
