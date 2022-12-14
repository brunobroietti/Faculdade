/*
2. Criar um programa informa se o ano atual é um ano bissexto;
 */
package Controle_Estruturas.Exercicios;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Em que ano está? ");
        int n1 = in.nextInt();

        if((n1 % 4 == 0) && (n1 % 100 != 0) || (n1 % 400 == 0)) {
            System.out.println(n1+" é bissexto.");
        } else {
            System.out.println(n1+" não é bisssexto.");
        }
    }
}
