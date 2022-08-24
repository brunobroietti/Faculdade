/**
 *    Faça um programa que calcule o número médio de alunos por turma. Para isto, peça
 * a quantidade de turmas e a quantidade de alunos para cada turma. As turmas não
 * podem ter mais de 40 alunos.
 */
package Facul.Lista4;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int turma, alunos, cont, totAlunos = 0;

        System.out.print("Digite a quantidade de turmas: ");
        turma = in.nextInt();

        for(cont = 1; cont <= turma; cont++) {
            System.out.print("Digite a quantidade de alunos da "+cont+"° turma: ");
            alunos = in.nextInt();
            totAlunos = totAlunos + alunos;
        }
        System.out.println();
        System.out.println("Média de alunos por turma = "+(totAlunos/turma));
    }
}
