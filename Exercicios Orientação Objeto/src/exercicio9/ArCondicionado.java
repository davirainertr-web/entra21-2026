package exercicio9;

public class ArCondicionado {

    int temperaturaAtual;

    public ArCondicionado(int temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public void aumentarTemperatura() {
        if (temperaturaAtual < 30) {
            temperaturaAtual++;
        }
    }

    public void diminuirTemperatura() {
        if (temperaturaAtual > 16) {
            temperaturaAtual--;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Ar Condicionado:");
        System.out.println("Temperatura atual: " + temperaturaAtual + "°C");
        System.out.println("Limite mínimo: 16°C");
        System.out.println("Limite máximo: 30°C");
    }
}