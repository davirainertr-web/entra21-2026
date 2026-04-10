import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        jogoVelha();
    }

    static void jogoVelha() {

        Scanner sc = new Scanner(System.in);

        String[][] tabuleiro = {
            {"1","2","3"},
            {"4","5","6"},
            {"7","8","9"}
        };

        String jogador = "X";

        while (true) {
        	
        	System.out.println("");

            for (int i = 0; i < 3; i++) {
                System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
                if (i < 2) System.out.println("---+---+---");
            }
            
            System.out.println("");

            System.out.println("Jogador: " + jogador);

            System.out.print("Digite o número da posição: ");
            String antiga = sc.next();

            boolean encontrou = false;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (tabuleiro[i][j].equals(antiga)) {
                        tabuleiro[i][j] = jogador;
                        encontrou = true;
                    }
                }
            }

            if (!encontrou) {
                System.out.println("Posição inválida!");
                continue;
            }

            if (verificarVitoria(tabuleiro, jogador)) {
                System.out.println("\nJogador " + jogador + " venceu!");

                for (int i = 0; i < 3; i++) {
                    System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
                    if (i < 2) System.out.println("---+---+---");
                }

                break;
            }

            if (verificarEmpate(tabuleiro)) {
                System.out.println("\nDeu empate!");

                for (int i = 0; i < 3; i++) {
                    System.out.println(" " + tabuleiro[i][0] + " | " + tabuleiro[i][1] + " | " + tabuleiro[i][2]);
                    if (i < 2) System.out.println("---+---+---");
                }

                break;
            }

            jogador = jogador.equals("X") ? "O" : "X";
        }

        sc.close();
    }

    static boolean verificarVitoria(String[][] t, String jogador) {

        for (int i = 0; i < 3; i++) {
            if (t[i][0].equals(jogador) &&
                t[i][1].equals(jogador) &&
                t[i][2].equals(jogador)) return true;
        }

        for (int i = 0; i < 3; i++) {
            if (t[0][i].equals(jogador) &&
                t[1][i].equals(jogador) &&
                t[2][i].equals(jogador)) return true;
        }

        if (t[0][0].equals(jogador) &&
            t[1][1].equals(jogador) &&
            t[2][2].equals(jogador)) return true;

        if (t[0][2].equals(jogador) &&
            t[1][1].equals(jogador) &&
            t[2][0].equals(jogador)) return true;

        return false;
    }

    static boolean verificarEmpate(String[][] t) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (!t[i][j].equals("X") && !t[i][j].equals("O")) {
                    return false;
                }
            }
        }

        return true;
    }
}
