/*
Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados;
 */
package Facul.Lista7;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet[] = new int[6];
        int i, somaPar = 0;
        int contImpar = 0;
        int par[] = new int[6];
        int impar[] = new int[6];

        for(i = 0; i < 6; i++) {
            System.out.println("Digite o "+(i + 1)+"° número: ");
            vet[i] = in.nextInt();

            if(vet[i] % 2 == 0) {
                par[i] = vet[i];
                somaPar = somaPar + par[i];
            } else {
                impar[i] = vet[i];
                contImpar++;
            }
        }
        System.out.println("Números pares: ");
        for(i = 0; i < 6; i++) {
            System.out.print(par[i]+", ");
        }
        System.out.println();
        System.out.print("Soma dos números pares: "+somaPar);
        System.out.println();
        System.out.println("Números ímpares: ");
        for(i = 0; i < 6; i++) {
            System.out.print(impar[i]+", ");
        }
        System.out.println();
        System.out.print("Quantidade de números ímpares: "+contImpar);
    }
}
