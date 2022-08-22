/*
Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo
para ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele
conseguiu colocar no tanque.
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o preço da gasolina: ");
        double gasolina = in.nextDouble();
        System.out.println("Informe quantos litros de gasolina precisa para encher o tanque: ");
        int litros = in.nextInt();
        double result = litros*gasolina;
        System.out.println("Ele colocou "+litros+" litros de gasolina e pagou R$"+result);
    }
}
