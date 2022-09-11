/*
   Escreva um programa que leia um número inteiro positivo N e em seguida imprima N linhas
do chamado Triangulo de Pascal:
 */
package Facul.Lista7;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, c, i, linha;

        System.out.print("Informe a quantidade de linhas: ");
        n = in.nextInt();

        for(linha = 1; linha <= n; linha++) {
            c = 1;
            for(i = 1; i <= linha; i++) {
                System.out.print(c + " ");
                c = c * (linha - i) / i;
            }
            System.out.println();
        }
    }
}
