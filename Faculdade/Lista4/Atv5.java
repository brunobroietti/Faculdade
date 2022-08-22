/**
 *  5. Faça um programa que mostre a tabuada de um número N (N será lido do teclado).
 */
package Facul.Lista4;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tabuada, result, x = 1;

        System.out.print("Digite a tabuada: ");
        tabuada = in.nextInt();

        while(x <= 10) {
            result = x*tabuada;
            System.out.println(x+" x "+tabuada+" = "+result);
            x++;
        }
    }
}
