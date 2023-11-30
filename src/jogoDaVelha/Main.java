package jogoDaVelha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] tabuleiro = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        char player = 'X';

        Scanner input = new Scanner(System.in);

        for (int rodada = 1; rodada <= 9; rodada++) {
            Jogo.tabuleiro(tabuleiro);

            System.out.println("Jogador " + player + " informe a linha (0, 1, 2): ");
            int linha = Integer.parseInt(input.nextLine());
            System.out.println("Informe a coluna (0, 1, 2): ");
            int coluna = Integer.parseInt(input.nextLine());

            if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != ' ') {
                System.out.println("Jogada inválida. Tente novamente.");
                rodada--;
                continue;
            }

            tabuleiro[linha][coluna] = player;

            if (Jogo.winner(tabuleiro, player)) {
                Jogo.tabuleiro(tabuleiro);
                System.out.println("Jogador " + player + " venceu!");
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        }

        if (!Jogo.winner(tabuleiro, 'X') && !Jogo.winner(tabuleiro, 'O')) {
            Jogo.tabuleiro(tabuleiro);
            System.out.println("O jogo deu velha!");
        }
        input.close();
    }
}
