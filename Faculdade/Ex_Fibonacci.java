package Facul;

import java.util.Scanner;

public class Ex_Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v1, v2, v3, cont;

        System.out.println("Escreva um limite: ");
        int limite = in.nextInt();
        v1 = 1;
        v2 = 1;
        cont = 0;


        System.out.println("0");
        System.out.println("1");
        System.out.println("1");
        while (cont < limite){
            v3 = v1 + v2;
            v1 = v2;
            v2 = v3;
            System.out.println(v3);
            cont = cont + 1;
        }
    }
}
