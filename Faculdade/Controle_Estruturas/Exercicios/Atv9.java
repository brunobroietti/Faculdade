/**
 * 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
 */
package Controle_Estruturas.Exercicios;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, num;
        int mNum = 0;

        for(n1 = 1; n1 <= 10; n1++) {
            System.out.println("Digite um número: ");
            num = in.nextInt();

            if(num > mNum) {
                mNum = num;
            }
        }
        System.out.println("O maior número digitado foi "+mNum);
    }
}
