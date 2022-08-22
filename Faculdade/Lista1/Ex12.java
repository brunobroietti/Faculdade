/*
Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após
o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento
e o salário final.
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        double salario = in.nextFloat();
        double aumento = salario+(salario*0.15);
        double imposto = aumento-(aumento*0.08);

        System.out.println("Salário inicial: "+salario);
        System.out.println("Salário com aumento de 15%: "+aumento);
        System.out.println("Salario com imposto de 8%: "+imposto);
    }
}

