/**
 *    Faça um programa que calcule o fatorial de um número inteiro fornecido pelo
 * usuário. Ex.: 5! =5.4.3.2.1=120
 */
package Facul.Lista4;

import java.util.Scanner;

public class Atv8_Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long numeroInformado;
        long fatorialAtual;

        System.out.println("Este programa recebe numero inteiro e calcula o fatorial");
        System.out.println("\nInforme o número: ");
        numeroInformado = sc.nextInt();
        System.out.println("\n\n");

        fatorialAtual = numeroInformado * (numeroInformado - 1);
        System.out.println(fatorialAtual);

        for (long i = (numeroInformado - 1); i > 1; i--) {
            fatorialAtual *= (i - 1);
            System.out.println(fatorialAtual);
        }
        System.out.println("\n---------\nFATORIAL = " + fatorialAtual);
        sc.close();
    }

}
