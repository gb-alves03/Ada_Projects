package jogoDaVelha;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

    public static void tabuleiro(char[][] tabuleiro) {
        System.out.println(" 0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.println(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.println("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println(" -----");
            }
        }
        System.out.println();
    }

    public static boolean winner(char[][] tabuleiro, char jogador) {
        for (int i = 0; i < 3; i++) {
            if ((tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) ||
                    (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)) {
                return true;
            }
        }
        if ((tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) ||
                (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador)) {
            return true;
        }
        return false;
    }

}
