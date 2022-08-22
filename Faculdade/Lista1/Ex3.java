/*
A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade
de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia,
o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto
deve guardar numa conta de poupança (10% do total arrecadado). Você foi contratado
para fazer os cálculos para o dono. Com base nestes fatos, faça um algoritmo para ler as
quantidades de pães e de broas, e depois calcular os dados solicitados.
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de pães foram comprados: ");
        double totpaes = in.nextDouble();
        System.out.println("Digite o total de broas comprados: ");
        double totbroas = in.nextDouble();
double total = (0.12*totpaes) + (1.50*totbroas);
        System.out.println("O dono arrecadou "+total+" reais ao final do dia.");
double porcent = total*0.10;
        System.out.println("Se guardar 10% do total arrecadado ele irá guardar R$"+porcent);
    }
}
