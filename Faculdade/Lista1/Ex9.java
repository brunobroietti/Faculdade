/*
Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma
sendo vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o
usuário forneça a quantidade de camisetas pequenas, médias e grandes referentes a
uma venda, e a máquina informe quanto será o valor arrecadado.
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a quantidade de camisetas P desejadas: ");
        int p = s.nextInt();
        System.out.println("Quantidade de camisetas M: ");
        int m = s.nextInt();
        System.out.println("Quantidade de camisetas G: ");
        int g = s.nextInt();
        int preco = ((10*p) + (12*m) + (15*g));
        System.out.println("O valor a ser arreacadado será: "+preco);
    }
}
