/**
 *  4. Faça um programa que leia 10 números e imprima quantos são pares e quantos são
 * ímpares.
 */
package Facul.Lista4;

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, quant = 0;
        int par = 0, impar = 0;

        while(quant < 4) {
            quant++;
            System.out.print("Digite um número: ");
            n1 = in.nextInt();
            if(n1 % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Quantidade de números pares: "+par);
        System.out.println("Quantidade de números impares: "+impar);
    }
}