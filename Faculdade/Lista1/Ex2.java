/*
Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar
todos os cavalos comprados para um haras.
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de cavalos: ");
        int n1 = in.nextInt();
        int resultado = n1 * 4;
        System.out.println("O resultado de ferraduras é: "+resultado);
    }
}
