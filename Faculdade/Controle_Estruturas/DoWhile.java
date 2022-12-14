package Controle_Estruturas;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String texto = "";

        do { // É como se fosse o Repita
             // ate(texto = "Por favor")
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.print("Você quer sair? ");
            texto = in.nextLine();
        } while(!texto.equalsIgnoreCase("Por favor"));   // Enquanto for diferente (!) de "Por favor" o laço continua.

        System.out.println("Obrigado!");
        in.close();
    }
}
// if(...) sentença; ou {}
// while(...) sentença; ou {}
// for(...; ...; ...) sentença; ou {}
// do {} while(...); ou {} while(...);