import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroProdutos {
    private static List<Produto> lista = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static int geradorId = 1; 

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("\n1.Cadastrar | 2.Alterar | 3.Excluir | 4.Buscar | 5.Listar | 6.Preço | 0.Sair\nOpção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> alterar();
                case 3 -> excluir();
                case 4 -> buscar();
                case 5 -> listar();
                case 6 -> ajustarPreco();
            }
        } while (opcao != 0);
    }

    private static void cadastrar() {
        Produto p = new Produto();
        p.id = geradorId++;
        System.out.print("Descrição: "); p.descricao = sc.nextLine();
        System.out.print("Preço:  ");     p.preco = sc.nextDouble();
        System.out.print("Estoque: ");   p.estoque = sc.nextInt(); sc.nextLine();
        System.out.print("Medida: ");    p.medida = sc.nextLine();
        lista.add(p);
        System.out.println("Cadastrado com ID: " + p.id);
    }

    private static void alterar() {
        System.out.print("ID do produto: ");
        Produto p = achar(sc.nextInt()); sc.nextLine();
        if (p != null) {
            System.out.print("Nova descrição (Enter p/ manter): ");
            String desc = sc.nextLine();
            if (!desc.isBlank()) p.descricao = desc;
            System.out.print("Novo preço (-1 p/ manter): ");
            double prc = sc.nextDouble();
            if (prc >= 0) p.preco = prc;
        } else System.out.println("Não encontrado.");
    }

    private static void excluir() {
        System.out.print("ID p/ excluir: ");
        Produto p = achar(sc.nextInt());
        if (p != null) { lista.remove(p); System.out.println("Excluído."); }
        else System.out.println("Não encontrado.");
    }

    private static void buscar() {
        System.out.print("Termo de busca: ");
        String termo = sc.nextLine().toLowerCase();
        lista.stream().filter(p -> p.descricao.toLowerCase().contains(termo)).forEach(Produto::display);
    }

    private static void listar() {
        if (lista.isEmpty()) System.out.println("Lista vazia.");
        else lista.forEach(Produto::display);
    }

    private static void ajustarPreco() {
        System.out.print("ID do produto: ");
        Produto p = achar(sc.nextInt());
        if (p != null) {
            System.out.print("1.Desconto | 2.Acréscimo: "); int tipo = sc.nextInt();
            System.out.print("Percentual (%): ");          double pct = sc.nextDouble();
            if (tipo == 1) p.desconto(pct); else p.acrescimo(pct);
            System.out.println("Novo preço: R$ " + p.preco);
        } else System.out.println("Não encontrado.");
    }

    private static Produto achar(int id) {
        return lista.stream().filter(p -> p.id == id).findFirst().orElse(null);
    }
}

class Produto {
    int id; String descricao; double preco; int estoque; String medida;

    void display() {
        System.out.printf("ID: %d | %s | R$ %.2f | Estq: %d (%s)\n", id, descricao, preco, estoque, medida);
    }

    void desconto(double pct) { if (pct > 0) this.preco -= this.preco * (pct / 100); }
    void acrescimo(double pct) { if (pct > 0) this.preco += this.preco * (pct / 100); }
}