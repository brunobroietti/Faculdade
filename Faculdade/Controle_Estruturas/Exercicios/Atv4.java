package Controle_Estruturas.Exercicios;

import java.util.Scanner;

public class Atv4 {
    /**
     * 4. Criar um programa que receba um número e diga se ele é um número primo.
     */
    public static void main(String[] args) {

        int contadorDeDivisores = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero para verificar se é primo: ");
        int numero = in.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                contadorDeDivisores++;
            }
        }

        if (contadorDeDivisores == 0) {
            System.out.println("\nO numero " + numero + " é primo.");
        } else {
            System.out.println("\nO numero " + numero + " não é primo.");
        }
        in.close();
    }

}