/*
   Leia uma matriz 5 x 5. Leia também um valor X. O programa deverá fazer uma busca desse
valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem de “não
encontrado”.
 */
package Facul.Lista8;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int matrizValores[] = new int[25];
        int i, j, x;
        int coluna = 0, linha = 0;
        int maiorValor = 0;

        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.println("Coluna = "+(i + 1)+" Linha = "+(j + 1));
                matriz[i][j] = in.nextInt();

                matrizValores[i] = matriz[i][j];

                if(matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                }
            }
        }
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
        System.out.println("Digite um número existente na matriz: ");
        x = in.nextInt();

        for(i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                if(x == matriz[i][j]) {
                    linha = i + 1;
                    coluna = j + 1;
                }
            }
        }
        if(x != matrizValores[i]) {
            System.out.println("Valor não encontrado!");
        }
        System.out.println("X está localizado na coluna "+coluna+" e na linha "+linha);
    }
}
