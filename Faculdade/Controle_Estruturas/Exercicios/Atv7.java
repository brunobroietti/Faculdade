/**
 * 7. Criar um programa que enquanto estiver recebendo números positivos, imprime no console a soma dos números
 * inseridos, caso receba um número negativo, encerre o programa. Tente utilizar a estrutura do while.
 */
package Controle_Estruturas.Exercicios;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int soma = 0;
        int n1;
        int n2 = 1;

        do {
            System.out.print("Digite um número inteiro: ");
            n1 = in.nextInt();

            soma = soma + n1;
        } while (n1 >= 0);
        System.out.println("Soma dos números inseridos: "+soma);
    }
}
