package exercicio9;

public class principal {
    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado(30);

        ar.exibirInformacoes();

        ar.diminuirTemperatura();
        ar.exibirInformacoes();

        ar.diminuirTemperatura();
        ar.exibirInformacoes();

        ar.aumentarTemperatura();
        ar.exibirInformacoes();
    }
}