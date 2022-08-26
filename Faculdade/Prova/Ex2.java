package Facul.Prova;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double salario = 1000, aumento = 0.015;

        for (int i = 1996; i <= 2022; i++){
            salario = salario * (1 + aumento);
            aumento = aumento * 2;
            System.out.println("O salário no ano "+i+" é "+salario);
        }
        System.out.println();
        System.out.println("O salario atual é: "+salario);
    }
}