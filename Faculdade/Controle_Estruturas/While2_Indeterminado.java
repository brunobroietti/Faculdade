package Controle_Estruturas;

import java.util.Scanner;

public class While2_Indeterminado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String valor = "";

        while(!valor.equalsIgnoreCase("Sair")) {  // É indeterminado porque não saberemos quantas vezes um determinado
            System.out.print("Digite: ");                    // bloco de instruções precisa ser repetido.
            valor = in.nextLine();                           // Com ele, a execução das instruções vai continuar até que uma condição
        }                                                    // seja verdadeira. A condição a ser analisada para a execução do laço de
    }                                                        // repetição deverá retornar um valor booleano, ou seja, até eu não digitar "Sair"
}                                                            // o laço não vai para de repetir o "Digite: ". Então o "Sair" precisa ser uma condição
                                                             // verdadeira/booleano para que o laço pare o loop.