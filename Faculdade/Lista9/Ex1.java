/*
   Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estão na diagonal
principal.
 */
package Facul.Lista9;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int i, j, soma = 0;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.println("Digite a Coluna: "+(i + 1)+" Linha: "+(j + 1));
                matriz[i][j] = in.nextInt();
            }
        }

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                if(i == j) {
                    soma = soma + matriz[i][j];
                }
            }
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
        System.out.print("A soma dos elementos na diagonal é: "+soma);
    }
}
