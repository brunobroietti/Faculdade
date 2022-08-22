package Facul;

import java.util.Scanner;

public class Ex_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Até quantos você quer repetir? ");
        int i  = in.nextInt();
        int x = 1;
        while (x <= i){
            System.out.println(x);
            x = x + 1;
        }
    }
}
