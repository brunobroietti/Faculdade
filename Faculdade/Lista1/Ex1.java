/*
1. A imobiliária Imóbilis vende apenas terrenos retangulares. Faça um algoritmo para ler
as dimensões de um terreno e depois exibir a área do terreno.
 */

package Facul.Lista1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado 1: ");
        float n1 = in.nextFloat();
        System.out.println("Digite o tamanho do lado 2: ");
        float n2 = in.nextFloat();
        float area = n1*n2;
        System.out.println("A área do retângulo é: "+area+" metros quadrados");
    }
}
