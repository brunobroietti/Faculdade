/*
Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias
de vida ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex:
uma pessoa com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA,
VOCÊ JÁ VIVEU 6935 DIAS
 */
package Facul.Lista1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = in.next();
        System.out.println("Digite sua idade: ");
        int idade = in.nextInt();
        System.out.println("Digite em qual ano está: ");
        int ano = in.nextInt();
        int diasano = 365;
        int contavida = ano - idade;
        int result = diasano*idade;
        System.out.println(nome + ", nasceu em " + contavida + " e viveu " + result + " dias");}
}