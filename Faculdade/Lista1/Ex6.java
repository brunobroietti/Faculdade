/*
O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um
algoritmo que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor
a pagar. Assume que a balança já desconte o peso do prato.
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 12;
        int pesoprato;

        System.out.println("Digite o preso do prato (em quilos): ");
        pesoprato = in.nextInt();
        result = result * pesoprato;
        System.out.println("Ira pagar R$"+result);
    }
}
