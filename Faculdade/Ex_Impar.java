package Facul;

import java.util.Scanner;

public class Ex_Impar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = in.nextInt();

        if (n1 % 2 == 0) {
            System.out.println("O número "+n1+" é par");
        } else{
            System.out.println("O número "+n1+" é ímpar");
        }
    }
}
