/*
Faça um algoritmo para ler três notas de um aluno em uma disciplina e imprimir a sua
média ponderada (as notas têm pesos respectivos de 1, 2 e 3).
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a 1° nota: ");
        double n1 = in.nextDouble();
        System.out.println("Digite a 2° nota: ");
        double n2 = in.nextDouble();
        System.out.println("Digite a 3° nota: ");
        double n3 = in.nextDouble();
        double media = ((n1*1) + (n2*2) + (n3*3))/6;
        System.out.println("Média: "+media);
    }
}
