/*
   Faça um programa que leia um vetor de 10 números. Leia um número x. Conte os múltiplos
de um número inteiro x num vetor e mostre-os na tela.
 */
package Facul.Lista6;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.println("Informe o valor da posição "+i);
            vet[i] = sc.nextInt();
        }

        System.out.println("Informe o valor X");
        int x = sc.nextInt();


        System.out.print("Os multiplos de X sao:");
        for (int i = 0; i < 10; i++){
            if (vet[i] % x == 0){
                System.out.print(vet[i]+" ");
            }
        }
    }
}
