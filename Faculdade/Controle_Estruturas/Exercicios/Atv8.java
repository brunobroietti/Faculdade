/**
 * 8. Criar um programa que receba uma palavra e imprime no console letra por letra.
 */
package Controle_Estruturas.Exercicios;

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a palavra: ");
        String palavra = in.nextLine();

        char letras[] = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }

        in.close();
    }
}
