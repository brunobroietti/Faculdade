/**
 * 1. Faça um programa que leia número reais maiores que zero. Quando for entrado o
 * número zero, o programa deverá apresentar quantos números foram entrados e a
 * média destes.
 */
package Facul.Lista4;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, soma, media;
        int cont = 0;
        soma = 0;

        do {
            System.out.println("Digita um número: ");
            n1 = in.nextDouble();
            soma = n1 + soma;
            cont++;
            if(n1 == 0.0) {
                cont = cont -1;
            }
        } while(n1 != 0.0);


        System.out.println();
        media = soma/cont;
        System.out.println("Foram digitados "+cont+" números.");
        System.out.println("Soma dos números digitados: "+soma);
        System.out.println("Media dos números digitados "+media);

        in.close();
    }
}
