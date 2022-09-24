/*
   Faça um programa para gerar automaticamente números entre 0 e 99 de uma cartela de
bingo. Sabendo que cada cartela deverá conter 5 linhas de 5 números, gere estes dados de
modo a não ter números repetidos dentro das cartelas. O programa deve exibir na tela a cartela
gerada.
 */
package Facul.Lista9;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        int cartela[][] = new int[5][5];
        int numeroCartela[] = new int[25];
        Random rn = new Random();
        int i, j, p = 0, num, cont = 0;

        for(i = 0; i < 25; i++) {
            numeroCartela[i] = 100;
        }

        while(tem(numeroCartela, 100)) {
            num = rn.nextInt(100);

            if(!tem(numeroCartela, num)) {
                numeroCartela[cont] = num;
                cont++;
            }
        }

        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                cartela[i][j] = numeroCartela[p];
                p++;
            }
        }

        for(i = 0 ; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.print("["+cartela[i][j]+"]");
            }
            System.out.println();
        }
    }

        public static boolean tem(int vet[], int num) {
            return Arrays.stream(vet).anyMatch(i -> i == num);
    }
}