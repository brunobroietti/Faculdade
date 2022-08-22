/*
Construa um algoritmo para calcular a distância entre dois pontos do plano
cartesiano. Cada ponto é um par ordenado (x,y).
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite as respectivas cordenadas do ponto A: ");
        double a1 = in.nextDouble();
        double a2 = in.nextDouble();

        System.out.println("Digite as respectivas cordenadas do ponto B: ");
        double b1 = in.nextDouble();
        double b2 = in.nextDouble();

        double distanciaAB = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        System.out.println("A distância entre o ponto A e o ponto B é igual a: "+distanciaAB);
    }
}
