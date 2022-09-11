/*
   Faça um programa que receba do usuário dois vetores, A e B, com 10 números inteiros cada.
Crie um vetor denominado C calculando C = A – B*A. Mostre na tela os dados do vetor C.
 */
package Facul.Lista7;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c = 0;
        int i;

        for(i = 0; i < 10; i++) {
            System.out.println("Digite o "+(i + 1)+"° valor do vetor A: ");
            a[i] = in.nextInt();
        }
        for(i = 0; i < 10; i++) {
            System.out.println("Digite o "+(i + 1)+"° valor do vetor B: ");
            b[i] = in.nextInt();

            c = c +(a[i] - (b[i]*a[i]));
        }
        System.out.println(c);
    }
}
