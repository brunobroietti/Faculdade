/**
1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
 */
package Controle_Estruturas.Exercicios;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = in.nextInt();

        if(n1 <= 10 && n1 >= 0) {
            if(n1 % 2 == 0) {
                System.out.println(n1+" é par.");
            } else {
                System.out.println(n1+" é impar.");
            }
        } else {
            System.out.println("Número inválido...");
        }
    }
}
