/*
   Faça um programa que leia uma matriz de 5 linhas e 4 colunas contendo as seguintes
informações sobre alunos de uma disciplina, sendo todas as informações do tipo inteiro:
• Primeira coluna: número de matrícula (use um inteiro):
• Segunda coluna: média das provas:
• Terceira coluna: média dos trabalhos:
• Quarta coluna: nota final elabore um programa que:
(a) Leia as três primeiras informações de cada aluno;
(b) Calcule a nota final como sendo a soma da média das provas e da média dos trabalhos;
(c) Imprima a matrícula do aluno que obteve a maior nota final (assume que só existe uma maior
nota);
(d) Imprima a média aritmética das notas finais.
 */
package Facul.Lista9;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int matriz[][] = new int[5][4];
        int i, j, notaFinal;     //i = linha, j = coluna.

        for(i = 0; i < 5; i++) {
            for(j = 0; j < 4; j++) {
                if(j == 0) {
                    System.out.print("Digite a matrícula do aluno: ");
                    matriz[i][j] = in.nextInt();
                } else if(j == 1) {
                    System.out.print("Digite a média das provas desse aluno: ");
                    matriz[i][j] = in.nextInt();
                } else if(j == 2) {
                    System.out.print("Digite a média dos trabalhos: ");
                    matriz[i][j] = in.nextInt();
                } else {
                    notaFinal = 0;
                    notaFinal += matriz[i][1] + matriz[i][2];
                    System.out.println("Nota final do aluno: "+notaFinal+"\n");
                }
            }
        }
        maiorNotaFinal(matriz);
        mediaNotaFinal(matriz);
        mat(matriz);
    }

    public static void maiorNotaFinal (int matriz[][]) {
        int i, maiorNota = 0, matricula = 0;
        for(i = 0; i < 5; i++) {
            if(matriz[i][3] > maiorNota) {
                maiorNota = matriz[i][3];
                matricula = i;
            }
        }
        System.out.println("A maior nota foi "+maiorNota+" da matricula "+matricula);
    }

    public static void mat (int matriz[][]) {
        int i, j;
        for(i = 0; i < 5; i++) {
            for(j = 0; j < 4; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }
    }

    public static void mediaNotaFinal (int matriz[][]) {
        int media = 0;
        int i;
        for(i = 0; i < 5; i++) {
            matriz[i][3] += matriz[i][1] + matriz[i][2];
            media = media + matriz[i][3];
        }
        media = media / 5;
        System.out.println("Média da turma: "+media);
    }
}