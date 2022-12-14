package Controle_Estruturas;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.println("Digite um número: ");
        int n1 = s.nextInt();

        System.out.println("Digite um número real: ");
        float n2 = s.nextFloat();

        System.out.println("O número inteiro foi" +n1+ "já o número real foi" +n2);

        if (n1 > n2) {
            System.out.println("N1 é mairo que N2");
        }else {
            System.out.println("N2 é maior...");
        }
    }
}
