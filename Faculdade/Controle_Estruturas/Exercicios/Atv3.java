/*
3. Criar um programa que receba duas notas parciais, calcular a média final.
   Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
   a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", caso contrário
   imprime no console "Reprovado".
 */
package Controle_Estruturas.Exercicios;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = in.nextDouble();

        if(nota >= 7.0 && nota <= 10) {
            System.out.println("Aprovado.");
        } else if(nota < 7.0 && nota >= 4.0) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
