/*
   Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estão abaixo da
diagonal principal.
 */
package Facul.Lista9;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int i, j, soma = 0;

        for(i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Insira a Coluna: " + (i + 1) + " Linha: " + (j + 1));
                matriz[i][j] = in.nextInt();
            }
        }
            soma = matriz[0][0] + matriz[2][2];

            for(i = 0; i < 3; i++) {
                for(j = 0; j < 3; j++) {
                    System.out.print("["+matriz[i][j]+"]");
                }
                System.out.println();
            }
            System.out.println("A soma dos elementos abaixo da diagonal não: "+soma);
        }
    }
