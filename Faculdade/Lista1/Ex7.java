/*
Entrar com o dia e o mês de uma data e informar quantos dias se passaram desde o
início do ano. Esqueça a questão dos anos bissextos e considere sempre que um mês
possui 30 dias.
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mes;
        int dia;

        System.out.println("Digite o MÊS em que você está: ");
        mes = in.nextInt();
        System.out.println("Digite o DIA em que você está: ");
        dia = in.nextInt();
        int resultdias = 30*(mes - 1)+dia;
        System.out.println("Passaram "+resultdias+" dias");
    }
}
